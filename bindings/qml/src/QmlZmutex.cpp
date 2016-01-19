/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/

#include "QmlZmutex.h"


///
//  Lock mutex
void QmlZmutex::lock () {
    zmutex_lock (self);
};

///
//  Unlock mutex
void QmlZmutex::unlock () {
    zmutex_unlock (self);
};

///
//  Try to lock mutex
int QmlZmutex::tryLock () {
    return zmutex_try_lock (self);
};


QObject* QmlZmutex::qmlAttachedProperties(QObject* object) {
    return new QmlZmutexAttached(object);
}


///
//  Self test of this class.
void QmlZmutexAttached::test (bool verbose) {
    zmutex_test (verbose);
};

///
//  Create a new mutex container
QmlZmutex *QmlZmutexAttached::construct () {
    QmlZmutex *qmlSelf = new QmlZmutex ();
    qmlSelf->self = zmutex_new ();
    return qmlSelf;
};

///
//  Destroy a mutex container
void QmlZmutexAttached::destruct (QmlZmutex *qmlSelf) {
    zmutex_destroy (&qmlSelf->self);
};

/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/