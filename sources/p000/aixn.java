package p000;

import android.content.Context;

/* renamed from: aixn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aixn implements ajgo {

    /* renamed from: a */
    final /* synthetic */ Context f69993a;

    /* renamed from: b */
    final /* synthetic */ buye f69994b;

    /* renamed from: c */
    final /* synthetic */ bzbu f69995c;

    /* renamed from: d */
    final /* synthetic */ Runnable f69996d;

    /* renamed from: e */
    final /* synthetic */ aixs f69997e;

    /* renamed from: f */
    private bvaa f69998f;

    /* renamed from: g */
    private ajgm f69999g;

    public aixn(aixs aixs, Context context, buye buye, bzbu bzbu, Runnable runnable) {
        this.f69997e = aixs;
        this.f69993a = context;
        this.f69994b = buye;
        this.f69995c = bzbu;
        this.f69996d = runnable;
    }

    /* renamed from: a */
    public final boolean mo38214a() {
        return aixs.m58137a(this.f69993a, this.f69994b, this.f69995c);
    }

    /* renamed from: b */
    public final void mo38216b() {
        this.f69999g = null;
        this.f69994b.mo73259a(this.f69998f.f155451b);
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = ajgs.m58685a(this.f69995c);
        ajgm ajgm = this.f69999g;
        if (ajgm != null) {
            str = ajgm.mo38614a();
        } else {
            str = null;
        }
        objArr[1] = str;
        return String.format("%s beacon (token=%s)", objArr);
    }

    /* renamed from: a */
    public final boolean mo38215a(ajgm ajgm) {
        ajgm ajgm2 = this.f69999g;
        return ajgm2 != null && ajgm2.equals(ajgm);
    }

    /* renamed from: b */
    public final void mo38217b(ajgm ajgm) {
        this.f69999g = ajgm;
        this.f69998f = this.f69994b.mo73252a(aixs.m58128a(this.f69995c, ajgm), new aixm(this));
    }
}
