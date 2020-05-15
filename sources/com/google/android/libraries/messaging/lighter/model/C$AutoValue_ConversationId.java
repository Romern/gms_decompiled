package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ConversationId  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C$AutoValue_ConversationId extends ConversationId {

    /* renamed from: a */
    public final ContactId f111338a;

    /* renamed from: b */
    public final ConversationId.OneOfId f111339b;

    public C$AutoValue_ConversationId(ContactId contactId, ConversationId.OneOfId oneOfId) {
        if (contactId != null) {
            this.f111338a = contactId;
            if (oneOfId != null) {
                this.f111339b = oneOfId;
                return;
            }
            throw new NullPointerException("Null oneOfId");
        }
        throw new NullPointerException("Null owner");
    }

    /* renamed from: a */
    public final ContactId mo60498a() {
        return this.f111338a;
    }

    /* renamed from: b */
    public final ConversationId.OneOfId mo60499b() {
        return this.f111339b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationId) {
            ConversationId conversationId = (ConversationId) obj;
            return this.f111338a.equals(conversationId.mo60498a()) && this.f111339b.equals(conversationId.mo60499b());
        }
    }

    public final int hashCode() {
        return ((this.f111338a.hashCode() ^ 1000003) * 1000003) ^ this.f111339b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111338a);
        String valueOf2 = String.valueOf(this.f111339b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("ConversationId{owner=");
        sb.append(valueOf);
        sb.append(", oneOfId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
