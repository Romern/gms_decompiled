package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: ancb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancb {

    /* renamed from: a */
    public static final ancb f76610a = new ancb();

    /* renamed from: b */
    private Pattern[] f76611b = new Pattern[0];

    /* renamed from: c */
    private String[] f76612c = new String[0];

    private ancb() {
    }

    /* renamed from: a */
    public static void m63964a(Bundle bundle, String[] strArr, String[] strArr2) {
        bundle.putStringArray("config.url_uncompress.patterns", strArr);
        bundle.putStringArray("config.url_uncompress.replacements", strArr2);
    }

    /* renamed from: a */
    public final synchronized String mo41685a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                Pattern[] patternArr = this.f76611b;
                if (i >= patternArr.length) {
                    break;
                }
                str = patternArr[i].matcher(str).replaceAll(this.f76612c[i]);
                i++;
            }
        } else {
            str = null;
        }
        return str;
    }

    /* renamed from: a */
    public final synchronized void mo41686a(String[] strArr, String[] strArr2) {
        boolean z;
        int length = strArr.length;
        if (length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        this.f76611b = new Pattern[length];
        this.f76612c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.f76611b[i] = Pattern.compile(strArr[i]);
        }
    }
}
