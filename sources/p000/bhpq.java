package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpq {

    /* renamed from: a */
    private static final int[] f119269a = {16842752, C0126R.attr.theme};

    /* renamed from: b */
    private static final int[] f119270b = {C0126R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m101285a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f119270b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C1416ut) || ((C1416ut) context).f27274a != resourceId) {
            z = false;
        } else {
            z = true;
        }
        if (resourceId == 0 || z) {
            return context;
        }
        C1416ut utVar = new C1416ut(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f119269a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            utVar.getTheme().applyStyle(resourceId2, true);
        }
        return utVar;
    }
}
