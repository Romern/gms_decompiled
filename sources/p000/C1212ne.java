package p000;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: ne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1212ne {
    /* renamed from: a */
    public static Spanned m19667a(String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, i);
    }
}
