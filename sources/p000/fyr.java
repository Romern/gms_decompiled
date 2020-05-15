package p000;

import android.view.ViewGroup;

/* renamed from: fyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fyr extends abj {

    /* renamed from: a */
    final /* synthetic */ fys f17649a;

    public fyr(fys fys) {
        this.f17649a = fys;
    }

    /* renamed from: a */
    public final void mo188a() {
        this.f17649a.mo11520a();
    }

    /* renamed from: b */
    public final void mo191b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            fys fys = this.f17649a;
            abh abh = fys.f17650a;
            acm b = abh.mo172b(fys, abh.mo162a(i4));
            this.f17649a.f17650a.mo176b(b, i4);
            this.f17649a.f17652c.addView(b.f201a, i4, new ViewGroup.LayoutParams(-1, -2));
            this.f17649a.f17651b.add(i4, b);
        }
    }

    /* renamed from: c */
    public final void mo192c(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f17649a.f17652c.removeViewAt(i);
            this.f17649a.f17651b.remove(i);
        }
    }

    /* renamed from: d */
    public final void mo193d(int i, int i2) {
        this.f17649a.mo11520a();
    }

    /* renamed from: a */
    public final void mo189a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            this.f17649a.f17650a.mo176b((acm) this.f17649a.f17651b.get(i4), i4);
        }
    }
}
