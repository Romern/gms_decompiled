package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: bhky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhky {
    /* renamed from: a */
    public static ColorStateList m101076a(Context context, adr adr, int i) {
        int f;
        ColorStateList a;
        if (adr.mo461f(i) && (f = adr.mo460f(i, 0)) != 0 && (a = C1391tv.m20458a(context, f)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return adr.mo459e(i);
    }

    /* renamed from: b */
    public static Drawable m101078b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C1391tv.m20459b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }

    /* renamed from: a */
    public static ColorStateList m101077a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = C1391tv.m20458a(context, resourceId)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return typedArray.getColorStateList(i);
    }
}
