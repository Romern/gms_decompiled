package com.google.android.gms.ads.cache;

import com.google.android.gms.ads.cache.p011io.C0208e;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.Closeable;

/* renamed from: com.google.android.gms.ads.cache.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0197c implements Closeable {

    /* renamed from: a */
    public final byte[] f7840a;

    /* renamed from: b */
    public C0217p f7841b;

    /* renamed from: c */
    public C0208e f7842c;

    /* renamed from: d */
    public final /* synthetic */ C0198d f7843d;

    /* renamed from: e */
    private boolean f7844e;

    /* renamed from: f */
    private int f7845f;

    public C0197c(C0198d dVar, byte[] bArr, C0217p pVar) {
        this.f7843d = dVar;
        this.f7845f = dVar.f7851f;
        this.f7840a = bArr;
        this.f7841b = pVar;
    }

    /* renamed from: a */
    public final void mo6385a() {
        boolean z;
        C0208e eVar;
        synchronized (this.f7843d.f7847b) {
            try {
                if (!this.f7844e) {
                    int i = this.f7845f;
                    C0198d dVar = this.f7843d;
                    int i2 = dVar.f7851f;
                    if (i < i2) {
                        this.f7845f = i2;
                        this.f7841b = dVar.mo6387a(this.f7840a);
                    }
                    C0217p pVar = this.f7841b;
                    if (pVar != null && this.f7842c == null) {
                        this.f7842c = this.f7843d.mo6391c(pVar);
                    }
                    if (this.f7841b == null && (eVar = this.f7842c) != null) {
                        srz.m36171a(eVar);
                        this.f7842c = null;
                    }
                }
                z = false;
                if (!(this.f7841b == null || this.f7842c == null || this.f7844e)) {
                    z = true;
                }
            } catch (C0200f e) {
                C0633h.m5669b("Cannot get latest snapshot: !", e);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z) {
            return;
        }
        throw new C0200f("CacheEntry is no longer valid.");
    }

    public final void close() {
        synchronized (this.f7843d.f7847b) {
            if (!this.f7844e) {
                this.f7844e = true;
                this.f7841b = null;
                C0208e eVar = this.f7842c;
                if (eVar != null) {
                    srz.m36171a(eVar);
                    this.f7842c = null;
                }
                this.f7843d.f7850e.remove(this);
            }
        }
    }
}
