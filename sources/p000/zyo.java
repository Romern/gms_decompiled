package p000;

/* renamed from: zyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyo {
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
    public static zxe m46707a(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        sdo.checkIfNull(bArr, "null input");
        try {
            zxe zxe = (zxe) GeneratedMessageLite.m124014a(zxe.f56079c, bArr);
            if (zxe.f56082b > 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "directory.version is invalid");
            if (zxe.f56081a.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "directory.family null or empty");
            bxwc bxwc = zxe.f56081a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                zxi zxi = (zxi) bxwc.get(i);
                sdo.checkIfNull(zxi, "family");
                if ((zxi.f56104a & 1) == 0 || zxi.f56105b.length() <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sdo.m34971a(z3, (Object) "family.name null or empty");
                if (zxi.f56107d.size() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sdo.m34971a(z4, (Object) "family.fonts null or empty");
            }
            return zxe;
        } catch (bxwf e) {
            throw new IllegalArgumentException("Not a valid Directory proto", e);
        }
    }
}
