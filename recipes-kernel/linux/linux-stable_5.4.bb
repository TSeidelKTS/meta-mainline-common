require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.4.y"

SRCREV_machine ?= "9d6e67bf50908cc661972969e8f073ec1d1bc97d"
SRCREV_meta ?= "9b55ffe3d137121be67c99a60bfdb3c6af47fae2"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.4;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
LINUX_VERSION ?= "5.4.198"

require linux-stable.inc
