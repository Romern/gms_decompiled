package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbj implements arbb {

    /* renamed from: a */
    public static final Logger f87275a = ascp.m73787a("D2D", "SourceDeviceConnectorNearbyBootstrap");

    /* renamed from: b */
    public final ahco f87276b;

    /* renamed from: c */
    public final Handler f87277c;

    /* renamed from: d */
    public ardt f87278d;

    /* renamed from: e */
    public armu f87279e;

    /* renamed from: f */
    public Device f87280f;

    /* renamed from: g */
    public final arbi f87281g = new arbi(this);

    /* renamed from: h */
    private final arpx f87282h;

    /* renamed from: i */
    private final ahcp f87283i = new arbh(this);

    /* renamed from: j */
    private final arbg f87284j = new arbg(this);

    public arbj(Context context, Handler handler) {
        aqxm.m72204e();
        ahco a = ahcb.m55438a(context);
        this.f87282h = new arpx(context);
        this.f87277c = handler;
        this.f87276b = a;
    }

    /* renamed from: a */
    public final aucb mo48353a() {
        Device device;
        if (this.f87279e == null || (device = this.f87280f) == null) {
            Logger Logger = f87275a;
            String valueOf = String.valueOf(this.f87279e);
            String valueOf2 = String.valueOf(this.f87280f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
            sb.append("No connection in progress, callbacks: ");
            sb.append(valueOf);
            sb.append(", NearbyDevice: ");
            sb.append(valueOf2);
            Logger.mo25412b(sb.toString(), new Object[0]);
            return aucu.m76777a((Exception) new rjp(new Status(10567)));
        }
        aucb a = this.f87276b.mo36302a(device);
        a.mo50371a(new arbc(this));
        return a;
    }

    /* renamed from: a */
    public final aucb mo48354a(D2DDevice d2DDevice, armu armu, String str) {
        byte b;
        this.f87279e = armu;
        this.f87280f = new Device(d2DDevice.f107874c, "", d2DDevice.f107875d, d2DDevice.f107876e);
        if (str == null) {
            b = 1;
        } else {
            b = 2;
        }
        return mo48367a(str, b, new arnb(new arbd(this, this.f87283i, (int) cgqs.f187523a.mo6606a().mo84288A(), str, b), this.f87277c));
    }

    /* renamed from: a */
    public final aucb mo48367a(String str, byte b, ahcp ahcp) {
        byte b2;
        ahdi ahdi;
        ahdl ahdl;
        Device device = this.f87280f;
        if (device == null) {
            return aucu.m76777a((Exception) new rjp(Status.f30109c));
        }
        ahco ahco = this.f87276b;
        String str2 = Build.MODEL;
        if (!this.f87282h.mo48742a()) {
            b2 = this.f87282h.mo48743b() ? (byte) 2 : 0;
        } else {
            b2 = 1;
        }
        arbg arbg = this.f87284j;
        ahdf ahdf = ahdf.f67048a;
        ahdi ahdi2 = (ahdi) ahdf.f67049b.get(ahcp);
        if (ahdi2 == null) {
            ahdi ahdi3 = new ahdi(ahcp);
            ahdf.f67049b.put(ahcp, ahdi3);
            ahdi = ahdi3;
        } else {
            ahdi = ahdi2;
        }
        ahdg ahdg = ahdg.f67050a;
        ahdl ahdl2 = (ahdl) ahdg.f67051b.get(arbg);
        if (ahdl2 == null) {
            ahdl ahdl3 = new ahdl(arbg);
            ahdg.f67051b.put(arbg, ahdl3);
            ahdl = ahdl3;
        } else {
            ahdl = ahdl2;
        }
        ahdi.f67052a = new aheg((ahej) ahco);
        roz b3 = rpa.m34196b();
        b3.f43472a = new ahdw(device, str2, "", b2, str, b, ahdi, ahdl);
        return ((rjx) ahco).mo24732b(b3.mo24977a());
    }
}
