/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import org.junit.Assert;
import org.junit.Test;
import org.scijava.nativelib.NativeLoader;

public class ZiflistTest {
    static {
        try {
            NativeLoader.loadLibrary("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    @Test
    public void test () {
        Ziflist.test (false);
    }
}
