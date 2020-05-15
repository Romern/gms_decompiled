package p000;

import android.text.Html;
import android.text.Spanned;

/* renamed from: aasr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasr {

    /* renamed from: a */
    private static final String[] f56522a = {"&", "&amp;", "<", "&lt;", ">", "&gt;", "\"", "&quot;", "'", "&#39;", "{", "&#123;", " ", "&nbsp;", "　", "&#x3000;"};

    /* renamed from: a */
    public static Spanned m46941a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f56522a;
            if (i >= strArr.length) {
                return Html.fromHtml(str);
            }
            str = str.replace(strArr[i + 1], strArr[i]);
            i += 2;
        }
    }
}
