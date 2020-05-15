package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.Map;

/* renamed from: biar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class biar implements bial {
    /* renamed from: a */
    public abstract void mo64395a(int i, Map map);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        mo64395a(0, ((biba) obj).f120097a);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            sil.m35353a(volleyError, "Places");
            i = biam.m101858a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
        }
        mo64395a(i, Collections.emptyMap());
    }
}
