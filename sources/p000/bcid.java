package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcid extends bcjp {

    /* renamed from: a */
    public final ConversationId f104197a;

    /* renamed from: b */
    public final long f104198b;

    public bcid(ConversationId conversationId, long j) {
        if (conversationId != null) {
            this.f104197a = conversationId;
            this.f104198b = j;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final ConversationId mo56926a() {
        return this.f104197a;
    }

    /* renamed from: b */
    public final long mo56927b() {
        return this.f104198b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcjp) {
            bcjp bcjp = (bcjp) obj;
            return this.f104197a.equals(bcjp.mo56926a()) && this.f104198b == bcjp.mo56927b();
        }
    }

    public final int hashCode() {
        int hashCode = this.f104197a.hashCode();
        long j = this.f104198b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104197a);
        long j = this.f104198b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("DeleteConversationParams{conversationId=");
        sb.append(valueOf);
        sb.append(", lastDeleteTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
