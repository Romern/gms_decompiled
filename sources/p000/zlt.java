package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;

/* renamed from: zlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlt extends yul {

    /* renamed from: a */
    final /* synthetic */ caae f55406a;

    /* renamed from: b */
    final /* synthetic */ zck f55407b;

    public zlt(caae caae, zck zck) {
        this.f55406a = caae;
        this.f55407b = zck;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30785a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30786a(IInterface iInterface) {
        zcy zcy = (zcy) iInterface;
        FitnessUnregistrationRequest fitnessUnregistrationRequest = new FitnessUnregistrationRequest(yvx.m44926a(this.f55406a));
        zck zck = this.f55407b;
        Parcel bj = zcy.mo8529bj();
        dcl.m8165a(bj, fitnessUnregistrationRequest);
        dcl.m8164a(bj, zck);
        zcy.mo8530c(3, bj);
    }
}
