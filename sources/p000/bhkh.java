package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: bhkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkh extends atf {
    /* renamed from: d */
    private static final void m101048d(atq atq) {
        View view = atq.f2216b;
        if (view instanceof TextView) {
            atq.f2215a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        float f;
        if (atq == null || atq2 == null || !(atq.f2216b instanceof TextView)) {
            return null;
        }
        View view = atq2.f2216b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = atq.f2215a;
        Map map2 = atq2.f2215a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new bhkg(textView));
        return ofFloat;
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        m101048d(atq);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        m101048d(atq);
    }
}
