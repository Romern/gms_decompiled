package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.Map;

/* renamed from: bibw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bibw implements bial {
    /* renamed from: a */
    public abstract void mo64396a(int i, Map map);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        mo64396a(0, ((bicd) obj).f120192a);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (th instanceof VolleyError) {
            sil.m35353a((VolleyError) th, "Places");
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: 13, Cause: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
        }
        mo64396a(13, Collections.emptyMap());
    }
}
