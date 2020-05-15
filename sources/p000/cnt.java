package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: cnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cnt extends Drawable.ConstantState {

    /* renamed from: a */
    final coa f7115a;

    public cnt(coa coa) {
        this.f7115a = coa;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new cnu(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }
}
