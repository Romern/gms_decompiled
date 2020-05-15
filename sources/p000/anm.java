package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

@Deprecated
/* renamed from: anm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anm extends RelativeLayout.LayoutParams {

    /* renamed from: a */
    private anj f1853a;

    public anm() {
        super(-1, -1);
    }

    /* renamed from: a */
    public final anj mo2201a() {
        if (this.f1853a == null) {
            this.f1853a = new anj();
        }
        return this.f1853a;
    }

    /* access modifiers changed from: protected */
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, 0);
        this.height = typedArray.getLayoutDimension(i2, 0);
    }

    public anm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        anj anj;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ani.f1839a);
        float fraction = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            anj = new anj();
            anj.f1840a = fraction;
        } else {
            anj = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1841b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1842c = fraction3;
            anj.f1843d = fraction3;
            anj.f1844e = fraction3;
            anj.f1845f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1842c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1843d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1844e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1845f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1846g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1847h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            anj = anj == null ? new anj() : anj;
            anj.f1848i = fraction10;
        }
        obtainStyledAttributes.recycle();
        this.f1853a = anj;
    }
}
