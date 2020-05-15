package p000;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import java.util.List;
import java.util.Locale;

/* renamed from: bjtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtw {
    /* renamed from: a */
    public static int m104617a(String str, CharSequence charSequence) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String valueOf = String.valueOf(str.toLowerCase(Locale.getDefault()));
        String str2 = valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf);
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1);
        sb.append(" ");
        sb.append(valueOf2);
        return str2.indexOf(sb.toString().toLowerCase(Locale.getDefault()));
    }

    /* renamed from: a */
    public static SpannableString m104618a(List list, CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            if (((Integer) pair.second).intValue() != 0) {
                spannableString.setSpan(new StyleSpan(1), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((Integer) pair.second).intValue(), 0);
            }
        }
        return spannableString;
    }
}
