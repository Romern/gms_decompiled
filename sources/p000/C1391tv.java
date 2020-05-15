package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.WeakHashMap;

/* renamed from: tv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1391tv {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    /* renamed from: a */
    public static ColorStateList m20458a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m20459b(Context context, int i) {
        return acp.m472a().mo353a(context, i);
    }
}
