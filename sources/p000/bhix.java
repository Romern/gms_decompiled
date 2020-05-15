package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: bhix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhix extends bhiv {
    public bhix(FloatingActionButton floatingActionButton, bhil bhil) {
        super(floatingActionButton, bhil);
    }

    /* renamed from: a */
    private final Animator m100961a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f118749B, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f118749B, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f118743a);
        return animatorSet;
    }

    /* renamed from: d */
    public final void mo63834d() {
    }

    /* renamed from: f */
    public final boolean mo63836f() {
        return this.f118751D.mo63813a() || !mo63833c();
    }

    /* renamed from: g */
    public final boolean mo63837g() {
        return false;
    }

    /* renamed from: h */
    public final bhlr mo63838h() {
        bhlx bhlx = this.f118757b;
        C1244oj.m19766a(bhlx);
        return new bhiw(bhlx);
    }

    /* renamed from: j */
    public final void mo63840j() {
    }

    /* renamed from: a */
    public final float mo63823a() {
        return this.f118749B.getElevation();
    }

    /* renamed from: a */
    public final void mo63826a(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f118744v, m100961a(f, f3));
        stateListAnimator.addState(f118745w, m100961a(f, f2));
        stateListAnimator.addState(f118746x, m100961a(f, f2));
        stateListAnimator.addState(f118747y, m100961a(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f118749B, "elevation", f).setDuration(0L));
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        arrayList.add(ObjectAnimator.ofFloat(this.f118749B, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f118743a);
        stateListAnimator.addState(f118748z, animatorSet);
        stateListAnimator.addState(f118741A, m100961a(0.0f, 0.0f));
        this.f118749B.setStateListAnimator(stateListAnimator);
        if (mo63836f()) {
            mo63835e();
        }
    }

    /* renamed from: a */
    public final void mo63827a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.f118758c = mo63838h();
        this.f118758c.setTintList(colorStateList);
        if (mode != null) {
            this.f118758c.setTintMode(mode);
        }
        this.f118758c.mo63942a(this.f118749B.getContext());
        if (i > 0) {
            Context context = this.f118749B.getContext();
            bhlx bhlx = this.f118757b;
            C1244oj.m19766a(bhlx);
            bhih bhih = new bhih(bhlx);
            int b = C1133kh.m17843b(context, C0126R.color.design_fab_stroke_top_outer_color);
            int b2 = C1133kh.m17843b(context, C0126R.color.design_fab_stroke_top_inner_color);
            int b3 = C1133kh.m17843b(context, C0126R.color.design_fab_stroke_end_inner_color);
            int b4 = C1133kh.m17843b(context, C0126R.color.design_fab_stroke_end_outer_color);
            bhih.f118709c = b;
            bhih.f118710d = b2;
            bhih.f118711e = b3;
            bhih.f118712f = b4;
            float f = (float) i;
            if (bhih.f118708b != f) {
                bhih.f118708b = f;
                bhih.f118707a.setStrokeWidth(f * 1.3333f);
                bhih.f118713g = true;
                bhih.invalidateSelf();
            }
            bhih.mo63796a(colorStateList);
            this.f118760e = bhih;
            bhih bhih2 = this.f118760e;
            C1244oj.m19766a(bhih2);
            bhlr bhlr = this.f118758c;
            C1244oj.m19766a(bhlr);
            drawable = new LayerDrawable(new Drawable[]{bhih2, bhlr});
        } else {
            this.f118760e = null;
            drawable = this.f118758c;
        }
        this.f118759d = new RippleDrawable(bhlg.m101096b(colorStateList2), drawable, null);
        this.f118761f = this.f118759d;
    }

    /* renamed from: a */
    public final void mo63828a(Rect rect) {
        if (this.f118751D.mo63813a()) {
            super.mo63828a(rect);
        } else if (!mo63833c()) {
            int b = (this.f118767l - this.f118749B.mo71165b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: a */
    public final void mo63830a(int[] iArr) {
        int i = Build.VERSION.SDK_INT;
    }
}
