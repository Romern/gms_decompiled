package p000;

/* renamed from: uns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uns extends uoa {

    /* renamed from: a */
    public final vpj f48338a;

    /* renamed from: b */
    public final uoa f48339b = uoa.m39042b();

    /* renamed from: h */
    private boolean f48340h = false;

    public uns(vpj vpj) {
        this.f48338a = vpj;
    }

    /* renamed from: a */
    public final unt mo27727a() {
        return new unt(173, this);
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
    public final void mo27731b(int i, String str) {
        boolean z;
        if (this.f48373f != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "No table definition to rename");
        unz unz = new unz(str, ((unz) this.f48373f).f48368b);
        mo27728a(i);
        mo27730a(i, unz);
    }

    /* renamed from: a */
    public final void mo27728a(int i) {
        mo27748b(i);
        if (this.f48340h) {
            this.f48340h = false;
            this.f48339b.mo27748b(i);
        }
    }

    /* renamed from: a */
    public final void mo27729a(int i, String str) {
        mo27730a(i, new unz(str, true));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uoa.a(int, java.lang.Object):void
     arg types: [int, unz]
     candidates:
      uns.a(int, java.lang.String):void
      uns.a(int, unz):void
      uoa.a(int, unt):unp
      uoa.a(int, unu):void
      uoa.a(int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo27730a(int i, unz unz) {
        mo27746a(i, (Object) unz);
        if (unz.f48368b) {
            sdo.m34970a(!this.f48340h);
            this.f48340h = true;
            uoa uoa = this.f48339b;
            unu unu = new unu(unz.f48367a.concat("_id"), 1);
            unu.mo27742c();
            uoa.mo27747a(i, unu);
        }
    }
}
