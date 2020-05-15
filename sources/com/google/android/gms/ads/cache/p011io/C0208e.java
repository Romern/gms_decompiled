package com.google.android.gms.ads.cache.p011io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.cache.io.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0208e implements Closeable {

    /* renamed from: a */
    public final Object f7872a = new Object();

    /* renamed from: b */
    public final File f7873b;

    /* renamed from: c */
    public OutputStream f7874c;

    /* renamed from: d */
    public RandomAccessFile f7875d;

    /* renamed from: e */
    public final Set f7876e;

    /* renamed from: f */
    public long f7877f;

    public C0208e(File file) {
        this.f7873b = file;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f7875d = randomAccessFile;
        this.f7877f = randomAccessFile.length();
        this.f7876e = new HashSet();
    }

    /* renamed from: a */
    public final long mo6411a() {
        long j;
        synchronized (this.f7872a) {
            mo6416e();
            j = this.f7877f;
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo6412b() {
        boolean z;
        synchronized (this.f7872a) {
            mo6416e();
            z = this.f7874c != null;
        }
        return z;
    }

    /* renamed from: c */
    public final OutputStream mo6413c() {
        C0207d dVar;
        synchronized (this.f7872a) {
            mo6416e();
            OutputStream outputStream = this.f7874c;
            if (outputStream != null) {
                srz.m36171a(outputStream);
            }
            mo6417f();
            this.f7875d.setLength(0);
            this.f7877f = 0;
            dVar = new C0207d(this);
            this.f7874c = dVar;
        }
        return dVar;
    }

    public void close() {
        synchronized (this.f7872a) {
            mo6416e();
            mo6417f();
            this.f7875d.close();
            this.f7875d = null;
        }
    }

    /* renamed from: d */
    public void mo6415d() {
        throw null;
    }

    /* renamed from: e */
    public final void mo6416e() {
        if (this.f7875d == null) {
            throw new IOException("StreamingFile is closed; no further operations are valid");
        }
    }

    /* renamed from: f */
    public final void mo6417f() {
        for (InputStream inputStream : this.f7876e) {
            srz.m36171a((Closeable) inputStream);
        }
        this.f7876e.clear();
    }
}
