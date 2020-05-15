package p000;

import java.io.IOException;

/* renamed from: afti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afti implements afxz {

    /* renamed from: a */
    public final bbmn f64711a;

    /* renamed from: b */
    public final bats f64712b;

    /* renamed from: c */
    private final bbks f64713c;

    public afti(bbks bbks, bbmn bbmn, bats bats) {
        this.f64713c = bbks;
        this.f64711a = bbmn;
        this.f64712b = bats;
    }

    /* renamed from: a */
    public static bqgg m53532a(bqgg bqgg) {
        return bqdf.m112620a(bqgg, Exception.class, afth.f64710a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo35020a(afyf afyf) {
        int i = 1;
        if (afyf.mo35059b() == afye.ONEOFF && cfhg.m139616b()) {
            i = 2;
        }
        return m53532a(bqdx.m112673a(this.f64713c.mo56194a(i), aftd.f64705a, bqfb.INSTANCE));
    }

    /* renamed from: a */
    public final bqgg mo35021a(afyf afyf, bbmw bbmw) {
        bqgg bqgg;
        if (!cfhg.f184087a.mo6606a().mo81245i()) {
            bqgg = bqga.m112775a((Object) true);
        } else if (afyf.mo35059b() == afye.ONEOFF && bbmw != null) {
            bqgg = bqdf.m112619a(bbmw.mo56227b(), Exception.class, new aftf(this), bqfb.INSTANCE);
        } else {
            bqgg = bqga.m112775a((Object) true);
        }
        return bqdx.m112674a(bqgg, new afte(this, afyf), bqfb.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo35022a(Exception exc) {
        int i;
        bats bats = this.f64712b;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        bnsi a = bats.mo55955a(i);
        a.mo68437a(exc);
        bnsl bnsl = (bnsl) a;
        bnsl.mo68432a("afti", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to check if account should be synced in one-off profile sync task!");
        return true;
    }
}
