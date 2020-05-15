package p000;

import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: opg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opg extends AnimationSet {

    /* renamed from: a */
    private final float[] f38167a = new float[9];

    public opg(TranslateAnimation translateAnimation) {
        super(false);
        addAnimation(translateAnimation);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        boolean transformation2 = super.getTransformation(j, transformation);
        transformation.getMatrix().getValues(this.f38167a);
        float[] fArr = this.f38167a;
        fArr[5] = -fArr[5];
        transformation.getMatrix().setValues(this.f38167a);
        return transformation2;
    }
}
