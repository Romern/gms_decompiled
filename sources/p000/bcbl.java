package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbl extends bmxe {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        bcbr bcbr = (bcbr) obj;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = bcbr.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ContactId.ContactType.PHONE_NUMBER;
            }
            if (ordinal == 2) {
                return ContactId.ContactType.EMAIL;
            }
            if (ordinal == 3) {
                return ContactId.ContactType.HANDLER;
            }
            if (ordinal != 4) {
                if (ordinal == 5) {
                    return ContactId.ContactType.DEVICE_ID;
                }
                String valueOf = String.valueOf(bcbr);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return ContactId.ContactType.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        ContactId.ContactType contactType = (ContactId.ContactType) obj;
        bcbr bcbr = bcbr.UNKNOWN;
        int ordinal = contactType.ordinal();
        if (ordinal == 0) {
            return bcbr.UNKNOWN;
        }
        if (ordinal == 1) {
            return bcbr.PHONE_NUMBER;
        }
        if (ordinal == 2) {
            return bcbr.EMAIL;
        }
        if (ordinal == 3) {
            return bcbr.HANDLER;
        }
        if (ordinal == 4) {
            return bcbr.DEVICE_ID;
        }
        String valueOf = String.valueOf(contactType);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown enum value: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
