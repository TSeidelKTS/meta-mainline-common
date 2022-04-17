require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.10.y"

SRCREV_machine ?= "6c8e5cb264df8e9fbfe1309550c10bccddc922f0"
SRCREV_meta ?= "bddb0e4921f541bafa595986f16cff5390d01f40"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.10;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.10.111"

require linux-stable.inc
