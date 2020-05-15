package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.lang.ref.WeakReference;

/* renamed from: ibv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibv extends sji {

    /* renamed from: a */
    private final sjj f20706a;

    /* renamed from: d */
    private final int f20707d;

    /* renamed from: e */
    private final Bundle f20708e;

    /* renamed from: f */
    private final ClientContext f20709f;

    public ibv(sjj sjj, int i, Bundle bundle, ClientContext clientContext) {
        super(16, "ValidateAuthServiceOperation");
        this.f20706a = sjj;
        this.f20707d = i;
        this.f20708e = bundle;
        this.f20709f = clientContext;
    }

    /* renamed from: a */
    private final void m15213a(int i, ibk ibk) {
        if (i != 0) {
            this.f20706a.mo25644a(i, new Bundle());
        } else {
            this.f20706a.mo25645a(ibk);
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        ibk ibk;
        if (this.f20708e.getString("consumerPkg") == null || rfz.m33557a(context).mo24608b(this.f20707d)) {
            WeakReference weakReference = (WeakReference) AuthChimeraService.f10295a.get(this.f20709f);
            if (weakReference != null) {
                ibk = (ibk) weakReference.get();
            } else {
                ibk = null;
            }
            if (ibk == null) {
                ClientContext clientContext = this.f20709f;
                if (context instanceof AuthChimeraService) {
                    AuthChimeraService authChimeraService = (AuthChimeraService) context;
                    ibk ibk2 = new ibk(authChimeraService, authChimeraService.mo7517a(), clientContext);
                    AuthChimeraService.m6408a(clientContext, ibk2);
                    ibk = ibk2;
                } else {
                    ibk = null;
                }
            }
            if (ibk == null) {
                m15213a(8, null);
            } else {
                m15213a(0, ibk);
            }
        } else {
            m15213a(10, null);
        }
    }
}
