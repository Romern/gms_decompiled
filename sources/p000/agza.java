package p000;

import java.util.concurrent.Executor;

/* renamed from: agza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agza {

    /* renamed from: c */
    public static final srn f66895c = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public final Object f66896a = new Object();

    /* renamed from: b */
    public final rtj f66897b = new rtj(rpr.m34216b(), "mobiledataplan_pref", true, false);

    /* renamed from: d */
    public final Executor f66898d = snp.m35704b(10);

    /* renamed from: a */
    public final void mo36208a(bxzv bxzv, long j) {
        this.f66898d.execute(new agyx(this, bxzv, j));
    }

    /* renamed from: a */
    public final boolean mo36209a(bxzv bxzv) {
        return this.f66897b.getLong(bxzv.name(), 0) > 0;
    }

    /* renamed from: a */
    public final boolean mo36210a(String str) {
        return this.f66897b.getBoolean(str, true);
    }
}
