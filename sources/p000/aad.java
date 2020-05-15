package p000;

import android.view.View;

/* renamed from: aad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aad {

    /* renamed from: a */
    aaw f13a;

    /* renamed from: b */
    int f14b;

    /* renamed from: c */
    int f15c;

    /* renamed from: d */
    boolean f16d;

    /* renamed from: e */
    boolean f17e;

    public aad() {
        mo39a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39a() {
        this.f14b = -1;
        this.f15c = Integer.MIN_VALUE;
        this.f16d = false;
        this.f17e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41b() {
        int i;
        if (this.f16d) {
            i = this.f13a.mo117a();
        } else {
            i = this.f13a.mo122c();
        }
        this.f15c = i;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f14b + ", mCoordinate=" + this.f15c + ", mLayoutFromEnd=" + this.f16d + ", mValid=" + this.f17e + '}';
    }

    /* renamed from: a */
    public final void mo40a(View view, int i) {
        int h = this.f13a.mo131h();
        if (h < 0) {
            this.f14b = i;
            if (this.f16d) {
                int a = (this.f13a.mo117a() - h) - this.f13a.mo123c(view);
                this.f15c = this.f13a.mo117a() - a;
                if (a > 0) {
                    int a2 = this.f13a.mo118a(view);
                    int i2 = this.f15c;
                    int c = this.f13a.mo122c();
                    int min = (i2 - a2) - (c + Math.min(this.f13a.mo125d(view) - c, 0));
                    if (min < 0) {
                        this.f15c += Math.min(a, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d = this.f13a.mo125d(view);
            int c2 = d - this.f13a.mo122c();
            this.f15c = d;
            if (c2 > 0) {
                int a3 = this.f13a.mo118a(view);
                int a4 = (this.f13a.mo117a() - Math.min(0, (this.f13a.mo117a() - h) - this.f13a.mo123c(view))) - (d + a3);
                if (a4 < 0) {
                    this.f15c -= Math.min(c2, -a4);
                    return;
                }
                return;
            }
            return;
        }
        mo42b(view, i);
    }

    /* renamed from: b */
    public final void mo42b(View view, int i) {
        if (this.f16d) {
            this.f15c = this.f13a.mo123c(view) + this.f13a.mo131h();
        } else {
            this.f15c = this.f13a.mo125d(view);
        }
        this.f14b = i;
    }
}
