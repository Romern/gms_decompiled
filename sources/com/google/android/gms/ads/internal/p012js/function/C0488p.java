package com.google.android.gms.ads.internal.p012js.function;

import com.google.android.gms.ads.internal.p012js.C0445aa;
import com.google.android.gms.ads.internal.p012js.C0459ao;
import com.google.android.gms.ads.internal.p012js.C0464at;
import com.google.android.gms.ads.internal.p012js.C0465au;
import com.google.android.gms.ads.internal.p012js.C0508z;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.js.function.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0488p implements C0474b {

    /* renamed from: a */
    public final C0476d f8481a;

    /* renamed from: b */
    public final C0477e f8482b;

    /* renamed from: c */
    public final String f8483c;

    /* renamed from: d */
    private final C0465au f8484d;

    public C0488p(C0465au auVar, String str, C0477e eVar, C0476d dVar) {
        this.f8484d = auVar;
        this.f8483c = str;
        this.f8482b = eVar;
        this.f8481a = dVar;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        return mo6670b(obj);
    }

    /* renamed from: b */
    public final bqgg mo6670b(Object obj) {
        C0459ao aoVar;
        C0648g a = C0648g.m5689a();
        C0465au auVar = this.f8484d;
        synchronized (auVar.f8443a) {
            synchronized (auVar.f8443a) {
                C0464at atVar = auVar.f8448f;
                if (atVar != null && auVar.f8449g == 0) {
                    atVar.mo6864a(new C0508z(auVar), C0445aa.f8407a);
                }
            }
            C0464at atVar2 = auVar.f8448f;
            if (atVar2 != null) {
                if (atVar2.mo6867f() != -1) {
                    int i = auVar.f8449g;
                    if (i == 0) {
                        aoVar = auVar.f8448f.mo6652a();
                    } else if (i == 1) {
                        auVar.f8449g = 2;
                        auVar.mo6656a();
                        aoVar = auVar.f8448f.mo6652a();
                    } else {
                        aoVar = auVar.f8448f.mo6652a();
                    }
                }
            }
            auVar.f8449g = 2;
            auVar.f8448f = auVar.mo6656a();
            aoVar = auVar.f8448f.mo6652a();
        }
        aoVar.mo6864a(new C0485m(this, aoVar, obj, a), new C0486n(a, aoVar));
        return a;
    }

    /* renamed from: a */
    public final Object mo6669a(Object obj, long j) {
        try {
            return mo6670b(obj).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new C0473a(e);
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            throw new C0473a(e2);
        }
    }
}
