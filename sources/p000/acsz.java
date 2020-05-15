package p000;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: acsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsz {

    /* renamed from: a */
    public final long f60715a;

    public acsz(long j) {
        this.f60715a = j;
    }

    /* renamed from: a */
    public static bngx m49824a(Signature[] signatureArr) {
        if (signatureArr == null) {
            return bngx.m109376e();
        }
        int length = signatureArr.length;
        ArrayList arrayList = new ArrayList(length);
        MessageDigest a = spo.m35903a("SHA-256");
        if (a != null) {
            for (Signature signature : signatureArr) {
                bxvd da = acte.f60730c.mo74144da();
                bxtx a2 = bxtx.m123261a(a.digest(signature.toByteArray()));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                acte acte = (acte) da.f164949b;
                a2.getClass();
                acte.f60732a |= 1;
                acte.f60733b = a2;
                arrayList.add((acte) da.mo74062i());
            }
            return bngx.m109368a((Collection) arrayList);
        }
        throw new NoSuchAlgorithmException("Unable to create SHA-256 message digest for signatures!");
    }

    /* renamed from: a */
    public static void m49825a(caee caee, String str, long j, long j2) {
        if (j != j2) {
            caec caec = (caec) caed.f172799i.mo74144da();
            if (caec.f164950c) {
                caec.mo74035c();
                caec.f164950c = false;
            }
            caed caed = (caed) caec.f164949b;
            str.getClass();
            caed.f172801a |= 1;
            caed.f172802b = str;
            caec.mo74624a(j);
            caee.mo74631a(caec);
        }
    }

    /* renamed from: a */
    public static void m49826a(caee caee, String str, caef caef) {
        if (caef != null && !caef.equals(caef.f172809f)) {
            caec caec = (caec) caed.f172799i.mo74144da();
            if (caec.f164950c) {
                caec.mo74035c();
                caec.f164950c = false;
            }
            caed caed = (caed) caec.f164949b;
            str.getClass();
            caed.f172801a |= 1;
            caed.f172802b = str;
            caec.mo74625a(caef);
            caee.mo74631a(caec);
        }
    }

    /* renamed from: a */
    public static void m49827a(caee caee, String str, String str2) {
        if (str2 != null && !str2.equals("")) {
            caec caec = (caec) caed.f172799i.mo74144da();
            if (caec.f164950c) {
                caec.mo74035c();
                caec.f164950c = false;
            }
            caed caed = (caed) caec.f164949b;
            str.getClass();
            caed.f172801a |= 1;
            caed.f172802b = str;
            caec.mo74626a(str2);
            caee.mo74631a(caec);
        }
    }
}
