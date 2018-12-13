/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import org.scijava.nativelib.NativeLoader;

public class Zpoller implements AutoCloseable{
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
    Create new poller, specifying zero or more readers. The list of
    readers ends in a NULL. Each reader can be a zsock_t instance, a
    zactor_t instance, a libzmq socket (void *), or a file handle.
    */
    native static long __new (long reader);
    public Zpoller (long reader []) {
        /*  TODO: if __new fails, self is null...            */
        self = __new (reader [0]);
    }
    public Zpoller (long pointer) {
        self = pointer;
    }
    /*
    Destroy a poller
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Add a reader to be polled. Returns 0 if OK, -1 on failure. The reader may
    be a libzmq void * socket, a zsock_t instance, or a zactor_t instance.
    */
    native static int __add (long self, long reader);
    public int add (long reader) {
        return __add (self, reader);
    }
    /*
    Remove a reader from the poller; returns 0 if OK, -1 on failure. The reader
    must have been passed during construction, or in an zpoller_add () call.
    */
    native static int __remove (long self, long reader);
    public int remove (long reader) {
        return __remove (self, reader);
    }
    /*
    By default the poller stops if the process receives a SIGINT or SIGTERM
    signal. This makes it impossible to shut-down message based architectures
    like zactors. This method lets you switch off break handling. The default
    nonstop setting is off (false).
    */
    native static void __setNonstop (long self, boolean nonstop);
    public void setNonstop (boolean nonstop) {
        __setNonstop (self, nonstop);
    }
    /*
    Poll the registered readers for I/O, return first reader that has input.
    The reader will be a libzmq void * socket, or a zsock_t or zactor_t
    instance as specified in zpoller_new/zpoller_add. The timeout should be
    zero or greater, or -1 to wait indefinitely. Socket priority is defined
    by their order in the poll list. If you need a balanced poll, use the low
    level zmq_poll method directly. If the poll call was interrupted (SIGINT),
    or the ZMQ context was destroyed, or the timeout expired, returns NULL.
    You can test the actual exit condition by calling zpoller_expired () and
    zpoller_terminated (). The timeout is in msec.
    */
    native static long __wait (long self, int timeout);
    public long Wait (int timeout) {
        return __wait (self, timeout);
    }
    /*
    Return true if the last zpoller_wait () call ended because the timeout
    expired, without any error.
    */
    native static boolean __expired (long self);
    public boolean expired () {
        return __expired (self);
    }
    /*
    Return true if the last zpoller_wait () call ended because the process
    was interrupted, or the parent context was destroyed.
    */
    native static boolean __terminated (long self);
    public boolean terminated () {
        return __terminated (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}
