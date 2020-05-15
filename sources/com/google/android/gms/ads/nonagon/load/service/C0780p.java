package com.google.android.gms.ads.nonagon.load.service;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0403p;
import com.google.android.gms.ads.internal.flag.C0408u;
import com.google.android.gms.ads.internal.p012js.function.C0474b;
import com.google.android.gms.ads.internal.p012js.function.C0481i;
import com.google.android.gms.ads.internal.p012js.function.C0484l;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0543d;
import com.google.android.gms.ads.internal.request.C0545f;
import com.google.android.gms.ads.internal.request.C0546g;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.request.service.C0571u;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.nonagon.C0747a;
import com.google.android.gms.ads.nonagon.signals.C0785b;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import com.google.android.gms.ads.nonagon.signals.C0790g;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0798ag;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0824f;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0827i;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0844z;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import com.google.android.gms.ads.nonagon.util.concurrent.C0856i;
import com.google.android.gms.ads.nonagon.util.concurrent.C0862o;
import com.google.android.gms.ads.nonagon.util.concurrent.C0863p;
import com.google.android.gms.ads.nonagon.util.event.C0864a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0780p extends C0543d {

    /* renamed from: a */
    public final C0571u f9201a;

    /* renamed from: b */
    public final HashMap f9202b;

    /* renamed from: c */
    private final Context f9203c;

    /* renamed from: d */
    private final Executor f9204d;

    /* renamed from: e */
    private final C0747a f9205e;

    public C0780p(Context context, Executor executor, C0747a aVar, C0571u uVar, HashMap hashMap) {
        C0371o.m5339a(context);
        this.f9203c = context;
        this.f9204d = executor;
        this.f9201a = uVar;
        this.f9205e = aVar;
        this.f9202b = hashMap;
    }

    /* renamed from: a */
    private static bqgg m5963a(bqgg bqgg, C0863p pVar, C0484l lVar) {
        return pVar.mo7093a(C0864a.BUILD_URL, bqgg).mo7090a(lVar.mo6672a("AFMA_getAdDictionary", C0481i.f8467b, C0770f.f9188a)).mo7089a();
    }

    /* renamed from: a */
    public final AdResponseParcel mo6728a(AdRequestInfoParcel adRequestInfoParcel) {
        return null;
    }

    /* renamed from: a */
    public final void mo6729a(AdRequestInfoParcel adRequestInfoParcel, C0545f fVar) {
    }

    /* renamed from: b */
    public final void mo6732b(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        bqgg bqgg;
        NonagonRequestParcel nonagonRequestParcel2 = nonagonRequestParcel;
        int callingUid = Binder.getCallingUid();
        C0484l a = C0387d.m5370h().mo6671a(this.f9203c, VersionInfoParcel.m5635a());
        if (!((Boolean) C0408u.f8366a.mo6621a()).booleanValue()) {
            bqgg = bqga.m112777a((Throwable) new Exception("Signal collection disabled."));
        } else {
            C0824f a2 = this.f9205e.mo7041a(nonagonRequestParcel2, callingUid);
            C0592a a3 = a2.f9289j.mo10847a();
            Object a4 = a2.f9289j.f16647i.mo6445a();
            C0827i b = a2.mo7070b();
            C0798ag a5 = a2.mo7069a();
            cayo b2 = cayx.m127580b(a2.f9281b);
            cayo b3 = cayx.m127580b(a2.f9282c);
            cayo b4 = cayx.m127580b(a2.f9283d);
            cayo b5 = cayx.m127580b(a2.f9284e);
            cayo b6 = cayx.m127580b(a2.f9285f);
            cayo b7 = cayx.m127580b(a2.f9286g);
            cayo b8 = cayx.m127580b(a2.f9287h);
            cayo b9 = cayx.m127580b(a2.f9288i);
            bqgj b10 = C0851d.m6032b();
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a2.f9289j.f16643e.mo6445a();
            C0824f fVar = a2;
            HashSet hashSet = new HashSet();
            hashSet.add((C0844z) a4);
            hashSet.add(b);
            hashSet.add(a5);
            if (((Boolean) C0371o.f8244av.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b2.mo16713a());
            }
            if (((Boolean) C0371o.f8245aw.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b3.mo16713a());
            }
            if (((Boolean) C0371o.f8246ax.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b4.mo16713a());
            }
            if (((Boolean) C0371o.f8247ay.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b5.mo16713a());
            }
            if (!a3.mo6776a() && ((Boolean) C0371o.f8248az.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b6.mo16713a());
            }
            if (((Boolean) C0371o.f8216aC.mo6604a()).booleanValue()) {
                hashSet.add(new C0785b((C0787d) b7.mo16713a(), ((Long) C0371o.f8225ac.mo6604a()).longValue(), scheduledExecutorService));
            }
            if (((Boolean) C0371o.f8217aD.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b8.mo16713a());
            }
            if (((Boolean) C0371o.f8218aE.mo6604a()).booleanValue()) {
                hashSet.add((C0787d) b9.mo16713a());
            }
            C0790g gVar2 = new C0790g(b10, hashSet);
            cazf.m127593a(gVar2, "Cannot return null from a non-@Nullable @Provides method");
            C0474b a6 = a.mo6672a("google.afma.request.getSignals", C0481i.f8467b, C0481i.f8468c);
            C0862o a7 = fVar.mo7071c().mo7093a(C0864a.GET_SIGNALS, bqga.m112775a(nonagonRequestParcel.f8692a)).mo7090a(new C0773i(gVar2));
            bqgg = a7.f9369a.mo7093a(C0864a.JS_SIGNALS, a7.mo7089a()).mo7090a(a6).mo7089a();
        }
        m5965a(bqgg, gVar);
    }

    /* renamed from: c */
    public final void mo6733c(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        bqgg bqgg;
        int callingUid = Binder.getCallingUid();
        if (!((Boolean) C0403p.f8356a.mo6621a()).booleanValue()) {
            bqgg = bqga.m112777a((Throwable) new Exception("Split request is disabled."));
        } else {
            PoolConfiguration poolConfiguration = nonagonRequestParcel.f8701j;
            if (poolConfiguration == null) {
                bqgg = bqga.m112777a((Throwable) new Exception("Pool configuration missing from request."));
            } else if (poolConfiguration.f9344b == 0 || poolConfiguration.f9345c == 0) {
                bqgg = bqga.m112777a((Throwable) new Exception("Caching is disabled."));
            } else {
                C0484l a = C0387d.m5370h().mo6671a(this.f9203c, VersionInfoParcel.m5635a());
                C0824f a2 = this.f9205e.mo7041a(nonagonRequestParcel, callingUid);
                C0863p c = a2.mo7071c();
                bqgg a3 = m5964a(nonagonRequestParcel, c, a2);
                bqgg a4 = m5963a(a3, c, a);
                bqgg = c.mo7092a(C0864a.GET_URL_AND_CACHE_KEY, a3, a4).mo7087a(new C0772h(this, a4, a3)).mo7089a();
            }
        }
        m5965a(bqgg, gVar);
    }

    /* renamed from: a */
    private static bqgg m5964a(NonagonRequestParcel nonagonRequestParcel, C0863p pVar, C0824f fVar) {
        C0768d dVar = new C0768d(fVar);
        return pVar.mo7093a(C0864a.GMS_SIGNALS, bqga.m112775a(nonagonRequestParcel.f8692a)).mo7090a(dVar).mo7091a(C0769e.f9187a).mo7089a();
    }

    /* renamed from: a */
    private static final void m5965a(bqgg bqgg, C0546g gVar) {
        bqga.m112781a(bqdx.m112674a(bqgg, new C0774j(), C0645d.f8973a), new C0776l(gVar), C0645d.f8977e);
    }

    /* renamed from: a */
    public final void mo6730a(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        C0856i iVar;
        C0777m mVar;
        int callingUid = Binder.getCallingUid();
        C0484l a = C0387d.m5370h().mo6671a(this.f9203c, VersionInfoParcel.m5635a());
        C0824f a2 = this.f9205e.mo7041a(nonagonRequestParcel, callingUid);
        C0474b a3 = a.mo6672a("google.afma.response.normalize", C0779o.f9197d, C0481i.f8468c);
        C0783s sVar = new C0783s(this.f9203c, nonagonRequestParcel.f8693b.f8949a, nonagonRequestParcel.f8698g, nonagonRequestParcel.f8694c);
        C0863p c = a2.mo7071c();
        C0777m mVar2 = null;
        if (!((Boolean) C0403p.f8356a.mo6621a()).booleanValue()) {
            String str = nonagonRequestParcel.f8702k;
            if (str != null) {
                str.isEmpty();
            }
        } else {
            String str2 = nonagonRequestParcel.f8702k;
            if (!(str2 == null || str2.isEmpty() || (mVar = (C0777m) this.f9202b.remove(nonagonRequestParcel.f8702k)) == null)) {
                mVar2 = mVar;
            }
        }
        if (mVar2 == null) {
            bqgg a4 = m5964a(nonagonRequestParcel, c, a2);
            bqgg a5 = m5963a(a4, c, a);
            C0856i a6 = c.mo7092a(C0864a.HTTP, a5, a4).mo7087a(new C0765a(a4, a5)).mo7091a(sVar).mo7089a();
            iVar = c.mo7092a(C0864a.PRE_PROCESS, a4, a5, a6).mo7087a(new C0766b(a6, a4, a5)).mo7090a(a3).mo7089a();
        } else {
            C0856i a7 = c.mo7093a(C0864a.HTTP, bqga.m112775a(new C0781q(mVar2.f9196b, mVar2.f9195a))).mo7091a(sVar).mo7089a();
            bqgg a8 = bqga.m112775a(mVar2);
            iVar = c.mo7092a(C0864a.PRE_PROCESS, a7, a8).mo7087a(new C0767c(a7, a8)).mo7090a(a3).mo7089a();
        }
        m5965a(iVar, gVar);
        iVar.mo741a(new C0771g(this), this.f9204d);
    }

    /* renamed from: a */
    public final void mo6731a(String str, C0546g gVar) {
        bqgg bqgg;
        if (!((Boolean) C0403p.f8356a.mo6621a()).booleanValue()) {
            bqgg = bqga.m112777a((Throwable) new Exception("Split request is disabled."));
        } else {
            C0775k kVar = new C0775k();
            if (((C0777m) this.f9202b.remove(str)) == null) {
                String valueOf = String.valueOf(str);
                bqgg = bqga.m112777a((Throwable) new Exception(valueOf.length() == 0 ? new String("URL to be removed not found for cache key: ") : "URL to be removed not found for cache key: ".concat(valueOf)));
            } else {
                bqgg = bqga.m112775a(kVar);
            }
        }
        m5965a(bqgg, gVar);
    }
}
