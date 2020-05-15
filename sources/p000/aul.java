package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: aul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aul extends Drawable.ConstantState {

    /* renamed from: a */
    int f2269a;

    /* renamed from: b */
    aux f2270b;

    /* renamed from: c */
    AnimatorSet f2271c;

    /* renamed from: d */
    ArrayList f2272d;

    /* renamed from: e */
    C1223np f2273e;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
