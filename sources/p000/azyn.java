package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;
import com.google.android.libraries.material.internal.TouchObserverFrameLayout;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azyn {

    /* renamed from: a */
    public final OpenSearchView f100202a;

    /* renamed from: b */
    public final View f100203b;

    /* renamed from: c */
    public final ClippableRoundedCornerLayout f100204c;

    /* renamed from: d */
    public final Toolbar f100205d;

    /* renamed from: e */
    public final Toolbar f100206e;

    /* renamed from: f */
    public final TextView f100207f;

    /* renamed from: g */
    public final EditText f100208g;

    /* renamed from: h */
    public final ImageButton f100209h;

    /* renamed from: i */
    public final View f100210i;

    /* renamed from: j */
    public final TouchObserverFrameLayout f100211j;

    /* renamed from: k */
    public azxs f100212k;

    /* renamed from: l */
    private final FrameLayout f100213l;

    public azyn(OpenSearchView openSearchView) {
        this.f100202a = openSearchView;
        this.f100203b = openSearchView.f111262a;
        this.f100204c = openSearchView.f111263b;
        this.f100213l = openSearchView.f111266e;
        this.f100205d = openSearchView.f111267f;
        this.f100206e = openSearchView.f111268g;
        this.f100207f = openSearchView.f111269h;
        this.f100208g = openSearchView.f111270i;
        this.f100209h = openSearchView.f111271j;
        this.f100210i = openSearchView.f111272k;
        this.f100211j = openSearchView.f111273l;
    }

    /* renamed from: a */
    public final int mo55404a() {
        return ((this.f100212k.getTop() + this.f100212k.getBottom()) / 2) - ((this.f100213l.getTop() + this.f100213l.getBottom()) / 2);
    }

    /* renamed from: b */
    public final int mo55410b(View view) {
        int b = C1260oz.m19822b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return azxr.m86338a(this.f100212k) ? this.f100212k.getLeft() - b : (this.f100212k.getRight() - this.f100202a.getWidth()) + b;
    }

    /* renamed from: a */
    public final int mo55405a(View view) {
        int a = C1260oz.m19820a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return azxr.m86338a(this.f100212k) ? (this.f100212k.getWidth() - this.f100212k.getRight()) + a : this.f100212k.getLeft() - a;
    }

    /* renamed from: a */
    public final Animator mo55406a(boolean z, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) (!z ? mo55410b(view) : mo55405a(view)), 0.0f);
        ofFloat.addUpdateListener(azxn.m86333b(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((float) mo55404a(), 0.0f);
        ofFloat2.addUpdateListener(azxn.m86334c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
        return animatorSet;
    }

    /* renamed from: a */
    public final AnimatorSet mo55407a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) this.f100204c.getHeight(), 0.0f);
        ofFloat.addUpdateListener(azxn.m86334c(this.f100204c));
        animatorSet.playTogether(ofFloat);
        mo55409a(animatorSet);
        animatorSet.setInterpolator(azxp.m86335a(z, bhdl.f118328b));
        animatorSet.setDuration(!z ? 300 : 350);
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo55408a(float f) {
        ActionMenuView a;
        this.f100209h.setAlpha(f);
        this.f100210i.setAlpha(f);
        this.f100211j.setAlpha(f);
        if (this.f100202a.f111277p && (a = azxq.m86336a(this.f100205d)) != null) {
            a.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo55409a(AnimatorSet animatorSet) {
        ImageButton b = azxq.m86337b(this.f100205d);
        if (b != null) {
            Drawable drawable = b.getDrawable();
            if (this.f100202a.f111276o) {
                if (drawable instanceof C1393tx) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new azyh((C1393tx) drawable));
                    animatorSet.playTogether(ofFloat);
                }
                if (drawable instanceof azxf) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.addUpdateListener(new azyi((azxf) drawable));
                    animatorSet.playTogether(ofFloat2);
                    return;
                }
                return;
            }
            if (drawable instanceof C1393tx) {
                ((C1393tx) drawable).mo16070a(1.0f);
            }
            if (drawable instanceof azxf) {
                ((azxf) drawable).mo55356a(1.0f);
            }
        }
    }
}
