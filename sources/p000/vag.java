package p000;

/* renamed from: vag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vag {

    /* renamed from: a */
    public final boolean f48825a;

    /* renamed from: b */
    public final int f48826b;

    /* renamed from: c */
    public final boolean f48827c;

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
    public vag(boolean z, int i, boolean z2) {
        this.f48825a = z;
        this.f48826b = i;
        this.f48827c = z2;
        boolean z3 = true;
        if (z && z2) {
            z3 = false;
        }
        sdo.m34971a(z3, (Object) "Network error should only be marked in failures!");
    }
}
