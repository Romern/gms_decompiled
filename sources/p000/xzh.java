package p000;

import com.google.android.gms.fido.common.Transport;
import java.util.Set;

/* renamed from: xzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzh {

    /* renamed from: b */
    public static final sek f53445b = new sek(new String[]{"PreferredTransportProvider"}, (short[]) null);

    /* renamed from: a */
    public final Set f53446a;

    /* renamed from: c */
    private final xgn f53447c;

    /* renamed from: d */
    private final xzb f53448d;

    public xzh(Set set, xgn xgn, xzb xzb) {
        bmxy.m108581a(set);
        this.f53446a = set;
        bmxy.m108581a(xgn);
        this.f53447c = xgn;
        bmxy.m108581a(xzb);
        this.f53448d = xzb;
    }

    /* renamed from: a */
    public final Transport mo30284a() {
        if (!this.f53446a.contains(Transport.BLUETOOTH_LOW_ENERGY)) {
            f53445b.mo25414c("BLE not enabled, ignoring pairing state", new Object[0]);
            return null;
        } else if (this.f53447c.mo29737a()) {
            f53445b.mo25414c("BLE enabled and a device is paired, returning BLE", new Object[0]);
            return Transport.BLUETOOTH_LOW_ENERGY;
        } else {
            f53445b.mo25414c("BLE enabled but no device is paired", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Transport mo30285b() {
        Long l;
        long j = Long.MIN_VALUE;
        Transport transport = null;
        for (Transport transport2 : this.f53446a) {
            xzb xzb = this.f53448d;
            bmxy.m108581a(transport2);
            xzi.f53449f.mo25414c("getLastSuccessfulKeyHandleUseTimeInMillisForTransport(%s)", transport2.f31675g);
            xzi xzi = (xzi) xzb;
            xzi.f53452d.lock();
            try {
                String a = ((xzi) xzb).f53453e.mo30181a(transport2.f31675g);
                if (a != null) {
                    l = Long.valueOf(Long.parseLong(a));
                } else {
                    l = null;
                }
                xzi.f53452d.unlock();
            } catch (NumberFormatException e) {
                xwg xwg = ((xzi) xzb).f53451c;
                if (xwg != null) {
                    xwg.mo30184a(((xzi) xzb).f53450b, e);
                }
                xzi.f53449f.mo25417e("getLastSuccessfulKeyHandleUseTimeInMillisForTransport failed", e, new Object[0]);
                xzi.f53452d.unlock();
                l = null;
            } catch (Throwable th) {
                xzi.f53452d.unlock();
                throw th;
            }
            if (l != null && l.longValue() > j) {
                j = l.longValue();
                transport = transport2;
            }
        }
        if (transport != null) {
            f53445b.mo25414c("Preferring transport %s last used at %d", transport, Long.valueOf(j));
        } else {
            f53445b.mo25414c("No enabled transport has been used previously", new Object[0]);
        }
        return transport;
    }
}
