package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* renamed from: cqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cqi extends cpz {

    /* renamed from: a */
    protected final View f11846a;

    /* renamed from: b */
    public final cqh f11847b;

    public cqi(View view) {
        crb.m7382a(view);
        this.f11846a = view;
        this.f11847b = new cqh(view);
    }

    /* renamed from: a */
    public final cpv mo8123a() {
        Object tag = this.f11846a.getTag(C0126R.C0129id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof cpv) {
            return (cpv) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: b */
    public final void mo8132b(cqe cqe) {
        this.f11847b.f11844c.remove(cqe);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11846a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo8124a(cpv cpv) {
        this.f11846a.setTag(C0126R.C0129id.glide_custom_view_target_tag, cpv);
    }

    /* renamed from: a */
    public final void mo8131a(cqe cqe) {
        cqh cqh = this.f11847b;
        int c = cqh.mo8138c();
        int b = cqh.mo8137b();
        if (cqh.m7352a(c, b)) {
            cqe.mo8122a(c, b);
            return;
        }
        if (!cqh.f11844c.contains(cqe)) {
            cqh.f11844c.add(cqe);
        }
        if (cqh.f11845d == null) {
            ViewTreeObserver viewTreeObserver = cqh.f11843b.getViewTreeObserver();
            cqh.f11845d = new cqg(cqh);
            viewTreeObserver.addOnPreDrawListener(cqh.f11845d);
        }
    }
}
