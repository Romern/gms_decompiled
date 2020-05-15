package p000;

import android.content.Context;

/* renamed from: bvdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdq implements bvdc {

    /* renamed from: a */
    public final bval f155666a;

    /* renamed from: b */
    public bvbw f155667b;

    /* renamed from: c */
    private final bvbv f155668c;

    public bvdq(Context context, bval bval) {
        this.f155668c = (bvbv) ahgz.m55754a(context, bvbv.class);
        this.f155666a = bval;
    }

    /* renamed from: a */
    public final bvbr mo73118a(bvat bvat) {
        bvbv bvbv = this.f155668c;
        buzo buzo = this.f155666a.f155490b;
        if (buzo == null) {
            buzo = buzo.f155407d;
        }
        bvbw bvbw = (bvbw) bvbv.f155570a.get(buzo.f155410b);
        this.f155667b = bvbw;
        if (bvbw != null) {
            return new bvdp(this);
        }
        throw new RuntimeException("Connection does not exist.");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo73125c() {
        return bvam.f155493c;
    }

    /* renamed from: a */
    public final void mo73122a(bvda bvda) {
        bvda.mo73126a();
    }
}
