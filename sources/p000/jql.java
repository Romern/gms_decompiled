package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jql extends aaab {

    /* renamed from: a */
    private static final Logger f23061a = jsy.m17256a("SetFeatureSupported");

    /* renamed from: b */
    private final rnt f23062b;

    /* renamed from: c */
    private final String f23063c;

    /* renamed from: d */
    private final Account f23064d;

    /* renamed from: e */
    private final boolean f23065e;

    /* renamed from: f */
    private final boolean f23066f;

    /* renamed from: g */
    private final ios f23067g;

    public jql(rnt rnt, String str, boolean z, String str2, ios ios, boolean z2) {
        super(142, "SetFeatureSupported");
        this.f23062b = rnt;
        this.f23065e = z;
        this.f23063c = str;
        this.f23064d = new Account(str2, "com.google");
        this.f23067g = ios;
        this.f23066f = z2;
    }

    /* renamed from: a */
    public static Status m17129a(Context context, bsni bsni, boolean z, Account account, ios ios, boolean z2) {
        AtomicReference atomicReference = new AtomicReference();
        try {
            new jql(new jqk(atomicReference), bsni.name(), z, account.name, ios, z2).mo6502a(context);
            return (Status) atomicReference.get();
        } catch (aaaj e) {
            f23061a.mo25415d("Unable to setFeatureSupported (OperationException)", e, new Object[0]);
            return e.f27843a;
        } catch (RemoteException e2) {
            f23061a.mo25415d("Unable to setFeatureSupported (RemoteException)", e2, new Object[0]);
            return Status.f30109c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1 A[Catch:{ InterruptedException | ExecutionException | TimeoutException | jkm -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2 A[Catch:{ InterruptedException | ExecutionException | TimeoutException | jkm -> 0x011e }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        boolean z;
        boolean a;
        boolean z2;
        boolean z3;
        jta a2 = jsz.m17257a();
        if (!cchr.m129714b()) {
            f23061a.mo25412b("CryptAuth V2 from proximity disabled. Skipping.", new Object[0]);
            a2.mo14036C(2);
            this.f23062b.mo11797a(Status.f30107a);
            return;
        }
        jli a3 = jlh.m16871a(context);
        try {
            bsni a4 = bsni.m116007a(this.f23063c);
            sdo.m34974b(a4 != bsni.UNKNOWN_FEATURE);
            if (!soz.m35791a(context, this.f23064d)) {
                a2.mo14036C(4);
                String valueOf = String.valueOf(this.f23064d.name);
                throw new aaaj(102, valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
            }
            try {
                if (cchu.m129748d()) {
                    aucb a5 = this.f23067g.mo13180a("DeviceSync:BetterTogether", this.f23064d);
                    aucu.m76783a(a5, cchu.f179012a.mo6606a().mo75982b(), TimeUnit.SECONDS);
                    if (!((Boolean) a5.mo50386d()).booleanValue()) {
                        z = true;
                        a = a3.mo13855a(this.f23064d, a4, this.f23065e);
                        if (a) {
                            if (!z) {
                                this.f23062b.mo11797a(Status.f30107a);
                                return;
                            }
                        }
                        jkn a6 = jkl.m16847a(this.f23067g, a3, jlf.m16865a(context));
                        if (!this.f23066f || job.m17010a(this.f23063c)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        f23061a.mo25414c("Setting feature %s supported state to %s. Did value change: %s Needs key enrollment: %s Immediate enrollment: %s", this.f23063c, Boolean.valueOf(this.f23065e), Boolean.valueOf(a), Boolean.valueOf(z), Boolean.valueOf(z2));
                        jsz.m17257a().mo14045a(z2);
                        Account account = this.f23064d;
                        if (!z || !ccho.m129707c()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        aucb a7 = a6.mo13835a(account, z2, z3);
                        aucu.m76783a(a7, ccho.m129706b(), TimeUnit.SECONDS);
                        this.f23062b.mo11797a(((KeyRegistrationResult) a7.mo50386d()).f10542b);
                        a2.mo14036C(0);
                    }
                }
                z = false;
                a = a3.mo13855a(this.f23064d, a4, this.f23065e);
                if (a) {
                }
                jkn a62 = jkl.m16847a(this.f23067g, a3, jlf.m16865a(context));
                if (!this.f23066f) {
                }
                z2 = true;
                f23061a.mo25414c("Setting feature %s supported state to %s. Did value change: %s Needs key enrollment: %s Immediate enrollment: %s", this.f23063c, Boolean.valueOf(this.f23065e), Boolean.valueOf(a), Boolean.valueOf(z), Boolean.valueOf(z2));
                jsz.m17257a().mo14045a(z2);
                Account account2 = this.f23064d;
                if (!z) {
                }
                z3 = false;
                aucb a72 = a62.mo13835a(account2, z2, z3);
                aucu.m76783a(a72, ccho.m129706b(), TimeUnit.SECONDS);
                this.f23062b.mo11797a(((KeyRegistrationResult) a72.mo50386d()).f10542b);
                a2.mo14036C(0);
            } catch (InterruptedException | ExecutionException | TimeoutException | jkm e) {
                boolean z4 = e instanceof ExecutionException;
                if (!z4 || !(e.getCause() instanceof iot)) {
                    i = 8;
                } else {
                    i = ((iot) e.getCause()).mo24655a();
                    if (iov.m15808a(i)) {
                        a2.mo14036C(9);
                        this.f23062b.mo11797a(Status.f30107a);
                        return;
                    }
                }
                a3.mo13855a(this.f23064d, a4, true ^ this.f23065e);
                jsw.m17254a().mo14033a(e);
                if (z4) {
                    a2.mo14036C(5);
                } else if (e instanceof InterruptedException) {
                    a2.mo14036C(6);
                } else if (e instanceof TimeoutException) {
                    a2.mo14036C(7);
                } else {
                    a2.mo14036C(8);
                }
                throw new aaaj(i, "Failed to enroll for new feature");
            }
        } catch (IllegalArgumentException e2) {
            a2.mo14036C(3);
            String valueOf2 = String.valueOf(this.f23063c);
            throw new aaaj(101, valueOf2.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23062b.mo11797a(status);
    }
}
