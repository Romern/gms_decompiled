package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: audk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audk {

    /* renamed from: a */
    public audl f91418a = null;

    public audk(Context context) {
        shl shl = new shl(context, cgyd.f188020a.mo6606a().mo84747x(), audf.m76789a(cgyd.f188020a.mo6606a().mo84748y()), context.getApplicationInfo().uid, 17152);
        if (0 == 0) {
            this.f91418a = new audl(shl);
        }
    }

    /* renamed from: a */
    public static ClientContext m76813a(Context context) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = context.getApplicationInfo().uid;
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30215e = "com.google.android.gms";
        return clientContext;
    }
}
