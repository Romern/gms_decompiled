package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpk extends bcpn {

    /* renamed from: a */
    private final ContactId f104660a;

    /* renamed from: a */
    public final ContactId mo57101a() {
        return this.f104660a;
    }

    /* renamed from: c */
    public final int mo57103c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcop) {
            bcop bcop = (bcop) obj;
            return bcop.mo57103c() == 2 && this.f104660a.equals(bcop.mo57101a());
        }
    }

    public final int hashCode() {
        return this.f104660a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104660a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("EventCallbackDestination{contactId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpk(ContactId contactId) {
        this.f104660a = contactId;
    }
}
