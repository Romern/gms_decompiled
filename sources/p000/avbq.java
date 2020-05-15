package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;

/* renamed from: avbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbq extends avaq {

    /* renamed from: c */
    private static final bnsn f92919c = avex.m78396b();

    public avbq(wfs wfs, avfh avfh) {
        super("ReadDeviceLevelSettingsOperation", wfs, avfh);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bnsi d = f92919c.mo68390d();
        d.mo68432a("avbq", "a", 29, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Executing operation '%s'...", this.f27820m);
        this.f92857a.mo29070a(Status.f30107a, new ReadDeviceLevelSettingsResult((this.f92858b.mo51192a() ? this.f92858b.mo51193b() : bxok.f164161d).serializeToBytes()));
        bnsi d2 = f92919c.mo68390d();
        d2.mo68432a("avbq", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68420a("Operation '%s' successful!", this.f27820m);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f92857a.mo29070a(status, (ReadDeviceLevelSettingsResult) null);
        bnsi c = f92919c.mo68388c();
        c.mo68432a("avbq", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68422a("Operation '%s' failed with status '%d'!", (Object) this.f27820m, status.f30115i);
    }
}
