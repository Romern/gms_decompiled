package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: osg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class osg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ osh f38315a;

    public osg(osh osh) {
        this.f38315a = osh;
    }

    public final void run() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38315a.f38316a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        carSetupServiceImpl.mo17419c();
    }
}
