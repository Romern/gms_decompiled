package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.List;

/* renamed from: bhya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhya implements bial {

    /* renamed from: a */
    final /* synthetic */ bhyc f119861a;

    public bhya(bhyc bhyc) {
        this.f119861a = bhyc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        this.f119861a.mo64408a(0, (List) obj);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        int i;
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("onFailure: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
        }
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            sil.m35353a(volleyError, "Places");
            i = biam.m101858a(volleyError);
        } else {
            i = 13;
        }
        this.f119861a.mo64408a(i, Collections.emptyList());
    }
}
