package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Formatter;

/* renamed from: aocd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocd extends aoba {

    /* renamed from: a */
    private final ClientContext f78160a;

    /* renamed from: b */
    private final String f78161b;

    /* renamed from: c */
    private final antn f78162c;

    public aocd(ClientContext clientContext, String str, antn antn) {
        this.f78160a = clientContext;
        this.f78161b = str;
        this.f78162c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78160a;
            String str = this.f78161b;
            aodo aodo = anru.f77552c.f77581e;
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("moments/%1$s", shd.m35267a(str));
            aodo.f78225a.mo25539a(clientContext, 3, sb.toString(), null);
            this.f78162c.mo42247a(0, (Bundle) null, this.f78161b);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78162c.mo42247a(4, bundle, this.f78161b);
        } catch (gid e2) {
            this.f78162c.mo42247a(4, anuj.m65341a(context, this.f78160a), this.f78161b);
        } catch (VolleyError e3) {
            this.f78162c.mo42247a(7, (Bundle) null, this.f78161b);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        this.f78162c.mo42247a(8, (Bundle) null, this.f78161b);
    }
}
