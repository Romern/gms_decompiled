package p000;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: oox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oox extends ooz {

    /* renamed from: a */
    final Animation f38150a;

    /* renamed from: l */
    private final float[] f38151l = new float[9];

    public oox(Animation animation, float f) {
        super(m29469a(animation), f);
        this.f38150a = animation;
    }

    /* renamed from: a */
    private static long m29469a(Animation animation) {
        if (!(animation instanceof AnimationSet)) {
            return animation.getDuration() + animation.getStartOffset();
        }
        long j = 0;
        for (Animation animation2 : ((AnimationSet) animation).getAnimations()) {
            j = Math.max(j, m29469a(animation2));
        }
        return j;
    }

    /* renamed from: a */
    public final int mo22471a() {
        int i = -1;
        if (this.f38150a.getZAdjustment() != -1) {
            i = 1;
            if (this.f38150a.getZAdjustment() != 1) {
                return 0;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        int round = Math.round(((float) j) / this.f38160j);
        Transformation transformation = new Transformation();
        transformation.setTransformationType(3);
        this.f38150a.getTransformation((long) round, transformation);
        this.f38161k.f38163b = transformation.getAlpha();
        transformation.getMatrix().getValues(this.f38151l);
        opa opa = this.f38161k;
        float[] fArr = opa.f38162a;
        float[] fArr2 = this.f38151l;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[3];
        fArr[2] = 0.0f;
        fArr[3] = fArr2[6];
        fArr[4] = fArr2[1];
        fArr[5] = fArr2[4];
        fArr[6] = 0.0f;
        fArr[7] = fArr2[7];
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = fArr2[2];
        fArr[13] = fArr2[5];
        fArr[14] = 0.0f;
        fArr[15] = fArr2[8];
        return opa;
    }
}
