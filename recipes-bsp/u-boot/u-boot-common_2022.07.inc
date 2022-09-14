require u-boot-common.inc

# tools/binman/binman needs python3-setuptools now
DEPENDS:append = " python3-setuptools-native gnutls"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "e343fb3ff7fb21c549415f94a977192b9d3f3853"