package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: tw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1392tw extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final Drawable f27218a;

    public C1392tw(Drawable drawable) {
        Drawable drawable2 = this.f27218a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27218a = drawable;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        this.f27218a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f27218a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f27218a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f27218a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f27218a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f27218a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f27218a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f27218a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f27218a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f27218a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f27218a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return C1173lt.m19606a(this.f27218a);
    }

    public final boolean isStateful() {
        return this.f27218a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f27218a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f27218a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.f27218a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f27218a.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        C1173lt.m19605a(this.f27218a, z);
    }

    public final void setChangingConfigurations(int i) {
        this.f27218a.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27218a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f27218a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f27218a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C1173lt.m19598a(this.f27218a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1173lt.m19600a(this.f27218a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f27218a.setState(iArr);
    }

    public final void setTint(int i) {
        C1173lt.m19599a(this.f27218a, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        C1173lt.m19601a(this.f27218a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C1173lt.m19604a(this.f27218a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f27218a.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
