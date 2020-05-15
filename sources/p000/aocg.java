package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aocg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocg extends aoba {

    /* renamed from: a */
    private final antk f78167a;

    /* renamed from: b */
    private final ClientContext f78168b;

    public aocg(ClientContext clientContext, antk antk) {
        this.f78168b = clientContext;
        this.f78167a = antk;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78168b;
            String a = new sie(clientContext, null).mo25585a(context);
            String valueOf = String.valueOf(a);
            anru.f77550a.mo25539a(clientContext, 0, valueOf.length() == 0 ? new String("/revoke?token=") : "/revoke?token=".concat(valueOf), null);
            gie.m13192a(context, a);
            this.f78167a.mo42229a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78167a.mo42229a(4, bundle);
        } catch (gid e2) {
            this.f78167a.mo42229a(4, anuj.m65341a(context, this.f78168b));
        } catch (VolleyError e3) {
            this.f78167a.mo42229a(7, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78167a;
        if (antk != null) {
            antk.mo42229a(8, (Bundle) null);
        }
    }
}
