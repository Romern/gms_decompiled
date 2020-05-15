package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: bhlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlf extends Drawable implements bhmg {

    /* renamed from: a */
    private bhle f118947a;

    public bhlf(bhle bhle) {
        this.f118947a = bhle;
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        this.f118947a.f118945a.mo63916a(bhlx);
    }

    public final void draw(Canvas canvas) {
        bhle bhle = this.f118947a;
        if (bhle.f118946b) {
            bhle.f118945a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f118947a;
    }

    public final int getOpacity() {
        return this.f118947a.f118945a.getOpacity();
    }

    public final boolean isStateful() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Drawable mutate() {
        this.f118947a = new bhle(this.f118947a);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f118947a.f118945a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f118947a.f118945a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = bhlg.m101095a(iArr);
        bhle bhle = this.f118947a;
        if (bhle.f118946b == a) {
            return onStateChange;
        }
        bhle.f118946b = a;
        return true;
    }

    public final void setAlpha(int i) {
        this.f118947a.f118945a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f118947a.f118945a.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        this.f118947a.f118945a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f118947a.f118945a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f118947a.f118945a.setTintMode(mode);
    }
}
