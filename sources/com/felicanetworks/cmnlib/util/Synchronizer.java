package com.felicanetworks.cmnlib.util;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Synchronizer {
    private boolean flag;
    protected final Object lock;

    public Synchronizer() {
        this(new Object());
    }

    public void notifyThread() {
        synchronized (this.lock) {
            this.flag = true;
            this.lock.notify();
        }
    }

    public void waitThread() {
        synchronized (this.lock) {
            while (!this.flag) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.flag = false;
        }
    }

    public Synchronizer(Object obj) {
        this.flag = false;
        this.lock = obj;
    }
}
