package p000;

import android.content.Context;

/* renamed from: anrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrl extends anbp implements rkl {

    /* renamed from: a */
    boolean f77506a;

    public anrl(Context context, String str, String str2, String str3, String str4) {
        super(context, str, str2, str3, str4, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11510a(rkb rkb) {
        if (!this.f77506a) {
            this.f77506a = true;
            rjo rjo = allr.f73629a;
            amdi.m62651a(rkb, this.f76579i, this.f76580j, 0, false);
        }
        rjo rjo2 = allr.f73629a;
        amcf.m62587a(rkb, this.f76579i, this.f76580j).mo9458a(this);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        this.f77506a = false;
        super.onForceLoad();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alzr alzr;
        alky alky = (alky) rkk;
        amey b = alky.mo12459b();
        if (!alky.mo7183bo().mo17710c()) {
            mo41655a(alky.mo7183bo(), b);
            return;
        }
        if (b == null || b.mo24660a() != 1) {
            alzr = null;
        } else {
            alzr = b.mo24661a(0);
        }
        if (alzr == null) {
            mo41655a(anbp.f76575h, (rtp) null);
            b.mo12460c();
            return;
        }
        mo41655a(alky.mo7183bo(), b);
    }
}
