package com.google.android.gms.leveldb;

import java.io.Closeable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class NativeObject implements Closeable {

    /* renamed from: a */
    private int f79287a = 0;
    protected volatile long mPtr = 0;

    protected NativeObject(long j) {
        if (j != 0) {
            this.mPtr = j;
            this.f79287a++;
            return;
        }
        throw new OutOfMemoryError();
    }

    /* access modifiers changed from: protected */
    public void assertOpen() {
        if (this.mPtr == 0) {
            throw new IllegalStateException();
        }
    }

    public synchronized void close() {
        unref();
    }

    /* access modifiers changed from: protected */
    public abstract void closeNativeObject();

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mPtr != 0) {
            closeNativeObject();
            this.mPtr = 0;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    public synchronized void ref() {
        this.f79287a++;
    }

    /* access modifiers changed from: protected */
    public synchronized void unref() {
        int i = this.f79287a - 1;
        this.f79287a = i;
        if (i == 0) {
            closeNativeObject();
            this.mPtr = 0;
        } else if (i < 0) {
            throw new IllegalStateException();
        }
    }
}
