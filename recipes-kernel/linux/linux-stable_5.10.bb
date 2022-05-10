require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.10.y"

SRCREV_machine ?= "f40e35e79c115a5fd4b11aad1cf439d6e870aaf3"
SRCREV_meta ?= "b368b4c1c8ee0e0e7573caa7f1596c3385ad855f"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.10;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.10.114"

require linux-stable.inc
