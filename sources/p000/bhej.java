package p000;

import android.view.View;

/* renamed from: bhej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhej {

    /* renamed from: a */
    public int f118383a;

    /* renamed from: b */
    public int f118384b;

    /* renamed from: c */
    private final View f118385c;

    /* renamed from: d */
    private int f118386d;

    public bhej(View view) {
        this.f118385c = view;
    }

    /* renamed from: a */
    public final void mo63603a() {
        this.f118383a = this.f118385c.getTop();
        this.f118386d = this.f118385c.getLeft();
    }

    /* renamed from: b */
    public final void mo63605b() {
        View view = this.f118385c;
        C1280ps.m19922g(view, this.f118384b - (view.getTop() - this.f118383a));
        View view2 = this.f118385c;
        C1280ps.m19924h(view2, -(view2.getLeft() - this.f118386d));
    }

    /* renamed from: a */
    public final boolean mo63604a(int i) {
        if (this.f118384b == i) {
            return false;
        }
        this.f118384b = i;
        mo63605b();
        return true;
    }
}
