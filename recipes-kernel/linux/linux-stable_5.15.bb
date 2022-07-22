require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.15.y"

SRCREV_machine ?= "760adb59f6211e157dd587927ac26c42abc81550"
SRCREV_meta ?= "624cd634ceb095c2949b1cf8b69b0c96b098cb44"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.15.56"

require linux-stable.inc
