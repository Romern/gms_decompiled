package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhki {

    /* renamed from: a */
    private static final int[] f118909a = {C0126R.attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f118910b = {C0126R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static TypedArray m101052a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m101054a(context, attributeSet, i, i2);
        m101058c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static adr m101056b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m101054a(context, attributeSet, i, i2);
        m101058c(context, attributeSet, iArr, i, i2, iArr2);
        return adr.m523a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: c */
    private static void m101058c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhjv.f118878d, i, i2);
        boolean z = false;
        if (obtainStyledAttributes.getBoolean(2, false)) {
            int length = iArr2.length;
            if (length != 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (obtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                            obtainStyledAttributes2.recycle();
                            break;
                        }
                        i3++;
                    } else {
                        obtainStyledAttributes2.recycle();
                        z = true;
                        break;
                    }
                }
            } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
                z = true;
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
            return;
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static void m101053a(Context context) {
        m101055a(context, f118909a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m101057b(Context context) {
        m101055a(context, f118910b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static void m101054a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhjv.f118878d, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0126R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m101057b(context);
            }
        }
        m101053a(context);
    }

    /* renamed from: a */
    private static void m101055a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = 0;
        while (i < iArr.length) {
            if (obtainStyledAttributes.hasValue(i)) {
                i++;
            } else {
                obtainStyledAttributes.recycle();
                StringBuilder sb = new StringBuilder(str.length() + 77);
                sb.append("The style on this component requires your app theme to be ");
                sb.append(str);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        obtainStyledAttributes.recycle();
    }
}
