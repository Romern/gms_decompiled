package p000;

import android.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: qqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqz {

    /* renamed from: a */
    public final String f41985a;

    /* renamed from: b */
    public final qrc f41986b;

    public qqz(String str, qrc qrc) {
        sdo.m34977c(str);
        this.f41985a = str;
        sdo.m34959a(qrc);
        this.f41986b = qrc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static qqz m32679a(String str) {
        sdo.m34969a(str, (Object) "password should not be empty.");
        SecretKey a = qrc.m32683a(new String(qrc.m32685a("dummy", "localhost")), "saltsalt".getBytes(), 1001);
        qrc qrc = new qrc(new SecretKeySpec(qrc.m32683a(str, a.getEncoded(), 1003).getEncoded(), "AES"), new SecretKeySpec(qrc.m32683a(str, a.getEncoded(), 1004).getEncoded(), "AES"));
        return new qqz(Base64.encodeToString(qrc.mo24215a(qrb.PASSWORD, "nigori-key"), 2), qrc);
    }

    /* renamed from: a */
    public static qqz m32680a(quk quk) {
        qrc qrc = new qrc(new SecretKeySpec(quk.f42157c.mo73780k(), "AES"), new SecretKeySpec(quk.f42158d.mo73780k(), "AES"));
        return new qqz(Base64.encodeToString(qrc.mo24215a(qrb.PASSWORD, "nigori-key"), 2), qrc);
    }

    /* renamed from: a */
    public static qqz m32681a(byte[] bArr) {
        return m32679a(Base64.encodeToString(bArr, 2));
    }

    /* renamed from: a */
    public final quk mo24214a() {
        bxvd da = quk.f42153e.mo74144da();
        String str = this.f41985a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quk quk = (quk) da.f164949b;
        str.getClass();
        quk.f42155a |= 1;
        quk.f42156b = str;
        bxtx a = bxtx.m123261a(this.f41986b.f41990a.getEncoded());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quk quk2 = (quk) da.f164949b;
        a.getClass();
        quk2.f42155a |= 4;
        quk2.f42157c = a;
        bxtx a2 = bxtx.m123261a(this.f41986b.f41991b.getEncoded());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quk quk3 = (quk) da.f164949b;
        a2.getClass();
        quk3.f42155a |= 8;
        quk3.f42158d = a2;
        return (quk) da.mo74062i();
    }
}
