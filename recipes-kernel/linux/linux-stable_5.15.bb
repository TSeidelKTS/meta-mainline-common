require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.15.y"

SRCREV_machine ?= "d676d6149a2f4b4d66b8ea0a1dfef30a54cf5750"
SRCREV_meta ?= "f45197776b360447cb4df7bc1e74dce6f8ad52b1"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.15.59"

require linux-stable.inc
