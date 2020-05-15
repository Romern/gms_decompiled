package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoOneOf_ConversationId_OneOfId$Impl_oneToOne extends AutoOneOf_ConversationId_OneOfId$Parent_ {

    /* renamed from: a */
    private final ContactId f111356a;

    /* renamed from: b */
    public final ConversationId.IdType mo60528b() {
        return ConversationId.IdType.ONE_TO_ONE;
    }

    /* renamed from: c */
    public final ContactId mo60532c() {
        return this.f111356a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConversationId.OneOfId) {
            ConversationId.OneOfId oneOfId = (ConversationId.OneOfId) obj;
            if (ConversationId.IdType.ONE_TO_ONE != oneOfId.mo60528b() || !this.f111356a.equals(oneOfId.mo60532c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f111356a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111356a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("OneOfId{oneToOne=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public AutoOneOf_ConversationId_OneOfId$Impl_oneToOne(ContactId contactId) {
        this.f111356a = contactId;
    }
}
