package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.felicanetworks.mfc.C0126R;
import java.util.List;
import java.util.Locale;

/* renamed from: bkcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcd {
    /* renamed from: a */
    public static String m105303a(String str, int i, int i2, boolean z, List list) {
        String str2;
        if (((Boolean) bjwd.f123465e.mo54082a()).booleanValue() && str.contains("?")) {
            return str;
        }
        if (z) {
            int i3 = Build.VERSION.SDK_INT;
            str2 = "-rw";
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append("-");
                sb.append((String) list.get(i4));
            }
        }
        return String.format(Locale.US, "%s=w%d-h%d-e365%s%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, sb.toString());
    }

    /* renamed from: a */
    public static void m105304a(View view, int i) {
        m105305a(view, i, -1, null);
    }

    /* renamed from: a */
    public static void m105305a(View view, int i, long j, Runnable runnable) {
        view.animate().cancel();
        view.setVisibility(0);
        view.setTranslationY((float) i);
        view.setAlpha(0.0f);
        if (i < 0) {
            view.setTag(C0126R.C0129id.view_is_animating_downwards, Boolean.TRUE);
        }
        ViewPropertyAnimator translationY = view.animate().alpha(1.0f).translationY(0.0f);
        long duration = view.animate().getDuration();
        if (j >= 0) {
            translationY.setDuration(j);
        }
        translationY.setListener(new bkcc(runnable, view, j, duration));
        translationY.start();
    }
}
