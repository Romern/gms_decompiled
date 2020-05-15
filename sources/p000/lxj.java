package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: lxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxj {

    /* renamed from: a */
    private final Context f33159a;

    public lxj(Context context) {
        this.f33159a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ClientContext mo19732a() {
        Account a = new lsp(this.f33159a).mo19591a();
        if (a != null) {
            ClientContext clientContext = new ClientContext();
            clientContext.f30212b = Process.myUid();
            clientContext.f30214d = a;
            clientContext.f30213c = a;
            clientContext.f30215e = "com.google.android.gms";
            clientContext.f30216f = "com.google.android.gms";
            clientContext.mo17806d(ccls.f179387a.mo6606a().mo76344f());
            return clientContext;
        }
        throw new mbh();
    }
}
