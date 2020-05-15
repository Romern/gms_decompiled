package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aoce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoce extends aoba {

    /* renamed from: a */
    private final ClientContext f78163a;

    /* renamed from: b */
    private final String f78164b;

    public aoce(ClientContext clientContext, String str) {
        this.f78163a = clientContext;
        this.f78164b = str;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        ClientContext clientContext = this.f78163a;
        String str = this.f78164b;
        try {
            aode aode = anru.f77554e.f77557a;
            aode.f78217a.mo25539a(clientContext, 3, String.format("moments/%1$s", shd.m35267a(str)), null);
        } catch (gid e) {
        } catch (VolleyError e2) {
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
    }
}
