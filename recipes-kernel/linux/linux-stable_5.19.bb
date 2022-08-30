require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.19.y"

SRCREV_machine ?= "1916ff079c77dc38275493cc18e22fe18532fb0f"
SRCREV_meta ?= "773b575c4e5cb486a66206af0b0feacb134a3b5d"

# FIXME: so far no kmeta-5.19
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19.5"

require linux-stable.inc
