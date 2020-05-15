package p000;

import java.util.Arrays;

/* renamed from: emo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emo {

    /* renamed from: a */
    public final String f15295a;

    /* renamed from: b */
    public final String f15296b;

    /* renamed from: c */
    public final String f15297c;

    /* renamed from: d */
    public final String f15298d;

    /* renamed from: e */
    public final boolean f15299e;

    /* renamed from: f */
    public final String f15300f;

    /* renamed from: g */
    public final String f15301g;

    public emo(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.f15295a = str;
        this.f15296b = str2;
        this.f15297c = str3;
        this.f15298d = str4;
        this.f15299e = z;
        this.f15300f = str5;
        this.f15301g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof emo) {
            emo emo = (emo) obj;
            return this.f15299e == emo.f15299e && bmxi.m108538a(this.f15295a, emo.f15295a) && bmxi.m108538a(this.f15296b, emo.f15296b) && bmxi.m108538a(this.f15297c, emo.f15297c) && bmxi.m108538a(this.f15298d, emo.f15298d) && bmxi.m108538a(this.f15300f, emo.f15300f) && bmxi.m108538a(this.f15301g, emo.f15301g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15295a, this.f15296b, this.f15297c, Boolean.valueOf(this.f15299e), this.f15300f, this.f15301g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f15295a);
        if (this.f15296b != null) {
            sb.append(":");
            sb.append(this.f15296b);
        }
        if (this.f15299e) {
            sb.append(":permitMetered");
        }
        if (this.f15300f != null) {
            sb.append(":");
            sb.append(this.f15300f);
        }
        if (this.f15301g != null) {
            sb.append(":");
            sb.append(this.f15301g);
        }
        return sb.toString();
    }
}
