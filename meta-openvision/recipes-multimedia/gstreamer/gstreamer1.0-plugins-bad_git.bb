require gstreamer1.0-plugins-bad.inc
include gstreamer1.0-common.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = " git://gitlab.freedesktop.org/gstreamer/gst-plugins-bad.git;protocol=https;branch=master \
			file://001-rtmp-hls-tsdemux-fix.patch \
			file://002-fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
			file://003-rtmp-fix-seeking-and-potential-segfault.patch \
			file://004-dvbapi5-fix-old-kernel.patch \
"

CFLAGS_append_sh4 = " -std=gnu99"
