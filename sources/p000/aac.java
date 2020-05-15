package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: aac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aac extends ViewGroup.MarginLayoutParams {

    /* renamed from: g */
    public float f11g;

    /* renamed from: h */
    public int f12h;

    public aac(int i) {
        super(i, -2);
        this.f12h = -1;
        this.f11g = 0.0f;
    }

    public aac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27206o);
        this.f11g = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f12h = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public aac(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12h = -1;
    }
}
