package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ppq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ppq extends shl {

    /* renamed from: a */
    private final Executor f40032a;

    public ppq(Context context, Executor executor) {
        super(context, cczq.f180312a.mo6606a().mo77113h(), (int) cczq.f180312a.mo6606a().mo77114i(), Process.myUid(), 2305);
        this.f40032a = executor;
    }

    /* renamed from: a */
    public static final ClientContext m30994a(String str) {
        Account account = new Account(str, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = "com.google.android.gms";
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.mo17806d(cczq.f180312a.mo6606a().mo77111f());
        return clientContext;
    }

    /* renamed from: a */
    public final aucb mo23536a(Callable callable) {
        return aucu.m76780a(this.f40032a, callable);
    }
}
