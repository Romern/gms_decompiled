package p000;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;

/* renamed from: paw */
public final /* synthetic */ class paw implements Runnable {

    /* renamed from: a */
    private final pbm f38739a;

    /* renamed from: b */
    private final int f38740b;

    /* renamed from: c */
    private final Bundle f38741c;

    public paw(pbm pbm, int i, Bundle bundle) {
        this.f38739a = pbm;
        this.f38740b = i;
        this.f38741c = bundle;
    }

    public final void run() {
        pbm pbm = this.f38739a;
        int i = this.f38740b;
        Bundle bundle = this.f38741c;
        pbm.mo22871f();
        boolean z = true;
        bmxy.m108601b(!pbm.f38787m.f38771d, "Handoff already initiated");
        bmxy.m108601b(pbm.f38787m.f38768a, "StartupService is not bound");
        ComponentName componentName = pbm.f38787m.f38772e;
        bmxy.m108582a(componentName, "Handoff Component is null, which is not expected");
        omm omm = pbm.f38787m.f38774g;
        bmxy.m108582a(omm, "StartupService is NULL");
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT", componentName);
            ofd.m28612a(pbm.f38777c, "com.google.android.gms.car.CONNECTION_HANDOFF", ofa.STARTED, bundle2);
            pbm.f38787m.f38771d = true;
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR");
            if (!ccpv.m131193b()) {
                if (i == 2) {
                    z = false;
                }
                bmxy.m108589a(z, "Wifi handoff is disabled");
                bmxy.m108581a(parcelFileDescriptor);
                omm.mo22297a(pbm.f38778d, parcelFileDescriptor, pbm.f38787m.f38770c);
            } else {
                if (i != 2) {
                    if (parcelFileDescriptor == null) {
                        z = false;
                    }
                }
                bmxy.m108589a(z, "File descriptor must not be null except for wifi connections");
                bnsi d = pbm.f38775a.mo68390d();
                d.mo68432a("pbm", "a", 521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68416a("Handing off session %d (%d)", pbm.f38778d, i);
                omm.mo22295a(pbm.f38778d, i, bundle, pbm.f38787m.f38770c);
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                }
            }
        } catch (RemoteException e2) {
            ofd.m28611a(pbm.f38777c, "com.google.android.gms.car.CONNECTION_HANDOFF", ofa.FAILED);
            bnsi b = pbm.f38775a.mo68387b();
            b.mo68437a(e2);
            b.mo68432a("pbm", "a", 545, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Connection handoff failed due to RemoteException, exiting");
            throw new RuntimeException(e2);
        }
    }
}
