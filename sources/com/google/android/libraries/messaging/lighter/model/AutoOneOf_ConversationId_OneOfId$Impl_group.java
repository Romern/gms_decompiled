package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoOneOf_ConversationId_OneOfId$Impl_group extends AutoOneOf_ConversationId_OneOfId$Parent_ {

    /* renamed from: a */
    private final ConversationId.GroupId f111355a;

    /* renamed from: a */
    public final ConversationId.GroupId mo60527a() {
        return this.f111355a;
    }

    /* renamed from: b */
    public final ConversationId.IdType mo60528b() {
        return ConversationId.IdType.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConversationId.OneOfId) {
            ConversationId.OneOfId oneOfId = (ConversationId.OneOfId) obj;
            if (ConversationId.IdType.GROUP != oneOfId.mo60528b() || !this.f111355a.equals(oneOfId.mo60527a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f111355a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111355a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("OneOfId{group=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public AutoOneOf_ConversationId_OneOfId$Impl_group(ConversationId.GroupId groupId) {
        this.f111355a = groupId;
    }
}
