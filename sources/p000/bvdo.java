package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: bvdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdo {

    /* renamed from: a */
    public final bvbu f155660a;

    /* renamed from: b */
    public final Context f155661b;

    /* renamed from: c */
    private final buxb f155662c;

    /* renamed from: d */
    private final buqh f155663d;

    /* renamed from: e */
    private final Executor f155664e;

    public bvdo(Context context, Executor executor) {
        this.f155661b = context;
        this.f155660a = (bvbu) ahgz.m55754a(context, bvbu.class);
        this.f155663d = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155664e = executor;
        this.f155662c = (buxb) ahgz.m55755b(context, buxb.class);
        mo73341a((bvda) null);
    }

    /* renamed from: a */
    public final bvct mo73339a(bvbk bvbk) {
        if (bvbk != null) {
            return new bvbq(bvbk, this.f155663d);
        }
        return null;
    }

    /* renamed from: a */
    public final bvct mo73340a(bvdc bvdc) {
        if (bvdc != null) {
            return new bvdi(bvdc, this.f155663d, this.f155664e);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo73341a(bvda bvda) {
        buxb buxb = this.f155662c;
        if (buxb != null) {
            if (buxb.mo73229c(bvda)) {
                srn srn = bvcm.f155598a;
            }
        } else if (bvda != null) {
            bvda.mo73126a();
        }
    }
}
