package p000;

import com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Impl_group;
import com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Impl_oneToOne;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpt {
    /* renamed from: a */
    static ConversationId.OneOfId m89601a(ContactId contactId) {
        if (contactId != null) {
            return new AutoOneOf_ConversationId_OneOfId$Impl_oneToOne(contactId);
        }
        throw null;
    }

    /* renamed from: a */
    static ConversationId.OneOfId m89602a(ConversationId.GroupId groupId) {
        if (groupId != null) {
            return new AutoOneOf_ConversationId_OneOfId$Impl_group(groupId);
        }
        throw null;
    }
}
