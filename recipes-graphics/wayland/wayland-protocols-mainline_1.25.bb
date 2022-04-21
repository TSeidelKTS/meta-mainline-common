SUMMARY = "Collection of additional Wayland protocols"
DESCRIPTION = "Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c7b12b6702da38ca028ace54aae3d484 \
                    file://stable/presentation-time/presentation-time.xml;endline=26;md5=4646cd7d9edc9fa55db941f2d3a7dc53"

SRC_URI = "https://wayland.freedesktop.org/releases/wayland-protocols-${PV}.tar.xz \
           "
SRC_URI[sha256sum] = "f1ff0f7199d0a0da337217dd8c99979967808dc37731a1e759e822b75b571460"

S = "${WORKDIR}/wayland-protocols-${PV}"

UPSTREAM_CHECK_URI = "https://wayland.freedesktop.org/releases.html"

inherit meson pkgconfig allarch

EXTRA_OEMESON += "-Dtests=false"

PACKAGES = "wayland-protocols-mainline"
FILES:${PN} += "${datadir}/pkgconfig/wayland-protocols.pc"
FILES:${PN} += "${datadir}/wayland-protocols ${libdir}/wayland-protocols/*"

BBCLASSEXTEND = "native nativesdk"

PROVIDES += "wayland-protocols"
RPROVIDES:${PN} += "wayland-protocols"

SRC_URI:append = " file://0001-Revert-build-declare-dependency-for-use-as-a-subproj.patch"

DEFAULT_PREFERENCE ?= "-1"
