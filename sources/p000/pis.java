package p000;

import android.os.SystemClock;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pis */
final /* synthetic */ class pis implements Runnable {

    /* renamed from: a */
    private final pjc f39252a;

    public pis(pjc pjc) {
        this.f39252a = pjc;
    }

    public final void run() {
        pjc pjc = this.f39252a;
        if (pjc.mo23211b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pkw pkw = pjc.f39320i;
            if (pkw != null) {
                long j = pkw.f39547c;
                if (j != 0) {
                    long j2 = elapsedRealtime - pkw.f39546b;
                    if (j2 >= j) {
                        pjc.f39316e.mo23677d("Disconnecting due to heartbeat timeout", new Object[0]);
                        pjc.mo23251d(2706);
                    } else if (!pkw.f39548d && j2 >= j / 2) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("type", "PING");
                            } catch (JSONException e) {
                            }
                            pkw.mo23630a(jSONObject.toString(), 0, "transport-0");
                            pkw.mo23350a();
                            pkw.f39548d = true;
                        } catch (IOException e2) {
                        }
                    } else if (j2 <= 0) {
                        pkw.f39549e.mo23675c("Unexpected value for delta: %d", Long.valueOf(j2));
                    }
                }
            }
        }
    }
}
