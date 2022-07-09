require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.18.y"

SRCREV_machine ?= "bc560cecaa8b2517932808fa939e36371ffa036e"
SRCREV_meta ?= "a8383adbe77f8600510c640b3b5fd49bd930e6a0"

# FIXME: so far no kmeta-5.18
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.18.10"

require linux-stable.inc
