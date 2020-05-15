package p000;

import java.util.Locale;

/* renamed from: zyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyb {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static String m46670a(zxf zxf) {
        sdo.checkIfNull(zxf, "spec");
        sdo.m34971a(!zxf.f56087b.isEmpty(), (Object) "spec.filename");
        Locale locale = Locale.ENGLISH;
        String valueOf = String.valueOf(zxf.f56087b);
        return String.format(locale, valueOf.length() == 0 ? new String("https://fonts.gstatic.com/s/a/") : "https://fonts.gstatic.com/s/a/".concat(valueOf), new Object[0]);
    }

    /* renamed from: a */
    public static String m46671a(zxh zxh) {
        sdo.checkIfNull(zxh, "font");
        zxf zxf = zxh.f56097a;
        if (zxf == null) {
            zxf = zxf.f56084e;
        }
        sdo.checkIfNull(zxf, "font.file");
        zxf zxf2 = zxh.f56097a;
        if (zxf2 == null) {
            zxf2 = zxf.f56084e;
        }
        sdo.checkIfNull(zxf2.f56089d, "font.file.hash");
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        zxf zxf3 = zxh.f56097a;
        if (zxf3 == null) {
            zxf3 = zxf.f56084e;
        }
        objArr[0] = zxp.m46640a(zxf3.f56089d.getKey());
        return String.format(locale, "https://fonts.gstatic.com/s/a/%s.ttf", objArr);
    }
}
