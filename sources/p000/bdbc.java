package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bdbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbc {
    /* renamed from: a */
    public static bdbe m90521a(ContactId contactId) {
        if (contactId != null) {
            return new bdba(contactId);
        }
        throw null;
    }

    /* renamed from: a */
    public static bdbe m90522a(ConversationId.GroupId groupId) {
        if (groupId != null) {
            return new bdaz(groupId);
        }
        throw null;
    }
}
