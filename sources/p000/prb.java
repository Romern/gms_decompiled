package p000;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: prb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prb extends pta {

    /* renamed from: a */
    public static final String f40093a = ptw.f40214b;

    /* renamed from: b */
    public final HashMap f40094b = new HashMap();

    /* renamed from: c */
    public final pug f40095c;

    /* renamed from: d */
    public final pug f40096d;

    /* renamed from: e */
    public final String f40097e;

    /* renamed from: f */
    public piw f40098f;

    /* renamed from: h */
    private final pug f40099h;

    /* renamed from: i */
    private final pug f40100i;

    public prb(String str, String str2) {
        super(f40093a, "MultizoneControlChannel", str2);
        if (!TextUtils.isEmpty(str)) {
            this.f40097e = str;
            this.f40095c = new pug(60000);
            this.f40096d = new pug(60000);
            this.f40099h = new pug(60000);
            this.f40100i = new pug(60000);
            mo23627a(this.f40095c);
            mo23627a(this.f40096d);
            mo23627a(this.f40099h);
            mo23627a(this.f40100i);
            return;
        }
        throw new IllegalArgumentException("receiverDestinationId can't be empty");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final prc mo23573a(JSONObject jSONObject) {
        String string = jSONObject.getString("deviceId");
        String string2 = jSONObject.getString("name");
        int i = jSONObject.getInt("capabilities");
        JSONObject jSONObject2 = jSONObject.getJSONObject("volume");
        prc prc = new prc(string, string2, i, jSONObject2.getDouble("level"), jSONObject2.getBoolean("muted"));
        synchronized (this.f40094b) {
            this.f40094b.put(string, prc);
        }
        return prc;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo23345b(String str) {
        long j;
        JSONObject optJSONObject;
        int i;
        this.f40173s.mo23670a("Received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            j = jSONObject.getLong("requestId");
            try {
                String string = jSONObject.getString("type");
                if ("MULTIZONE_STATUS".equals(string)) {
                    JSONArray jSONArray = jSONObject.getJSONObject("status").getJSONArray("devices");
                    int length = jSONArray.length();
                    prc[] prcArr = new prc[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        prcArr[i2] = mo23573a((JSONObject) jSONArray.get(i2));
                    }
                    piw piw = this.f40098f;
                    if (piw != null) {
                        piw.mo23226a();
                    }
                    this.f40095c.mo23693a(j, 0, prcArr);
                } else if ("DEVICE_ADDED".equals(string)) {
                    mo23573a(jSONObject.getJSONObject("device"));
                    piw piw2 = this.f40098f;
                    if (piw2 != null) {
                        piw2.mo23226a();
                    }
                } else if ("DEVICE_UPDATED".equals(string)) {
                    prc a = mo23573a(jSONObject.getJSONObject("device"));
                    piw piw3 = this.f40098f;
                    if (piw3 != null) {
                        piw3.mo23226a();
                    }
                    this.f40096d.mo23693a(j, 0, a);
                    this.f40099h.mo23693a(j, 0, a);
                } else if ("DEVICE_REMOVED".equals(string)) {
                    String string2 = jSONObject.getString("deviceId");
                    synchronized (this.f40094b) {
                        this.f40094b.remove(string2);
                    }
                    piw piw4 = this.f40098f;
                    if (piw4 != null) {
                        piw4.mo23226a();
                    }
                    this.f40096d.mo23692a(j, 2600);
                    this.f40099h.mo23692a(j, 2600);
                } else if (!"PLAYBACK_SESSION_UPDATED".equals(string)) {
                    if ("INVALID_REQUEST".equals(string)) {
                        String string3 = jSONObject.getString("reason");
                        this.f40173s.mo23675c(String.format("Invalid request: %s", string3), new Object[0]);
                        char c = 65535;
                        switch (string3.hashCode()) {
                            case -1270298429:
                                if (string3.equals("INVALID_COMMAND")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 179862766:
                                if (string3.equals("INVALID_PARAMS")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1024294355:
                                if (string3.equals("NOT_GROUP")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1391909790:
                                if (string3.equals("NOT_LAUNCHED")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1819060245:
                                if (string3.equals("NOT_LEADER")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        if (c != 0) {
                            i = c != 1 ? c != 2 ? c != 3 ? c != 4 ? 2606 : 2605 : 2603 : 2604 : 2602;
                        } else {
                            i = 2601;
                        }
                        this.f40096d.mo23692a(j, i);
                        this.f40099h.mo23692a(j, i);
                        this.f40095c.mo23692a(j, i);
                    }
                } else if (this.f40098f != null && (optJSONObject = jSONObject.optJSONObject("sessionEndpoint")) != null) {
                    String string4 = optJSONObject.getString("deviceId");
                    String string5 = optJSONObject.getString("sessionId");
                    if (optJSONObject.has("ipAddress") && optJSONObject.has("port")) {
                        String optString = optJSONObject.optString("ipAddress");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                InetAddress.getByName(optString);
                            } catch (UnknownHostException e) {
                                this.f40173s.mo23677d("Failed to parse the IP address of new session endpoint: %s", optString);
                            }
                            optJSONObject.optInt("port");
                        }
                    }
                    pjb pjb = this.f40098f.f39256a.f39276E;
                    if (pjb != null) {
                        pjb.mo23233a(string4, string5);
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
                if (j == Long.MIN_VALUE) {
                    this.f40096d.mo23692a(j, 2608);
                    this.f40099h.mo23692a(j, 2608);
                    this.f40095c.mo23692a(j, 2608);
                }
            }
        } catch (JSONException e3) {
            e = e3;
            j = Long.MIN_VALUE;
            this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
            if (j == Long.MIN_VALUE) {
            }
        }
    }
}
