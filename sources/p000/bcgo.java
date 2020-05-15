package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgo extends bcfz {

    /* renamed from: a */
    private final ConversationId f104115a;

    /* renamed from: b */
    private final bchm f104116b;

    public bcgo(ConversationId conversationId, bchm bchm) {
        this.f104115a = conversationId;
        this.f104116b = bchm;
    }

    /* renamed from: a */
    public final ConversationId mo56754a() {
        return this.f104115a;
    }

    /* renamed from: b */
    public final bchm mo56755b() {
        return this.f104116b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcfz) {
            bcfz bcfz = (bcfz) obj;
            return this.f104115a.equals(bcfz.mo56754a()) && this.f104116b.equals(bcfz.mo56755b());
        }
    }

    public final int hashCode() {
        return ((this.f104115a.hashCode() ^ 1000003) * 1000003) ^ this.f104116b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104115a);
        String valueOf2 = String.valueOf(this.f104116b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddKickGroupUsers{conversationId=");
        sb.append(valueOf);
        sb.append(", groupInfoChanges=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
