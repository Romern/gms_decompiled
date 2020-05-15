package p000;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: bbpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbpz implements rjz {

    /* renamed from: a */
    final /* synthetic */ rkb f103050a;

    /* renamed from: b */
    final /* synthetic */ bqgy f103051b;

    /* renamed from: c */
    final /* synthetic */ bbqb f103052c;

    public bbpz(bbqb bbqb, rkb rkb, bqgy bqgy) {
        this.f103052c = bbqb;
        this.f103050a = rkb;
        this.f103051b = bqgy;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        bbqb bbqb = this.f103052c;
        rkb rkb = this.f103050a;
        bqgy bqgy = this.f103051b;
        rjo rjo = gsq.f18963a;
        sdo.m34959a(rkb);
        rkb.mo24795b(new ibw(rkb)).mo9459a(new bbpy(bbqb, bqgy, rkb), 20, TimeUnit.SECONDS);
    }
}
