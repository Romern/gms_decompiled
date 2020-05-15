package p000;

/* renamed from: bbpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbpa extends bbpe {

    /* renamed from: a */
    private final String f103032a;

    /* renamed from: b */
    private final bngx f103033b;

    public bbpa(String str, bngx bngx) {
        this.f103032a = str;
        this.f103033b = bngx;
    }

    /* renamed from: a */
    public final String mo56284a() {
        return this.f103032a;
    }

    /* renamed from: b */
    public final bngx mo56285b() {
        return this.f103033b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbpe) {
            bbpe bbpe = (bbpe) obj;
            return this.f103032a.equals(bbpe.mo56284a()) && bnkn.m109669a(this.f103033b, bbpe.mo56285b());
        }
    }

    public final int hashCode() {
        return ((this.f103032a.hashCode() ^ 1000003) * 1000003) ^ this.f103033b.hashCode();
    }

    public final String toString() {
        String str = this.f103032a;
        String valueOf = String.valueOf(this.f103033b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length());
        sb.append("GetBlockedConversationsResult{nextPageToken=");
        sb.append(str);
        sb.append(", conversationIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
