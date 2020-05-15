package p000;

/* renamed from: rjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rjo {

    /* renamed from: a */
    public final String f43149a;

    /* renamed from: b */
    public final rjl f43150b;

    /* renamed from: c */
    private final rje f43151c;

    public rjo(String str, rjl rjl, rje rje) {
        sdo.checkIfNull(rjl, "Cannot construct an Api with a null ClientBuilder");
        sdo.checkIfNull(rje, "Cannot construct an Api with a null ClientKey");
        this.f43149a = str;
        this.f43150b = rjl;
        this.f43151c = rje;
    }

    /* renamed from: a */
    public final rje mo24653a() {
        rje rje = this.f43151c;
        if (rje != null) {
            return rje;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
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
    /* renamed from: b */
    public final rjl mo24654b() {
        sdo.m34971a(this.f43150b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f43150b;
    }
}
