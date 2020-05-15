package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: eva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eva {

    /* renamed from: a */
    private final AccountParticleDisc f15869a;

    /* renamed from: b */
    private final bdej f15870b;

    @Deprecated
    public eva(AccountParticleDisc accountParticleDisc, bdej bdej) {
        bmxy.m108581a(accountParticleDisc);
        this.f15869a = accountParticleDisc;
        this.f15870b = bdej;
    }

    /* renamed from: a */
    public final void mo10524a(bmxv bmxv) {
        String str;
        if (!this.f15869a.mo60579b()) {
            this.f15869a.mo60576a(this.f15870b, bddo.class);
        }
        int i = 0;
        String str2 = null;
        if (!bmxv.mo66813a() || bmxx.m108577a(((ffl) bmxv.mo66814b()).f16461a)) {
            this.f15869a.mo60577a((Object) null);
            this.f15869a.setTag(C0126R.C0129id.as_particle_disc_url_hash, 0);
            return;
        }
        String str3 = ((ffl) bmxv.mo66814b()).f16461a;
        String str4 = ((ffl) bmxv.mo66814b()).f16462b;
        bddo bddo = (bddo) this.f15869a.f111381h;
        if (bddo != null) {
            str2 = bddo.mo57896b();
            str = bddo.mo57895a();
        } else {
            str = null;
        }
        if (!str3.equals(str2) || !bmxi.m108538a(str4, str)) {
            if (!bmxx.m108577a(str3)) {
                bddn g = bddo.m90606g();
                g.mo57907a(str3);
                if (!bmxx.m108577a(str4)) {
                    g.f105375a = str4;
                }
                this.f15869a.mo60577a(g.mo57906a());
            }
            this.f15869a.setTag(C0126R.C0129id.as_particle_disc_url_hash, Integer.valueOf(((ffl) bmxv.mo66814b()).f16463c));
            this.f15869a.mo60575a((bddw) this.f15870b);
            return;
        }
        Object tag = this.f15869a.getTag(C0126R.C0129id.as_particle_disc_url_hash);
        if (tag instanceof Integer) {
            i = ((Integer) tag).intValue();
        }
        if (((ffl) bmxv.mo66814b()).f16463c != i) {
            this.f15869a.mo60575a((bddw) this.f15870b);
            this.f15869a.setTag(C0126R.C0129id.as_particle_disc_url_hash, Integer.valueOf(((ffl) bmxv.mo66814b()).f16463c));
        }
    }
}
