package p000;

import android.accounts.Account;

/* renamed from: bawa */
final /* synthetic */ class bawa implements bqeh {

    /* renamed from: a */
    private final bawq f101959a;

    /* renamed from: b */
    private final baus f101960b;

    public bawa(bawq bawq, baus baus) {
        this.f101959a = bawq;
        this.f101960b = baus;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        bawq bawq = this.f101959a;
        bavd bavd = (bavd) obj;
        bauc bauc = (bauc) this.f101960b;
        if (bauc.f101750b.mo66813a()) {
            str = bawv.m87644a((Account) bauc.f101750b.mo66814b());
        } else {
            str = null;
        }
        return bqdx.m112673a(bawq.mo55997a(bavd, str, 2), bawb.f101961a, bawq.f101996e);
    }
}
