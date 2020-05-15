package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pld extends ptb {

    /* renamed from: a */
    final boolean f39556a = cdbb.f180413a.mo6606a().mo77193a();

    /* renamed from: b */
    public final String f39557b;

    /* renamed from: c */
    public String f39558c;

    /* renamed from: d */
    public final pug f39559d;

    /* renamed from: e */
    public final pla f39560e;

    /* renamed from: f */
    public final pug f39561f;

    /* renamed from: g */
    public final pue f39562g;

    /* renamed from: h */
    public final pug f39563h;

    /* renamed from: i */
    public final pug f39564i;

    /* renamed from: j */
    public final pug f39565j;

    /* renamed from: k */
    public double f39566k;

    /* renamed from: l */
    public boolean f39567l;

    /* renamed from: m */
    public double f39568m = Double.NaN;

    /* renamed from: n */
    public boolean f39569n;

    /* renamed from: o */
    public int f39570o;

    /* renamed from: p */
    public int f39571p;

    /* renamed from: q */
    public EqualizerSettings f39572q;

    /* renamed from: r */
    final /* synthetic */ pjc f39573r;

    /* renamed from: v */
    private final int f39574v = ((int) cdbe.f180416a.mo6606a().mo77195a());

    /* renamed from: w */
    private final int f39575w = ((int) cdbe.f180416a.mo6606a().mo77196b());

    /* renamed from: x */
    private final pue f39576x;

    /* renamed from: y */
    private final boolean f39577y = ccxv.m132089b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pld(pjc pjc, String str, String str2) {
        super(qau.f40833b, "ReceiverControlChannel", str2);
        this.f39573r = pjc;
        if (!TextUtils.isEmpty(str)) {
            this.f39570o = -1;
            this.f39571p = -1;
            this.f39557b = str;
            this.f39559d = new pug((long) this.f39574v);
            this.f39560e = new pla(this);
            this.f39561f = new pug((long) this.f39575w);
            this.f39562g = new plc(this);
            this.f39563h = new pug((long) this.f39575w);
            this.f39576x = new plb(this);
            this.f39564i = new pug((long) this.f39575w);
            this.f39565j = new pug((long) this.f39575w);
            return;
        }
        throw new IllegalArgumentException("receiverDestinationId can't be empty");
    }

    /* renamed from: a */
    public final void mo23353a() {
        if (!this.f39563h.mo23690a()) {
            long c = mo23633c();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("requestId", c);
                jSONObject.put("type", "GET_STATUS");
            } catch (JSONException e) {
            }
            mo23632b(jSONObject.toString(), c, this.f39557b);
            this.f39563h.mo23689a(c, this.f39576x);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(pig, boolean, long):void
     arg types: [pig, int, int]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(int, boolean, bpes):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(pig, boolean, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(pig, boolean, long):void
     arg types: [pig, int, long]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(int, boolean, bpes):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(pig, boolean, long):void */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x033c, code lost:
        if (r6 != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0195, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0346 A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0347 A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0378 A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x039c A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e3 A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0153 A[Catch:{ JSONException -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0169 A[Catch:{ JSONException -> 0x040c }] */
    /* renamed from: b */
    public final void mo23345b(String str) {
        pig pig;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        boolean z3;
        EqualizerSettings equalizerSettings;
        int i;
        int i2;
        String str4 = str;
        this.f40173s.mo23670a("Received: %s", str4);
        try {
            JSONObject jSONObject = new JSONObject(str4);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            char c = 65535;
            if ("RECEIVER_STATUS".equals(string)) {
                DeviceStatus deviceStatus = new DeviceStatus(Double.NaN, false, -1, null, -1, null, Double.NaN);
                JSONObject jSONObject2 = jSONObject.getJSONObject("status");
                if (jSONObject2.has("applications")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("applications");
                    if (jSONArray.length() > 0) {
                        try {
                            pig = new pig(jSONArray.getJSONObject(0));
                        } catch (JSONException e) {
                            this.f40173s.mo23670a("Error extracting the application info.", new Object[0]);
                            pig = null;
                        }
                        this.f39570o = -1;
                        if (jSONObject2.has("isActiveInput")) {
                            this.f39570o = jSONObject2.getBoolean("isActiveInput") ? 1 : 0;
                        }
                        deviceStatus.f29890c = this.f39570o;
                        this.f39571p = -1;
                        if (jSONObject2.has("isStandBy")) {
                            this.f39571p = jSONObject2.getBoolean("isStandBy") ? 1 : 0;
                        }
                        deviceStatus.f29892e = this.f39571p;
                        int i3 = 2005;
                        if (this.f39559d.mo23692a(optLong, 0)) {
                            boolean a = this.f39563h.mo23692a(optLong, 0);
                            String str5 = this.f39558c;
                            if (str5 == null) {
                                z = false;
                            } else {
                                if (pig != null) {
                                    if (pig.f39215e.equals(str5)) {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                            boolean a2 = this.f39561f.mo23692a(optLong, 0);
                            if (z) {
                                this.f40173s.mo23670a("application has stopped", new Object[0]);
                            }
                            this.f39561f.mo23688a(0);
                            pjc pjc = this.f39573r;
                            AtomicLong atomicLong = pjc.f39271d;
                            if (!pjc.f39326o) {
                                i = 2005;
                            } else {
                                i = 0;
                            }
                            pjc.f39326o = false;
                            pjc.f39273B = null;
                            pjc.f39274C = null;
                            pjc.mo23234a(i);
                            synchronized (pug.f40252d) {
                                this.f39564i.mo23692a(optLong, 0);
                                this.f39565j.mo23692a(optLong, 0);
                                z2 = this.f39564i.mo23690a() || this.f39565j.mo23690a();
                            }
                            this.f40173s.mo23670a("requestId = %d, ignoreVolume = %b", Long.valueOf(optLong), Boolean.valueOf(z2));
                            if (!this.f39569n) {
                                this.f40173s.mo23670a("first status received, so not ignoring volume change", new Object[0]);
                                this.f39569n = true;
                                z2 = false;
                            }
                            if (jSONObject2.has("volume")) {
                                if (!z2) {
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                                    this.f39566k = jSONObject3.getDouble("level");
                                    this.f39567l = jSONObject3.getBoolean("muted");
                                    if (this.f39556a) {
                                        double optDouble = jSONObject3.optDouble("stepInterval");
                                        this.f39568m = optDouble;
                                        deviceStatus.f29894g = optDouble;
                                    }
                                }
                            }
                            deviceStatus.f29888a = this.f39566k;
                            deviceStatus.f29889b = this.f39567l;
                            if (jSONObject2.has("userEq")) {
                                if (this.f39577y) {
                                    JSONObject jSONObject4 = jSONObject2.getJSONObject("userEq");
                                    if (jSONObject4 == null || !jSONObject4.has("low_shelf") || !jSONObject4.has("high_shelf")) {
                                        equalizerSettings = null;
                                    } else {
                                        try {
                                            equalizerSettings = new EqualizerSettings(EqualizerBandSettings.m22265a(jSONObject4.getJSONObject("low_shelf")), EqualizerBandSettings.m22265a(jSONObject4.getJSONObject("high_shelf")));
                                        } catch (JSONException e2) {
                                            equalizerSettings = null;
                                        }
                                    }
                                    this.f39572q = equalizerSettings;
                                    deviceStatus.f29893f = equalizerSettings;
                                }
                            }
                            this.f40173s.mo23670a("onStatusReceived", new Object[0]);
                            pjc pjc2 = this.f39573r;
                            AtomicLong atomicLong2 = pjc.f39271d;
                            pjc2.f39316e.mo23670a("processReceiverStatus: applicationInfo=%s", pig);
                            if (pig != null) {
                                str2 = pig.f39217g;
                            } else {
                                str2 = null;
                            }
                            pjc2.f39325n = str2;
                            if (pjc2.mo23211b()) {
                                if (!pjc2.f39333v) {
                                    pim pim = pjc2.f39336y;
                                    if (pim != null) {
                                        pim.f39236e.mo23186a(pjc2.f39325n, deviceStatus.f29888a, deviceStatus.f29889b);
                                    }
                                } else {
                                    if (pig != null) {
                                        deviceStatus.f29891d = pjc.m30496a(pig);
                                    }
                                    pim pim2 = pjc2.f39336y;
                                    if (pim2 != null) {
                                        pim2.f39236e.mo23185a(deviceStatus);
                                    }
                                    if (pjc2.f39336y != null) {
                                        ApplicationStatus applicationStatus = new ApplicationStatus(null);
                                        applicationStatus.f29887a = pjc2.f39325n;
                                        pjc2.f39336y.f39236e.mo23184a(applicationStatus);
                                    }
                                }
                            }
                            if (a && (str3 = pjc2.f39329r) != null) {
                                String str6 = pjc2.f39330s;
                                if (pig != null) {
                                    if (TextUtils.isEmpty(str6)) {
                                        boolean c2 = ccyn.m132219c();
                                        boolean equals = "ANDROID_TV".equals(pig.f39213c);
                                        boolean equals2 = pjc2.f39329r.equals("");
                                        if (!equals || !pjc2.f39278G) {
                                            if (equals2) {
                                                if (c2) {
                                                    z3 = pjc2.mo23253d(pig.f39213c);
                                                }
                                                if (TextUtils.isEmpty(pjc2.f39330s)) {
                                                }
                                                pjc2.f39325n = pig.f39217g;
                                                if (!TextUtils.isEmpty(pig.f39215e)) {
                                                }
                                                pjc2.f39329r = null;
                                                pjc2.f39330s = null;
                                                pjc2.f39327p = false;
                                                pjc2.f39328q = null;
                                                return;
                                            } else if (str3.equals(pig.f39211a)) {
                                                if (c2) {
                                                    z3 = pjc2.mo23253d(pig.f39213c);
                                                }
                                                if (TextUtils.isEmpty(pjc2.f39330s)) {
                                                    if (!pjc2.f39330s.equals(pig.f39216f)) {
                                                        String str7 = pjc2.f39329r;
                                                        String str8 = pjc2.f39330s;
                                                        pjc2.f39329r = null;
                                                        pjc2.f39330s = null;
                                                        if (pjc2.f39327p) {
                                                            pjc2.f39327p = false;
                                                            LaunchOptions launchOptions = pjc2.f39328q;
                                                            pjc2.f39328q = null;
                                                            pjc2.mo23246b(str7, launchOptions);
                                                            return;
                                                        }
                                                        pjc2.mo23235a(2005, str7, str8);
                                                        return;
                                                    }
                                                }
                                                pjc2.f39325n = pig.f39217g;
                                                if (!TextUtils.isEmpty(pig.f39215e)) {
                                                    if (!"".equals(pjc2.f39329r)) {
                                                        i3 = 2004;
                                                    }
                                                    pjc2.f39316e.mo23856a("listener.onApplicationConnectionFailed(%s)", pew.m30274a(i3));
                                                    pim pim3 = pjc2.f39336y;
                                                    if (pim3 != null) {
                                                        pim3.f39236e.mo23196d(i3);
                                                    }
                                                } else {
                                                    pjc2.mo23243a(pig, false, -1L);
                                                }
                                                pjc2.f39329r = null;
                                                pjc2.f39330s = null;
                                                pjc2.f39327p = false;
                                                pjc2.f39328q = null;
                                                return;
                                            } else if (c2) {
                                                if (str3.equals(pig.f39212b)) {
                                                    z3 = pjc2.mo23253d(pig.f39213c);
                                                } else {
                                                    pjc2.f39316e.mo23861b("Active app has a different app ID");
                                                }
                                            }
                                        }
                                    } else {
                                        z3 = str6.equals(pig.f39216f);
                                    }
                                }
                                pjc2.f39316e.mo23856a("application to join (%s) is NOT available!", pjc2.f39329r);
                                String str9 = pjc2.f39329r;
                                String str10 = pjc2.f39330s;
                                pjc2.f39329r = null;
                                pjc2.f39330s = null;
                                pjc2.f39273B = null;
                                pjc2.f39274C = null;
                                if (pjc2.f39327p) {
                                    pjc2.f39327p = false;
                                    LaunchOptions launchOptions2 = pjc2.f39328q;
                                    pjc2.f39328q = null;
                                    pjc2.mo23246b(str9, launchOptions2);
                                    return;
                                } else if (!pjc2.f39272A.mo23355a()) {
                                    pjc2.mo23235a(2005, str9, str10);
                                    return;
                                } else {
                                    pjc2.mo23252d(false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (pig != null) {
                            this.f40173s.mo23670a("application launch has completed", new Object[0]);
                            pjc pjc3 = this.f39573r;
                            AtomicLong atomicLong3 = pjc.f39271d;
                            if (!(pjc3.f39324m == null || pjc3.f39323l == null)) {
                                pjc3.f39316e.mo23861b("an app was running before; notifying that it's gone now");
                                this.f39573r.mo23234a(2005);
                            }
                            this.f39573r.mo23243a(pig, true, optLong);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                pig = null;
                this.f39570o = -1;
                if (jSONObject2.has("isActiveInput")) {
                }
                deviceStatus.f29890c = this.f39570o;
                this.f39571p = -1;
                if (jSONObject2.has("isStandBy")) {
                }
                deviceStatus.f29892e = this.f39571p;
                int i32 = 2005;
                if (this.f39559d.mo23692a(optLong, 0)) {
                }
            } else if ("LAUNCH_ERROR".equals(string)) {
                String string2 = jSONObject.getString("reason");
                switch (string2.hashCode()) {
                    case -1419836456:
                        if (string2.equals("SYSTEM_ERROR")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1065753681:
                        if (string2.equals("BAD_PARAMETER")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1031784143:
                        if (string2.equals("CANCELLED")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -405405700:
                        if (string2.equals("NOT_ALLOWED")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1023286998:
                        if (string2.equals("NOT_FOUND")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1808679442:
                        if (string2.equals("CAST_INIT_TIMEOUT")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    i2 = c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? 2806 : 2805 : 2803 : 2004 : 2804 : 2802;
                } else {
                    i2 = 2801;
                }
                this.f39559d.mo23692a(optLong, i2);
            } else if ("INVALID_REQUEST".equals(string)) {
                String string3 = jSONObject.getString("reason");
                int i4 = 2001;
                if (!"INVALID_COMMAND".equals(string3) && !"INVALID_PARAMS".equals(string3) && !"DUPLICATE_REQUEST_ID".equals(string3)) {
                    if (!"INVALID_SESSION_ID".equals(string3)) {
                        i4 = 13;
                    }
                }
                this.f39559d.mo23692a(optLong, i4);
                this.f39561f.mo23692a(optLong, i4);
                this.f39563h.mo23692a(optLong, i4);
            }
        } catch (JSONException e3) {
            this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e3.getMessage(), str4);
        }
    }

    /* renamed from: a */
    public final void mo23354a(String str) {
        this.f40173s.mo23670a("current transport id (in control channel) is now: %s", str);
        this.f39558c = str;
    }
}
