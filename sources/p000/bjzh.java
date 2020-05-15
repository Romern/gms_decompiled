package p000;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: bjzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzh {
    /* renamed from: a */
    public static DisplayMetrics m104970a(Context context) {
        int i = Build.VERSION.SDK_INT;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
