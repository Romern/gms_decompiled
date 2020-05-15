package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: bjbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbi extends LayerDrawable {

    /* renamed from: a */
    public ColorStateList f122468a = null;

    public bjbi(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    /* renamed from: a */
    public static bjbi m103154a(Drawable drawable) {
        if (drawable instanceof bjbi) {
            return (bjbi) drawable;
        }
        return new bjbi(drawable.mutate());
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || mo64969a();
    }

    /* renamed from: a */
    public final boolean mo64969a() {
        ColorStateList colorStateList = this.f122468a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
