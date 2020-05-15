package p000;

import com.android.volley.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adws implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ bqgy f62847a;

    public adws(bqgy bqgy) {
        this.f62847a = bqgy;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        try {
            this.f62847a.mo69138b(((JSONObject) obj).getString("privateTopicName"));
        } catch (JSONException e) {
            this.f62847a.mo69136a((Throwable) e);
        }
    }
}
