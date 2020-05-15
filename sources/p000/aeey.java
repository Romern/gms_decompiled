package p000;

/* renamed from: aeey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeey {

    /* renamed from: a */
    private final bnha f63298a = new bnha();

    /* renamed from: b */
    private final bnha f63299b = new bnha();

    /* renamed from: c */
    private bxvp f63300c;

    public aeey() {
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
    public final aeez mo34109a() {
        try {
            bnhe b = this.f63298a.mo67618b();
            try {
                bnhe b2 = this.f63299b.mo67618b();
                bxvp bxvp = this.f63300c;
                if (bxvp != null) {
                    sdo.m34971a(!b.containsKey(bxvp), (Object) "unknownSyncId is associated with a task config");
                    return new aeez(b, b2, bxvp);
                }
                throw new IllegalStateException("unknownSyncId is not set");
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("duplicate task tags", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException("duplicate sync ids", e2);
        }
    }

    public aeey(bxvp bxvp) {
        this.f63300c = bxvp;
    }

    /* renamed from: a */
    public final void mo34110a(bxvp bxvp, aeeg aeeg) {
        this.f63298a.mo67695b(bxvp, aeeg);
        aecq aecq = (aecq) aeeg;
        this.f63299b.mo67695b(aecq.f63169b, bbjl.m88093a(bxvp, 2));
        this.f63299b.mo67695b(aecq.f63168a, bbjl.m88093a(bxvp, 3));
    }
}
