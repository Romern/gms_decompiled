package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pkw extends ptb {

    /* renamed from: a */
    public static final String f39545a = ptk.m31239c("com.google.cast.tp.heartbeat");

    /* renamed from: b */
    public long f39546b;

    /* renamed from: c */
    public final long f39547c;

    /* renamed from: d */
    public boolean f39548d;

    /* renamed from: e */
    public final qav f39549e;

    public pkw(long j, String str) {
        super(f39545a, "HeartbeatChannel", str);
        qav qav = new qav("HeartbeatChannel");
        this.f39549e = qav;
        qav.mo23669a(str);
        this.f39547c = j;
        mo23350a();
    }

    /* renamed from: a */
    public final void mo23350a() {
        this.f39546b = SystemClock.elapsedRealtime();
        this.f39548d = false;
    }

    /* renamed from: b */
    public final void mo23345b(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo23350a();
            new Object[1][0] = str;
            try {
                if ("PING".equals(new JSONObject(str).getString("type"))) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("type", "PONG");
                        } catch (JSONException e) {
                        }
                        mo23630a(jSONObject.toString(), 0, "transport-0");
                    } catch (IOException e2) {
                    }
                }
            } catch (JSONException e3) {
                this.f39549e.mo23675c("Message is malformed (%s); ignoring: %s", e3.getMessage(), str);
            }
        }
    }
}
