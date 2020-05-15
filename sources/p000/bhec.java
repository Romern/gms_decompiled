package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: bhec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhec extends FrameLayout.LayoutParams {

    /* renamed from: a */
    int f118359a = 0;

    /* renamed from: b */
    float f118360b = 0.5f;

    public bhec() {
        super(-1, -1);
    }

    public bhec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bheh.f118379d);
        this.f118359a = obtainStyledAttributes.getInt(0, 0);
        this.f118360b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public bhec(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
