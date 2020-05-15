package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: rzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzi {
    /* renamed from: a */
    public static String m34704a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("//")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("https:") : "https:".concat(valueOf);
    }

    /* renamed from: a */
    public static String m34705a(String str, int i) {
        Set<String> set;
        boolean z;
        String str2 = str;
        int i2 = i;
        if (ryx.m34690b(str)) {
            return ryx.m34686a(i2, str2);
        }
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        if (!rze.f43884a.matcher(str2).find()) {
            str3 = str2;
            str2 = "https://images" + rze.m34698a() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        }
        Uri parse = Uri.parse(str2);
        Uri.Builder buildUpon = Uri.EMPTY.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (!(i2 == -1 || i2 == -1)) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        Uri build = buildUpon.build();
        if (!parse.isOpaque()) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                set = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i3 = 0;
                do {
                    int indexOf = encodedQuery.indexOf(38, i3);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i3);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i3, indexOf2)));
                    i3 = indexOf + 1;
                } while (i3 < encodedQuery.length());
                set = Collections.unmodifiableSet(linkedHashSet);
            }
            for (String str4 : set) {
                if (build.getQueryParameter(str4) == null) {
                    boolean z2 = true;
                    if ("resize_w".equals(str4) || "resize_h".equals(str4) || "no_expand".equals(str4)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(i2 == -1 || i2 == -1)) {
                        z2 = false;
                    }
                    Uri.Builder buildUpon2 = build.buildUpon();
                    if ("url".equals(str4)) {
                        buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                    } else if (!z2 || !z) {
                        for (String str5 : parse.getQueryParameters(str4)) {
                            buildUpon2.appendQueryParameter(str4, str5);
                        }
                    }
                    build = buildUpon2.build();
                }
            }
            if (str3 != null && build.getQueryParameter("url") == null) {
                Uri.Builder buildUpon3 = build.buildUpon();
                buildUpon3.appendQueryParameter("url", str3);
                build = buildUpon3.build();
            }
            if (build.getQueryParameter("container") == null) {
                Uri.Builder buildUpon4 = build.buildUpon();
                buildUpon4.appendQueryParameter("container", "esmobile");
                build = buildUpon4.build();
            }
            if (build.getQueryParameter("gadget") == null) {
                Uri.Builder buildUpon5 = build.buildUpon();
                buildUpon5.appendQueryParameter("gadget", "a");
                build = buildUpon5.build();
            }
            if (build.getQueryParameter("rewriteMime") == null) {
                Uri.Builder buildUpon6 = build.buildUpon();
                buildUpon6.appendQueryParameter("rewriteMime", "image/*");
                build = buildUpon6.build();
            }
            return build.toString();
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }
}
