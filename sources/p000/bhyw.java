package p000;

import java.util.Arrays;

/* renamed from: bhyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyw {

    /* renamed from: a */
    public final String f119919a;

    /* renamed from: b */
    public final String f119920b;

    /* renamed from: c */
    public final long f119921c;

    private bhyw(String str, String str2, long j) {
        this.f119919a = str;
        this.f119920b = str2;
        this.f119921c = j;
    }

    /* renamed from: a */
    public static bhyw m101782a(String str, String str2, Long l) {
        return new bhyw(str, str2, l.longValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhyw) {
            bhyw bhyw = (bhyw) obj;
            return this.f119919a.equals(bhyw.f119919a) && this.f119920b.equals(bhyw.f119920b) && this.f119921c == bhyw.f119921c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119919a, this.f119920b, Long.valueOf(this.f119921c)});
    }

    public final String toString() {
        String str = this.f119919a;
        String str2 = this.f119920b;
        long j = this.f119921c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("accountName: ");
        sb.append(str);
        sb.append("\nclientName: ");
        sb.append(str2);
        sb.append("\ncellId: ");
        sb.append(j);
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo64432a() {
        return this.f119919a.length() + 8 + this.f119920b.length() + 8;
    }
}
