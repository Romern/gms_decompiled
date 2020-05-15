package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aobb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aobb extends aoba {

    /* renamed from: a */
    final ClientContext f78060a;

    /* renamed from: b */
    final antk f78061b;

    public aobb(ClientContext clientContext, antk antk) {
        this.f78060a = clientContext;
        this.f78061b = antk;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        Bundle bundle;
        try {
            Pair b = mo42521b(context, anru);
            ConnectionResult connectionResult = (ConnectionResult) b.first;
            if (connectionResult.mo17670a()) {
                bundle = new Bundle();
                bundle.putParcelable("pendingIntent", connectionResult.f30066d);
            } else {
                bundle = null;
            }
            this.f78061b.mo42230a(connectionResult.f30065c, bundle, (Bundle) b.second);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78061b.mo42230a(4, bundle2, (Bundle) null);
        } catch (gid e2) {
            this.f78061b.mo42230a(4, anuj.m65341a(context, this.f78060a), (Bundle) null);
        } catch (VolleyError e3) {
            this.f78061b.mo42230a(7, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: b */
    public abstract Pair mo42521b(Context context, anru anru);

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78061b;
        if (antk != null) {
            antk.mo42230a(8, (Bundle) null, (Bundle) null);
        }
    }
}
