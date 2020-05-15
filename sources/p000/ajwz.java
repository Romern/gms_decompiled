package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwz extends Drawable {

    /* renamed from: a */
    private final Drawable f71488a;

    /* renamed from: b */
    private final Drawable f71489b;

    public ajwz(Context context) {
        C1416ut utVar = (C1416ut) context;
        this.f71488a = aux.m2149a(utVar.mo16091a(), C0126R.C0127drawable.sharing_visibility_people_back_ic, context.getTheme());
        this.f71489b = aux.m2149a(utVar.mo16091a(), C0126R.C0127drawable.sharing_visibility_person_front_ic, context.getTheme());
    }

    public final void applyTheme(Resources.Theme theme) {
        this.f71488a.applyTheme(theme);
        this.f71489b.applyTheme(theme);
        invalidateSelf();
    }

    public final boolean canApplyTheme() {
        return true;
    }

    public final void draw(Canvas canvas) {
        this.f71488a.draw(canvas);
        this.f71489b.draw(canvas);
    }

    public final int getAlpha() {
        return this.f71488a.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.f71488a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f71488a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.f71488a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f71488a.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        this.f71489b.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setAlpha(int i) {
        this.f71488a.setAlpha(i);
        this.f71489b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f71488a.setColorFilter(colorFilter);
        this.f71489b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f71488a.setTintList(colorStateList);
        this.f71489b.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f71488a.setTintMode(mode);
        this.f71489b.setTintMode(mode);
    }
}
