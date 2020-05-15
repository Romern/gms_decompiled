package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: axca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axca extends acm {

    /* renamed from: t */
    protected final ViewGroup f95749t;

    protected axca(ViewGroup viewGroup) {
        super(viewGroup);
        this.f95749t = viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53001a(bkgd bkgd) {
        this.f95749t.removeAllViews();
    }

    /* renamed from: a */
    public void mo53002a(bkgd bkgd, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53003a(bwig bwig, bkgd bkgd);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo53004b(bwig bwig, bkgd bkgd);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Context mo53005v() {
        return this.f95749t.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final LayoutInflater mo53006w() {
        return LayoutInflater.from(mo53005v());
    }
}
