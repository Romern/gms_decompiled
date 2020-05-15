package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpv extends aaab {

    /* renamed from: a */
    private static final Logger f23008a = jsy.m17256a("GetMySyncedMetadata");

    /* renamed from: b */
    private static final long f23009b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private final jsg f23010c;

    /* renamed from: d */
    private final String f23011d;

    /* renamed from: e */
    private final ios f23012e;

    /* renamed from: f */
    private final boolean f23013f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jpv(jsg jsg, String str, boolean z) {
        super(142, "GetMySyncedMetadata");
        ios a = inl.m15759a(rpr.m34216b());
        this.f23010c = jsg;
        this.f23011d = str;
        this.f23012e = a;
        this.f23013f = z;
    }

    /* renamed from: a */
    public static SyncedCryptauthDevice m17085a(Context context, String str) {
        return m17086a(context, str, false);
    }

    /* renamed from: b */
    private final SyncedCryptauthDevice m17087b(Context context) {
        jtt a = jtu.m17328a(context);
        try {
            Account account = new Account(this.f23011d, "com.google");
            if (a.mo14086b(account)) {
                jrn a2 = a.mo14082a(account);
                if (a2 != null) {
                    jsz.m17257a().mo14067w(0);
                    SyncedCryptauthDevice a3 = jkq.m16850a(a2, this.f23011d);
                    if (a != null) {
                        a.close();
                    }
                    return a3;
                }
                jsz.m17257a().mo14067w(1);
                throw new aaaj(8, "No metadata for account");
            }
            jsz.m17257a().mo14067w(6);
            throw new aaaj(13, "Initial sync not done");
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private final void m17088c(Context context) {
        try {
            aucb a = this.f23012e.mo24701a((rpa) new ino("DeviceSync:BetterTogether", new Account(this.f23011d, "com.google")));
            aucu.m76783a(a, f23009b, TimeUnit.MILLISECONDS);
            List<DeviceMetadata> list = (List) a.mo50386d();
            if (list != null) {
                for (DeviceMetadata deviceMetadata : list) {
                    if (deviceMetadata.f10525b.equals(addi.m50206a(context).mo33346b())) {
                        jsz.m17257a().mo14069y(0);
                        this.f23010c.mo13960a(Status.f30107a, jkq.m16849a(deviceMetadata));
                        return;
                    }
                }
            }
            if (!cchu.m129746b()) {
                this.f23010c.mo13960a(Status.f30107a, null);
                return;
            }
            jsz.m17257a().mo14069y(1);
            this.f23010c.mo13960a(Status.f30107a, m17087b(context));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new aaaj(8, e.getMessage());
        }
    }

    /* renamed from: a */
    public static SyncedCryptauthDevice m17086a(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            new jpv(new jpu(arrayList), str, z).mo6502a(context);
            if (!arrayList.isEmpty()) {
                return (SyncedCryptauthDevice) arrayList.get(0);
            }
            return null;
        } catch (aaaj | RemoteException e) {
            f23008a.mo25417e("Failed to fetch synced metadata.", e, new Object[0]);
            jsw.m17254a().mo14033a(e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (cchu.m129749e() && !this.f23013f) {
            m17088c(context);
            return;
        }
        bmxy.m108588a(!cchu.m129747c());
        this.f23010c.mo13960a(Status.f30107a, m17087b(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23010c.mo13960a(status, null);
    }
}
