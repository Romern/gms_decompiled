package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atz extends atg {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f2234a;

    /* renamed from: b */
    final /* synthetic */ View f2235b;

    /* renamed from: c */
    final /* synthetic */ View f2236c;

    /* renamed from: d */
    final /* synthetic */ auc f2237d;

    public atz(auc auc, ViewGroup viewGroup, View view, View view2) {
        this.f2237d = auc;
        this.f2234a = viewGroup;
        this.f2235b = view;
        this.f2236c = view2;
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        this.f2236c.setTag(C0126R.C0129id.save_overlay_view, null);
        atv.m2097a(this.f2234a).mo2505b(this.f2235b);
        atf.mo2473b(this);
    }

    /* renamed from: b */
    public final void mo2373b() {
        atv.m2097a(this.f2234a).mo2505b(this.f2235b);
    }

    /* renamed from: c */
    public final void mo2374c() {
        if (this.f2235b.getParent() == null) {
            atv.m2097a(this.f2234a).mo2504a(this.f2235b);
        } else {
            this.f2237d.mo2482g();
        }
    }
}
