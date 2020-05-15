package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: adr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adr {

    /* renamed from: a */
    public final Context f289a;

    /* renamed from: b */
    public final TypedArray f290b;

    /* renamed from: c */
    public TypedValue f291c;

    private adr(Context context, TypedArray typedArray) {
        this.f289a = context;
        this.f290b = typedArray;
    }

    /* renamed from: a */
    public static adr m521a(Context context, int i, int[] iArr) {
        return new adr(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: b */
    public final int mo452b(int i, int i2) {
        return this.f290b.getInteger(i, i2);
    }

    /* renamed from: c */
    public final int mo454c(int i, int i2) {
        return this.f290b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final int mo456d(int i, int i2) {
        return this.f290b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public final int mo458e(int i, int i2) {
        return this.f290b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public final int mo460f(int i, int i2) {
        return this.f290b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public final float mo462g(int i) {
        return this.f290b.getDimension(i, -1.0f);
    }

    /* renamed from: h */
    public final int mo463h(int i) {
        return this.f290b.getColor(i, 0);
    }

    /* renamed from: a */
    public static adr m522a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new adr(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: b */
    public final Drawable mo453b(int i) {
        int resourceId;
        if (!this.f290b.hasValue(i) || (resourceId = this.f290b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1497xt.m20824b().mo16513c(this.f289a, resourceId);
    }

    /* renamed from: c */
    public final CharSequence mo455c(int i) {
        return this.f290b.getText(i);
    }

    /* renamed from: d */
    public final String mo457d(int i) {
        return this.f290b.getString(i);
    }

    /* renamed from: e */
    public final ColorStateList mo459e(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.f290b.hasValue(i) || (resourceId = this.f290b.getResourceId(i, 0)) == 0 || (a = C1391tv.m20458a(this.f289a, resourceId)) == null) ? this.f290b.getColorStateList(i) : a;
    }

    /* renamed from: f */
    public final boolean mo461f(int i) {
        return this.f290b.hasValue(i);
    }

    /* renamed from: a */
    public static adr m523a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new adr(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public final int mo448a(int i, int i2) {
        return this.f290b.getInt(i, i2);
    }

    /* renamed from: a */
    public final Drawable mo449a(int i) {
        int resourceId;
        if (!this.f290b.hasValue(i) || (resourceId = this.f290b.getResourceId(i, 0)) == 0) {
            return this.f290b.getDrawable(i);
        }
        return C1391tv.m20459b(this.f289a, resourceId);
    }

    /* renamed from: a */
    public final void mo450a() {
        this.f290b.recycle();
    }

    /* renamed from: a */
    public final boolean mo451a(int i, boolean z) {
        return this.f290b.getBoolean(i, z);
    }
}
