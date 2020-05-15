package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: bhow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhow extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f119223a;

    /* renamed from: b */
    final /* synthetic */ TextView f119224b;

    /* renamed from: c */
    final /* synthetic */ int f119225c;

    /* renamed from: d */
    final /* synthetic */ TextView f119226d;

    /* renamed from: e */
    final /* synthetic */ bhox f119227e;

    public bhow(bhox bhox, int i, TextView textView, int i2, TextView textView2) {
        this.f119227e = bhox;
        this.f119223a = i;
        this.f119224b = textView;
        this.f119225c = i2;
        this.f119226d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        bhox bhox = this.f119227e;
        bhox.f119231d = this.f119223a;
        bhox.f119230c = null;
        TextView textView2 = this.f119224b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f119225c == 1 && (textView = this.f119227e.f119235h) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.f119226d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.f119226d.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f119226d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
