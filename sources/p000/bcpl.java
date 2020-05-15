package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpl extends bcpn {

    /* renamed from: a */
    private final ConversationId.GroupId f104661a;

    /* renamed from: b */
    public final ConversationId.GroupId mo57102b() {
        return this.f104661a;
    }

    /* renamed from: c */
    public final int mo57103c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcop) {
            bcop bcop = (bcop) obj;
            return bcop.mo57103c() == 3 && this.f104661a.equals(bcop.mo57102b());
        }
    }

    public final int hashCode() {
        return this.f104661a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104661a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("EventCallbackDestination{groupId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpl(ConversationId.GroupId groupId) {
        this.f104661a = groupId;
    }
}
