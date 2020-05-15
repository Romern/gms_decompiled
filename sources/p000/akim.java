package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: akim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akim {
    /* renamed from: a */
    public static int m59827a(Context context) {
        return m59830b(context, C0126R.attr.colorAccent);
    }

    /* renamed from: b */
    public static int m59829b(Context context) {
        return m59830b(context, 16842808);
    }

    /* renamed from: c */
    public static int m59831c(Context context) {
        return m59830b(context, 16843782);
    }

    /* renamed from: d */
    public static boolean m59832d(Context context) {
        return context.getResources().getBoolean(C0126R.bool.isTablet);
    }

    /* renamed from: e */
    public static Uri m59833e(Context context) {
        Resources a = ((C1416ut) context).mo16091a();
        return new Uri.Builder().scheme("android.resource").authority(a.getResourcePackageName(C0126R.raw.sharing_silent_chime)).appendPath(a.getResourceTypeName(C0126R.raw.sharing_silent_chime)).appendPath(a.getResourceEntryName(C0126R.raw.sharing_silent_chime)).build();
    }

    /* renamed from: a */
    public static int m59828a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m59830b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
