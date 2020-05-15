package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;

/* renamed from: zlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlp extends yul {

    /* renamed from: a */
    final /* synthetic */ caah f55394a;

    /* renamed from: b */
    final /* synthetic */ zba f55395b;

    /* renamed from: c */
    final /* synthetic */ bqgy f55396c;

    /* renamed from: d */
    final /* synthetic */ zlu f55397d;

    public zlp(zlu zlu, caah caah, zba zba, bqgy bqgy) {
        this.f55397d = zlu;
        this.f55394a = caah;
        this.f55395b = zba;
        this.f55396c = bqgy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30785a() {
        srn srn = zlu.f55408a;
        this.f55397d.f55409b.getPackage();
        this.f55396c.mo69138b(bngx.m109376e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30786a(IInterface iInterface) {
        zcy zcy = (zcy) iInterface;
        srn srn = zlu.f55408a;
        this.f55397d.f55409b.getPackage();
        FitnessDataSourcesRequest fitnessDataSourcesRequest = new FitnessDataSourcesRequest(bngx.m109356a(ywb.m44931a(this.f55394a)));
        zba zba = this.f55395b;
        Parcel bj = zcy.mo8529bj();
        dcl.m8165a(bj, fitnessDataSourcesRequest);
        dcl.m8164a(bj, zba);
        zcy.mo8530c(1, bj);
    }
}
