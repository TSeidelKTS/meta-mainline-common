require u-boot-common.inc

# tools/binman/binman needs python3-setuptools now
DEPENDS:append = " python3-setuptools-native gnutls"