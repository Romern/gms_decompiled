package com.google.android.gms.ads.httpcache;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.httpcache.C0433f;
import com.google.android.gms.ads.internal.httpcache.C0435h;
import com.google.android.gms.ads.internal.httpcache.HttpRequestParcel;
import com.google.android.gms.ads.internal.util.C0677y;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.ads.httpcache.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0262a extends C0435h implements aaai {

    /* renamed from: a */
    final C0268g f7969a;

    public C0262a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7969a = C0268g.m5146a(applicationContext != null ? applicationContext : context);
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo6478a(HttpRequestParcel httpRequestParcel) {
        C0268g gVar = this.f7969a;
        if (!C0677y.m5747a(httpRequestParcel.f8384a)) {
            return null;
        }
        try {
            return (ParcelFileDescriptor) gVar.mo6482a(httpRequestParcel).get();
        } catch (InterruptedException e) {
            Thread.interrupted();
            return null;
        } catch (ExecutionException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo6479a(HttpRequestParcel httpRequestParcel, C0433f fVar) {
        C0268g gVar = this.f7969a;
        if (!C0677y.m5747a(httpRequestParcel.f8384a)) {
            gVar.mo6483a(fVar, null);
        }
        bqga.m112781a(gVar.mo6482a(httpRequestParcel), new C0267f(gVar, fVar), C0268g.f7976a);
    }
}
