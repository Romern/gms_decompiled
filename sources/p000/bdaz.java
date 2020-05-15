package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bdaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdaz extends bdbb {

    /* renamed from: a */
    private final ConversationId.GroupId f105256a;

    /* renamed from: a */
    public final ConversationId.GroupId mo57836a() {
        return this.f105256a;
    }

    /* renamed from: b */
    public final ConversationId.IdType mo57837b() {
        return ConversationId.IdType.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdbe) {
            bdbe bdbe = (bdbe) obj;
            if (ConversationId.IdType.GROUP != bdbe.mo57837b() || !this.f105256a.equals(bdbe.mo57836a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105256a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105256a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("BlockId{group=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bdaz(ConversationId.GroupId groupId) {
        this.f105256a = groupId;
    }
}
