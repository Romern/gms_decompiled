package com.google.android.gms.ads.httpcache;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.httpcache.C0433f;

/* renamed from: com.google.android.gms.ads.httpcache.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0267f implements bqfp {

    /* renamed from: a */
    final /* synthetic */ C0433f f7974a;

    /* renamed from: b */
    final /* synthetic */ C0268g f7975b;

    public C0267f(C0268g gVar, C0433f fVar) {
        this.f7975b = gVar;
        this.f7974a = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f7975b.mo6483a(this.f7974a, (ParcelFileDescriptor) obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f7975b.mo6483a(this.f7974a, null);
    }
}
