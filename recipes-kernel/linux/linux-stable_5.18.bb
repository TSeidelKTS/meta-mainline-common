require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.18.y"

SRCREV_machine ?= "9aa5a042881d4a99657f82c774e9e15353ebeb2d"
SRCREV_meta ?= "624cd634ceb095c2949b1cf8b69b0c96b098cb44"

# FIXME: so far no kmeta-5.18
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.18.14"

require linux-stable.inc
