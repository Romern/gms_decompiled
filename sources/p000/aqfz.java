package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: aqfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqfz implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ aqgd f86020a;

    public aqfz(aqgd aqgd) {
        this.f86020a = aqgd;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            aqgy.m71600a("Unknown error while starting apk upload: %s", volleyError.getMessage());
            this.f86020a.f86029e.add(0);
            return;
        }
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null || !str.equals("final")) {
            aqgy.m71600a("Unknown error while starting apk upload: %s", volleyError.getMessage());
            this.f86020a.f86029e.add(0);
            return;
        }
        this.f86020a.f86029e.add(1);
    }
}
