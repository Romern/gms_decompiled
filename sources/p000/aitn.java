package p000;

/* renamed from: aitn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aitn extends aivt {

    /* renamed from: a */
    private final String f69709a;

    /* renamed from: b */
    private final aiml f69710b;

    public aitn(aiml aiml, String str) {
        this.f69710b = aiml;
        this.f69709a = str;
    }

    /* renamed from: a */
    public final String mo38004a() {
        return this.f69709a;
    }

    /* renamed from: b */
    public final aiml mo38005b() {
        return this.f69710b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aivt) {
            aivt aivt = (aivt) obj;
            return this.f69710b.equals(aivt.mo38005b()) && ((str = this.f69709a) == null ? aivt.mo38004a() == null : str.equals(aivt.mo38004a()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f69710b.hashCode() ^ 1000003) * 1000003;
        String str = this.f69709a;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f69710b);
        String str = this.f69709a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(str).length());
        sb.append("AcceptingConnectionsInfo{incomingConnectionCallback=");
        sb.append(valueOf);
        sb.append(", password=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
