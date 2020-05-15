package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: ajh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajh extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f641a = 0;

    /* renamed from: b */
    public float f642b;

    /* renamed from: c */
    public boolean f643c;

    /* renamed from: d */
    public int f644d;

    public ajh() {
        super(-1, -1);
    }

    public ajh(ajh ajh) {
        super((ViewGroup.MarginLayoutParams) ajh);
        this.f641a = ajh.f641a;
    }

    public ajh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1506a);
        this.f641a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ajh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ajh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
