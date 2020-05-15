package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgt extends bchk {

    /* renamed from: a */
    private final ConversationId f104124a;

    /* renamed from: b */
    private final long f104125b;

    public bcgt(ConversationId conversationId, long j) {
        if (conversationId != null) {
            this.f104124a = conversationId;
            this.f104125b = j;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final ConversationId mo56825a() {
        return this.f104124a;
    }

    /* renamed from: b */
    public final long mo56826b() {
        return this.f104125b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchk) {
            bchk bchk = (bchk) obj;
            return this.f104124a.equals(bchk.mo56825a()) && this.f104125b == bchk.mo56826b();
        }
    }

    public final int hashCode() {
        int hashCode = this.f104124a.hashCode();
        long j = this.f104125b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104124a);
        long j = this.f104125b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
        sb.append("DeleteConversation{conversationId=");
        sb.append(valueOf);
        sb.append(", deleteTimestampMicroSec=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
