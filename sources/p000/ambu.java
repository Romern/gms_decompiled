package p000;

import android.text.TextUtils;

/* renamed from: ambu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambu implements amfc {

    /* renamed from: b */
    private final String f74674b;

    /* renamed from: c */
    private final String f74675c;

    /* renamed from: d */
    private String f74676d;

    public ambu(String str, String str2) {
        this.f74674b = str;
        this.f74675c = str2;
    }

    /* renamed from: b */
    private final String m62560b() {
        String str;
        if (this.f74676d == null) {
            String str2 = this.f74675c;
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if (Character.digit(charAt, 10) != -1 || charAt == '+' || charAt == ',' || charAt == ';' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                        sb.append(charAt);
                    }
                }
                str = sb.toString();
            } else {
                str = "";
            }
            this.f74676d = str;
        }
        return this.f74676d;
    }

    /* renamed from: a */
    public final String mo41120a() {
        return this.f74675c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ambu) {
            return sdg.m34949a(m62560b(), ((ambu) obj).m62560b());
        }
        return false;
    }

    public final String toString() {
        String str = this.f74675c;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f74674b;
        if (str3 != null) {
            str2 = str3;
        }
        StringBuilder sb = new StringBuilder(str.length() + 26 + str2.length());
        sb.append("PhoneNumber:[Value=");
        sb.append(str);
        sb.append(" Type=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
