package p000;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwd {

    /* renamed from: a */
    public static final int f40437a = ((int) ccxs.f180178a.mo6606a().mo77000h());

    /* renamed from: j */
    private static pwd f40438j;

    /* renamed from: k */
    private static pwd f40439k;

    /* renamed from: l */
    private static pwd f40440l;

    /* renamed from: m */
    private static pwd f40441m;

    /* renamed from: n */
    private static pwd f40442n;

    /* renamed from: b */
    public int f40443b = 100;

    /* renamed from: c */
    public int f40444c = 500;

    /* renamed from: d */
    public boolean f40445d = true;

    /* renamed from: e */
    public boolean f40446e = true;

    /* renamed from: f */
    public int f40447f = 30;

    /* renamed from: g */
    public boolean f40448g = false;

    /* renamed from: h */
    public String f40449h = "castv2";

    /* renamed from: i */
    private final qav f40450i;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private pwd(String str, String str2, String str3) {
        qav qav = new qav("MirroringConfiguration", null);
        this.f40450i = qav;
        try {
            qav.mo23670a("%s config=[%s],overrides=[%s]", str, str2, str3);
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObject2 = new JSONObject(str3);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f40450i.mo23670a("%s overriding value %s=%s", str, next, jSONObject2.get(next));
                jSONObject.put(next, jSONObject2.get(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.f40450i.mo23670a("%s - %s=%s", str, next2, jSONObject.get(next2));
            }
            this.f40443b = jSONObject.getInt("targetDelay");
            this.f40445d = jSONObject.getBoolean("adaptivePlayoutDelayEnabled");
            this.f40446e = jSONObject.getBoolean("encryptionEnabled");
            String string = jSONObject.getString("errorRecoveryMode");
            this.f40449h = string;
            char c = 65535;
            switch (string.hashCode()) {
                case -1367558661:
                    if (string.equals("castv2")) {
                        c = 1;
                        break;
                    }
                    break;
                case -754697315:
                    if (string.equals("receiver_pli")) {
                        c = 3;
                        break;
                    }
                    break;
                case 571938579:
                    if (string.equals("periodic_idr")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1843120818:
                    if (string.equals("intra_mb_refresh")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                this.f40448g = false;
            } else {
                this.f40448g = true;
            }
            this.f40447f = jSONObject.optInt("keyFrameIntervalSeconds", 0);
            this.f40444c = jSONObject.optInt("maxTargetDelay", this.f40443b);
        } catch (JSONException e) {
            this.f40450i.mo23675c("%s Malformed config string; ignoring: %s, overrides: %s, error: %s", str, str2, str3, e);
        }
    }

    /* renamed from: a */
    public static pwd m31503a(int i) {
        if (i == 1) {
            if (f40438j == null) {
                f40438j = new pwd("INTERACTIVE_REALTIME", "{                                                     \"targetDelay\": 100,                           \"adaptivePlayoutDelayEnabled\": false,         \"encryptionEnabled\": false,                   \"errorRecoveryMode\": \"castv2\",    \"keyFrameIntervalSeconds\": 60             }", ccxs.f180178a.mo6606a().mo77003k());
            }
            return f40438j;
        } else if (i == 2) {
            if (f40439k == null) {
                f40439k = new pwd("INTERACTIVE_NON_REALTIME", "{                                                     \"targetDelay\": 300,                           \"adaptivePlayoutDelayEnabled\": false,         \"encryptionEnabled\": false,                   \"errorRecoveryMode\": \"castv2\",              \"keyFrameIntervalSeconds\": 60             }", ccxs.f180178a.mo6606a().mo77002j());
            }
            return f40439k;
        } else if (i == 4) {
            if (f40441m == null) {
                f40441m = new pwd("SYSTEM_MIRRORING", "{                                                     \"targetDelay\": 100,                           \"maxTargetDelay\": 500,                        \"adaptivePlayoutDelayEnabled\": true,          \"encryptionEnabled\": true,                    \"errorRecoveryMode\": \"castv2\",              \"keyFrameIntervalSeconds\": 60             }", ccxs.f180178a.mo6606a().mo77007o());
            }
            return f40441m;
        } else if (i != 5) {
            if (f40440l == null) {
                f40440l = new pwd("NON_INTERACTIVE", "{                                                     \"targetDelay\": 200,                           \"maxTargetDelay\": 500,                        \"adaptivePlayoutDelayEnabled\": true,          \"encryptionEnabled\": true,                    \"errorRecoveryMode\": \"castv2\",              \"keyFrameIntervalSeconds\": 60             }", ccxs.f180178a.mo6606a().mo77006n());
            }
            return f40440l;
        } else {
            if (f40442n == null) {
                f40442n = new pwd("AUDIO_ONLY", "{                                                     \"targetDelay\": 600,                           \"maxTargetDelay\": 1000,                       \"adaptivePlayoutDelayEnabled\": true,          \"encryptionEnabled\": true,                    \"errorRecoveryMode\": \"castv2\"           }", ccxs.f180178a.mo6606a().mo76998f());
            }
            return f40442n;
        }
    }

    /* renamed from: b */
    public static String m31504b(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? "CONFIGURATION_NON_INTERACTIVE" : "CONFIGURATION_AUDIO_ONLY" : "CONFIGURATION_SYSTEM_MIRRORING" : "CONFIGURATION_INTERACTIVE_NON_REALTIME" : "CONFIGURATION_INTERACTIVE_REALTIME";
    }
}
