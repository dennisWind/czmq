/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import org.scijava.nativelib.NativeLoader;

public class Zstr {
    static {
        try {
            NativeLoader.loadLibrary("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    public long self;
    /*
    Receive C string from socket. Caller must free returned string using
    zstr_free(). Returns NULL if the context is being terminated or the
    process was interrupted.
    */
    native static String __recv (long source);
    public static String recv (long source) {
        return __recv (source);
    }
    /*
    De-compress and receive C string from socket, received as a message
    with two frames: size of the uncompressed string, and the string itself.
    Caller must free returned string using zstr_free(). Returns NULL if the
    context is being terminated or the process was interrupted.
    */
    native static String __recvCompress (long source);
    public static String recvCompress (long source) {
        return __recvCompress (source);
    }
    /*
    Send a C string to a socket, as a frame. The string is sent without
    trailing null byte; to read this you can use zstr_recv, or a similar
    method that adds a null terminator on the received string. String
    may be NULL, which is sent as "".
    */
    native static int __send (long dest, String string);
    public static int send (long dest, String string) {
        return __send (dest, string);
    }
    /*
    Send a C string to a socket, as zstr_send(), with a MORE flag, so that
    you can send further strings in the same multi-part message.
    */
    native static int __sendm (long dest, String string);
    public static int sendm (long dest, String string) {
        return __sendm (dest, string);
    }
    /*
    Send a formatted string to a socket. Note that you should NOT use
    user-supplied strings in the format (they may contain '%' which
    will create security holes).
    */
    native static int __sendf (long dest, String format);
    public static int sendf (long dest, String format) {
        return __sendf (dest, format);
    }
    /*
    Send a formatted string to a socket, as for zstr_sendf(), with a
    MORE flag, so that you can send further strings in the same multi-part
    message.
    */
    native static int __sendfm (long dest, String format);
    public static int sendfm (long dest, String format) {
        return __sendfm (dest, format);
    }
    /*
    Send a series of strings (until NULL) as multipart data
    Returns 0 if the strings could be sent OK, or -1 on error.
    */
    native static int __sendx (long dest, String string);
    public static int sendx (long dest, String string []) {
        return __sendx (dest, string [0]);
    }
    /*
    Compress and send a C string to a socket, as a message with two frames:
    size of the uncompressed string, and the string itself. The string is
    sent without trailing null byte; to read this you can use
    zstr_recv_compress, or a similar method that de-compresses and adds a
    null terminator on the received string.
    */
    native static int __sendCompress (long dest, String string);
    public static int sendCompress (long dest, String string) {
        return __sendCompress (dest, string);
    }
    /*
    Compress and send a C string to a socket, as zstr_send_compress(),
    with a MORE flag, so that you can send further strings in the same
    multi-part message.
    */
    native static int __sendmCompress (long dest, String string);
    public static int sendmCompress (long dest, String string) {
        return __sendmCompress (dest, string);
    }
    /*
    Accepts a void pointer and returns a fresh character string. If source
    is null, returns an empty string.
    */
    native static String __str (long source);
    public static String str (long source) {
        return __str (source);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}
