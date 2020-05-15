package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bclk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclk {
    /* renamed from: a */
    public static cbds m89244a(bcop bcop) {
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int c = bcop.mo57103c();
        int i = c - 1;
        if (c == 0) {
            throw null;
        } else if (i == 1) {
            return m89245a(bcop.mo57101a());
        } else {
            if (i != 2) {
                bxvd da = cbds.f176782e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbds) da.f164949b).f176784a = cbel.m127776a(2);
                return (cbds) da.mo74062i();
            }
            bxvd da2 = cbds.f176782e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cbds) da2.f164949b).f176784a = cbel.m127776a(6);
            String b = bcop.mo57102b().mo60504b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((cbds) da2.f164949b).f176787d = b;
            String a = bcop.mo57102b().mo60503a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a.getClass();
            ((cbds) da2.f164949b).f176785b = a;
            return (cbds) da2.mo74062i();
        }
    }

    /* renamed from: a */
    public static cbds m89245a(ContactId contactId) {
        bxvd da = cbds.f176782e.mo74144da();
        String a = contactId.mo60492a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbds) da.f164949b).f176785b = a;
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbds) da.f164949b).f176787d = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.mo60494c().ordinal();
        if (ordinal == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbds) da.f164949b).f176784a = cbel.m127776a(2);
        } else if (ordinal == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbds) da.f164949b).f176784a = cbel.m127776a(3);
        } else if (ordinal == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbds) da.f164949b).f176784a = cbel.m127776a(4);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbds) da.f164949b).f176784a = cbel.m127776a(7);
            }
        } else if (contactId.mo60495d().mo66813a()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbds) da.f164949b).f176784a = cbel.m127776a(5);
            String str = (String) contactId.mo60495d().mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbds) da.f164949b).f176786c = str;
        }
        return (cbds) da.mo74062i();
    }

    /* renamed from: a */
    public static ContactId m89246a(cbds cbds) {
        bcsk f = ContactId.m94830f();
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = cbel.m127777b(cbds.f176784a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            f.mo57451a(ContactId.ContactType.PHONE_NUMBER);
        } else if (i == 2) {
            f.mo57451a(ContactId.ContactType.EMAIL);
        } else if (i == 3) {
            f.mo57451a(ContactId.ContactType.HANDLER);
            f.mo57452a(cbds.f176786c);
        } else if (i != 5) {
            f.mo57451a(ContactId.ContactType.UNKNOWN);
        } else {
            f.mo57451a(ContactId.ContactType.DEVICE_ID);
        }
        f.mo57453b(cbds.f176785b);
        f.mo57454c(cbds.f176787d);
        return f.mo57450a();
    }
}
