package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnf implements pkx {

    /* renamed from: a */
    public static final long f39789a = cczx.f180351a.mo6606a().mo77148g();

    /* renamed from: b */
    public final qav f39790b = new qav("TcpProberDeviceController");

    /* renamed from: c */
    public final pky f39791c;

    /* renamed from: d */
    public final int f39792d;

    /* renamed from: e */
    public final Set f39793e = new HashSet();

    /* renamed from: f */
    public final Set f39794f = new HashSet();

    /* renamed from: g */
    public final Set f39795g = new HashSet();

    /* renamed from: h */
    public final ScheduledExecutorService f39796h;

    /* renamed from: i */
    public final pne f39797i;

    /* renamed from: j */
    public String f39798j;

    /* renamed from: k */
    public ScheduledFuture f39799k;

    /* renamed from: l */
    public InetSocketAddress f39800l = null;

    /* renamed from: m */
    public CastDevice f39801m = null;

    /* renamed from: n */
    public bsib f39802n = null;

    /* renamed from: o */
    public String f39803o;

    /* renamed from: p */
    public boolean f39804p;

    /* renamed from: q */
    public boolean f39805q;

    /* renamed from: r */
    public bxtx f39806r;

    /* renamed from: s */
    public byte[] f39807s;

    /* renamed from: t */
    public bpfn f39808t;

    /* renamed from: u */
    private final String f39809u;

    /* renamed from: v */
    private final String f39810v;

    /* renamed from: w */
    private int f39811w = 0;

    /* renamed from: x */
    private boolean f39812x;

    public pnf(Context context, ScheduledExecutorService scheduledExecutorService, String str, int i, phy phy, pne pne) {
        this.f39810v = str;
        this.f39792d = i;
        this.f39796h = scheduledExecutorService;
        this.f39797i = pne;
        Locale locale = Locale.ROOT;
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(locale, "TcpProberDeviceController-%d", valueOf);
        this.f39790b.mo23669a(format);
        this.f39791c = pkj.m30682a(context, this, scheduledExecutorService, format, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES, false, false, phy);
        this.f39809u = String.format(Locale.ROOT, "%s-%d", this.f39810v, valueOf);
    }

    /* renamed from: a */
    private static bxtx m30888a() {
        pes pes = pes.f38974a;
        long currentTimeMillis = System.currentTimeMillis();
        ByteBuffer allocate = ByteBuffer.allocate(64);
        allocate.putLong(currentTimeMillis);
        allocate.flip();
        return bxtx.m123263b(allocate);
    }

    /* renamed from: b */
    private final void m30890b() {
        this.f39790b.mo23856a("finishProbing() with %s", this.f39800l);
        InetSocketAddress a = mo23474a(true);
        if (a != null) {
            HashSet hashSet = new HashSet(this.f39794f);
            HashSet hashSet2 = new HashSet(this.f39795g);
            String str = this.f39798j;
            CastDevice castDevice = this.f39801m;
            if (castDevice != null) {
                pne pne = this.f39797i;
                String str2 = this.f39803o;
                bpfn bpfn = this.f39808t;
                bsib bsib = this.f39802n;
                pmz pmz = pne.f39788a;
                int i = pmz.f39769i;
                pmz.f39771a.mo23859a("notifyProberSuccess Device(%s) supportedCriteria(%s) notSupportedCriteria(%s) statusText(%s)", castDevice, TextUtils.join(",", hashSet), TextUtils.join(",", hashSet2), str);
                pne.f39788a.f39775e.mo23126a(castDevice, bpfn, hashSet, hashSet2);
                pmz pmz2 = pne.f39788a;
                poj poj = pmz2.f39776f;
                sqv sqv = pmz2.f39777g;
                new pou(poj.f39918b, poj.f39919c, castDevice, str2, hashSet, hashSet2, str, System.currentTimeMillis(), bsib).mo23522a();
                return;
            }
            this.f39797i.mo23473a(a, 2015, pew.m30274a(2015), this.f39803o, this.f39808t);
        }
    }

    /* renamed from: c */
    public final void mo23249c(int i) {
        this.f39790b.mo23856a("onSocketDisconnected: error=%s", pkk.m30687c(i));
        this.f39811w = 0;
        boolean z = this.f39812x;
        this.f39812x = false;
        if (!z) {
            InetSocketAddress a = mo23474a(false);
            if (a == null) {
                this.f39790b.mo23861b("onSocketDisconnected. TcpProberDeviceController has already been deactivated");
                return;
            }
            this.f39797i.mo23473a(a, i, String.format(Locale.ROOT, "socket disconnected: error=%s", pkk.m30687c(i)), this.f39803o, this.f39808t);
            return;
        }
        this.f39800l = null;
        ScheduledExecutorService scheduledExecutorService = this.f39796h;
        pne pne = this.f39797i;
        pne.getClass();
        scheduledExecutorService.execute(new pnb(pne));
    }

    /* renamed from: l */
    public final void mo23258l() {
        String str;
        InetSocketAddress inetSocketAddress = this.f39800l;
        if (inetSocketAddress != null) {
            this.f39790b.mo23857a("onSocketConnected to %s:%d", inetSocketAddress.getAddress(), Integer.valueOf(this.f39800l.getPort()));
            if (m30889a(qau.f40832a, String.format(Locale.ROOT, "{\"type\":\"CONNECT\",\"package\":\"%s\",\"origin\":{}}", this.f39810v))) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : this.f39793e) {
                    if (!str2.startsWith("%")) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
                        sb.append("\"");
                        sb.append(str2);
                        sb.append("\"");
                        arrayList.add(sb.toString());
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (m30889a(qau.f40833b, String.format(Locale.ROOT, "{\"type\":\"GET_APP_AVAILABILITY\",\"appId\":[%s],\"requestId\":%d}", TextUtils.join(",", arrayList), 1))) {
                        this.f39811w++;
                    } else {
                        return;
                    }
                }
                if (m30889a(qau.f40833b, String.format(Locale.ROOT, "{\"type\":\"GET_STATUS\",\"requestId\":%d}", 2))) {
                    this.f39811w++;
                    String str3 = qau.f40836e;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", "eureka_info");
                        jSONObject.put("request_id", 3);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put("version");
                        jSONArray.put("name");
                        jSONArray.put(String.format("%s.%s", "device_info", "ssdp_udn"));
                        if (cczq.m132283b()) {
                            jSONArray.put(String.format("%s.%s", "device_info", "cloud_device_id"));
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("params", jSONArray);
                        jSONObject.put("data", jSONObject2);
                        str = jSONObject.toString();
                    } catch (JSONException e) {
                        str = null;
                    }
                    if (m30889a(str3, str)) {
                        this.f39811w++;
                        if (this.f39805q) {
                            this.f39807s = this.f39791c.mo23313h();
                            String str4 = pku.f39527a;
                            this.f39806r = m30888a();
                            bxvd da = blsk.f127596e.mo74144da();
                            bxvd da2 = blsf.f127574d.mo74144da();
                            bxtx bxtx = this.f39806r;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            blsf blsf = (blsf) da2.f164949b;
                            bxtx.getClass();
                            int i = 2 | blsf.f127576a;
                            blsf.f127576a = i;
                            blsf.f127577b = bxtx;
                            blsf.f127578c = 1;
                            blsf.f127576a = i | 4;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            blsk blsk = (blsk) da.f164949b;
                            blsf blsf2 = (blsf) da2.mo74062i();
                            blsf2.getClass();
                            blsk.f127599b = blsf2;
                            blsk.f127598a |= 1;
                            if (m30889a(str4, ((blsk) da.mo74062i()).mo73642k())) {
                                this.f39811w++;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f39790b.mo23675c("onSocketConnected called when device is null in controller!", new Object[0]);
    }

    /* renamed from: m */
    public final void mo23259m() {
    }

    /* renamed from: a */
    private final boolean m30889a(String str, Object obj) {
        this.f39790b.mo23670a("Sending message to %s(%d): (ns=%s, dest=%s) %s", this.f39800l.getAddress(), Integer.valueOf(this.f39800l.getPort()), str, "receiver-0", obj);
        bxvd da = blsx.f127637k.mo74144da();
        blsw blsw = blsw.CASTV2_1_0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blsx blsx = (blsx) da.f164949b;
        blsx.f127640b = blsw.f127636f;
        int i = blsx.f127639a | 1;
        blsx.f127639a = i;
        String str2 = this.f39809u;
        str2.getClass();
        int i2 = i | 2;
        blsx.f127639a = i2;
        blsx.f127641c = str2;
        "receiver-0".getClass();
        int i3 = i2 | 4;
        blsx.f127639a = i3;
        blsx.f127642d = "receiver-0";
        str.getClass();
        int i4 = i3 | 8;
        blsx.f127639a = i4;
        blsx.f127643e = str;
        if (obj instanceof String) {
            String str3 = (String) obj;
            if (TextUtils.isEmpty(str3)) {
                this.f39790b.mo23675c("Not sending an empty message", new Object[0]);
                return false;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx2 = (blsx) da.f164949b;
            blsx2.f127644f = 0;
            int i5 = blsx2.f127639a | 16;
            blsx2.f127639a = i5;
            str3.getClass();
            blsx2.f127639a = i5 | 32;
            blsx2.f127645g = str3;
        } else if (obj instanceof byte[]) {
            blsx.f127644f = 1;
            blsx.f127639a = i4 | 16;
            bxtx a = bxtx.m123261a((byte[]) obj);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsx blsx3 = (blsx) da.f164949b;
            a.getClass();
            blsx3.f127639a |= 64;
            blsx3.f127646h = a;
        } else {
            this.f39790b.mo23675c("invalid message type", new Object[0]);
            return false;
        }
        try {
            this.f39791c.mo23302a((blsx) da.mo74062i());
            return true;
        } catch (IOException | IllegalStateException e) {
            this.f39790b.mo23677d("Failed to send message.", e);
            InetSocketAddress a2 = mo23474a(false);
            if (a2 == null) {
                this.f39790b.mo23861b("sendMessage. Controller is not active.");
            } else {
                this.f39797i.mo23473a(a2, 2, String.format(Locale.ROOT, "sendMessage failed: %s", e.toString()), this.f39803o, this.f39808t);
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void mo23245b(int i) {
        this.f39790b.mo23677d("onSocketConnectionFailed. Error: %d", Integer.valueOf(i));
        InetSocketAddress a = mo23474a(false);
        if (a == null) {
            this.f39790b.mo23861b("onSocketConnectionFailed. Controller has already been deactivated");
            return;
        }
        pne pne = this.f39797i;
        String valueOf = String.valueOf(pkk.m30687c(i));
        pne.mo23473a(a, i, valueOf.length() == 0 ? new String("connection failed: error=") : "connection failed: error=".concat(valueOf), this.f39803o, this.f39808t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InetSocketAddress mo23474a(boolean z) {
        this.f39790b.mo23861b("deactivate is called");
        InetSocketAddress inetSocketAddress = this.f39800l;
        ScheduledFuture scheduledFuture = this.f39799k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (inetSocketAddress != null) {
            int g = this.f39791c.mo23312g();
            if (g == 0) {
                this.f39800l = null;
                ScheduledExecutorService scheduledExecutorService = this.f39796h;
                pne pne = this.f39797i;
                pne.getClass();
                scheduledExecutorService.execute(new pna(pne));
                return inetSocketAddress;
            } else if (g == 1 || g == 2) {
                this.f39812x = z;
                this.f39791c.mo23306b();
                return inetSocketAddress;
            }
        }
        return inetSocketAddress;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d8 A[Catch:{ JSONException -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d9 A[Catch:{ JSONException -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0346 A[Catch:{ JSONException -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0347 A[Catch:{ JSONException -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x035b A[Catch:{ JSONException -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo23238a(blsx blsx) {
        int i;
        int i2;
        CastDevice castDevice;
        WebImage a;
        pig pig;
        ArrayList arrayList;
        List list;
        List list2;
        ArrayList arrayList2;
        String str;
        String str2;
        blsx blsx2 = blsx;
        if (this.f39800l != null) {
            String str3 = blsx2.f127643e;
            int a2 = blsu.m107537a(blsx2.f127644f);
            ArrayList arrayList3 = null;
            r10 = null;
            r10 = null;
            r10 = null;
            r10 = null;
            r10 = null;
            r10 = null;
            bsib bsib = null;
            String str4 = null;
            ArrayList arrayList4 = null;
            if (a2 != 0 && a2 == 2) {
                bxtx bxtx = blsx2.f127646h;
                if (pku.f39527a.equals(str3)) {
                    try {
                        blsk blsk = (blsk) bxvk.m124016a(blsk.f127596e, bxtx.mo73780k(), bxus.m123744c());
                        if ((blsk.f127598a & 2) == 0) {
                            this.f39790b.mo23677d("No response in auth message", new Object[0]);
                        } else {
                            blsj blsj = blsk.f127600c;
                            if (blsj == null) {
                                blsj = blsj.f127585i;
                            }
                            bxtx bxtx2 = this.f39806r;
                            if (bxtx2 != null && pku.m30744a(blsj, bxtx2.mo73780k(), this.f39807s, null, this.f39790b) == 0) {
                                String a3 = pku.m30745a(blsj);
                                if (a3 == null) {
                                    this.f39790b.mo23677d("Invalid algorithm", new Object[0]);
                                } else if (this.f39807s == null) {
                                    this.f39790b.mo23677d("The peer certificate is absent", new Object[0]);
                                } else {
                                    int i3 = blsj.f127587a;
                                    if ((i3 & 8) == 0) {
                                        this.f39790b.mo23677d("The response has null nonce", new Object[0]);
                                    } else if ((i3 & 1) != 0) {
                                        bxvd da = bsib.f144654f.mo74144da();
                                        bxtx bxtx3 = blsj.f127592f;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bsib bsib2 = (bsib) da.f164949b;
                                        bxtx3.getClass();
                                        bsib2.f144656a |= 1;
                                        bsib2.f144657b = bxtx3;
                                        bxtx a4 = bxtx.m123261a(this.f39807s);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bsib bsib3 = (bsib) da.f164949b;
                                        a4.getClass();
                                        int i4 = bsib3.f144656a | 2;
                                        bsib3.f144656a = i4;
                                        bsib3.f144658c = a4;
                                        bxtx bxtx4 = blsj.f127588b;
                                        bxtx4.getClass();
                                        int i5 = i4 | 8;
                                        bsib3.f144656a = i5;
                                        bsib3.f144660e = bxtx4;
                                        a3.getClass();
                                        bsib3.f144656a = i5 | 4;
                                        bsib3.f144659d = a3;
                                        bsib = (bsib) da.mo74062i();
                                    } else {
                                        this.f39790b.mo23677d("The response has null signature", new Object[0]);
                                    }
                                }
                            } else {
                                this.f39790b.mo23677d("Response is invalid", new Object[0]);
                            }
                        }
                    } catch (bxwf e) {
                        this.f39790b.mo23677d("Received an unparseable protobuf (ignored): %s", e.getMessage());
                    }
                    if (bsib == null) {
                        this.f39790b.mo23677d("Failed to parse RAT from response, generating placeholder RAT", new Object[0]);
                        bxvd da2 = bsib.f144654f.mo74144da();
                        bxtx a5 = m30888a();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsib bsib4 = (bsib) da2.f164949b;
                        a5.getClass();
                        bsib4.f144656a |= 1;
                        bsib4.f144657b = a5;
                        bsib = (bsib) da2.mo74062i();
                    }
                    this.f39802n = bsib;
                    this.f39811w--;
                }
                if (this.f39811w == 0) {
                    m30890b();
                    return;
                }
                return;
            }
            String str5 = blsx2.f127645g;
            this.f39790b.mo23857a("onSocketMessageReceived from %s: %s", this.f39809u, str5);
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (jSONObject.has("requestId")) {
                    long j = jSONObject.getLong("requestId");
                    if (j == 1) {
                        this.f39811w--;
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("availability");
                            Iterator<String> keys = jSONObject2.keys();
                            arrayList = null;
                            while (keys.hasNext()) {
                                try {
                                    String next = keys.next();
                                    if ("APP_AVAILABLE".equals(jSONObject2.optString(next))) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(next);
                                    } else if ("APP_UNAVAILABLE".equals(jSONObject2.optString(next))) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(next);
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList;
                                    this.f39790b.mo23675c("No app availabilities found in receiver response: %s", e.getMessage());
                                    arrayList = arrayList3;
                                    arrayList4 = arrayList2;
                                    C1240of ofVar = new C1240of(arrayList, arrayList4);
                                    list = (List) ofVar.f26798a;
                                    if (list != null) {
                                    }
                                    list2 = (List) ofVar.f26799b;
                                    this.f39795g.addAll(list2);
                                    if (this.f39811w == 0) {
                                    }
                                }
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            arrayList2 = null;
                            this.f39790b.mo23675c("No app availabilities found in receiver response: %s", e.getMessage());
                            arrayList = arrayList3;
                            arrayList4 = arrayList2;
                            C1240of ofVar2 = new C1240of(arrayList, arrayList4);
                            list = (List) ofVar2.f26798a;
                            if (list != null) {
                            }
                            list2 = (List) ofVar2.f26799b;
                            this.f39795g.addAll(list2);
                            if (this.f39811w == 0) {
                            }
                        }
                        C1240of ofVar22 = new C1240of(arrayList, arrayList4);
                        list = (List) ofVar22.f26798a;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                this.f39794f.addAll(list);
                            }
                        }
                        list2 = (List) ofVar22.f26799b;
                        if (list2 != null && !list2.isEmpty()) {
                            this.f39795g.addAll(list2);
                        }
                        if (this.f39811w == 0) {
                        }
                    } else if (j == 2) {
                        this.f39811w--;
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("status");
                            if (jSONObject3.has("applications")) {
                                JSONArray jSONArray = jSONObject3.getJSONArray("applications");
                                if (jSONArray.length() > 0) {
                                    try {
                                        pig = new pig(jSONArray.getJSONObject(0));
                                    } catch (JSONException e4) {
                                        this.f39790b.mo23670a("Error extracting the application info.", new Object[0]);
                                        pig = null;
                                    }
                                    this.f39798j = null;
                                    if (pig == null) {
                                        if (!qay.m31791c(pig.f39211a)) {
                                            this.f39798j = pig.f39217g;
                                        }
                                    }
                                    if (!this.f39793e.isEmpty()) {
                                        HashSet hashSet = new HashSet();
                                        for (String str6 : this.f39793e) {
                                            if (str6.startsWith("%")) {
                                                hashSet.add(str6);
                                            }
                                        }
                                        if (!hashSet.isEmpty()) {
                                            if (pig != null) {
                                                for (String str7 : pig.mo23168a()) {
                                                    String valueOf = String.valueOf(str7);
                                                    String str8 = valueOf.length() == 0 ? new String("%") : "%".concat(valueOf);
                                                    if (hashSet.remove(str8)) {
                                                        this.f39794f.add(str8);
                                                    }
                                                }
                                            }
                                            this.f39795g.addAll(hashSet);
                                        }
                                    }
                                    if (this.f39811w == 0) {
                                    }
                                }
                            }
                            pig = null;
                        } catch (JSONException e5) {
                            this.f39790b.mo23677d("Unable to extract the application info: %s", e5.getMessage());
                            pig = null;
                        }
                        this.f39798j = null;
                        if (pig == null) {
                        }
                        if (!this.f39793e.isEmpty()) {
                        }
                        if (this.f39811w == 0) {
                        }
                    } else {
                        if (j != 3) {
                            qav qav = this.f39790b;
                            String valueOf2 = String.valueOf(jSONObject);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                            sb.append("Unrecognized request ID: %d");
                            sb.append(valueOf2);
                            qav.mo23677d(sb.toString(), Long.valueOf(j));
                        } else if (!this.f39804p) {
                            this.f39790b.mo23675c("Unexpected message received for a device that doesnot support the discovery namespace: %s", jSONObject);
                        } else if (!qau.f40839h.equals(str3)) {
                            this.f39790b.mo23675c("Unexpected namespace received. Expected: %s Actual: %s", qau.f40839h, str3);
                        } else {
                            String optString = jSONObject.optString("type", "");
                            if ("DEVICE_INFO".equals(optString)) {
                                this.f39811w--;
                                this.f39790b.mo23856a("Discovery info: %s", jSONObject);
                                try {
                                    String optString2 = jSONObject.optString("deviceCapabilities");
                                    String string = jSONObject.getString("deviceIconUrl");
                                    String string2 = jSONObject.getString("deviceId");
                                    String string3 = jSONObject.getString("deviceModel");
                                    String string4 = jSONObject.getString("receiverMetricsId");
                                    String string5 = jSONObject.getString("friendlyName");
                                    String string6 = jSONObject.getString("wifiProximityId");
                                    try {
                                        i = jSONObject.getInt("controlNotifications");
                                    } catch (JSONException e6) {
                                        this.f39790b.mo23675c("Failed to parse RCN enabled status from discovery info message.", new Object[0]);
                                        i = 0;
                                    }
                                    if (!TextUtils.isEmpty(string2)) {
                                        pet pet = new pet(string2, this.f39800l.getAddress());
                                        try {
                                            i2 = Integer.parseInt(optString2);
                                        } catch (NumberFormatException e7) {
                                            i2 = 0;
                                        }
                                        pet.f38999g = i2;
                                        ArrayList arrayList5 = new ArrayList();
                                        if (!TextUtils.isEmpty(string) && (a = ptk.m31229a(string, this.f39800l.getAddress())) != null) {
                                            arrayList5.add(a);
                                            pet.f38998f = arrayList5;
                                        }
                                        if (!TextUtils.isEmpty(string3)) {
                                            pet.f38995c = string3;
                                        }
                                        if (!TextUtils.isEmpty(string4)) {
                                            pet.f39002j = string4;
                                        }
                                        if (!TextUtils.isEmpty(string5)) {
                                            pet.f38994b = string5;
                                        }
                                        if (!TextUtils.isEmpty(string6)) {
                                            pet.f39004l = string6;
                                        }
                                        if (i == 0) {
                                            pet.f39003k = (int) cday.m132439c();
                                        } else {
                                            pet.f39003k = i;
                                        }
                                        pet.f38997e = this.f39800l.getPort();
                                        if (cczq.m132283b() && (castDevice = this.f39801m) != null) {
                                            pet.f39006n = castDevice.f29727o;
                                        }
                                        this.f39801m = pet.mo22985a();
                                    } else {
                                        this.f39790b.mo23677d("Discovery info response doesn't have device ID.", new Object[0]);
                                    }
                                } catch (JSONException e8) {
                                    this.f39790b.mo23675c("Error while parsing Discovery message: %s", e8.getMessage());
                                }
                            } else if ("INVALID_REQUEST".equals(optString)) {
                                this.f39811w--;
                                this.f39790b.mo23856a("Invalid request from discovery namespace. Reason: %s", jSONObject.getString("reason"));
                            } else {
                                this.f39790b.mo23856a("Unrecognized type: %s", optString);
                            }
                        }
                        if (this.f39811w == 0) {
                        }
                    }
                } else if (jSONObject.has("request_id")) {
                    long j2 = jSONObject.getLong("request_id");
                    if (j2 != 3) {
                        this.f39790b.mo23673b("Unknown request id: %d", Long.valueOf(j2));
                        return;
                    }
                    if (!"eureka_info".equals(jSONObject.optString("type", ""))) {
                        this.f39790b.mo23673b("Unrecognized request ID: %d", Long.valueOf(j2));
                    } else {
                        this.f39811w--;
                        try {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                            int i6 = jSONObject4.getInt("version");
                            String string7 = jSONObject4.getString("name");
                            if (i6 >= 5) {
                                this.f39804p = true;
                            }
                            if (i6 >= 7) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject("device_info");
                                str = jSONObject5.getString("ssdp_udn");
                                str2 = cczq.m132283b() ? jSONObject5.optString("cloud_device_id") : null;
                            } else {
                                str = jSONObject4.getString("ssdp_udn");
                                str2 = null;
                            }
                            pet a6 = CastDevice.m22256a(str.replace("-", ""), this.f39800l.getAddress());
                            a6.f38997e = this.f39800l.getPort();
                            a6.f38994b = string7;
                            a6.f39006n = str2;
                            this.f39801m = a6.mo22985a();
                        } catch (JSONException e9) {
                            this.f39790b.mo23675c("Error while parsing Eureka info message: %s", e9.getMessage());
                        }
                        if (this.f39804p) {
                            String str9 = qau.f40839h;
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("requestId", 3);
                                jSONObject6.put("type", "GET_DEVICE_INFO");
                                str4 = jSONObject6.toString();
                            } catch (JSONException e10) {
                            }
                            if (m30889a(str9, str4)) {
                                this.f39811w++;
                            }
                        }
                    }
                    if (this.f39811w == 0) {
                        m30890b();
                    }
                } else {
                    this.f39790b.mo23677d("Message doesn't contain a request id", new Object[0]);
                }
            } catch (JSONException e11) {
                this.f39790b.mo23677d("Failed to parse response: %s", e11.getMessage());
            }
        } else {
            this.f39790b.mo23675c("The controller is already deactivated. Ignoring the message.", new Object[0]);
        }
    }
}
