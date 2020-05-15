package p000;

import java.util.List;

/* renamed from: azqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azqo extends aztz {

    /* renamed from: a */
    private final String f99905a;

    /* renamed from: b */
    private final String f99906b;

    /* renamed from: c */
    private final List f99907c;

    public azqo(String str, String str2, List list) {
        this.f99905a = str;
        this.f99906b = str2;
        this.f99907c = list;
    }

    /* renamed from: a */
    public final String mo55228a() {
        return this.f99905a;
    }

    /* renamed from: b */
    public final String mo55229b() {
        return this.f99906b;
    }

    /* renamed from: c */
    public final List mo55230c() {
        return this.f99907c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aztz) {
            aztz aztz = (aztz) obj;
            return this.f99905a.equals(aztz.mo55228a()) && this.f99906b.equals(aztz.mo55229b()) && this.f99907c.equals(aztz.mo55230c());
        }
    }

    public final int hashCode() {
        return ((((this.f99905a.hashCode() ^ 1000003) * 1000003) ^ this.f99906b.hashCode()) * 1000003) ^ this.f99907c.hashCode();
    }

    public final String toString() {
        String str = this.f99905a;
        String str2 = this.f99906b;
        String valueOf = String.valueOf(this.f99907c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("NativeMethodRequest{callToken=");
        sb.append(str);
        sb.append(", methodName=");
        sb.append(str2);
        sb.append(", arguments=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
