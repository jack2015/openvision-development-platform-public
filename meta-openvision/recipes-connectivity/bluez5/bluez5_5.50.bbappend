FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += "\
    file://tools-Add-support-for-rtk_h5-type.patch \
    ${@bb.utils.contains("MACHINE_FEATURES", "oldkernel", "file://old_kernel.patch", "", d)} \
"

EXTRA_OECONF += " --disable-udev"

DEPENDS := "${@oe.utils.str_filter_out('udev', '${DEPENDS}', d)}"
