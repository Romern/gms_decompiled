package com.google.android.gms.ads.cache;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.ads.cache.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0202h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InputStream f7854a;

    /* renamed from: b */
    final /* synthetic */ long f7855b;

    /* renamed from: c */
    final /* synthetic */ OutputStream f7856c;

    public C0202h(InputStream inputStream, long j, OutputStream outputStream) {
        this.f7854a = inputStream;
        this.f7855b = j;
        this.f7856c = outputStream;
    }

    public final void run() {
        try {
            this.f7854a.skip(this.f7855b);
            srz.m36168a(this.f7854a, this.f7856c, true);
        } catch (IOException e) {
            srz.m36171a((Closeable) this.f7854a);
            srz.m36171a(this.f7856c);
        }
    }
}
