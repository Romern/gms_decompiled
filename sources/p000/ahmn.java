package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ahmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahmn implements ahqi, ahnm, ahmy {

    /* renamed from: a */
    public static final Comparator f67544a = ahlt.f67477a;

    /* renamed from: b */
    public final ahnp f67545b;

    /* renamed from: c */
    public final ahov f67546c;

    /* renamed from: d */
    public final ahmz f67547d;

    /* renamed from: e */
    public final SecureRandom f67548e;

    /* renamed from: f */
    public final ScheduledExecutorService f67549f = ahhr.m55804a();

    /* renamed from: g */
    public final Map f67550g = new C1223np();

    /* renamed from: h */
    public final Map f67551h = new C1223np();

    /* renamed from: i */
    public final Map f67552i = new C1223np();

    /* renamed from: j */
    private final ahlh f67553j;

    /* renamed from: k */
    private final ahne f67554k;

    /* renamed from: l */
    private final bqgj f67555l = ahhr.m55806b();

    public ahmn(ahnp ahnp, ahne ahne, ahlh ahlh, ahov ahov) {
        ahmz ahmz = new ahmz();
        SecureRandom secureRandom = new SecureRandom();
        this.f67545b = ahnp;
        this.f67554k = ahne;
        this.f67553j = ahlh;
        this.f67546c = ahov;
        this.f67547d = ahmz;
        this.f67548e = secureRandom;
    }

    /* renamed from: a */
    protected static aiss m56136a(String str, String str2, byte[] bArr) {
        byte[] bytes = str.getBytes(ahkv.f67378a);
        byte[] bytes2 = str2.getBytes(ahkv.f67378a);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bytes2.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bytes2);
        allocate.put(bArr);
        return aiss.m57869a(allocate.array());
    }

    /* renamed from: c */
    protected static final boolean m56142c(ahkv ahkv, String str) {
        ConnectionOptions b = ahkv.mo36707b(str);
        return b != null && b.f80457a;
    }

    /* renamed from: g */
    public static final boolean m56143g(ahkv ahkv) {
        if (ahkv.mo36725j() != null) {
            return ahkv.mo36725j().f80444c;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ahmk mo36837a(ahkv ahkv, String str, DiscoveryOptions discoveryOptions);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ahmk mo36838a(ahkv ahkv, String str, String str2, byte[] bArr, byte[] bArr2, AdvertisingOptions advertisingOptions);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ahna mo36839a(ahkv ahkv, ahmg ahmg);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36841a(ahkv ahkv);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36850b(ahkv ahkv);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36851b(ahkv ahkv, ahmg ahmg) {
        int i;
        ahmh ahmh = (ahmh) this.f67550g.get(ahkv);
        if (ahmh == null) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("onEndpointFound reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", ahmg.f67521b);
            return;
        }
        if (!ahmh.f67526a.containsKey(ahmg.f67521b)) {
            ahmh.f67526a.put(ahmg.f67521b, new ArrayList());
        }
        List list = (List) ahmh.f67526a.get(ahmg.f67521b);
        if (list.isEmpty()) {
            list.add(ahmg);
            i = 1;
        } else if (!Arrays.equals(((ahmg) list.get(0)).f67522c, ahmg.f67522c)) {
            list.clear();
            list.add(ahmg);
            i = 2;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ahmg ahmg2 = (ahmg) it.next();
                if (ahmg2.f67524e == ahmg.f67524e) {
                    list.remove(ahmg2);
                    break;
                }
            }
            list.add(ahmg);
            Collections.sort(list, f67544a);
            i = 3;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ahkv.mo36701a(ahmg.f67521b, ahmg.f67523d, ahmg.f67522c, ahmg.f67524e);
        } else if (i2 == 1) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("onEndpointFound reported for endpoint %s with a new endpoint name.", ahmg.f67521b);
            ahkv.mo36700a(ahmg.f67523d, ahmg.f67521b);
            ahkv.mo36701a(ahmg.f67521b, ahmg.f67523d, ahmg.f67522c, ahmg.f67524e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo36853b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo36855c(ahkv ahkv) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String[] mo36856c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List mo36857d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo36858d(ahkv ahkv) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract bvif mo36859e();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo36860e(ahkv ahkv) {
        for (ahmj ahmj : this.f67551h.values()) {
            if (!ahmj.f67532e) {
                return true;
            }
        }
        if (ahkv.mo36743s() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List mo36861f() {
        ArrayList arrayList = new ArrayList(this.f67546c.mo36915a(mo36857d()));
        Collections.sort(arrayList, ahlu.f67478a);
        return arrayList;
    }

    /* renamed from: h */
    public final void mo36863h(ahkv ahkv) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo36847a(new ahlw(this, ahkv, countDownLatch));
        ahhf.m55774a("stopAdvertising()", countDownLatch);
    }

    /* renamed from: i */
    public final void mo36864i(ahkv ahkv) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo36847a(new ahly(this, ahkv, countDownLatch));
        ahhf.m55774a("stopDiscovery()", countDownLatch);
    }

    /* renamed from: a */
    private static bvif m56137a(ahna ahna) {
        if (ahna != null) {
            return ahna.mo36865l();
        }
        return bvif.UNKNOWN_MEDIUM;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo36854c(ahkv ahkv, ahmg ahmg) {
        ahmh ahmh = (ahmh) this.f67550g.get(ahkv);
        if (ahmh == null) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("onEndpointLost reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", ahmg.f67521b);
            return;
        }
        List b = ahmh.mo36830b(ahmg.f67521b);
        if (b.remove(ahmg) && b.isEmpty()) {
            ahkv.mo36700a(ahmg.f67523d, ahmg.f67521b);
            return;
        }
        String str = ahmg.f67521b;
        ahkv.mo36690a(str, ahmh.mo36829a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo36862f(ahkv ahkv) {
        for (ahmj ahmj : this.f67551h.values()) {
            if (ahmj.f67532e) {
                return true;
            }
        }
        if (ahkv.mo36744t() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final Future m56138a(Callable callable) {
        return this.f67555l.mo25819b(callable);
    }

    /* renamed from: a */
    public static void m56139a(ahkv ahkv, bvif bvif, String str, boolean z, long j) {
        int i = 3;
        if (str != null && ahkv.mo36739q(str).mo36401b()) {
            i = 4;
        }
        if (!z) {
            ahkv.f67390f.mo36655a(str, 2, bvif, i, SystemClock.elapsedRealtime() - j);
        } else {
            ahkv.f67390f.mo36652a(2, bvif, i, SystemClock.elapsedRealtime() - j);
        }
    }

    /* renamed from: a */
    private final void m56140a(ahkv ahkv, String str, ahmj ahmj) {
        mo36842a(ahkv, ahmj.f67530c.mo36865l(), str, ahmj.f67530c, ahmj.f67532e, ahmj.f67533f, 8012, ahmj.f67538k);
        mo36852b(ahkv, str);
    }

    /* renamed from: b */
    public final void mo36852b(ahkv ahkv, String str) {
        this.f67551h.remove(str);
        this.f67545b.mo36892a(ahkv, str);
        ahkv.mo36691a(str, 13, null);
    }

    /* renamed from: a */
    public static boolean m56141a(bvif bvif, bvif bvif2, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Integer num = (Integer) list.get(i);
            if (num.intValue() == bvif.f156141k) {
                return true;
            }
            i++;
            if (num.intValue() == bvif2.f156141k) {
                return false;
            }
        }
        throw new IllegalStateException(String.format("Failed to find either %s or %s in the list of locally supported mediums despite  expecting to find both, when deciding which medium is preferred.", bvif.name(), bvif2.name()));
    }

    /* renamed from: a */
    public final int mo36832a(ahkv ahkv, String str) {
        return ahhf.m55770a(String.format("rejectConnection(%s)", str), m56138a(new ahln(this, ahkv, str)));
    }

    /* renamed from: a */
    public final int mo36833a(ahkv ahkv, String str, DiscoveryOptions discoveryOptions, aigh aigh) {
        return ahhf.m55770a(String.format("startDiscovery(%s)", str), m56138a(new ahlx(this, ahkv, str, discoveryOptions, aigh)));
    }

    /* renamed from: a */
    public final int mo36834a(ahkv ahkv, String str, byte[] bArr, aigo aigo) {
        return ahhf.m55770a(String.format("acceptConnection(%s)", str), m56138a(new ahmc(this, ahkv, str, bArr, aigo)));
    }

    /* renamed from: a */
    public final int mo36835a(ahkv ahkv, String str, byte[] bArr, AdvertisingOptions advertisingOptions, aify aify) {
        return ahhf.m55770a(String.format("startAdvertising(%s)", ahkm.m55981a(bArr)), m56138a(new ahlv(this, ahkv, bArr, str, advertisingOptions, aify)));
    }

    /* renamed from: a */
    public final int mo36836a(ahkv ahkv, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, aify aify) {
        bqgy c = bqgy.m112818c();
        mo36847a(new ahlz(this, str, c, ahkv, connectionOptions, bArr, bArr2, aify));
        return ahhf.m55770a(String.format("requestConnection(%s)", str), c);
    }

    /* renamed from: a */
    public final void mo36840a() {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Initiating shutdown of PCPHandler(%s).", mo36958g().mo44188a());
        this.f67545b.mo36896b(buuw.CONNECTION_RESPONSE, this);
        ahmz ahmz = this.f67547d;
        ahhr.m55805a(ahmz.f67591c, "EncryptionRunner.serverExecutor");
        ahhr.m55805a(ahmz.f67592d, "EncryptionRunner.clientExecutor");
        ahhr.m55805a(ahmz.f67590b, "EncryptionRunner.alarmExecutor");
        ahhr.m55805a(this.f67555l, "BasePCPHandler.serialExecutor");
        ahhr.m55805a(this.f67549f, "BasePCPHandler.alarmExecutor");
        this.f67552i.clear();
        for (ahmh ahmh : this.f67550g.values()) {
            ahmh.f67526a.clear();
        }
        this.f67550g.clear();
        for (ahmj ahmj : this.f67551h.values()) {
            bqgy bqgy = ahmj.f67538k;
            if (bqgy != null) {
                bqgy.mo69138b((Object) 13);
            }
            ahmj.f67530c.mo36796a(6);
        }
        this.f67551h.clear();
        mo36958g().mo44188a();
    }

    /* renamed from: a */
    public final void mo36842a(ahkv ahkv, bvif bvif, String str, ahna ahna, boolean z, long j, int i, bqgy bqgy) {
        m56139a(ahkv, bvif, str, z, j);
        mo36843a(ahkv, str, ahna, i, bqgy);
    }

    /* renamed from: a */
    public final void mo36843a(ahkv ahkv, String str, ahna ahna, int i, bqgy bqgy) {
        if (str != null) {
            try {
                this.f67551h.remove(str);
            } catch (Throwable th) {
                if (bqgy != null) {
                    bqgy.mo69138b(Integer.valueOf(i));
                }
                throw th;
            }
        }
        if (ahna != null) {
            ahna.mo36805g();
        }
        ahkv.mo36735o(str);
        if (bqgy != null) {
            bqgy.mo69138b(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36844a(ahkv ahkv, String str, ahna ahna, bvif bvif) {
        ahfi b;
        byte[] bArr;
        boolean z;
        ahkv ahkv2 = ahkv;
        ahna ahna2 = ahna;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (!ahkv.mo36719g()) {
                throw new IOException(String.format("Ignoring incoming connection on medium %s because client %d is no longer advertising", m56137a(ahna).name(), Long.valueOf(ahkv.mo36706b())));
            } else if (ahna2 != null) {
                srn srn = ahkm.f67363a;
                new Object[1][0] = mo36958g().mo44188a();
                b = ahfi.m55635b(new ahlr(ahna2), cfnv.m140798v(), this.f67549f);
                buuj a = ahoy.m56305a(ahna.mo36803e());
                b.mo36396b();
                if (ahoy.m56306a(a) == buuw.CONNECTION_REQUEST) {
                    buux buux = a.f154950c;
                    if (buux == null) {
                        buux = buux.f155003j;
                    }
                    buuc buuc = buux.f155007c;
                    if (buuc == null) {
                        buuc = buuc.f154922j;
                    }
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("In onIncomingConnection(%s) for client %d, read ConnectionRequestFrame from endpoint %s", m56137a(ahna).name(), Long.valueOf(ahkv.mo36706b()), buuc.f154925b);
                    if (!ahkv2.mo36716e(buuc.f154925b)) {
                        String str2 = buuc.f154925b;
                        int i = buuc.f154928e;
                        if (this.f67551h.containsKey(str2)) {
                            ahmj ahmj = (ahmj) this.f67551h.get(str2);
                            ((bnsl) ahkm.f67363a.mo68390d()).mo68426a("In onIncomingConnection() for client %d, found a collision with endpoint %s. We've already sent a connection request to them with nonce %d, but they're also trying to connect to us with nonce %d.", Long.valueOf(ahkv.mo36706b()), str2, Integer.valueOf(ahmj.f67531d), Integer.valueOf(i));
                            int i2 = ahmj.f67531d;
                            if (i2 > i) {
                                ahna.mo36805g();
                                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing their channel.", ahkv.mo36706b(), str2);
                                return;
                            } else if (i2 < i) {
                                m56140a(ahkv2, str2, ahmj);
                                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing our channel and notifying our client of the failure.", ahkv.mo36706b(), str2);
                            } else {
                                ahna.mo36805g();
                                m56140a(ahkv2, str2, ahmj);
                                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing both channels. Our nonces were identical, so we couldn't decide which channel to use.", ahkv.mo36706b(), str2);
                                return;
                            }
                        }
                        if (m56143g(ahkv)) {
                            if (!mo36858d(ahkv)) {
                                throw new IOException("Incoming connections are currently disallowed.");
                            }
                        }
                        if ((buuc.f154924a & 16) != 0) {
                            bArr = buuc.f154930h.mo73780k();
                        } else {
                            bArr = buuc.f154926c.getBytes(ahkv.f67378a);
                        }
                        if ((buuc.f154924a & 32) != 0) {
                            buug buug = buuc.f154931i;
                            if (buug == null) {
                                buug = buug.f154941c;
                            }
                            z = buug.f154944b;
                        } else {
                            z = false;
                        }
                        this.f67551h.put(buuc.f154925b, new ahmj(ahkv, bArr, ahna, buuc.f154928e, true, elapsedRealtime, buuc.f154927d.mo73780k(), ahkv.mo36723i(), null, (buub[]) new bxvv(buuc.f154929f, buuc.f154921g).toArray(new buub[0]), z));
                        ahmz ahmz = this.f67547d;
                        ahmz.f67591c.execute(new ahmu(ahmz, ahkv, buuc.f154925b, ahna, this));
                        return;
                    }
                    throw new IOException(String.format("Incoming connection on medium %s was denied because we're already connected to endpoint %s.", m56137a(ahna).name(), buuc.f154925b));
                }
                throw new IOException(String.format("In readConnectionRequestFrame, expected a CONNECTION_REQUEST v1 OfflineFrame but got a %s frame instead", ahoy.m56306a(a).name()));
            } else {
                throw new IOException("Unable to read from a null EndpointChannel");
            }
        } catch (IOException e) {
            throw new IOException(String.format("In readConnectionRequestFrame, attempted to read a ConnectionRequestFrame from EndpointChannel %s but was unable to obtain any OfflineFrame.", ahna.mo36795a()), e);
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68425a("onIncomingConnection(%s) for client %d failed to initialize the connection with %s", m56137a(ahna).name(), Long.valueOf(ahkv.mo36706b()), str);
            mo36842a(ahkv, bvif, null, ahna, true, elapsedRealtime, -1, null);
        } catch (Throwable th) {
            b.mo36396b();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36845a(ahkv ahkv, String str, bvif bvif, int i) {
        ahmh ahmh = (ahmh) this.f67550g.get(ahkv);
        if (ahmh == null) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("onEndpointDistanceChanged reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", str);
        } else if (ahmh.mo36831c(str)) {
            Iterator it = ahmh.mo36830b(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    srn srn = ahkm.f67363a;
                    bvif.name();
                    break;
                }
                ahmg ahmg = (ahmg) it.next();
                if (ahmg.f67524e == bvif) {
                    ahmg.f67525f = i;
                    break;
                }
            }
            ahkv.mo36690a(str, ahmh.mo36829a(str));
        } else {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("onEndpointDistanceChanged reported for endpoint %s, but the endpoint has not been reported onEndpointFound yet.", str);
        }
    }

    /* renamed from: a */
    public final void mo36782a(ahkv ahkv, String str, CountDownLatch countDownLatch) {
        mo36847a(new ahlq(this, str, ahkv, countDownLatch));
    }

    /* renamed from: a */
    public final void mo36846a(ahkv ahkv, String str, byte[] bArr, boolean z) {
        int i;
        if (ahkv.mo36730l(str) || ahkv.mo36732m(str)) {
            ahmj ahmj = (ahmj) this.f67551h.remove(str);
            if (ahmj == null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68418a("evaluateConnectionResult() for client %d failed to find a pending connection to endpoint %s.", ahkv.mo36706b(), str);
                return;
            }
            boolean l = ahkv.mo36730l(str);
            if (l) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("The connection with endpoint %s was accepted by both sides", str);
                try {
                    this.f67554k.mo36879a(str, ahmj.f67539l.mo74496c());
                    ahkv.f67390f.mo36669b(str, ahmj.f67530c.mo36865l());
                    i = 0;
                } catch (byrq e) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68418a("evaluateConnectionResult() for client %d failed to upgrade the connection to endpoint %s to use encryption.", ahkv.mo36706b(), str);
                    mo36852b(ahkv, str);
                    return;
                }
            } else {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("The connection with endpoint %s was rejected by one or both sides.", str);
                i = 8004;
            }
            ahkv.mo36691a(str, i, bArr);
            if (l) {
                ahkv.mo36694a(str, ahmj.f67530c.mo36865l());
                if (!ahmj.f67532e) {
                    return;
                }
                if (ahkv.mo36725j() == null || ahkv.mo36725j().f80443b) {
                    this.f67553j.mo36778a(ahkv, str);
                }
            } else if (!z) {
                this.f67552i.put(str, ahfi.m55635b(new ahlp(this, str, ahkv), cfnv.m140751M(), this.f67549f));
            } else {
                this.f67545b.mo36892a(ahkv, str);
            }
        } else if (!ahkv.mo36720g(str)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Waiting for the client to decide whether or not to accept the connection to endpoint %s", str);
        } else if (!ahkv.mo36722h(str)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Waiting for endpoint %s to decide whether or not to accept the connection", str);
        }
    }

    /* renamed from: a */
    public final void mo36784a(buuj buuj, String str, ahkv ahkv, bvif bvif) {
        buud buud;
        buux buux = buuj.f154950c;
        if (buux == null) {
            buux = buux.f155003j;
        }
        buud buud2 = buux.f155008d;
        if (buud2 != null) {
            buud = buud2;
        } else {
            buud = buud.f154932d;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo36847a(new ahlo(this, str, buud, ahkv, countDownLatch));
        ahhf.m55774a("onConnectionResponse()", countDownLatch);
    }

    /* renamed from: a */
    public final void mo36847a(Runnable runnable) {
        this.f67555l.execute(runnable);
    }

    /* renamed from: a */
    public final void mo36848a(String str, ahna ahna) {
        mo36847a(new ahmb(this, str, ahna));
    }

    /* renamed from: a */
    public final void mo36849a(String str, byse byse, String str2, byte[] bArr) {
        mo36847a(new ahma(this, str, byse, str2, bArr));
    }
}
