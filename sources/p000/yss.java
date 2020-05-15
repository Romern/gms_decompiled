package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: yss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yss {

    /* renamed from: d */
    private static final srn f54558d = zvt.m46581a();

    /* renamed from: a */
    protected final Context f54559a;

    /* renamed from: b */
    protected final Account f54560b;

    /* renamed from: c */
    public final ConcurrentMap f54561c = new ConcurrentHashMap();

    public yss(Context context, String str) {
        bmxy.m108581a(context);
        this.f54559a = context;
        this.f54560b = new Account(str, "com.google");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30735a(String str) {
        if (str == null) {
            bnsl bnsl = (bnsl) f54558d.mo68387b();
            bnsl.mo68432a("yss", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid app.");
            return 0;
        }
        try {
            return this.f54559a.getPackageManager().getPackageInfo(str, 128).applicationInfo.uid;
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl2 = (bnsl) f54558d.mo68387b();
            bnsl2.mo68432a("yss", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Invalid app Uid for: %s", str);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo30738b(ClientContext clientContext) {
        long j;
        String b = clientContext.mo17803b("com.google.android.gms.fitness.auth.time");
        if (b != null) {
            j = Long.parseLong(b);
        } else {
            j = 0;
        }
        return System.currentTimeMillis() - j > TimeUnit.SECONDS.toMillis(cdyr.f181940a.mo6606a().mo78477c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30736a(ClientContext clientContext) {
        String str = clientContext.f30215e;
        mo30737a(clientContext.mo17803b("com.google.android.gms.fitness.auth.token"), str);
        clientContext.mo17804b(this.f54559a);
        this.f54561c.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo30737a(String str, String str2) {
        try {
            gie.m13196b(this.f54559a, str);
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) f54558d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("yss", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to clear token");
        }
    }
}
