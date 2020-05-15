package p000;

import android.content.Context;
import java.util.Set;

/* renamed from: aixo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixo implements ajgr {

    /* renamed from: a */
    final /* synthetic */ Context f70000a;

    /* renamed from: b */
    final /* synthetic */ buye f70001b;

    /* renamed from: c */
    final /* synthetic */ bzbu f70002c;

    /* renamed from: d */
    final /* synthetic */ Set f70003d;

    /* renamed from: e */
    final /* synthetic */ aixs f70004e;

    /* renamed from: f */
    private bvaa f70005f;

    public aixo(aixs aixs, Context context, buye buye, bzbu bzbu, Set set) {
        this.f70004e = aixs;
        this.f70000a = context;
        this.f70001b = buye;
        this.f70002c = bzbu;
        this.f70003d = set;
    }

    /* renamed from: a */
    public final void mo38219a(ajgp ajgp, byyo byyo) {
        this.f70004e.f70018e.mo72984b();
        this.f70004e.f70016c.put(this.f70002c.f169275k, this);
        this.f70005f = this.f70001b.mo73255a(aixs.m58129a(this.f70002c, byyo), this.f70004e.mo38226a(this.f70002c, ajgp, (aixj) null), ajgw.m58695a(this.f70000a), this.f70004e.mo38227a(this.f70003d));
    }

    /* renamed from: b */
    public final void mo38221b() {
        this.f70004e.f70018e.mo72984b();
        this.f70004e.f70016c.remove(this.f70002c.f169275k);
        this.f70001b.mo73259a(this.f70005f.f155451b);
    }

    /* renamed from: a */
    public final boolean mo38220a() {
        return aixs.m58138a(this.f70000a, this.f70001b, this.f70002c, 0);
    }
}
