package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: rrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrp {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* renamed from: b */
    public static int m34307b(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 0;
        bjbb.f122458b = false;
        int a = bjbb.mo64964a().mo64966a(str);
        if (a != 0) {
            return a;
        }
        int hashCode = str.hashCode();
        if (hashCode != -180885253) {
            if (hashCode == 1862631875 && str.equals("minutemaid")) {
                c = 0;
                if (c == 0) {
                    return C0126R.style.auth_minutemaid_theme_material;
                }
                if (c != 1) {
                    return 0;
                }
                int i = Build.VERSION.SDK_INT;
                return C0126R.style.DialogNoTitleTheme;
            }
        } else if (str.equals("clamshell")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    public static void m34302a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        viewGroup.requestApplyInsets();
        viewGroup.addOnLayoutChangeListener(new rro());
    }

    /* renamed from: a */
    public static void m34303a(Activity activity, String str) {
        int b = m34307b(str);
        if (b != 0) {
            activity.setTheme(b);
        } else {
            activity.setTheme(2132018269);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m34304a(Activity activity, String str, boolean z) {
        int b = m34307b(str);
        if (b != 0) {
            activity.setTheme(b);
        } else {
            activity.setTheme(2132018269);
        }
        if (z) {
            bizb.m103017a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static void m34305a(Activity activity, boolean z, Context context) {
        if (!z) {
            Window window = activity.getWindow();
            int i = Build.VERSION.SDK_INT;
            bizb.m103021b(window, 5634);
            bizb.m103023d(window, 5634);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843857, 16843858});
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color2);
            obtainStyledAttributes.recycle();
            return;
        }
        bizb.m103017a(activity.getWindow());
    }

    /* renamed from: a */
    public static boolean m34306a(String str) {
        return "glif".equals(str) || "glif_light".equals(str) || "glif_v2".equals(str) || "glif_v2_light".equals(str) || "glif_v3".equals(str) || "glif_v3_light".equals(str);
    }
}
