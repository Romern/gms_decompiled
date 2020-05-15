package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.regex.Pattern;

/* renamed from: bclg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclg {
    /* renamed from: a */
    public static cbma m89237a(ContactId contactId) {
        bxvd da = cbma.f177591f.mo74144da();
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbma) da.f164949b).f177595c = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.mo60494c().ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            String a = contactId.mo60492a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbma cbma = (cbma) da.f164949b;
            a.getClass();
            cbma.f177594b = a;
            cbma.f177593a = cipg.m150690a(3);
        } else if (ordinal == 2) {
            String a2 = contactId.mo60492a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbma cbma2 = (cbma) da.f164949b;
            a2.getClass();
            cbma2.f177594b = a2;
            cbma2.f177593a = cipg.m150690a(18);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                String a3 = contactId.mo60492a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbma cbma3 = (cbma) da.f164949b;
                a3.getClass();
                cbma3.f177594b = a3;
                cbma3.f177593a = cipg.m150690a(15);
            }
        } else if (contactId.mo60495d().mo66813a()) {
            String str = (String) contactId.mo60495d().mo66814b();
            String a4 = contactId.mo60492a();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(a4).length());
            sb.append(str);
            sb.append("|");
            sb.append(a4);
            String sb2 = sb.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbma cbma4 = (cbma) da.f164949b;
            sb2.getClass();
            cbma4.f177594b = sb2;
            cbma4.f177593a = cipg.m150690a(20);
        } else {
            String a5 = contactId.mo60492a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbma cbma5 = (cbma) da.f164949b;
            a5.getClass();
            cbma5.f177594b = a5;
            cbma5.f177593a = cipg.m150690a(20);
        }
        return (cbma) da.mo74062i();
    }

    /* renamed from: a */
    public static ContactId m89238a(cbma cbma) {
        bcsk f = ContactId.m94830f();
        f.mo57454c(cbma.f177595c);
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = cipg.m150691b(cbma.f177593a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            f.mo57453b(cbma.f177594b);
            f.mo57451a(ContactId.ContactType.PHONE_NUMBER);
        } else if (i == 13) {
            f.mo57453b(cbma.f177594b);
            f.mo57451a(ContactId.ContactType.DEVICE_ID);
        } else if (i == 16) {
            f.mo57453b(cbma.f177594b);
            f.mo57451a(ContactId.ContactType.EMAIL);
        } else if (i != 18) {
            return null;
        } else {
            String[] split = cbma.f177594b.split(Pattern.quote("|"), 2);
            if (split.length != 2) {
                return null;
            }
            f.mo57453b(split[1]);
            f.mo57452a(split[0]);
            f.mo57451a(ContactId.ContactType.HANDLER);
        }
        return f.mo57450a();
    }

    /* renamed from: a */
    public static ConversationId m89239a(cbma cbma, bcoh bcoh) {
        int b = cipg.m150691b(cbma.f177593a);
        boolean z = true;
        if (b == 0) {
            b = 1;
        }
        if (b != 4) {
            z = false;
        }
        bmxy.m108588a(z);
        bcsr c = ConversationId.GroupId.m94847c();
        c.mo57478b(cbma.f177594b);
        c.mo57477a(cbma.f177595c);
        ConversationId.GroupId a = c.mo57476a();
        bcsq f = ConversationId.m94839f();
        f.mo57474a(a);
        f.mo57473a(bcoh.mo57058b().mo57074e());
        return f.mo57472a();
    }
}
