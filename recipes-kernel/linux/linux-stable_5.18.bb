require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.18.y"

SRCREV_machine ?= "71563d69a8ec34d41857aca6040e90d54f566ee4"
SRCREV_meta ?= "989e8f3250269d7b51e11e3cc4424425ce6479b8"

# FIXME: so far no kmeta-5.18
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.18.5"

require linux-stable.inc
