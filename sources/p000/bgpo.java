package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.io.IOException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bgpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpo {

    /* renamed from: d */
    public static final /* synthetic */ int f117206d = 0;

    /* renamed from: a */
    public final Context f117207a;

    /* renamed from: b */
    public final bgpn f117208b;

    /* renamed from: c */
    public bgpm f117209c;

    /* renamed from: e */
    private ExecutorService f117210e;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpo(Context context) {
        bgpn bgpn = new bgpn(context);
        this.f117207a = context;
        this.f117208b = bgpn;
    }

    /* renamed from: a */
    static synchronized bsax m99708a(Location location) {
        bsax bsax;
        synchronized (bgpo.class) {
            bsax = new bsax(bgox.f117004X);
            bsax bsax2 = new bsax(bgox.f116995O);
            bsax2.mo70134g(1, ayuo.m84849b(location.getLatitude()));
            bsax2.mo70134g(2, ayuo.m84849b(location.getLongitude()));
            bsax.mo70118b(1, bsax2);
            if (location.hasAccuracy()) {
                bsax.mo70134g(3, (int) location.getAccuracy());
            }
            if (location.hasAltitude()) {
                bsax.mo70134g(10, (int) location.getAltitude());
            }
            if (location.hasBearing()) {
                bsax.mo70134g(13, (int) location.getBearing());
            }
            if (location.hasSpeed()) {
                bsax.mo70116b(16, location.getSpeed());
            }
            if ("gps".equals(location.getProvider())) {
                bsax.mo70134g(8, 0);
            } else if ("network".equals(location.getProvider())) {
                bsax.mo70134g(8, 32);
            } else {
                bsax.mo70134g(8, 15);
            }
            bsax.mo70117b(6, location.getTime());
        }
        return bsax;
    }

    /* renamed from: b */
    public final synchronized void mo63076b() {
        ExecutorService executorService = this.f117210e;
        if (executorService != null) {
            executorService.execute(new bgpk(this));
            this.f117210e.shutdown();
        }
    }

    /* renamed from: a */
    public static bsax m99709a(bsax bsax, bsax bsax2) {
        String str;
        String str2;
        bsax bsax3 = new bsax(bgox.f117045al);
        bsax bsax4 = new bsax(bgox.f117038ae);
        int seismicDeviceTypePrecision = (int) cezu.f183534a.mo6606a().seismicDeviceTypePrecision();
        if (seismicDeviceTypePrecision == 1) {
            str = Build.MANUFACTURER;
        } else if (seismicDeviceTypePrecision == 2) {
            String str3 = Build.BRAND;
            String str4 = Build.DEVICE;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("/");
            sb.append(str4);
            str = sb.toString();
        } else if (seismicDeviceTypePrecision != 3) {
            str = "";
        } else {
            str = Build.FINGERPRINT;
        }
        bsax4.mo70118b(2, str);
        bsax4.mo70118b(9, Integer.toString(stu.m36316b()));
        bsax4.mo70118b(11, TimeZone.getDefault().getID());
        bsax3.mo70118b(1, bsax4);
        bsax bsax5 = new bsax(bgox.f117044ak);
        long currentTimeMillis = System.currentTimeMillis();
        bsax5.mo70117b(1, currentTimeMillis);
        bsax5.mo70117b(4, currentTimeMillis);
        bsax5.mo70134g(3, 0);
        String uuid = UUID.randomUUID().toString();
        if (cezu.m138491l()) {
            String valueOf = String.valueOf(uuid);
            str2 = valueOf.length() == 0 ? new String("@debug.") : "@debug.".concat(valueOf);
        } else {
            String valueOf2 = String.valueOf(uuid);
            str2 = valueOf2.length() == 0 ? new String("@") : "@".concat(valueOf2);
        }
        bsax5.mo70118b(2, str2);
        bsax3.mo70107a(6, bsax5);
        bsax bsax6 = new bsax(bgox.f117039af);
        bsax6.mo70118b(1, "sglclt/com.google.android.apps.location.quake");
        bsax3.mo70107a(2, bsax6);
        bsax bsax7 = new bsax(bgox.f117041ah);
        try {
            bsax7.mo70107a(7, bsax.mo70120b());
        } catch (IOException e) {
        }
        bsax7.mo70105a(6, 6);
        if (bsax2 != null) {
            bsax7.mo70118b(9, bsax2);
        }
        bsax3.mo70107a(4, bsax7);
        return bsax3;
    }

    /* renamed from: a */
    public final synchronized void mo63074a() {
        if (this.f117210e == null) {
            bqgj b = snp.m35704b(10);
            this.f117210e = b;
            b.execute(new bgpj(this));
        }
    }

    /* renamed from: a */
    public final synchronized void mo63075a(bsax bsax) {
        ExecutorService executorService = this.f117210e;
        if (executorService != null) {
            try {
                executorService.execute(new bgpl(this, bsax));
            } catch (RejectedExecutionException e) {
            }
        }
    }
}
