package p000;

/* renamed from: bbxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbxy extends bbyi {

    /* renamed from: a */
    private final bngx f103734a;

    public bbxy(bngx bngx) {
        this.f103734a = bngx;
    }

    /* renamed from: a */
    public final bngx mo56508a() {
        return this.f103734a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbyi) {
            return bnkn.m109669a(this.f103734a, ((bbyi) obj).mo56508a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103734a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103734a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("GetConversationPropertiesResult{conversationCapabilities=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
