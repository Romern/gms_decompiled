package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: atnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atnd extends atf {
    /* renamed from: d */
    private static final void m76211d(atq atq) {
        View view = atq.f2216b;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() instanceof bepq) {
                atq.f2215a.put("com.google.android.gms.tapandpay.tap2:changeSaturation:saturation", Float.valueOf(((bepq) imageView.getDrawable()).mo50082b()));
            }
        }
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        if (atq == null || atq2 == null) {
            return null;
        }
        Float f = (Float) atq.f2215a.get("com.google.android.gms.tapandpay.tap2:changeSaturation:saturation");
        Float f2 = (Float) atq2.f2215a.get("com.google.android.gms.tapandpay.tap2:changeSaturation:saturation");
        if (f == null || f2 == null || f.equals(f2)) {
            return null;
        }
        bepq bepq = (bepq) ((ImageView) atq.f2216b).getDrawable();
        bepq.mo50083b(f.floatValue());
        return ObjectAnimator.ofFloat(bepq, bepq.f111998a, f.floatValue(), f2.floatValue());
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        m76211d(atq);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        m76211d(atq);
    }
}
