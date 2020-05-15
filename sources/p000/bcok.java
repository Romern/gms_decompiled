package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Set;

/* renamed from: bcok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcok {

    /* renamed from: a */
    private bmxv f104621a;

    /* renamed from: b */
    private Set f104622b;

    /* renamed from: c */
    private bmxv f104623c;

    /* renamed from: d */
    private String f104624d;

    public bcok() {
    }

    /* renamed from: a */
    public final bcol mo57063a() {
        String str = this.f104622b == null ? " phoneNumbers" : "";
        if (this.f104624d == null) {
            str = str.concat(" tachyonAppName");
        }
        if (str.isEmpty()) {
            return new bcre(this.f104621a, this.f104622b, this.f104623c, this.f104624d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57067b(String str) {
        this.f104621a = bmxv.m108566b(str);
    }

    /* renamed from: c */
    public final void mo57068c(String str) {
        if (str != null) {
            this.f104624d = str;
            return;
        }
        throw new NullPointerException("Null tachyonAppName");
    }

    public bcok(byte[] bArr) {
        this.f104621a = bmvz.f131120a;
        this.f104623c = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57064a(ContactId contactId) {
        mo57068c(contactId.mo60493b());
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.mo60494c().ordinal();
        if (ordinal == 1) {
            mo57066a(bnic.m109489a(contactId.mo60492a()));
        } else if (ordinal == 2) {
            mo57067b(contactId.mo60492a());
            mo57066a(bnon.f131923a);
        } else if (ordinal != 4) {
            bbos.m88294d("AccountUsers", "Absent contact type");
            mo57067b(contactId.mo60492a());
            mo57066a(bnon.f131923a);
        } else {
            mo57065a(contactId.mo60492a());
            mo57066a(bnon.f131923a);
        }
    }

    /* renamed from: a */
    public final void mo57065a(String str) {
        this.f104623c = bmxv.m108566b(str);
    }

    /* renamed from: a */
    public final void mo57066a(Set set) {
        if (set != null) {
            this.f104622b = set;
            return;
        }
        throw new NullPointerException("Null phoneNumbers");
    }
}
