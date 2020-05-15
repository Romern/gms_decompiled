package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p002v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpo extends AppCompatTextView {
    /* renamed from: a */
    private static int m101282a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m101284a(context)) {
            m101283a(context.getTheme(), i);
        }
    }

    public bhpo(Context context, AttributeSet attributeSet) {
        super(bhpq.m101285a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (m101284a(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, bhpp.f119268b, 16842884, 0);
            int a = m101282a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, bhpp.f119268b, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    m101283a(theme, resourceId);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m101283a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, bhpp.f119267a);
        int a = m101282a(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            C1334rs.m20109c(this, a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhkx.a(android.content.Context, int, boolean):boolean
     arg types: [android.content.Context, ?, int]
     candidates:
      bhkx.a(android.content.Context, int, java.lang.String):int
      bhkx.a(android.content.Context, int, boolean):boolean */
    /* renamed from: a */
    private static boolean m101284a(Context context) {
        return bhkx.m101075a(context, (int) C0126R.attr.textAppearanceLineHeightEnabled, true);
    }
}
