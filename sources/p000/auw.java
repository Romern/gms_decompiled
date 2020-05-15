package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: auw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auw extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f2339a;

    public auw(Drawable.ConstantState constantState) {
        this.f2339a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f2339a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f2339a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        aux aux = new aux();
        aux.f2280c = (VectorDrawable) this.f2339a.newDrawable();
        return aux;
    }

    public final Drawable newDrawable(Resources resources) {
        aux aux = new aux();
        aux.f2280c = (VectorDrawable) this.f2339a.newDrawable(resources);
        return aux;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aux aux = new aux();
        aux.f2280c = (VectorDrawable) this.f2339a.newDrawable(resources, theme);
        return aux;
    }
}
