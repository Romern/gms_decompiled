package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: vbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbf {
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
    public static DriveId m39919a(uos uos, vkr vkr) {
        sdo.m34971a(uos.mo27778b(), (Object) "The provided account should be valid.");
        ujx a = uos.mo27780a(vkr.mo28572g());
        if (a == null) {
            return null;
        }
        DriveId g = a.mo27610g();
        a.mo27533K();
        a.mo27629n(true);
        return g;
    }

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
    public static DriveId m39920a(uos uos, vkr vkr, boolean z) {
        sdo.m34971a(uos.mo27778b(), (Object) "The provided account should be valid.");
        return uhc.m38500a(uos, vkr, z);
    }
}
