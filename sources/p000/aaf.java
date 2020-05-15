package p000;

import android.view.View;
import java.util.List;

/* renamed from: aaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaf {

    /* renamed from: a */
    boolean f22a = true;

    /* renamed from: b */
    int f23b;

    /* renamed from: c */
    int f24c;

    /* renamed from: d */
    int f25d;

    /* renamed from: e */
    int f26e;

    /* renamed from: f */
    int f27f;

    /* renamed from: g */
    int f28g;

    /* renamed from: h */
    int f29h = 0;

    /* renamed from: i */
    int f30i = 0;

    /* renamed from: j */
    boolean f31j = false;

    /* renamed from: k */
    int f32k;

    /* renamed from: l */
    List f33l = null;

    /* renamed from: m */
    boolean f34m;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo44a(acc acc) {
        List list = this.f33l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((acm) this.f33l.get(i)).f201a;
                abv abv = (abv) view.getLayoutParams();
                if (!abv.mo256a() && this.f25d == abv.mo258c()) {
                    mo46a(view);
                    return view;
                }
            }
            return null;
        }
        View b = acc.mo282b(this.f25d);
        this.f25d += this.f26e;
        return b;
    }

    /* renamed from: a */
    public final void mo45a() {
        mo46a((View) null);
    }

    /* renamed from: a */
    public final void mo46a(View view) {
        int c;
        int size = this.f33l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((acm) this.f33l.get(i2)).f201a;
            abv abv = (abv) view3.getLayoutParams();
            if (view3 != view && !abv.mo256a() && (c = (abv.mo258c() - this.f25d) * this.f26e) >= 0 && c < i) {
                view2 = view3;
                if (c == 0) {
                    break;
                }
                i = c;
            }
        }
        this.f25d = view2 != null ? ((abv) view2.getLayoutParams()).mo258c() : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47a(acj acj) {
        int i = this.f25d;
        return i >= 0 && i < acj.mo305a();
    }
}
