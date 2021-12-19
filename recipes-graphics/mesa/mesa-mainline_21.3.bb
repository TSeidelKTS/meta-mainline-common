require mesa-mainline.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI = " \
	git://gitlab.freedesktop.org/mesa/mesa.git;branch=21.3;protocol=https \
"

S = "${WORKDIR}/git"
SRCREV = "a06cd045d16908acf6644a69e08a1f671f9fa653"

PV = "21.3.2"

#because we cannot rely on the fact that all apps will use pkgconfig,
#make eglplatform.h independent of MESA_EGL_NO_X11_HEADER
do_install:append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'egl', 'true', 'false', d)}; then
        sed -i -e 's/^#elif defined(__unix__) && defined(EGL_NO_X11)$/#elif defined(__unix__) \&\& (defined(EGL_NO_X11) || ${@bb.utils.contains('PACKAGECONFIG', 'x11', '0', '1', d)})/' ${D}${includedir}/EGL/eglplatform.h
    fi
}
