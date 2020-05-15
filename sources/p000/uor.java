package p000;

/* renamed from: uor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class uor {

    /* renamed from: a */
    public final uhm f48426a;

    /* renamed from: b */
    public final unq f48427b;

    /* renamed from: c */
    public boolean f48428c = false;

    protected uor(uhm uhm, unq unq) {
        this.f48426a = uhm;
        this.f48427b = unq;
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
    public final unq mo27777a() {
        sdo.m34971a(!this.f48428c, (Object) "Cannot interact with a deleted domain class");
        return this.f48427b;
    }

    /* renamed from: b */
    public final boolean mo27778b() {
        return this.f48426a.mo27382b();
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
    /* renamed from: c */
    public final void mo27779c() {
        sdo.m34971a(!this.f48428c, (Object) "Cannot interact with a deleted domain class");
        this.f48426a.mo27414a(this.f48427b);
    }
}
