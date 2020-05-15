package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: azxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxe {
    static {
        Math.round(30.599998f);
        Math.round(127.5f);
        Math.round(96.9f);
    }

    /* renamed from: a */
    public static int m86324a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
}
