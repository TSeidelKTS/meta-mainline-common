require u-boot-common.inc

# tools/binman/binman needs python3-setuptools now
DEPENDS:append = " python3-setuptools-native gnutls"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "e092e3250270a1016c877da7bdd9384f14b1321e"
