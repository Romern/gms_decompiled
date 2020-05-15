package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: aum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aum extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f2274a;

    public aum(Drawable.ConstantState constantState) {
        this.f2274a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f2274a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f2274a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        aun aun = new aun();
        aun.f2280c = this.f2274a.newDrawable();
        aun.f2280c.setCallback(aun.f2276b);
        return aun;
    }

    public final Drawable newDrawable(Resources resources) {
        aun aun = new aun();
        aun.f2280c = this.f2274a.newDrawable(resources);
        aun.f2280c.setCallback(aun.f2276b);
        return aun;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aun aun = new aun();
        aun.f2280c = this.f2274a.newDrawable(resources, theme);
        aun.f2280c.setCallback(aun.f2276b);
        return aun;
    }
}
