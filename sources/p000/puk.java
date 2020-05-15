package p000;

import com.google.android.gms.cast_mirroring.JGCastLogger;
import com.google.android.gms.cast_mirroring.JGCastService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: puk */
final /* synthetic */ class puk implements Runnable {

    /* renamed from: a */
    private final pul f40263a;

    /* renamed from: b */
    private final String f40264b;

    public puk(pul pul, String str) {
        this.f40263a = pul;
        this.f40264b = str;
    }

    public final void run() {
        pul pul = this.f40263a;
        String str = this.f40264b;
        pun pun = pul.f40265a;
        ScheduledFuture scheduledFuture = pun.f40275i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        JGCastLogger jGCastLogger = pun.f40274h;
        if (jGCastLogger != null) {
            jGCastLogger.mo5043a();
            pun.f40274h = null;
        }
        if (pun.f40267a) {
            pun.f40274h = new JGCastLogger(pun.f40380o);
        }
        pun.f40273g = new JGCastService(pun.f40380o, new pum(pun), pun.f40276j);
        JGCastLogger jGCastLogger2 = pun.f40274h;
        if (jGCastLogger2 != null) {
            JGCastService jGCastService = pun.f40273g;
            if (jGCastService.mDidLoadLibrary) {
                jGCastService.native_setLogger(jGCastLogger2);
            }
        }
        int i = pun.f40270d;
        if (pun.f40269c) {
            i |= Integer.MIN_VALUE;
        }
        int i2 = i | pun.f40272f;
        pun.f40379n.mo23675c("createSourceOrSink, flags = 0x%x", Integer.valueOf(i2));
        if (pun.f40271e) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                pun.f40273g.mo5047a("0.0.0.0", jSONObject.getString("ipAddress"), jSONObject.getJSONObject("jsonConfig").toString(), i2);
            } catch (JSONException e) {
                qav qav = pun.f40379n;
                String valueOf = String.valueOf(e.getMessage());
                qav.mo23677d(valueOf.length() == 0 ? new String("failed to createSourceOrSink:") : "failed to createSourceOrSink:".concat(valueOf), new Object[0]);
            }
        } else {
            int indexOf = str.indexOf(58);
            pun.f40273g.mo5047a("0.0.0.0", str.substring(0, indexOf), str.substring(indexOf + 1), i2);
        }
    }
}
