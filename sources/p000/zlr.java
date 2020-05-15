package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

/* renamed from: zlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlr extends yul {

    /* renamed from: a */
    final /* synthetic */ zgh f55401a;

    /* renamed from: b */
    final /* synthetic */ zcl f55402b;

    /* renamed from: c */
    final /* synthetic */ bqgy f55403c;

    public zlr(zgh zgh, zcl zcl, bqgy bqgy) {
        this.f55401a = zgh;
        this.f55402b = zcl;
        this.f55403c = bqgy;
    }

    /* renamed from: a */
    public final void mo30785a() {
        this.f55403c.mo69138b((Object) false);
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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30786a(IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3;
        zcy zcy = (zcy) iInterface;
        zlv zlv = new zlv();
        zlv.f55415b = new zit(this.f55401a.f55012b);
        yyc c = yyd.m44993c(this.f55401a.f55011a);
        c.mo30855a((bzzz) null);
        zlv.f55414a = yvx.m44926a(c.mo30854a());
        long j = this.f55401a.f55013c;
        boolean z4 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "sampling rate negative", Long.valueOf(j));
        zlv.f55416c = j;
        long j2 = this.f55401a.f55014d;
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34976b(z2, "batch interval negative", Long.valueOf(j2));
        zlv.f55417d = j2;
        if (zlv.f55414a != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34971a(z3, (Object) "Must call setDataSource()");
        if (zlv.f55415b == null) {
            z4 = false;
        }
        sdo.m34971a(z4, (Object) "The listener must be set");
        FitnessSensorServiceRequest fitnessSensorServiceRequest = new FitnessSensorServiceRequest(zlv);
        zcl zcl = this.f55402b;
        Parcel bj = zcy.mo8529bj();
        dcl.m8165a(bj, fitnessSensorServiceRequest);
        dcl.m8164a(bj, zcl);
        zcy.mo8530c(2, bj);
    }
}
