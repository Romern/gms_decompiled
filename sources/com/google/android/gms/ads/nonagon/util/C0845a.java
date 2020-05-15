package com.google.android.gms.ads.nonagon.util;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: com.google.android.gms.ads.nonagon.util.a */
public final /* synthetic */ class C0845a implements Runnable {

    /* renamed from: a */
    private final InputStream f9341a;

    /* renamed from: b */
    private final ParcelFileDescriptor f9342b;

    public C0845a(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f9341a = inputStream;
        this.f9342b = parcelFileDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0011, B:19:0x0022] */
    public final void run() {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        InputStream inputStream = this.f9341a;
        try {
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f9342b);
            srz.m36172a(inputStream, autoCloseOutputStream);
            autoCloseOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        throw th;
    }
}
