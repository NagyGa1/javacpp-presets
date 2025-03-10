// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class avutil extends org.bytedeco.javacpp.presets.avutil {
    static { Loader.load(); }

// Parsed from <libavutil/avutil.h>

/*
 * copyright (c) 2006 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_AVUTIL_H
// #define AVUTIL_AVUTIL_H

/**
 * \file
 * external API header
 */

/**
 * \mainpage
 *
 * \section ffmpeg_intro Introduction
 *
 * This document describes the usage of the different libraries
 * provided by FFmpeg.
 *
 * \li \ref libavc "libavcodec" encoding/decoding library
 * \li \ref lavfi "libavfilter" graph-based frame editing library
 * \li \ref libavf "libavformat" I/O and muxing/demuxing library
 * \li \ref lavd "libavdevice" special devices muxing/demuxing library
 * \li \ref lavu "libavutil" common utility library
 * \li \ref lswr "libswresample" audio resampling, format conversion and mixing
 * \li \ref lpp  "libpostproc" post processing library
 * \li \ref libsws "libswscale" color conversion and scaling library
 *
 * \section ffmpeg_versioning Versioning and compatibility
 *
 * Each of the FFmpeg libraries contains a version.h header, which defines a
 * major, minor and micro version number with the
 * <em>LIBRARYNAME_VERSION_{MAJOR,MINOR,MICRO}</em> macros. The major version
 * number is incremented with backward incompatible changes - e.g. removing
 * parts of the public API, reordering public struct members, etc. The minor
 * version number is incremented for backward compatible API changes or major
 * new features - e.g. adding a new public function or a new decoder. The micro
 * version number is incremented for smaller changes that a calling program
 * might still want to check for - e.g. changing behavior in a previously
 * unspecified situation.
 *
 * FFmpeg guarantees backward API and ABI compatibility for each library as long
 * as its major version number is unchanged. This means that no public symbols
 * will be removed or renamed. Types and names of the public struct members and
 * values of public macros and enums will remain the same (unless they were
 * explicitly declared as not part of the public API). Documented behavior will
 * not change.
 *
 * In other words, any correct program that works with a given FFmpeg snapshot
 * should work just as well without any changes with any later snapshot with the
 * same major versions. This applies to both rebuilding the program against new
 * FFmpeg versions or to replacing the dynamic FFmpeg libraries that a program
 * links against.
 *
 * However, new public symbols may be added and new members may be appended to
 * public structs whose size is not part of public ABI (most public structs in
 * FFmpeg). New macros and enum values may be added. Behavior in undocumented
 * situations may change slightly (and be documented). All those are accompanied
 * by an entry in doc/APIchanges and incrementing either the minor or micro
 * version number.
 */

/**
 * \defgroup lavu Common utility functions
 *
 * \brief
 * libavutil contains the code shared across all the other FFmpeg
 * libraries
 *
 * \note In order to use the functions provided by avutil you must include
 * the specific header.
 *
 * \{
 *
 * \defgroup lavu_crypto Crypto and Hashing
 *
 * \{
 * \}
 *
 * \defgroup lavu_math Maths
 * \{
 *
 * \}
 *
 * \defgroup lavu_string String Manipulation
 *
 * \{
 *
 * \}
 *
 * \defgroup lavu_mem Memory Management
 *
 * \{
 *
 * \}
 *
 * \defgroup lavu_data Data Structures
 * \{
 *
 * \}
 *
 * \defgroup lavu_audio Audio related
 *
 * \{
 *
 * \}
 *
 * \defgroup lavu_error Error Codes
 *
 * \{
 *
 * \}
 *
 * \defgroup lavu_log Logging Facility
 *
 * \{
 *
 * \}
 *
 * \defgroup lavu_misc Other
 *
 * \{
 *
 * \defgroup preproc_misc Preprocessor String Macros
 *
 * \{
 *
 * \}
 *
 * \defgroup version_utils Library Version Macros
 *
 * \{
 *
 * \}
 */


/**
 * \addtogroup lavu_ver
 * \{
 */

/**
 * Return the LIBAVUTIL_VERSION_INT constant.
 */
public static native @Cast("unsigned") int avutil_version();

/**
 * Return an informative version string. This usually is the actual release
 * version number or a git commit description. This string has no fixed format
 * and can change any time. It should never be parsed by code.
 */
public static native @Cast("const char*") BytePointer av_version_info();

/**
 * Return the libavutil build-time configuration.
 */
public static native @Cast("const char*") BytePointer avutil_configuration();

/**
 * Return the libavutil license.
 */
public static native @Cast("const char*") BytePointer avutil_license();

/**
 * \}
 */

/**
 * \addtogroup lavu_media Media Type
 * \brief Media Type
 */

/** enum AVMediaType */
public static final int
    /** Usually treated as AVMEDIA_TYPE_DATA */
    AVMEDIA_TYPE_UNKNOWN = -1,
    AVMEDIA_TYPE_VIDEO = 0,
    AVMEDIA_TYPE_AUDIO = 1,
    /** Opaque data information usually continuous */
    AVMEDIA_TYPE_DATA = 2,
    AVMEDIA_TYPE_SUBTITLE = 3,
    /** Opaque data information usually sparse */
    AVMEDIA_TYPE_ATTACHMENT = 4,
    AVMEDIA_TYPE_NB = 5;

/**
 * Return a string describing the media_type enum, NULL if media_type
 * is unknown.
 */
public static native @Cast("const char*") BytePointer av_get_media_type_string(@Cast("AVMediaType") int media_type);

/**
 * \defgroup lavu_const Constants
 * \{
 *
 * \defgroup lavu_enc Encoding specific
 *
 * \note those definition should move to avcodec
 * \{
 */

public static final int FF_LAMBDA_SHIFT = 7;
public static final int FF_LAMBDA_SCALE = (1<<FF_LAMBDA_SHIFT);
/** factor to convert from H.263 QP to lambda */
public static final int FF_QP2LAMBDA = 118;
public static final int FF_LAMBDA_MAX = (256*128-1);

public static final int FF_QUALITY_SCALE = FF_LAMBDA_SCALE; //FIXME maybe remove

/**
 * \}
 * \defgroup lavu_time Timestamp specific
 *
 * FFmpeg internal timebase and timestamp definitions
 *
 * \{
 */

/**
 * \brief Undefined timestamp value
 *
 * Usually reported by demuxer that work on containers that do not provide
 * either pts or dts.
 */

public static native @MemberGetter long AV_NOPTS_VALUE();
public static final long AV_NOPTS_VALUE = AV_NOPTS_VALUE();

/**
 * Internal time base represented as integer
 */

public static final int AV_TIME_BASE =            1000000;

/**
 * Internal time base represented as fractional value
 */

// #define AV_TIME_BASE_Q          (AVRational){1, AV_TIME_BASE}

/**
 * \}
 * \}
 * \defgroup lavu_picture Image related
 *
 * AVPicture types, pixel formats and basic image planes manipulation.
 *
 * \{
 */

/** enum AVPictureType */
public static final int
    /** Undefined */
    AV_PICTURE_TYPE_NONE = 0,
    /** Intra */
    AV_PICTURE_TYPE_I = 1,
    /** Predicted */
    AV_PICTURE_TYPE_P = 2,
    /** Bi-dir predicted */
    AV_PICTURE_TYPE_B = 3,
    /** S(GMC)-VOP MPEG4 */
    AV_PICTURE_TYPE_S = 4,
    /** Switching Intra */
    AV_PICTURE_TYPE_SI = 5,
    /** Switching Predicted */
    AV_PICTURE_TYPE_SP = 6,
    /** BI type */
    AV_PICTURE_TYPE_BI = 7;

/**
 * Return a single letter to describe the given picture type
 * pict_type.
 *
 * @param [in] pict_type the picture type @return a single character
 * representing the picture type, '?' if pict_type is unknown
 */
public static native @Cast("char") byte av_get_picture_type_char(@Cast("AVPictureType") int pict_type);

/**
 * \}
 */

// #include "common.h"
// #include "error.h"
// #include "rational.h"
// #include "version.h"
// #include "macros.h"
// #include "mathematics.h"
// #include "log.h"
// #include "pixfmt.h"

/**
 * Return x default pointer in case p is NULL.
 */
public static native Pointer av_x_if_null(@Const Pointer p, @Const Pointer x);

/**
 * Compute the length of an integer list.
 *
 * @param elsize  size in bytes of each list element (only 1, 2, 4 or 8)
 * @param term    list terminator (usually 0 or -1)
 * @param list    pointer to the list
 * @return  length of the list, in elements, not counting the terminator
 */
public static native @Cast("unsigned") int av_int_list_length_for_size(@Cast("unsigned") int elsize,
                                     @Const Pointer list, @Cast("uint64_t") long term);

/**
 * Compute the length of an integer list.
 *
 * @param term  list terminator (usually 0 or -1)
 * @param list  pointer to the list
 * @return  length of the list, in elements, not counting the terminator
 */
// #define av_int_list_length(list, term)
//     av_int_list_length_for_size(sizeof(*(list)), list, term)

/**
 * Open a file using a UTF-8 filename.
 * The API of this function matches POSIX fopen(), errors are returned through
 * errno.
 */
public static native @Cast("FILE*") Pointer av_fopen_utf8(@Cast("const char*") BytePointer path, @Cast("const char*") BytePointer mode);
public static native @Cast("FILE*") Pointer av_fopen_utf8(String path, String mode);

/**
 * Return the fractional representation of the internal time base.
 */
public static native @ByVal AVRational av_get_time_base_q();

/**
 * \}
 * \}
 */

// #endif /* AVUTIL_AVUTIL_H */


// Parsed from <libavutil/error.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * error code definitions
 */

// #ifndef AVUTIL_ERROR_H
// #define AVUTIL_ERROR_H

// #include <errno.h>
// #include <stddef.h>

/**
 * \addtogroup lavu_error
 *
 * \{
 */


/* error handling */
// #if EDOM > 0
/** Returns a negative error code from a POSIX error code, to return from library functions. */
// #define AVERROR(e) (-(e))
/** Returns a POSIX error code from a library function error return value. */
// #define AVUNERROR(e) (-(e))
// #else
/* Some platforms have E* and errno already negated. */
// #define AVERROR(e) (e)
// #define AVUNERROR(e) (e)
// #endif

// #define FFERRTAG(a, b, c, d) (-(int)MKTAG(a, b, c, d))

/** Bitstream filter not found */
public static native @MemberGetter int AVERROR_BSF_NOT_FOUND();
public static final int AVERROR_BSF_NOT_FOUND = AVERROR_BSF_NOT_FOUND();
/** Internal bug, also see AVERROR_BUG2 */
public static native @MemberGetter int AVERROR_BUG();
public static final int AVERROR_BUG = AVERROR_BUG();
/** Buffer too small */
public static native @MemberGetter int AVERROR_BUFFER_TOO_SMALL();
public static final int AVERROR_BUFFER_TOO_SMALL = AVERROR_BUFFER_TOO_SMALL();
/** Decoder not found */
public static native @MemberGetter int AVERROR_DECODER_NOT_FOUND();
public static final int AVERROR_DECODER_NOT_FOUND = AVERROR_DECODER_NOT_FOUND();
/** Demuxer not found */
public static native @MemberGetter int AVERROR_DEMUXER_NOT_FOUND();
public static final int AVERROR_DEMUXER_NOT_FOUND = AVERROR_DEMUXER_NOT_FOUND();
/** Encoder not found */
public static native @MemberGetter int AVERROR_ENCODER_NOT_FOUND();
public static final int AVERROR_ENCODER_NOT_FOUND = AVERROR_ENCODER_NOT_FOUND();
/** End of file */
public static native @MemberGetter int AVERROR_EOF();
public static final int AVERROR_EOF = AVERROR_EOF();
/** Immediate exit was requested; the called function should not be restarted */
public static native @MemberGetter int AVERROR_EXIT();
public static final int AVERROR_EXIT = AVERROR_EXIT();
/** Generic error in an external library */
public static native @MemberGetter int AVERROR_EXTERNAL();
public static final int AVERROR_EXTERNAL = AVERROR_EXTERNAL();
/** Filter not found */
public static native @MemberGetter int AVERROR_FILTER_NOT_FOUND();
public static final int AVERROR_FILTER_NOT_FOUND = AVERROR_FILTER_NOT_FOUND();
/** Invalid data found when processing input */
public static native @MemberGetter int AVERROR_INVALIDDATA();
public static final int AVERROR_INVALIDDATA = AVERROR_INVALIDDATA();
/** Muxer not found */
public static native @MemberGetter int AVERROR_MUXER_NOT_FOUND();
public static final int AVERROR_MUXER_NOT_FOUND = AVERROR_MUXER_NOT_FOUND();
/** Option not found */
public static native @MemberGetter int AVERROR_OPTION_NOT_FOUND();
public static final int AVERROR_OPTION_NOT_FOUND = AVERROR_OPTION_NOT_FOUND();
/** Not yet implemented in FFmpeg, patches welcome */
public static native @MemberGetter int AVERROR_PATCHWELCOME();
public static final int AVERROR_PATCHWELCOME = AVERROR_PATCHWELCOME();
/** Protocol not found */
public static native @MemberGetter int AVERROR_PROTOCOL_NOT_FOUND();
public static final int AVERROR_PROTOCOL_NOT_FOUND = AVERROR_PROTOCOL_NOT_FOUND();

/** Stream not found */
public static native @MemberGetter int AVERROR_STREAM_NOT_FOUND();
public static final int AVERROR_STREAM_NOT_FOUND = AVERROR_STREAM_NOT_FOUND();
/**
 * This is semantically identical to AVERROR_BUG
 * it has been introduced in Libav after our AVERROR_BUG and with a modified value.
 */
public static native @MemberGetter int AVERROR_BUG2();
public static final int AVERROR_BUG2 = AVERROR_BUG2();
/** Unknown error, typically from an external library */
public static native @MemberGetter int AVERROR_UNKNOWN();
public static final int AVERROR_UNKNOWN = AVERROR_UNKNOWN();
/** Requested feature is flagged experimental. Set strict_std_compliance if you really want to use it. */
public static final int AVERROR_EXPERIMENTAL =       (-0x2bb2afa8);
/** Input changed between calls. Reconfiguration is required. (can be OR-ed with AVERROR_OUTPUT_CHANGED) */
public static final int AVERROR_INPUT_CHANGED =      (-0x636e6701);
/** Output changed between calls. Reconfiguration is required. (can be OR-ed with AVERROR_INPUT_CHANGED) */
public static final int AVERROR_OUTPUT_CHANGED =     (-0x636e6702);
/* HTTP & RTSP errors */
public static native @MemberGetter int AVERROR_HTTP_BAD_REQUEST();
public static final int AVERROR_HTTP_BAD_REQUEST = AVERROR_HTTP_BAD_REQUEST();
public static native @MemberGetter int AVERROR_HTTP_UNAUTHORIZED();
public static final int AVERROR_HTTP_UNAUTHORIZED = AVERROR_HTTP_UNAUTHORIZED();
public static native @MemberGetter int AVERROR_HTTP_FORBIDDEN();
public static final int AVERROR_HTTP_FORBIDDEN = AVERROR_HTTP_FORBIDDEN();
public static native @MemberGetter int AVERROR_HTTP_NOT_FOUND();
public static final int AVERROR_HTTP_NOT_FOUND = AVERROR_HTTP_NOT_FOUND();
public static native @MemberGetter int AVERROR_HTTP_OTHER_4XX();
public static final int AVERROR_HTTP_OTHER_4XX = AVERROR_HTTP_OTHER_4XX();
public static native @MemberGetter int AVERROR_HTTP_SERVER_ERROR();
public static final int AVERROR_HTTP_SERVER_ERROR = AVERROR_HTTP_SERVER_ERROR();

public static final int AV_ERROR_MAX_STRING_SIZE = 64;

/**
 * Put a description of the AVERROR code errnum in errbuf.
 * In case of failure the global variable errno is set to indicate the
 * error. Even in case of failure av_strerror() will print a generic
 * error message indicating the errnum provided to errbuf.
 *
 * @param errnum      error code to describe
 * @param errbuf      buffer to which description is written
 * @param errbuf_size the size in bytes of errbuf
 * @return 0 on success, a negative value if a description for errnum
 * cannot be found
 */
public static native int av_strerror(int errnum, @Cast("char*") BytePointer errbuf, @Cast("size_t") long errbuf_size);
public static native int av_strerror(int errnum, @Cast("char*") ByteBuffer errbuf, @Cast("size_t") long errbuf_size);
public static native int av_strerror(int errnum, @Cast("char*") byte[] errbuf, @Cast("size_t") long errbuf_size);

/**
 * Fill the provided buffer with a string containing an error string
 * corresponding to the AVERROR code errnum.
 *
 * @param errbuf         a buffer
 * @param errbuf_size    size in bytes of errbuf
 * @param errnum         error code to describe
 * @return the buffer in input, filled with the error description
 * @see av_strerror()
 */
public static native @Cast("char*") BytePointer av_make_error_string(@Cast("char*") BytePointer errbuf, @Cast("size_t") long errbuf_size, int errnum);
public static native @Cast("char*") ByteBuffer av_make_error_string(@Cast("char*") ByteBuffer errbuf, @Cast("size_t") long errbuf_size, int errnum);
public static native @Cast("char*") byte[] av_make_error_string(@Cast("char*") byte[] errbuf, @Cast("size_t") long errbuf_size, int errnum);

/**
 * Convenience macro, the return value should be used only directly in
 * function arguments but never stand-alone.
 */
// #define av_err2str(errnum)
//     av_make_error_string((char[AV_ERROR_MAX_STRING_SIZE]){0}, AV_ERROR_MAX_STRING_SIZE, errnum)

/**
 * \}
 */

// #endif /* AVUTIL_ERROR_H */


// Parsed from <libavutil/mem.h>

/*
 * copyright (c) 2006 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * memory handling functions
 */

// #ifndef AVUTIL_MEM_H
// #define AVUTIL_MEM_H

// #include <limits.h>
// #include <stdint.h>

// #include "attributes.h"
// #include "error.h"
// #include "avutil.h"

/**
 * \addtogroup lavu_mem
 * \{
 */


// #if defined(__INTEL_COMPILER) && __INTEL_COMPILER < 1110 || defined(__SUNPRO_C)
//     #define DECLARE_ALIGNED(n,t,v)      t __attribute__ ((aligned (n))) v
//     #define DECLARE_ASM_CONST(n,t,v)    const t __attribute__ ((aligned (n))) v
// #elif defined(__TI_COMPILER_VERSION__)
//     #define DECLARE_ALIGNED(n,t,v)
//         AV_PRAGMA(DATA_ALIGN(v,n))
//         t __attribute__((aligned(n))) v
//     #define DECLARE_ASM_CONST(n,t,v)
//         AV_PRAGMA(DATA_ALIGN(v,n))
//         static const t __attribute__((aligned(n))) v
// #elif defined(__GNUC__)
//     #define DECLARE_ALIGNED(n,t,v)      t __attribute__ ((aligned (n))) v
//     #define DECLARE_ASM_CONST(n,t,v)    static const t av_used __attribute__ ((aligned (n))) v
// #elif defined(_MSC_VER)
//     #define DECLARE_ALIGNED(n,t,v)      __declspec(align(n)) t v
//     #define DECLARE_ASM_CONST(n,t,v)    __declspec(align(n)) static const t v
// #else
//     #define DECLARE_ALIGNED(n,t,v)      t v
//     #define DECLARE_ASM_CONST(n,t,v)    static const t v
// #endif

// #if AV_GCC_VERSION_AT_LEAST(3,1)
//     #define av_malloc_attrib __attribute__((__malloc__))
// #else
//     #define av_malloc_attrib
// #endif

// #if AV_GCC_VERSION_AT_LEAST(4,3)
//     #define av_alloc_size(...) __attribute__((alloc_size(__VA_ARGS__)))
// #else
//     #define av_alloc_size(...)
// #endif

/**
 * Allocate a block of size bytes with alignment suitable for all
 * memory accesses (including vectors if available on the CPU).
 * @param size Size in bytes for the memory block to be allocated.
 * @return Pointer to the allocated block, NULL if the block cannot
 * be allocated.
 * @see av_mallocz()
 */
public static native Pointer av_malloc(@Cast("size_t") long size);

/**
 * Allocate a block of size * nmemb bytes with av_malloc().
 * @param nmemb Number of elements
 * @param size Size of the single element
 * @return Pointer to the allocated block, NULL if the block cannot
 * be allocated.
 * @see av_malloc()
 */
public static native Pointer av_malloc_array(@Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Allocate or reallocate a block of memory.
 * If ptr is NULL and size > 0, allocate a new block. If
 * size is zero, free the memory block pointed to by ptr.
 * @param ptr Pointer to a memory block already allocated with
 * av_realloc() or NULL.
 * @param size Size in bytes of the memory block to be allocated or
 * reallocated.
 * @return Pointer to a newly-reallocated block or NULL if the block
 * cannot be reallocated or the function is used to free the memory block.
 * \warning Pointers originating from the av_malloc() family of functions must
 *          not be passed to av_realloc(). The former can be implemented using
 *          memalign() (or other functions), and there is no guarantee that
 *          pointers from such functions can be passed to realloc() at all.
 *          The situation is undefined according to POSIX and may crash with
 *          some libc implementations.
 * @see av_fast_realloc()
 */
public static native Pointer av_realloc(Pointer ptr, @Cast("size_t") long size);

/**
 * Allocate or reallocate a block of memory.
 * This function does the same thing as av_realloc, except:
 * - It takes two arguments and checks the result of the multiplication for
 *   integer overflow.
 * - It frees the input block in case of failure, thus avoiding the memory
 *   leak with the classic "buf = realloc(buf); if (!buf) return -1;".
 */
public static native Pointer av_realloc_f(Pointer ptr, @Cast("size_t") long nelem, @Cast("size_t") long elsize);

/**
 * Allocate or reallocate a block of memory.
 * If *ptr is NULL and size > 0, allocate a new block. If
 * size is zero, free the memory block pointed to by ptr.
 * @param   ptr Pointer to a pointer to a memory block already allocated
 *          with av_realloc(), or pointer to a pointer to NULL.
 *          The pointer is updated on success, or freed on failure.
 * @param   size Size in bytes for the memory block to be allocated or
 *          reallocated
 * @return  Zero on success, an AVERROR error code on failure.
 * \warning Pointers originating from the av_malloc() family of functions must
 *          not be passed to av_reallocp(). The former can be implemented using
 *          memalign() (or other functions), and there is no guarantee that
 *          pointers from such functions can be passed to realloc() at all.
 *          The situation is undefined according to POSIX and may crash with
 *          some libc implementations.
 */
public static native int av_reallocp(Pointer ptr, @Cast("size_t") long size);

/**
 * Allocate or reallocate an array.
 * If ptr is NULL and nmemb > 0, allocate a new block. If
 * nmemb is zero, free the memory block pointed to by ptr.
 * @param ptr Pointer to a memory block already allocated with
 * av_realloc() or NULL.
 * @param nmemb Number of elements
 * @param size Size of the single element
 * @return Pointer to a newly-reallocated block or NULL if the block
 * cannot be reallocated or the function is used to free the memory block.
 * \warning Pointers originating from the av_malloc() family of functions must
 *          not be passed to av_realloc(). The former can be implemented using
 *          memalign() (or other functions), and there is no guarantee that
 *          pointers from such functions can be passed to realloc() at all.
 *          The situation is undefined according to POSIX and may crash with
 *          some libc implementations.
 */
public static native Pointer av_realloc_array(Pointer ptr, @Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Allocate or reallocate an array through a pointer to a pointer.
 * If *ptr is NULL and nmemb > 0, allocate a new block. If
 * nmemb is zero, free the memory block pointed to by ptr.
 * @param ptr Pointer to a pointer to a memory block already allocated
 * with av_realloc(), or pointer to a pointer to NULL.
 * The pointer is updated on success, or freed on failure.
 * @param nmemb Number of elements
 * @param size Size of the single element
 * @return Zero on success, an AVERROR error code on failure.
 * \warning Pointers originating from the av_malloc() family of functions must
 *          not be passed to av_realloc(). The former can be implemented using
 *          memalign() (or other functions), and there is no guarantee that
 *          pointers from such functions can be passed to realloc() at all.
 *          The situation is undefined according to POSIX and may crash with
 *          some libc implementations.
 */
public static native int av_reallocp_array(Pointer ptr, @Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Free a memory block which has been allocated with av_malloc(z)() or
 * av_realloc().
 * @param ptr Pointer to the memory block which should be freed.
 * \note ptr = NULL is explicitly allowed.
 * \note It is recommended that you use av_freep() instead.
 * @see av_freep()
 */
public static native void av_free(Pointer ptr);

/**
 * Allocate a block of size bytes with alignment suitable for all
 * memory accesses (including vectors if available on the CPU) and
 * zero all the bytes of the block.
 * @param size Size in bytes for the memory block to be allocated.
 * @return Pointer to the allocated block, NULL if it cannot be allocated.
 * @see av_malloc()
 */
public static native Pointer av_mallocz(@Cast("size_t") long size);

/**
 * Allocate a block of nmemb * size bytes with alignment suitable for all
 * memory accesses (including vectors if available on the CPU) and
 * zero all the bytes of the block.
 * The allocation will fail if nmemb * size is greater than or equal
 * to INT_MAX.
 * @param nmemb
 * @param size
 * @return Pointer to the allocated block, NULL if it cannot be allocated.
 */
public static native Pointer av_calloc(@Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Allocate a block of size * nmemb bytes with av_mallocz().
 * @param nmemb Number of elements
 * @param size Size of the single element
 * @return Pointer to the allocated block, NULL if the block cannot
 * be allocated.
 * @see av_mallocz()
 * @see av_malloc_array()
 */
public static native Pointer av_mallocz_array(@Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Duplicate the string s.
 * @param s string to be duplicated
 * @return Pointer to a newly-allocated string containing a
 * copy of s or NULL if the string cannot be allocated.
 */
public static native @Cast("char*") BytePointer av_strdup(@Cast("const char*") BytePointer s);
public static native @Cast("char*") ByteBuffer av_strdup(String s);

/**
 * Duplicate a substring of the string s.
 * @param s string to be duplicated
 * @param len the maximum length of the resulting string (not counting the
 *            terminating byte).
 * @return Pointer to a newly-allocated string containing a
 * copy of s or NULL if the string cannot be allocated.
 */
public static native @Cast("char*") BytePointer av_strndup(@Cast("const char*") BytePointer s, @Cast("size_t") long len);
public static native @Cast("char*") ByteBuffer av_strndup(String s, @Cast("size_t") long len);

/**
 * Duplicate the buffer p.
 * @param p buffer to be duplicated
 * @return Pointer to a newly allocated buffer containing a
 * copy of p or NULL if the buffer cannot be allocated.
 */
public static native Pointer av_memdup(@Const Pointer p, @Cast("size_t") long size);

/**
 * Free a memory block which has been allocated with av_malloc(z)() or
 * av_realloc() and set the pointer pointing to it to NULL.
 * @param ptr Pointer to the pointer to the memory block which should
 * be freed.
 * \note passing a pointer to a NULL pointer is safe and leads to no action.
 * @see av_free()
 */
public static native void av_freep(Pointer ptr);

/**
 * Add an element to a dynamic array.
 *
 * The array to grow is supposed to be an array of pointers to
 * structures, and the element to add must be a pointer to an already
 * allocated structure.
 *
 * The array is reallocated when its size reaches powers of 2.
 * Therefore, the amortized cost of adding an element is constant.
 *
 * In case of success, the pointer to the array is updated in order to
 * point to the new grown array, and the number pointed to by nb_ptr
 * is incremented.
 * In case of failure, the array is freed, *tab_ptr is set to NULL and
 * *nb_ptr is set to 0.
 *
 * @param tab_ptr pointer to the array to grow
 * @param nb_ptr  pointer to the number of elements in the array
 * @param elem    element to add
 * @see av_dynarray_add_nofree(), av_dynarray2_add()
 */
public static native void av_dynarray_add(Pointer tab_ptr, IntPointer nb_ptr, Pointer elem);
public static native void av_dynarray_add(Pointer tab_ptr, IntBuffer nb_ptr, Pointer elem);
public static native void av_dynarray_add(Pointer tab_ptr, int[] nb_ptr, Pointer elem);

/**
 * Add an element to a dynamic array.
 *
 * Function has the same functionality as av_dynarray_add(),
 * but it doesn't free memory on fails. It returns error code
 * instead and leave current buffer untouched.
 *
 * @param tab_ptr pointer to the array to grow
 * @param nb_ptr  pointer to the number of elements in the array
 * @param elem    element to add
 * @return >=0 on success, negative otherwise.
 * @see av_dynarray_add(), av_dynarray2_add()
 */
public static native int av_dynarray_add_nofree(Pointer tab_ptr, IntPointer nb_ptr, Pointer elem);
public static native int av_dynarray_add_nofree(Pointer tab_ptr, IntBuffer nb_ptr, Pointer elem);
public static native int av_dynarray_add_nofree(Pointer tab_ptr, int[] nb_ptr, Pointer elem);

/**
 * Add an element of size elem_size to a dynamic array.
 *
 * The array is reallocated when its number of elements reaches powers of 2.
 * Therefore, the amortized cost of adding an element is constant.
 *
 * In case of success, the pointer to the array is updated in order to
 * point to the new grown array, and the number pointed to by nb_ptr
 * is incremented.
 * In case of failure, the array is freed, *tab_ptr is set to NULL and
 * *nb_ptr is set to 0.
 *
 * @param tab_ptr   pointer to the array to grow
 * @param nb_ptr    pointer to the number of elements in the array
 * @param elem_size size in bytes of the elements in the array
 * @param elem_data pointer to the data of the element to add. If NULL, the space of
 *                  the new added element is not filled.
 * @return          pointer to the data of the element to copy in the new allocated space.
 *                  If NULL, the new allocated space is left uninitialized."
 * @see av_dynarray_add(), av_dynarray_add_nofree()
 */
public static native Pointer av_dynarray2_add(@Cast("void**") PointerPointer tab_ptr, IntPointer nb_ptr, @Cast("size_t") long elem_size,
                       @Cast("const uint8_t*") BytePointer elem_data);
public static native Pointer av_dynarray2_add(@Cast("void**") @ByPtrPtr Pointer tab_ptr, IntPointer nb_ptr, @Cast("size_t") long elem_size,
                       @Cast("const uint8_t*") BytePointer elem_data);
public static native Pointer av_dynarray2_add(@Cast("void**") @ByPtrPtr Pointer tab_ptr, IntBuffer nb_ptr, @Cast("size_t") long elem_size,
                       @Cast("const uint8_t*") ByteBuffer elem_data);
public static native Pointer av_dynarray2_add(@Cast("void**") @ByPtrPtr Pointer tab_ptr, int[] nb_ptr, @Cast("size_t") long elem_size,
                       @Cast("const uint8_t*") byte[] elem_data);

/**
 * Multiply two size_t values checking for overflow.
 * @return  0 if success, AVERROR(EINVAL) if overflow.
 */
public static native int av_size_mult(@Cast("size_t") long a, @Cast("size_t") long b, @Cast("size_t*") SizeTPointer r);

/**
 * Set the maximum size that may me allocated in one block.
 */
public static native void av_max_alloc(@Cast("size_t") long max);

/**
 * deliberately overlapping memcpy implementation
 * @param dst destination buffer
 * @param back how many bytes back we start (the initial size of the overlapping window), must be > 0
 * @param cnt number of bytes to copy, must be >= 0
 *
 * cnt > back is valid, this will copy the bytes we just copied,
 * thus creating a repeating pattern with a period length of back.
 */
public static native void av_memcpy_backptr(@Cast("uint8_t*") BytePointer dst, int back, int cnt);
public static native void av_memcpy_backptr(@Cast("uint8_t*") ByteBuffer dst, int back, int cnt);
public static native void av_memcpy_backptr(@Cast("uint8_t*") byte[] dst, int back, int cnt);

/**
 * Reallocate the given block if it is not large enough, otherwise do nothing.
 *
 * @see av_realloc
 */
public static native Pointer av_fast_realloc(Pointer ptr, @Cast("unsigned int*") IntPointer size, @Cast("size_t") long min_size);
public static native Pointer av_fast_realloc(Pointer ptr, @Cast("unsigned int*") IntBuffer size, @Cast("size_t") long min_size);
public static native Pointer av_fast_realloc(Pointer ptr, @Cast("unsigned int*") int[] size, @Cast("size_t") long min_size);

/**
 * Allocate a buffer, reusing the given one if large enough.
 *
 * Contrary to av_fast_realloc the current buffer contents might not be
 * preserved and on error the old buffer is freed, thus no special
 * handling to avoid memleaks is necessary.
 *
 * @param ptr pointer to pointer to already allocated buffer, overwritten with pointer to new buffer
 * @param size size of the buffer *ptr points to
 * @param min_size minimum size of *ptr buffer after returning, *ptr will be NULL and
 *                 *size 0 if an error occurred.
 */
public static native void av_fast_malloc(Pointer ptr, @Cast("unsigned int*") IntPointer size, @Cast("size_t") long min_size);
public static native void av_fast_malloc(Pointer ptr, @Cast("unsigned int*") IntBuffer size, @Cast("size_t") long min_size);
public static native void av_fast_malloc(Pointer ptr, @Cast("unsigned int*") int[] size, @Cast("size_t") long min_size);

/**
 * \}
 */

// #endif /* AVUTIL_MEM_H */


// Parsed from <libavutil/mathematics.h>

/*
 * copyright (c) 2005-2012 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_MATHEMATICS_H
// #define AVUTIL_MATHEMATICS_H

// #include <stdint.h>
// #include <math.h>
// #include "attributes.h"
// #include "rational.h"
// #include "intfloat.h"

// #ifndef M_E
public static final double M_E =            2.7182818284590452354;   /* e */
// #endif
// #ifndef M_LN2
public static final double M_LN2 =          0.69314718055994530942;  /* log_e 2 */
// #endif
// #ifndef M_LN10
public static final double M_LN10 =         2.30258509299404568402;  /* log_e 10 */
// #endif
// #ifndef M_LOG2_10
public static final double M_LOG2_10 =      3.32192809488736234787;  /* log_2 10 */
// #endif
// #ifndef M_PHI
public static final double M_PHI =          1.61803398874989484820;   /* phi / golden ratio */
// #endif
// #ifndef M_PI
public static final double M_PI =           3.14159265358979323846;  /* pi */
// #endif
// #ifndef M_PI_2
public static final double M_PI_2 =         1.57079632679489661923;  /* pi/2 */
// #endif
// #ifndef M_SQRT1_2
public static final double M_SQRT1_2 =      0.70710678118654752440;  /* 1/sqrt(2) */
// #endif
// #ifndef M_SQRT2
public static final double M_SQRT2 =        1.41421356237309504880;  /* sqrt(2) */
// #endif
// #ifndef NAN
public static native @MemberGetter int NAN();
public static final int NAN = NAN();
// #endif
// #ifndef INFINITY
public static native @MemberGetter int INFINITY();
public static final int INFINITY = INFINITY();
// #endif

/**
 * \addtogroup lavu_math
 * \{
 */


/** enum AVRounding */
public static final int
    /** Round toward zero. */
    AV_ROUND_ZERO     = 0,
    /** Round away from zero. */
    AV_ROUND_INF      = 1,
    /** Round toward -infinity. */
    AV_ROUND_DOWN     = 2,
    /** Round toward +infinity. */
    AV_ROUND_UP       = 3,
    /** Round to nearest and halfway cases away from zero. */
    AV_ROUND_NEAR_INF = 5,
    /** Flag to pass INT64_MIN/MAX through instead of rescaling, this avoids special cases for AV_NOPTS_VALUE */
    AV_ROUND_PASS_MINMAX = 8192;

/**
 * Return the greatest common divisor of a and b.
 * If both a and b are 0 or either or both are <0 then behavior is
 * undefined.
 */
public static native @Const long av_gcd(long a, long b);

/**
 * Rescale a 64-bit integer with rounding to nearest.
 * A simple a*b/c isn't possible as it can overflow.
 */
public static native long av_rescale(long a, long b, long c);

/**
 * Rescale a 64-bit integer with specified rounding.
 * A simple a*b/c isn't possible as it can overflow.
 *
 * @return rescaled value a, or if AV_ROUND_PASS_MINMAX is set and a is
 *         INT64_MIN or INT64_MAX then a is passed through unchanged.
 */
public static native long av_rescale_rnd(long a, long b, long c, @Cast("AVRounding") int arg3);

/**
 * Rescale a 64-bit integer by 2 rational numbers.
 */
public static native long av_rescale_q(long a, @ByVal AVRational bq, @ByVal AVRational cq);

/**
 * Rescale a 64-bit integer by 2 rational numbers with specified rounding.
 *
 * @return rescaled value a, or if AV_ROUND_PASS_MINMAX is set and a is
 *         INT64_MIN or INT64_MAX then a is passed through unchanged.
 */
public static native long av_rescale_q_rnd(long a, @ByVal AVRational bq, @ByVal AVRational cq,
                         @Cast("AVRounding") int arg3);

/**
 * Compare 2 timestamps each in its own timebases.
 * The result of the function is undefined if one of the timestamps
 * is outside the int64_t range when represented in the others timebase.
 * @return -1 if ts_a is before ts_b, 1 if ts_a is after ts_b or 0 if they represent the same position
 */
public static native int av_compare_ts(long ts_a, @ByVal AVRational tb_a, long ts_b, @ByVal AVRational tb_b);

/**
 * Compare 2 integers modulo mod.
 * That is we compare integers a and b for which only the least
 * significant log2(mod) bits are known.
 *
 * @param mod must be a power of 2
 * @return a negative value if a is smaller than b
 *         a positive value if a is greater than b
 *         0                if a equals          b
 */
public static native long av_compare_mod(@Cast("uint64_t") long a, @Cast("uint64_t") long b, @Cast("uint64_t") long mod);

/**
 * Rescale a timestamp while preserving known durations.
 *
 * @param in_ts Input timestamp
 * @param in_tb Input timebase
 * @param fs_tb Duration and *last timebase
 * @param duration duration till the next call
 * @param out_tb Output timebase
 */
public static native long av_rescale_delta(@ByVal AVRational in_tb, long in_ts,  @ByVal AVRational fs_tb, int duration, LongPointer last, @ByVal AVRational out_tb);
public static native long av_rescale_delta(@ByVal AVRational in_tb, long in_ts,  @ByVal AVRational fs_tb, int duration, LongBuffer last, @ByVal AVRational out_tb);
public static native long av_rescale_delta(@ByVal AVRational in_tb, long in_ts,  @ByVal AVRational fs_tb, int duration, long[] last, @ByVal AVRational out_tb);

/**
 * Add a value to a timestamp.
 *
 * This function guarantees that when the same value is repeatly added that
 * no accumulation of rounding errors occurs.
 *
 * @param ts Input timestamp
 * @param ts_tb Input timestamp timebase
 * @param inc value to add to ts
 * @param inc_tb inc timebase
 */
public static native long av_add_stable(@ByVal AVRational ts_tb, long ts, @ByVal AVRational inc_tb, long inc);


    /**
 * \}
 */

// #endif /* AVUTIL_MATHEMATICS_H */


// Parsed from <libavutil/rational.h>

/*
 * rational numbers
 * Copyright (c) 2003 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * rational numbers
 * @author Michael Niedermayer <michaelni\gmx.at>
 */

// #ifndef AVUTIL_RATIONAL_H
// #define AVUTIL_RATIONAL_H

// #include <stdint.h>
// #include <limits.h>
// #include "attributes.h"

/**
 * \addtogroup lavu_math
 * \{
 */

/**
 * rational number numerator/denominator
 */
public static class AVRational extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVRational() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVRational(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVRational(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVRational position(int position) {
        return (AVRational)super.position(position);
    }

    /** numerator */
    public native int num(); public native AVRational num(int num);
    /** denominator */
    public native int den(); public native AVRational den(int den);
}

/**
 * Create a rational.
 * Useful for compilers that do not support compound literals.
 * \note  The return value is not reduced.
 */
public static native @ByVal AVRational av_make_q(int num, int den);

/**
 * Compare two rationals.
 * @param a first rational
 * @param b second rational
 * @return 0 if a==b, 1 if a>b, -1 if a<b, and INT_MIN if one of the
 * values is of the form 0/0
 */
public static native int av_cmp_q(@ByVal AVRational a, @ByVal AVRational b);

/**
 * Convert rational to double.
 * @param a rational to convert
 * @return (double) a
 */
public static native double av_q2d(@ByVal AVRational a);

/**
 * Reduce a fraction.
 * This is useful for framerate calculations.
 * @param dst_num destination numerator
 * @param dst_den destination denominator
 * @param num source numerator
 * @param den source denominator
 * @param max the maximum allowed for dst_num & dst_den
 * @return 1 if exact, 0 otherwise
 */
public static native int av_reduce(IntPointer dst_num, IntPointer dst_den, long num, long den, long max);
public static native int av_reduce(IntBuffer dst_num, IntBuffer dst_den, long num, long den, long max);
public static native int av_reduce(int[] dst_num, int[] dst_den, long num, long den, long max);

/**
 * Multiply two rationals.
 * @param b first rational
 * @param c second rational
 * @return b*c
 */
public static native @ByVal AVRational av_mul_q(@ByVal AVRational b, @ByVal AVRational c);

/**
 * Divide one rational by another.
 * @param b first rational
 * @param c second rational
 * @return b/c
 */
public static native @ByVal AVRational av_div_q(@ByVal AVRational b, @ByVal AVRational c);

/**
 * Add two rationals.
 * @param b first rational
 * @param c second rational
 * @return b+c
 */
public static native @ByVal AVRational av_add_q(@ByVal AVRational b, @ByVal AVRational c);

/**
 * Subtract one rational from another.
 * @param b first rational
 * @param c second rational
 * @return b-c
 */
public static native @ByVal AVRational av_sub_q(@ByVal AVRational b, @ByVal AVRational c);

/**
 * Invert a rational.
 * @param q value
 * @return 1 / q
 */
public static native @ByVal AVRational av_inv_q(@ByVal AVRational q);

/**
 * Convert a double precision floating point number to a rational.
 * inf is expressed as {1,0} or {-1,0} depending on the sign.
 *
 * @param d double to convert
 * @param max the maximum allowed numerator and denominator
 * @return (AVRational) d
 */
public static native @ByVal AVRational av_d2q(double d, int max);

/**
 * @return 1 if q1 is nearer to q than q2, -1 if q2 is nearer
 * than q1, 0 if they have the same distance.
 */
public static native int av_nearer_q(@ByVal AVRational q, @ByVal AVRational q1, @ByVal AVRational q2);

/**
 * Find the nearest value in q_list to q.
 * @param q_list an array of rationals terminated by {0, 0}
 * @return the index of the nearest value found in the array
 */
public static native int av_find_nearest_q_idx(@ByVal AVRational q, @Const AVRational q_list);

/**
 * Converts a AVRational to a IEEE 32bit float.
 *
 * The float is returned in a uint32_t and its value is platform indepenant.
 */
public static native @Cast("uint32_t") int av_q2intfloat(@ByVal AVRational q);

/**
 * \}
 */

// #endif /* AVUTIL_RATIONAL_H */


// Parsed from <libavutil/log.h>

/*
 * copyright (c) 2006 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_LOG_H
// #define AVUTIL_LOG_H

// #include <stdarg.h>
// #include "avutil.h"
// #include "attributes.h"
// #include "version.h"

/** enum AVClassCategory */
public static final int
    AV_CLASS_CATEGORY_NA = 0,
    AV_CLASS_CATEGORY_INPUT = 1,
    AV_CLASS_CATEGORY_OUTPUT = 2,
    AV_CLASS_CATEGORY_MUXER = 3,
    AV_CLASS_CATEGORY_DEMUXER = 4,
    AV_CLASS_CATEGORY_ENCODER = 5,
    AV_CLASS_CATEGORY_DECODER = 6,
    AV_CLASS_CATEGORY_FILTER = 7,
    AV_CLASS_CATEGORY_BITSTREAM_FILTER = 8,
    AV_CLASS_CATEGORY_SWSCALER = 9,
    AV_CLASS_CATEGORY_SWRESAMPLER = 10,
    AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT = 40,
    AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT = 41,
    AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT = 42,
    AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT = 43,
    AV_CLASS_CATEGORY_DEVICE_OUTPUT = 44,
    AV_CLASS_CATEGORY_DEVICE_INPUT = 45,
    /** not part of ABI/API */
    AV_CLASS_CATEGORY_NB = 46;

// #define AV_IS_INPUT_DEVICE(category)
//     (((category) == AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT) ||
//      ((category) == AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT) ||
//      ((category) == AV_CLASS_CATEGORY_DEVICE_INPUT))

// #define AV_IS_OUTPUT_DEVICE(category)
//     (((category) == AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT) ||
//      ((category) == AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT) ||
//      ((category) == AV_CLASS_CATEGORY_DEVICE_OUTPUT))

/**
 * Describe the class of an AVClass context structure. That is an
 * arbitrary struct of which the first field is a pointer to an
 * AVClass struct (e.g. AVCodecContext, AVFormatContext etc.).
 */
public static class AVClass extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVClass() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVClass(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVClass(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVClass position(int position) {
        return (AVClass)super.position(position);
    }

    /**
     * The name of the class; usually it is the same name as the
     * context structure type to which the AVClass is associated.
     */
    @MemberGetter public native @Cast("const char*") BytePointer class_name();

    /**
     * A pointer to a function which returns the name of a context
     * instance ctx associated with the class.
     */
    public static class Item_name_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Item_name_Pointer(Pointer p) { super(p); }
        protected Item_name_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("const char*") BytePointer call(Pointer ctx);
    }
    @MemberGetter public native Item_name_Pointer item_name();

    /**
     * a pointer to the first option specified in the class if any or NULL
     *
     * @see av_set_default_options()
     */
    @MemberGetter public native @Const AVOption option();

    /**
     * LIBAVUTIL_VERSION with which this structure was created.
     * This is used to allow fields to be added without requiring major
     * version bumps everywhere.
     */

    public native int version(); public native AVClass version(int version);

    /**
     * Offset in the structure where log_level_offset is stored.
     * 0 means there is no such variable
     */
    public native int log_level_offset_offset(); public native AVClass log_level_offset_offset(int log_level_offset_offset);

    /**
     * Offset in the structure where a pointer to the parent context for
     * logging is stored. For example a decoder could pass its AVCodecContext
     * to eval as such a parent context, which an av_log() implementation
     * could then leverage to display the parent context.
     * The offset can be NULL.
     */
    public native int parent_log_context_offset(); public native AVClass parent_log_context_offset(int parent_log_context_offset);

    /**
     * Return next AVOptions-enabled child or NULL
     */
    public static class Child_next_Pointer_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Child_next_Pointer_Pointer(Pointer p) { super(p); }
        protected Child_next_Pointer_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer obj, Pointer prev);
    }
    public native Child_next_Pointer_Pointer child_next(); public native AVClass child_next(Child_next_Pointer_Pointer child_next);

    /**
     * Return an AVClass corresponding to the next potential
     * AVOptions-enabled child.
     *
     * The difference between child_next and this is that
     * child_next iterates over _already existing_ objects, while
     * child_class_next iterates over _all possible_ children.
     */
    public static class Child_class_next_AVClass extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Child_class_next_AVClass(Pointer p) { super(p); }
        protected Child_class_next_AVClass() { allocate(); }
        private native void allocate();
        public native @Const AVClass call(@Const AVClass prev);
    }
    @MemberGetter public native Child_class_next_AVClass child_class_next();

    /**
     * Category used for visualization (like color)
     * This is only set if the category is equal for all objects using this class.
     * available since version (51 << 16 | 56 << 8 | 100)
     */
    public native @Cast("AVClassCategory") int category(); public native AVClass category(int category);

    /**
     * Callback to return the category.
     * available since version (51 << 16 | 59 << 8 | 100)
     */
    public static class Get_category_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_category_Pointer(Pointer p) { super(p); }
        protected Get_category_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("AVClassCategory") int call(Pointer ctx);
    }
    public native Get_category_Pointer get_category(); public native AVClass get_category(Get_category_Pointer get_category);

    /**
     * Callback to return the supported/allowed ranges.
     * available since version (52.12)
     */
    public static class Query_ranges_PointerPointer_Pointer_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Query_ranges_PointerPointer_Pointer_BytePointer_int(Pointer p) { super(p); }
        protected Query_ranges_PointerPointer_Pointer_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(@Cast("AVOptionRanges**") PointerPointer arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
    }
    public native Query_ranges_PointerPointer_Pointer_BytePointer_int query_ranges(); public native AVClass query_ranges(Query_ranges_PointerPointer_Pointer_BytePointer_int query_ranges);
}

/**
 * \addtogroup lavu_log
 *
 * \{
 *
 * \defgroup lavu_log_constants Logging Constants
 *
 * \{
 */

/**
 * Print no output.
 */
public static final int AV_LOG_QUIET =    -8;

/**
 * Something went really wrong and we will crash now.
 */
public static final int AV_LOG_PANIC =     0;

/**
 * Something went wrong and recovery is not possible.
 * For example, no header was found for a format which depends
 * on headers or an illegal combination of parameters is used.
 */
public static final int AV_LOG_FATAL =     8;

/**
 * Something went wrong and cannot losslessly be recovered.
 * However, not all future data is affected.
 */
public static final int AV_LOG_ERROR =    16;

/**
 * Something somehow does not look correct. This may or may not
 * lead to problems. An example would be the use of '-vstrict -2'.
 */
public static final int AV_LOG_WARNING =  24;

/**
 * Standard information.
 */
public static final int AV_LOG_INFO =     32;

/**
 * Detailed information.
 */
public static final int AV_LOG_VERBOSE =  40;

/**
 * Stuff which is only useful for libav* developers.
 */
public static final int AV_LOG_DEBUG =    48;

/**
 * Extremely verbose debugging, useful for libav* development.
 */
public static final int AV_LOG_TRACE =    56;

public static final int AV_LOG_MAX_OFFSET = (AV_LOG_TRACE - AV_LOG_QUIET);

/**
 * \}
 */

/**
 * Sets additional colors for extended debugging sessions.
 * <pre>{@code
   av_log(ctx, AV_LOG_DEBUG|AV_LOG_C(134), "Message in purple\n");
   }</pre>
 * Requires 256color terminal support. Uses outside debugging is not
 * recommended.
 */
// #define AV_LOG_C(x) ((x) << 8)

/**
 * Send the specified message to the log if the level is less than or equal
 * to the current av_log_level. By default, all logging messages are sent to
 * stderr. This behavior can be altered by setting a different logging callback
 * function.
 * @see av_log_set_callback
 *
 * @param avcl A pointer to an arbitrary struct of which the first field is a
 *        pointer to an AVClass struct or NULL if general log.
 * @param level The importance level of the message expressed using a \ref
 *        lavu_log_constants "Logging Constant".
 * @param fmt The format string (printf-compatible) that specifies how
 *        subsequent arguments are converted to output.
 */
public static native void av_log(Pointer avcl, int level, @Cast("const char*") BytePointer fmt);
public static native void av_log(Pointer avcl, int level, String fmt);


/**
 * Send the specified message to the log if the level is less than or equal
 * to the current av_log_level. By default, all logging messages are sent to
 * stderr. This behavior can be altered by setting a different logging callback
 * function.
 * @see av_log_set_callback
 *
 * @param avcl A pointer to an arbitrary struct of which the first field is a
 *        pointer to an AVClass struct.
 * @param level The importance level of the message expressed using a \ref
 *        lavu_log_constants "Logging Constant".
 * @param fmt The format string (printf-compatible) that specifies how
 *        subsequent arguments are converted to output.
 * @param vl The arguments referenced by the format string.
 */
public static native void av_vlog(Pointer avcl, int level, @Cast("const char*") BytePointer fmt, @ByVal @Cast("va_list*") Pointer vl);
public static native void av_vlog(Pointer avcl, int level, String fmt, @ByVal @Cast("va_list*") Pointer vl);

/**
 * Get the current log level
 *
 * @see lavu_log_constants
 *
 * @return Current log level
 */
public static native int av_log_get_level();

/**
 * Set the log level
 *
 * @see lavu_log_constants
 *
 * @param level Logging level
 */
public static native void av_log_set_level(int level);

/**
 * Set the logging callback
 *
 * \note The callback must be thread safe, even if the application does not use
 *       threads itself as some codecs are multithreaded.
 *
 * @see av_log_default_callback
 *
 * @param callback A logging function with a compatible signature.
 */
public static class Callback_Pointer_int_BytePointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Callback_Pointer_int_BytePointer_Pointer(Pointer p) { super(p); }
    protected Callback_Pointer_int_BytePointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, int arg1, @Cast("const char*") BytePointer arg2, @ByVal @Cast("va_list*") Pointer arg3);
}
public static native void av_log_set_callback(Callback_Pointer_int_BytePointer_Pointer callback);
public static class Callback_Pointer_int_String_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Callback_Pointer_int_String_Pointer(Pointer p) { super(p); }
    protected Callback_Pointer_int_String_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, int arg1, String arg2, @ByVal @Cast("va_list*") Pointer arg3);
}
public static native void av_log_set_callback(Callback_Pointer_int_String_Pointer callback);

/**
 * Default logging callback
 *
 * It prints the message to stderr, optionally colorizing it.
 *
 * @param avcl A pointer to an arbitrary struct of which the first field is a
 *        pointer to an AVClass struct.
 * @param level The importance level of the message expressed using a \ref
 *        lavu_log_constants "Logging Constant".
 * @param fmt The format string (printf-compatible) that specifies how
 *        subsequent arguments are converted to output.
 * @param vl The arguments referenced by the format string.
 */
public static native void av_log_default_callback(Pointer avcl, int level, @Cast("const char*") BytePointer fmt,
                             @ByVal @Cast("va_list*") Pointer vl);
public static native void av_log_default_callback(Pointer avcl, int level, String fmt,
                             @ByVal @Cast("va_list*") Pointer vl);

/**
 * Return the context name
 *
 * @param  ctx The AVClass context
 *
 * @return The AVClass class_name
 */
public static native @Cast("const char*") BytePointer av_default_item_name(Pointer ctx);
public static native @Cast("AVClassCategory") int av_default_get_category(Pointer ptr);

/**
 * Format a line of log the same way as the default callback.
 * @param line          buffer to receive the formatted line
 * @param line_size     size of the buffer
 * @param print_prefix  used to store whether the prefix must be printed;
 *                      must point to a persistent integer initially set to 1
 */
public static native void av_log_format_line(Pointer ptr, int level, @Cast("const char*") BytePointer fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") BytePointer line, int line_size, IntPointer print_prefix);
public static native void av_log_format_line(Pointer ptr, int level, String fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") ByteBuffer line, int line_size, IntBuffer print_prefix);
public static native void av_log_format_line(Pointer ptr, int level, @Cast("const char*") BytePointer fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") byte[] line, int line_size, int[] print_prefix);
public static native void av_log_format_line(Pointer ptr, int level, String fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") BytePointer line, int line_size, IntPointer print_prefix);
public static native void av_log_format_line(Pointer ptr, int level, @Cast("const char*") BytePointer fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") ByteBuffer line, int line_size, IntBuffer print_prefix);
public static native void av_log_format_line(Pointer ptr, int level, String fmt, @ByVal @Cast("va_list*") Pointer vl,
                        @Cast("char*") byte[] line, int line_size, int[] print_prefix);

// #if FF_API_DLOG
/**
 * av_dlog macros
 * @deprecated unused
 * Useful to print debug messages that shouldn't get compiled in normally.
 */

// #ifdef DEBUG
// #    define av_dlog(pctx, ...) av_log(pctx, AV_LOG_DEBUG, __VA_ARGS__)
// #else
// #    define av_dlog(pctx, ...) do { if (0) av_log(pctx, AV_LOG_DEBUG, __VA_ARGS__); } while (0)
// #endif
// #endif /* FF_API_DLOG */

/**
 * Skip repeated messages, this requires the user app to use av_log() instead of
 * (f)printf as the 2 would otherwise interfere and lead to
 * "Last message repeated x times" messages below (f)printf messages with some
 * bad luck.
 * Also to receive the last, "last repeated" line if any, the user app must
 * call av_log(NULL, AV_LOG_QUIET, "%s", ""); at the end
 */
public static final int AV_LOG_SKIP_REPEATED = 1;

/**
 * Include the log severity in messages originating from codecs.
 *
 * Results in messages such as:
 * [rawvideo \ 0xDEADBEEF] [error] encode did not produce valid pts
 */
public static final int AV_LOG_PRINT_LEVEL = 2;

public static native void av_log_set_flags(int arg);
public static native int av_log_get_flags();

/**
 * \}
 */

// #endif /* AVUTIL_LOG_H */


// Parsed from <libavutil/buffer.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * \ingroup lavu_buffer
 * refcounted data buffer API
 */

// #ifndef AVUTIL_BUFFER_H
// #define AVUTIL_BUFFER_H

// #include <stdint.h>

/**
 * \defgroup lavu_buffer AVBuffer
 * \ingroup lavu_data
 *
 * \{
 * AVBuffer is an API for reference-counted data buffers.
 *
 * There are two core objects in this API -- AVBuffer and AVBufferRef. AVBuffer
 * represents the data buffer itself; it is opaque and not meant to be accessed
 * by the caller directly, but only through AVBufferRef. However, the caller may
 * e.g. compare two AVBuffer pointers to check whether two different references
 * are describing the same data buffer. AVBufferRef represents a single
 * reference to an AVBuffer and it is the object that may be manipulated by the
 * caller directly.
 *
 * There are two functions provided for creating a new AVBuffer with a single
 * reference -- av_buffer_alloc() to just allocate a new buffer, and
 * av_buffer_create() to wrap an existing array in an AVBuffer. From an existing
 * reference, additional references may be created with av_buffer_ref().
 * Use av_buffer_unref() to free a reference (this will automatically free the
 * data once all the references are freed).
 *
 * The convention throughout this API and the rest of FFmpeg is such that the
 * buffer is considered writable if there exists only one reference to it (and
 * it has not been marked as read-only). The av_buffer_is_writable() function is
 * provided to check whether this is true and av_buffer_make_writable() will
 * automatically create a new writable buffer when necessary.
 * Of course nothing prevents the calling code from violating this convention,
 * however that is safe only when all the existing references are under its
 * control.
 *
 * \note Referencing and unreferencing the buffers is thread-safe and thus
 * may be done from multiple threads simultaneously without any need for
 * additional locking.
 *
 * \note Two different references to the same buffer can point to different
 * parts of the buffer (i.e. their AVBufferRef.data will not be equal).
 */

/**
 * A reference counted buffer type. It is opaque and is meant to be used through
 * references (AVBufferRef).
 */
@Opaque public static class AVBuffer extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVBuffer() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBuffer(Pointer p) { super(p); }
}

/**
 * A reference to a data buffer.
 *
 * The size of this struct is not a part of the public ABI and it is not meant
 * to be allocated directly.
 */
public static class AVBufferRef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBufferRef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVBufferRef(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBufferRef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVBufferRef position(int position) {
        return (AVBufferRef)super.position(position);
    }

    public native AVBuffer buffer(); public native AVBufferRef buffer(AVBuffer buffer);

    /**
     * The data buffer. It is considered writable if and only if
     * this is the only reference to the buffer, in which case
     * av_buffer_is_writable() returns 1.
     */
    public native @Cast("uint8_t*") BytePointer data(); public native AVBufferRef data(BytePointer data);
    /**
     * Size of data in bytes.
     */
    public native int size(); public native AVBufferRef size(int size);
}

/**
 * Allocate an AVBuffer of the given size using av_malloc().
 *
 * @return an AVBufferRef of given size or NULL when out of memory
 */
public static native AVBufferRef av_buffer_alloc(int size);

/**
 * Same as av_buffer_alloc(), except the returned buffer will be initialized
 * to zero.
 */
public static native AVBufferRef av_buffer_allocz(int size);

/**
 * Always treat the buffer as read-only, even when it has only one
 * reference.
 */
public static final int AV_BUFFER_FLAG_READONLY = (1 << 0);

/**
 * Create an AVBuffer from an existing array.
 *
 * If this function is successful, data is owned by the AVBuffer. The caller may
 * only access data through the returned AVBufferRef and references derived from
 * it.
 * If this function fails, data is left untouched.
 * @param data   data array
 * @param size   size of data in bytes
 * @param free   a callback for freeing this buffer's data
 * @param opaque parameter to be got for processing or passed to free
 * @param flags  a combination of AV_BUFFER_FLAG_*
 *
 * @return an AVBufferRef referring to data on success, NULL on failure.
 */
public static class Free_Pointer_BytePointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_Pointer_BytePointer(Pointer p) { super(p); }
    protected Free_Pointer_BytePointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque, @Cast("uint8_t*") BytePointer data);
}
public static native AVBufferRef av_buffer_create(@Cast("uint8_t*") BytePointer data, int size,
                              Free_Pointer_BytePointer free,
                              Pointer opaque, int flags);
public static class Free_Pointer_ByteBuffer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_Pointer_ByteBuffer(Pointer p) { super(p); }
    protected Free_Pointer_ByteBuffer() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque, @Cast("uint8_t*") ByteBuffer data);
}
public static native AVBufferRef av_buffer_create(@Cast("uint8_t*") ByteBuffer data, int size,
                              Free_Pointer_ByteBuffer free,
                              Pointer opaque, int flags);
public static class Free_Pointer_byte__ extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_Pointer_byte__(Pointer p) { super(p); }
    protected Free_Pointer_byte__() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque, @Cast("uint8_t*") byte[] data);
}
public static native AVBufferRef av_buffer_create(@Cast("uint8_t*") byte[] data, int size,
                              Free_Pointer_byte__ free,
                              Pointer opaque, int flags);

/**
 * Default free callback, which calls av_free() on the buffer data.
 * This function is meant to be passed to av_buffer_create(), not called
 * directly.
 */
public static native void av_buffer_default_free(Pointer opaque, @Cast("uint8_t*") BytePointer data);
public static native void av_buffer_default_free(Pointer opaque, @Cast("uint8_t*") ByteBuffer data);
public static native void av_buffer_default_free(Pointer opaque, @Cast("uint8_t*") byte[] data);

/**
 * Create a new reference to an AVBuffer.
 *
 * @return a new AVBufferRef referring to the same AVBuffer as buf or NULL on
 * failure.
 */
public static native AVBufferRef av_buffer_ref(AVBufferRef buf);

/**
 * Free a given reference and automatically free the buffer if there are no more
 * references to it.
 *
 * @param buf the reference to be freed. The pointer is set to NULL on return.
 */
public static native void av_buffer_unref(@Cast("AVBufferRef**") PointerPointer buf);
public static native void av_buffer_unref(@ByPtrPtr AVBufferRef buf);

/**
 * @return 1 if the caller may write to the data referred to by buf (which is
 * true if and only if buf is the only reference to the underlying AVBuffer).
 * Return 0 otherwise.
 * A positive answer is valid until av_buffer_ref() is called on buf.
 */
public static native int av_buffer_is_writable(@Const AVBufferRef buf);

/**
 * @return the opaque parameter set by av_buffer_create.
 */
public static native Pointer av_buffer_get_opaque(@Const AVBufferRef buf);

public static native int av_buffer_get_ref_count(@Const AVBufferRef buf);

/**
 * Create a writable reference from a given buffer reference, avoiding data copy
 * if possible.
 *
 * @param buf buffer reference to make writable. On success, buf is either left
 *            untouched, or it is unreferenced and a new writable AVBufferRef is
 *            written in its place. On failure, buf is left untouched.
 * @return 0 on success, a negative AVERROR on failure.
 */
public static native int av_buffer_make_writable(@Cast("AVBufferRef**") PointerPointer buf);
public static native int av_buffer_make_writable(@ByPtrPtr AVBufferRef buf);

/**
 * Reallocate a given buffer.
 *
 * @param buf  a buffer reference to reallocate. On success, buf will be
 *             unreferenced and a new reference with the required size will be
 *             written in its place. On failure buf will be left untouched. *buf
 *             may be NULL, then a new buffer is allocated.
 * @param size required new buffer size.
 * @return 0 on success, a negative AVERROR on failure.
 *
 * \note the buffer is actually reallocated with av_realloc() only if it was
 * initially allocated through av_buffer_realloc(NULL) and there is only one
 * reference to it (i.e. the one passed to this function). In all other cases
 * a new buffer is allocated and the data is copied.
 */
public static native int av_buffer_realloc(@Cast("AVBufferRef**") PointerPointer buf, int size);
public static native int av_buffer_realloc(@ByPtrPtr AVBufferRef buf, int size);

/**
 * \}
 */

/**
 * \defgroup lavu_bufferpool AVBufferPool
 * \ingroup lavu_data
 *
 * \{
 * AVBufferPool is an API for a lock-free thread-safe pool of AVBuffers.
 *
 * Frequently allocating and freeing large buffers may be slow. AVBufferPool is
 * meant to solve this in cases when the caller needs a set of buffers of the
 * same size (the most obvious use case being buffers for raw video or audio
 * frames).
 *
 * At the beginning, the user must call av_buffer_pool_init() to create the
 * buffer pool. Then whenever a buffer is needed, call av_buffer_pool_get() to
 * get a reference to a new buffer, similar to av_buffer_alloc(). This new
 * reference works in all aspects the same way as the one created by
 * av_buffer_alloc(). However, when the last reference to this buffer is
 * unreferenced, it is returned to the pool instead of being freed and will be
 * reused for subsequent av_buffer_pool_get() calls.
 *
 * When the caller is done with the pool and no longer needs to allocate any new
 * buffers, av_buffer_pool_uninit() must be called to mark the pool as freeable.
 * Once all the buffers are released, it will automatically be freed.
 *
 * Allocating and releasing buffers with this API is thread-safe as long as
 * either the default alloc callback is used, or the user-supplied one is
 * thread-safe.
 */

/**
 * The buffer pool. This structure is opaque and not meant to be accessed
 * directly. It is allocated with av_buffer_pool_init() and freed with
 * av_buffer_pool_uninit().
 */
@Opaque public static class AVBufferPool extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVBufferPool() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBufferPool(Pointer p) { super(p); }
}

/**
 * Allocate and initialize a buffer pool.
 *
 * @param size size of each buffer in this pool
 * @param alloc a function that will be used to allocate new buffers when the
 * pool is empty. May be NULL, then the default allocator will be used
 * (av_buffer_alloc()).
 * @return newly created buffer pool on success, NULL on error.
 */
public static class Alloc_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Alloc_int(Pointer p) { super(p); }
    protected Alloc_int() { allocate(); }
    private native void allocate();
    public native AVBufferRef call(int size);
}
public static native AVBufferPool av_buffer_pool_init(int size, Alloc_int alloc);

/**
 * Mark the pool as being available for freeing. It will actually be freed only
 * once all the allocated buffers associated with the pool are released. Thus it
 * is safe to call this function while some of the allocated buffers are still
 * in use.
 *
 * @param pool pointer to the pool to be freed. It will be set to NULL.
 * @see av_buffer_pool_can_uninit()
 */
public static native void av_buffer_pool_uninit(@Cast("AVBufferPool**") PointerPointer pool);
public static native void av_buffer_pool_uninit(@ByPtrPtr AVBufferPool pool);

/**
 * Allocate a new AVBuffer, reusing an old buffer from the pool when available.
 * This function may be called simultaneously from multiple threads.
 *
 * @return a reference to the new buffer on success, NULL on error.
 */
public static native AVBufferRef av_buffer_pool_get(AVBufferPool pool);

/**
 * \}
 */

// #endif /* AVUTIL_BUFFER_H */


// Parsed from <libavutil/pixfmt.h>

/*
 * copyright (c) 2006 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_PIXFMT_H
// #define AVUTIL_PIXFMT_H

/**
 * \file
 * pixel format definitions
 *
 */

// #include "libavutil/avconfig.h"
// #include "version.h"

public static final int AVPALETTE_SIZE = 1024;
public static final int AVPALETTE_COUNT = 256;

/**
 * Pixel format.
 *
 * \note
 * AV_PIX_FMT_RGB32 is handled in an endian-specific manner. An RGBA
 * color is put together as:
 *  (A << 24) | (R << 16) | (G << 8) | B
 * This is stored as BGRA on little-endian CPU architectures and ARGB on
 * big-endian CPUs.
 *
 * \par
 * When the pixel format is palettized RGB32 (AV_PIX_FMT_PAL8), the palettized
 * image data is stored in AVFrame.data[0]. The palette is transported in
 * AVFrame.data[1], is 1024 bytes long (256 4-byte entries) and is
 * formatted the same as in AV_PIX_FMT_RGB32 described above (i.e., it is
 * also endian-specific). Note also that the individual RGB32 palette
 * components stored in AVFrame.data[1] should be in the range 0..255.
 * This is important as many custom PAL8 video codecs that were designed
 * to run on the IBM VGA graphics adapter use 6-bit palette components.
 *
 * \par
 * For all the 8bit per pixel formats, an RGB32 palette is in data[1] like
 * for pal8. This palette is filled in automatically by the function
 * allocating the picture.
 */
/** enum AVPixelFormat */
public static final int
    AV_PIX_FMT_NONE = -1,
    /** planar YUV 4:2:0, 12bpp, (1 Cr & Cb sample per 2x2 Y samples) */
    AV_PIX_FMT_YUV420P = 0,
    /** packed YUV 4:2:2, 16bpp, Y0 Cb Y1 Cr */
    AV_PIX_FMT_YUYV422 = 1,
    /** packed RGB 8:8:8, 24bpp, RGBRGB... */
    AV_PIX_FMT_RGB24 = 2,
    /** packed RGB 8:8:8, 24bpp, BGRBGR... */
    AV_PIX_FMT_BGR24 = 3,
    /** planar YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples) */
    AV_PIX_FMT_YUV422P = 4,
    /** planar YUV 4:4:4, 24bpp, (1 Cr & Cb sample per 1x1 Y samples) */
    AV_PIX_FMT_YUV444P = 5,
    /** planar YUV 4:1:0,  9bpp, (1 Cr & Cb sample per 4x4 Y samples) */
    AV_PIX_FMT_YUV410P = 6,
    /** planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples) */
    AV_PIX_FMT_YUV411P = 7,
    /**        Y        ,  8bpp */
    AV_PIX_FMT_GRAY8 = 8,
    /**        Y        ,  1bpp, 0 is white, 1 is black, in each byte pixels are ordered from the msb to the lsb */
    AV_PIX_FMT_MONOWHITE = 9,
    /**        Y        ,  1bpp, 0 is black, 1 is white, in each byte pixels are ordered from the msb to the lsb */
    AV_PIX_FMT_MONOBLACK = 10,
    /** 8 bit with AV_PIX_FMT_RGB32 palette */
    AV_PIX_FMT_PAL8 = 11,
    /** planar YUV 4:2:0, 12bpp, full scale (JPEG), deprecated in favor of AV_PIX_FMT_YUV420P and setting color_range */
    AV_PIX_FMT_YUVJ420P = 12,
    /** planar YUV 4:2:2, 16bpp, full scale (JPEG), deprecated in favor of AV_PIX_FMT_YUV422P and setting color_range */
    AV_PIX_FMT_YUVJ422P = 13,
    /** planar YUV 4:4:4, 24bpp, full scale (JPEG), deprecated in favor of AV_PIX_FMT_YUV444P and setting color_range */
    AV_PIX_FMT_YUVJ444P = 14,
// #if FF_API_XVMC
    /** XVideo Motion Acceleration via common packet passing */
    AV_PIX_FMT_XVMC_MPEG2_MC = 15,
    AV_PIX_FMT_XVMC_MPEG2_IDCT = 16;
public static final int AV_PIX_FMT_XVMC = AV_PIX_FMT_XVMC_MPEG2_IDCT;
public static final int
// #endif /* FF_API_XVMC */
    /** packed YUV 4:2:2, 16bpp, Cb Y0 Cr Y1 */
    AV_PIX_FMT_UYVY422 = 17,
    /** packed YUV 4:1:1, 12bpp, Cb Y0 Y1 Cr Y2 Y3 */
    AV_PIX_FMT_UYYVYY411 = 18,
    /** packed RGB 3:3:2,  8bpp, (msb)2B 3G 3R(lsb) */
    AV_PIX_FMT_BGR8 = 19,
    /** packed RGB 1:2:1 bitstream,  4bpp, (msb)1B 2G 1R(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits */
    AV_PIX_FMT_BGR4 = 20,
    /** packed RGB 1:2:1,  8bpp, (msb)1B 2G 1R(lsb) */
    AV_PIX_FMT_BGR4_BYTE = 21,
    /** packed RGB 3:3:2,  8bpp, (msb)2R 3G 3B(lsb) */
    AV_PIX_FMT_RGB8 = 22,
    /** packed RGB 1:2:1 bitstream,  4bpp, (msb)1R 2G 1B(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits */
    AV_PIX_FMT_RGB4 = 23,
    /** packed RGB 1:2:1,  8bpp, (msb)1R 2G 1B(lsb) */
    AV_PIX_FMT_RGB4_BYTE = 24,
    /** planar YUV 4:2:0, 12bpp, 1 plane for Y and 1 plane for the UV components, which are interleaved (first byte U and the following byte V) */
    AV_PIX_FMT_NV12 = 25,
    /** as above, but U and V bytes are swapped */
    AV_PIX_FMT_NV21 = 26,

    /** packed ARGB 8:8:8:8, 32bpp, ARGBARGB... */
    AV_PIX_FMT_ARGB = 27,
    /** packed RGBA 8:8:8:8, 32bpp, RGBARGBA... */
    AV_PIX_FMT_RGBA = 28,
    /** packed ABGR 8:8:8:8, 32bpp, ABGRABGR... */
    AV_PIX_FMT_ABGR = 29,
    /** packed BGRA 8:8:8:8, 32bpp, BGRABGRA... */
    AV_PIX_FMT_BGRA = 30,

    /**        Y        , 16bpp, big-endian */
    AV_PIX_FMT_GRAY16BE = 31,
    /**        Y        , 16bpp, little-endian */
    AV_PIX_FMT_GRAY16LE = 32,
    /** planar YUV 4:4:0 (1 Cr & Cb sample per 1x2 Y samples) */
    AV_PIX_FMT_YUV440P = 33,
    /** planar YUV 4:4:0 full scale (JPEG), deprecated in favor of AV_PIX_FMT_YUV440P and setting color_range */
    AV_PIX_FMT_YUVJ440P = 34,
    /** planar YUV 4:2:0, 20bpp, (1 Cr & Cb sample per 2x2 Y & A samples) */
    AV_PIX_FMT_YUVA420P = 35,
// #if FF_API_VDPAU
    /** H.264 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_H264 = 36,
    /** MPEG-1 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_MPEG1 = 37,
    /** MPEG-2 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_MPEG2 = 38,
    /** WMV3 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_WMV3 = 39,
    /** VC-1 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_VC1 = 40,
// #endif
    /** packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as big-endian */
    AV_PIX_FMT_RGB48BE = 41,
    /** packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as little-endian */
    AV_PIX_FMT_RGB48LE = 42,

    /** packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), big-endian */
    AV_PIX_FMT_RGB565BE = 43,
    /** packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), little-endian */
    AV_PIX_FMT_RGB565LE = 44,
    /** packed RGB 5:5:5, 16bpp, (msb)1X 5R 5G 5B(lsb), big-endian   , X=unused/undefined */
    AV_PIX_FMT_RGB555BE = 45,
    /** packed RGB 5:5:5, 16bpp, (msb)1X 5R 5G 5B(lsb), little-endian, X=unused/undefined */
    AV_PIX_FMT_RGB555LE = 46,

    /** packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), big-endian */
    AV_PIX_FMT_BGR565BE = 47,
    /** packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), little-endian */
    AV_PIX_FMT_BGR565LE = 48,
    /** packed BGR 5:5:5, 16bpp, (msb)1X 5B 5G 5R(lsb), big-endian   , X=unused/undefined */
    AV_PIX_FMT_BGR555BE = 49,
    /** packed BGR 5:5:5, 16bpp, (msb)1X 5B 5G 5R(lsb), little-endian, X=unused/undefined */
    AV_PIX_FMT_BGR555LE = 50,

// #if FF_API_VAAPI
    /** \name Deprecated pixel formats */
    /**\{*/
    /** HW acceleration through VA API at motion compensation entry-point, Picture.data[3] contains a vaapi_render_state struct which contains macroblocks as well as various fields extracted from headers */
    AV_PIX_FMT_VAAPI_MOCO = 51,
    /** HW acceleration through VA API at IDCT entry-point, Picture.data[3] contains a vaapi_render_state struct which contains fields extracted from headers */
    AV_PIX_FMT_VAAPI_IDCT = 52,
    /** HW decoding through VA API, Picture.data[3] contains a vaapi_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VAAPI_VLD = 53,
    /**\}*/
    AV_PIX_FMT_VAAPI =  AV_PIX_FMT_VAAPI_VLD,
// #else
// #endif

    /** planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
    AV_PIX_FMT_YUV420P16LE =  AV_PIX_FMT_VAAPI_VLD + 1,
    /** planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
    AV_PIX_FMT_YUV420P16BE =  AV_PIX_FMT_VAAPI_VLD + 2,
    /** planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_YUV422P16LE =  AV_PIX_FMT_VAAPI_VLD + 3,
    /** planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_YUV422P16BE =  AV_PIX_FMT_VAAPI_VLD + 4,
    /** planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
    AV_PIX_FMT_YUV444P16LE =  AV_PIX_FMT_VAAPI_VLD + 5,
    /** planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
    AV_PIX_FMT_YUV444P16BE =  AV_PIX_FMT_VAAPI_VLD + 6,
// #if FF_API_VDPAU
    /** MPEG4 HW decoding with VDPAU, data[0] contains a vdpau_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
    AV_PIX_FMT_VDPAU_MPEG4 =  AV_PIX_FMT_VAAPI_VLD + 7,
// #endif
    /** HW decoding through DXVA2, Picture.data[3] contains a LPDIRECT3DSURFACE9 pointer */
    AV_PIX_FMT_DXVA2_VLD =  AV_PIX_FMT_VAAPI_VLD + 8,

    /** packed RGB 4:4:4, 16bpp, (msb)4X 4R 4G 4B(lsb), little-endian, X=unused/undefined */
    AV_PIX_FMT_RGB444LE =  AV_PIX_FMT_VAAPI_VLD + 9,
    /** packed RGB 4:4:4, 16bpp, (msb)4X 4R 4G 4B(lsb), big-endian,    X=unused/undefined */
    AV_PIX_FMT_RGB444BE =  AV_PIX_FMT_VAAPI_VLD + 10,
    /** packed BGR 4:4:4, 16bpp, (msb)4X 4B 4G 4R(lsb), little-endian, X=unused/undefined */
    AV_PIX_FMT_BGR444LE =  AV_PIX_FMT_VAAPI_VLD + 11,
    /** packed BGR 4:4:4, 16bpp, (msb)4X 4B 4G 4R(lsb), big-endian,    X=unused/undefined */
    AV_PIX_FMT_BGR444BE =  AV_PIX_FMT_VAAPI_VLD + 12,
    /** 8bit gray, 8bit alpha */
    AV_PIX_FMT_YA8 =  AV_PIX_FMT_VAAPI_VLD + 13,

    /** alias for AV_PIX_FMT_YA8 */
    AV_PIX_FMT_Y400A =  AV_PIX_FMT_YA8,
    /** alias for AV_PIX_FMT_YA8 */
    AV_PIX_FMT_GRAY8A=  AV_PIX_FMT_YA8,

    /** packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as big-endian */
    AV_PIX_FMT_BGR48BE =  AV_PIX_FMT_YA8 + 1,
    /** packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as little-endian */
    AV_PIX_FMT_BGR48LE =  AV_PIX_FMT_YA8 + 2,

    /**
     * The following 12 formats have the disadvantage of needing 1 format for each bit depth.
     * Notice that each 9/10 bits sample is stored in 16 bits with extra padding.
     * If you want to support multiple bit depths, then using AV_PIX_FMT_YUV420P16* with the bpp stored separately is better.
     */
    /** planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
    AV_PIX_FMT_YUV420P9BE =  AV_PIX_FMT_YA8 + 3,
    /** planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
    AV_PIX_FMT_YUV420P9LE =  AV_PIX_FMT_YA8 + 4,
    /** planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
    AV_PIX_FMT_YUV420P10BE =  AV_PIX_FMT_YA8 + 5,
    /** planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
    AV_PIX_FMT_YUV420P10LE =  AV_PIX_FMT_YA8 + 6,
    /** planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_YUV422P10BE =  AV_PIX_FMT_YA8 + 7,
    /** planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_YUV422P10LE =  AV_PIX_FMT_YA8 + 8,
    /** planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
    AV_PIX_FMT_YUV444P9BE =  AV_PIX_FMT_YA8 + 9,
    /** planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
    AV_PIX_FMT_YUV444P9LE =  AV_PIX_FMT_YA8 + 10,
    /** planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
    AV_PIX_FMT_YUV444P10BE =  AV_PIX_FMT_YA8 + 11,
    /** planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
    AV_PIX_FMT_YUV444P10LE =  AV_PIX_FMT_YA8 + 12,
    /** planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_YUV422P9BE =  AV_PIX_FMT_YA8 + 13,
    /** planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_YUV422P9LE =  AV_PIX_FMT_YA8 + 14,
    /** hardware decoding through VDA */
    AV_PIX_FMT_VDA_VLD =  AV_PIX_FMT_YA8 + 15,

// #ifdef AV_PIX_FMT_ABI_GIT_MASTER
// #endif
    /** planar GBR 4:4:4 24bpp */
    AV_PIX_FMT_GBRP =  AV_PIX_FMT_YA8 + 16,
    /** planar GBR 4:4:4 27bpp, big-endian */
    AV_PIX_FMT_GBRP9BE =  AV_PIX_FMT_YA8 + 17,
    /** planar GBR 4:4:4 27bpp, little-endian */
    AV_PIX_FMT_GBRP9LE =  AV_PIX_FMT_YA8 + 18,
    /** planar GBR 4:4:4 30bpp, big-endian */
    AV_PIX_FMT_GBRP10BE =  AV_PIX_FMT_YA8 + 19,
    /** planar GBR 4:4:4 30bpp, little-endian */
    AV_PIX_FMT_GBRP10LE =  AV_PIX_FMT_YA8 + 20,
    /** planar GBR 4:4:4 48bpp, big-endian */
    AV_PIX_FMT_GBRP16BE =  AV_PIX_FMT_YA8 + 21,
    /** planar GBR 4:4:4 48bpp, little-endian */
    AV_PIX_FMT_GBRP16LE =  AV_PIX_FMT_YA8 + 22,

    /**
     * duplicated pixel formats for compatibility with libav.
     * FFmpeg supports these formats since May 8 2012 and Jan 28 2012 (commits f9ca1ac7 and 143a5c55)
     * Libav added them Oct 12 2012 with incompatible values (commit 6d5600e85)
     */
    /** planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples) */
    AV_PIX_FMT_YUVA422P_LIBAV =  AV_PIX_FMT_YA8 + 23,
    /** planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples) */
    AV_PIX_FMT_YUVA444P_LIBAV =  AV_PIX_FMT_YA8 + 24,

    /** planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), big-endian */
    AV_PIX_FMT_YUVA420P9BE =  AV_PIX_FMT_YA8 + 25,
    /** planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), little-endian */
    AV_PIX_FMT_YUVA420P9LE =  AV_PIX_FMT_YA8 + 26,
    /** planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), big-endian */
    AV_PIX_FMT_YUVA422P9BE =  AV_PIX_FMT_YA8 + 27,
    /** planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), little-endian */
    AV_PIX_FMT_YUVA422P9LE =  AV_PIX_FMT_YA8 + 28,
    /** planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), big-endian */
    AV_PIX_FMT_YUVA444P9BE =  AV_PIX_FMT_YA8 + 29,
    /** planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), little-endian */
    AV_PIX_FMT_YUVA444P9LE =  AV_PIX_FMT_YA8 + 30,
    /** planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA420P10BE =  AV_PIX_FMT_YA8 + 31,
    /** planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA420P10LE =  AV_PIX_FMT_YA8 + 32,
    /** planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA422P10BE =  AV_PIX_FMT_YA8 + 33,
    /** planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA422P10LE =  AV_PIX_FMT_YA8 + 34,
    /** planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA444P10BE =  AV_PIX_FMT_YA8 + 35,
    /** planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA444P10LE =  AV_PIX_FMT_YA8 + 36,
    /** planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA420P16BE =  AV_PIX_FMT_YA8 + 37,
    /** planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA420P16LE =  AV_PIX_FMT_YA8 + 38,
    /** planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA422P16BE =  AV_PIX_FMT_YA8 + 39,
    /** planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA422P16LE =  AV_PIX_FMT_YA8 + 40,
    /** planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian) */
    AV_PIX_FMT_YUVA444P16BE =  AV_PIX_FMT_YA8 + 41,
    /** planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian) */
    AV_PIX_FMT_YUVA444P16LE =  AV_PIX_FMT_YA8 + 42,

    /** HW acceleration through VDPAU, Picture.data[3] contains a VdpVideoSurface */
    AV_PIX_FMT_VDPAU =  AV_PIX_FMT_YA8 + 43,

    /** packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as little-endian, the 4 lower bits are set to 0 */
    AV_PIX_FMT_XYZ12LE =  AV_PIX_FMT_YA8 + 44,
    /** packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as big-endian, the 4 lower bits are set to 0 */
    AV_PIX_FMT_XYZ12BE =  AV_PIX_FMT_YA8 + 45,
    /** interleaved chroma YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples) */
    AV_PIX_FMT_NV16 =  AV_PIX_FMT_YA8 + 46,
    /** interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_NV20LE =  AV_PIX_FMT_YA8 + 47,
    /** interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_NV20BE =  AV_PIX_FMT_YA8 + 48,

    /**
     * duplicated pixel formats for compatibility with libav.
     * FFmpeg supports these formats since Sat Sep 24 06:01:45 2011 +0200 (commits 9569a3c9f41387a8c7d1ce97d8693520477a66c3)
     * also see Fri Nov 25 01:38:21 2011 +0100 92afb431621c79155fcb7171d26f137eb1bee028
     * Libav added them Sun Mar 16 23:05:47 2014 +0100 with incompatible values (commit 1481d24c3a0abf81e1d7a514547bd5305232be30)
     */
    /** packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
    AV_PIX_FMT_RGBA64BE_LIBAV =  AV_PIX_FMT_YA8 + 49,
    /** packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
    AV_PIX_FMT_RGBA64LE_LIBAV =  AV_PIX_FMT_YA8 + 50,
    /** packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
    AV_PIX_FMT_BGRA64BE_LIBAV =  AV_PIX_FMT_YA8 + 51,
    /** packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
    AV_PIX_FMT_BGRA64LE_LIBAV =  AV_PIX_FMT_YA8 + 52,

    /** packed YUV 4:2:2, 16bpp, Y0 Cr Y1 Cb */
    AV_PIX_FMT_YVYU422 =  AV_PIX_FMT_YA8 + 53,

    /** HW acceleration through VDA, data[3] contains a CVPixelBufferRef */
    AV_PIX_FMT_VDA =  AV_PIX_FMT_YA8 + 54,

    /** 16bit gray, 16bit alpha (big-endian) */
    AV_PIX_FMT_YA16BE =  AV_PIX_FMT_YA8 + 55,
    /** 16bit gray, 16bit alpha (little-endian) */
    AV_PIX_FMT_YA16LE =  AV_PIX_FMT_YA8 + 56,

    /**
     * duplicated pixel formats for compatibility with libav.
     * FFmpeg supports these formats since May 3 2013 (commit e6d4e687558d08187e7a415a7725e4b1a416f782)
     * Libav added them Jan 14 2015 with incompatible values (commit 0e6c7dfa650e8b0497bfa7a06394b7a462ddc33a)
     */
    /** planar GBRA 4:4:4:4 32bpp */
    AV_PIX_FMT_GBRAP_LIBAV =  AV_PIX_FMT_YA8 + 57,
    /** planar GBRA 4:4:4:4 64bpp, big-endian */
    AV_PIX_FMT_GBRAP16BE_LIBAV =  AV_PIX_FMT_YA8 + 58,
    /** planar GBRA 4:4:4:4 64bpp, little-endian */
    AV_PIX_FMT_GBRAP16LE_LIBAV =  AV_PIX_FMT_YA8 + 59,
    /**
     *  HW acceleration through QSV, data[3] contains a pointer to the
     *  mfxFrameSurface1 structure.
     */
    AV_PIX_FMT_QSV =  AV_PIX_FMT_YA8 + 60,
    /**
     * HW acceleration though MMAL, data[3] contains a pointer to the
     * MMAL_BUFFER_HEADER_T structure.
     */
    AV_PIX_FMT_MMAL =  AV_PIX_FMT_YA8 + 61,

    /** HW decoding through Direct3D11, Picture.data[3] contains a ID3D11VideoDecoderOutputView pointer */
    AV_PIX_FMT_D3D11VA_VLD =  AV_PIX_FMT_YA8 + 62,

// #ifndef AV_PIX_FMT_ABI_GIT_MASTER
    /** packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
    AV_PIX_FMT_RGBA64BE= 0x123,
    /** packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
    AV_PIX_FMT_RGBA64LE = 0x123 + 1,
    /** packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
    AV_PIX_FMT_BGRA64BE = 0x123 + 2,
    /** packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
    AV_PIX_FMT_BGRA64LE = 0x123 + 3,
// #endif
    /** packed RGB 8:8:8, 32bpp, XRGBXRGB...   X=unused/undefined */
    AV_PIX_FMT_0RGB= 0x123+4,
    /** packed RGB 8:8:8, 32bpp, RGBXRGBX...   X=unused/undefined */
    AV_PIX_FMT_RGB0 = 0x123+4 + 1,
    /** packed BGR 8:8:8, 32bpp, XBGRXBGR...   X=unused/undefined */
    AV_PIX_FMT_0BGR = 0x123+4 + 2,
    /** packed BGR 8:8:8, 32bpp, BGRXBGRX...   X=unused/undefined */
    AV_PIX_FMT_BGR0 = 0x123+4 + 3,
    /** planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples) */
    AV_PIX_FMT_YUVA444P = 0x123+4 + 4,
    /** planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples) */
    AV_PIX_FMT_YUVA422P = 0x123+4 + 5,

    /** planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
    AV_PIX_FMT_YUV420P12BE = 0x123+4 + 6,
    /** planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
    AV_PIX_FMT_YUV420P12LE = 0x123+4 + 7,
    /** planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
    AV_PIX_FMT_YUV420P14BE = 0x123+4 + 8,
    /** planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
    AV_PIX_FMT_YUV420P14LE = 0x123+4 + 9,
    /** planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_YUV422P12BE = 0x123+4 + 10,
    /** planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_YUV422P12LE = 0x123+4 + 11,
    /** planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
    AV_PIX_FMT_YUV422P14BE = 0x123+4 + 12,
    /** planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
    AV_PIX_FMT_YUV422P14LE = 0x123+4 + 13,
    /** planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
    AV_PIX_FMT_YUV444P12BE = 0x123+4 + 14,
    /** planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
    AV_PIX_FMT_YUV444P12LE = 0x123+4 + 15,
    /** planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
    AV_PIX_FMT_YUV444P14BE = 0x123+4 + 16,
    /** planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
    AV_PIX_FMT_YUV444P14LE = 0x123+4 + 17,
    /** planar GBR 4:4:4 36bpp, big-endian */
    AV_PIX_FMT_GBRP12BE = 0x123+4 + 18,
    /** planar GBR 4:4:4 36bpp, little-endian */
    AV_PIX_FMT_GBRP12LE = 0x123+4 + 19,
    /** planar GBR 4:4:4 42bpp, big-endian */
    AV_PIX_FMT_GBRP14BE = 0x123+4 + 20,
    /** planar GBR 4:4:4 42bpp, little-endian */
    AV_PIX_FMT_GBRP14LE = 0x123+4 + 21,
    /** planar GBRA 4:4:4:4 32bpp */
    AV_PIX_FMT_GBRAP = 0x123+4 + 22,
    /** planar GBRA 4:4:4:4 64bpp, big-endian */
    AV_PIX_FMT_GBRAP16BE = 0x123+4 + 23,
    /** planar GBRA 4:4:4:4 64bpp, little-endian */
    AV_PIX_FMT_GBRAP16LE = 0x123+4 + 24,
    /** planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples) full scale (JPEG), deprecated in favor of AV_PIX_FMT_YUV411P and setting color_range */
    AV_PIX_FMT_YUVJ411P = 0x123+4 + 25,

    /** bayer, BGBG..(odd line), GRGR..(even line), 8-bit samples */
    AV_PIX_FMT_BAYER_BGGR8 = 0x123+4 + 26,
    /** bayer, RGRG..(odd line), GBGB..(even line), 8-bit samples */
    AV_PIX_FMT_BAYER_RGGB8 = 0x123+4 + 27,
    /** bayer, GBGB..(odd line), RGRG..(even line), 8-bit samples */
    AV_PIX_FMT_BAYER_GBRG8 = 0x123+4 + 28,
    /** bayer, GRGR..(odd line), BGBG..(even line), 8-bit samples */
    AV_PIX_FMT_BAYER_GRBG8 = 0x123+4 + 29,
    /** bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, little-endian */
    AV_PIX_FMT_BAYER_BGGR16LE = 0x123+4 + 30,
    /** bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, big-endian */
    AV_PIX_FMT_BAYER_BGGR16BE = 0x123+4 + 31,
    /** bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, little-endian */
    AV_PIX_FMT_BAYER_RGGB16LE = 0x123+4 + 32,
    /** bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, big-endian */
    AV_PIX_FMT_BAYER_RGGB16BE = 0x123+4 + 33,
    /** bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, little-endian */
    AV_PIX_FMT_BAYER_GBRG16LE = 0x123+4 + 34,
    /** bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, big-endian */
    AV_PIX_FMT_BAYER_GBRG16BE = 0x123+4 + 35,
    /** bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, little-endian */
    AV_PIX_FMT_BAYER_GRBG16LE = 0x123+4 + 36,
    /** bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, big-endian */
    AV_PIX_FMT_BAYER_GRBG16BE = 0x123+4 + 37,
// #if !FF_API_XVMC
// #endif /* !FF_API_XVMC */
    /** planar YUV 4:4:0,20bpp, (1 Cr & Cb sample per 1x2 Y samples), little-endian */
    AV_PIX_FMT_YUV440P10LE = 0x123+4 + 38,
    /** planar YUV 4:4:0,20bpp, (1 Cr & Cb sample per 1x2 Y samples), big-endian */
    AV_PIX_FMT_YUV440P10BE = 0x123+4 + 39,
    /** planar YUV 4:4:0,24bpp, (1 Cr & Cb sample per 1x2 Y samples), little-endian */
    AV_PIX_FMT_YUV440P12LE = 0x123+4 + 40,
    /** planar YUV 4:4:0,24bpp, (1 Cr & Cb sample per 1x2 Y samples), big-endian */
    AV_PIX_FMT_YUV440P12BE = 0x123+4 + 41,
    /** packed AYUV 4:4:4,64bpp (1 Cr & Cb sample per 1x1 Y & A samples), little-endian */
    AV_PIX_FMT_AYUV64LE = 0x123+4 + 42,
    /** packed AYUV 4:4:4,64bpp (1 Cr & Cb sample per 1x1 Y & A samples), big-endian */
    AV_PIX_FMT_AYUV64BE = 0x123+4 + 43,

    /** hardware decoding through Videotoolbox */
    AV_PIX_FMT_VIDEOTOOLBOX = 0x123+4 + 44,

    /** number of pixel formats, DO NOT USE THIS if you want to link with shared libav* because the number of formats might differ between versions */
    AV_PIX_FMT_NB = 0x123+4 + 45;

// #if FF_API_PIX_FMT
// #include "old_pix_fmts.h"
// #endif

// #if AV_HAVE_INCOMPATIBLE_LIBAV_ABI
// #endif


// #define AV_PIX_FMT_Y400A AV_PIX_FMT_GRAY8A
public static final int AV_PIX_FMT_GBR24P = AV_PIX_FMT_GBRP;

// #if AV_HAVE_BIGENDIAN
// #   define AV_PIX_FMT_NE(be, le) AV_PIX_FMT_##be
// #else
// #   define AV_PIX_FMT_NE(be, le) AV_PIX_FMT_##le
// #endif

public static native @MemberGetter int AV_PIX_FMT_RGB32();
public static final int AV_PIX_FMT_RGB32 = AV_PIX_FMT_RGB32();
public static native @MemberGetter int AV_PIX_FMT_RGB32_1();
public static final int AV_PIX_FMT_RGB32_1 = AV_PIX_FMT_RGB32_1();
public static native @MemberGetter int AV_PIX_FMT_BGR32();
public static final int AV_PIX_FMT_BGR32 = AV_PIX_FMT_BGR32();
public static native @MemberGetter int AV_PIX_FMT_BGR32_1();
public static final int AV_PIX_FMT_BGR32_1 = AV_PIX_FMT_BGR32_1();
public static native @MemberGetter int AV_PIX_FMT_0RGB32();
public static final int AV_PIX_FMT_0RGB32 = AV_PIX_FMT_0RGB32();
public static native @MemberGetter int AV_PIX_FMT_0BGR32();
public static final int AV_PIX_FMT_0BGR32 = AV_PIX_FMT_0BGR32();

public static native @MemberGetter int AV_PIX_FMT_GRAY16();
public static final int AV_PIX_FMT_GRAY16 = AV_PIX_FMT_GRAY16();
public static native @MemberGetter int AV_PIX_FMT_YA16();
public static final int AV_PIX_FMT_YA16 = AV_PIX_FMT_YA16();
public static native @MemberGetter int AV_PIX_FMT_RGB48();
public static final int AV_PIX_FMT_RGB48 = AV_PIX_FMT_RGB48();
public static native @MemberGetter int AV_PIX_FMT_RGB565();
public static final int AV_PIX_FMT_RGB565 = AV_PIX_FMT_RGB565();
public static native @MemberGetter int AV_PIX_FMT_RGB555();
public static final int AV_PIX_FMT_RGB555 = AV_PIX_FMT_RGB555();
public static native @MemberGetter int AV_PIX_FMT_RGB444();
public static final int AV_PIX_FMT_RGB444 = AV_PIX_FMT_RGB444();
public static native @MemberGetter int AV_PIX_FMT_RGBA64();
public static final int AV_PIX_FMT_RGBA64 = AV_PIX_FMT_RGBA64();
public static native @MemberGetter int AV_PIX_FMT_BGR48();
public static final int AV_PIX_FMT_BGR48 = AV_PIX_FMT_BGR48();
public static native @MemberGetter int AV_PIX_FMT_BGR565();
public static final int AV_PIX_FMT_BGR565 = AV_PIX_FMT_BGR565();
public static native @MemberGetter int AV_PIX_FMT_BGR555();
public static final int AV_PIX_FMT_BGR555 = AV_PIX_FMT_BGR555();
public static native @MemberGetter int AV_PIX_FMT_BGR444();
public static final int AV_PIX_FMT_BGR444 = AV_PIX_FMT_BGR444();
public static native @MemberGetter int AV_PIX_FMT_BGRA64();
public static final int AV_PIX_FMT_BGRA64 = AV_PIX_FMT_BGRA64();

public static native @MemberGetter int AV_PIX_FMT_YUV420P9();
public static final int AV_PIX_FMT_YUV420P9 = AV_PIX_FMT_YUV420P9();
public static native @MemberGetter int AV_PIX_FMT_YUV422P9();
public static final int AV_PIX_FMT_YUV422P9 = AV_PIX_FMT_YUV422P9();
public static native @MemberGetter int AV_PIX_FMT_YUV444P9();
public static final int AV_PIX_FMT_YUV444P9 = AV_PIX_FMT_YUV444P9();
public static native @MemberGetter int AV_PIX_FMT_YUV420P10();
public static final int AV_PIX_FMT_YUV420P10 = AV_PIX_FMT_YUV420P10();
public static native @MemberGetter int AV_PIX_FMT_YUV422P10();
public static final int AV_PIX_FMT_YUV422P10 = AV_PIX_FMT_YUV422P10();
public static native @MemberGetter int AV_PIX_FMT_YUV440P10();
public static final int AV_PIX_FMT_YUV440P10 = AV_PIX_FMT_YUV440P10();
public static native @MemberGetter int AV_PIX_FMT_YUV444P10();
public static final int AV_PIX_FMT_YUV444P10 = AV_PIX_FMT_YUV444P10();
public static native @MemberGetter int AV_PIX_FMT_YUV420P12();
public static final int AV_PIX_FMT_YUV420P12 = AV_PIX_FMT_YUV420P12();
public static native @MemberGetter int AV_PIX_FMT_YUV422P12();
public static final int AV_PIX_FMT_YUV422P12 = AV_PIX_FMT_YUV422P12();
public static native @MemberGetter int AV_PIX_FMT_YUV440P12();
public static final int AV_PIX_FMT_YUV440P12 = AV_PIX_FMT_YUV440P12();
public static native @MemberGetter int AV_PIX_FMT_YUV444P12();
public static final int AV_PIX_FMT_YUV444P12 = AV_PIX_FMT_YUV444P12();
public static native @MemberGetter int AV_PIX_FMT_YUV420P14();
public static final int AV_PIX_FMT_YUV420P14 = AV_PIX_FMT_YUV420P14();
public static native @MemberGetter int AV_PIX_FMT_YUV422P14();
public static final int AV_PIX_FMT_YUV422P14 = AV_PIX_FMT_YUV422P14();
public static native @MemberGetter int AV_PIX_FMT_YUV444P14();
public static final int AV_PIX_FMT_YUV444P14 = AV_PIX_FMT_YUV444P14();
public static native @MemberGetter int AV_PIX_FMT_YUV420P16();
public static final int AV_PIX_FMT_YUV420P16 = AV_PIX_FMT_YUV420P16();
public static native @MemberGetter int AV_PIX_FMT_YUV422P16();
public static final int AV_PIX_FMT_YUV422P16 = AV_PIX_FMT_YUV422P16();
public static native @MemberGetter int AV_PIX_FMT_YUV444P16();
public static final int AV_PIX_FMT_YUV444P16 = AV_PIX_FMT_YUV444P16();

public static native @MemberGetter int AV_PIX_FMT_GBRP9();
public static final int AV_PIX_FMT_GBRP9 = AV_PIX_FMT_GBRP9();
public static native @MemberGetter int AV_PIX_FMT_GBRP10();
public static final int AV_PIX_FMT_GBRP10 = AV_PIX_FMT_GBRP10();
public static native @MemberGetter int AV_PIX_FMT_GBRP12();
public static final int AV_PIX_FMT_GBRP12 = AV_PIX_FMT_GBRP12();
public static native @MemberGetter int AV_PIX_FMT_GBRP14();
public static final int AV_PIX_FMT_GBRP14 = AV_PIX_FMT_GBRP14();
public static native @MemberGetter int AV_PIX_FMT_GBRP16();
public static final int AV_PIX_FMT_GBRP16 = AV_PIX_FMT_GBRP16();
public static native @MemberGetter int AV_PIX_FMT_GBRAP16();
public static final int AV_PIX_FMT_GBRAP16 = AV_PIX_FMT_GBRAP16();

public static native @MemberGetter int AV_PIX_FMT_BAYER_BGGR16();
public static final int AV_PIX_FMT_BAYER_BGGR16 = AV_PIX_FMT_BAYER_BGGR16();
public static native @MemberGetter int AV_PIX_FMT_BAYER_RGGB16();
public static final int AV_PIX_FMT_BAYER_RGGB16 = AV_PIX_FMT_BAYER_RGGB16();
public static native @MemberGetter int AV_PIX_FMT_BAYER_GBRG16();
public static final int AV_PIX_FMT_BAYER_GBRG16 = AV_PIX_FMT_BAYER_GBRG16();
public static native @MemberGetter int AV_PIX_FMT_BAYER_GRBG16();
public static final int AV_PIX_FMT_BAYER_GRBG16 = AV_PIX_FMT_BAYER_GRBG16();


public static native @MemberGetter int AV_PIX_FMT_YUVA420P9();
public static final int AV_PIX_FMT_YUVA420P9 = AV_PIX_FMT_YUVA420P9();
public static native @MemberGetter int AV_PIX_FMT_YUVA422P9();
public static final int AV_PIX_FMT_YUVA422P9 = AV_PIX_FMT_YUVA422P9();
public static native @MemberGetter int AV_PIX_FMT_YUVA444P9();
public static final int AV_PIX_FMT_YUVA444P9 = AV_PIX_FMT_YUVA444P9();
public static native @MemberGetter int AV_PIX_FMT_YUVA420P10();
public static final int AV_PIX_FMT_YUVA420P10 = AV_PIX_FMT_YUVA420P10();
public static native @MemberGetter int AV_PIX_FMT_YUVA422P10();
public static final int AV_PIX_FMT_YUVA422P10 = AV_PIX_FMT_YUVA422P10();
public static native @MemberGetter int AV_PIX_FMT_YUVA444P10();
public static final int AV_PIX_FMT_YUVA444P10 = AV_PIX_FMT_YUVA444P10();
public static native @MemberGetter int AV_PIX_FMT_YUVA420P16();
public static final int AV_PIX_FMT_YUVA420P16 = AV_PIX_FMT_YUVA420P16();
public static native @MemberGetter int AV_PIX_FMT_YUVA422P16();
public static final int AV_PIX_FMT_YUVA422P16 = AV_PIX_FMT_YUVA422P16();
public static native @MemberGetter int AV_PIX_FMT_YUVA444P16();
public static final int AV_PIX_FMT_YUVA444P16 = AV_PIX_FMT_YUVA444P16();

public static native @MemberGetter int AV_PIX_FMT_XYZ12();
public static final int AV_PIX_FMT_XYZ12 = AV_PIX_FMT_XYZ12();
public static native @MemberGetter int AV_PIX_FMT_NV20();
public static final int AV_PIX_FMT_NV20 = AV_PIX_FMT_NV20();
public static native @MemberGetter int AV_PIX_FMT_AYUV64();
public static final int AV_PIX_FMT_AYUV64 = AV_PIX_FMT_AYUV64();


// #if FF_API_PIX_FMT
// #define PixelFormat AVPixelFormat

public static final int PIX_FMT_Y400A = AV_PIX_FMT_Y400A;
public static final int PIX_FMT_GBR24P = AV_PIX_FMT_GBR24P;

// #define PIX_FMT_NE(be, le) AV_PIX_FMT_NE(be, le)

public static final int PIX_FMT_RGB32 =   AV_PIX_FMT_RGB32;
public static final int PIX_FMT_RGB32_1 = AV_PIX_FMT_RGB32_1;
public static final int PIX_FMT_BGR32 =   AV_PIX_FMT_BGR32;
public static final int PIX_FMT_BGR32_1 = AV_PIX_FMT_BGR32_1;
public static final int PIX_FMT_0RGB32 =  AV_PIX_FMT_0RGB32;
public static final int PIX_FMT_0BGR32 =  AV_PIX_FMT_0BGR32;

public static final int PIX_FMT_GRAY16 = AV_PIX_FMT_GRAY16;
public static final int PIX_FMT_RGB48 =  AV_PIX_FMT_RGB48;
public static final int PIX_FMT_RGB565 = AV_PIX_FMT_RGB565;
public static final int PIX_FMT_RGB555 = AV_PIX_FMT_RGB555;
public static final int PIX_FMT_RGB444 = AV_PIX_FMT_RGB444;
public static final int PIX_FMT_BGR48 =  AV_PIX_FMT_BGR48;
public static final int PIX_FMT_BGR565 = AV_PIX_FMT_BGR565;
public static final int PIX_FMT_BGR555 = AV_PIX_FMT_BGR555;
public static final int PIX_FMT_BGR444 = AV_PIX_FMT_BGR444;

public static final int PIX_FMT_YUV420P9 =  AV_PIX_FMT_YUV420P9;
public static final int PIX_FMT_YUV422P9 =  AV_PIX_FMT_YUV422P9;
public static final int PIX_FMT_YUV444P9 =  AV_PIX_FMT_YUV444P9;
public static final int PIX_FMT_YUV420P10 = AV_PIX_FMT_YUV420P10;
public static final int PIX_FMT_YUV422P10 = AV_PIX_FMT_YUV422P10;
public static final int PIX_FMT_YUV444P10 = AV_PIX_FMT_YUV444P10;
public static final int PIX_FMT_YUV420P12 = AV_PIX_FMT_YUV420P12;
public static final int PIX_FMT_YUV422P12 = AV_PIX_FMT_YUV422P12;
public static final int PIX_FMT_YUV444P12 = AV_PIX_FMT_YUV444P12;
public static final int PIX_FMT_YUV420P14 = AV_PIX_FMT_YUV420P14;
public static final int PIX_FMT_YUV422P14 = AV_PIX_FMT_YUV422P14;
public static final int PIX_FMT_YUV444P14 = AV_PIX_FMT_YUV444P14;
public static final int PIX_FMT_YUV420P16 = AV_PIX_FMT_YUV420P16;
public static final int PIX_FMT_YUV422P16 = AV_PIX_FMT_YUV422P16;
public static final int PIX_FMT_YUV444P16 = AV_PIX_FMT_YUV444P16;

public static final int PIX_FMT_RGBA64 = AV_PIX_FMT_RGBA64;
public static final int PIX_FMT_BGRA64 = AV_PIX_FMT_BGRA64;
public static final int PIX_FMT_GBRP9 =  AV_PIX_FMT_GBRP9;
public static final int PIX_FMT_GBRP10 = AV_PIX_FMT_GBRP10;
public static final int PIX_FMT_GBRP12 = AV_PIX_FMT_GBRP12;
public static final int PIX_FMT_GBRP14 = AV_PIX_FMT_GBRP14;
public static final int PIX_FMT_GBRP16 = AV_PIX_FMT_GBRP16;
// #endif

/**
  * Chromaticity coordinates of the source primaries.
  */
/** enum AVColorPrimaries */
public static final int
    AVCOL_PRI_RESERVED0   = 0,
    /** also ITU-R BT1361 / IEC 61966-2-4 / SMPTE RP177 Annex B */
    AVCOL_PRI_BT709       = 1,
    AVCOL_PRI_UNSPECIFIED = 2,
    AVCOL_PRI_RESERVED    = 3,
    /** also FCC Title 47 Code of Federal Regulations 73.682 (a)(20) */
    AVCOL_PRI_BT470M      = 4,

    /** also ITU-R BT601-6 625 / ITU-R BT1358 625 / ITU-R BT1700 625 PAL & SECAM */
    AVCOL_PRI_BT470BG     = 5,
    /** also ITU-R BT601-6 525 / ITU-R BT1358 525 / ITU-R BT1700 NTSC */
    AVCOL_PRI_SMPTE170M   = 6,
    /** functionally identical to above */
    AVCOL_PRI_SMPTE240M   = 7,
    /** colour filters using Illuminant C */
    AVCOL_PRI_FILM        = 8,
    /** ITU-R BT2020 */
    AVCOL_PRI_BT2020      = 9,
    /** Not part of ABI */
    AVCOL_PRI_NB = 10;

/**
 * Color Transfer Characteristic.
 */
/** enum AVColorTransferCharacteristic */
public static final int
    AVCOL_TRC_RESERVED0    = 0,
    /** also ITU-R BT1361 */
    AVCOL_TRC_BT709        = 1,
    AVCOL_TRC_UNSPECIFIED  = 2,
    AVCOL_TRC_RESERVED     = 3,
    /** also ITU-R BT470M / ITU-R BT1700 625 PAL & SECAM */
    AVCOL_TRC_GAMMA22      = 4,
    /** also ITU-R BT470BG */
    AVCOL_TRC_GAMMA28      = 5,
    /** also ITU-R BT601-6 525 or 625 / ITU-R BT1358 525 or 625 / ITU-R BT1700 NTSC */
    AVCOL_TRC_SMPTE170M    = 6,
    AVCOL_TRC_SMPTE240M    = 7,
    /** "Linear transfer characteristics" */
    AVCOL_TRC_LINEAR       = 8,
    /** "Logarithmic transfer characteristic (100:1 range)" */
    AVCOL_TRC_LOG          = 9,
    /** "Logarithmic transfer characteristic (100 * Sqrt(10) : 1 range)" */
    AVCOL_TRC_LOG_SQRT     = 10,
    /** IEC 61966-2-4 */
    AVCOL_TRC_IEC61966_2_4 = 11,
    /** ITU-R BT1361 Extended Colour Gamut */
    AVCOL_TRC_BT1361_ECG   = 12,
    /** IEC 61966-2-1 (sRGB or sYCC) */
    AVCOL_TRC_IEC61966_2_1 = 13,
    /** ITU-R BT2020 for 10 bit system */
    AVCOL_TRC_BT2020_10    = 14,
    /** ITU-R BT2020 for 12 bit system */
    AVCOL_TRC_BT2020_12    = 15,
    /** Not part of ABI */
    AVCOL_TRC_NB = 16;

/**
 * YUV colorspace type.
 */
/** enum AVColorSpace */
public static final int
    /** order of coefficients is actually GBR, also IEC 61966-2-1 (sRGB) */
    AVCOL_SPC_RGB         = 0,
    /** also ITU-R BT1361 / IEC 61966-2-4 xvYCC709 / SMPTE RP177 Annex B */
    AVCOL_SPC_BT709       = 1,
    AVCOL_SPC_UNSPECIFIED = 2,
    AVCOL_SPC_RESERVED    = 3,
    /** FCC Title 47 Code of Federal Regulations 73.682 (a)(20) */
    AVCOL_SPC_FCC         = 4,
    /** also ITU-R BT601-6 625 / ITU-R BT1358 625 / ITU-R BT1700 625 PAL & SECAM / IEC 61966-2-4 xvYCC601 */
    AVCOL_SPC_BT470BG     = 5,
    /** also ITU-R BT601-6 525 / ITU-R BT1358 525 / ITU-R BT1700 NTSC / functionally identical to above */
    AVCOL_SPC_SMPTE170M   = 6,
    AVCOL_SPC_SMPTE240M   = 7,
    /** Used by Dirac / VC-2 and H.264 FRext, see ITU-T SG16 */
    AVCOL_SPC_YCOCG       = 8,
    /** ITU-R BT2020 non-constant luminance system */
    AVCOL_SPC_BT2020_NCL  = 9,
    /** ITU-R BT2020 constant luminance system */
    AVCOL_SPC_BT2020_CL   = 10,
    /** Not part of ABI */
    AVCOL_SPC_NB = 11;
public static final int AVCOL_SPC_YCGCO = AVCOL_SPC_YCOCG;


/**
 * MPEG vs JPEG YUV range.
 */
/** enum AVColorRange */
public static final int
    AVCOL_RANGE_UNSPECIFIED = 0,
    /** the normal 219*2^(n-8) "MPEG" YUV ranges */
    AVCOL_RANGE_MPEG        = 1,
    /** the normal     2^n-1   "JPEG" YUV ranges */
    AVCOL_RANGE_JPEG        = 2,
    /** Not part of ABI */
    AVCOL_RANGE_NB = 3;

/**
 * Location of chroma samples.
 *
 * Illustration showing the location of the first (top left) chroma sample of the
 * image, the left shows only luma, the right
 * shows the location of the chroma sample, the 2 could be imagined to overlay
 * each other but are drawn separately due to limitations of ASCII
 *
 *                1st 2nd       1st 2nd horizontal luma sample positions
 *                 v   v         v   v
 *                 ______        ______
 *1st luma line > |X   X ...    |3 4 X ...     X are luma samples,
 *                |             |1 2           1-6 are possible chroma positions
 *2nd luma line > |X   X ...    |5 6 X ...     0 is undefined/unknown position
 */
/** enum AVChromaLocation */
public static final int
    AVCHROMA_LOC_UNSPECIFIED = 0,
    /** mpeg2/4 4:2:0, h264 default for 4:2:0 */
    AVCHROMA_LOC_LEFT        = 1,
    /** mpeg1 4:2:0, jpeg 4:2:0, h263 4:2:0 */
    AVCHROMA_LOC_CENTER      = 2,
    /** ITU-R 601, SMPTE 274M 296M S314M(DV 4:1:1), mpeg2 4:2:2 */
    AVCHROMA_LOC_TOPLEFT     = 3,
    AVCHROMA_LOC_TOP         = 4,
    AVCHROMA_LOC_BOTTOMLEFT  = 5,
    AVCHROMA_LOC_BOTTOM      = 6,
    /** Not part of ABI */
    AVCHROMA_LOC_NB = 7;

// #endif /* AVUTIL_PIXFMT_H */


// Parsed from <libavutil/frame.h>

/*
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * \ingroup lavu_frame
 * reference-counted frame API
 */

// #ifndef AVUTIL_FRAME_H
// #define AVUTIL_FRAME_H

// #include <stdint.h>

// #include "avutil.h"
// #include "buffer.h"
// #include "dict.h"
// #include "rational.h"
// #include "samplefmt.h"
// #include "pixfmt.h"
// #include "version.h"


/**
 * \defgroup lavu_frame AVFrame
 * \ingroup lavu_data
 *
 * \{
 * AVFrame is an abstraction for reference-counted raw multimedia data.
 */

/** enum AVFrameSideDataType */
public static final int
    /**
     * The data is the AVPanScan struct defined in libavcodec.
     */
    AV_FRAME_DATA_PANSCAN = 0,
    /**
     * ATSC A53 Part 4 Closed Captions.
     * A53 CC bitstream is stored as uint8_t in AVFrameSideData.data.
     * The number of bytes of CC data is AVFrameSideData.size.
     */
    AV_FRAME_DATA_A53_CC = 1,
    /**
     * Stereoscopic 3d metadata.
     * The data is the AVStereo3D struct defined in libavutil/stereo3d.h.
     */
    AV_FRAME_DATA_STEREO3D = 2,
    /**
     * The data is the AVMatrixEncoding enum defined in libavutil/channel_layout.h.
     */
    AV_FRAME_DATA_MATRIXENCODING = 3,
    /**
     * Metadata relevant to a downmix procedure.
     * The data is the AVDownmixInfo struct defined in libavutil/downmix_info.h.
     */
    AV_FRAME_DATA_DOWNMIX_INFO = 4,
    /**
     * ReplayGain information in the form of the AVReplayGain struct.
     */
    AV_FRAME_DATA_REPLAYGAIN = 5,
    /**
     * This side data contains a 3x3 transformation matrix describing an affine
     * transformation that needs to be applied to the frame for correct
     * presentation.
     *
     * See libavutil/display.h for a detailed description of the data.
     */
    AV_FRAME_DATA_DISPLAYMATRIX = 6,
    /**
     * Active Format Description data consisting of a single byte as specified
     * in ETSI TS 101 154 using AVActiveFormatDescription enum.
     */
    AV_FRAME_DATA_AFD = 7,
    /**
     * Motion vectors exported by some codecs (on demand through the export_mvs
     * flag set in the libavcodec AVCodecContext flags2 option).
     * The data is the AVMotionVector struct defined in
     * libavutil/motion_vector.h.
     */
    AV_FRAME_DATA_MOTION_VECTORS = 8,
    /**
     * Recommmends skipping the specified number of samples. This is exported
     * only if the "skip_manual" AVOption is set in libavcodec.
     * This has the same format as AV_PKT_DATA_SKIP_SAMPLES.
     * <pre>{@code
     * u32le number of samples to skip from start of this packet
     * u32le number of samples to skip from end of this packet
     * u8    reason for start skip
     * u8    reason for end   skip (0=padding silence, 1=convergence)
     * }</pre>
     */
    AV_FRAME_DATA_SKIP_SAMPLES = 9,

    /**
     * This side data must be associated with an audio frame and corresponds to
     * enum AVAudioServiceType defined in avcodec.h.
     */
    AV_FRAME_DATA_AUDIO_SERVICE_TYPE = 10;

/** enum AVActiveFormatDescription */
public static final int
    AV_AFD_SAME         = 8,
    AV_AFD_4_3          = 9,
    AV_AFD_16_9         = 10,
    AV_AFD_14_9         = 11,
    AV_AFD_4_3_SP_14_9  = 13,
    AV_AFD_16_9_SP_14_9 = 14,
    AV_AFD_SP_4_3       = 15;


/**
 * Structure to hold side data for an AVFrame.
 *
 * sizeof(AVFrameSideData) is not a part of the public ABI, so new fields may be added
 * to the end with a minor bump.
 */
public static class AVFrameSideData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFrameSideData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVFrameSideData(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFrameSideData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVFrameSideData position(int position) {
        return (AVFrameSideData)super.position(position);
    }

    public native @Cast("AVFrameSideDataType") int type(); public native AVFrameSideData type(int type);
    public native @Cast("uint8_t*") BytePointer data(); public native AVFrameSideData data(BytePointer data);
    public native int size(); public native AVFrameSideData size(int size);
    public native AVDictionary metadata(); public native AVFrameSideData metadata(AVDictionary metadata);
    public native AVBufferRef buf(); public native AVFrameSideData buf(AVBufferRef buf);
}

/**
 * This structure describes decoded (raw) audio or video data.
 *
 * AVFrame must be allocated using av_frame_alloc(). Note that this only
 * allocates the AVFrame itself, the buffers for the data must be managed
 * through other means (see below).
 * AVFrame must be freed with av_frame_free().
 *
 * AVFrame is typically allocated once and then reused multiple times to hold
 * different data (e.g. a single AVFrame to hold frames received from a
 * decoder). In such a case, av_frame_unref() will free any references held by
 * the frame and reset it to its original clean state before it
 * is reused again.
 *
 * The data described by an AVFrame is usually reference counted through the
 * AVBuffer API. The underlying buffer references are stored in AVFrame.buf /
 * AVFrame.extended_buf. An AVFrame is considered to be reference counted if at
 * least one reference is set, i.e. if AVFrame.buf[0] != NULL. In such a case,
 * every single data plane must be contained in one of the buffers in
 * AVFrame.buf or AVFrame.extended_buf.
 * There may be a single buffer for all the data, or one separate buffer for
 * each plane, or anything in between.
 *
 * sizeof(AVFrame) is not a part of the public ABI, so new fields may be added
 * to the end with a minor bump.
 * Similarly fields that are marked as to be only accessed by
 * av_opt_ptr() can be reordered. This allows 2 forks to add fields
 * without breaking compatibility with each other.
 */
public static class AVFrame extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFrame() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVFrame(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFrame(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVFrame position(int position) {
        return (AVFrame)super.position(position);
    }

public static final int AV_NUM_DATA_POINTERS = 8;
    /**
     * pointer to the picture/channel planes.
     * This might be different from the first allocated byte
     *
     * Some decoders access areas outside 0,0 - width,height, please
     * see avcodec_align_dimensions2(). Some filters and swscale can read
     * up to 16 bytes beyond the planes, if these filters are to be used,
     * then 16 extra bytes must be allocated.
     */
    public native @Cast("uint8_t*") BytePointer data(int i); public native AVFrame data(int i, BytePointer data);
    @MemberGetter public native @Cast("uint8_t**") PointerPointer data();

    /**
     * For video, size in bytes of each picture line.
     * For audio, size in bytes of each plane.
     *
     * For audio, only linesize[0] may be set. For planar audio, each channel
     * plane must be the same size.
     *
     * For video the linesizes should be multiples of the CPUs alignment
     * preference, this is 16 or 32 for modern desktop CPUs.
     * Some code requires such alignment other code can be slower without
     * correct alignment, for yet other it makes no difference.
     *
     * \note The linesize may be larger than the size of usable data -- there
     * may be extra padding present for performance reasons.
     */
    public native int linesize(int i); public native AVFrame linesize(int i, int linesize);
    @MemberGetter public native IntPointer linesize();

    /**
     * pointers to the data planes/channels.
     *
     * For video, this should simply point to data[].
     *
     * For planar audio, each channel has a separate data pointer, and
     * linesize[0] contains the size of each channel buffer.
     * For packed audio, there is just one data pointer, and linesize[0]
     * contains the total size of the buffer for all channels.
     *
     * Note: Both data and extended_data should always be set in a valid frame,
     * but for planar audio with more channels that can fit in data,
     * extended_data must be used in order to access all channels.
     */
    public native @Cast("uint8_t*") BytePointer extended_data(int i); public native AVFrame extended_data(int i, BytePointer extended_data);
    @MemberGetter public native @Cast("uint8_t**") PointerPointer extended_data();

    /**
     * width and height of the video frame
     */
    public native int width(); public native AVFrame width(int width);
    public native int height(); public native AVFrame height(int height);

    /**
     * number of audio samples (per channel) described by this frame
     */
    public native int nb_samples(); public native AVFrame nb_samples(int nb_samples);

    /**
     * format of the frame, -1 if unknown or unset
     * Values correspond to enum AVPixelFormat for video frames,
     * enum AVSampleFormat for audio)
     */
    public native int format(); public native AVFrame format(int format);

    /**
     * 1 -> keyframe, 0-> not
     */
    public native int key_frame(); public native AVFrame key_frame(int key_frame);

    /**
     * Picture type of the frame.
     */
    public native @Cast("AVPictureType") int pict_type(); public native AVFrame pict_type(int pict_type);

// #if FF_API_AVFRAME_LAVC
    public native @Cast("uint8_t*") @Deprecated BytePointer base(int i); public native AVFrame base(int i, BytePointer base);
    @MemberGetter public native @Cast("uint8_t**") @Deprecated PointerPointer base();
// #endif

    /**
     * Sample aspect ratio for the video frame, 0/1 if unknown/unspecified.
     */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVFrame sample_aspect_ratio(AVRational sample_aspect_ratio);

    /**
     * Presentation timestamp in time_base units (time when frame should be shown to user).
     */
    public native long pts(); public native AVFrame pts(long pts);

    /**
     * PTS copied from the AVPacket that was decoded to produce this frame.
     */
    public native long pkt_pts(); public native AVFrame pkt_pts(long pkt_pts);

    /**
     * DTS copied from the AVPacket that triggered returning this frame. (if frame threading isn't used)
     * This is also the Presentation time of this AVFrame calculated from
     * only AVPacket.dts values without pts values.
     */
    public native long pkt_dts(); public native AVFrame pkt_dts(long pkt_dts);

    /**
     * picture number in bitstream order
     */
    public native int coded_picture_number(); public native AVFrame coded_picture_number(int coded_picture_number);
    /**
     * picture number in display order
     */
    public native int display_picture_number(); public native AVFrame display_picture_number(int display_picture_number);

    /**
     * quality (between 1 (good) and FF_LAMBDA_MAX (bad))
     */
    public native int quality(); public native AVFrame quality(int quality);

// #if FF_API_AVFRAME_LAVC
    public native @Deprecated int reference(); public native AVFrame reference(int reference);

    /**
     * QP table
     */
    public native @Deprecated BytePointer qscale_table(); public native AVFrame qscale_table(BytePointer qscale_table);
    /**
     * QP store stride
     */
    public native @Deprecated int qstride(); public native AVFrame qstride(int qstride);

    public native @Deprecated int qscale_type(); public native AVFrame qscale_type(int qscale_type);

    /**
     * mbskip_table[mb]>=1 if MB didn't change
     * stride= mb_width = (width+15)>>4
     */
    public native @Cast("uint8_t*") @Deprecated BytePointer mbskip_table(); public native AVFrame mbskip_table(BytePointer mbskip_table);

    /**
     * motion vector table
     * <pre>{@code
     * example:
     * int mv_sample_log2= 4 - motion_subsample_log2;
     * int mb_width= (width+15)>>4;
     * int mv_stride= (mb_width << mv_sample_log2) + 1;
     * motion_val[direction][x + y*mv_stride][0->mv_x, 1->mv_y];
     * }</pre>
     */
    public native short motion_val(int i, int j, int k); public native AVFrame motion_val(int i, int j, int k, short motion_val);
    @MemberGetter public native @Cast("int16_t(*)[2]") ShortPointer motion_val();

    /**
     * macroblock type table
     * mb_type_base + mb_width + 2
     */
    public native @Cast("uint32_t*") @Deprecated IntPointer mb_type(); public native AVFrame mb_type(IntPointer mb_type);

    /**
     * DCT coefficients
     */
    public native @Deprecated ShortPointer dct_coeff(); public native AVFrame dct_coeff(ShortPointer dct_coeff);

    /**
     * motion reference frame index
     * the order in which these are stored can depend on the codec.
     */
    public native @Deprecated BytePointer ref_index(int i); public native AVFrame ref_index(int i, BytePointer ref_index);
    @MemberGetter public native @Cast("int8_t**") @Deprecated PointerPointer ref_index();
// #endif

    /**
     * for some private data of the user
     */
    public native Pointer opaque(); public native AVFrame opaque(Pointer opaque);

    /**
     * error
     */
    public native @Cast("uint64_t") long error(int i); public native AVFrame error(int i, long error);
    @MemberGetter public native @Cast("uint64_t*") LongPointer error();

// #if FF_API_AVFRAME_LAVC
    public native @Deprecated int type(); public native AVFrame type(int type);
// #endif

    /**
     * When decoding, this signals how much the picture must be delayed.
     * extra_delay = repeat_pict / (2*fps)
     */
    public native int repeat_pict(); public native AVFrame repeat_pict(int repeat_pict);

    /**
     * The content of the picture is interlaced.
     */
    public native int interlaced_frame(); public native AVFrame interlaced_frame(int interlaced_frame);

    /**
     * If the content is interlaced, is top field displayed first.
     */
    public native int top_field_first(); public native AVFrame top_field_first(int top_field_first);

    /**
     * Tell user application that palette has changed from previous frame.
     */
    public native int palette_has_changed(); public native AVFrame palette_has_changed(int palette_has_changed);

// #if FF_API_AVFRAME_LAVC
    public native @Deprecated int buffer_hints(); public native AVFrame buffer_hints(int buffer_hints);

    /**
     * Pan scan.
     */
    public native @Cast("AVPanScan*") @Deprecated Pointer pan_scan(); public native AVFrame pan_scan(Pointer pan_scan);
// #endif

    /**
     * reordered opaque 64bit (generally an integer or a double precision float
     * PTS but can be anything).
     * The user sets AVCodecContext.reordered_opaque to represent the input at
     * that time,
     * the decoder reorders values as needed and sets AVFrame.reordered_opaque
     * to exactly one of the values provided by the user through AVCodecContext.reordered_opaque
     * @deprecated in favor of pkt_pts
     */
    public native long reordered_opaque(); public native AVFrame reordered_opaque(long reordered_opaque);

// #if FF_API_AVFRAME_LAVC
    /**
     * @deprecated this field is unused
     */
    public native @Deprecated Pointer hwaccel_picture_private(); public native AVFrame hwaccel_picture_private(Pointer hwaccel_picture_private);

    public native @Cast("AVCodecContext*") @Deprecated Pointer owner(); public native AVFrame owner(Pointer owner);
    public native @Deprecated Pointer thread_opaque(); public native AVFrame thread_opaque(Pointer thread_opaque);

    /**
     * log2 of the size of the block which a single vector in motion_val represents:
     * (4->16x16, 3->8x8, 2-> 4x4, 1-> 2x2)
     */
    public native @Cast("uint8_t") byte motion_subsample_log2(); public native AVFrame motion_subsample_log2(byte motion_subsample_log2);
// #endif

    /**
     * Sample rate of the audio data.
     */
    public native int sample_rate(); public native AVFrame sample_rate(int sample_rate);

    /**
     * Channel layout of the audio data.
     */
    public native @Cast("uint64_t") long channel_layout(); public native AVFrame channel_layout(long channel_layout);

    /**
     * AVBuffer references backing the data for this frame. If all elements of
     * this array are NULL, then this frame is not reference counted. This array
     * must be filled contiguously -- if buf[i] is non-NULL then buf[j] must
     * also be non-NULL for all j < i.
     *
     * There may be at most one AVBuffer per data plane, so for video this array
     * always contains all the references. For planar audio with more than
     * AV_NUM_DATA_POINTERS channels, there may be more buffers than can fit in
     * this array. Then the extra AVBufferRef pointers are stored in the
     * extended_buf array.
     */
    public native AVBufferRef buf(int i); public native AVFrame buf(int i, AVBufferRef buf);
    @MemberGetter public native @Cast("AVBufferRef**") PointerPointer buf();

    /**
     * For planar audio which requires more than AV_NUM_DATA_POINTERS
     * AVBufferRef pointers, this array will hold all the references which
     * cannot fit into AVFrame.buf.
     *
     * Note that this is different from AVFrame.extended_data, which always
     * contains all the pointers. This array only contains the extra pointers,
     * which cannot fit into AVFrame.buf.
     *
     * This array is always allocated using av_malloc() by whoever constructs
     * the frame. It is freed in av_frame_unref().
     */
    public native AVBufferRef extended_buf(int i); public native AVFrame extended_buf(int i, AVBufferRef extended_buf);
    @MemberGetter public native @Cast("AVBufferRef**") PointerPointer extended_buf();
    /**
     * Number of elements in extended_buf.
     */
    public native int nb_extended_buf(); public native AVFrame nb_extended_buf(int nb_extended_buf);

    public native AVFrameSideData side_data(int i); public native AVFrame side_data(int i, AVFrameSideData side_data);
    @MemberGetter public native @Cast("AVFrameSideData**") PointerPointer side_data();
    public native int nb_side_data(); public native AVFrame nb_side_data(int nb_side_data);

/**
 * \defgroup lavu_frame_flags AV_FRAME_FLAGS
 * Flags describing additional frame properties.
 *
 * \{
 */

/**
 * The frame data may be corrupted, e.g. due to decoding errors.
 */
public static final int AV_FRAME_FLAG_CORRUPT =       (1 << 0);
/**
 * \}
 */

    /**
     * Frame flags, a combination of \ref lavu_frame_flags
     */
    public native int flags(); public native AVFrame flags(int flags);

    /**
     * MPEG vs JPEG YUV range.
     * It must be accessed using av_frame_get_color_range() and
     * av_frame_set_color_range().
     * - encoding: Set by user
     * - decoding: Set by libavcodec
     */
    public native @Cast("AVColorRange") int color_range(); public native AVFrame color_range(int color_range);

    public native @Cast("AVColorPrimaries") int color_primaries(); public native AVFrame color_primaries(int color_primaries);

    public native @Cast("AVColorTransferCharacteristic") int color_trc(); public native AVFrame color_trc(int color_trc);

    /**
     * YUV colorspace type.
     * It must be accessed using av_frame_get_colorspace() and
     * av_frame_set_colorspace().
     * - encoding: Set by user
     * - decoding: Set by libavcodec
     */
    public native @Cast("AVColorSpace") int colorspace(); public native AVFrame colorspace(int colorspace);

    public native @Cast("AVChromaLocation") int chroma_location(); public native AVFrame chroma_location(int chroma_location);

    /**
     * frame timestamp estimated using various heuristics, in stream time base
     * Code outside libavutil should access this field using:
     * av_frame_get_best_effort_timestamp(frame)
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native long best_effort_timestamp(); public native AVFrame best_effort_timestamp(long best_effort_timestamp);

    /**
     * reordered pos from the last AVPacket that has been input into the decoder
     * Code outside libavutil should access this field using:
     * av_frame_get_pkt_pos(frame)
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native long pkt_pos(); public native AVFrame pkt_pos(long pkt_pos);

    /**
     * duration of the corresponding packet, expressed in
     * AVStream->time_base units, 0 if unknown.
     * Code outside libavutil should access this field using:
     * av_frame_get_pkt_duration(frame)
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native long pkt_duration(); public native AVFrame pkt_duration(long pkt_duration);

    /**
     * metadata.
     * Code outside libavutil should access this field using:
     * av_frame_get_metadata(frame)
     * - encoding: Set by user.
     * - decoding: Set by libavcodec.
     */
    public native AVDictionary metadata(); public native AVFrame metadata(AVDictionary metadata);

    /**
     * decode error flags of the frame, set to a combination of
     * FF_DECODE_ERROR_xxx flags if the decoder produced a frame, but there
     * were errors during the decoding.
     * Code outside libavutil should access this field using:
     * av_frame_get_decode_error_flags(frame)
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native int decode_error_flags(); public native AVFrame decode_error_flags(int decode_error_flags);
public static final int FF_DECODE_ERROR_INVALID_BITSTREAM =   1;
public static final int FF_DECODE_ERROR_MISSING_REFERENCE =   2;

    /**
     * number of audio channels, only used for audio.
     * Code outside libavutil should access this field using:
     * av_frame_get_channels(frame)
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native int channels(); public native AVFrame channels(int channels);

    /**
     * size of the corresponding packet containing the compressed
     * frame. It must be accessed using av_frame_get_pkt_size() and
     * av_frame_set_pkt_size().
     * It is set to a negative value if unknown.
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native int pkt_size(); public native AVFrame pkt_size(int pkt_size);

    /**
     * Not to be accessed directly from outside libavutil
     */
    public native AVBufferRef qp_table_buf(); public native AVFrame qp_table_buf(AVBufferRef qp_table_buf);
}

/**
 * Accessors for some AVFrame fields.
 * The position of these field in the structure is not part of the ABI,
 * they should not be accessed directly outside libavutil.
 */
public static native long av_frame_get_best_effort_timestamp(@Const AVFrame frame);
public static native void av_frame_set_best_effort_timestamp(AVFrame frame, long val);
public static native long av_frame_get_pkt_duration(@Const AVFrame frame);
public static native void av_frame_set_pkt_duration(AVFrame frame, long val);
public static native long av_frame_get_pkt_pos(@Const AVFrame frame);
public static native void av_frame_set_pkt_pos(AVFrame frame, long val);
public static native long av_frame_get_channel_layout(@Const AVFrame frame);
public static native void av_frame_set_channel_layout(AVFrame frame, long val);
public static native int av_frame_get_channels(@Const AVFrame frame);
public static native void av_frame_set_channels(AVFrame frame, int val);
public static native int av_frame_get_sample_rate(@Const AVFrame frame);
public static native void av_frame_set_sample_rate(AVFrame frame, int val);
public static native AVDictionary av_frame_get_metadata(@Const AVFrame frame);
public static native void av_frame_set_metadata(AVFrame frame, AVDictionary val);
public static native int av_frame_get_decode_error_flags(@Const AVFrame frame);
public static native void av_frame_set_decode_error_flags(AVFrame frame, int val);
public static native int av_frame_get_pkt_size(@Const AVFrame frame);
public static native void av_frame_set_pkt_size(AVFrame frame, int val);
public static native @Cast("AVDictionary**") PointerPointer avpriv_frame_get_metadatap(AVFrame frame);
public static native BytePointer av_frame_get_qp_table(AVFrame f, IntPointer stride, IntPointer type);
public static native ByteBuffer av_frame_get_qp_table(AVFrame f, IntBuffer stride, IntBuffer type);
public static native byte[] av_frame_get_qp_table(AVFrame f, int[] stride, int[] type);
public static native int av_frame_set_qp_table(AVFrame f, AVBufferRef buf, int stride, int type);
public static native @Cast("AVColorSpace") int av_frame_get_colorspace(@Const AVFrame frame);
public static native void av_frame_set_colorspace(AVFrame frame, @Cast("AVColorSpace") int val);
public static native @Cast("AVColorRange") int av_frame_get_color_range(@Const AVFrame frame);
public static native void av_frame_set_color_range(AVFrame frame, @Cast("AVColorRange") int val);

/**
 * Get the name of a colorspace.
 * @return a static string identifying the colorspace; can be NULL.
 */
public static native @Cast("const char*") BytePointer av_get_colorspace_name(@Cast("AVColorSpace") int val);

/**
 * Allocate an AVFrame and set its fields to default values.  The resulting
 * struct must be freed using av_frame_free().
 *
 * @return An AVFrame filled with default values or NULL on failure.
 *
 * \note this only allocates the AVFrame itself, not the data buffers. Those
 * must be allocated through other means, e.g. with av_frame_get_buffer() or
 * manually.
 */
public static native AVFrame av_frame_alloc();

/**
 * Free the frame and any dynamically allocated objects in it,
 * e.g. extended_data. If the frame is reference counted, it will be
 * unreferenced first.
 *
 * @param frame frame to be freed. The pointer will be set to NULL.
 */
public static native void av_frame_free(@Cast("AVFrame**") PointerPointer frame);
public static native void av_frame_free(@ByPtrPtr AVFrame frame);

/**
 * Set up a new reference to the data described by the source frame.
 *
 * Copy frame properties from src to dst and create a new reference for each
 * AVBufferRef from src.
 *
 * If src is not reference counted, new buffers are allocated and the data is
 * copied.
 *
 * @return 0 on success, a negative AVERROR on error
 */
public static native int av_frame_ref(AVFrame dst, @Const AVFrame src);

/**
 * Create a new frame that references the same data as src.
 *
 * This is a shortcut for av_frame_alloc()+av_frame_ref().
 *
 * @return newly created AVFrame on success, NULL on error.
 */
public static native AVFrame av_frame_clone(@Const AVFrame src);

/**
 * Unreference all the buffers referenced by frame and reset the frame fields.
 */
public static native void av_frame_unref(AVFrame frame);

/**
 * Move everything contained in src to dst and reset src.
 */
public static native void av_frame_move_ref(AVFrame dst, AVFrame src);

/**
 * Allocate new buffer(s) for audio or video data.
 *
 * The following fields must be set on frame before calling this function:
 * - format (pixel format for video, sample format for audio)
 * - width and height for video
 * - nb_samples and channel_layout for audio
 *
 * This function will fill AVFrame.data and AVFrame.buf arrays and, if
 * necessary, allocate and fill AVFrame.extended_data and AVFrame.extended_buf.
 * For planar formats, one buffer will be allocated for each plane.
 *
 * @param frame frame in which to store the new buffers.
 * @param align required buffer size alignment
 *
 * @return 0 on success, a negative AVERROR on error.
 */
public static native int av_frame_get_buffer(AVFrame frame, int align);

/**
 * Check if the frame data is writable.
 *
 * @return A positive value if the frame data is writable (which is true if and
 * only if each of the underlying buffers has only one reference, namely the one
 * stored in this frame). Return 0 otherwise.
 *
 * If 1 is returned the answer is valid until av_buffer_ref() is called on any
 * of the underlying AVBufferRefs (e.g. through av_frame_ref() or directly).
 *
 * @see av_frame_make_writable(), av_buffer_is_writable()
 */
public static native int av_frame_is_writable(AVFrame frame);

/**
 * Ensure that the frame data is writable, avoiding data copy if possible.
 *
 * Do nothing if the frame is writable, allocate new buffers and copy the data
 * if it is not.
 *
 * @return 0 on success, a negative AVERROR on error.
 *
 * @see av_frame_is_writable(), av_buffer_is_writable(),
 * av_buffer_make_writable()
 */
public static native int av_frame_make_writable(AVFrame frame);

/**
 * Copy the frame data from src to dst.
 *
 * This function does not allocate anything, dst must be already initialized and
 * allocated with the same parameters as src.
 *
 * This function only copies the frame data (i.e. the contents of the data /
 * extended data arrays), not any other properties.
 *
 * @return >= 0 on success, a negative AVERROR on error.
 */
public static native int av_frame_copy(AVFrame dst, @Const AVFrame src);

/**
 * Copy only "metadata" fields from src to dst.
 *
 * Metadata for the purpose of this function are those fields that do not affect
 * the data layout in the buffers.  E.g. pts, sample rate (for audio) or sample
 * aspect ratio (for video), but not width/height or channel layout.
 * Side data is also copied.
 */
public static native int av_frame_copy_props(AVFrame dst, @Const AVFrame src);

/**
 * Get the buffer reference a given data plane is stored in.
 *
 * @param plane index of the data plane of interest in frame->extended_data.
 *
 * @return the buffer reference that contains the plane or NULL if the input
 * frame is not valid.
 */
public static native AVBufferRef av_frame_get_plane_buffer(AVFrame frame, int plane);

/**
 * Add a new side data to a frame.
 *
 * @param frame a frame to which the side data should be added
 * @param type type of the added side data
 * @param size size of the side data
 *
 * @return newly added side data on success, NULL on error
 */
public static native AVFrameSideData av_frame_new_side_data(AVFrame frame,
                                        @Cast("AVFrameSideDataType") int type,
                                        int size);

/**
 * @return a pointer to the side data of a given type on success, NULL if there
 * is no side data with such type in this frame.
 */
public static native AVFrameSideData av_frame_get_side_data(@Const AVFrame frame,
                                        @Cast("AVFrameSideDataType") int type);

/**
 * If side data of the supplied type exists in the frame, free it and remove it
 * from the frame.
 */
public static native void av_frame_remove_side_data(AVFrame frame, @Cast("AVFrameSideDataType") int type);

/**
 * @return a string identifying the side data type
 */
public static native @Cast("const char*") BytePointer av_frame_side_data_name(@Cast("AVFrameSideDataType") int type);

/**
 * \}
 */

// #endif /* AVUTIL_FRAME_H */


// Parsed from <libavutil/samplefmt.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_SAMPLEFMT_H
// #define AVUTIL_SAMPLEFMT_H

// #include <stdint.h>

// #include "avutil.h"
// #include "attributes.h"

/**
 * \addtogroup lavu_audio
 * \{
 *
 * \defgroup lavu_sampfmts Audio sample formats
 *
 * Audio sample format enumeration and related convenience functions.
 * \{
 *
 */

/**
 * Audio sample formats
 *
 * - The data described by the sample format is always in native-endian order.
 *   Sample values can be expressed by native C types, hence the lack of a signed
 *   24-bit sample format even though it is a common raw audio data format.
 *
 * - The floating-point formats are based on full volume being in the range
 *   [-1.0, 1.0]. Any values outside this range are beyond full volume level.
 *
 * - The data layout as used in av_samples_fill_arrays() and elsewhere in FFmpeg
 *   (such as AVFrame in libavcodec) is as follows:
 *
 * \par
 * For planar sample formats, each audio channel is in a separate data plane,
 * and linesize is the buffer size, in bytes, for a single plane. All data
 * planes must be the same size. For packed sample formats, only the first data
 * plane is used, and samples for each channel are interleaved. In this case,
 * linesize is the buffer size, in bytes, for the 1 plane.
 *
 */
/** enum AVSampleFormat */
public static final int
    AV_SAMPLE_FMT_NONE = -1,
    /** unsigned 8 bits */
    AV_SAMPLE_FMT_U8 = 0,
    /** signed 16 bits */
    AV_SAMPLE_FMT_S16 = 1,
    /** signed 32 bits */
    AV_SAMPLE_FMT_S32 = 2,
    /** float */
    AV_SAMPLE_FMT_FLT = 3,
    /** double */
    AV_SAMPLE_FMT_DBL = 4,

    /** unsigned 8 bits, planar */
    AV_SAMPLE_FMT_U8P = 5,
    /** signed 16 bits, planar */
    AV_SAMPLE_FMT_S16P = 6,
    /** signed 32 bits, planar */
    AV_SAMPLE_FMT_S32P = 7,
    /** float, planar */
    AV_SAMPLE_FMT_FLTP = 8,
    /** double, planar */
    AV_SAMPLE_FMT_DBLP = 9,

    /** Number of sample formats. DO NOT USE if linking dynamically */
    AV_SAMPLE_FMT_NB = 10;

/**
 * Return the name of sample_fmt, or NULL if sample_fmt is not
 * recognized.
 */
public static native @Cast("const char*") BytePointer av_get_sample_fmt_name(@Cast("AVSampleFormat") int sample_fmt);

/**
 * Return a sample format corresponding to name, or AV_SAMPLE_FMT_NONE
 * on error.
 */
public static native @Cast("AVSampleFormat") int av_get_sample_fmt(@Cast("const char*") BytePointer name);
public static native @Cast("AVSampleFormat") int av_get_sample_fmt(String name);

/**
 * Return the planar<->packed alternative form of the given sample format, or
 * AV_SAMPLE_FMT_NONE on error. If the passed sample_fmt is already in the
 * requested planar/packed format, the format returned is the same as the
 * input.
 */
public static native @Cast("AVSampleFormat") int av_get_alt_sample_fmt(@Cast("AVSampleFormat") int sample_fmt, int planar);

/**
 * Get the packed alternative form of the given sample format.
 *
 * If the passed sample_fmt is already in packed format, the format returned is
 * the same as the input.
 *
 * @return  the packed alternative form of the given sample format or
            AV_SAMPLE_FMT_NONE on error.
 */
public static native @Cast("AVSampleFormat") int av_get_packed_sample_fmt(@Cast("AVSampleFormat") int sample_fmt);

/**
 * Get the planar alternative form of the given sample format.
 *
 * If the passed sample_fmt is already in planar format, the format returned is
 * the same as the input.
 *
 * @return  the planar alternative form of the given sample format or
            AV_SAMPLE_FMT_NONE on error.
 */
public static native @Cast("AVSampleFormat") int av_get_planar_sample_fmt(@Cast("AVSampleFormat") int sample_fmt);

/**
 * Generate a string corresponding to the sample format with
 * sample_fmt, or a header if sample_fmt is negative.
 *
 * @param buf the buffer where to write the string
 * @param buf_size the size of buf
 * @param sample_fmt the number of the sample format to print the
 * corresponding info string, or a negative value to print the
 * corresponding header.
 * @return the pointer to the filled buffer or NULL if sample_fmt is
 * unknown or in case of other errors
 */
public static native @Cast("char*") BytePointer av_get_sample_fmt_string(@Cast("char*") BytePointer buf, int buf_size, @Cast("AVSampleFormat") int sample_fmt);
public static native @Cast("char*") ByteBuffer av_get_sample_fmt_string(@Cast("char*") ByteBuffer buf, int buf_size, @Cast("AVSampleFormat") int sample_fmt);
public static native @Cast("char*") byte[] av_get_sample_fmt_string(@Cast("char*") byte[] buf, int buf_size, @Cast("AVSampleFormat") int sample_fmt);

/**
 * Return number of bytes per sample.
 *
 * @param sample_fmt the sample format
 * @return number of bytes per sample or zero if unknown for the given
 * sample format
 */
public static native int av_get_bytes_per_sample(@Cast("AVSampleFormat") int sample_fmt);

/**
 * Check if the sample format is planar.
 *
 * @param sample_fmt the sample format to inspect
 * @return 1 if the sample format is planar, 0 if it is interleaved
 */
public static native int av_sample_fmt_is_planar(@Cast("AVSampleFormat") int sample_fmt);

/**
 * Get the required buffer size for the given audio parameters.
 *
 * @param [out] linesize calculated linesize, may be NULL
 * @param nb_channels   the number of channels
 * @param nb_samples    the number of samples in a single channel
 * @param sample_fmt    the sample format
 * @param align         buffer size alignment (0 = default, 1 = no alignment)
 * @return              required buffer size, or negative error code on failure
 */
public static native int av_samples_get_buffer_size(IntPointer linesize, int nb_channels, int nb_samples,
                               @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_get_buffer_size(IntBuffer linesize, int nb_channels, int nb_samples,
                               @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_get_buffer_size(int[] linesize, int nb_channels, int nb_samples,
                               @Cast("AVSampleFormat") int sample_fmt, int align);

/**
 * \}
 *
 * \defgroup lavu_sampmanip Samples manipulation
 *
 * Functions that manipulate audio samples
 * \{
 */

/**
 * Fill plane data pointers and linesize for samples with sample
 * format sample_fmt.
 *
 * The audio_data array is filled with the pointers to the samples data planes:
 * for planar, set the start point of each channel's data within the buffer,
 * for packed, set the start point of the entire buffer only.
 *
 * The value pointed to by linesize is set to the aligned size of each
 * channel's data buffer for planar layout, or to the aligned size of the
 * buffer for all channels for packed layout.
 *
 * The buffer in buf must be big enough to contain all the samples
 * (use av_samples_get_buffer_size() to compute its minimum size),
 * otherwise the audio_data pointers will point to invalid data.
 *
 * @see enum AVSampleFormat
 * The documentation for AVSampleFormat describes the data layout.
 *
 * @param [out] audio_data  array to be filled with the pointer for each channel
 * @param [out] linesize    calculated linesize, may be NULL
 * @param buf              the pointer to a buffer containing the samples
 * @param nb_channels      the number of channels
 * @param nb_samples       the number of samples in a single channel
 * @param sample_fmt       the sample format
 * @param align            buffer size alignment (0 = default, 1 = no alignment)
 * @return                 >=0 on success or a negative error code on failure
 * \todo return minimum size in bytes required for the buffer in case
 * of success at the next bump
 */
public static native int av_samples_fill_arrays(@Cast("uint8_t**") PointerPointer audio_data, IntPointer linesize,
                           @Cast("const uint8_t*") BytePointer buf,
                           int nb_channels, int nb_samples,
                           @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_fill_arrays(@Cast("uint8_t**") @ByPtrPtr BytePointer audio_data, IntPointer linesize,
                           @Cast("const uint8_t*") BytePointer buf,
                           int nb_channels, int nb_samples,
                           @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_fill_arrays(@Cast("uint8_t**") @ByPtrPtr ByteBuffer audio_data, IntBuffer linesize,
                           @Cast("const uint8_t*") ByteBuffer buf,
                           int nb_channels, int nb_samples,
                           @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_fill_arrays(@Cast("uint8_t**") @ByPtrPtr byte[] audio_data, int[] linesize,
                           @Cast("const uint8_t*") byte[] buf,
                           int nb_channels, int nb_samples,
                           @Cast("AVSampleFormat") int sample_fmt, int align);

/**
 * Allocate a samples buffer for nb_samples samples, and fill data pointers and
 * linesize accordingly.
 * The allocated samples buffer can be freed by using av_freep(&audio_data[0])
 * Allocated data will be initialized to silence.
 *
 * @see enum AVSampleFormat
 * The documentation for AVSampleFormat describes the data layout.
 *
 * @param [out] audio_data  array to be filled with the pointer for each channel
 * @param [out] linesize    aligned size for audio buffer(s), may be NULL
 * @param nb_channels      number of audio channels
 * @param nb_samples       number of samples per channel
 * @param align            buffer size alignment (0 = default, 1 = no alignment)
 * @return                 >=0 on success or a negative error code on failure
 * \todo return the size of the allocated buffer in case of success at the next bump
 * @see av_samples_fill_arrays()
 * @see av_samples_alloc_array_and_samples()
 */
public static native int av_samples_alloc(@Cast("uint8_t**") PointerPointer audio_data, IntPointer linesize, int nb_channels,
                     int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_alloc(@Cast("uint8_t**") @ByPtrPtr BytePointer audio_data, IntPointer linesize, int nb_channels,
                     int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_alloc(@Cast("uint8_t**") @ByPtrPtr ByteBuffer audio_data, IntBuffer linesize, int nb_channels,
                     int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_alloc(@Cast("uint8_t**") @ByPtrPtr byte[] audio_data, int[] linesize, int nb_channels,
                     int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);

/**
 * Allocate a data pointers array, samples buffer for nb_samples
 * samples, and fill data pointers and linesize accordingly.
 *
 * This is the same as av_samples_alloc(), but also allocates the data
 * pointers array.
 *
 * @see av_samples_alloc()
 */
public static native int av_samples_alloc_array_and_samples(@Cast("uint8_t***") PointerPointer audio_data, IntPointer linesize, int nb_channels,
                                       int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_alloc_array_and_samples(@Cast("uint8_t***") PointerPointer audio_data, IntBuffer linesize, int nb_channels,
                                       int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);
public static native int av_samples_alloc_array_and_samples(@Cast("uint8_t***") PointerPointer audio_data, int[] linesize, int nb_channels,
                                       int nb_samples, @Cast("AVSampleFormat") int sample_fmt, int align);

/**
 * Copy samples from src to dst.
 *
 * @param dst destination array of pointers to data planes
 * @param src source array of pointers to data planes
 * @param dst_offset offset in samples at which the data will be written to dst
 * @param src_offset offset in samples at which the data will be read from src
 * @param nb_samples number of samples to be copied
 * @param nb_channels number of audio channels
 * @param sample_fmt audio sample format
 */
public static native int av_samples_copy(@Cast("uint8_t**") PointerPointer dst, @Cast("uint8_t*const*") PointerPointer src, int dst_offset,
                    int src_offset, int nb_samples, int nb_channels,
                    @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_copy(@Cast("uint8_t**") @ByPtrPtr BytePointer dst, @Cast("uint8_t*const*") @ByPtrPtr BytePointer src, int dst_offset,
                    int src_offset, int nb_samples, int nb_channels,
                    @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_copy(@Cast("uint8_t**") @ByPtrPtr ByteBuffer dst, @Cast("uint8_t*const*") @ByPtrPtr ByteBuffer src, int dst_offset,
                    int src_offset, int nb_samples, int nb_channels,
                    @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_copy(@Cast("uint8_t**") @ByPtrPtr byte[] dst, @Cast("uint8_t*const*") @ByPtrPtr byte[] src, int dst_offset,
                    int src_offset, int nb_samples, int nb_channels,
                    @Cast("AVSampleFormat") int sample_fmt);

/**
 * Fill an audio buffer with silence.
 *
 * @param audio_data  array of pointers to data planes
 * @param offset      offset in samples at which to start filling
 * @param nb_samples  number of samples to fill
 * @param nb_channels number of audio channels
 * @param sample_fmt  audio sample format
 */
public static native int av_samples_set_silence(@Cast("uint8_t**") PointerPointer audio_data, int offset, int nb_samples,
                           int nb_channels, @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_set_silence(@Cast("uint8_t**") @ByPtrPtr BytePointer audio_data, int offset, int nb_samples,
                           int nb_channels, @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_set_silence(@Cast("uint8_t**") @ByPtrPtr ByteBuffer audio_data, int offset, int nb_samples,
                           int nb_channels, @Cast("AVSampleFormat") int sample_fmt);
public static native int av_samples_set_silence(@Cast("uint8_t**") @ByPtrPtr byte[] audio_data, int offset, int nb_samples,
                           int nb_channels, @Cast("AVSampleFormat") int sample_fmt);

/**
 * \}
 * \}
 */
// #endif /* AVUTIL_SAMPLEFMT_H */


// Parsed from <libavutil/channel_layout.h>

/*
 * Copyright (c) 2006 Michael Niedermayer <michaelni@gmx.at>
 * Copyright (c) 2008 Peter Ross
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_CHANNEL_LAYOUT_H
// #define AVUTIL_CHANNEL_LAYOUT_H

// #include <stdint.h>

/**
 * \file
 * audio channel layout utility functions
 */

/**
 * \addtogroup lavu_audio
 * \{
 */

/**
 * \defgroup channel_masks Audio channel masks
 *
 * A channel layout is a 64-bits integer with a bit set for every channel.
 * The number of bits set must be equal to the number of channels.
 * The value 0 means that the channel layout is not known.
 * \note this data structure is not powerful enough to handle channels
 * combinations that have the same channel multiple times, such as
 * dual-mono.
 *
 * \{
 */
public static final int AV_CH_FRONT_LEFT =             0x00000001;
public static final int AV_CH_FRONT_RIGHT =            0x00000002;
public static final int AV_CH_FRONT_CENTER =           0x00000004;
public static final int AV_CH_LOW_FREQUENCY =          0x00000008;
public static final int AV_CH_BACK_LEFT =              0x00000010;
public static final int AV_CH_BACK_RIGHT =             0x00000020;
public static final int AV_CH_FRONT_LEFT_OF_CENTER =   0x00000040;
public static final int AV_CH_FRONT_RIGHT_OF_CENTER =  0x00000080;
public static final int AV_CH_BACK_CENTER =            0x00000100;
public static final int AV_CH_SIDE_LEFT =              0x00000200;
public static final int AV_CH_SIDE_RIGHT =             0x00000400;
public static final int AV_CH_TOP_CENTER =             0x00000800;
public static final int AV_CH_TOP_FRONT_LEFT =         0x00001000;
public static final int AV_CH_TOP_FRONT_CENTER =       0x00002000;
public static final int AV_CH_TOP_FRONT_RIGHT =        0x00004000;
public static final int AV_CH_TOP_BACK_LEFT =          0x00008000;
public static final int AV_CH_TOP_BACK_CENTER =        0x00010000;
public static final int AV_CH_TOP_BACK_RIGHT =         0x00020000;
/** Stereo downmix. */
public static final int AV_CH_STEREO_LEFT =            0x20000000;
/** See AV_CH_STEREO_LEFT. */
public static final int AV_CH_STEREO_RIGHT =           0x40000000;
public static final long AV_CH_WIDE_LEFT =              0x0000000080000000L;
public static final long AV_CH_WIDE_RIGHT =             0x0000000100000000L;
public static final long AV_CH_SURROUND_DIRECT_LEFT =   0x0000000200000000L;
public static final long AV_CH_SURROUND_DIRECT_RIGHT =  0x0000000400000000L;
public static final long AV_CH_LOW_FREQUENCY_2 =        0x0000000800000000L;

/** Channel mask value used for AVCodecContext.request_channel_layout
    to indicate that the user requests the channel order of the decoder output
    to be the native codec channel order. */
public static final long AV_CH_LAYOUT_NATIVE =          0x8000000000000000L;

/**
 * \}
 * \defgroup channel_mask_c Audio channel layouts
 * \{
 * */
public static final int AV_CH_LAYOUT_MONO =              (AV_CH_FRONT_CENTER);
public static final int AV_CH_LAYOUT_STEREO =            (AV_CH_FRONT_LEFT|AV_CH_FRONT_RIGHT);
public static final int AV_CH_LAYOUT_2POINT1 =           (AV_CH_LAYOUT_STEREO|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_2_1 =               (AV_CH_LAYOUT_STEREO|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_SURROUND =          (AV_CH_LAYOUT_STEREO|AV_CH_FRONT_CENTER);
public static final int AV_CH_LAYOUT_3POINT1 =           (AV_CH_LAYOUT_SURROUND|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_4POINT0 =           (AV_CH_LAYOUT_SURROUND|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_4POINT1 =           (AV_CH_LAYOUT_4POINT0|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_2_2 =               (AV_CH_LAYOUT_STEREO|AV_CH_SIDE_LEFT|AV_CH_SIDE_RIGHT);
public static final int AV_CH_LAYOUT_QUAD =              (AV_CH_LAYOUT_STEREO|AV_CH_BACK_LEFT|AV_CH_BACK_RIGHT);
public static final int AV_CH_LAYOUT_5POINT0 =           (AV_CH_LAYOUT_SURROUND|AV_CH_SIDE_LEFT|AV_CH_SIDE_RIGHT);
public static final int AV_CH_LAYOUT_5POINT1 =           (AV_CH_LAYOUT_5POINT0|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_5POINT0_BACK =      (AV_CH_LAYOUT_SURROUND|AV_CH_BACK_LEFT|AV_CH_BACK_RIGHT);
public static final int AV_CH_LAYOUT_5POINT1_BACK =      (AV_CH_LAYOUT_5POINT0_BACK|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_6POINT0 =           (AV_CH_LAYOUT_5POINT0|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_6POINT0_FRONT =     (AV_CH_LAYOUT_2_2|AV_CH_FRONT_LEFT_OF_CENTER|AV_CH_FRONT_RIGHT_OF_CENTER);
public static final int AV_CH_LAYOUT_HEXAGONAL =         (AV_CH_LAYOUT_5POINT0_BACK|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_6POINT1 =           (AV_CH_LAYOUT_5POINT1|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_6POINT1_BACK =      (AV_CH_LAYOUT_5POINT1_BACK|AV_CH_BACK_CENTER);
public static final int AV_CH_LAYOUT_6POINT1_FRONT =     (AV_CH_LAYOUT_6POINT0_FRONT|AV_CH_LOW_FREQUENCY);
public static final int AV_CH_LAYOUT_7POINT0 =           (AV_CH_LAYOUT_5POINT0|AV_CH_BACK_LEFT|AV_CH_BACK_RIGHT);
public static final int AV_CH_LAYOUT_7POINT0_FRONT =     (AV_CH_LAYOUT_5POINT0|AV_CH_FRONT_LEFT_OF_CENTER|AV_CH_FRONT_RIGHT_OF_CENTER);
public static final int AV_CH_LAYOUT_7POINT1 =           (AV_CH_LAYOUT_5POINT1|AV_CH_BACK_LEFT|AV_CH_BACK_RIGHT);
public static final int AV_CH_LAYOUT_7POINT1_WIDE =      (AV_CH_LAYOUT_5POINT1|AV_CH_FRONT_LEFT_OF_CENTER|AV_CH_FRONT_RIGHT_OF_CENTER);
public static final int AV_CH_LAYOUT_7POINT1_WIDE_BACK = (AV_CH_LAYOUT_5POINT1_BACK|AV_CH_FRONT_LEFT_OF_CENTER|AV_CH_FRONT_RIGHT_OF_CENTER);
public static final int AV_CH_LAYOUT_OCTAGONAL =         (AV_CH_LAYOUT_5POINT0|AV_CH_BACK_LEFT|AV_CH_BACK_CENTER|AV_CH_BACK_RIGHT);
public static final long AV_CH_LAYOUT_HEXADECAGONAL =     (AV_CH_LAYOUT_OCTAGONAL|AV_CH_WIDE_LEFT|AV_CH_WIDE_RIGHT|AV_CH_TOP_BACK_LEFT|AV_CH_TOP_BACK_RIGHT|AV_CH_TOP_BACK_CENTER|AV_CH_TOP_FRONT_CENTER|AV_CH_TOP_FRONT_LEFT|AV_CH_TOP_FRONT_RIGHT);
public static final int AV_CH_LAYOUT_STEREO_DOWNMIX =    (AV_CH_STEREO_LEFT|AV_CH_STEREO_RIGHT);

/** enum AVMatrixEncoding */
public static final int
    AV_MATRIX_ENCODING_NONE = 0,
    AV_MATRIX_ENCODING_DOLBY = 1,
    AV_MATRIX_ENCODING_DPLII = 2,
    AV_MATRIX_ENCODING_DPLIIX = 3,
    AV_MATRIX_ENCODING_DPLIIZ = 4,
    AV_MATRIX_ENCODING_DOLBYEX = 5,
    AV_MATRIX_ENCODING_DOLBYHEADPHONE = 6,
    AV_MATRIX_ENCODING_NB = 7;

/**
 * Return a channel layout id that matches name, or 0 if no match is found.
 *
 * name can be one or several of the following notations,
 * separated by '+' or '|':
 * - the name of an usual channel layout (mono, stereo, 4.0, quad, 5.0,
 *   5.0(side), 5.1, 5.1(side), 7.1, 7.1(wide), downmix);
 * - the name of a single channel (FL, FR, FC, LFE, BL, BR, FLC, FRC, BC,
 *   SL, SR, TC, TFL, TFC, TFR, TBL, TBC, TBR, DL, DR);
 * - a number of channels, in decimal, optionally followed by 'c', yielding
 *   the default channel layout for that number of channels (@see
 *   av_get_default_channel_layout);
 * - a channel layout mask, in hexadecimal starting with "0x" (see the
 *   AV_CH_* macros).
 *
 * \warning Starting from the next major bump the trailing character
 * 'c' to specify a number of channels will be required, while a
 * channel layout mask could also be specified as a decimal number
 * (if and only if not followed by "c").
 *
 * Example: "stereo+FC" = "2c+FC" = "2c+1c" = "0x7"
 */
public static native @Cast("uint64_t") long av_get_channel_layout(@Cast("const char*") BytePointer name);
public static native @Cast("uint64_t") long av_get_channel_layout(String name);

/**
 * Return a description of a channel layout.
 * If nb_channels is <= 0, it is guessed from the channel_layout.
 *
 * @param buf put here the string containing the channel layout
 * @param buf_size size in bytes of the buffer
 */
public static native void av_get_channel_layout_string(@Cast("char*") BytePointer buf, int buf_size, int nb_channels, @Cast("uint64_t") long channel_layout);
public static native void av_get_channel_layout_string(@Cast("char*") ByteBuffer buf, int buf_size, int nb_channels, @Cast("uint64_t") long channel_layout);
public static native void av_get_channel_layout_string(@Cast("char*") byte[] buf, int buf_size, int nb_channels, @Cast("uint64_t") long channel_layout);

@Opaque public static class AVBPrint extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVBPrint() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBPrint(Pointer p) { super(p); }
}
/**
 * Append a description of a channel layout to a bprint buffer.
 */
public static native void av_bprint_channel_layout(AVBPrint bp, int nb_channels, @Cast("uint64_t") long channel_layout);

/**
 * Return the number of channels in the channel layout.
 */
public static native int av_get_channel_layout_nb_channels(@Cast("uint64_t") long channel_layout);

/**
 * Return default channel layout for a given number of channels.
 */
public static native long av_get_default_channel_layout(int nb_channels);

/**
 * Get the index of a channel in channel_layout.
 *
 * @param channel a channel layout describing exactly one channel which must be
 *                present in channel_layout.
 *
 * @return index of channel in channel_layout on success, a negative AVERROR
 *         on error.
 */
public static native int av_get_channel_layout_channel_index(@Cast("uint64_t") long channel_layout,
                                        @Cast("uint64_t") long channel);

/**
 * Get the channel with the given index in channel_layout.
 */
public static native @Cast("uint64_t") long av_channel_layout_extract_channel(@Cast("uint64_t") long channel_layout, int index);

/**
 * Get the name of a given channel.
 *
 * @return channel name on success, NULL on error.
 */
public static native @Cast("const char*") BytePointer av_get_channel_name(@Cast("uint64_t") long channel);

/**
 * Get the description of a given channel.
 *
 * @param channel  a channel layout with a single channel
 * @return  channel description on success, NULL on error
 */
public static native @Cast("const char*") BytePointer av_get_channel_description(@Cast("uint64_t") long channel);

/**
 * Get the value and name of a standard channel layout.
 *
 * @param [in]  index   index in an internal list, starting at 0
 * @param [out] layout  channel layout mask
 * @param [out] name    name of the layout
 * @return  0  if the layout exists,
 *          <0 if index is beyond the limits
 */
public static native int av_get_standard_channel_layout(@Cast("unsigned") int index, @Cast("uint64_t*") LongPointer layout,
                                   @Cast("const char**") PointerPointer name);
public static native int av_get_standard_channel_layout(@Cast("unsigned") int index, @Cast("uint64_t*") LongPointer layout,
                                   @Cast("const char**") @ByPtrPtr BytePointer name);
public static native int av_get_standard_channel_layout(@Cast("unsigned") int index, @Cast("uint64_t*") LongBuffer layout,
                                   @Cast("const char**") @ByPtrPtr ByteBuffer name);
public static native int av_get_standard_channel_layout(@Cast("unsigned") int index, @Cast("uint64_t*") long[] layout,
                                   @Cast("const char**") @ByPtrPtr byte[] name);

/**
 * \}
 * \}
 */

// #endif /* AVUTIL_CHANNEL_LAYOUT_H */


// Parsed from <libavutil/cpu.h>

/*
 * Copyright (c) 2000, 2001, 2002 Fabrice Bellard
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_CPU_H
// #define AVUTIL_CPU_H

// #include "attributes.h"

public static final int AV_CPU_FLAG_FORCE =    0x80000000; /* force usage of selected flags (OR) */

    /* lower 16 bits - CPU features */
/** standard MMX */
public static final int AV_CPU_FLAG_MMX =          0x0001;
/** SSE integer functions or AMD MMX ext */
public static final int AV_CPU_FLAG_MMXEXT =       0x0002;
/** SSE integer functions or AMD MMX ext */
public static final int AV_CPU_FLAG_MMX2 =         0x0002;
/** AMD 3DNOW */
public static final int AV_CPU_FLAG_3DNOW =        0x0004;
/** SSE functions */
public static final int AV_CPU_FLAG_SSE =          0x0008;
/** PIV SSE2 functions */
public static final int AV_CPU_FLAG_SSE2 =         0x0010;
/** SSE2 supported, but usually not faster
 *  than regular MMX/SSE (e.g. Core1) */
public static final int AV_CPU_FLAG_SSE2SLOW = 0x40000000;
/** AMD 3DNowExt */
public static final int AV_CPU_FLAG_3DNOWEXT =     0x0020;
/** Prescott SSE3 functions */
public static final int AV_CPU_FLAG_SSE3 =         0x0040;
/** SSE3 supported, but usually not faster
 *  than regular MMX/SSE (e.g. Core1) */
public static final int AV_CPU_FLAG_SSE3SLOW = 0x20000000;
/** Conroe SSSE3 functions */
public static final int AV_CPU_FLAG_SSSE3 =        0x0080;
/** Atom processor, some SSSE3 instructions are slower */
public static final int AV_CPU_FLAG_ATOM =     0x10000000;
/** Penryn SSE4.1 functions */
public static final int AV_CPU_FLAG_SSE4 =         0x0100;
/** Nehalem SSE4.2 functions */
public static final int AV_CPU_FLAG_SSE42 =        0x0200;
/** AVX functions: requires OS support even if YMM registers aren't used */
public static final int AV_CPU_FLAG_AVX =          0x4000;
/** AVX supported, but slow when using YMM registers (e.g. Bulldozer) */
public static final int AV_CPU_FLAG_AVXSLOW =   0x8000000;
/** Bulldozer XOP functions */
public static final int AV_CPU_FLAG_XOP =          0x0400;
/** Bulldozer FMA4 functions */
public static final int AV_CPU_FLAG_FMA4 =         0x0800;
// #if LIBAVUTIL_VERSION_MAJOR <52
/** supports cmov instruction */
public static final int AV_CPU_FLAG_CMOV =      0x1001000;
// #else
// #define AV_CPU_FLAG_CMOV         0x1000 ///< supports cmov instruction
// #endif
/** AVX2 functions: requires OS support even if YMM registers aren't used */
public static final int AV_CPU_FLAG_AVX2 =         0x8000;
/** Haswell FMA3 functions */
public static final int AV_CPU_FLAG_FMA3 =        0x10000;
/** Bit Manipulation Instruction Set 1 */
public static final int AV_CPU_FLAG_BMI1 =        0x20000;
/** Bit Manipulation Instruction Set 2 */
public static final int AV_CPU_FLAG_BMI2 =        0x40000;

/** standard */
public static final int AV_CPU_FLAG_ALTIVEC =      0x0001;
/** ISA 2.06 */
public static final int AV_CPU_FLAG_VSX =          0x0002;
/** ISA 2.07 */
public static final int AV_CPU_FLAG_POWER8 =       0x0004;

public static final int AV_CPU_FLAG_ARMV5TE =      (1 << 0);
public static final int AV_CPU_FLAG_ARMV6 =        (1 << 1);
public static final int AV_CPU_FLAG_ARMV6T2 =      (1 << 2);
public static final int AV_CPU_FLAG_VFP =          (1 << 3);
public static final int AV_CPU_FLAG_VFPV3 =        (1 << 4);
public static final int AV_CPU_FLAG_NEON =         (1 << 5);
public static final int AV_CPU_FLAG_ARMV8 =        (1 << 6);
public static final int AV_CPU_FLAG_SETEND =       (1 <<16);

/**
 * Return the flags which specify extensions supported by the CPU.
 * The returned value is affected by av_force_cpu_flags() if that was used
 * before. So av_get_cpu_flags() can easily be used in a application to
 * detect the enabled cpu flags.
 */
public static native int av_get_cpu_flags();

/**
 * Disables cpu detection and forces the specified flags.
 * -1 is a special case that disables forcing of specific flags.
 */
public static native void av_force_cpu_flags(int flags);

/**
 * Set a mask on flags returned by av_get_cpu_flags().
 * This function is mainly useful for testing.
 * Please use av_force_cpu_flags() and av_get_cpu_flags() instead which are more flexible
 *
 * \warning this function is not thread safe.
 */
public static native @Deprecated void av_set_cpu_flags_mask(int mask);

/**
 * Parse CPU flags from a string.
 *
 * The returned flags contain the specified flags as well as related unspecified flags.
 *
 * This function exists only for compatibility with libav.
 * Please use av_parse_cpu_caps() when possible.
 * @return a combination of AV_CPU_* flags, negative on error.
 */
public static native @Deprecated int av_parse_cpu_flags(@Cast("const char*") BytePointer s);
public static native @Deprecated int av_parse_cpu_flags(String s);

/**
 * Parse CPU caps from a string and update the given AV_CPU_* flags based on that.
 *
 * @return negative on error.
 */
public static native int av_parse_cpu_caps(@Cast("unsigned*") IntPointer flags, @Cast("const char*") BytePointer s);
public static native int av_parse_cpu_caps(@Cast("unsigned*") IntBuffer flags, String s);
public static native int av_parse_cpu_caps(@Cast("unsigned*") int[] flags, @Cast("const char*") BytePointer s);
public static native int av_parse_cpu_caps(@Cast("unsigned*") IntPointer flags, String s);
public static native int av_parse_cpu_caps(@Cast("unsigned*") IntBuffer flags, @Cast("const char*") BytePointer s);
public static native int av_parse_cpu_caps(@Cast("unsigned*") int[] flags, String s);

/**
 * @return the number of logical CPU cores present.
 */
public static native int av_cpu_count();

// #endif /* AVUTIL_CPU_H */


// Parsed from <libavutil/dict.h>

/*
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * Public dictionary API.
 * @deprecated
 *  AVDictionary is provided for compatibility with libav. It is both in
 *  implementation as well as API inefficient. It does not scale and is
 *  extremely slow with large dictionaries.
 *  It is recommended that new code uses our tree container from tree.c/h
 *  where applicable, which uses AVL trees to achieve O(log n) performance.
 */

// #ifndef AVUTIL_DICT_H
// #define AVUTIL_DICT_H

// #include <stdint.h>

// #include "version.h"

/**
 * \addtogroup lavu_dict AVDictionary
 * \ingroup lavu_data
 *
 * \brief Simple key:value store
 *
 * \{
 * Dictionaries are used for storing key:value pairs. To create
 * an AVDictionary, simply pass an address of a NULL pointer to
 * av_dict_set(). NULL can be used as an empty dictionary wherever
 * a pointer to an AVDictionary is required.
 * Use av_dict_get() to retrieve an entry or iterate over all
 * entries and finally av_dict_free() to free the dictionary
 * and all its contents.
 *
 <pre>{@code
   AVDictionary *d = NULL;           // "create" an empty dictionary
   AVDictionaryEntry *t = NULL;

   av_dict_set(&d, "foo", "bar", 0); // add an entry

   char *k = av_strdup("key");       // if your strings are already allocated,
   char *v = av_strdup("value");     // you can avoid copying them like this
   av_dict_set(&d, k, v, AV_DICT_DONT_STRDUP_KEY | AV_DICT_DONT_STRDUP_VAL);

   while (t = av_dict_get(d, "", t, AV_DICT_IGNORE_SUFFIX)) {
       <....>                             // iterate over all entries in d
   }
   av_dict_free(&d);
 }</pre>
 *
 */

/** Only get an entry with exact-case key match. Only relevant in av_dict_get(). */
public static final int AV_DICT_MATCH_CASE =      1;
/** Return first entry in a dictionary whose first part corresponds to the search key,
                                         ignoring the suffix of the found key string. Only relevant in av_dict_get(). */
public static final int AV_DICT_IGNORE_SUFFIX =   2;
/** Take ownership of a key that's been
                                         allocated with av_malloc() or another memory allocation function. */
public static final int AV_DICT_DONT_STRDUP_KEY = 4;
/** Take ownership of a value that's been
                                         allocated with av_malloc() or another memory allocation function. */
public static final int AV_DICT_DONT_STRDUP_VAL = 8;
/** Don't overwrite existing entries. */
public static final int AV_DICT_DONT_OVERWRITE = 16;
/** If the entry already exists, append to it.  Note that no
                                      delimiter is added, the strings are simply concatenated. */
public static final int AV_DICT_APPEND =         32;

public static class AVDictionaryEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDictionaryEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVDictionaryEntry(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDictionaryEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVDictionaryEntry position(int position) {
        return (AVDictionaryEntry)super.position(position);
    }

    public native @Cast("char*") BytePointer key(); public native AVDictionaryEntry key(BytePointer key);
    public native @Cast("char*") BytePointer value(); public native AVDictionaryEntry value(BytePointer value);
}

@Opaque public static class AVDictionary extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVDictionary() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDictionary(Pointer p) { super(p); }
}

/**
 * Get a dictionary entry with matching key.
 *
 * The returned entry key or value must not be changed, or it will
 * cause undefined behavior.
 *
 * To iterate through all the dictionary entries, you can set the matching key
 * to the null string "" and set the AV_DICT_IGNORE_SUFFIX flag.
 *
 * @param prev Set to the previous matching element to find the next.
 *             If set to NULL the first matching element is returned.
 * @param key matching key
 * @param flags a collection of AV_DICT_* flags controlling how the entry is retrieved
 * @return found entry or NULL in case no matching entry was found in the dictionary
 */
public static native AVDictionaryEntry av_dict_get(@Const AVDictionary m, @Cast("const char*") BytePointer key,
                               @Const AVDictionaryEntry prev, int flags);
public static native AVDictionaryEntry av_dict_get(@Const AVDictionary m, String key,
                               @Const AVDictionaryEntry prev, int flags);

/**
 * Get number of entries in dictionary.
 *
 * @param m dictionary
 * @return  number of entries in dictionary
 */
public static native int av_dict_count(@Const AVDictionary m);

/**
 * Set the given entry in *pm, overwriting an existing entry.
 *
 * Note: If AV_DICT_DONT_STRDUP_KEY or AV_DICT_DONT_STRDUP_VAL is set,
 * these arguments will be freed on error.
 *
 * @param pm pointer to a pointer to a dictionary struct. If *pm is NULL
 * a dictionary struct is allocated and put in *pm.
 * @param key entry key to add to *pm (will be av_strduped depending on flags)
 * @param value entry value to add to *pm (will be av_strduped depending on flags).
 *        Passing a NULL value will cause an existing entry to be deleted.
 * @return >= 0 on success otherwise an error code <0
 */
public static native int av_dict_set(@Cast("AVDictionary**") PointerPointer pm, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer value, int flags);
public static native int av_dict_set(@ByPtrPtr AVDictionary pm, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer value, int flags);
public static native int av_dict_set(@ByPtrPtr AVDictionary pm, String key, String value, int flags);

/**
 * Convenience wrapper for av_dict_set that converts the value to a string
 * and stores it.
 *
 * Note: If AV_DICT_DONT_STRDUP_KEY is set, key will be freed on error.
 */
public static native int av_dict_set_int(@Cast("AVDictionary**") PointerPointer pm, @Cast("const char*") BytePointer key, long value, int flags);
public static native int av_dict_set_int(@ByPtrPtr AVDictionary pm, @Cast("const char*") BytePointer key, long value, int flags);
public static native int av_dict_set_int(@ByPtrPtr AVDictionary pm, String key, long value, int flags);

/**
 * Parse the key/value pairs list and add the parsed entries to a dictionary.
 *
 * In case of failure, all the successfully set entries are stored in
 * *pm. You may need to manually free the created dictionary.
 *
 * @param key_val_sep  a 0-terminated list of characters used to separate
 *                     key from value
 * @param pairs_sep    a 0-terminated list of characters used to separate
 *                     two pairs from each other
 * @param flags        flags to use when adding to dictionary.
 *                     AV_DICT_DONT_STRDUP_KEY and AV_DICT_DONT_STRDUP_VAL
 *                     are ignored since the key/value tokens will always
 *                     be duplicated.
 * @return             0 on success, negative AVERROR code on failure
 */
public static native int av_dict_parse_string(@Cast("AVDictionary**") PointerPointer pm, @Cast("const char*") BytePointer str,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         int flags);
public static native int av_dict_parse_string(@ByPtrPtr AVDictionary pm, @Cast("const char*") BytePointer str,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         int flags);
public static native int av_dict_parse_string(@ByPtrPtr AVDictionary pm, String str,
                         String key_val_sep, String pairs_sep,
                         int flags);

/**
 * Copy entries from one AVDictionary struct into another.
 * @param dst pointer to a pointer to a AVDictionary struct. If *dst is NULL,
 *            this function will allocate a struct for you and put it in *dst
 * @param src pointer to source AVDictionary struct
 * @param flags flags to use when setting entries in *dst
 * \note metadata is read using the AV_DICT_IGNORE_SUFFIX flag
 */
public static native void av_dict_copy(@Cast("AVDictionary**") PointerPointer dst, @Const AVDictionary src, int flags);
public static native void av_dict_copy(@ByPtrPtr AVDictionary dst, @Const AVDictionary src, int flags);

/**
 * Free all the memory allocated for an AVDictionary struct
 * and all keys and values.
 */
public static native void av_dict_free(@Cast("AVDictionary**") PointerPointer m);
public static native void av_dict_free(@ByPtrPtr AVDictionary m);

/**
 * Get dictionary entries as a string.
 *
 * Create a string containing dictionary's entries.
 * Such string may be passed back to av_dict_parse_string().
 * \note String is escaped with backslashes ('\').
 *
 * @param [in]  m             dictionary
 * @param [out] buffer        Pointer to buffer that will be allocated with string containg entries.
 *                           Buffer must be freed by the caller when is no longer needed.
 * @param [in]  key_val_sep   character used to separate key from value
 * @param [in]  pairs_sep     character used to separate two pairs from each other
 * @return                   >= 0 on success, negative on error
 * \warning Separators cannot be neither '\\' nor '\0'. They also cannot be the same.
 */
public static native int av_dict_get_string(@Const AVDictionary m, @Cast("char**") PointerPointer buffer,
                       byte key_val_sep, byte pairs_sep);
public static native int av_dict_get_string(@Const AVDictionary m, @Cast("char**") @ByPtrPtr BytePointer buffer,
                       byte key_val_sep, byte pairs_sep);
public static native int av_dict_get_string(@Const AVDictionary m, @Cast("char**") @ByPtrPtr ByteBuffer buffer,
                       byte key_val_sep, byte pairs_sep);
public static native int av_dict_get_string(@Const AVDictionary m, @Cast("char**") @ByPtrPtr byte[] buffer,
                       byte key_val_sep, byte pairs_sep);

/**
 * \}
 */

// #endif /* AVUTIL_DICT_H */


// Parsed from <libavutil/opt.h>

/*
 * AVOptions
 * copyright (c) 2005 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_OPT_H
// #define AVUTIL_OPT_H

/**
 * \file
 * AVOptions
 */

// #include "rational.h"
// #include "avutil.h"
// #include "dict.h"
// #include "log.h"
// #include "pixfmt.h"
// #include "samplefmt.h"
// #include "version.h"

/**
 * \defgroup avoptions AVOptions
 * \ingroup lavu_data
 * \{
 * AVOptions provide a generic system to declare options on arbitrary structs
 * ("objects"). An option can have a help text, a type and a range of possible
 * values. Options may then be enumerated, read and written to.
 *
 * \section avoptions_implement Implementing AVOptions
 * This section describes how to add AVOptions capabilities to a struct.
 *
 * All AVOptions-related information is stored in an AVClass. Therefore
 * the first member of the struct should be a pointer to an AVClass describing it.
 * The option field of the AVClass must be set to a NULL-terminated static array
 * of AVOptions. Each AVOption must have a non-empty name, a type, a default
 * value and for number-type AVOptions also a range of allowed values. It must
 * also declare an offset in bytes from the start of the struct, where the field
 * associated with this AVOption is located. Other fields in the AVOption struct
 * should also be set when applicable, but are not required.
 *
 * The following example illustrates an AVOptions-enabled struct:
 * <pre>{@code
 * typedef struct test_struct {
 *     AVClass *class;
 *     int      int_opt;
 *     char    *str_opt;
 *     uint8_t *bin_opt;
 *     int      bin_len;
 * } test_struct;
 *
 * static const AVOption test_options[] = {
 *   { "test_int", "This is a test option of int type.", offsetof(test_struct, int_opt),
 *     AV_OPT_TYPE_INT, { .i64 = -1 }, INT_MIN, INT_MAX },
 *   { "test_str", "This is a test option of string type.", offsetof(test_struct, str_opt),
 *     AV_OPT_TYPE_STRING },
 *   { "test_bin", "This is a test option of binary type.", offsetof(test_struct, bin_opt),
 *     AV_OPT_TYPE_BINARY },
 *   { NULL },
 * };
 *
 * static const AVClass test_class = {
 *     .class_name = "test class",
 *     .item_name  = av_default_item_name,
 *     .option     = test_options,
 *     .version    = LIBAVUTIL_VERSION_INT,
 * };
 * }</pre>
 *
 * Next, when allocating your struct, you must ensure that the AVClass pointer
 * is set to the correct value. Then, av_opt_set_defaults() can be called to
 * initialize defaults. After that the struct is ready to be used with the
 * AVOptions API.
 *
 * When cleaning up, you may use the av_opt_free() function to automatically
 * free all the allocated string and binary options.
 *
 * Continuing with the above example:
 *
 * <pre>{@code
 * test_struct *alloc_test_struct(void)
 * {
 *     test_struct *ret = av_malloc(sizeof(*ret));
 *     ret->class = &test_class;
 *     av_opt_set_defaults(ret);
 *     return ret;
 * }
 * void free_test_struct(test_struct **foo)
 * {
 *     av_opt_free(*foo);
 *     av_freep(foo);
 * }
 * }</pre>
 *
 * \subsection avoptions_implement_nesting Nesting
 *      It may happen that an AVOptions-enabled struct contains another
 *      AVOptions-enabled struct as a member (e.g. AVCodecContext in
 *      libavcodec exports generic options, while its priv_data field exports
 *      codec-specific options). In such a case, it is possible to set up the
 *      parent struct to export a child's options. To do that, simply
 *      implement AVClass.child_next() and AVClass.child_class_next() in the
 *      parent struct's AVClass.
 *      Assuming that the test_struct from above now also contains a
 *      child_struct field:
 *
 *      <pre>{@code
 *      typedef struct child_struct {
 *          AVClass *class;
 *          int flags_opt;
 *      } child_struct;
 *      static const AVOption child_opts[] = {
 *          { "test_flags", "This is a test option of flags type.",
 *            offsetof(child_struct, flags_opt), AV_OPT_TYPE_FLAGS, { .i64 = 0 }, INT_MIN, INT_MAX },
 *          { NULL },
 *      };
 *      static const AVClass child_class = {
 *          .class_name = "child class",
 *          .item_name  = av_default_item_name,
 *          .option     = child_opts,
 *          .version    = LIBAVUTIL_VERSION_INT,
 *      };
 *
 *      void *child_next(void *obj, void *prev)
 *      {
 *          test_struct *t = obj;
 *          if (!prev && t->child_struct)
 *              return t->child_struct;
 *          return NULL
 *      }
 *      const AVClass child_class_next(const AVClass *prev)
 *      {
 *          return prev ? NULL : &child_class;
 *      }
 *      }</pre>
 *      Putting child_next() and child_class_next() as defined above into
 *      test_class will now make child_struct's options accessible through
 *      test_struct (again, proper setup as described above needs to be done on
 *      child_struct right after it is created).
 *
 *      From the above example it might not be clear why both child_next()
 *      and child_class_next() are needed. The distinction is that child_next()
 *      iterates over actually existing objects, while child_class_next()
 *      iterates over all possible child classes. E.g. if an AVCodecContext
 *      was initialized to use a codec which has private options, then its
 *      child_next() will return AVCodecContext.priv_data and finish
 *      iterating. OTOH child_class_next() on AVCodecContext.av_class will
 *      iterate over all available codecs with private options.
 *
 * \subsection avoptions_implement_named_constants Named constants
 *      It is possible to create named constants for options. Simply set the unit
 *      field of the option the constants should apply to a string and
 *      create the constants themselves as options of type AV_OPT_TYPE_CONST
 *      with their unit field set to the same string.
 *      Their default_val field should contain the value of the named
 *      constant.
 *      For example, to add some named constants for the test_flags option
 *      above, put the following into the child_opts array:
 *      <pre>{@code
 *      { "test_flags", "This is a test option of flags type.",
 *        offsetof(child_struct, flags_opt), AV_OPT_TYPE_FLAGS, { .i64 = 0 }, INT_MIN, INT_MAX, "test_unit" },
 *      { "flag1", "This is a flag with value 16", 0, AV_OPT_TYPE_CONST, { .i64 = 16 }, 0, 0, "test_unit" },
 *      }</pre>
 *
 * \section avoptions_use Using AVOptions
 * This section deals with accessing options in an AVOptions-enabled struct.
 * Such structs in FFmpeg are e.g. AVCodecContext in libavcodec or
 * AVFormatContext in libavformat.
 *
 * \subsection avoptions_use_examine Examining AVOptions
 * The basic functions for examining options are av_opt_next(), which iterates
 * over all options defined for one object, and av_opt_find(), which searches
 * for an option with the given name.
 *
 * The situation is more complicated with nesting. An AVOptions-enabled struct
 * may have AVOptions-enabled children. Passing the AV_OPT_SEARCH_CHILDREN flag
 * to av_opt_find() will make the function search children recursively.
 *
 * For enumerating there are basically two cases. The first is when you want to
 * get all options that may potentially exist on the struct and its children
 * (e.g.  when constructing documentation). In that case you should call
 * av_opt_child_class_next() recursively on the parent struct's AVClass.  The
 * second case is when you have an already initialized struct with all its
 * children and you want to get all options that can be actually written or read
 * from it. In that case you should call av_opt_child_next() recursively (and
 * av_opt_next() on each result).
 *
 * \subsection avoptions_use_get_set Reading and writing AVOptions
 * When setting options, you often have a string read directly from the
 * user. In such a case, simply passing it to av_opt_set() is enough. For
 * non-string type options, av_opt_set() will parse the string according to the
 * option type.
 *
 * Similarly av_opt_get() will read any option type and convert it to a string
 * which will be returned. Do not forget that the string is allocated, so you
 * have to free it with av_free().
 *
 * In some cases it may be more convenient to put all options into an
 * AVDictionary and call av_opt_set_dict() on it. A specific case of this
 * are the format/codec open functions in lavf/lavc which take a dictionary
 * filled with option as a parameter. This makes it possible to set some options
 * that cannot be set otherwise, since e.g. the input file format is not known
 * before the file is actually opened.
 */

/** enum AVOptionType */
public static final int
    AV_OPT_TYPE_FLAGS = 0,
    AV_OPT_TYPE_INT = 1,
    AV_OPT_TYPE_INT64 = 2,
    AV_OPT_TYPE_DOUBLE = 3,
    AV_OPT_TYPE_FLOAT = 4,
    AV_OPT_TYPE_STRING = 5,
    AV_OPT_TYPE_RATIONAL = 6,
    /** offset must point to a pointer immediately followed by an int for the length */
    AV_OPT_TYPE_BINARY = 7,
    AV_OPT_TYPE_DICT = 8,
    AV_OPT_TYPE_CONST = 128;
public static native @MemberGetter int AV_OPT_TYPE_IMAGE_SIZE();
public static final int
    /** offset must point to two consecutive integers */
    AV_OPT_TYPE_IMAGE_SIZE = AV_OPT_TYPE_IMAGE_SIZE();
public static native @MemberGetter int AV_OPT_TYPE_PIXEL_FMT();
public static final int
    AV_OPT_TYPE_PIXEL_FMT  = AV_OPT_TYPE_PIXEL_FMT();
public static native @MemberGetter int AV_OPT_TYPE_SAMPLE_FMT();
public static final int
    AV_OPT_TYPE_SAMPLE_FMT = AV_OPT_TYPE_SAMPLE_FMT();
public static native @MemberGetter int AV_OPT_TYPE_VIDEO_RATE();
public static final int
    /** offset must point to AVRational */
    AV_OPT_TYPE_VIDEO_RATE = AV_OPT_TYPE_VIDEO_RATE();
public static native @MemberGetter int AV_OPT_TYPE_DURATION();
public static final int
    AV_OPT_TYPE_DURATION   = AV_OPT_TYPE_DURATION();
public static native @MemberGetter int AV_OPT_TYPE_COLOR();
public static final int
    AV_OPT_TYPE_COLOR      = AV_OPT_TYPE_COLOR();
public static native @MemberGetter int AV_OPT_TYPE_CHANNEL_LAYOUT();
public static final int
    AV_OPT_TYPE_CHANNEL_LAYOUT = AV_OPT_TYPE_CHANNEL_LAYOUT(),
// #if FF_API_OLD_AVOPTIONS
    FF_OPT_TYPE_FLAGS = 0,
    FF_OPT_TYPE_INT = 1,
    FF_OPT_TYPE_INT64 = 2,
    FF_OPT_TYPE_DOUBLE = 3,
    FF_OPT_TYPE_FLOAT = 4,
    FF_OPT_TYPE_STRING = 5,
    FF_OPT_TYPE_RATIONAL = 6,
    /** offset must point to a pointer immediately followed by an int for the length */
    FF_OPT_TYPE_BINARY = 7,
    FF_OPT_TYPE_CONST= 128;
// #endif

/**
 * AVOption
 */
public static class AVOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVOption(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVOption position(int position) {
        return (AVOption)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer name();

    /**
     * short English help text
     * \todo What about other languages?
     */
    @MemberGetter public native @Cast("const char*") BytePointer help();

    /**
     * The offset relative to the context structure where the option
     * value is stored. It should be 0 for named constants.
     */
    public native int offset(); public native AVOption offset(int offset);
    public native @Cast("AVOptionType") int type(); public native AVOption type(int type);

    /**
     * the default value for scalar options
     */
        @Name("default_val.i64") public native long default_val_i64(); public native AVOption default_val_i64(long default_val_i64);
        @Name("default_val.dbl") public native double default_val_dbl(); public native AVOption default_val_dbl(double default_val_dbl);
        @Name("default_val.str") @MemberGetter public native @Cast("const char*") BytePointer default_val_str();
        /* TODO those are unused now */
        @Name("default_val.q") public native @ByRef AVRational default_val_q(); public native AVOption default_val_q(AVRational default_val_q);
    /** minimum valid value for the option */
    public native double min(); public native AVOption min(double min);
    /** maximum valid value for the option */
    public native double max(); public native AVOption max(double max);

    public native int flags(); public native AVOption flags(int flags);
/** a generic parameter which can be set by the user for muxing or encoding */
public static final int AV_OPT_FLAG_ENCODING_PARAM =  1;
/** a generic parameter which can be set by the user for demuxing or decoding */
public static final int AV_OPT_FLAG_DECODING_PARAM =  2;
// #if FF_API_OPT_TYPE_METADATA
/** some data extracted or inserted into the file like title, comment, ... */
public static final int AV_OPT_FLAG_METADATA =        4;
// #endif
public static final int AV_OPT_FLAG_AUDIO_PARAM =     8;
public static final int AV_OPT_FLAG_VIDEO_PARAM =     16;
public static final int AV_OPT_FLAG_SUBTITLE_PARAM =  32;
/**
 * The option is inteded for exporting values to the caller.
 */
public static final int AV_OPT_FLAG_EXPORT =          64;
/**
 * The option may not be set through the AVOptions API, only read.
 * This flag only makes sense when AV_OPT_FLAG_EXPORT is also set.
 */
public static final int AV_OPT_FLAG_READONLY =        128;
/** a generic parameter which can be set by the user for filtering */
public static final int AV_OPT_FLAG_FILTERING_PARAM = (1<<16);
//FIXME think about enc-audio, ... style flags

    /**
     * The logical unit to which the option belongs. Non-constant
     * options and corresponding named constants share the same
     * unit. May be NULL.
     */
    @MemberGetter public native @Cast("const char*") BytePointer unit();
}

/**
 * A single allowed range of values, or a single allowed value.
 */
public static class AVOptionRange extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOptionRange() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVOptionRange(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOptionRange(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVOptionRange position(int position) {
        return (AVOptionRange)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer str();
    /**
     * Value range.
     * For string ranges this represents the min/max length.
     * For dimensions this represents the min/max pixel count or width/height in multi-component case.
     */
    public native double value_min(); public native AVOptionRange value_min(double value_min);
    public native double value_max(); public native AVOptionRange value_max(double value_max);
    /**
     * Value's component range.
     * For string this represents the unicode range for chars, 0-127 limits to ASCII.
     */
    public native double component_min(); public native AVOptionRange component_min(double component_min);
    public native double component_max(); public native AVOptionRange component_max(double component_max);
    /**
     * Range flag.
     * If set to 1 the struct encodes a range, if set to 0 a single value.
     */
    public native int is_range(); public native AVOptionRange is_range(int is_range);
}

/**
 * List of AVOptionRange structs.
 */
public static class AVOptionRanges extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOptionRanges() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVOptionRanges(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOptionRanges(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVOptionRanges position(int position) {
        return (AVOptionRanges)super.position(position);
    }

    /**
     * Array of option ranges.
     *
     * Most of option types use just one component.
     * Following describes multi-component option types:
     *
     * AV_OPT_TYPE_IMAGE_SIZE:
     * component index 0: range of pixel count (width * height).
     * component index 1: range of width.
     * component index 2: range of height.
     *
     * \note To obtain multi-component version of this structure, user must
     *       provide AV_OPT_MULTI_COMPONENT_RANGE to av_opt_query_ranges or
     *       av_opt_query_ranges_default function.
     *
     * Multi-component range can be read as in following example:
     *
     * <pre>{@code
     * int range_index, component_index;
     * AVOptionRanges *ranges;
     * AVOptionRange *range[3]; //may require more than 3 in the future.
     * av_opt_query_ranges(&ranges, obj, key, AV_OPT_MULTI_COMPONENT_RANGE);
     * for (range_index = 0; range_index < ranges->nb_ranges; range_index++) {
     *     for (component_index = 0; component_index < ranges->nb_components; component_index++)
     *         range[component_index] = ranges->range[ranges->nb_ranges * component_index + range_index];
     *     //do something with range here.
     * }
     * av_opt_freep_ranges(&ranges);
     * }</pre>
     */
    public native AVOptionRange range(int i); public native AVOptionRanges range(int i, AVOptionRange range);
    @MemberGetter public native @Cast("AVOptionRange**") PointerPointer range();
    /**
     * Number of ranges per component.
     */
    public native int nb_ranges(); public native AVOptionRanges nb_ranges(int nb_ranges);
    /**
     * Number of componentes.
     */
    public native int nb_components(); public native AVOptionRanges nb_components(int nb_components);
}


// #if FF_API_OLD_AVOPTIONS
/**
 * Set the field of obj with the given name to value.
 *
 * @param [in] obj A struct whose first element is a pointer to an
 * AVClass.
 * @param [in] name the name of the field to set
 * @param [in] val The value to set. If the field is not of a string
 * type, then the given string is parsed.
 * SI postfixes and some named scalars are supported.
 * If the field is of a numeric type, it has to be a numeric or named
 * scalar. Behavior with more than one scalar and +- infix operators
 * is undefined.
 * If the field is of a flags type, it has to be a sequence of numeric
 * scalars or named flags separated by '+' or '-'. Prefixing a flag
 * with '+' causes it to be set without affecting the other flags;
 * similarly, '-' unsets a flag.
 * @param [out] o_out if non-NULL put here a pointer to the AVOption
 * found
 * @param alloc this parameter is currently ignored
 * @return 0 if the value has been set, or an AVERROR code in case of
 * error:
 * AVERROR_OPTION_NOT_FOUND if no matching option exists
 * AVERROR(ERANGE) if the value is out of range
 * AVERROR(EINVAL) if the value is not valid
 * @deprecated use av_opt_set()
 */
public static native @Deprecated int av_set_string3(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer val, int alloc, @Cast("const AVOption**") PointerPointer o_out);
public static native @Deprecated int av_set_string3(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer val, int alloc, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated int av_set_string3(Pointer obj, String name, String val, int alloc, @Const @ByPtrPtr AVOption o_out);

public static native @Const @Deprecated AVOption av_set_double(Pointer obj, @Cast("const char*") BytePointer name, double n);
public static native @Const @Deprecated AVOption av_set_double(Pointer obj, String name, double n);
public static native @Const @Deprecated AVOption av_set_q(Pointer obj, @Cast("const char*") BytePointer name, @ByVal AVRational n);
public static native @Const @Deprecated AVOption av_set_q(Pointer obj, String name, @ByVal AVRational n);
public static native @Const @Deprecated AVOption av_set_int(Pointer obj, @Cast("const char*") BytePointer name, long n);
public static native @Const @Deprecated AVOption av_set_int(Pointer obj, String name, long n);

public static native @Deprecated double av_get_double(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const AVOption**") PointerPointer o_out);
public static native @Deprecated double av_get_double(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated double av_get_double(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated @ByVal AVRational av_get_q(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const AVOption**") PointerPointer o_out);
public static native @Deprecated @ByVal AVRational av_get_q(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated @ByVal AVRational av_get_q(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated long av_get_int(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const AVOption**") PointerPointer o_out);
public static native @Deprecated long av_get_int(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated long av_get_int(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out);
public static native @Deprecated @Cast("const char*") BytePointer av_get_string(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const AVOption**") PointerPointer o_out, @Cast("char*") BytePointer buf, int buf_len);
public static native @Deprecated @Cast("const char*") BytePointer av_get_string(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") BytePointer buf, int buf_len);
public static native @Deprecated String av_get_string(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") ByteBuffer buf, int buf_len);
public static native @Deprecated @Cast("const char*") BytePointer av_get_string(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") byte[] buf, int buf_len);
public static native @Deprecated String av_get_string(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") BytePointer buf, int buf_len);
public static native @Deprecated @Cast("const char*") BytePointer av_get_string(Pointer obj, @Cast("const char*") BytePointer name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") ByteBuffer buf, int buf_len);
public static native @Deprecated String av_get_string(Pointer obj, String name, @Const @ByPtrPtr AVOption o_out, @Cast("char*") byte[] buf, int buf_len);
public static native @Const @Deprecated AVOption av_next_option(Pointer obj, @Const AVOption last);
// #endif

/**
 * Show the obj options.
 *
 * @param req_flags requested flags for the options to show. Show only the
 * options for which it is opt->flags & req_flags.
 * @param rej_flags rejected flags for the options to show. Show only the
 * options for which it is !(opt->flags & req_flags).
 * @param av_log_obj log context to use for showing the options
 */
public static native int av_opt_show2(Pointer obj, Pointer av_log_obj, int req_flags, int rej_flags);

/**
 * Set the values of all AVOption fields to their default values.
 *
 * @param s an AVOption-enabled struct (its first member must be a pointer to AVClass)
 */
public static native void av_opt_set_defaults(Pointer s);

/**
 * Set the values of all AVOption fields to their default values. Only these
 * AVOption fields for which (opt->flags & mask) == flags will have their
 * default applied to s.
 *
 * @param s an AVOption-enabled struct (its first member must be a pointer to AVClass)
 * @param mask combination of AV_OPT_FLAG_*
 * @param flags combination of AV_OPT_FLAG_*
 */
public static native void av_opt_set_defaults2(Pointer s, int mask, int flags);

/**
 * Parse the key/value pairs list in opts. For each key/value pair
 * found, stores the value in the field in ctx that is named like the
 * key. ctx must be an AVClass context, storing is done using
 * AVOptions.
 *
 * @param opts options string to parse, may be NULL
 * @param key_val_sep a 0-terminated list of characters used to
 * separate key from value
 * @param pairs_sep a 0-terminated list of characters used to separate
 * two pairs from each other
 * @return the number of successfully set key/value pairs, or a negative
 * value corresponding to an AVERROR code in case of error:
 * AVERROR(EINVAL) if opts cannot be parsed,
 * the error code issued by av_opt_set() if a key/value pair
 * cannot be set
 */
public static native int av_set_options_string(Pointer ctx, @Cast("const char*") BytePointer opts,
                          @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep);
public static native int av_set_options_string(Pointer ctx, String opts,
                          String key_val_sep, String pairs_sep);

/**
 * Parse the key-value pairs list in opts. For each key=value pair found,
 * set the value of the corresponding option in ctx.
 *
 * @param ctx          the AVClass object to set options on
 * @param opts         the options string, key-value pairs separated by a
 *                     delimiter
 * @param shorthand    a NULL-terminated array of options names for shorthand
 *                     notation: if the first field in opts has no key part,
 *                     the key is taken from the first element of shorthand;
 *                     then again for the second, etc., until either opts is
 *                     finished, shorthand is finished or a named option is
 *                     found; after that, all options must be named
 * @param key_val_sep  a 0-terminated list of characters used to separate
 *                     key from value, for example '='
 * @param pairs_sep    a 0-terminated list of characters used to separate
 *                     two pairs from each other, for example ':' or ','
 * @return  the number of successfully set key=value pairs, or a negative
 *          value corresponding to an AVERROR code in case of error:
 *          AVERROR(EINVAL) if opts cannot be parsed,
 *          the error code issued by av_set_string3() if a key/value pair
 *          cannot be set
 *
 * Options names must use only the following characters: a-z A-Z 0-9 - . / _
 * Separators must use characters distinct from option names and from each
 * other.
 */
public static native int av_opt_set_from_string(Pointer ctx, @Cast("const char*") BytePointer opts,
                           @Cast("const char*const*") PointerPointer shorthand,
                           @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, @Cast("const char*") BytePointer opts,
                           @Cast("const char*const*") @ByPtrPtr BytePointer shorthand,
                           @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, String opts,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer shorthand,
                           String key_val_sep, String pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, @Cast("const char*") BytePointer opts,
                           @Cast("const char*const*") @ByPtrPtr byte[] shorthand,
                           @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, String opts,
                           @Cast("const char*const*") @ByPtrPtr BytePointer shorthand,
                           String key_val_sep, String pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, @Cast("const char*") BytePointer opts,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer shorthand,
                           @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep);
public static native int av_opt_set_from_string(Pointer ctx, String opts,
                           @Cast("const char*const*") @ByPtrPtr byte[] shorthand,
                           String key_val_sep, String pairs_sep);
/**
 * Free all allocated objects in obj.
 */
public static native void av_opt_free(Pointer obj);

/**
 * Check whether a particular flag is set in a flags field.
 *
 * @param field_name the name of the flag field option
 * @param flag_name the name of the flag to check
 * @return non-zero if the flag is set, zero if the flag isn't set,
 *         isn't of the right type, or the flags field doesn't exist.
 */
public static native int av_opt_flag_is_set(Pointer obj, @Cast("const char*") BytePointer field_name, @Cast("const char*") BytePointer flag_name);
public static native int av_opt_flag_is_set(Pointer obj, String field_name, String flag_name);

/**
 * Set all the options from a given dictionary on an object.
 *
 * @param obj a struct whose first element is a pointer to AVClass
 * @param options options to process. This dictionary will be freed and replaced
 *                by a new one containing all options not found in obj.
 *                Of course this new dictionary needs to be freed by caller
 *                with av_dict_free().
 *
 * @return 0 on success, a negative AVERROR if some option was found in obj,
 *         but could not be set.
 *
 * @see av_dict_copy()
 */
public static native int av_opt_set_dict(Pointer obj, @Cast("AVDictionary**") PointerPointer options);
public static native int av_opt_set_dict(Pointer obj, @ByPtrPtr AVDictionary options);


/**
 * Set all the options from a given dictionary on an object.
 *
 * @param obj a struct whose first element is a pointer to AVClass
 * @param options options to process. This dictionary will be freed and replaced
 *                by a new one containing all options not found in obj.
 *                Of course this new dictionary needs to be freed by caller
 *                with av_dict_free().
 * @param search_flags A combination of AV_OPT_SEARCH_*.
 *
 * @return 0 on success, a negative AVERROR if some option was found in obj,
 *         but could not be set.
 *
 * @see av_dict_copy()
 */
public static native int av_opt_set_dict2(Pointer obj, @Cast("AVDictionary**") PointerPointer options, int search_flags);
public static native int av_opt_set_dict2(Pointer obj, @ByPtrPtr AVDictionary options, int search_flags);

/**
 * Extract a key-value pair from the beginning of a string.
 *
 * @param ropts        pointer to the options string, will be updated to
 *                     point to the rest of the string (one of the pairs_sep
 *                     or the final NUL)
 * @param key_val_sep  a 0-terminated list of characters used to separate
 *                     key from value, for example '='
 * @param pairs_sep    a 0-terminated list of characters used to separate
 *                     two pairs from each other, for example ':' or ','
 * @param flags        flags; see the AV_OPT_FLAG_* values below
 * @param rkey         parsed key; must be freed using av_free()
 * @param rval         parsed value; must be freed using av_free()
 *
 * @return  >=0 for success, or a negative value corresponding to an
 *          AVERROR code in case of error; in particular:
 *          AVERROR(EINVAL) if no key is present
 *
 */
public static native int av_opt_get_key_value(@Cast("const char**") PointerPointer ropts,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") PointerPointer rkey, @Cast("char**") PointerPointer rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr BytePointer ropts,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr BytePointer rkey, @Cast("char**") @ByPtrPtr BytePointer rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr ByteBuffer ropts,
                         String key_val_sep, String pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr ByteBuffer rkey, @Cast("char**") @ByPtrPtr ByteBuffer rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr byte[] ropts,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr byte[] rkey, @Cast("char**") @ByPtrPtr byte[] rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr BytePointer ropts,
                         String key_val_sep, String pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr BytePointer rkey, @Cast("char**") @ByPtrPtr BytePointer rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr ByteBuffer ropts,
                         @Cast("const char*") BytePointer key_val_sep, @Cast("const char*") BytePointer pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr ByteBuffer rkey, @Cast("char**") @ByPtrPtr ByteBuffer rval);
public static native int av_opt_get_key_value(@Cast("const char**") @ByPtrPtr byte[] ropts,
                         String key_val_sep, String pairs_sep,
                         @Cast("unsigned") int flags,
                         @Cast("char**") @ByPtrPtr byte[] rkey, @Cast("char**") @ByPtrPtr byte[] rval);

/** enum  */
public static final int

    /**
     * Accept to parse a value without a key; the key will then be returned
     * as NULL.
     */
    AV_OPT_FLAG_IMPLICIT_KEY = 1;

/**
 * \defgroup opt_eval_funcs Evaluating option strings
 * \{
 * This group of functions can be used to evaluate option strings
 * and get numbers out of them. They do the same thing as av_opt_set(),
 * except the result is written into the caller-supplied pointer.
 *
 * @param obj a struct whose first element is a pointer to AVClass.
 * @param o an option for which the string is to be evaluated.
 * @param val string to be evaluated.
 * @param *_out value of the string will be written here.
 *
 * @return 0 on success, a negative number on failure.
 */
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, IntPointer flags_out);
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, String val, IntBuffer flags_out);
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, int[] flags_out);
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, String val, IntPointer flags_out);
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, IntBuffer flags_out);
public static native int av_opt_eval_flags(Pointer obj, @Const AVOption o, String val, int[] flags_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, IntPointer int_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, String val, IntBuffer int_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, int[] int_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, String val, IntPointer int_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, IntBuffer int_out);
public static native int av_opt_eval_int(Pointer obj, @Const AVOption o, String val, int[] int_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, LongPointer int64_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, String val, LongBuffer int64_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, long[] int64_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, String val, LongPointer int64_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, LongBuffer int64_out);
public static native int av_opt_eval_int64(Pointer obj, @Const AVOption o, String val, long[] int64_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, FloatPointer float_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, String val, FloatBuffer float_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, float[] float_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, String val, FloatPointer float_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, FloatBuffer float_out);
public static native int av_opt_eval_float(Pointer obj, @Const AVOption o, String val, float[] float_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, DoublePointer double_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, String val, DoubleBuffer double_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, double[] double_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, String val, DoublePointer double_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, DoubleBuffer double_out);
public static native int av_opt_eval_double(Pointer obj, @Const AVOption o, String val, double[] double_out);
public static native int av_opt_eval_q(Pointer obj, @Const AVOption o, @Cast("const char*") BytePointer val, AVRational q_out);
public static native int av_opt_eval_q(Pointer obj, @Const AVOption o, String val, AVRational q_out);
/**
 * \}
 */

/** Search in possible children of the
                                             given object first. */
public static final int AV_OPT_SEARCH_CHILDREN =   0x0001;
/**
 *  The obj passed to av_opt_find() is fake -- only a double pointer to AVClass
 *  instead of a required pointer to a struct containing AVClass. This is
 *  useful for searching for options without needing to allocate the corresponding
 *  object.
 */
public static final int AV_OPT_SEARCH_FAKE_OBJ =   0x0002;

/**
 *  Allows av_opt_query_ranges and av_opt_query_ranges_default to return more than
 *  one component for certain option types.
 *  @see AVOptionRanges for details.
 */
public static final int AV_OPT_MULTI_COMPONENT_RANGE = 0x1000;

/**
 * Look for an option in an object. Consider only options which
 * have all the specified flags set.
 *
 * @param [in] obj A pointer to a struct whose first element is a
 *                pointer to an AVClass.
 *                Alternatively a double pointer to an AVClass, if
 *                AV_OPT_SEARCH_FAKE_OBJ search flag is set.
 * @param [in] name The name of the option to look for.
 * @param [in] unit When searching for named constants, name of the unit
 *                 it belongs to.
 * @param opt_flags Find only options with all the specified flags set (AV_OPT_FLAG).
 * @param search_flags A combination of AV_OPT_SEARCH_*.
 *
 * @return A pointer to the option found, or NULL if no option
 *         was found.
 *
 * \note Options found with AV_OPT_SEARCH_CHILDREN flag may not be settable
 * directly with av_opt_set(). Use special calls which take an options
 * AVDictionary (e.g. avformat_open_input()) to set options found with this
 * flag.
 */
public static native @Const AVOption av_opt_find(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer unit,
                            int opt_flags, int search_flags);
public static native @Const AVOption av_opt_find(Pointer obj, String name, String unit,
                            int opt_flags, int search_flags);

/**
 * Look for an option in an object. Consider only options which
 * have all the specified flags set.
 *
 * @param [in] obj A pointer to a struct whose first element is a
 *                pointer to an AVClass.
 *                Alternatively a double pointer to an AVClass, if
 *                AV_OPT_SEARCH_FAKE_OBJ search flag is set.
 * @param [in] name The name of the option to look for.
 * @param [in] unit When searching for named constants, name of the unit
 *                 it belongs to.
 * @param opt_flags Find only options with all the specified flags set (AV_OPT_FLAG).
 * @param search_flags A combination of AV_OPT_SEARCH_*.
 * @param [out] target_obj if non-NULL, an object to which the option belongs will be
 * written here. It may be different from obj if AV_OPT_SEARCH_CHILDREN is present
 * in search_flags. This parameter is ignored if search_flags contain
 * AV_OPT_SEARCH_FAKE_OBJ.
 *
 * @return A pointer to the option found, or NULL if no option
 *         was found.
 */
public static native @Const AVOption av_opt_find2(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer unit,
                             int opt_flags, int search_flags, @Cast("void**") PointerPointer target_obj);
public static native @Const AVOption av_opt_find2(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer unit,
                             int opt_flags, int search_flags, @Cast("void**") @ByPtrPtr Pointer target_obj);
public static native @Const AVOption av_opt_find2(Pointer obj, String name, String unit,
                             int opt_flags, int search_flags, @Cast("void**") @ByPtrPtr Pointer target_obj);

/**
 * Iterate over all AVOptions belonging to obj.
 *
 * @param obj an AVOptions-enabled struct or a double pointer to an
 *            AVClass describing it.
 * @param prev result of the previous call to av_opt_next() on this object
 *             or NULL
 * @return next AVOption or NULL
 */
public static native @Const AVOption av_opt_next(Pointer obj, @Const AVOption prev);

/**
 * Iterate over AVOptions-enabled children of obj.
 *
 * @param prev result of a previous call to this function or NULL
 * @return next AVOptions-enabled child or NULL
 */
public static native Pointer av_opt_child_next(Pointer obj, Pointer prev);

/**
 * Iterate over potential AVOptions-enabled children of parent.
 *
 * @param prev result of a previous call to this function or NULL
 * @return AVClass corresponding to next potential child or NULL
 */
public static native @Const AVClass av_opt_child_class_next(@Const AVClass parent, @Const AVClass prev);

/**
 * \defgroup opt_set_funcs Option setting functions
 * \{
 * Those functions set the field of obj with the given name to value.
 *
 * @param [in] obj A struct whose first element is a pointer to an AVClass.
 * @param [in] name the name of the field to set
 * @param [in] val The value to set. In case of av_opt_set() if the field is not
 * of a string type, then the given string is parsed.
 * SI postfixes and some named scalars are supported.
 * If the field is of a numeric type, it has to be a numeric or named
 * scalar. Behavior with more than one scalar and +- infix operators
 * is undefined.
 * If the field is of a flags type, it has to be a sequence of numeric
 * scalars or named flags separated by '+' or '-'. Prefixing a flag
 * with '+' causes it to be set without affecting the other flags;
 * similarly, '-' unsets a flag.
 * @param search_flags flags passed to av_opt_find2. I.e. if AV_OPT_SEARCH_CHILDREN
 * is passed here, then the option may be set on a child of obj.
 *
 * @return 0 if the value has been set, or an AVERROR code in case of
 * error:
 * AVERROR_OPTION_NOT_FOUND if no matching option exists
 * AVERROR(ERANGE) if the value is out of range
 * AVERROR(EINVAL) if the value is not valid
 */
public static native int av_opt_set(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer val, int search_flags);
public static native int av_opt_set(Pointer obj, String name, String val, int search_flags);
public static native int av_opt_set_int(Pointer obj, @Cast("const char*") BytePointer name, long val, int search_flags);
public static native int av_opt_set_int(Pointer obj, String name, long val, int search_flags);
public static native int av_opt_set_double(Pointer obj, @Cast("const char*") BytePointer name, double val, int search_flags);
public static native int av_opt_set_double(Pointer obj, String name, double val, int search_flags);
public static native int av_opt_set_q(Pointer obj, @Cast("const char*") BytePointer name, @ByVal AVRational val, int search_flags);
public static native int av_opt_set_q(Pointer obj, String name, @ByVal AVRational val, int search_flags);
public static native int av_opt_set_bin(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const uint8_t*") BytePointer val, int size, int search_flags);
public static native int av_opt_set_bin(Pointer obj, String name, @Cast("const uint8_t*") ByteBuffer val, int size, int search_flags);
public static native int av_opt_set_bin(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const uint8_t*") byte[] val, int size, int search_flags);
public static native int av_opt_set_bin(Pointer obj, String name, @Cast("const uint8_t*") BytePointer val, int size, int search_flags);
public static native int av_opt_set_bin(Pointer obj, @Cast("const char*") BytePointer name, @Cast("const uint8_t*") ByteBuffer val, int size, int search_flags);
public static native int av_opt_set_bin(Pointer obj, String name, @Cast("const uint8_t*") byte[] val, int size, int search_flags);
public static native int av_opt_set_image_size(Pointer obj, @Cast("const char*") BytePointer name, int w, int h, int search_flags);
public static native int av_opt_set_image_size(Pointer obj, String name, int w, int h, int search_flags);
public static native int av_opt_set_pixel_fmt(Pointer obj, @Cast("const char*") BytePointer name, @Cast("AVPixelFormat") int fmt, int search_flags);
public static native int av_opt_set_pixel_fmt(Pointer obj, String name, @Cast("AVPixelFormat") int fmt, int search_flags);
public static native int av_opt_set_sample_fmt(Pointer obj, @Cast("const char*") BytePointer name, @Cast("AVSampleFormat") int fmt, int search_flags);
public static native int av_opt_set_sample_fmt(Pointer obj, String name, @Cast("AVSampleFormat") int fmt, int search_flags);
public static native int av_opt_set_video_rate(Pointer obj, @Cast("const char*") BytePointer name, @ByVal AVRational val, int search_flags);
public static native int av_opt_set_video_rate(Pointer obj, String name, @ByVal AVRational val, int search_flags);
public static native int av_opt_set_channel_layout(Pointer obj, @Cast("const char*") BytePointer name, long ch_layout, int search_flags);
public static native int av_opt_set_channel_layout(Pointer obj, String name, long ch_layout, int search_flags);
/**
 * \note Any old dictionary present is discarded and replaced with a copy of the new one. The
 * caller still owns val is and responsible for freeing it.
 */
public static native int av_opt_set_dict_val(Pointer obj, @Cast("const char*") BytePointer name, @Const AVDictionary val, int search_flags);
public static native int av_opt_set_dict_val(Pointer obj, String name, @Const AVDictionary val, int search_flags);

/**
 * Set a binary option to an integer list.
 *
 * @param obj    AVClass object to set options on
 * @param name   name of the binary option
 * @param val    pointer to an integer list (must have the correct type with
 *               regard to the contents of the list)
 * @param term   list terminator (usually 0 or -1)
 * @param flags  search flags
 */
// #define av_opt_set_int_list(obj, name, val, term, flags)
//     (av_int_list_length(val, term) > INT_MAX / sizeof(*(val)) ?
//      AVERROR(EINVAL) :
//      av_opt_set_bin(obj, name, (const uint8_t *)(val),
//                     av_int_list_length(val, term) * sizeof(*(val)), flags))

/**
 * \}
 */

/**
 * \defgroup opt_get_funcs Option getting functions
 * \{
 * Those functions get a value of the option with the given name from an object.
 *
 * @param [in] obj a struct whose first element is a pointer to an AVClass.
 * @param [in] name name of the option to get.
 * @param [in] search_flags flags passed to av_opt_find2. I.e. if AV_OPT_SEARCH_CHILDREN
 * is passed here, then the option may be found in a child of obj.
 * @param [out] out_val value of the option will be written here
 * @return >=0 on success, a negative error code otherwise
 */
/**
 * \note the returned string will be av_malloc()ed and must be av_free()ed by the caller
 */
public static native int av_opt_get(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("uint8_t**") PointerPointer out_val);
public static native int av_opt_get(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("uint8_t**") @ByPtrPtr BytePointer out_val);
public static native int av_opt_get(Pointer obj, String name, int search_flags, @Cast("uint8_t**") @ByPtrPtr ByteBuffer out_val);
public static native int av_opt_get(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("uint8_t**") @ByPtrPtr byte[] out_val);
public static native int av_opt_get(Pointer obj, String name, int search_flags, @Cast("uint8_t**") @ByPtrPtr BytePointer out_val);
public static native int av_opt_get(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("uint8_t**") @ByPtrPtr ByteBuffer out_val);
public static native int av_opt_get(Pointer obj, String name, int search_flags, @Cast("uint8_t**") @ByPtrPtr byte[] out_val);
public static native int av_opt_get_int(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, LongPointer out_val);
public static native int av_opt_get_int(Pointer obj, String name, int search_flags, LongBuffer out_val);
public static native int av_opt_get_int(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, long[] out_val);
public static native int av_opt_get_int(Pointer obj, String name, int search_flags, LongPointer out_val);
public static native int av_opt_get_int(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, LongBuffer out_val);
public static native int av_opt_get_int(Pointer obj, String name, int search_flags, long[] out_val);
public static native int av_opt_get_double(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, DoublePointer out_val);
public static native int av_opt_get_double(Pointer obj, String name, int search_flags, DoubleBuffer out_val);
public static native int av_opt_get_double(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, double[] out_val);
public static native int av_opt_get_double(Pointer obj, String name, int search_flags, DoublePointer out_val);
public static native int av_opt_get_double(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, DoubleBuffer out_val);
public static native int av_opt_get_double(Pointer obj, String name, int search_flags, double[] out_val);
public static native int av_opt_get_q(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, AVRational out_val);
public static native int av_opt_get_q(Pointer obj, String name, int search_flags, AVRational out_val);
public static native int av_opt_get_image_size(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, IntPointer w_out, IntPointer h_out);
public static native int av_opt_get_image_size(Pointer obj, String name, int search_flags, IntBuffer w_out, IntBuffer h_out);
public static native int av_opt_get_image_size(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, int[] w_out, int[] h_out);
public static native int av_opt_get_image_size(Pointer obj, String name, int search_flags, IntPointer w_out, IntPointer h_out);
public static native int av_opt_get_image_size(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, IntBuffer w_out, IntBuffer h_out);
public static native int av_opt_get_image_size(Pointer obj, String name, int search_flags, int[] w_out, int[] h_out);
public static native int av_opt_get_pixel_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVPixelFormat*") IntPointer out_fmt);
public static native int av_opt_get_pixel_fmt(Pointer obj, String name, int search_flags, @Cast("AVPixelFormat*") IntBuffer out_fmt);
public static native int av_opt_get_pixel_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVPixelFormat*") int[] out_fmt);
public static native int av_opt_get_pixel_fmt(Pointer obj, String name, int search_flags, @Cast("AVPixelFormat*") IntPointer out_fmt);
public static native int av_opt_get_pixel_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVPixelFormat*") IntBuffer out_fmt);
public static native int av_opt_get_pixel_fmt(Pointer obj, String name, int search_flags, @Cast("AVPixelFormat*") int[] out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVSampleFormat*") IntPointer out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, String name, int search_flags, @Cast("AVSampleFormat*") IntBuffer out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVSampleFormat*") int[] out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, String name, int search_flags, @Cast("AVSampleFormat*") IntPointer out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVSampleFormat*") IntBuffer out_fmt);
public static native int av_opt_get_sample_fmt(Pointer obj, String name, int search_flags, @Cast("AVSampleFormat*") int[] out_fmt);
public static native int av_opt_get_video_rate(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, AVRational out_val);
public static native int av_opt_get_video_rate(Pointer obj, String name, int search_flags, AVRational out_val);
public static native int av_opt_get_channel_layout(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, LongPointer ch_layout);
public static native int av_opt_get_channel_layout(Pointer obj, String name, int search_flags, LongBuffer ch_layout);
public static native int av_opt_get_channel_layout(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, long[] ch_layout);
public static native int av_opt_get_channel_layout(Pointer obj, String name, int search_flags, LongPointer ch_layout);
public static native int av_opt_get_channel_layout(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, LongBuffer ch_layout);
public static native int av_opt_get_channel_layout(Pointer obj, String name, int search_flags, long[] ch_layout);
/**
 * @param [out] out_val The returned dictionary is a copy of the actual value and must
 * be freed with av_dict_free() by the caller
 */
public static native int av_opt_get_dict_val(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @Cast("AVDictionary**") PointerPointer out_val);
public static native int av_opt_get_dict_val(Pointer obj, @Cast("const char*") BytePointer name, int search_flags, @ByPtrPtr AVDictionary out_val);
public static native int av_opt_get_dict_val(Pointer obj, String name, int search_flags, @ByPtrPtr AVDictionary out_val);
/**
 * \}
 */
/**
 * Gets a pointer to the requested field in a struct.
 * This function allows accessing a struct even when its fields are moved or
 * renamed since the application making the access has been compiled,
 *
 * @return a pointer to the field, it can be cast to the correct type and read
 *          or written to.
 */
public static native Pointer av_opt_ptr(@Const AVClass avclass, Pointer obj, @Cast("const char*") BytePointer name);
public static native Pointer av_opt_ptr(@Const AVClass avclass, Pointer obj, String name);

/**
 * Free an AVOptionRanges struct and set it to NULL.
 */
public static native void av_opt_freep_ranges(@Cast("AVOptionRanges**") PointerPointer ranges);
public static native void av_opt_freep_ranges(@ByPtrPtr AVOptionRanges ranges);

/**
 * Get a list of allowed ranges for the given option.
 *
 * The returned list may depend on other fields in obj like for example profile.
 *
 * @param flags is a bitmask of flags, undefined flags should not be set and should be ignored
 *              AV_OPT_SEARCH_FAKE_OBJ indicates that the obj is a double pointer to a AVClass instead of a full instance
 *              AV_OPT_MULTI_COMPONENT_RANGE indicates that function may return more than one component, @see AVOptionRanges
 *
 * The result must be freed with av_opt_freep_ranges.
 *
 * @return number of compontents returned on success, a negative errro code otherwise
 */
public static native int av_opt_query_ranges(@Cast("AVOptionRanges**") PointerPointer arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
public static native int av_opt_query_ranges(@ByPtrPtr AVOptionRanges arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
public static native int av_opt_query_ranges(@ByPtrPtr AVOptionRanges arg0, Pointer obj, String key, int flags);

/**
 * Copy options from src object into dest object.
 *
 * Options that require memory allocation (e.g. string or binary) are malloc'ed in dest object.
 * Original memory allocated for such options is freed unless both src and dest options points to the same memory.
 *
 * @param dest Object to copy from
 * @param src  Object to copy into
 * @return 0 on success, negative on error
 */
public static native int av_opt_copy(Pointer dest, Pointer src);

/**
 * Get a default list of allowed ranges for the given option.
 *
 * This list is constructed without using the AVClass.query_ranges() callback
 * and can be used as fallback from within the callback.
 *
 * @param flags is a bitmask of flags, undefined flags should not be set and should be ignored
 *              AV_OPT_SEARCH_FAKE_OBJ indicates that the obj is a double pointer to a AVClass instead of a full instance
 *              AV_OPT_MULTI_COMPONENT_RANGE indicates that function may return more than one component, @see AVOptionRanges
 *
 * The result must be freed with av_opt_free_ranges.
 *
 * @return number of compontents returned on success, a negative errro code otherwise
 */
public static native int av_opt_query_ranges_default(@Cast("AVOptionRanges**") PointerPointer arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
public static native int av_opt_query_ranges_default(@ByPtrPtr AVOptionRanges arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
public static native int av_opt_query_ranges_default(@ByPtrPtr AVOptionRanges arg0, Pointer obj, String key, int flags);

/**
 * Check if given option is set to its default value.
 *
 * Options o must belong to the obj. This function must not be called to check child's options state.
 * @see av_opt_is_set_to_default_by_name().
 *
 * @param obj  AVClass object to check option on
 * @param o    option to be checked
 * @return     >0 when option is set to its default,
 *              0 when option is not set its default,
 *             <0 on error
 */
public static native int av_opt_is_set_to_default(Pointer obj, @Const AVOption o);

/**
 * Check if given option is set to its default value.
 *
 * @param obj          AVClass object to check option on
 * @param name         option name
 * @param search_flags combination of AV_OPT_SEARCH_*
 * @return             >0 when option is set to its default,
 *                     0 when option is not set its default,
 *                     <0 on error
 */
public static native int av_opt_is_set_to_default_by_name(Pointer obj, @Cast("const char*") BytePointer name, int search_flags);
public static native int av_opt_is_set_to_default_by_name(Pointer obj, String name, int search_flags);


/** Serialize options that are not set to default values only. */
public static final int AV_OPT_SERIALIZE_SKIP_DEFAULTS =              0x00000001;
/** Serialize options that exactly match opt_flags only. */
public static final int AV_OPT_SERIALIZE_OPT_FLAGS_EXACT =            0x00000002;

/**
 * Serialize object's options.
 *
 * Create a string containing object's serialized options.
 * Such string may be passed back to av_opt_set_from_string() in order to restore option values.
 * A key/value or pairs separator occurring in the serialized value or
 * name string are escaped through the av_escape() function.
 *
 * @param [in]  obj           AVClass object to serialize
 * @param [in]  opt_flags     serialize options with all the specified flags set (AV_OPT_FLAG)
 * @param [in]  flags         combination of AV_OPT_SERIALIZE_* flags
 * @param [out] buffer        Pointer to buffer that will be allocated with string containg serialized options.
 *                           Buffer must be freed by the caller when is no longer needed.
 * @param [in]  key_val_sep   character used to separate key from value
 * @param [in]  pairs_sep     character used to separate two pairs from each other
 * @return                   >= 0 on success, negative on error
 * \warning Separators cannot be neither '\\' nor '\0'. They also cannot be the same.
 */
public static native int av_opt_serialize(Pointer obj, int opt_flags, int flags, @Cast("char**") PointerPointer buffer,
                     byte key_val_sep, byte pairs_sep);
public static native int av_opt_serialize(Pointer obj, int opt_flags, int flags, @Cast("char**") @ByPtrPtr BytePointer buffer,
                     byte key_val_sep, byte pairs_sep);
public static native int av_opt_serialize(Pointer obj, int opt_flags, int flags, @Cast("char**") @ByPtrPtr ByteBuffer buffer,
                     byte key_val_sep, byte pairs_sep);
public static native int av_opt_serialize(Pointer obj, int opt_flags, int flags, @Cast("char**") @ByPtrPtr byte[] buffer,
                     byte key_val_sep, byte pairs_sep);
/**
 * \}
 */

// #endif /* AVUTIL_OPT_H */


// Parsed from <libavutil/audioconvert.h>


// #include "version.h"

// #if FF_API_AUDIOCONVERT
// #include "channel_layout.h"
// #endif


// Parsed from <libavutil/pixdesc.h>

/*
 * pixel format descriptor
 * Copyright (c) 2009 Michael Niedermayer <michaelni@gmx.at>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_PIXDESC_H
// #define AVUTIL_PIXDESC_H

// #include <inttypes.h>

// #include "attributes.h"
// #include "pixfmt.h"

public static class AVComponentDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVComponentDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVComponentDescriptor(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVComponentDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVComponentDescriptor position(int position) {
        return (AVComponentDescriptor)super.position(position);
    }

    /**
     * Which of the 4 planes contains the component.
     */
    public native @Cast("uint16_t") @NoOffset short plane(); public native AVComponentDescriptor plane(short plane);

    /**
     * Number of elements between 2 horizontally consecutive pixels minus 1.
     * Elements are bits for bitstream formats, bytes otherwise.
     */
    public native @Cast("uint16_t") @NoOffset short step_minus1(); public native AVComponentDescriptor step_minus1(short step_minus1);

    /**
     * Number of elements before the component of the first pixel plus 1.
     * Elements are bits for bitstream formats, bytes otherwise.
     */
    public native @Cast("uint16_t") @NoOffset short offset_plus1(); public native AVComponentDescriptor offset_plus1(short offset_plus1);

    /**
     * Number of least significant bits that must be shifted away
     * to get the value.
     */
    public native @Cast("uint16_t") @NoOffset short shift(); public native AVComponentDescriptor shift(short shift);

    /**
     * Number of bits in the component minus 1.
     */
    public native @Cast("uint16_t") @NoOffset short depth_minus1(); public native AVComponentDescriptor depth_minus1(short depth_minus1);
}

/**
 * Descriptor that unambiguously describes how the bits of a pixel are
 * stored in the up to 4 data planes of an image. It also stores the
 * subsampling factors and number of components.
 *
 * \note This is separate of the colorspace (RGB, YCbCr, YPbPr, JPEG-style YUV
 *       and all the YUV variants) AVPixFmtDescriptor just stores how values
 *       are stored not what these values represent.
 */
public static class AVPixFmtDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPixFmtDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVPixFmtDescriptor(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPixFmtDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVPixFmtDescriptor position(int position) {
        return (AVPixFmtDescriptor)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer name();
    /** The number of components each pixel has, (1-4) */
    public native @Cast("uint8_t") byte nb_components(); public native AVPixFmtDescriptor nb_components(byte nb_components);

    /**
     * Amount to shift the luma width right to find the chroma width.
     * For YV12 this is 1 for example.
     * chroma_width = -((-luma_width) >> log2_chroma_w)
     * The note above is needed to ensure rounding up.
     * This value only refers to the chroma components.
     */
    /** chroma_width = -((-luma_width )>>log2_chroma_w) */
    public native @Cast("uint8_t") byte log2_chroma_w(); public native AVPixFmtDescriptor log2_chroma_w(byte log2_chroma_w);

    /**
     * Amount to shift the luma height right to find the chroma height.
     * For YV12 this is 1 for example.
     * chroma_height= -((-luma_height) >> log2_chroma_h)
     * The note above is needed to ensure rounding up.
     * This value only refers to the chroma components.
     */
    public native @Cast("uint8_t") byte log2_chroma_h(); public native AVPixFmtDescriptor log2_chroma_h(byte log2_chroma_h);
    public native @Cast("uint8_t") byte flags(); public native AVPixFmtDescriptor flags(byte flags);

    /**
     * Parameters that describe how pixels are packed.
     * If the format has 2 or 4 components, then alpha is last.
     * If the format has 1 or 2 components, then luma is 0.
     * If the format has 3 or 4 components:
     *   if the RGB flag is set then 0 is red, 1 is green and 2 is blue;
     *   otherwise 0 is luma, 1 is chroma-U and 2 is chroma-V.
     */
    public native @ByRef AVComponentDescriptor comp(int i); public native AVPixFmtDescriptor comp(int i, AVComponentDescriptor comp);
    @MemberGetter public native AVComponentDescriptor comp();

    /**
     * Alternative comma-separated names.
     */
    @MemberGetter public native @Cast("const char*") BytePointer alias();
}

/**
 * Pixel format is big-endian.
 */
public static final int AV_PIX_FMT_FLAG_BE =           (1 << 0);
/**
 * Pixel format has a palette in data[1], values are indexes in this palette.
 */
public static final int AV_PIX_FMT_FLAG_PAL =          (1 << 1);
/**
 * All values of a component are bit-wise packed end to end.
 */
public static final int AV_PIX_FMT_FLAG_BITSTREAM =    (1 << 2);
/**
 * Pixel format is an HW accelerated format.
 */
public static final int AV_PIX_FMT_FLAG_HWACCEL =      (1 << 3);
/**
 * At least one pixel component is not in the first data plane.
 */
public static final int AV_PIX_FMT_FLAG_PLANAR =       (1 << 4);
/**
 * The pixel format contains RGB-like data (as opposed to YUV/grayscale).
 */
public static final int AV_PIX_FMT_FLAG_RGB =          (1 << 5);

/**
 * The pixel format is "pseudo-paletted". This means that it contains a
 * fixed palette in the 2nd plane but the palette is fixed/constant for each
 * PIX_FMT. This allows interpreting the data as if it was PAL8, which can
 * in some cases be simpler. Or the data can be interpreted purely based on
 * the pixel format without using the palette.
 * An example of a pseudo-paletted format is AV_PIX_FMT_GRAY8
 */
public static final int AV_PIX_FMT_FLAG_PSEUDOPAL =    (1 << 6);

/**
 * The pixel format has an alpha channel. This is set on all formats that
 * support alpha in some way. The exception is AV_PIX_FMT_PAL8, which can
 * carry alpha as part of the palette. Details are explained in the
 * AVPixelFormat enum, and are also encoded in the corresponding
 * AVPixFmtDescriptor.
 *
 * The alpha is always straight, never pre-multiplied.
 *
 * If a codec or a filter does not support alpha, it should set all alpha to
 * opaque, or use the equivalent pixel formats without alpha component, e.g.
 * AV_PIX_FMT_RGB0 (or AV_PIX_FMT_RGB24 etc.) instead of AV_PIX_FMT_RGBA.
 */
public static final int AV_PIX_FMT_FLAG_ALPHA =        (1 << 7);

// #if FF_API_PIX_FMT
/**
 * @deprecated use the AV_PIX_FMT_FLAG_* flags
 */
public static final int PIX_FMT_BE =        AV_PIX_FMT_FLAG_BE;
public static final int PIX_FMT_PAL =       AV_PIX_FMT_FLAG_PAL;
public static final int PIX_FMT_BITSTREAM = AV_PIX_FMT_FLAG_BITSTREAM;
public static final int PIX_FMT_HWACCEL =   AV_PIX_FMT_FLAG_HWACCEL;
public static final int PIX_FMT_PLANAR =    AV_PIX_FMT_FLAG_PLANAR;
public static final int PIX_FMT_RGB =       AV_PIX_FMT_FLAG_RGB;
public static final int PIX_FMT_PSEUDOPAL = AV_PIX_FMT_FLAG_PSEUDOPAL;
public static final int PIX_FMT_ALPHA =     AV_PIX_FMT_FLAG_ALPHA;
// #endif

// #if FF_API_PIX_FMT_DESC
/**
 * The array of all the pixel format descriptors.
 */
@MemberGetter public static native @Const @Deprecated @ByRef AVPixFmtDescriptor av_pix_fmt_descriptors(int i);
@MemberGetter public static native @Const @Deprecated AVPixFmtDescriptor av_pix_fmt_descriptors();
// #endif

/**
 * Read a line from an image, and write the values of the
 * pixel format component c to dst.
 *
 * @param data the array containing the pointers to the planes of the image
 * @param linesize the array containing the linesizes of the image
 * @param desc the pixel format descriptor for the image
 * @param x the horizontal coordinate of the first pixel to read
 * @param y the vertical coordinate of the first pixel to read
 * @param w the width of the line to read, that is the number of
 * values to write to dst
 * @param read_pal_component if not zero and the format is a paletted
 * format writes the values corresponding to the palette
 * component c in data[1] to dst, rather than the palette indexes in
 * data[0]. The behavior is undefined if the format is not paletted.
 */
public static native void av_read_image_line(@Cast("uint16_t*") ShortPointer dst, @Cast("const uint8_t**") PointerPointer data,
                        @Const IntPointer linesize, @Const AVPixFmtDescriptor desc,
                        int x, int y, int c, int w, int read_pal_component);
public static native void av_read_image_line(@Cast("uint16_t*") ShortPointer dst, @Cast("const uint8_t**") @ByPtrPtr BytePointer data,
                        @Const IntPointer linesize, @Const AVPixFmtDescriptor desc,
                        int x, int y, int c, int w, int read_pal_component);
public static native void av_read_image_line(@Cast("uint16_t*") ShortBuffer dst, @Cast("const uint8_t**") @ByPtrPtr ByteBuffer data,
                        @Const IntBuffer linesize, @Const AVPixFmtDescriptor desc,
                        int x, int y, int c, int w, int read_pal_component);
public static native void av_read_image_line(@Cast("uint16_t*") short[] dst, @Cast("const uint8_t**") @ByPtrPtr byte[] data,
                        @Const int[] linesize, @Const AVPixFmtDescriptor desc,
                        int x, int y, int c, int w, int read_pal_component);

/**
 * Write the values from src to the pixel format component c of an
 * image line.
 *
 * @param src array containing the values to write
 * @param data the array containing the pointers to the planes of the
 * image to write into. It is supposed to be zeroed.
 * @param linesize the array containing the linesizes of the image
 * @param desc the pixel format descriptor for the image
 * @param x the horizontal coordinate of the first pixel to write
 * @param y the vertical coordinate of the first pixel to write
 * @param w the width of the line to write, that is the number of
 * values to write to the image line
 */
public static native void av_write_image_line(@Cast("const uint16_t*") ShortPointer src, @Cast("uint8_t**") PointerPointer data,
                         @Const IntPointer linesize, @Const AVPixFmtDescriptor desc,
                         int x, int y, int c, int w);
public static native void av_write_image_line(@Cast("const uint16_t*") ShortPointer src, @Cast("uint8_t**") @ByPtrPtr BytePointer data,
                         @Const IntPointer linesize, @Const AVPixFmtDescriptor desc,
                         int x, int y, int c, int w);
public static native void av_write_image_line(@Cast("const uint16_t*") ShortBuffer src, @Cast("uint8_t**") @ByPtrPtr ByteBuffer data,
                         @Const IntBuffer linesize, @Const AVPixFmtDescriptor desc,
                         int x, int y, int c, int w);
public static native void av_write_image_line(@Cast("const uint16_t*") short[] src, @Cast("uint8_t**") @ByPtrPtr byte[] data,
                         @Const int[] linesize, @Const AVPixFmtDescriptor desc,
                         int x, int y, int c, int w);

/**
 * Return the pixel format corresponding to name.
 *
 * If there is no pixel format with name name, then looks for a
 * pixel format with the name corresponding to the native endian
 * format of name.
 * For example in a little-endian system, first looks for "gray16",
 * then for "gray16le".
 *
 * Finally if no pixel format has been found, returns AV_PIX_FMT_NONE.
 */
public static native @Cast("AVPixelFormat") int av_get_pix_fmt(@Cast("const char*") BytePointer name);
public static native @Cast("AVPixelFormat") int av_get_pix_fmt(String name);

/**
 * Return the short name for a pixel format, NULL in case pix_fmt is
 * unknown.
 *
 * @see av_get_pix_fmt(), av_get_pix_fmt_string()
 */
public static native @Cast("const char*") BytePointer av_get_pix_fmt_name(@Cast("AVPixelFormat") int pix_fmt);

/**
 * Print in buf the string corresponding to the pixel format with
 * number pix_fmt, or a header if pix_fmt is negative.
 *
 * @param buf the buffer where to write the string
 * @param buf_size the size of buf
 * @param pix_fmt the number of the pixel format to print the
 * corresponding info string, or a negative value to print the
 * corresponding header.
 */
public static native @Cast("char*") BytePointer av_get_pix_fmt_string(@Cast("char*") BytePointer buf, int buf_size,
                            @Cast("AVPixelFormat") int pix_fmt);
public static native @Cast("char*") ByteBuffer av_get_pix_fmt_string(@Cast("char*") ByteBuffer buf, int buf_size,
                            @Cast("AVPixelFormat") int pix_fmt);
public static native @Cast("char*") byte[] av_get_pix_fmt_string(@Cast("char*") byte[] buf, int buf_size,
                            @Cast("AVPixelFormat") int pix_fmt);

/**
 * Return the number of bits per pixel used by the pixel format
 * described by pixdesc. Note that this is not the same as the number
 * of bits per sample.
 *
 * The returned number of bits refers to the number of bits actually
 * used for storing the pixel information, that is padding bits are
 * not counted.
 */
public static native int av_get_bits_per_pixel(@Const AVPixFmtDescriptor pixdesc);

/**
 * Return the number of bits per pixel for the pixel format
 * described by pixdesc, including any padding or unused bits.
 */
public static native int av_get_padded_bits_per_pixel(@Const AVPixFmtDescriptor pixdesc);

/**
 * @return a pixel format descriptor for provided pixel format or NULL if
 * this pixel format is unknown.
 */
public static native @Const AVPixFmtDescriptor av_pix_fmt_desc_get(@Cast("AVPixelFormat") int pix_fmt);

/**
 * Iterate over all pixel format descriptors known to libavutil.
 *
 * @param prev previous descriptor. NULL to get the first descriptor.
 *
 * @return next descriptor or NULL after the last descriptor
 */
public static native @Const AVPixFmtDescriptor av_pix_fmt_desc_next(@Const AVPixFmtDescriptor prev);

/**
 * @return an AVPixelFormat id described by desc, or AV_PIX_FMT_NONE if desc
 * is not a valid pointer to a pixel format descriptor.
 */
public static native @Cast("AVPixelFormat") int av_pix_fmt_desc_get_id(@Const AVPixFmtDescriptor desc);

/**
 * Utility function to access log2_chroma_w log2_chroma_h from
 * the pixel format AVPixFmtDescriptor.
 *
 * See av_get_chroma_sub_sample() for a function that asserts a
 * valid pixel format instead of returning an error code.
 * Its recommended that you use avcodec_get_chroma_sub_sample unless
 * you do check the return code!
 *
 * @param [in]  pix_fmt the pixel format
 * @param [out] h_shift store log2_chroma_w
 * @param [out] v_shift store log2_chroma_h
 *
 * @return 0 on success, AVERROR(ENOSYS) on invalid or unknown pixel format
 */
public static native int av_pix_fmt_get_chroma_sub_sample(@Cast("AVPixelFormat") int pix_fmt,
                                     IntPointer h_shift, IntPointer v_shift);
public static native int av_pix_fmt_get_chroma_sub_sample(@Cast("AVPixelFormat") int pix_fmt,
                                     IntBuffer h_shift, IntBuffer v_shift);
public static native int av_pix_fmt_get_chroma_sub_sample(@Cast("AVPixelFormat") int pix_fmt,
                                     int[] h_shift, int[] v_shift);

/**
 * @return number of planes in pix_fmt, a negative AVERROR if pix_fmt is not a
 * valid pixel format.
 */
public static native int av_pix_fmt_count_planes(@Cast("AVPixelFormat") int pix_fmt);

/**
 * Utility function to swap the endianness of a pixel format.
 *
 * @param [in]  pix_fmt the pixel format
 *
 * @return pixel format with swapped endianness if it exists,
 * otherwise AV_PIX_FMT_NONE
 */
public static native @Cast("AVPixelFormat") int av_pix_fmt_swap_endianness(@Cast("AVPixelFormat") int pix_fmt);

/** loss due to resolution change */
public static final int FF_LOSS_RESOLUTION =  0x0001;
/** loss due to color depth change */
public static final int FF_LOSS_DEPTH =       0x0002;
/** loss due to color space conversion */
public static final int FF_LOSS_COLORSPACE =  0x0004;
/** loss of alpha bits */
public static final int FF_LOSS_ALPHA =       0x0008;
/** loss due to color quantization */
public static final int FF_LOSS_COLORQUANT =  0x0010;
/** loss of chroma (e.g. RGB to gray conversion) */
public static final int FF_LOSS_CHROMA =      0x0020;

/**
 * Compute what kind of losses will occur when converting from one specific
 * pixel format to another.
 * When converting from one pixel format to another, information loss may occur.
 * For example, when converting from RGB24 to GRAY, the color information will
 * be lost. Similarly, other losses occur when converting from some formats to
 * other formats. These losses can involve loss of chroma, but also loss of
 * resolution, loss of color depth, loss due to the color space conversion, loss
 * of the alpha bits or loss due to color quantization.
 * av_get_fix_fmt_loss() informs you about the various types of losses
 * which will occur when converting from one pixel format to another.
 *
 * @param [in] dst_pix_fmt destination pixel format
 * @param [in] src_pix_fmt source pixel format
 * @param [in] has_alpha Whether the source pixel format alpha channel is used.
 * @return Combination of flags informing you what kind of losses will occur
 * (maximum loss for an invalid dst_pix_fmt).
 */
public static native int av_get_pix_fmt_loss(@Cast("AVPixelFormat") int dst_pix_fmt,
                        @Cast("AVPixelFormat") int src_pix_fmt,
                        int has_alpha);

/**
 * Compute what kind of losses will occur when converting from one specific
 * pixel format to another.
 * When converting from one pixel format to another, information loss may occur.
 * For example, when converting from RGB24 to GRAY, the color information will
 * be lost. Similarly, other losses occur when converting from some formats to
 * other formats. These losses can involve loss of chroma, but also loss of
 * resolution, loss of color depth, loss due to the color space conversion, loss
 * of the alpha bits or loss due to color quantization.
 * av_get_fix_fmt_loss() informs you about the various types of losses
 * which will occur when converting from one pixel format to another.
 *
 * @param [in] dst_pix_fmt destination pixel format
 * @param [in] src_pix_fmt source pixel format
 * @param [in] has_alpha Whether the source pixel format alpha channel is used.
 * @return Combination of flags informing you what kind of losses will occur
 * (maximum loss for an invalid dst_pix_fmt).
 */
public static native @Cast("AVPixelFormat") int av_find_best_pix_fmt_of_2(@Cast("AVPixelFormat") int dst_pix_fmt1, @Cast("AVPixelFormat") int dst_pix_fmt2,
                                             @Cast("AVPixelFormat") int src_pix_fmt, int has_alpha, IntPointer loss_ptr);
public static native @Cast("AVPixelFormat") int av_find_best_pix_fmt_of_2(@Cast("AVPixelFormat") int dst_pix_fmt1, @Cast("AVPixelFormat") int dst_pix_fmt2,
                                             @Cast("AVPixelFormat") int src_pix_fmt, int has_alpha, IntBuffer loss_ptr);
public static native @Cast("AVPixelFormat") int av_find_best_pix_fmt_of_2(@Cast("AVPixelFormat") int dst_pix_fmt1, @Cast("AVPixelFormat") int dst_pix_fmt2,
                                             @Cast("AVPixelFormat") int src_pix_fmt, int has_alpha, int[] loss_ptr);

/**
 * @return the name for provided color range or NULL if unknown.
 */
public static native @Cast("const char*") BytePointer av_color_range_name(@Cast("AVColorRange") int range);

/**
 * @return the name for provided color primaries or NULL if unknown.
 */
public static native @Cast("const char*") BytePointer av_color_primaries_name(@Cast("AVColorPrimaries") int primaries);

/**
 * @return the name for provided color transfer or NULL if unknown.
 */
public static native @Cast("const char*") BytePointer av_color_transfer_name(@Cast("AVColorTransferCharacteristic") int transfer);

/**
 * @return the name for provided color space or NULL if unknown.
 */
public static native @Cast("const char*") BytePointer av_color_space_name(@Cast("AVColorSpace") int space);

/**
 * @return the name for provided chroma location or NULL if unknown.
 */
public static native @Cast("const char*") BytePointer av_chroma_location_name(@Cast("AVChromaLocation") int location);

// #endif /* AVUTIL_PIXDESC_H */


// Parsed from <libavutil/imgutils.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_IMGUTILS_H
// #define AVUTIL_IMGUTILS_H

/**
 * \file
 * misc image utilities
 *
 * \addtogroup lavu_picture
 * \{
 */

// #include "avutil.h"
// #include "pixdesc.h"
// #include "rational.h"

/**
 * Compute the max pixel step for each plane of an image with a
 * format described by pixdesc.
 *
 * The pixel step is the distance in bytes between the first byte of
 * the group of bytes which describe a pixel component and the first
 * byte of the successive group in the same plane for the same
 * component.
 *
 * @param max_pixsteps an array which is filled with the max pixel step
 * for each plane. Since a plane may contain different pixel
 * components, the computed max_pixsteps[plane] is relative to the
 * component in the plane with the max pixel step.
 * @param max_pixstep_comps an array which is filled with the component
 * for each plane which has the max pixel step. May be NULL.
 */
public static native void av_image_fill_max_pixsteps(IntPointer max_pixsteps, IntPointer max_pixstep_comps,
                                @Const AVPixFmtDescriptor pixdesc);
public static native void av_image_fill_max_pixsteps(IntBuffer max_pixsteps, IntBuffer max_pixstep_comps,
                                @Const AVPixFmtDescriptor pixdesc);
public static native void av_image_fill_max_pixsteps(int[] max_pixsteps, int[] max_pixstep_comps,
                                @Const AVPixFmtDescriptor pixdesc);

/**
 * Compute the size of an image line with format pix_fmt and width
 * width for the plane plane.
 *
 * @return the computed size in bytes
 */
public static native int av_image_get_linesize(@Cast("AVPixelFormat") int pix_fmt, int width, int plane);

/**
 * Fill plane linesizes for an image with pixel format pix_fmt and
 * width width.
 *
 * @param linesizes array to be filled with the linesize for each plane
 * @return >= 0 in case of success, a negative error code otherwise
 */
public static native int av_image_fill_linesizes(IntPointer linesizes, @Cast("AVPixelFormat") int pix_fmt, int width);
public static native int av_image_fill_linesizes(IntBuffer linesizes, @Cast("AVPixelFormat") int pix_fmt, int width);
public static native int av_image_fill_linesizes(int[] linesizes, @Cast("AVPixelFormat") int pix_fmt, int width);

/**
 * Fill plane data pointers for an image with pixel format pix_fmt and
 * height height.
 *
 * @param data pointers array to be filled with the pointer for each image plane
 * @param ptr the pointer to a buffer which will contain the image
 * @param linesizes the array containing the linesize for each
 * plane, should be filled by av_image_fill_linesizes()
 * @return the size in bytes required for the image buffer, a negative
 * error code in case of failure
 */
public static native int av_image_fill_pointers(@Cast("uint8_t**") PointerPointer data, @Cast("AVPixelFormat") int pix_fmt, int height,
                           @Cast("uint8_t*") BytePointer ptr, @Const IntPointer linesizes);
public static native int av_image_fill_pointers(@Cast("uint8_t**") @ByPtrPtr BytePointer data, @Cast("AVPixelFormat") int pix_fmt, int height,
                           @Cast("uint8_t*") BytePointer ptr, @Const IntPointer linesizes);
public static native int av_image_fill_pointers(@Cast("uint8_t**") @ByPtrPtr ByteBuffer data, @Cast("AVPixelFormat") int pix_fmt, int height,
                           @Cast("uint8_t*") ByteBuffer ptr, @Const IntBuffer linesizes);
public static native int av_image_fill_pointers(@Cast("uint8_t**") @ByPtrPtr byte[] data, @Cast("AVPixelFormat") int pix_fmt, int height,
                           @Cast("uint8_t*") byte[] ptr, @Const int[] linesizes);

/**
 * Allocate an image with size w and h and pixel format pix_fmt, and
 * fill pointers and linesizes accordingly.
 * The allocated image buffer has to be freed by using
 * av_freep(&pointers[0]).
 *
 * @param align the value to use for buffer size alignment
 * @return the size in bytes required for the image buffer, a negative
 * error code in case of failure
 */
public static native int av_image_alloc(@Cast("uint8_t**") PointerPointer pointers, IntPointer linesizes,
                   int w, int h, @Cast("AVPixelFormat") int pix_fmt, int align);
public static native int av_image_alloc(@Cast("uint8_t**") @ByPtrPtr BytePointer pointers, IntPointer linesizes,
                   int w, int h, @Cast("AVPixelFormat") int pix_fmt, int align);
public static native int av_image_alloc(@Cast("uint8_t**") @ByPtrPtr ByteBuffer pointers, IntBuffer linesizes,
                   int w, int h, @Cast("AVPixelFormat") int pix_fmt, int align);
public static native int av_image_alloc(@Cast("uint8_t**") @ByPtrPtr byte[] pointers, int[] linesizes,
                   int w, int h, @Cast("AVPixelFormat") int pix_fmt, int align);

/**
 * Copy image plane from src to dst.
 * That is, copy "height" number of lines of "bytewidth" bytes each.
 * The first byte of each successive line is separated by *_linesize
 * bytes.
 *
 * bytewidth must be contained by both absolute values of dst_linesize
 * and src_linesize, otherwise the function behavior is undefined.
 *
 * @param dst_linesize linesize for the image plane in dst
 * @param src_linesize linesize for the image plane in src
 */
public static native void av_image_copy_plane(@Cast("uint8_t*") BytePointer dst, int dst_linesize,
                         @Cast("const uint8_t*") BytePointer src, int src_linesize,
                         int bytewidth, int height);
public static native void av_image_copy_plane(@Cast("uint8_t*") ByteBuffer dst, int dst_linesize,
                         @Cast("const uint8_t*") ByteBuffer src, int src_linesize,
                         int bytewidth, int height);
public static native void av_image_copy_plane(@Cast("uint8_t*") byte[] dst, int dst_linesize,
                         @Cast("const uint8_t*") byte[] src, int src_linesize,
                         int bytewidth, int height);

/**
 * Copy image in src_data to dst_data.
 *
 * @param dst_linesizes linesizes for the image in dst_data
 * @param src_linesizes linesizes for the image in src_data
 */
public static native void av_image_copy(@Cast("uint8_t**") PointerPointer dst_data, IntPointer dst_linesizes,
                   @Cast("const uint8_t**") PointerPointer src_data, @Const IntPointer src_linesizes,
                   @Cast("AVPixelFormat") int pix_fmt, int width, int height);
public static native void av_image_copy(@Cast("uint8_t**") @ByPtrPtr BytePointer dst_data, IntPointer dst_linesizes,
                   @Cast("const uint8_t**") @ByPtrPtr BytePointer src_data, @Const IntPointer src_linesizes,
                   @Cast("AVPixelFormat") int pix_fmt, int width, int height);
public static native void av_image_copy(@Cast("uint8_t**") @ByPtrPtr ByteBuffer dst_data, IntBuffer dst_linesizes,
                   @Cast("const uint8_t**") @ByPtrPtr ByteBuffer src_data, @Const IntBuffer src_linesizes,
                   @Cast("AVPixelFormat") int pix_fmt, int width, int height);
public static native void av_image_copy(@Cast("uint8_t**") @ByPtrPtr byte[] dst_data, int[] dst_linesizes,
                   @Cast("const uint8_t**") @ByPtrPtr byte[] src_data, @Const int[] src_linesizes,
                   @Cast("AVPixelFormat") int pix_fmt, int width, int height);

/**
 * Setup the data pointers and linesizes based on the specified image
 * parameters and the provided array.
 *
 * The fields of the given image are filled in by using the src
 * address which points to the image data buffer. Depending on the
 * specified pixel format, one or multiple image data pointers and
 * line sizes will be set.  If a planar format is specified, several
 * pointers will be set pointing to the different picture planes and
 * the line sizes of the different planes will be stored in the
 * lines_sizes array. Call with src == NULL to get the required
 * size for the src buffer.
 *
 * To allocate the buffer and fill in the dst_data and dst_linesize in
 * one call, use av_image_alloc().
 *
 * @param dst_data      data pointers to be filled in
 * @param dst_linesizes linesizes for the image in dst_data to be filled in
 * @param src           buffer which will contain or contains the actual image data, can be NULL
 * @param pix_fmt       the pixel format of the image
 * @param width         the width of the image in pixels
 * @param height        the height of the image in pixels
 * @param align         the value used in src for linesize alignment
 * @return the size in bytes required for src, a negative error code
 * in case of failure
 */
public static native int av_image_fill_arrays(@Cast("uint8_t**") PointerPointer dst_data, IntPointer dst_linesize,
                         @Cast("const uint8_t*") BytePointer src,
                         @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_fill_arrays(@Cast("uint8_t**") @ByPtrPtr BytePointer dst_data, IntPointer dst_linesize,
                         @Cast("const uint8_t*") BytePointer src,
                         @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_fill_arrays(@Cast("uint8_t**") @ByPtrPtr ByteBuffer dst_data, IntBuffer dst_linesize,
                         @Cast("const uint8_t*") ByteBuffer src,
                         @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_fill_arrays(@Cast("uint8_t**") @ByPtrPtr byte[] dst_data, int[] dst_linesize,
                         @Cast("const uint8_t*") byte[] src,
                         @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);

/**
 * Return the size in bytes of the amount of data required to store an
 * image with the given parameters.
 *
 * @param [in] align the assumed linesize alignment
 */
public static native int av_image_get_buffer_size(@Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);

/**
 * Copy image data from an image into a buffer.
 *
 * av_image_get_buffer_size() can be used to compute the required size
 * for the buffer to fill.
 *
 * @param dst           a buffer into which picture data will be copied
 * @param dst_size      the size in bytes of dst
 * @param src_data      pointers containing the source image data
 * @param src_linesizes linesizes for the image in src_data
 * @param pix_fmt       the pixel format of the source image
 * @param width         the width of the source image in pixels
 * @param height        the height of the source image in pixels
 * @param align         the assumed linesize alignment for dst
 * @return the number of bytes written to dst, or a negative value
 * (error code) on error
 */
public static native int av_image_copy_to_buffer(@Cast("uint8_t*") BytePointer dst, int dst_size,
                            @Cast("const uint8_t*const*") PointerPointer src_data, @Const IntPointer src_linesize,
                            @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_copy_to_buffer(@Cast("uint8_t*") BytePointer dst, int dst_size,
                            @Cast("const uint8_t*const*") @ByPtrPtr BytePointer src_data, @Const IntPointer src_linesize,
                            @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_copy_to_buffer(@Cast("uint8_t*") ByteBuffer dst, int dst_size,
                            @Cast("const uint8_t*const*") @ByPtrPtr ByteBuffer src_data, @Const IntBuffer src_linesize,
                            @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);
public static native int av_image_copy_to_buffer(@Cast("uint8_t*") byte[] dst, int dst_size,
                            @Cast("const uint8_t*const*") @ByPtrPtr byte[] src_data, @Const int[] src_linesize,
                            @Cast("AVPixelFormat") int pix_fmt, int width, int height, int align);

/**
 * Check if the given dimension of an image is valid, meaning that all
 * bytes of the image can be addressed with a signed int.
 *
 * @param w the width of the picture
 * @param h the height of the picture
 * @param log_offset the offset to sum to the log level for logging with log_ctx
 * @param log_ctx the parent logging context, it may be NULL
 * @return >= 0 if valid, a negative error code otherwise
 */
public static native int av_image_check_size(@Cast("unsigned int") int w, @Cast("unsigned int") int h, int log_offset, Pointer log_ctx);

/**
 * Check if the given sample aspect ratio of an image is valid.
 *
 * It is considered invalid if the denominator is 0 or if applying the ratio
 * to the image size would make the smaller dimension less than 1. If the
 * sar numerator is 0, it is considered unknown and will return as valid.
 *
 * @param w width of the image
 * @param h height of the image
 * @param sar sample aspect ratio of the image
 * @return 0 if valid, a negative AVERROR code otherwise
 */
public static native int av_image_check_sar(@Cast("unsigned int") int w, @Cast("unsigned int") int h, @ByVal AVRational sar);

/**
 * \}
 */


// #endif /* AVUTIL_IMGUTILS_H */


// Parsed from <libavutil/downmix_info.h>

/*
 * Copyright (c) 2014 Tim Walker <tdskywalker@gmail.com>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_DOWNMIX_INFO_H
// #define AVUTIL_DOWNMIX_INFO_H

// #include "frame.h"

/**
 * \file
 * audio downmix medatata
 */

/**
 * \addtogroup lavu_audio
 * \{
 */

/**
 * \defgroup downmix_info Audio downmix metadata
 * \{
 */

/**
 * Possible downmix types.
 */
/** enum AVDownmixType */
public static final int
    /** Not indicated. */
    AV_DOWNMIX_TYPE_UNKNOWN = 0,
    /** Lo/Ro 2-channel downmix (Stereo). */
    AV_DOWNMIX_TYPE_LORO = 1,
    /** Lt/Rt 2-channel downmix, Dolby Surround compatible. */
    AV_DOWNMIX_TYPE_LTRT = 2,
    /** Lt/Rt 2-channel downmix, Dolby Pro Logic II compatible. */
    AV_DOWNMIX_TYPE_DPLII = 3,
    /** Number of downmix types. Not part of ABI. */
    AV_DOWNMIX_TYPE_NB = 4;

/**
 * This structure describes optional metadata relevant to a downmix procedure.
 *
 * All fields are set by the decoder to the value indicated in the audio
 * bitstream (if present), or to a "sane" default otherwise.
 */
public static class AVDownmixInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDownmixInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVDownmixInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDownmixInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVDownmixInfo position(int position) {
        return (AVDownmixInfo)super.position(position);
    }

    /**
     * Type of downmix preferred by the mastering engineer.
     */
    public native @Cast("AVDownmixType") int preferred_downmix_type(); public native AVDownmixInfo preferred_downmix_type(int preferred_downmix_type);

    /**
     * Absolute scale factor representing the nominal level of the center
     * channel during a regular downmix.
     */
    public native double center_mix_level(); public native AVDownmixInfo center_mix_level(double center_mix_level);

    /**
     * Absolute scale factor representing the nominal level of the center
     * channel during an Lt/Rt compatible downmix.
     */
    public native double center_mix_level_ltrt(); public native AVDownmixInfo center_mix_level_ltrt(double center_mix_level_ltrt);

    /**
     * Absolute scale factor representing the nominal level of the surround
     * channels during a regular downmix.
     */
    public native double surround_mix_level(); public native AVDownmixInfo surround_mix_level(double surround_mix_level);

    /**
     * Absolute scale factor representing the nominal level of the surround
     * channels during an Lt/Rt compatible downmix.
     */
    public native double surround_mix_level_ltrt(); public native AVDownmixInfo surround_mix_level_ltrt(double surround_mix_level_ltrt);

    /**
     * Absolute scale factor representing the level at which the LFE data is
     * mixed into L/R channels during downmixing.
     */
    public native double lfe_mix_level(); public native AVDownmixInfo lfe_mix_level(double lfe_mix_level);
}

/**
 * Get a frame's AV_FRAME_DATA_DOWNMIX_INFO side data for editing.
 *
 * If the side data is absent, it is created and added to the frame.
 *
 * @param frame the frame for which the side data is to be obtained or created
 *
 * @return the AVDownmixInfo structure to be edited by the caller, or NULL if
 *         the structure cannot be allocated.
 */
public static native AVDownmixInfo av_downmix_info_update_side_data(AVFrame frame);

/**
 * \}
 */

/**
 * \}
 */

// #endif /* AVUTIL_DOWNMIX_INFO_H */


// Parsed from <libavutil/stereo3d.h>

/*
 * Copyright (c) 2013 Vittorio Giovara <vittorio.giovara@gmail.com>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_STEREO3D_H
// #define AVUTIL_STEREO3D_H

// #include <stdint.h>

// #include "frame.h"

/**
 * List of possible 3D Types
 */
/** enum AVStereo3DType */
public static final int
    /**
     * Video is not stereoscopic (and metadata has to be there).
     */
    AV_STEREO3D_2D = 0,

    /**
     * Views are next to each other.
     *
     *    LLLLRRRR
     *    LLLLRRRR
     *    LLLLRRRR
     *    ...
     */
    AV_STEREO3D_SIDEBYSIDE = 1,

    /**
     * Views are on top of each other.
     *
     *    LLLLLLLL
     *    LLLLLLLL
     *    RRRRRRRR
     *    RRRRRRRR
     */
    AV_STEREO3D_TOPBOTTOM = 2,

    /**
     * Views are alternated temporally.
     *
     *     frame0   frame1   frame2   ...
     *    LLLLLLLL RRRRRRRR LLLLLLLL
     *    LLLLLLLL RRRRRRRR LLLLLLLL
     *    LLLLLLLL RRRRRRRR LLLLLLLL
     *    ...      ...      ...
     */
    AV_STEREO3D_FRAMESEQUENCE = 3,

    /**
     * Views are packed in a checkerboard-like structure per pixel.
     *
     *    LRLRLRLR
     *    RLRLRLRL
     *    LRLRLRLR
     *    ...
     */
    AV_STEREO3D_CHECKERBOARD = 4,

    /**
     * Views are next to each other, but when upscaling
     * apply a checkerboard pattern.
     *
     *     LLLLRRRR          L L L L    R R R R
     *     LLLLRRRR    =>     L L L L  R R R R
     *     LLLLRRRR          L L L L    R R R R
     *     LLLLRRRR           L L L L  R R R R
     */
    AV_STEREO3D_SIDEBYSIDE_QUINCUNX = 5,

    /**
     * Views are packed per line, as if interlaced.
     *
     *    LLLLLLLL
     *    RRRRRRRR
     *    LLLLLLLL
     *    ...
     */
    AV_STEREO3D_LINES = 6,

    /**
     * Views are packed per column.
     *
     *    LRLRLRLR
     *    LRLRLRLR
     *    LRLRLRLR
     *    ...
     */
    AV_STEREO3D_COLUMNS = 7;


/**
 * Inverted views, Right/Bottom represents the left view.
 */
public static final int AV_STEREO3D_FLAG_INVERT =     (1 << 0);

/**
 * Stereo 3D type: this structure describes how two videos are packed
 * within a single video surface, with additional information as needed.
 *
 * \note The struct must be allocated with av_stereo3d_alloc() and
 *       its size is not a part of the public ABI.
 */
public static class AVStereo3D extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVStereo3D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVStereo3D(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVStereo3D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVStereo3D position(int position) {
        return (AVStereo3D)super.position(position);
    }

    /**
     * How views are packed within the video.
     */
    public native @Cast("AVStereo3DType") int type(); public native AVStereo3D type(int type);

    /**
     * Additional information about the frame packing.
     */
    public native int flags(); public native AVStereo3D flags(int flags);
}

/**
 * Allocate an AVStereo3D structure and set its fields to default values.
 * The resulting struct can be freed using av_freep().
 *
 * @return An AVStereo3D filled with default values or NULL on failure.
 */
public static native AVStereo3D av_stereo3d_alloc();

/**
 * Allocate a complete AVFrameSideData and add it to the frame.
 *
 * @param frame The frame which side data is added to.
 *
 * @return The AVStereo3D structure to be filled by caller.
 */
public static native AVStereo3D av_stereo3d_create_side_data(AVFrame frame);

// #endif /* AVUTIL_STEREO3D_H */


// Parsed from <libavutil/ffversion.h>

// #ifndef AVUTIL_FFVERSION_H
// #define AVUTIL_FFVERSION_H
public static final String FFMPEG_VERSION = "2.8.4";
// #endif /* AVUTIL_FFVERSION_H */


// Parsed from <libavutil/motion_vector.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVUTIL_MOTION_VECTOR_H
// #define AVUTIL_MOTION_VECTOR_H

// #include <stdint.h>

public static class AVMotionVector extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVMotionVector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVMotionVector(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVMotionVector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVMotionVector position(int position) {
        return (AVMotionVector)super.position(position);
    }

    /**
     * Where the current macroblock comes from; negative value when it comes
     * from the past, positive value when it comes from the future.
     * XXX: set exact relative ref frame reference instead of a +/- 1 "direction".
     */
    public native int source(); public native AVMotionVector source(int source);
    /**
     * Width and height of the block.
     */
    public native @Cast("uint8_t") byte w(); public native AVMotionVector w(byte w);
    public native @Cast("uint8_t") byte h(); public native AVMotionVector h(byte h);
    /**
     * Absolute source position. Can be outside the frame area.
     */
    public native short src_x(); public native AVMotionVector src_x(short src_x);
    public native short src_y(); public native AVMotionVector src_y(short src_y);
    /**
     * Absolute destination position. Can be outside the frame area.
     */
    public native short dst_x(); public native AVMotionVector dst_x(short dst_x);
    public native short dst_y(); public native AVMotionVector dst_y(short dst_y);
    /**
     * Extra flag information.
     * Currently unused.
     */
    public native @Cast("uint64_t") long flags(); public native AVMotionVector flags(long flags);
}

// #endif /* AVUTIL_MOTION_VECTOR_H */


// Parsed from <libavutil/fifo.h>

/*
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * a very simple circular buffer FIFO implementation
 */

// #ifndef AVUTIL_FIFO_H
// #define AVUTIL_FIFO_H

// #include <stdint.h>
// #include "avutil.h"
// #include "attributes.h"

public static class AVFifoBuffer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFifoBuffer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVFifoBuffer(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFifoBuffer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVFifoBuffer position(int position) {
        return (AVFifoBuffer)super.position(position);
    }

    public native @Cast("uint8_t*") BytePointer buffer(); public native AVFifoBuffer buffer(BytePointer buffer);
    public native @Cast("uint8_t*") BytePointer rptr(); public native AVFifoBuffer rptr(BytePointer rptr);
    public native @Cast("uint8_t*") BytePointer wptr(); public native AVFifoBuffer wptr(BytePointer wptr);
    public native @Cast("uint8_t*") BytePointer end(); public native AVFifoBuffer end(BytePointer end);
    public native @Cast("uint32_t") int rndx(); public native AVFifoBuffer rndx(int rndx);
    public native @Cast("uint32_t") int wndx(); public native AVFifoBuffer wndx(int wndx);
}

/**
 * Initialize an AVFifoBuffer.
 * @param size of FIFO
 * @return AVFifoBuffer or NULL in case of memory allocation failure
 */
public static native AVFifoBuffer av_fifo_alloc(@Cast("unsigned int") int size);

/**
 * Initialize an AVFifoBuffer.
 * @param nmemb number of elements
 * @param size  size of the single element
 * @return AVFifoBuffer or NULL in case of memory allocation failure
 */
public static native AVFifoBuffer av_fifo_alloc_array(@Cast("size_t") long nmemb, @Cast("size_t") long size);

/**
 * Free an AVFifoBuffer.
 * @param f AVFifoBuffer to free
 */
public static native void av_fifo_free(AVFifoBuffer f);

/**
 * Free an AVFifoBuffer and reset pointer to NULL.
 * @param f AVFifoBuffer to free
 */
public static native void av_fifo_freep(@Cast("AVFifoBuffer**") PointerPointer f);
public static native void av_fifo_freep(@ByPtrPtr AVFifoBuffer f);

/**
 * Reset the AVFifoBuffer to the state right after av_fifo_alloc, in particular it is emptied.
 * @param f AVFifoBuffer to reset
 */
public static native void av_fifo_reset(AVFifoBuffer f);

/**
 * Return the amount of data in bytes in the AVFifoBuffer, that is the
 * amount of data you can read from it.
 * @param f AVFifoBuffer to read from
 * @return size
 */
public static native int av_fifo_size(@Const AVFifoBuffer f);

/**
 * Return the amount of space in bytes in the AVFifoBuffer, that is the
 * amount of data you can write into it.
 * @param f AVFifoBuffer to write into
 * @return size
 */
public static native int av_fifo_space(@Const AVFifoBuffer f);

/**
 * Feed data from an AVFifoBuffer to a user-supplied callback.
 * Similar as av_fifo_gereric_read but without discarding data.
 * @param f AVFifoBuffer to read from
 * @param buf_size number of bytes to read
 * @param func generic read function
 * @param dest data destination
 */
public static class Func_Pointer_Pointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func_Pointer_Pointer_int(Pointer p) { super(p); }
    protected Func_Pointer_Pointer_int() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, Pointer arg1, int arg2);
}
public static native int av_fifo_generic_peek(AVFifoBuffer f, Pointer dest, int buf_size, Func_Pointer_Pointer_int func);

/**
 * Feed data from an AVFifoBuffer to a user-supplied callback.
 * @param f AVFifoBuffer to read from
 * @param buf_size number of bytes to read
 * @param func generic read function
 * @param dest data destination
 */
public static native int av_fifo_generic_read(AVFifoBuffer f, Pointer dest, int buf_size, Func_Pointer_Pointer_int func);

/**
 * Feed data from a user-supplied callback to an AVFifoBuffer.
 * @param f AVFifoBuffer to write to
 * @param src data source; non-const since it may be used as a
 * modifiable context by the function defined in func
 * @param size number of bytes to write
 * @param func generic write function; the first parameter is src,
 * the second is dest_buf, the third is dest_buf_size.
 * func must return the number of bytes written to dest_buf, or <= 0 to
 * indicate no more data available to write.
 * If func is NULL, src is interpreted as a simple byte array for source data.
 * @return the number of bytes written to the FIFO
 */
public static class Int_func_Pointer_Pointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Int_func_Pointer_Pointer_int(Pointer p) { super(p); }
    protected Int_func_Pointer_Pointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0, Pointer arg1, int arg2);
}
public static native int av_fifo_generic_write(AVFifoBuffer f, Pointer src, int size, Int_func_Pointer_Pointer_int func);

/**
 * Resize an AVFifoBuffer.
 * In case of reallocation failure, the old FIFO is kept unchanged.
 *
 * @param f AVFifoBuffer to resize
 * @param size new AVFifoBuffer size in bytes
 * @return <0 for failure, >=0 otherwise
 */
public static native int av_fifo_realloc2(AVFifoBuffer f, @Cast("unsigned int") int size);

/**
 * Enlarge an AVFifoBuffer.
 * In case of reallocation failure, the old FIFO is kept unchanged.
 * The new fifo size may be larger than the requested size.
 *
 * @param f AVFifoBuffer to resize
 * @param additional_space the amount of space in bytes to allocate in addition to av_fifo_size()
 * @return <0 for failure, >=0 otherwise
 */
public static native int av_fifo_grow(AVFifoBuffer f, @Cast("unsigned int") int additional_space);

/**
 * Read and discard the specified amount of data from an AVFifoBuffer.
 * @param f AVFifoBuffer to read from
 * @param size amount of data to read in bytes
 */
public static native void av_fifo_drain(AVFifoBuffer f, int size);

/**
 * Return a pointer to the data stored in a FIFO buffer at a certain offset.
 * The FIFO buffer is not modified.
 *
 * @param f    AVFifoBuffer to peek at, f must be non-NULL
 * @param offs an offset in bytes, its absolute value must be less
 *             than the used buffer size or the returned pointer will
 *             point outside to the buffer data.
 *             The used buffer size can be checked with av_fifo_size().
 */
public static native @Cast("uint8_t*") BytePointer av_fifo_peek2(@Const AVFifoBuffer f, int offs);

// #endif /* AVUTIL_FIFO_H */


// Parsed from <libavutil/audio_fifo.h>

/*
 * Audio FIFO
 * Copyright (c) 2012 Justin Ruggles <justin.ruggles@gmail.com>
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * \file
 * Audio FIFO Buffer
 */

// #ifndef AVUTIL_AUDIO_FIFO_H
// #define AVUTIL_AUDIO_FIFO_H

// #include "avutil.h"
// #include "fifo.h"
// #include "samplefmt.h"

/**
 * \addtogroup lavu_audio
 * \{
 *
 * \defgroup lavu_audiofifo Audio FIFO Buffer
 * \{
 */

/**
 * Context for an Audio FIFO Buffer.
 *
 * - Operates at the sample level rather than the byte level.
 * - Supports multiple channels with either planar or packed sample format.
 * - Automatic reallocation when writing to a full buffer.
 */
@Opaque public static class AVAudioFifo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVAudioFifo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVAudioFifo(Pointer p) { super(p); }
}

/**
 * Free an AVAudioFifo.
 *
 * @param af  AVAudioFifo to free
 */
public static native void av_audio_fifo_free(AVAudioFifo af);

/**
 * Allocate an AVAudioFifo.
 *
 * @param sample_fmt  sample format
 * @param channels    number of channels
 * @param nb_samples  initial allocation size, in samples
 * @return            newly allocated AVAudioFifo, or NULL on error
 */
public static native AVAudioFifo av_audio_fifo_alloc(@Cast("AVSampleFormat") int sample_fmt, int channels,
                                 int nb_samples);

/**
 * Reallocate an AVAudioFifo.
 *
 * @param af          AVAudioFifo to reallocate
 * @param nb_samples  new allocation size, in samples
 * @return            0 if OK, or negative AVERROR code on failure
 */
public static native int av_audio_fifo_realloc(AVAudioFifo af, int nb_samples);

/**
 * Write data to an AVAudioFifo.
 *
 * The AVAudioFifo will be reallocated automatically if the available space
 * is less than nb_samples.
 *
 * @see enum AVSampleFormat
 * The documentation for AVSampleFormat describes the data layout.
 *
 * @param af          AVAudioFifo to write to
 * @param data        audio data plane pointers
 * @param nb_samples  number of samples to write
 * @return            number of samples actually written, or negative AVERROR
 *                    code on failure. If successful, the number of samples
 *                    actually written will always be nb_samples.
 */
public static native int av_audio_fifo_write(AVAudioFifo af, @Cast("void**") PointerPointer data, int nb_samples);
public static native int av_audio_fifo_write(AVAudioFifo af, @Cast("void**") @ByPtrPtr Pointer data, int nb_samples);

/**
 * Peek data from an AVAudioFifo.
 *
 * @see enum AVSampleFormat
 * The documentation for AVSampleFormat describes the data layout.
 *
 * @param af          AVAudioFifo to read from
 * @param data        audio data plane pointers
 * @param nb_samples  number of samples to peek
 * @return            number of samples actually peek, or negative AVERROR code
 *                    on failure. The number of samples actually peek will not
 *                    be greater than nb_samples, and will only be less than
 *                    nb_samples if av_audio_fifo_size is less than nb_samples.
 */
public static native int av_audio_fifo_peek(AVAudioFifo af, @Cast("void**") PointerPointer data, int nb_samples);
public static native int av_audio_fifo_peek(AVAudioFifo af, @Cast("void**") @ByPtrPtr Pointer data, int nb_samples);

/**
 * Read data from an AVAudioFifo.
 *
 * @see enum AVSampleFormat
 * The documentation for AVSampleFormat describes the data layout.
 *
 * @param af          AVAudioFifo to read from
 * @param data        audio data plane pointers
 * @param nb_samples  number of samples to read
 * @return            number of samples actually read, or negative AVERROR code
 *                    on failure. The number of samples actually read will not
 *                    be greater than nb_samples, and will only be less than
 *                    nb_samples if av_audio_fifo_size is less than nb_samples.
 */
public static native int av_audio_fifo_read(AVAudioFifo af, @Cast("void**") PointerPointer data, int nb_samples);
public static native int av_audio_fifo_read(AVAudioFifo af, @Cast("void**") @ByPtrPtr Pointer data, int nb_samples);

/**
 * Drain data from an AVAudioFifo.
 *
 * Removes the data without reading it.
 *
 * @param af          AVAudioFifo to drain
 * @param nb_samples  number of samples to drain
 * @return            0 if OK, or negative AVERROR code on failure
 */
public static native int av_audio_fifo_drain(AVAudioFifo af, int nb_samples);

/**
 * Reset the AVAudioFifo buffer.
 *
 * This empties all data in the buffer.
 *
 * @param af  AVAudioFifo to reset
 */
public static native void av_audio_fifo_reset(AVAudioFifo af);

/**
 * Get the current number of samples in the AVAudioFifo available for reading.
 *
 * @param af  the AVAudioFifo to query
 * @return    number of samples available for reading
 */
public static native int av_audio_fifo_size(AVAudioFifo af);

/**
 * Get the current number of samples in the AVAudioFifo available for writing.
 *
 * @param af  the AVAudioFifo to query
 * @return    number of samples available for writing
 */
public static native int av_audio_fifo_space(AVAudioFifo af);

/**
 * \}
 * \}
 */

// #endif /* AVUTIL_AUDIO_FIFO_H */


// Parsed from log_callback.h

/*
 * Copyright (C) 2015 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// #include <libavutil/log.h>

public static class LogCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LogCallback(Pointer p) { super(p); }
    protected LogCallback() { allocate(); }
    private native void allocate();
    public native void call(int level, @Cast("const char*") BytePointer msg);
}

public static native LogCallback logCallback(); public static native void logCallback(LogCallback logCallback);

public static native void log_callback(Pointer ptr, int level, @Cast("const char*") BytePointer fmt, @ByVal @Cast("va_list*") Pointer vl);
public static native void log_callback(Pointer ptr, int level, String fmt, @ByVal @Cast("va_list*") Pointer vl);

public static native void setLogCallback(LogCallback lc);


}
