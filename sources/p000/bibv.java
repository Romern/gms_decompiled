package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.List;

/* renamed from: bibv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibv implements bial {

    /* renamed from: a */
    final /* synthetic */ bhyc f120168a;

    public bibv() {
    }

    /* renamed from: a */
    public final void mo64511a(int i, List list) {
        this.f120168a.mo64408a(i, list);
    }

    public bibv(bhyc bhyc) {
        this.f120168a = bhyc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        mo64511a(0, (List) obj);
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
        mo64511a(13, Collections.emptyList());
    }
}
