package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: azpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azpj {
    /* renamed from: a */
    public static boolean m86088a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.compile("[0-9a-zA-Z]+([.-]{1}[0-9a-zA-Z]+)*(:[0-9]{1,5})?$").matcher(Uri.parse(str).getAuthority()).matches()) {
                String replace = cfgs.f183989a.mo6606a().mo81186ao().replace(".", "\\.");
                String host = Uri.parse(str).getHost();
                for (String str2 : bmyx.m108640a(';').mo66918a((CharSequence) replace)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(str2).length());
                    sb.append("^");
                    sb.append(str2);
                    sb.append("$|.*\\.");
                    sb.append(str2);
                    sb.append("$");
                    if (Pattern.compile(sb.toString()).matcher(host).matches()) {
                        return true;
                    }
                }
                for (String str3 : bmyx.m108640a(';').mo66918a((CharSequence) cfeo.f183719a.mo6606a().mo81074cz().replace(".", "\\."))) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 2);
                    sb2.append("^");
                    sb2.append(str3);
                    sb2.append("$");
                    if (Pattern.compile(sb2.toString()).matcher(host).matches()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
