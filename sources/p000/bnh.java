package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: bnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnh extends LayerDrawable {

    /* renamed from: a */
    public ColorStateList f5189a = null;

    public bnh(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    /* renamed from: a */
    public static bnh m3389a(Drawable drawable) {
        if (drawable instanceof bnh) {
            return (bnh) drawable;
        }
        return new bnh(drawable.mutate());
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || mo3295a();
    }

    /* renamed from: a */
    public final boolean mo3295a() {
        ColorStateList colorStateList = this.f5189a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
