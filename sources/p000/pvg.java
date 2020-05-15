package p000;

import com.google.android.gms.cast_mirroring.JGCastService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pvg */
public final /* synthetic */ class pvg implements Runnable {

    /* renamed from: a */
    private final pvj f40355a;

    /* renamed from: b */
    private final boolean f40356b;

    public pvg(pvj pvj, boolean z) {
        this.f40355a = pvj;
        this.f40356b = z;
    }

    public final void run() {
        pvj pvj = this.f40355a;
        boolean z = this.f40356b;
        if (pvj.f40273g != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mute", z);
            } catch (JSONException e) {
            }
            JGCastService jGCastService = pvj.f40273g;
            String jSONObject2 = jSONObject.toString();
            if (jGCastService.mDidLoadLibrary) {
                if (com.google.android.cast.JGCastService.DEBUG) {
                    "setParameters source=true, params=" + jSONObject2;
                }
                jGCastService.native_setParameters(true, jSONObject2);
            }
        }
    }
}
