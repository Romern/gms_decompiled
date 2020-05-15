package p000;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pmt extends ply implements agbb {

    /* renamed from: a */
    public final Map f39739a = new HashMap();

    /* renamed from: b */
    public volatile long f39740b = -1;

    /* renamed from: c */
    final Set f39741c = new HashSet();

    /* renamed from: d */
    private final String f39742d;

    /* renamed from: k */
    private final Map f39743k = new HashMap();

    /* renamed from: l */
    private final MdnsOptions f39744l;

    /* renamed from: m */
    private int f39745m;

    /* renamed from: n */
    private String f39746n;

    /* renamed from: o */
    private agba f39747o;

    public pmt(Context context, ScheduledExecutorService scheduledExecutorService, poj poj, phy phy) {
        super(context, scheduledExecutorService, phy, "MDNS", poj);
        this.f39742d = context.getResources().getString(C0126R.string.generic_cast_device_model_name);
        this.f39744l = MdnsOptions.m67242a("_googlecast._tcp.local", "Cast mDNS Scanner").mo35140a();
    }

    /* renamed from: a */
    private final void m30841a(CastDevice castDevice, Set set, String str) {
        if (castDevice != null) {
            poj poj = this.f39644i;
            new pop(poj.f39918b, poj.f39919c, castDevice, set, str, System.currentTimeMillis()).mo23522a();
        }
    }

    /* renamed from: b */
    public final void mo23438b() {
        this.f39640e.mo23677d("onSearchFailedToStart", new Object[0]);
        this.f39643h.mo23140d();
    }

    /* renamed from: c */
    public final void mo23440c(MdnsServiceInfo mdnsServiceInfo) {
        int i;
        CastDevice castDevice;
        String str = mdnsServiceInfo.f80071a;
        this.f39640e.mo23856a("Receive MDNS response with service %s", str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f39740b != -1 ? elapsedRealtime - this.f39740b : -1;
        if (mdnsServiceInfo.f80077g == null || mdnsServiceInfo.f80076f != null || cczx.m132361b()) {
            pmu pmu = (pmu) this.f39739a.get(str);
            if (pmu == null) {
                pmu = new pmu(str, this.f39742d, this.f39743k, this.f39643h);
                i = pmu.mo23441a(mdnsServiceInfo, elapsedRealtime, j);
                if (i != 1) {
                    this.f39640e.mo23857a("Not adding %s. result(%s)", str, pmu.m30854a(i));
                    return;
                }
                this.f39640e.mo23856a("DeviceEntry created for %s", pmu);
                this.f39739a.put(str, pmu);
                castDevice = null;
            } else {
                castDevice = pmu.f39749b;
                i = pmu.mo23441a(mdnsServiceInfo, elapsedRealtime, j);
            }
            if (i != 0) {
                this.f39640e.mo23673b("Received response from %s with result %s", pmu.f39749b, pmu.m30854a(i));
            } else {
                this.f39640e.mo23857a("Received response from %s with result %s", pmu.f39749b, pmu.m30854a(0));
            }
            if (i == 0) {
                m30841a(pmu.f39749b, pmu.mo23442a(), pmu.f39750c);
            } else if (i == 1) {
                this.f39643h.mo23111a(pmu.f39749b);
                m30841a(pmu.f39749b, pmu.mo23442a(), pmu.f39750c);
            } else if (i == 2) {
                m30841a(pmu.f39749b, pmu.mo23442a(), pmu.f39750c);
            } else if (i == 3) {
                if (castDevice != null) {
                    this.f39640e.mo23856a("notifyDeviceOffline: because it's a different device; newDevice=%s", pmu.f39749b);
                    mo23434a(castDevice);
                }
                m30841a(pmu.f39749b, pmu.mo23442a(), pmu.f39750c);
            }
        } else {
            this.f39640e.mo23861b("IPv6 support is disabled on an IPv6-only network.");
        }
    }

    /* renamed from: b */
    public final void mo23439b(MdnsServiceInfo mdnsServiceInfo) {
        this.f39642g.execute(new pmp(this, mdnsServiceInfo));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo23386b(Set set, int i) {
        String str;
        boolean z;
        this.f39640e.mo23857a("Start scan with criteria (%s). Scanner flags (%d)", TextUtils.join(",", set), Integer.valueOf(i));
        this.f39741c.clear();
        this.f39741c.addAll(set);
        this.f39745m = i;
        WifiInfo connectionInfo = ((WifiManager) this.f39641f.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            str = connectionInfo.getBSSID();
        } else {
            str = null;
        }
        if (!ptk.m31236a(this.f39746n, str)) {
            this.f39746n = str;
            this.f39739a.clear();
        }
        this.f39743k.clear();
        for (String str2 : this.f39741c) {
            this.f39743k.put(qay.m31787b(str2), str2);
        }
        this.f39747o = agai.m53800a(this.f39641f, this.f39744l);
        agav a = MdnsSearchOptions.m67243a();
        a.mo35175a(this.f39743k.keySet());
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        String str3 = qau.f40832a;
        a.f65105a = z;
        this.f39747o.mo35178a(this, a.mo35174a());
        if (cczx.f180351a.mo6606a().mo77150i()) {
            this.f39740b = SystemClock.elapsedRealtime();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23382a() {
        agba agba = this.f39747o;
        if (agba != null) {
            agba.mo35179a((agbb) this);
            this.f39747o = null;
        }
        ArrayList arrayList = new ArrayList();
        for (pmu pmu : this.f39739a.values()) {
            CastDevice castDevice = pmu.f39749b;
            if (castDevice != null) {
                arrayList.add(castDevice);
            }
        }
        this.f39739a.clear();
        if (cczx.f180351a.mo6606a().mo77147f() && !arrayList.isEmpty()) {
            poj poj = this.f39644i;
            pof pof = new pof(poj.f39918b, poj.f39919c, "MdnsDevicesOffline");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                poq a = this.f39644i.mo23520a((CastDevice) arrayList.get(i));
                pof.f39909d.add(a);
                if (a.f39933a) {
                    pof.f39910e = true;
                }
                if (a.f39934b) {
                    pof.f39911f = true;
                }
            }
            new pog(pof.f39907b, pof.f39908c, pof.f39909d, pof.f39910e, pof.f39911f, pof.f39906a).mo23522a();
        }
    }

    /* renamed from: a */
    public final void mo23432a(int i) {
        this.f39640e.mo23677d("onSearchStoppedWithError: %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo23433a(int i, int i2) {
        this.f39642g.execute(new pms(this, i, i2));
    }

    /* renamed from: a */
    public final void mo23434a(CastDevice castDevice) {
        if (castDevice != null) {
            this.f39644i.mo23520a(castDevice).mo23522a();
        }
    }

    /* renamed from: a */
    public final void mo23435a(MdnsServiceInfo mdnsServiceInfo) {
        this.f39642g.execute(new pmo(this, mdnsServiceInfo));
    }

    /* renamed from: a */
    public final void mo23436a(String str) {
        this.f39642g.execute(new pmq(this, str));
    }

    /* renamed from: a */
    public final void mo23437a(List list, int i) {
        this.f39642g.execute(new pmr(this, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23384a(Set set, int i) {
        this.f39640e.mo23857a("Scan settings updated. New filterCriteria (%s). Scanner flag (%d)", TextUtils.join(",", set), Integer.valueOf(i));
        HashSet<String> hashSet = new HashSet(this.f39741c);
        this.f39741c.clear();
        this.f39741c.addAll(set);
        this.f39743k.clear();
        for (String str : this.f39741c) {
            this.f39743k.put(qay.m31787b(str), str);
        }
        if (this.f39745m != i) {
            this.f39745m = i;
        }
        HashSet hashSet2 = new HashSet();
        if (!hashSet.isEmpty()) {
            for (String str2 : hashSet) {
                if (!set.contains(str2)) {
                    hashSet2.add(str2);
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            for (pmu pmu : this.f39739a.values()) {
                if (!hashSet2.isEmpty()) {
                    pmu.f39751d.keySet().removeAll(hashSet2);
                }
                CastDevice castDevice = pmu.f39749b;
                if (castDevice != null) {
                    m30841a(castDevice, pmu.mo23442a(), pmu.f39750c);
                }
            }
        }
        if (this.f39747o != null) {
            this.f39640e.mo23861b("Updating mDNS search options.");
            agav a = MdnsSearchOptions.m67243a();
            a.mo35175a(this.f39743k.keySet());
            this.f39747o.mo35178a(this, a.mo35174a());
        }
    }
}
