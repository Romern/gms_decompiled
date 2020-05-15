package com.google.location.nearby.common.fastpair.slice;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_DeviceDetailsLinks extends DeviceDetailsLinks {

    /* renamed from: a */
    private final byte[] f191750a;

    /* renamed from: b */
    private final boolean f191751b;

    /* renamed from: c */
    private final String f191752c;

    /* renamed from: d */
    private final String f191753d;

    /* renamed from: e */
    private final boolean f191754e;

    /* renamed from: f */
    private final String f191755f;

    /* renamed from: g */
    private final String f191756g;

    public AutoValue_DeviceDetailsLinks(byte[] bArr, boolean z, String str, String str2, boolean z2, String str3, String str4) {
        this.f191750a = bArr;
        this.f191751b = z;
        this.f191752c = str;
        this.f191753d = str2;
        this.f191754e = z2;
        this.f191755f = str3;
        this.f191756g = str4;
    }

    /* renamed from: a */
    public final byte[] mo86671a() {
        return this.f191750a;
    }

    /* renamed from: b */
    public final boolean mo86672b() {
        return this.f191751b;
    }

    /* renamed from: c */
    public final String mo86673c() {
        return this.f191752c;
    }

    /* renamed from: d */
    public final String mo86674d() {
        return this.f191753d;
    }

    /* renamed from: e */
    public final boolean mo86675e() {
        return this.f191754e;
    }

    /* renamed from: f */
    public final String mo86676f() {
        return this.f191755f;
    }

    /* renamed from: g */
    public final String mo86677g() {
        return this.f191756g;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f191750a);
        boolean z = this.f191751b;
        String str = this.f191752c;
        String str2 = this.f191753d;
        boolean z2 = this.f191754e;
        String str3 = this.f191755f;
        String str4 = this.f191756g;
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 134 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("DeviceDetailsLinks{accountKey=");
        sb.append(arrays);
        sb.append(", assistantSupported=");
        sb.append(z);
        sb.append(", actionUrl=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", firmwareUpdateAvailable=");
        sb.append(z2);
        sb.append(", authority=");
        sb.append(str3);
        sb.append(", signature=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
