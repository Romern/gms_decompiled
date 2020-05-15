package p000;

import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: het */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class het {

    /* renamed from: a */
    public static final adcb f19617a = adca.m50150a(hes.f19616a);

    /* renamed from: b */
    public final qws f19618b = new qws(rpr.m34216b(), "IDENTITY_GMSCORE", null);

    /* renamed from: c */
    private final ScheduledExecutorService f19619c = snp.m35703a(1, 9);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo12446a(hep hep, String str) {
        try {
            hez hez = new hez(this.f19619c);
            adbj a = hep.mo12290a();
            bqgg a2 = hep.mo12291a(hez);
            hez.mo12448a(a, a2);
            Iterable a3 = bnjd.m109575a((Iterable) bngx.m109368a((Collection) hez.f19630a), heq.f19612a);
            bqga.m112782b(a3).mo69216a(new her(this, a3, str), bqfb.INSTANCE);
            return a2;
        } catch (adbe e) {
            return bqga.m112777a((Throwable) e);
        }
    }
}
