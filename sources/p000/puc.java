package p000;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RequestItem;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: puc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class puc extends pta {

    /* renamed from: a */
    public static final String f40227a = ptk.m31239c("com.google.cast.media");

    /* renamed from: A */
    final pug f40228A = new pug(86400000);

    /* renamed from: B */
    final pug f40229B = new pug(86400000);

    /* renamed from: b */
    public long f40230b;

    /* renamed from: c */
    public MediaStatus f40231c;

    /* renamed from: d */
    public Long f40232d;

    /* renamed from: e */
    public ptz f40233e;

    /* renamed from: f */
    public final pug f40234f = new pug(86400000);

    /* renamed from: h */
    final pug f40235h = new pug(86400000);

    /* renamed from: i */
    final pug f40236i = new pug(86400000);

    /* renamed from: j */
    public final pug f40237j = new pug(86400000);

    /* renamed from: k */
    public final pug f40238k = new pug(10000);

    /* renamed from: l */
    final pug f40239l = new pug(86400000);

    /* renamed from: m */
    final pug f40240m = new pug(86400000);

    /* renamed from: n */
    final pug f40241n = new pug(86400000);

    /* renamed from: o */
    final pug f40242o = new pug(86400000);

    /* renamed from: p */
    final pug f40243p = new pug(86400000);

    /* renamed from: q */
    final pug f40244q = new pug(86400000);

    /* renamed from: r */
    final pug f40245r = new pug(86400000);

    /* renamed from: v */
    final pug f40246v = new pug(86400000);

    /* renamed from: w */
    final pug f40247w = new pug(86400000);

    /* renamed from: x */
    public final pug f40248x = new pug(86400000);

    /* renamed from: y */
    public final pug f40249y = new pug(86400000);

    /* renamed from: z */
    final pug f40250z = new pug(86400000);

    public puc(String str) {
        super(f40227a, "MediaControlChannel", str);
        mo23627a(this.f40234f);
        mo23627a(this.f40235h);
        mo23627a(this.f40236i);
        mo23627a(this.f40237j);
        mo23627a(this.f40238k);
        mo23627a(this.f40239l);
        mo23627a(this.f40240m);
        mo23627a(this.f40241n);
        mo23627a(this.f40242o);
        mo23627a(this.f40243p);
        mo23627a(this.f40244q);
        mo23627a(this.f40245r);
        mo23627a(this.f40246v);
        mo23627a(this.f40247w);
        mo23627a(this.f40248x);
        mo23627a(this.f40250z);
        mo23627a(this.f40250z);
        mo23627a(this.f40228A);
        mo23627a(this.f40229B);
        m31350k();
    }

    /* renamed from: a */
    public static String m31343a(String str, List list, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", j);
            jSONObject.put("type", "PRECACHE");
            if (str != null) {
                jSONObject.put("precacheData", str);
            }
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < list.size(); i++) {
                    RequestItem requestItem = (RequestItem) list.get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", requestItem.f29841a);
                    jSONObject2.put("protocolType", requestItem.f29842b);
                    jSONObject2.put("initialTime", requestItem.f29843c);
                    jSONObject2.put("hlsSegmentFormat", requestItem.f29844d);
                    jSONArray.put(i, jSONObject2);
                }
                jSONObject.put("requestItems", jSONArray);
            }
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    /* renamed from: g */
    private final void m31346g() {
        ptz ptz = this.f40233e;
        if (ptz != null) {
            ptz.mo23599a();
        }
    }

    /* renamed from: h */
    private final void m31347h() {
        ptz ptz = this.f40233e;
        if (ptz != null) {
            ptz.mo23603b();
        }
    }

    /* renamed from: i */
    private final void m31348i() {
        ptz ptz = this.f40233e;
        if (ptz != null) {
            ptz.mo23605c();
        }
    }

    /* renamed from: j */
    private final void m31349j() {
        ptz ptz = this.f40233e;
        if (ptz != null) {
            ptz.mo23607d();
        }
    }

    /* renamed from: k */
    private final void m31350k() {
        this.f40230b = 0;
        this.f40231c = null;
        for (pug pug : this.f40172g) {
            pug.mo23688a(2002);
        }
    }

    /* renamed from: b */
    public final long mo23683b(pue pue, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = mo23633c();
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", mo23686f());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo23630a(jSONObject2.toString(), c, (String) null);
        this.f40236i.mo23689a(c, pue);
        return c;
    }

    /* renamed from: d */
    public final long mo23684d() {
        MediaInfo e = mo23685e();
        if (e != null) {
            return e.f29750e;
        }
        return 0;
    }

    /* renamed from: e */
    public final MediaInfo mo23685e() {
        MediaStatus mediaStatus = this.f40231c;
        if (mediaStatus != null) {
            return mediaStatus.f29809a;
        }
        return null;
    }

    /* renamed from: f */
    public final long mo23686f() {
        MediaStatus mediaStatus = this.f40231c;
        if (mediaStatus != null) {
            return mediaStatus.f29810b;
        }
        throw new pua();
    }

    /* renamed from: l */
    public final void mo23629l() {
        mo23628b();
        m31350k();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0221 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0222 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x023e A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024b A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0258 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0262 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0263 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x026a A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x026b A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0272 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0273 A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027a A[Catch:{ JSONException -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x028c A[Catch:{ JSONException -> 0x02ac }] */
    /* renamed from: b */
    public final void mo23345b(String str) {
        char c;
        int i;
        int i2;
        int[] a;
        this.f40173s.mo23670a("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            char c2 = 65535;
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() <= 0) {
                        this.f40231c = null;
                        m31346g();
                        m31347h();
                        m31348i();
                        m31349j();
                    } else {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean a2 = this.f40234f.mo23691a(optLong);
                        if (this.f40239l.mo23690a()) {
                            if (!this.f40239l.mo23691a(optLong)) {
                                i = 1;
                                if (a2) {
                                    MediaStatus mediaStatus = this.f40231c;
                                    if (mediaStatus != null) {
                                        i2 = mediaStatus.mo17560a(jSONObject2, i);
                                        if ((i2 & 1) != 0) {
                                            this.f40230b = SystemClock.elapsedRealtime();
                                            m31346g();
                                        }
                                        if ((i2 & 2) != 0) {
                                            this.f40230b = SystemClock.elapsedRealtime();
                                            m31346g();
                                        }
                                        if ((i2 & 128) != 0) {
                                            this.f40230b = SystemClock.elapsedRealtime();
                                        }
                                        if ((i2 & 4) != 0) {
                                            m31347h();
                                        }
                                        if ((i2 & 8) != 0) {
                                            m31348i();
                                        }
                                        if ((i2 & 16) != 0) {
                                            m31349j();
                                        }
                                        if ((i2 & 32) != 0) {
                                            this.f40230b = SystemClock.elapsedRealtime();
                                            ptz ptz = this.f40233e;
                                            if (ptz != null) {
                                                ptz.mo23608e();
                                            }
                                        }
                                        if ((i2 & 64) != 0) {
                                            this.f40230b = SystemClock.elapsedRealtime();
                                            m31346g();
                                        }
                                    }
                                }
                                this.f40231c = new MediaStatus(jSONObject2);
                                this.f40230b = SystemClock.elapsedRealtime();
                                i2 = 127;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                            }
                        }
                        i = (!this.f40240m.mo23690a() || this.f40240m.mo23691a(optLong)) ? 0 : 1;
                        if (a2) {
                        }
                        this.f40231c = new MediaStatus(jSONObject2);
                        this.f40230b = SystemClock.elapsedRealtime();
                        i2 = 127;
                        if ((i2 & 1) != 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if ((i2 & 128) != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                    }
                    for (pug pug : this.f40172g) {
                        pug.mo23692a(optLong, 0);
                    }
                    return;
                case 1:
                    this.f40173s.mo23675c("received unexpected error: Invalid Player State.", new Object[0]);
                    for (pug pug2 : this.f40172g) {
                        pug2.mo23693a(optLong, 2100, m31344a(jSONObject));
                    }
                    return;
                case 2:
                    this.f40234f.mo23693a(optLong, 2100, m31344a(jSONObject));
                    return;
                case 3:
                    this.f40234f.mo23693a(optLong, 2101, m31344a(jSONObject));
                    return;
                case 4:
                    this.f40173s.mo23675c("received unexpected error: Invalid Request.", new Object[0]);
                    for (pug pug3 : this.f40172g) {
                        pug3.mo23693a(optLong, 2100, m31344a(jSONObject));
                    }
                    return;
                case 5:
                    for (pug pug4 : this.f40172g) {
                        pug4.mo23693a(optLong, 2100, m31344a(jSONObject));
                    }
                    if (this.f40233e != null) {
                        MediaError.m22269a(jSONObject);
                        this.f40233e.mo23609f();
                        return;
                    }
                    return;
                case 6:
                    this.f40248x.mo23692a(optLong, 0);
                    if (this.f40233e != null && (a = m31345a(jSONObject.getJSONArray("itemIds"))) != null) {
                        this.f40233e.mo23600a(a);
                        return;
                    }
                    return;
                case 7:
                    this.f40250z.mo23692a(optLong, 0);
                    if (this.f40233e != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] a3 = m31345a(jSONObject.getJSONArray("itemIds"));
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (a3 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                this.f40233e.mo23601a(a3, optInt);
                                return;
                            } else if (c2 == 1) {
                                this.f40233e.mo23604b(a3);
                                return;
                            } else if (c2 == 2) {
                                this.f40233e.mo23606c(a3);
                                return;
                            } else if (c2 == 3) {
                                this.f40233e.mo23600a(a3);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 8:
                    this.f40249y.mo23692a(optLong, 0);
                    if (this.f40233e != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray2.length()];
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            mediaQueueItemArr[i3] = new pgl(jSONArray2.getJSONObject(i3)).mo23047a();
                        }
                        this.f40233e.mo23602a(mediaQueueItemArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e) {
            this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
        this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
    }

    /* renamed from: a */
    private static pub m31344a(JSONObject jSONObject) {
        MediaError a = MediaError.m22269a(jSONObject);
        pub pub = new pub();
        pub.f40225a = jSONObject.optJSONObject("customData");
        pub.f40226b = a;
        return pub;
    }

    /* renamed from: a */
    private static final int[] m31345a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    public final long mo23680a(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f40230b;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        double d2 = (double) elapsedRealtime;
        Double.isNaN(d2);
        long j3 = j + ((long) (d2 * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0;
    }

    /* renamed from: a */
    public final long mo23681a(pue pue) {
        JSONObject jSONObject = new JSONObject();
        long c = mo23633c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.f40231c;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.f29810b);
            }
        } catch (JSONException e) {
        }
        mo23630a(jSONObject.toString(), c, (String) null);
        this.f40241n.mo23689a(c, pue);
        return c;
    }

    /* renamed from: a */
    public final long mo23682a(pue pue, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = mo23633c();
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", mo23686f());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo23630a(jSONObject2.toString(), c, (String) null);
        this.f40235h.mo23689a(c, pue);
        return c;
    }
}
