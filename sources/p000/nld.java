package p000;

import com.google.android.gms.car.CarChimeraService;

/* renamed from: nld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nld implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f35942a;

    /* renamed from: b */
    final /* synthetic */ CarChimeraService f35943b;

    public nld(CarChimeraService carChimeraService, String[] strArr) {
        this.f35943b = carChimeraService;
        this.f35942a = strArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, nhg, boolean]
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
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    public final void run() {
        bnsi d = CarChimeraService.f29307a.mo68390d();
        d.mo68432a("nld", "run", 566, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Checking %s", this.f35942a[1]);
        nhg[] values = nhg.values();
        for (nhg nhg : values) {
            CarChimeraService carChimeraService = this.f35943b;
            boolean a = carChimeraService.f29310c.mo22059a(carChimeraService.f29309b.mo21346p(), this.f35943b.f29309b.mo21349s(), this.f35942a[1], nhg);
            bnsi d2 = CarChimeraService.f29307a.mo68390d();
            d2.mo68432a("nld", "run", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68431a("Allowed %s: %b", (Object) nhg, a);
        }
    }
}
