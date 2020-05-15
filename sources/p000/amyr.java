package p000;

/* renamed from: amyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyr {

    /* renamed from: a */
    public final amvt f76407a;

    /* renamed from: b */
    private final anaz f76408b;

    public amyr(anaz anaz, amvt amvt) {
        this.f76408b = anaz;
        this.f76407a = amvt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* renamed from: a */
    public final void mo41570a(anad anad, boolean z) {
        amvu amvu = this.f76407a.f76139c;
        amvr amvr = (amvr) anad.f76464b;
        amvr amvr2 = (amvr) anad.f76463a;
        amig.m62939a();
        boolean z2 = (!((Boolean) amfl.f74862a.mo41191a()).booleanValue()) | z;
        sdo.m34959a(amvr2);
        if (amvr2.mo41399f()) {
            if (z) {
                this.f76408b.mo41636a(ammz.REMOVE, amjf.GROUP, true, 1, 1);
            }
            if (amvr == null) {
                this.f76408b.mo41636a(ammz.REMOVE, amjf.GROUP, z, 3, 1);
                return;
            }
            if (amvr.mo41397e()) {
                this.f76408b.mo41636a(ammz.REMOVE, amjf.GROUP, z, 4, 1);
            }
            amvu.mo41461a(amvr.mo41400g(), true);
        } else if (amvr != null) {
            if (z) {
                this.f76408b.mo41636a(ammz.UPDATE, amjf.GROUP, true, 1, 1);
                if (amvr.mo41397e()) {
                    this.f76408b.mo41636a(ammz.UPDATE, amjf.GROUP, true, 4, 1);
                }
            }
            Long g = amvr.mo41400g();
            amvu.mo41454a(amvu.f76144a, g.longValue(), "version", amvr.mo41401h());
            amvu.mo41455a(amvu.f76144a, g, amvr2.mo41448s(), z2);
        } else {
            if (z) {
                this.f76408b.mo41636a(ammz.INSERT, amjf.GROUP, true, 1, 1);
            }
            amvu.mo41459a(amvu.f76144a, "sourceid", amvr2.mo41404j());
            amvu.mo41453a(amvu.f76144a, amvr2.mo41448s(), z2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* renamed from: b */
    public final void mo41572b(Long l) {
        this.f76407a.f76139c.mo41461a(l, true);
    }

    /* renamed from: a */
    public final void mo41571a(Long l) {
        amvu amvu = this.f76407a.f76139c;
        amvu.mo41457a(amvu.f76144a, "dirty", l);
    }
}
