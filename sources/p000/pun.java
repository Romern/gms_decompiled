package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast_mirroring.JGCastLogger;
import com.google.android.gms.cast_mirroring.JGCastService;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pun extends pvq {

    /* renamed from: a */
    public static final boolean f40267a = ccxs.f180178a.mo6606a().mo77004l();

    /* renamed from: b */
    public static final long f40268b = ccxs.f180178a.mo6606a().mo77005m();

    /* renamed from: c */
    public static final boolean f40269c = cdaa.f180362a.mo6606a().mo77159h();

    /* renamed from: d */
    public static final int f40270d = ((int) cdaa.f180362a.mo6606a().mo77157f());

    /* renamed from: e */
    static final boolean f40271e = ccxs.m132044e();

    /* renamed from: f */
    public final int f40272f;

    /* renamed from: g */
    public JGCastService f40273g;

    /* renamed from: h */
    public JGCastLogger f40274h;

    /* renamed from: i */
    public ScheduledFuture f40275i;

    /* renamed from: j */
    public Intent f40276j;

    /* renamed from: k */
    private final int f40277k;

    /* renamed from: l */
    private final pwd f40278l;

    /* renamed from: m */
    private pwe f40279m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r12.mo17496a(1) != false) goto L_0x001f;
     */
    public pun(Context context, CastDevice castDevice, ScheduledExecutorService scheduledExecutorService, pvv pvv, pmx pmx, int i, String str, pwd pwd, boolean z) {
        super(context, castDevice, scheduledExecutorService, pvv, pmx, true, false);
        int i2 = castDevice.mo17496a(4) ? 1 : i2;
        i2 = !z ? 2 : 0;
        this.f40277k = i2;
        this.f40278l = pwd;
        this.f40391z = str;
        this.f40272f = i;
    }

    /* renamed from: a */
    public final void mo23697a() {
        pfx pfx = new pfx();
        pfx.mo23027a(true);
        mo23739a(pfx.f39073a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23698a(int i, int i2, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23701a(boolean z);

    /* renamed from: b */
    public final void mo23702b() {
        mo23704b(true);
        super.mo23702b();
    }

    /* renamed from: d */
    public final void mo23705d(int i) {
        mo23704b(true);
        super.mo23705d(i);
    }

    /* renamed from: a */
    public final void mo23699a(String str, int i) {
        this.f40379n.mo23673b("onSessionStartFailed: %s %s", str, pew.m30274a(i));
    }

    /* renamed from: b */
    public final void mo23703b(String str, int i) {
        boolean z = false;
        this.f40379n.mo23673b("onSessionEnded: sessionId=%s, castStatusCode=%s", str, pew.m30274a(i));
        if (i != 0) {
            z = true;
        }
        mo23704b(z);
        mo941c();
    }

    /* renamed from: a */
    public final void mo23700a(String str, ApplicationMetadata applicationMetadata) {
        long j;
        JSONObject jSONObject;
        this.f40379n.mo23856a("onSessionStarted: %s", str);
        this.f40279m = new pul(this, this.f40381p, this.f40277k, this.f40388w.mo23261o(), this.f40385t, this.f40278l);
        try {
            this.f40388w.mo23244a(this.f40279m);
            pwe pwe = this.f40279m;
            JSONObject jSONObject2 = new JSONObject();
            pwe.f40464n = pwe.mo23762b();
            pwe.f40465o = pwe.mo23762b();
            long j2 = pwe.f40463m;
            pwe.f40463m = 1 + j2;
            try {
                jSONObject2.put("sessionId", pwe.f40459i);
                jSONObject2.put("seqNum", j2);
                jSONObject2.put("type", "OFFER");
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (pwe.f40460j != -1) {
                        JSONObject jSONObject3 = new JSONObject("{                                        \"type\": \"audio_source\",            \"codecName\": \"aac\",                \"rtpProfile\": \"cast\",              \"rtpPayloadType\": 127,               \"ssrc\": 1,                           \"storeTime\": 100,                    \"targetDelay\": 100,                  \"bitRate\": 128000,                   \"sampleRate\": 48000,                 \"timeBase\": \"1/48000\",             \"channels\": 2,                       \"rtpExtensions\": [                   ],                                     \"receiverRtcpEventLog\": true    }                                      ");
                        jSONObject3.put("index", 0);
                        jSONObject3.put("storeTime", pwe.f40462l.f40443b);
                        jSONObject3.put("targetDelay", pwe.f40462l.f40443b);
                        if (pwe.f40462l.f40446e) {
                            jSONObject3.put("aesKey", pwe.f40464n);
                            jSONObject3.put("aesIvMask", pwe.f40465o);
                        }
                        if (pwe.f40462l.f40445d) {
                            jSONObject3.getJSONArray("rtpExtensions").put("adaptive_playout_delay");
                        }
                        jSONObject3.put("errorRecoveryMode", pwe.f40462l.f40449h);
                        jSONArray.put(0, jSONObject3);
                    }
                    int i = pwe.f40461k;
                    if (i != -1) {
                        j = j2;
                        try {
                            JSONObject jSONObject4 = new JSONObject("{                                            \"type\": \"video_source\",                \"codecName\": \"h264\",                   \"rtpProfile\": \"cast\",                  \"rtpPayloadType\": 96,                    \"ssrc\": 11,                              \"storeTime\": 100,                        \"targetDelay\": 100,                      \"maxFrameRate\": \"60000/1001\",          \"timeBase\": \"1/90000\",                 \"maxBitRate\": 6000000,                   \"profile\": \"main\",                     \"level\": \"4\",                          \"resolutions\": [                             {                                            \"height\": 720,                           \"width\": 1280                          }                                      ],                                         \"rtpExtensions\": [                       ],                                         \"receiverRtcpEventLog\": true           }                                   ");
                            jSONObject4.put("index", i);
                            jSONObject4.put("storeTime", pwe.f40462l.f40443b);
                            jSONObject4.put("targetDelay", pwe.f40462l.f40443b);
                            if (pwe.f40462l.f40446e) {
                                jSONObject4.put("aesKey", pwe.f40464n);
                                jSONObject4.put("aesIvMask", pwe.f40465o);
                            }
                            if (pwe.f40462l.f40445d) {
                                jSONObject4.getJSONArray("rtpExtensions").put("adaptive_playout_delay");
                            }
                            jSONObject4.put("errorRecoveryMode", pwe.f40462l.f40449h);
                            jSONObject4.put("intraRefreshEnable", !pwe.f40462l.f40449h.equals("castv2"));
                            jSONObject4.put("maxBitRate", pwe.f40452c);
                            int i2 = Build.VERSION.SDK_INT;
                            int i3 = pwe.f40454e;
                            int i4 = pwe.f40453d;
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(i3);
                            sb.append("/");
                            sb.append(i4);
                            jSONObject4.put("maxFrameRate", sb.toString());
                            pwe.mo23761a(jSONObject4, pwe.f40456g, pwe.f40455f);
                            jSONArray.put(i, jSONObject4);
                        } catch (JSONException e) {
                            try {
                                pwe.f40173s.mo23677d("Malformed config string; ignoring", new Object[0]);
                                jSONObject = null;
                                jSONObject2.put("offer", jSONObject);
                            } catch (JSONException e2) {
                                pwe.f40173s.mo23670a("Failed to construct JSONObject for offer!", new Object[0]);
                                pwe.mo23630a(jSONObject2.toString(), j, pwe.f40459i);
                            }
                            pwe.mo23630a(jSONObject2.toString(), j, pwe.f40459i);
                        }
                    } else {
                        j = j2;
                    }
                    jSONObject = new JSONObject();
                    jSONObject.put("udpPort", 2346);
                    jSONObject.put("supportedStreams", jSONArray);
                    pwe.f40173s.mo23677d("offer string; %s", jSONObject);
                } catch (JSONException e3) {
                    j = j2;
                    pwe.f40173s.mo23677d("Malformed config string; ignoring", new Object[0]);
                    jSONObject = null;
                    jSONObject2.put("offer", jSONObject);
                    pwe.mo23630a(jSONObject2.toString(), j, pwe.f40459i);
                }
                jSONObject2.put("offer", jSONObject);
            } catch (JSONException e4) {
                j = j2;
                pwe.f40173s.mo23670a("Failed to construct JSONObject for offer!", new Object[0]);
                pwe.mo23630a(jSONObject2.toString(), j, pwe.f40459i);
            }
            pwe.mo23630a(jSONObject2.toString(), j, pwe.f40459i);
        } catch (IOException e5) {
            this.f40379n.mo23679f("Failed to send offer", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo23704b(boolean z) {
        this.f40379n.mo23670a("detachMirroringChannel. error:%b", Boolean.valueOf(z));
        if (this.f40273g != null) {
            this.f40379n.mo23670a("Destroying mirroring client", new Object[0]);
            JGCastService jGCastService = this.f40273g;
            if (jGCastService.mDidLoadLibrary) {
                jGCastService.native_disconnect();
            }
            this.f40273g = null;
        }
        pwe pwe = this.f40279m;
        if (pwe != null) {
            pjc pjc = this.f40388w;
            if (pjc != null) {
                pjc.mo23247b(pwe);
            }
            this.f40279m = null;
        }
        mo23701a(z);
        if (this.f40274h != null && this.f40275i == null) {
            this.f40275i = this.f40384s.schedule(new puj(this), f40268b, TimeUnit.MILLISECONDS);
        }
    }
}
