package p000;

import java.util.Arrays;

/* renamed from: bkvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkvo {

    /* renamed from: a */
    public final String f125334a;

    /* renamed from: b */
    public final String f125335b;

    /* renamed from: c */
    public final String f125336c;

    /* renamed from: d */
    public final String f125337d;

    /* renamed from: e */
    public final boolean f125338e;

    /* renamed from: f */
    public final boolean f125339f;

    /* renamed from: g */
    public final String f125340g;

    /* renamed from: h */
    public final String f125341h;

    public bkvo(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6) {
        bkww.m106781a(str, "sessionId");
        this.f125334a = str;
        this.f125335b = str2;
        bkww.m106781a(str3, "displayName");
        this.f125336c = str3;
        bkww.m106781a(str4, "color");
        this.f125337d = str4;
        this.f125338e = z;
        this.f125339f = z2;
        bkww.m106781a(str5, "photoUrl");
        this.f125340g = str5;
        this.f125341h = str6;
    }

    /* renamed from: a */
    public static bkvo m106713a(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        return new bkvo(str, str2, str3, str4, false, z, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkvo)) {
            return false;
        }
        bkvo bkvo = (bkvo) obj;
        return bkwv.m106780a(this.f125334a, bkvo.f125334a, this.f125335b, bkvo.f125335b, this.f125336c, bkvo.f125336c, this.f125337d, bkvo.f125337d, Boolean.valueOf(this.f125338e), Boolean.valueOf(bkvo.f125338e), Boolean.valueOf(this.f125339f), Boolean.valueOf(bkvo.f125339f), this.f125340g, bkvo.f125340g, this.f125341h, bkvo.f125341h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125334a, this.f125335b, this.f125336c, this.f125337d, Boolean.valueOf(this.f125338e), this.f125340g, this.f125341h});
    }

    public final String toString() {
        String str = this.f125334a;
        String str2 = this.f125335b;
        String str3 = this.f125341h;
        String str4 = this.f125336c;
        String str5 = this.f125337d;
        boolean z = this.f125338e;
        boolean z2 = this.f125339f;
        String str6 = this.f125340g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 116 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("SessionMetadata [sessionId=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", permissionId=");
        sb.append(str3);
        sb.append(", displayName=");
        sb.append(str4);
        sb.append(", color=");
        sb.append(str5);
        sb.append(", isAnonymous=");
        sb.append(z);
        sb.append(", isMe=");
        sb.append(z2);
        sb.append(", photoUrl=");
        sb.append(str6);
        sb.append("]");
        return sb.toString();
    }
}
