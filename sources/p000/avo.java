package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: avo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avo extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f2386a;

    /* renamed from: b */
    public int f2387b;

    /* renamed from: c */
    public float f2388c = 0.0f;

    /* renamed from: d */
    public boolean f2389d;

    /* renamed from: e */
    public int f2390e;

    /* renamed from: f */
    public int f2391f;

    public avo() {
        super(-1, -1);
    }

    public avo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1725a);
        this.f2387b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
