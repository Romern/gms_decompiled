package p000;

import android.os.Build;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

/* renamed from: bcjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcjz {

    /* renamed from: a */
    private final bbpw f104363a;

    public bcjz(bbpw bbpw) {
        this.f104363a = bbpw;
    }

    /* renamed from: a */
    public static final bqgg m89171a(azbk azbk) {
        bbov.m88299a();
        return bqga.m112771a(new bcjw(azbk), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static final bqgg m89172a(azbl azbl, String str, String str2, UUID uuid) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("ID", str);
        }
        if (str2 != null) {
            hashMap.put("APP_NAME", str2);
        }
        if (uuid != null) {
            hashMap.put("REQUEST_ID", uuid.toString());
        }
        String valueOf = String.valueOf(hashMap);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("DroidGuard Args: ");
        sb.append(valueOf);
        bbos.m88289a("RegReqBuilder", sb.toString());
        return bbqi.m88405a(new bcjx(azbl, hashMap));
    }

    /* renamed from: a */
    public static cbma m89173a(ContactId contactId) {
        int i;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        if (contactId.mo60494c().ordinal() != 1) {
            i = 18;
        } else {
            i = 3;
        }
        bxvd da = cbma.f177591f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbma) da.f164949b).f177593a = cipg.m150690a(i);
        String a = contactId.mo60492a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbma) da.f164949b).f177594b = a;
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbma) da.f164949b).f177595c = b;
        return (cbma) da.mo74062i();
    }

    /* renamed from: a */
    public final cbld mo56952a(String str, String str2, PublicKey publicKey) {
        int i = Build.VERSION.SDK_INT;
        cblc cblc = (cblc) cbld.f177471h.mo74144da();
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        str.getClass();
        ((cbld) cblc.f164949b).f177474b = str;
        String languageTag = Locale.getDefault().toLanguageTag();
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        languageTag.getClass();
        ((cbld) cblc.f164949b).f177477e = languageTag;
        cblc.mo75236a(this.f104363a.mo56349a());
        bxvd da = cblz.f177587c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblz cblz = (cblz) da.f164949b;
        str.getClass();
        cblz.f177590b = str;
        cblz.f177589a = 1;
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        cblz cblz2 = (cblz) da.mo74062i();
        cblz2.getClass();
        ((cbld) cblc.f164949b).f177473a = cblz2;
        bxvd da2 = cbml.f177642c.mo74144da();
        bxtx a = bxtx.m123261a(publicKey.getEncoded());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbml cbml = (cbml) da2.f164949b;
        a.getClass();
        cbml.f177645b = a;
        cbml.f177644a = cipl.m150696a(4);
        cbml cbml2 = (cbml) da2.mo74062i();
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        cbld cbld = (cbld) cblc.f164949b;
        cbml2.getClass();
        cbld.f177475c = cbml2;
        if (str2 != null) {
            str2.getClass();
            cbld.f177476d = str2;
        }
        return (cbld) cblc.mo74062i();
    }
}
