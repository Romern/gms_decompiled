package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: avx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avx extends FrameLayout.LayoutParams {

    /* renamed from: a */
    public int f2400a = 0;

    public avx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avv.f2394a, 0, 0);
        this.f2400a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public avx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
