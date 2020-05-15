package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bdba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdba extends bdbb {

    /* renamed from: a */
    private final ContactId f105257a;

    /* renamed from: b */
    public final ConversationId.IdType mo57837b() {
        return ConversationId.IdType.ONE_TO_ONE;
    }

    /* renamed from: c */
    public final ContactId mo57841c() {
        return this.f105257a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdbe) {
            bdbe bdbe = (bdbe) obj;
            if (ConversationId.IdType.ONE_TO_ONE != bdbe.mo57837b() || !this.f105257a.equals(bdbe.mo57841c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105257a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105257a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("BlockId{oneToOne=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bdba(ContactId contactId) {
        this.f105257a = contactId;
    }
}
