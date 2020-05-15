package p000;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsq {

    /* renamed from: a */
    private ContactId f104823a;

    /* renamed from: b */
    private ConversationId.OneOfId f104824b;

    /* renamed from: a */
    public final ConversationId mo57472a() {
        String str = this.f104823a == null ? " owner" : "";
        if (this.f104824b == null) {
            str = str.concat(" oneOfId");
        }
        if (str.isEmpty()) {
            return new AutoValue_ConversationId(this.f104823a, this.f104824b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57475b(ContactId contactId) {
        this.f104824b = bcpt.m89601a(contactId);
    }

    /* renamed from: a */
    public final void mo57473a(ContactId contactId) {
        if (contactId != null) {
            this.f104823a = contactId;
            return;
        }
        throw new NullPointerException("Null owner");
    }

    /* renamed from: a */
    public final void mo57474a(ConversationId.GroupId groupId) {
        this.f104824b = bcpt.m89602a(groupId);
    }
}
