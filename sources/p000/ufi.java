package p000;

/* renamed from: ufi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufi implements ufg {

    /* renamed from: a */
    private static final sbw f47431a = new sbw("EntryPersistenceStrateg", "");

    /* renamed from: b */
    private final uey f47432b;

    /* renamed from: c */
    private final uhn f47433c;

    /* renamed from: d */
    private final ukk f47434d;

    /* renamed from: e */
    private final String f47435e;

    public ufi(uhn uhn, uey uey, ukk ukk, String str) {
        sdo.m34959a(uey);
        this.f47432b = uey;
        sdo.m34959a(uhn);
        this.f47433c = uhn;
        sdo.m34959a(ukk);
        this.f47434d = ukk;
        sdo.m34959a((Object) str);
        this.f47435e = str;
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
    public final /* bridge */ /* synthetic */ Object mo27273a(String str) {
        sdo.m34971a(this.f47433c.mo27382b(), (Object) "Overwrite of entry metadata has to happen in a transaction");
        ujx ujx = null;
        boolean z = false;
        if (Thread.interrupted()) {
            f47431a.mo25369a("Not persisting content to entry %s because download was canceled.", this.f47434d);
        } else {
            try {
                ujx = this.f47433c.mo27402a(this.f47432b, this.f47434d);
                if (!ujx.mo27577am()) {
                    ujx.mo27593c(str, vpc.m40995b(this.f47435e));
                    ujx.mo27581aq();
                    z = true;
                }
                ujx.mo27586b(str, this.f47435e);
                ujx.mo27627m(z);
            } catch (uaa e) {
                f47431a.mo25375b("Unable to persist content to entry %s because it could not be read.", this.f47434d);
            }
        }
        return ujx;
    }
}
