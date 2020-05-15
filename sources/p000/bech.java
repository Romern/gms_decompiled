package p000;

import java.util.List;

/* renamed from: bech */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bech extends beci {

    /* renamed from: a */
    public final String f106902a;

    /* renamed from: b */
    private final List f106903b;

    public bech(String str, List list) {
        if (str != null) {
            this.f106902a = str;
            this.f106903b = list;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final String mo58551a() {
        return this.f106902a;
    }

    /* renamed from: b */
    public final List mo58552b() {
        return this.f106903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beci) {
            beci beci = (beci) obj;
            return this.f106902a.equals(beci.mo58551a()) && this.f106903b.equals(beci.mo58552b());
        }
    }

    public final int hashCode() {
        return ((this.f106902a.hashCode() ^ 1000003) * 1000003) ^ this.f106903b.hashCode();
    }

    public final String toString() {
        String str = this.f106902a;
        String valueOf = String.valueOf(this.f106903b);
        StringBuilder sb = new StringBuilder(str.length() + 27 + String.valueOf(valueOf).length());
        sb.append("SafeSql{query=");
        sb.append(str);
        sb.append(", queryArgs=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
