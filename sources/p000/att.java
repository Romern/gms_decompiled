package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: att */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class att {
    /* renamed from: a */
    static Animator m2094a(View view, atq atq, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, atf atf) {
        float f5;
        float f6;
        atq atq2 = atq;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) atq2.f2216b.getTag(C0126R.C0129id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        ats ats = new ats(view, atq2.f2216b, round, round2, translationX, translationY);
        atf.mo2463a(ats);
        ofPropertyValuesHolder.addListener(ats);
        art.m1916a(ofPropertyValuesHolder, ats);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
