package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcpo {
    /* renamed from: a */
    public static bcop m89592a(ContactId contactId) {
        if (contactId != null) {
            return new bcpk(contactId);
        }
        throw null;
    }

    /* renamed from: a */
    public static bcop m89593a(ConversationId.GroupId groupId) {
        if (groupId != null) {
            return new bcpl(groupId);
        }
        throw null;
    }
}
