package p000;

/* renamed from: brhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brhg extends Exception {
    @Deprecated
    protected brhg() {
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
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brhg(String str) {
        super(str);
        sdo.m34969a(str, (Object) "Detail message must not be empty");
    }
}
