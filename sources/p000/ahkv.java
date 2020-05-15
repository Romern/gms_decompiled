package p000;

import android.app.AppOpsManager;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ahkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkv {

    /* renamed from: a */
    public static final Charset f67378a = Charset.forName("UTF-8");

    /* renamed from: l */
    private static final ahfk f67379l = new ahfk(true);

    /* renamed from: A */
    private final IBinder.DeathRecipient f67380A;

    /* renamed from: B */
    private long f67381B = -1;

    /* renamed from: C */
    private Strategy f67382C;

    /* renamed from: D */
    private DiscoveryOptions f67383D;

    /* renamed from: E */
    private AdvertisingOptions f67384E;

    /* renamed from: F */
    private final Map f67385F = new C1223np();

    /* renamed from: b */
    public final String f67386b;

    /* renamed from: c */
    public final Context f67387c;

    /* renamed from: d */
    public final String f67388d;

    /* renamed from: e */
    public final boolean f67389e;

    /* renamed from: f */
    public final ahkl f67390f;

    /* renamed from: g */
    public final Map f67391g = new C1223np();

    /* renamed from: h */
    public final ahkx f67392h;

    /* renamed from: i */
    public final bqgj f67393i = ahhr.m55806b();

    /* renamed from: j */
    public final bqgj f67394j = ahhr.m55806b();

    /* renamed from: k */
    public final bqgj f67395k = ahhr.m55806b();

    /* renamed from: m */
    private C1240of f67396m;

    /* renamed from: n */
    private C1240of f67397n;

    /* renamed from: o */
    private final Map f67398o = new C1223np();

    /* renamed from: p */
    private final Map f67399p = new C1223np();

    /* renamed from: q */
    private final Map f67400q = new C1223np();

    /* renamed from: r */
    private final Map f67401r = new C1223np();

    /* renamed from: s */
    private final int f67402s;

    /* renamed from: t */
    private final sfr f67403t;

    /* renamed from: u */
    private final AppOpsManager f67404u;

    /* renamed from: v */
    private AppOpsManager.OnOpChangedListener f67405v;

    /* renamed from: w */
    private boolean f67406w = true;

    /* renamed from: x */
    private final Set f67407x = new C1225nr();

    /* renamed from: y */
    private final Map f67408y = new C1223np();

    /* renamed from: z */
    private final Map f67409z = new C1223np();

    public ahkv(Context context, String str, String str2, Long l, ahkx ahkx, ahfx ahfx, IBinder.DeathRecipient deathRecipient) {
        ahkl ahkl = new ahkl(ahfx, str, str2);
        int i = Build.VERSION.SDK_INT;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        this.f67387c = context;
        this.f67388d = str;
        this.f67402s = Binder.getCallingUid();
        String a = spn.m35849a(this.f67387c, this.f67388d, "com.google.android.gms.nearby.connection.SERVICE_ID");
        this.f67386b = a == null ? "" : a;
        Context context2 = this.f67387c;
        String str3 = this.f67388d;
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = str3;
        clientContext.f30212b = spn.m35897i(context2, str3);
        this.f67403t = sfr.m35174a(context2, clientContext);
        this.f67389e = spn.m35869b();
        this.f67392h = ahkx;
        this.f67390f = ahkl;
        this.f67380A = deathRecipient;
        this.f67404u = appOpsManager;
        if (l != null) {
            this.f67381B = l.longValue();
        }
        if (this.f67389e && str2 == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkv", "<init>", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("As a zero party connections client, you should be using Nearby.getConnectionsClient(context, options) to set a zero party identifier");
        }
        if (!this.f67389e && str2 != null) {
            throw new IllegalArgumentException("You are not allowed to set a zero party identifier if you are not a zero party connections client");
        }
    }

    /* renamed from: A */
    private final synchronized String[] m55998A() {
        return (String[]) this.f67407x.toArray(new String[0]);
    }

    /* renamed from: a */
    public static int m55999a(bvif bvif) {
        bvif bvif2 = bvif.UNKNOWN_MEDIUM;
        switch (bvif.ordinal()) {
            case 2:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
                return 3;
            case 4:
            case 7:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static final String m56000a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "FAR" : "CLOSE" : "VERY_CLOSE";
    }

    /* renamed from: b */
    private static String m56003b(String[] strArr) {
        StringBuilder sb = new StringBuilder("[ ");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%s ", strArr[i]));
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    private final boolean m56006c(String str, int i) {
        ahks ahks = (ahks) this.f67401r.get(str);
        return (ahks == null || (ahks.f67370a & i) == 0) ? false : true;
    }

    /* renamed from: d */
    private final void m56007d(String str, int i) {
        ahks ahks = (ahks) this.f67401r.get(str);
        if (ahks != null) {
            ahks.f67370a = i | ahks.f67370a;
        }
    }

    /* renamed from: z */
    private final void m56010z() {
        AppOpsManager.OnOpChangedListener onOpChangedListener = this.f67405v;
        if (onOpChangedListener != null) {
            this.f67404u.stopWatchingMode(onOpChangedListener);
            this.f67405v = null;
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "z", 562, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("No longer listening to visibility changes for client %d", mo36706b());
        }
    }

    /* renamed from: a */
    public final synchronized void mo36688a(Strategy strategy) {
        this.f67382C = strategy;
    }

    /* renamed from: b */
    public final synchronized long mo36706b() {
        return this.f67381B;
    }

    /* renamed from: d */
    public final synchronized Strategy mo36713d() {
        return this.f67382C;
    }

    /* renamed from: e */
    public final synchronized void mo36715e() {
        if (m56008x()) {
            Iterator it = new C1225nr(this.f67408y.values()).iterator();
            while (it.hasNext()) {
                ahku ahku = (ahku) it.next();
                m56005b(ahku.mo36677a(), ahku.mo36678b(), ahku.mo36679c(), ahku.mo36680d());
            }
            this.f67408y.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo36717f() {
        mo36746v();
        mo36747w();
        for (aify aify : this.f67398o.values()) {
            m56004b(aify);
        }
        this.f67398o.clear();
        this.f67400q.clear();
        this.f67401r.clear();
        this.f67385F.clear();
        this.f67399p.clear();
        this.f67382C = null;
        this.f67384E = null;
        this.f67383D = null;
        this.f67391g.clear();
        this.f67392h.mo36753b(mo36711c());
    }

    /* renamed from: g */
    public final synchronized boolean mo36719g() {
        return this.f67396m != null;
    }

    /* renamed from: h */
    public final synchronized String mo36721h() {
        return mo36719g() ? (String) this.f67396m.f26798a : null;
    }

    /* renamed from: i */
    public final synchronized aify mo36723i() {
        C1240of ofVar;
        ofVar = this.f67396m;
        return ofVar != null ? (aify) ofVar.f26799b : null;
    }

    /* renamed from: j */
    public final synchronized AdvertisingOptions mo36725j() {
        return this.f67384E;
    }

    /* renamed from: k */
    public final synchronized void mo36727k(String str) {
        if (mo36722h(str)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "k", 1363, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("The remote endpoint %s cannot reject the connection because it has already responded.", str);
            return;
        }
        m56007d(str, 8);
        this.f67390f.mo36673e(str);
    }

    /* renamed from: k */
    public final synchronized boolean mo36728k() {
        return this.f67397n != null;
    }

    /* renamed from: l */
    public final synchronized String mo36729l() {
        return mo36728k() ? (String) this.f67397n.f26798a : null;
    }

    /* renamed from: m */
    public final synchronized DiscoveryOptions mo36731m() {
        return this.f67383D;
    }

    /* renamed from: n */
    public final synchronized List mo36733n(String str) {
        ahks ahks = (ahks) this.f67401r.get(str);
        if (ahks != null) {
            return ahks.f67372c;
        }
        return bngx.m109376e();
    }

    /* renamed from: o */
    public final synchronized void mo36735o(String str) {
        this.f67385F.remove(str);
    }

    /* renamed from: p */
    public final synchronized void mo36737p(String str) {
        if (!this.f67399p.containsKey(str)) {
            this.f67399p.put(str, new ahfk());
        }
    }

    /* renamed from: q */
    public final synchronized ahfk mo36739q(String str) {
        ahfk ahfk;
        ahfk = (ahfk) this.f67399p.get(str);
        if (ahfk == null) {
            ahfk = f67379l;
        }
        return ahfk;
    }

    /* renamed from: r */
    public final synchronized void mo36741r(String str) {
        ahfk ahfk = (ahfk) this.f67399p.remove(str);
        if (ahfk != null) {
            ahfk.mo36398a();
        }
    }

    /* renamed from: s */
    public final synchronized int mo36743s() {
        int i;
        i = 0;
        for (ahks ahks : this.f67401r.values()) {
            if (ahks.f67370a == 16 && !ahks.f67371b) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: t */
    public final synchronized int mo36744t() {
        int i;
        i = 0;
        for (ahks ahks : this.f67401r.values()) {
            if (ahks.f67370a == 16 && ahks.f67371b) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public final synchronized void mo36745u() {
        for (ahfk ahfk : this.f67399p.values()) {
            if (!ahfk.mo36401b()) {
                ahfk.mo36398a();
            }
        }
        this.f67399p.clear();
    }

    /* renamed from: v */
    public final synchronized void mo36746v() {
        if (mo36719g()) {
            m56004b((IInterface) this.f67396m.f26799b);
            this.f67396m = null;
            this.f67390f.mo36651a();
        }
    }

    /* renamed from: w */
    public final synchronized void mo36747w() {
        if (mo36728k()) {
            m56004b((IInterface) this.f67397n.f26799b);
            this.f67407x.clear();
            this.f67408y.clear();
            this.f67409z.clear();
            this.f67397n = null;
            this.f67390f.mo36664b();
            AppOpsManager.OnOpChangedListener onOpChangedListener = this.f67405v;
            if (onOpChangedListener != null) {
                this.f67404u.stopWatchingMode(onOpChangedListener);
                this.f67405v = null;
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkv", "z", 562, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68415a("No longer listening to visibility changes for client %d", mo36706b());
            }
        }
    }

    /* renamed from: x */
    private final boolean m56008x() {
        int i = Build.VERSION.SDK_INT;
        return this.f67404u.noteProxyOpNoThrow("android:fine_location", this.f67388d, this.f67402s) == 0;
    }

    /* renamed from: y */
    private final void m56009y() {
        int i = Build.VERSION.SDK_INT;
        if (this.f67405v == null) {
            ahkr ahkr = new ahkr(this);
            this.f67405v = ahkr;
            this.f67404u.startWatchingMode("android:fine_location", this.f67388d, 1, ahkr);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "y", 529, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Listening to visibility changes for client %d", mo36706b());
        }
    }

    /* renamed from: c */
    public final synchronized String mo36711c() {
        StringBuilder sb;
        String a = ahhg.m55779a();
        long j = this.f67381B;
        sb = new StringBuilder(String.valueOf(a).length() + 20);
        sb.append(a);
        sb.append(j);
        return sqd.m35972d(spn.m35862a(sb.toString(), "SHA-256")).substring(0, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return true;
     */
    /* renamed from: g */
    public final synchronized boolean mo36720g(String str) {
        if (!m56006c(str, 1) && !m56006c(str, 2)) {
            return false;
        }
    }

    /* renamed from: i */
    public final synchronized void mo36724i(String str) {
        if (mo36720g(str)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "i", 1331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("The local endpoint cannot reject the connection to remote endpoint %s because it has already responded.", str);
            return;
        }
        m56007d(str, 2);
        this.f67390f.mo36674f(str);
    }

    /* renamed from: j */
    public final synchronized void mo36726j(String str) {
        if (mo36722h(str)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "j", 1347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("The remote endpoint %s cannot accept the connection because it has already responded.", str);
            return;
        }
        m56007d(str, 4);
        this.f67390f.mo36671c(str);
    }

    /* renamed from: m */
    public final synchronized boolean mo36732m(String str) {
        return m56006c(str, 2) || m56006c(str, 8);
    }

    /* renamed from: o */
    public final synchronized String[] mo36736o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f67401r.entrySet()) {
            String str = (String) entry.getKey();
            if (((ahks) entry.getValue()).f67370a == 16) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: q */
    public final synchronized String[] mo36740q() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String[] p = mo36738p();
        for (String str : p) {
            if (mo36720g(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: a */
    private final void m56001a(IInterface iInterface) {
        try {
            iInterface.asBinder().linkToDeath(this.f67380A, 0);
        } catch (RemoteException e) {
            this.f67380A.binderDied();
            this.f67406w = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return false;
     */
    /* renamed from: d */
    public final synchronized boolean mo36714d(String str) {
        ahks ahks = (ahks) this.f67401r.get(str);
        if (ahks != null && Strategy.f80482c.equals(this.f67382C) && ahks.f67373d) {
            return true;
        }
    }

    /* renamed from: h */
    public final synchronized boolean mo36722h(String str) {
        return m56006c(str, 4) || m56006c(str, 8);
    }

    /* renamed from: l */
    public final synchronized boolean mo36730l(String str) {
        return m56006c(str, 1) && m56006c(str, 4);
    }

    /* renamed from: n */
    public final synchronized byte[] mo36734n() {
        return cfnv.m140801y() ? this.f67392h.mo36751a(mo36711c()) : null;
    }

    /* renamed from: p */
    public final synchronized String[] mo36738p() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f67401r.entrySet()) {
            String str = (String) entry.getKey();
            if (((ahks) entry.getValue()).f67370a != 16) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: r */
    public final synchronized String[] mo36742r() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String[] p = mo36738p();
        for (String str : p) {
            if (mo36722h(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: b */
    private final void m56004b(IInterface iInterface) {
        try {
            iInterface.asBinder().unlinkToDeath(this.f67380A, 0);
        } catch (NoSuchElementException e) {
        }
    }

    /* renamed from: a */
    private final void m56002a(RemoteException remoteException, String str) {
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
        bnsl.mo68437a(remoteException);
        bnsl.mo68432a("ahkv", "a", 1526, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Exception invoking client callback %s", str);
        if (remoteException instanceof DeadObjectException) {
            this.f67406w = false;
            bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
            bnsl2.mo68432a("ahkv", "a", 1530, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68415a("DeadObjectException for client %d, will not attempt to deliver future callbacks.", this.f67381B);
        }
    }

    /* renamed from: b */
    private final void m56005b(String str, String str2, byte[] bArr, bvif bvif) {
        if (!mo36705a(str2)) {
            return;
        }
        if (this.f67407x.add(str)) {
            if (this.f67406w) {
                try {
                    aiho aiho = new aiho();
                    aiho.f68899a.f80590a = str;
                    aiho.mo37492a(str2);
                    String str3 = new String(bArr, f67378a);
                    OnEndpointFoundParams onEndpointFoundParams = aiho.f68899a;
                    onEndpointFoundParams.f80592c = str3;
                    onEndpointFoundParams.f80594e = bArr;
                    ((aigh) this.f67397n.f26799b).mo36555a(onEndpointFoundParams);
                } catch (RemoteException e) {
                    m56002a(e, "onEndpointFound");
                }
            }
            this.f67390f.mo36660a(str2, bvif);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "b", 874, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68418a("ClientProxy(%d) reporting onEndpointFound(%s)", mo36706b(), str);
            return;
        }
        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
        bnsl2.mo68432a("ahkv", "b", 877, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68418a("ClientProxy(%d) ignoring onEndpointFound(%s) because we've already reported it", mo36706b(), str);
    }

    /* renamed from: c */
    public final synchronized byte[] mo36712c(String str) {
        return (byte[]) this.f67391g.get(str);
    }

    /* renamed from: f */
    public final synchronized boolean mo36718f(String str) {
        ahks ahks;
        ahks = (ahks) this.f67401r.get(str);
        return (ahks == null || ahks.f67370a == 16) ? false : true;
    }

    /* renamed from: e */
    public final synchronized boolean mo36716e(String str) {
        ahks ahks;
        ahks = (ahks) this.f67401r.get(str);
        return ahks != null && ahks.f67370a == 16;
    }

    /* renamed from: a */
    public final int mo36685a(String... strArr) {
        if (!ahkp.m55987a(this.f67387c, this.f67388d, this.f67389e)) {
            for (String str : strArr) {
                if (!butf.m120431a(this.f67403t, str)) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl.mo68432a("ahkv", "a", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("Missing permission: %s does not have required permission %s", this.f67388d, str);
                    if ("android.permission.BLUETOOTH".equals(str)) {
                        return 8030;
                    }
                    if ("android.permission.BLUETOOTH_ADMIN".equals(str)) {
                        return 8031;
                    }
                    if ("android.permission.ACCESS_WIFI_STATE".equals(str)) {
                        return 8032;
                    }
                    if ("android.permission.CHANGE_WIFI_STATE".equals(str)) {
                        return 8033;
                    }
                    if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                        return 8034;
                    }
                    if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
                        return 8036;
                    }
                    bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl2.mo68432a("ahkp", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Need to add corresponding status code for missing permission %s", str);
                    return 8;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final synchronized ConnectionOptions mo36707b(String str) {
        return (ConnectionOptions) this.f67385F.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo36686a() {
        ahhr.m55805a(this.f67393i, "PayloadManager.streamPayloadExecutor");
        ahhr.m55805a(this.f67394j, "PayloadManager.filePayloadExecutor");
        ahhr.m55805a(this.f67395k, "PayloadManager.bytesPayloadExecutor");
        this.f67390f.mo36670c();
    }

    /* renamed from: b */
    public final synchronized void mo36708b(String str, int i) {
        String str2;
        if (this.f67398o.containsKey(str)) {
            aify aify = (aify) this.f67398o.get(str);
            if (this.f67406w) {
                try {
                    OnBandwidthChangedParams onBandwidthChangedParams = new aiha().f68892a;
                    onBandwidthChangedParams.f80568a = str;
                    onBandwidthChangedParams.f80569b = i;
                    aify.mo36560a(onBandwidthChangedParams);
                } catch (RemoteException e) {
                    m56002a(e, "onBandwidthChanged");
                }
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "b", 1126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            Long valueOf = Long.valueOf(mo36706b());
            if (i != 1) {
                str2 = i != 2 ? i != 3 ? "UNKNOWN" : "HIGH" : "MEDIUM";
            } else {
                str2 = "LOW";
            }
            bnsl.mo68425a("ClientProxy(%d) reporting onBandwidthChanged(%s, %s)", valueOf, str, str2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36687a(long j) {
        if (j == -1) {
            if (j != this.f67381B) {
                this.f67392h.mo36753b(mo36711c());
                this.f67381B = j;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36689a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.connection.service.framework.ClientProxy"));
        printWriter.write(String.format(Locale.US, "  Client ID: %d\n", Long.valueOf(mo36706b())));
        printWriter.write(String.format("  Package Name: %s\n", this.f67390f.f67349a));
        printWriter.write(String.format("  Local Endpoint ID: %s\n", mo36711c()));
        printWriter.write(String.format("  Current Strategy: %s\n", mo36713d()));
        printWriter.write(String.format("  Advertising Service ID: %s\n", mo36721h()));
        printWriter.write(String.format("  Discovery Service ID: %s\n", mo36729l()));
        printWriter.write(String.format("  Discovered Endpoint IDs: %s\n", m56003b(m55998A())));
        printWriter.write(String.format("  Pending Connected Endpoint IDs: %s\n", m56003b(mo36738p())));
        printWriter.write(String.format("  Locally Accepted Endpoint IDs: %s\n", m56003b(mo36740q())));
        printWriter.write(String.format("  Remotely Accepted Endpoint IDs: %s\n", m56003b(mo36742r())));
        printWriter.write(String.format("  Connected Endpoint IDs: %s\n", m56003b(mo36736o())));
        printWriter.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo36709b(String str, String str2) {
        if (!this.f67388d.equals(str2)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "b", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring irrelevant visibility change for package %s", str2);
            return;
        }
        mo36715e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r2;
     */
    /* renamed from: b */
    public final synchronized boolean mo36710b(String str, bvif bvif) {
        boolean z;
        ConnectionOptions connectionOptions = (ConnectionOptions) this.f67385F.get(str);
        if (connectionOptions == null) {
            connectionOptions = new ahib().f67234a;
        }
        if (!connectionOptions.f80457a) {
            bvif bvif2 = bvif.UNKNOWN_MEDIUM;
            switch (bvif.ordinal()) {
                case 0:
                case 1:
                    z = false;
                    break;
                case 2:
                    z = connectionOptions.f80458b;
                    break;
                case 3:
                    z = connectionOptions.f80463g;
                    break;
                case 4:
                    z = connectionOptions.f80459c;
                    break;
                case 5:
                    z = connectionOptions.f80460d;
                    break;
                case 6:
                    z = connectionOptions.f80462f;
                    break;
                case 7:
                    z = connectionOptions.f80461e;
                    break;
                case 8:
                    z = connectionOptions.f80464h;
                    break;
                case 9:
                    z = connectionOptions.f80466j;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            return bvif.BLE.equals(bvif);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36690a(String str, int i) {
        if (this.f67406w) {
            if (!m56008x()) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkv", "a", 943, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68418a("ClientProxy(%d) ignores onEndpointDistanceChanged(%s) because the client does not have location permission currently.", mo36706b(), str);
            } else if (!this.f67407x.contains(str)) {
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
                bnsl2.mo68432a("ahkv", "a", 951, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68425a("ClientProxy(%d) ignoring onEndpointDistanceChanged(%s, %s), because this endpoint hasn't been reported as discovered", Long.valueOf(mo36706b()), str, m56000a(i));
            } else {
                if (this.f67409z.containsKey(str)) {
                    if (i == ((Integer) this.f67409z.get(str)).intValue()) {
                        bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68390d();
                        bnsl3.mo68432a("ahkv", "a", 960, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68425a("ClientProxy(%d) ignoring onEndpointDistanceChanged(%s, %s), because this distance has already been reported", Long.valueOf(mo36706b()), str, m56000a(i));
                    }
                }
                this.f67409z.put(str, Integer.valueOf(i));
                try {
                    OnEndpointDistanceChangedParams onEndpointDistanceChangedParams = new aihm().f68898a;
                    onEndpointDistanceChangedParams.f80588a = str;
                    onEndpointDistanceChangedParams.f80589b = i;
                    ((aigh) this.f67397n.f26799b).mo36554a(onEndpointDistanceChangedParams);
                    bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68390d();
                    bnsl4.mo68432a("ahkv", "a", 975, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68425a("ClientProxy(%d) reporting onEndpointDistanceChanged(%s, %s)", Long.valueOf(mo36706b()), str, m56000a(i));
                } catch (RemoteException e) {
                    m56002a(e, "onEndpointDistanceChanged");
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahkv.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      ahkv.a(android.os.RemoteException, java.lang.String):void
      ahkv.a(java.lang.String, int):void
      ahkv.a(java.lang.String, aigo):void
      ahkv.a(java.lang.String, android.bluetooth.BluetoothDevice):void
      ahkv.a(java.lang.String, bvif):void
      ahkv.a(java.lang.String, com.google.android.gms.nearby.connection.ConnectionOptions):void
      ahkv.a(java.lang.String, com.google.android.gms.nearby.connection.PayloadTransferUpdate):void
      ahkv.a(java.lang.String, com.google.android.gms.nearby.internal.connection.ParcelablePayload):void
      ahkv.a(java.lang.String, java.lang.String):void
      ahkv.a(java.lang.String, byte[]):void
      ahkv.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final synchronized void mo36691a(String str, int i, byte[] bArr) {
        if (mo36718f(str)) {
            aify aify = (aify) this.f67398o.get(str);
            if (this.f67406w) {
                try {
                    OnConnectionResultParams onConnectionResultParams = new aihi().f68896a;
                    onConnectionResultParams.f80584a = str;
                    onConnectionResultParams.f80585b = i;
                    onConnectionResultParams.f80586c = bArr;
                    aify.mo36562a(onConnectionResultParams);
                } catch (RemoteException e) {
                    m56002a(e, "onConnectionResult");
                }
            }
            if (i == 0) {
                ahks ahks = (ahks) this.f67401r.get(str);
                if (ahks != null) {
                    ahks.f67370a = 16;
                }
            } else {
                mo36702a(str, false);
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "a", 1095, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("ClientProxy(%d) reporting onConnectionResult(%s, %s)", Long.valueOf(mo36706b()), str, ahih.m55828a(i));
            return;
        }
        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
        bnsl2.mo68432a("ahkv", "a", 1099, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68425a("ClientProxy(%d) ignoring onConnectionResult(%s, %s) because this client has no pending connections to the endpoint", Long.valueOf(mo36706b()), str, ahih.m55828a(i));
    }

    /* renamed from: a */
    public final synchronized void mo36692a(String str, aigo aigo) {
        if (mo36720g(str)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "a", 1314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("The local endpoint cannot accept the connection to remote endpoint %s because it has already responded.", str);
            return;
        }
        m56007d(str, 1);
        this.f67400q.put(str, aigo);
        this.f67390f.mo36672d(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36693a(String str, BluetoothDevice bluetoothDevice) {
        if (mo36705a(str) && this.f67406w) {
            if (!m56008x()) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkv", "a", 891, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68418a("ClientProxy(%d) ignoring onEndpointFound(%s) because the client does not have location permission.", mo36706b(), bluetoothDevice);
                return;
            }
            try {
                aiho aiho = new aiho();
                aiho.f68899a.f80593d = bluetoothDevice;
                aiho.mo37492a(str);
                ((aigh) this.f67397n.f26799b).mo36555a(aiho.f68899a);
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
                bnsl2.mo68432a("ahkv", "a", 904, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68418a("ClientProxy(%d) reporting onEndpointFound(%s)", mo36706b(), bluetoothDevice);
            } catch (RemoteException e) {
                m56002a(e, "onEndpointFound");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36694a(String str, bvif bvif) {
        mo36708b(str, m55999a(bvif));
    }

    /* renamed from: a */
    public final synchronized void mo36695a(String str, ConnectionOptions connectionOptions) {
        this.f67385F.put(str, connectionOptions);
    }

    /* renamed from: a */
    public final synchronized void mo36696a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        String str2;
        String str3;
        if (mo36716e(str)) {
            aigo aigo = (aigo) this.f67400q.get(str);
            if (this.f67406w) {
                try {
                    OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = new aihu().f68902a;
                    onPayloadTransferUpdateParams.f80599a = str;
                    onPayloadTransferUpdateParams.f80600b = payloadTransferUpdate;
                    aigo.mo36567a(onPayloadTransferUpdateParams);
                } catch (RemoteException e) {
                    m56002a(e, "onPayloadTransferUpdate");
                }
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "a", 1455, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            Long valueOf = Long.valueOf(mo36706b());
            Long valueOf2 = Long.valueOf(payloadTransferUpdate.f80476a);
            int i = payloadTransferUpdate.f80477b;
            if (i == 1) {
                str3 = "SUCCESS";
            } else if (i == 2) {
                str3 = "FAILURE";
            } else if (i == 3) {
                str3 = "IN_PROGRESS";
            } else if (i != 4) {
                str2 = "UNKNOWN";
                bnsl.mo68426a("ClientProxy(%d) reporting onPayloadTransferUpdate(%s, %s, %s)", valueOf, str, valueOf2, str2);
            } else {
                str3 = "CANCELED";
            }
            str2 = str3;
            bnsl.mo68426a("ClientProxy(%d) reporting onPayloadTransferUpdate(%s, %s, %s)", valueOf, str, valueOf2, str2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36697a(String str, Strategy strategy, aify aify, List list, AdvertisingOptions advertisingOptions) {
        this.f67384E = advertisingOptions;
        if (mo36719g()) {
            m56004b((IInterface) this.f67396m.f26799b);
        }
        m56001a(aify);
        this.f67396m = new C1240of(str, aify);
        this.f67390f.mo36653a(strategy, list);
    }

    /* renamed from: a */
    public final synchronized void mo36698a(String str, Strategy strategy, aigh aigh, List list, DiscoveryOptions discoveryOptions) {
        this.f67383D = discoveryOptions;
        if (mo36728k()) {
            m56004b((IInterface) this.f67397n.f26799b);
        }
        m56001a(aigh);
        this.f67397n = new C1240of(str, aigh);
        this.f67390f.mo36665b(strategy, list);
        int i = Build.VERSION.SDK_INT;
        if (this.f67405v == null) {
            ahkr ahkr = new ahkr(this);
            this.f67405v = ahkr;
            this.f67404u.startWatchingMode("android:fine_location", this.f67388d, 1, ahkr);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "y", 529, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Listening to visibility changes for client %d", mo36706b());
        }
    }

    /* renamed from: a */
    public final synchronized void mo36699a(String str, ParcelablePayload parcelablePayload) {
        if (mo36716e(str)) {
            aigo aigo = (aigo) this.f67400q.get(str);
            if (this.f67406w) {
                try {
                    OnPayloadReceivedParams onPayloadReceivedParams = new aihs().f68901a;
                    onPayloadReceivedParams.f80596a = str;
                    onPayloadReceivedParams.f80597b = parcelablePayload;
                    aigo.mo36566a(onPayloadReceivedParams);
                } catch (RemoteException e) {
                    m56002a(e, "onPayloadReceived");
                }
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "a", 1433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("ClientProxy(%d) reporting onPayloadReceived(%s, %s)", Long.valueOf(mo36706b()), str, Long.valueOf(parcelablePayload.f80605a));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36700a(String str, String str2) {
        if (mo36705a(str)) {
            this.f67408y.remove(str2);
            if (this.f67407x.remove(str2)) {
                this.f67409z.remove(str2);
                if (this.f67406w) {
                    try {
                        OnEndpointLostParams onEndpointLostParams = new aihq().f68900a;
                        onEndpointLostParams.f80595a = str2;
                        ((aigh) this.f67397n.f26799b).mo36556a(onEndpointLostParams);
                    } catch (RemoteException e) {
                        m56002a(e, "onEndpointLost");
                    }
                }
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkv", "a", 926, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68418a("ClientProxy(%d) reporting onEndpointLost(%s)", mo36706b(), str2);
                return;
            }
            bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
            bnsl2.mo68432a("ahkv", "a", 929, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68418a("ClientProxy(%d) ignoring onEndpointLost(%s) because we haven't reported it", mo36706b(), str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36701a(String str, String str2, byte[] bArr, bvif bvif) {
        if (mo36705a(str2)) {
            if (!m56008x()) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkv", "a", 835, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68418a("ClientProxy(%d) delaying onEndpointFound(%s) because the client does not have location permission currently.", mo36706b(), str);
                Map map = this.f67408y;
                ahkt ahkt = new ahkt();
                if (str != null) {
                    ahkt.f67374a = str;
                    if (str2 != null) {
                        ahkt.f67375b = str2;
                        if (bArr != null) {
                            ahkt.f67376c = bArr;
                            if (bvif != null) {
                                ahkt.f67377d = bvif;
                                String str3 = "";
                                if (ahkt.f67374a == null) {
                                    str3 = " endpointId";
                                }
                                if (ahkt.f67375b == null) {
                                    str3 = str3.concat(" serviceId");
                                }
                                if (ahkt.f67376c == null) {
                                    str3 = String.valueOf(str3).concat(" endpointInfo");
                                }
                                if (ahkt.f67377d == null) {
                                    str3 = String.valueOf(str3).concat(" medium");
                                }
                                if (!str3.isEmpty()) {
                                    String valueOf = String.valueOf(str3);
                                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                } else {
                                    map.put(str, new ahkq(ahkt.f67374a, ahkt.f67375b, ahkt.f67376c, ahkt.f67377d));
                                }
                            } else {
                                throw new NullPointerException("Null medium");
                            }
                        } else {
                            throw new NullPointerException("Null endpointInfo");
                        }
                    } else {
                        throw new NullPointerException("Null serviceId");
                    }
                } else {
                    throw new NullPointerException("Null endpointId");
                }
            } else {
                m56005b(str, str2, bArr, bvif);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36702a(String str, boolean z) {
        this.f67401r.remove(str);
        this.f67400q.remove(str);
        mo36735o(str);
        ahfk ahfk = (ahfk) this.f67399p.remove(str);
        if (ahfk != null) {
            ahfk.mo36398a();
        }
        aify aify = (aify) this.f67398o.remove(str);
        if (aify != null) {
            if (z && this.f67406w) {
                try {
                    OnDisconnectedParams onDisconnectedParams = new aihk().f68897a;
                    onDisconnectedParams.f80587a = str;
                    aify.mo36563a(onDisconnectedParams);
                } catch (RemoteException e) {
                    m56002a(e, "onDisconnected");
                }
            }
            m56004b(aify);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36703a(String str, byte[] bArr) {
        if (cfnv.m140801y()) {
            this.f67391g.put(str, bArr);
            srn srn = ahkm.f67363a;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36704a(String str, byte[] bArr, byte[] bArr2, String str2, byte[] bArr3, boolean z, boolean z2, List list, aify aify, boolean z3) {
        this.f67401r.put(str, new ahks(z, list, z3));
        m56001a(aify);
        this.f67398o.put(str, aify);
        if (this.f67406w) {
            try {
                aihc aihc = new aihc();
                aihc.f68893a.f80570a = str;
                String str3 = new String(bArr, f67378a);
                OnConnectionInitiatedParams onConnectionInitiatedParams = aihc.f68893a;
                onConnectionInitiatedParams.f80571b = str3;
                onConnectionInitiatedParams.f80576g = bArr;
                onConnectionInitiatedParams.f80572c = str2;
                onConnectionInitiatedParams.f80575f = bArr3;
                onConnectionInitiatedParams.f80573d = z;
                onConnectionInitiatedParams.f80577h = z2;
                onConnectionInitiatedParams.f80574e = bArr2;
                ((aify) this.f67398o.get(str)).mo36561a(onConnectionInitiatedParams);
            } catch (RemoteException e) {
                m56002a(e, "onConnectionInitiated");
            }
            if (z) {
                mo36737p(str);
                this.f67390f.mo36666b(str);
            } else {
                this.f67390f.mo36654a(str);
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "a", 1059, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("ClientProxy(%d) reporting onConnectionInitiated(%s, %s)", Long.valueOf(mo36706b()), str, ahkm.m55981a(bArr));
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo36705a(String str) {
        return mo36728k() && str.equals(this.f67397n.f26798a);
    }
}
