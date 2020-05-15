package p000;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class pwe extends ptb {

    /* renamed from: b */
    public static final String f40451b = ptk.m31239c("com.google.cast.webrtc");

    /* renamed from: c */
    public static final int f40452c = ((int) ccxs.f180178a.mo6606a().mo77008p());

    /* renamed from: d */
    public static final int f40453d = ((int) ccxs.f180178a.mo6606a().mo77009q());

    /* renamed from: e */
    public static final int f40454e = ((int) ccxs.f180178a.mo6606a().mo77010r());

    /* renamed from: f */
    public static final int f40455f = ((int) ccxs.f180178a.mo6606a().mo77011s());

    /* renamed from: g */
    public static final int f40456g = ((int) ccxs.f180178a.mo6606a().mo77012t());

    /* renamed from: h */
    static final boolean f40457h = ccxs.m132044e();

    /* renamed from: a */
    private final CastDevice f40458a;

    /* renamed from: i */
    public final String f40459i;

    /* renamed from: j */
    public final int f40460j;

    /* renamed from: k */
    public final int f40461k;

    /* renamed from: l */
    public final pwd f40462l;

    /* renamed from: m */
    public long f40463m = 0;

    /* renamed from: n */
    public String f40464n;

    /* renamed from: o */
    public String f40465o;

    public pwe(CastDevice castDevice, int i, String str, String str2, pwd pwd) {
        super(f40451b, "MirroringControlChannel", str2);
        this.f40458a = castDevice;
        this.f40462l = pwd;
        this.f40459i = str;
        if (i == 0) {
            this.f40460j = 0;
            this.f40461k = 1;
        } else if (i != 1) {
            this.f40460j = -1;
            this.f40461k = 0;
        } else {
            this.f40460j = 0;
            this.f40461k = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23696a(String str) {
    }

    /* renamed from: b */
    public final String mo23762b() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb = new StringBuilder(32);
        for (int i = 0; i < 16; i++) {
            sb.append(Integer.toHexString((bArr[i] >> 4) & 15));
            sb.append(Integer.toHexString(bArr[i] & 15));
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23761a(JSONObject jSONObject, int i, int i2) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("resolutions");
            if (jSONArray.length() == 1) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                jSONObject2.put("width", i);
                jSONObject2.put("height", i2);
                return;
            }
            this.f40173s.mo23670a("Malformed video format string: %s", jSONObject);
        } catch (JSONException e) {
            this.f40173s.mo23670a("Malformed video format string: %s, error: %s", jSONObject, e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{org.json.JSONObject.put(java.lang.String, double):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, long):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, int):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, java.lang.Object):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ JSONException -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[Catch:{ JSONException -> 0x0341 }] */
    /* renamed from: b */
    public final void mo23345b(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str2 = str;
        this.f40173s.mo23670a("message received: %s", str2);
        try {
            JSONObject jSONObject5 = new JSONObject(str2);
            String string = jSONObject5.getString("type");
            int hashCode = string.hashCode();
            char c = 65535;
            if (hashCode != 390503715) {
                if (hashCode == 1935487934 && string.equals("ANSWER")) {
                    c = 0;
                    if (c == 0) {
                        this.f40173s.mo23670a("onAnswer", new Object[0]);
                        String string2 = jSONObject5.getString("result");
                        if (TextUtils.equals("ok", string2)) {
                            JSONObject jSONObject6 = new JSONObject(jSONObject5.getString("answer"));
                            long j = (long) jSONObject6.getInt("udpPort");
                            JSONArray jSONArray = jSONObject6.getJSONArray("sendIndexes");
                            JSONArray optJSONArray = jSONObject6.optJSONArray("ssrcs");
                            JSONArray optJSONArray2 = jSONObject6.optJSONArray("rtpExtensions");
                            int i = 0;
                            JSONObject jSONObject7 = null;
                            JSONObject jSONObject8 = null;
                            while (i < jSONArray.length()) {
                                int i2 = jSONArray.getInt(i);
                                int i3 = this.f40460j;
                                JSONArray jSONArray2 = jSONArray;
                                JSONObject jSONObject9 = jSONObject8;
                                if (i2 == i3) {
                                    jSONObject4 = new JSONObject("{                                            \"ssrc\": 1,                               \"rtp_payload_type\": 127,                 \"rtp_port\": 2346,                        \"remote_ssrc\": 2,                        \"remote_rtp_port\": 2344,                 \"codec_name\": \"aac_ld_adts\",           \"rtp_profile\": \"cast\",                 \"sample_rate\": 48000,                    \"time_base\": 48000,                      \"channels\": 2,                           \"store_time\": 100,                       \"bit_rate\": 128000,                      \"type\": \"audio_source\"        }                                          ");
                                    jSONObject4.put("index", i3);
                                    jSONObject4.put("store_time", this.f40462l.f40443b);
                                    if (this.f40462l.f40446e) {
                                        jSONObject4.put("aes-key", this.f40464n);
                                        jSONObject4.put("aes-iv-mask", this.f40465o);
                                    }
                                    jSONObject3 = jSONObject4;
                                    jSONObject8 = jSONObject9;
                                } else {
                                    int i4 = this.f40461k;
                                    if (i2 == i4) {
                                        jSONObject3 = jSONObject7;
                                        JSONObject jSONObject10 = new JSONObject("{                                            \"ssrc\": 11,                              \"rtp_payload_type\": 96,                  \"rtp_port\": 2346,                        \"remote_ssrc\": 12,                       \"remote_rtp_port\": 2344,                 \"codec_name\": \"h264\",                  \"max_bit_rate\": 6000000,                 \"max_frame_rate\": \"60000/1001\",          \"resolutions\": [                             {                                            \"height\": 720,                           \"width\": 1280                          }                                        ],                                       \"rtp_profile\": \"cast\",                 \"store_time\": 100,                       \"time_base\": 90000,                      \"type\": \"video_source\"        }                                          ");
                                        jSONObject10.put("index", i4);
                                        if (this.f40462l.f40446e) {
                                            jSONObject10.put("aes-key", this.f40464n);
                                            jSONObject10.put("aes-iv-mask", this.f40465o);
                                        }
                                        jSONObject10.put("max_bit_rate", f40452c);
                                        int i5 = Build.VERSION.SDK_INT;
                                        int i6 = f40454e;
                                        int i7 = f40453d;
                                        StringBuilder sb = new StringBuilder(23);
                                        sb.append(i6);
                                        sb.append("/");
                                        sb.append(i7);
                                        jSONObject10.put("max_frame_rate", sb.toString());
                                        mo23761a(jSONObject10, f40456g, f40455f);
                                        if (this.f40462l.f40449h.equals("intra_mb_refresh")) {
                                            jSONObject10.put("error_recovery_mode", "intra_mb_refresh");
                                        } else {
                                            jSONObject10.put("error_recovery_mode", "castv2");
                                        }
                                        jSONObject10.put("use_intra_macroblock_cyclic_mode", this.f40462l.f40448g);
                                        jSONObject10.put("key_frame_refresh_interval", this.f40462l.f40447f);
                                        jSONObject10.put("store_time", this.f40462l.f40443b);
                                        jSONObject4 = jSONObject10;
                                        jSONObject8 = jSONObject4;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(31);
                                        sb2.append("received bad index: ");
                                        sb2.append(i2);
                                        throw new JSONException(sb2.toString());
                                    }
                                }
                                jSONObject4.put("remote_rtp_port", j);
                                if (optJSONArray != null) {
                                    jSONObject4.put("remote_ssrc", optJSONArray.getLong(i));
                                }
                                if (optJSONArray2 != null) {
                                    jSONObject4.put("rtp_extensions", optJSONArray2.getJSONArray(i));
                                }
                                i++;
                                jSONArray = jSONArray2;
                                jSONObject7 = jSONObject3;
                            }
                            JSONObject jSONObject11 = jSONObject7;
                            JSONObject jSONObject12 = jSONObject8;
                            JSONArray optJSONArray3 = jSONObject6.optJSONArray("receiverRtcpEventLog");
                            if (optJSONArray3 != null) {
                                for (int i8 = 0; i8 < optJSONArray3.length(); i8++) {
                                    int i9 = optJSONArray3.getInt(i8);
                                    if (i9 != this.f40460j) {
                                        jSONObject2 = i9 == this.f40461k ? jSONObject12 : null;
                                    } else {
                                        jSONObject2 = jSONObject11;
                                    }
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("receiver_events", true);
                                    }
                                }
                            }
                            JSONArray jSONArray3 = new JSONArray();
                            if (jSONObject11 != null) {
                                jSONArray3.put(jSONObject11);
                            }
                            if (jSONObject12 != null) {
                                jSONArray3.put(jSONObject12);
                            }
                            JSONObject jSONObject13 = new JSONObject();
                            jSONObject13.put("sendFormats", jSONArray3);
                            jSONObject13.put("remoteFriendlyName", this.f40458a.f29716d);
                            jSONObject13.put("maxTargetDelay", this.f40462l.f40444c);
                            JSONObject jSONObject14 = new JSONObject();
                            try {
                                jSONObject14.put("maxBitrate", f40452c / 1000);
                                jSONObject14.put("minLatency", this.f40462l.f40443b);
                                int i10 = Build.VERSION.SDK_INT;
                                int i11 = f40456g;
                                int i12 = f40455f;
                                StringBuilder sb3 = new StringBuilder(23);
                                sb3.append(i11);
                                sb3.append("x");
                                sb3.append(i12);
                                jSONObject14.put("resolution", sb3.toString());
                                int i13 = f40454e;
                                int i14 = f40453d;
                                StringBuilder sb4 = new StringBuilder(23);
                                sb4.append(i13);
                                sb4.append("/");
                                sb4.append(i14);
                                jSONObject14.put("maxFramerate", sb4.toString());
                                jSONObject14.put("receiverProductName", this.f40458a.f29717e);
                                jSONObject14.put("receiverVersion", this.f40458a.f29718f);
                                jSONObject14.put("senderPlatform", "Android");
                                jSONObject14.put("senderBuild", Build.DISPLAY);
                                jSONObject14.put("senderModel", Build.MODEL);
                                jSONObject14.put("senderVersion", Build.VERSION.RELEASE);
                                jSONObject14.put("senderGmsCoreVersion", rfi.f42869b);
                                jSONObject = jSONObject14;
                            } catch (JSONException e) {
                                this.f40173s.mo23670a("Malformed config string; ignoring: %s", jSONObject14);
                                jSONObject = null;
                            }
                            jSONObject13.put("extraData", jSONObject);
                            if (!f40457h) {
                                String hostAddress = this.f40458a.f29715c.getHostAddress();
                                String valueOf = String.valueOf(jSONObject13);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(hostAddress).length() + 1 + String.valueOf(valueOf).length());
                                sb5.append(hostAddress);
                                sb5.append(":");
                                sb5.append(valueOf);
                                mo23696a(sb5.toString());
                                return;
                            }
                            JSONObject jSONObject15 = new JSONObject();
                            jSONObject15.put("ipAddress", this.f40458a.f29715c.getHostAddress());
                            jSONObject15.put("jsonConfig", jSONObject13);
                            mo23696a(jSONObject15.toString());
                            return;
                        } else if (!TextUtils.equals("error", string2)) {
                            String valueOf2 = String.valueOf(string2);
                            throw new JSONException(valueOf2.length() == 0 ? new String("received invalid result: ") : "received invalid result: ".concat(valueOf2));
                        } else {
                            String valueOf3 = String.valueOf(jSONObject5.getJSONObject("error").toString());
                            throw new JSONException(valueOf3.length() == 0 ? new String("received error: ") : "received error: ".concat(valueOf3));
                        }
                    } else if (c != 1) {
                        this.f40173s.mo23670a("Bad message!", new Object[0]);
                        return;
                    } else {
                        this.f40173s.mo23670a("onStatistics", new Object[0]);
                        return;
                    }
                }
            } else if (string.equals("STATISTICS")) {
                c = 1;
                if (c == 0) {
                }
            }
            if (c == 0) {
            }
        } catch (JSONException e2) {
            this.f40173s.mo23676c(e2, "Malformed message received; ignoring: %s", str);
        }
    }
}
