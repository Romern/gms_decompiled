package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: akdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akdw {

    /* renamed from: f */
    private static final Strategy f71682f = Strategy.f80482c;

    /* renamed from: g */
    private static final ParcelUuid f71683g = ahhc.m55765a("FEF3");

    /* renamed from: a */
    final Map f71684a = new C1223np();

    /* renamed from: b */
    final Map f71685b = new C1223np();

    /* renamed from: c */
    final ahia f71686c = new akdj(this);

    /* renamed from: d */
    final ahin f71687d = new akdn(this);

    /* renamed from: e */
    final ahir f71688e = new akdq(this);

    /* renamed from: h */
    private final ahie f71689h;

    /* renamed from: i */
    private final ConnectivityManager f71690i;

    /* renamed from: j */
    private final ExecutorService f71691j = ahhr.m55806b();

    /* renamed from: k */
    private final ScheduledExecutorService f71692k = ahhr.m55804a();

    /* renamed from: l */
    private final Set f71693l = new C1225nr();

    /* renamed from: m */
    private akdr f71694m;

    /* renamed from: n */
    private akds f71695n;

    /* renamed from: o */
    private final Map f71696o = new C1223np();

    /* renamed from: p */
    private final Map f71697p = new C1223np();

    /* renamed from: q */
    private final Map f71698q = new C1223np();

    /* renamed from: r */
    private final Map f71699r = new C1223np();

    public akdw(Context context) {
        ahif ahif = new ahif();
        ahif.f67236a = "nearby.sharing";
        this.f71689h = ahcb.m55439a(context, ahif.mo36530a());
        this.f71690i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m59483a(String str, ahhz ahhz, ahid ahid) {
        if (ahid.f67235a.mo17710c()) {
            akds akds = this.f71695n;
            if (akds != null) {
                akdd akdd = new akdd(this, str);
                this.f71685b.put(str, akdd);
                akds.mo39269a(str, ahhz.f67233f, akdd);
                return;
            }
            mo39295b(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        return;
     */
    /* renamed from: b */
    private final synchronized void m59485b(String str, ahid ahid) {
        if (!this.f71684a.containsKey(str)) {
            mo39295b(str);
            return;
        }
        bqgy bqgy = (bqgy) this.f71684a.remove(str);
        if (bqgy != null) {
            if (!ahid.f67235a.mo17710c()) {
                bqgy.mo69136a((Throwable) new Exception("Failed to connect."));
                return;
            }
            akdd akdd = new akdd(this, str);
            this.f71685b.put(str, akdd);
            bqgy.mo69138b(akdd);
        }
    }

    /* renamed from: c */
    public final synchronized void mo39297c() {
        this.f71689h.mo36527b();
        this.f71693l.clear();
        this.f71694m = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo39299d() {
        for (ahiq ahiq : this.f71697p.values()) {
            if (ahiq != null) {
                ahiq.mo36539b();
            }
        }
        this.f71697p.clear();
    }

    /* renamed from: e */
    public final synchronized void mo39301e() {
        this.f71689h.mo36528c();
        this.f71693l.clear();
        this.f71684a.clear();
        this.f71696o.clear();
        mo39299d();
        this.f71685b.clear();
        this.f71698q.clear();
        for (akdv akdv : this.f71699r.values()) {
            akdv.mo39271a();
        }
        this.f71699r.clear();
        this.f71694m = null;
        this.f71695n = null;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdw", "e", 796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("NearbyConnectionsManager has been reset");
    }

    /* renamed from: f */
    public final synchronized void mo39303f(String str) {
        ahhf.m55776b("initiateBandwidthUpgrade", ((aifl) this.f71689h).mo37460a((aifh) new aien(str)), cfov.m142058k());
    }

    /* renamed from: c */
    public final synchronized void mo39298c(String str) {
        this.f71698q.remove(str);
        akdv akdv = (akdv) this.f71699r.remove(str);
        if (akdv != null) {
            akdv.mo39271a();
        }
        bqgy bqgy = (bqgy) this.f71684a.remove(str);
        if (bqgy != null) {
            bqgy.mo69136a((Throwable) new Exception("Endpoint disconnected."));
        }
        akdd akdd = (akdd) this.f71685b.remove(str);
        if (akdd != null) {
            akdd.mo39253b();
        }
    }

    /* renamed from: a */
    private final boolean m59484a(boolean z, int i, akcc akcc) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (!(i == 1 || akcc == akcc.LOW_POWER || (activeNetwork = this.f71690i.getActiveNetwork()) == null || (networkCapabilities = this.f71690i.getNetworkCapabilities(activeNetwork)) == null)) {
            boolean hasCapability = networkCapabilities.hasCapability(13);
            int i2 = Build.VERSION.SDK_INT;
            if ((!(!hasCapability) || networkCapabilities.hasCapability(19)) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                int i3 = Build.VERSION.SDK_INT;
                if (networkCapabilities.hasCapability(20)) {
                    if (z) {
                        int i4 = Build.VERSION.SDK_INT;
                    }
                    if (i == 3) {
                        return networkCapabilities.hasCapability(11);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized byte[] mo39300d(String str) {
        ahhz ahhz;
        ahhz = (ahhz) this.f71698q.get(str);
        return ahhz != null ? ahhz.f67230c : null;
    }

    /* renamed from: e */
    public final synchronized boolean mo39302e(String str) {
        ahhz ahhz;
        ahhz = (ahhz) this.f71698q.get(str);
        return ahhz != null ? ahhz.f67232e : false;
    }

    /* renamed from: b */
    public final synchronized void mo39293b() {
        this.f71689h.mo36524a();
        this.f71695n = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo39294b(long j) {
        akdt akdt = (akdt) this.f71696o.get(Long.valueOf(j));
        if (akdt != null) {
            akdt.mo39248a(j, 0, 4);
        }
        this.f71689h.mo36525a(j);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdw", "b", 732, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("Cancelling payload %s", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39295b(String str) {
        this.f71689h.mo36529n(str);
        mo39298c(str);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdw", "b", 721, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Disconnected from %s", str);
    }

    /* renamed from: b */
    public final synchronized void mo39296b(String str, ahiq ahiq, akdt akdt) {
        mo39282a(ahiq.f67251a, akdt);
        this.f71689h.mo36526a(str, ahiq);
    }

    /* renamed from: a */
    public final synchronized int mo39277a(akdr akdr) {
        ahie ahie;
        ahin ahin;
        DiscoveryOptions discoveryOptions;
        this.f71694m = akdr;
        ahie = this.f71689h;
        ahin = this.f71687d;
        ahik ahik = new ahik();
        ahik.mo36534a(f71682f);
        ParcelUuid parcelUuid = f71683g;
        discoveryOptions = ahik.f67244a;
        discoveryOptions.f80472f = parcelUuid;
        return ahhf.m55776b("startDiscovery", ahie.mo36520a("NearbySharing", ahin, discoveryOptions), cfov.m142058k());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akdw.a(boolean, int, akcc):boolean
     arg types: [int, int, akcc]
     candidates:
      akdw.a(java.lang.String, ahhz, ahid):void
      akdw.a(byte[], akds, akbw):int
      akdw.a(java.lang.String, ahiq, akdt):void
      akdw.a(boolean, int, akcc):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r13 == p000.akcc.MEDIUM_POWER) goto L_0x0069;
     */
    /* renamed from: a */
    public final synchronized int mo39278a(byte[] bArr, akds akds, akbw akbw) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ahie ahie;
        AdvertisingOptions advertisingOptions;
        rod a;
        rod a2;
        rob rob;
        this.f71695n = akds;
        akcc akcc = akbw.f71567a;
        int i = akbw.f71568b;
        ahht ahht = new ahht();
        ahht.mo36508a(f71682f);
        if (akcc == akcc.HIGH_POWER) {
            z = true;
        } else {
            z = false;
        }
        ahht.f67222a.f80451j = z;
        if (akcc == akcc.HIGH_POWER) {
            z2 = true;
        } else {
            z2 = false;
        }
        ahht.f67222a.f80450i = z2;
        if (akcc == akcc.HIGH_POWER) {
            z3 = true;
        } else {
            z3 = false;
        }
        ahht.f67222a.f80452k = z3;
        if (akcc == akcc.HIGH_POWER) {
            z4 = true;
        } else {
            z4 = false;
        }
        AdvertisingOptions advertisingOptions2 = ahht.f67222a;
        advertisingOptions2.f80445d = z4;
        advertisingOptions2.f80446e = true;
        advertisingOptions2.f80453l = true;
        if (akcc == akcc.LOW_POWER) {
            z5 = true;
        } else {
            z5 = false;
        }
        ahht.f67222a.f80448g = z5;
        if (akcc == akcc.HIGH_POWER) {
            z6 = true;
        } else {
            z6 = false;
        }
        ahht.mo36509a(z6);
        ahht.f67222a.f80454m = m59484a(true, i, akcc);
        if (akcc == akcc.LOW_POWER) {
        }
        ahht.f67222a.f80449h = f71683g;
        ahie = this.f71689h;
        ahia ahia = this.f71686c;
        advertisingOptions = ahht.f67222a;
        a = ahie.mo24714a(new aifi((aifl) ahie, ahia), ahia.class.getName());
        a2 = ((aifl) ahie).f68876a.mo37440a(ahie, new Object(), "advertising");
        rob = a2.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        return ahhf.m55776b("startAdvertising", ((aifl) ahie).f68876a.mo37437a(ahie, new aifc(a2, new Feature[]{ahca.f66971b}, bArr, "NearbySharing", a, advertisingOptions), new aifd(rob)), cfov.m142058k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ahiq mo39279a(long j) {
        return (ahiq) this.f71697p.get(Long.valueOf(j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akdw.a(boolean, int, akcc):boolean
     arg types: [int, int, akcc]
     candidates:
      akdw.a(java.lang.String, ahhz, ahid):void
      akdw.a(byte[], akds, akbw):int
      akdw.a(java.lang.String, ahiq, akdt):void
      akdw.a(boolean, int, akcc):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        return (p000.akdd) p000.ahhf.m55778c("connect", r10, p000.cfov.m142058k());
     */
    /* renamed from: a */
    public final akdd mo39280a(byte[] bArr, String str, byte[] bArr2, int i, boolean z) {
        ConnectionOptions connectionOptions;
        if (bArr2 != null && bArr2.length == 6) {
            ahib ahib = new ahib();
            ahib.f67234a.f80465i = bArr2;
            ahib.mo36516a(m59484a(false, i, akcc.HIGH_POWER));
            connectionOptions = ahib.f67234a;
        } else {
            ahib ahib2 = new ahib();
            ahib2.mo36516a(m59484a(false, i, akcc.HIGH_POWER));
            connectionOptions = ahib2.f67234a;
        }
        synchronized (this) {
            ahie ahie = this.f71689h;
            rod a = ahie.mo24714a(new aifi((aifl) ahie, this.f71686c), ahia.class.getName());
            ((aifl) ahie).mo37461o(str);
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ahca.f66971b};
            b.f43472a = new aiem(bArr, str, a, connectionOptions);
            aucb b2 = ahie.mo24732b(b.mo24977a());
            b2.mo50372a(new aifb((aifl) ahie, str));
            int b3 = ahhf.m55776b("requestConnection", b2, cfov.f185185a.mo6606a().mo82401y());
            if (b3 == 0) {
                bqgy c = bqgy.m112818c();
                this.f71684a.put(str, c);
                if (z) {
                    srn srn = ajvp.f71371a;
                    this.f71699r.put(str, new akdv(str));
                }
            } else {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                bnsl.mo68432a("akdw", "a", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to connect to the remote shareTarget: %s", ahih.m55828a(b3));
                this.f71689h.mo36529n(str);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39281a() {
        this.f71689h.mo36528c();
        ahhr.m55805a(this.f71692k, "NearbyConnnectionsManagerAlarmExecutor");
        ahhr.m55805a(this.f71691j, "NearbyConnectionsManagerExecutor");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo39282a(long j, akdt akdt) {
        this.f71696o.put(Long.valueOf(j), akdt);
    }

    /* renamed from: a */
    public final synchronized void mo39283a(ahiq ahiq) {
        this.f71697p.put(Long.valueOf(ahiq.f67251a), ahiq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39284a(Runnable runnable) {
        this.f71691j.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo39285a(String str) {
        if (!this.f71693l.remove(str)) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdw", "a", 348, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring lost endpoint %s because we haven't reported this endpoint", str);
            return;
        }
        akdr akdr = this.f71694m;
        if (akdr != null) {
            akdr.mo39266a(str);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akdw", "a", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Endpoint %s lost over Nearby Connections", str);
            return;
        }
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akdw", "a", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Ignoring lost endpoint %s because we're no longer in discovery mode", str);
    }

    /* renamed from: a */
    public final synchronized void mo39286a(String str, ahhx ahhx) {
        akdv akdv = (akdv) this.f71699r.get(str);
        if (akdv != null) {
            akdv.mo39272a(ahhx.f67223a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39287a(String str, ahhz ahhz) {
        this.f71698q.put(str, ahhz);
        this.f71689h.mo36521a(str, this.f71688e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo39288a(String str, ahid ahid) {
        ahhz ahhz = (ahhz) this.f71698q.get(str);
        if (ahhz != null) {
            if (ahhz.f67231d) {
                m59483a(str, ahhz, ahid);
            } else {
                m59485b(str, ahid);
            }
            if (!ahid.f67235a.mo17710c()) {
                this.f71698q.remove(str);
                this.f71699r.remove(str);
            }
            akdv akdv = (akdv) this.f71699r.get(str);
            if (akdv != null) {
                akdv.mo39275a(this.f71692k);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39289a(String str, ahij ahij) {
        if (this.f71694m == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdw", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring discovered endpoint %s because we're no longer in discovery mode", akid.m59793b(ahij.f67243c));
        } else if (!this.f71693l.contains(str)) {
            this.f71694m.mo39268a(str, ahij.f67243c);
            this.f71693l.add(str);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akdw", "a", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Discovered %s over Nearby Connections", akid.m59793b(ahij.f67243c));
        } else {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akdw", "a", 332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Ignoring discovered endpoint %s because we've already reported this endpoint", akid.m59793b(ahij.f67243c));
        }
    }

    /* renamed from: a */
    public final synchronized void mo39290a(String str, ahim ahim) {
        if (this.f71694m == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdw", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring endpoint distance changed %s because we're no longer in discovery mode", str);
        } else if (this.f71693l.contains(str)) {
            this.f71694m.mo39267a(str, ahim.f67245a);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akdw", "a", 381, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i = ahim.f67245a;
            bnsl2.mo68424a("Endpoint %s distance changed to %s over Nearby Connections", str, i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "FAR" : "CLOSE" : "VERY_CLOSE");
        } else {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akdw", "a", 374, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Ignoring endpoint distance changed %s because we haven't reported this endpoint", str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39291a(String str, ahiq ahiq, akdt akdt) {
        akdv akdv = (akdv) this.f71699r.get(str);
        if (akdv != null) {
            akdv.mo39274a(new akde(this, str, ahiq, akdt));
        } else {
            mo39296b(str, ahiq, akdt);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo39292a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        ahiq ahiq;
        long j = payloadTransferUpdate.f80476a;
        Map map = this.f71696o;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            akdt akdt = (akdt) this.f71696o.get(valueOf);
            if (akdt != null) {
                int i = payloadTransferUpdate.f80477b;
                int i2 = 4;
                if (i == 1) {
                    this.f71696o.remove(valueOf);
                    i2 = 2;
                } else if (i == 3) {
                    i2 = 1;
                } else if (i != 4) {
                    this.f71696o.remove(valueOf);
                    i2 = 3;
                } else {
                    this.f71696o.remove(valueOf);
                }
                akdt.mo39248a(j, payloadTransferUpdate.f80479d, i2);
            }
        } else if (this.f71697p.containsKey(valueOf) && (ahiq = (ahiq) this.f71697p.get(valueOf)) != null) {
            byte[] bArr = ahiq.f67253c;
            if (ahiq.f67252b != 1) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68432a("akdw", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("Received unknown payload of type %d. Cancelling.", ahiq.f67252b);
                this.f71689h.mo36525a(j);
            } else if (payloadTransferUpdate.f80477b == 1 && bArr != null) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akdw", "a", 697, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Writing incoming byte message to NearbyConnection.");
                akdd akdd = (akdd) this.f71685b.get(str);
                if (akdd != null) {
                    synchronized (akdd.f71640b) {
                        if (akdd.f71643e) {
                            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                            bnsl3.mo68432a("akdd", "b", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Dropping NearbyConnection message for %s because we're closed", akdd.f71641c);
                            return;
                        }
                        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl4.mo68432a("akdd", "b", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("Wrote NearbyConnection message to queue for %s", akdd.f71641c);
                        akdd.f71642d.add(bArr);
                        akdd.f71640b.notify();
                    }
                }
            }
        }
    }
}
