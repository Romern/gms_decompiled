package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: behf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behf {

    /* renamed from: a */
    private static final Pattern f111556a = Pattern.compile("(\\w+).*");

    /* renamed from: a */
    public static bngx m95041a(Uri uri) {
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            return bngx.m109376e();
        }
        return bngx.m109355a(bmyx.m108643a("+").mo66917a().mo66918a((CharSequence) encodedFragment.substring(10)));
    }

    /* renamed from: a */
    public static String m95042a(String str) {
        Matcher matcher = f111556a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid fragment spec: ") : "Invalid fragment spec: ".concat(valueOf));
    }

    /* renamed from: a */
    public static String m95043a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        String valueOf = String.valueOf(bmxr.m108544a("+").mo66874a((Iterable) list));
        return valueOf.length() == 0 ? new String("transform=") : "transform=".concat(valueOf);
    }
}
