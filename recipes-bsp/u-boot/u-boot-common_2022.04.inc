require u-boot-common.inc

# tools/binman/binman needs python3-setuptools now
DEPENDS:append = " python3-setuptools-native gnutls"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "e4b6ebd3de982ae7185dbf689a030e73fd06e0d2"
