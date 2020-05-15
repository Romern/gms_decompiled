package p000;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;

/* renamed from: butm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butm implements InputFilter {

    /* renamed from: a */
    private static final Charset f154855a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final int f154856b;

    public butm(int i) {
        this.f154856b = i;
    }

    /* renamed from: a */
    private static int m120435a(String str) {
        return str.getBytes(f154855a).length;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int a = m120435a(spanned.subSequence(0, i3).toString());
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        int a2 = m120435a(charSequence2);
        int a3 = m120435a(spanned.subSequence(i4, spanned.length()).toString());
        boolean z = false;
        while (a + a2 + a3 > this.f154856b && a2 > 0) {
            int codePointCount = charSequence2.codePointCount(0, charSequence2.length());
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < codePointCount - 1; i5++) {
                sb.appendCodePoint(charSequence2.codePointAt(charSequence2.offsetByCodePoints(0, i5)));
            }
            charSequence2 = sb.toString();
            a2 = m120435a(charSequence2);
            z = true;
        }
        if (!z) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        if (charSequence instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) charSequence, i, i + charSequence2.length(), null, spannableString, 0);
        }
        return spannableString;
    }
}
