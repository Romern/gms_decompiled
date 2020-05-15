package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcsl */
public final /* synthetic */ class bcsl implements bmxz {

    /* renamed from: a */
    private final int f104808a;

    public bcsl(int i) {
        this.f104808a = i;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        int i = this.f104808a;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        return ((ContactId.ContactType) obj).f111365f == i;
    }
}
