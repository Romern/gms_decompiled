package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.ads.internal.csi.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0382g extends C0383h {
    /* renamed from: a */
    private static final String m5354a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0) {
            int i2 = length - 1;
            if (str.charAt(i2) != ',') {
                break;
            }
            length = i2;
        }
        if (length >= i) {
            return (i == 0 && length == str.length()) ? str : str.substring(i, length);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo6614a(String str, String str2) {
        String a = m5354a(str);
        String a2 = m5354a(str2);
        if (TextUtils.isEmpty(a)) {
            return a2;
        }
        if (TextUtils.isEmpty(a2)) {
            return a;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length());
        sb.append(a);
        sb.append(",");
        sb.append(a2);
        return sb.toString();
    }
}
