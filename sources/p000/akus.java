package p000;

/* renamed from: akus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akus {

    /* renamed from: a */
    public boolean f72912a = true;

    /* renamed from: b */
    private final akur f72913b;

    /* renamed from: c */
    private final Object f72914c;

    public akus(akur akur, Object obj) {
        this.f72913b = akur;
        this.f72914c = obj;
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
    public final Object mo39880a() {
        sdo.m34971a(this.f72912a, (Object) "value already recycled and is invalid");
        return this.f72914c;
    }

    /* renamed from: b */
    public final void mo39881b() {
        if (this.f72912a) {
            this.f72913b.mo39877b(this.f72914c);
        }
        this.f72912a = false;
    }
}
