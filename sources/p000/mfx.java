package p000;

import android.hardware.usb.UsbAccessory;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: mfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mfx extends dck implements mfy {

    /* renamed from: a */
    public final /* synthetic */ D2dSourceChimeraService f33611a;

    public mfx() {
        super("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
    }

    /* renamed from: a */
    public final void mo19953a() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        bqgj bqgj = d2dSourceChimeraService.f29028b;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.getClass();
        bqgj.execute(new meh(mgj));
    }

    /* renamed from: c */
    public final void mo19957c() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        bqgj bqgj = d2dSourceChimeraService.f29028b;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.getClass();
        bqgj.execute(new mej(mgj));
    }

    /* renamed from: d */
    public final void mo19958d() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        bqgj bqgj = d2dSourceChimeraService.f29028b;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.getClass();
        bqgj.execute(new mei(mgj));
    }

    /* renamed from: e */
    public final void mo19959e() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        bqgj bqgj = d2dSourceChimeraService.f29028b;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.getClass();
        bqgj.execute(new mek(mgj));
    }

    /* renamed from: f */
    public final void mo19960f() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        bqgj bqgj = d2dSourceChimeraService.f29028b;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.getClass();
        bqgj.execute(new mel(mgj));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mfx(D2dSourceChimeraService d2dSourceChimeraService) {
        super("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
        this.f33611a = d2dSourceChimeraService;
    }

    /* renamed from: a */
    public final void mo19954a(UsbAccessory usbAccessory) {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        d2dSourceChimeraService.f29028b.execute(new meg(this, usbAccessory));
    }

    /* renamed from: a */
    public final void mo19955a(String str) {
        D2dSourceChimeraService.f29027a.mo25412b("Unregistering callbacks for %s", str);
        this.f33611a.f29031e.mo19909a(str);
    }

    /* renamed from: a */
    public final void mo19956a(String str, mgb mgb) {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        d2dSourceChimeraService.f29028b.execute(new mef(this, mgb, str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mgb mgb;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
                    mgb = queryLocalInterface instanceof mgb ? (mgb) queryLocalInterface : new mfz(readStrongBinder);
                } else {
                    mgb = null;
                }
                mo19956a(readString, mgb);
                return true;
            case 2:
                mo19955a(parcel.readString());
                return true;
            case 3:
                mo19954a((UsbAccessory) dcl.m8163a(parcel, UsbAccessory.CREATOR));
                return true;
            case 4:
                mo19953a();
                return true;
            case 5:
                mo19957c();
                return true;
            case 6:
                mo19958d();
                return true;
            case 7:
                mo19959e();
                return true;
            case 8:
                mo19960f();
                return true;
            default:
                return false;
        }
    }
}
