package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahct {

    /* renamed from: a */
    public static final bnsp f67009a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: b */
    public ahdb f67010b = null;

    /* renamed from: c */
    public ahcv f67011c = null;

    /* renamed from: d */
    public ahcz f67012d = null;

    /* renamed from: e */
    public byte f67013e;

    /* renamed from: f */
    public final Context f67014f;

    /* renamed from: g */
    public final buye f67015g;

    /* renamed from: h */
    public final BluetoothAdapter f67016h = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: i */
    public final Handler f67017i;

    /* renamed from: j */
    public final buqb f67018j = new buqb(this.f67014f);

    public ahct(Context context, buye buye, Handler handler) {
        sdo.m34959a(context);
        this.f67014f = context;
        sdo.m34959a(buye);
        this.f67015g = buye;
        sdo.m34959a((Object) handler);
        this.f67017i = handler;
    }

    /* renamed from: a */
    public final void mo36315a(ahdp ahdp) {
        if (!mo36320b()) {
            mo36316a(ahdp, -1);
            return;
        }
        this.f67018j.mo72973a(3, this.f67010b);
        this.f67010b.mo36335k();
        this.f67010b = null;
        mo36319b(ahdp);
    }

    /* renamed from: b */
    public final void mo36319b(ahdp ahdp) {
        mo36316a(ahdp, 0);
    }

    /* renamed from: b */
    public final boolean mo36320b() {
        ahdb ahdb = this.f67010b;
        return ahdb != null && ahdb.f67028j;
    }

    /* renamed from: c */
    public final boolean mo36321c() {
        ahcz ahcz = this.f67012d;
        return ahcz != null && ahcz.f67028j;
    }

    /* renamed from: d */
    public final ahcy mo36322d() {
        ahcz ahcz = this.f67012d;
        if (ahcz != null) {
            return ahcz;
        }
        ahdb ahdb = this.f67010b;
        if (ahdb != null) {
            return ahdb;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo36316a(ahdp ahdp, int i) {
        if (ahdp != null) {
            try {
                ahdp.mo36350a(new Status(i, null, null));
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f67009a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ahct", "a", 533, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to send callback status");
            }
        }
    }

    /* renamed from: a */
    public final void mo36317a(Device device, String str, String str2, byte b, byte b2, ahdj ahdj, ahdm ahdm, long j, String str3, byte b3, ahdp ahdp) {
        ahcz ahcz;
        Device device2 = device;
        String str4 = str3;
        byte b4 = b3;
        ahdp ahdp2 = ahdp;
        if (mo36320b()) {
            mo36316a(ahdp2, 2982);
            return;
        }
        if (mo36321c()) {
            if (this.f67012d.mo36326a(device2)) {
                mo36316a(ahdp2, -1);
                return;
            }
            this.f67012d.mo36337m();
        }
        String str5 = device2.f80399d;
        if (str5 == null) {
            bnsl bnsl = (bnsl) f67009a.mo68388c();
            bnsl.mo68432a("ahct", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearbyBootstrapController: Cannot connect to a remote device that does not exist");
            mo36316a(ahdp2, 2980);
            return;
        }
        if (mo36318a()) {
            this.f67011c.mo36286a();
        }
        buye buye = this.f67015g;
        buqb buqb = this.f67018j;
        ahcs ahcs = new ahcs(this, j);
        if (b2 == 2) {
            ahcz = new ahcf(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
        } else {
            ahcz = new ahck(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
        }
        this.f67012d = ahcz;
        ahcz.mo36339a(device2, str5);
        this.f67013e = b4;
        if (b4 == 1) {
            this.f67018j.mo72973a(8, this.f67012d);
            ahcz ahcz2 = this.f67012d;
            ahcz2.mo36341b(ahcz2.f67038s, null);
        } else if (b4 != 2) {
            mo36316a(ahdp2, 13);
            return;
        } else if (str4 == null) {
            this.f67018j.mo72973a(7, this.f67012d);
            this.f67012d.mo36340b(cfns.m140730b());
        } else if (!ahcj.m55468e(str3)) {
            mo36316a(ahdp2, 2989);
            return;
        } else {
            this.f67018j.mo72973a(9, this.f67012d);
            this.f67012d.mo36340b(str4);
        }
        mo36319b(ahdp2);
    }

    /* renamed from: a */
    public final boolean mo36318a() {
        ahcv ahcv = this.f67011c;
        return ahcv != null && ahcv.mo36289c();
    }
}
