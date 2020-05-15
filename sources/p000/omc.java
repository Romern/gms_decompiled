package p000;

import com.google.android.gms.car.settings.CarServiceSettingsActivityImpl;

/* renamed from: omc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ omd f37945a;

    public omc(omd omd) {
        this.f37945a = omd;
    }

    public final void run() {
        bnsi d = CarServiceSettingsActivityImpl.f29518b.mo68390d();
        d.mo68432a("omc", "run", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Deleting saved data");
        CarServiceSettingsActivityImpl.m22100a(npe.m27153a(this.f37945a.getActivity()));
    }
}
