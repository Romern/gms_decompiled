package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.drivingmode.autolaunch.AutoLaunchServiceImpl;

/* renamed from: vrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrh {

    /* renamed from: a */
    public final Context f49846a;

    /* renamed from: b */
    public final vtt f49847b;

    /* renamed from: c */
    public final vrb f49848c;

    /* renamed from: d */
    public final vsi f49849d;

    /* renamed from: e */
    public boolean f49850e;

    /* renamed from: f */
    public long f49851f;

    /* renamed from: g */
    public vuy f49852g;

    /* renamed from: h */
    private vty f49853h;

    /* renamed from: i */
    private skc f49854i;

    /* renamed from: j */
    private skb f49855j;

    public vrh(Context context) {
        this.f49846a = context;
        vuk.m41322a();
        this.f49849d = vuk.m41327f(context);
        vuk.m41322a();
        this.f49847b = vuk.m41328g(context);
        vuk.m41322a();
        this.f49848c = vuk.m41326e(context);
    }

    /* renamed from: a */
    public final void mo28763a() {
        this.f49850e = false;
        this.f49849d.mo28798n();
        vty vty = this.f49853h;
        if (vty != null) {
            vty.mo28859a();
            this.f49853h = null;
        }
        skc skc = this.f49854i;
        if (skc != null) {
            skc.mo25678a(this.f49855j);
            this.f49854i = null;
        }
        vuy vuy = this.f49852g;
        if (vuy != null) {
            AutoLaunchServiceImpl autoLaunchServiceImpl = vuy.f50013a;
            if (!autoLaunchServiceImpl.f31242a.f49850e) {
                Log.i("CAR.DRIVINGMODE", "Autolaunch service stopping");
                autoLaunchServiceImpl.stopSelf();
            }
        }
    }

    /* renamed from: b */
    public final void mo28765b() {
        if (ceyg.f183508a.mo6606a().autoDismissNotificationOnVehicleExit()) {
            Log.i("CAR.DRIVINGMODE", "Automatically dismiss launched notification!");
            this.f49848c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS);
            this.f49847b.mo28847c();
        }
    }

    /* renamed from: c */
    public final void mo28766c() {
        int c = this.f49849d.mo28775a().mo28743c();
        if (((TelephonyManager) this.f49846a.getSystemService("phone")).getCallState() == 0 || c == 3) {
            this.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH);
            if (this.f49849d.mo28793i() && c != 3) {
                this.f49847b.mo28845a();
            } else {
                vsi vsi = this.f49849d;
                vuu o = vsi.mo28799o();
                sdo.m34959a(o);
                vsi.mo28786c(o);
                this.f49849d.mo28800p();
            }
        } else {
            this.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL);
        }
        mo28763a();
    }

    /* renamed from: a */
    public final void mo28764a(vuu vuu) {
        vty vty = this.f49853h;
        if (!(vty == null || vty.f49974c == null) || this.f49847b.f49963b || this.f49849d.mo28784b()) {
            Log.i("CAR.DRIVINGMODE", "Aborting launch, not required");
            this.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_SKIPPED);
            if (this.f49849d.mo28784b()) {
                try {
                    this.f49849d.f49901c.mo28873b(vuu.ordinal());
                } catch (RemoteException e) {
                    Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
                }
            } else {
                this.f49849d.mo28779a(vuu);
            }
        } else {
            this.f49849d.mo28779a(vuu);
            if (this.f49849d.mo28789e()) {
                if (this.f49853h == null) {
                    vuk.m41322a();
                    this.f49853h = new vty(this.f49846a);
                }
                vty vty2 = this.f49853h;
                vty2.f49974c = new vrd(this);
                Sensor sensor = vty2.f49972a;
                if (sensor != null) {
                    vty2.f49973b.registerListener(vty2, sensor, 3);
                }
                this.f49851f = SystemClock.elapsedRealtime() + ccul.f179984a.mo6606a().mo76837b();
                skc skc = this.f49854i;
                if (skc == null) {
                    vuk.m41322a();
                    this.f49854i = vuk.m41323b(this.f49846a);
                } else {
                    skc.mo25678a(this.f49855j);
                }
                skb a = skb.m35502a("driving_mode", "PocketTimeout", new vre(this));
                this.f49855j = a;
                this.f49854i.mo25676a("CAR.DRIVINGMODE", 3, this.f49851f, a, (String) null);
                return;
            }
            mo28766c();
        }
    }
}
