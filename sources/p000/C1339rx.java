package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: rx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1339rx extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f26956a = 8388627;

    public C1339rx(int i, int i2) {
        super(i, i2);
    }

    public C1339rx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27193b);
        this.f26956a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C1339rx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C1339rx(C1339rx rxVar) {
        super((ViewGroup.MarginLayoutParams) rxVar);
        this.f26956a = rxVar.f26956a;
    }
}
