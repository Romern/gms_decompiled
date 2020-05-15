package p000;

import android.accounts.Account;

/* renamed from: afsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afsl implements cayy {

    /* renamed from: a */
    private final cijl f64667a;

    /* renamed from: b */
    private final cijl f64668b;

    /* renamed from: c */
    private final cijl f64669c;

    public afsl(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f64667a = cijl;
        this.f64668b = cijl2;
        this.f64669c = cijl3;
    }

    /* renamed from: b */
    public final bbko mo6445a() {
        bqbu bqbu;
        afsp afsp = (afsp) this.f64669c.mo6445a();
        btdk btdk = (btdk) ((btdk) ciih.m150373a(new btdj(), ((bruh) this.f64667a.mo6445a()).mo69980a(bthv.f148884af))).mo86139a(bruw.f143433a, bruw.m114733a(((Account) ((cayz) this.f64668b).f176439a).name));
        String k = cfhg.f184087a.mo6606a().mo81247k();
        int l = (int) cfhg.f184087a.mo6606a().mo81248l();
        if (k.isEmpty()) {
            bqbu = null;
        } else if (l == -1) {
            bqbu = bqbu.m112532a(k);
            bmxy.m108596a(!bqbu.mo69009a(), "Host has a port: %s", k);
        } else {
            bqbu = bqbu.m112533a(k, l);
        }
        if (bqbu != null) {
            btdk = (btdk) btdk.mo86139a(brup.f143420a, bqbu.toString());
        }
        bbkn bbkn = new bbkn(btdk);
        cazf.m127593a(bbkn, "Cannot return null from a non-@Nullable @Provides method");
        return bbkn;
    }
}
