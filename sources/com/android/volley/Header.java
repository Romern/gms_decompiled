package com.android.volley;

import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Header {

    /* renamed from: a */
    private final String f7273a;

    /* renamed from: b */
    private final String f7274b;

    public Header(String str, String str2) {
        this.f7273a = str;
        this.f7274b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Header header = (Header) obj;
            return TextUtils.equals(this.f7273a, header.f7273a) && TextUtils.equals(this.f7274b, header.f7274b);
        }
    }

    public final String getName() {
        return this.f7273a;
    }

    public final String getValue() {
        return this.f7274b;
    }

    public int hashCode() {
        return (this.f7273a.hashCode() * 31) + this.f7274b.hashCode();
    }

    public String toString() {
        String str = this.f7273a;
        String str2 = this.f7274b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
