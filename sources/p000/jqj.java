package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqj extends aaab {

    /* renamed from: a */
    private static final Logger f23055a = jsy.m17256a("SetFeatureEnabled");

    /* renamed from: b */
    private final rnt f23056b;

    /* renamed from: c */
    private final String f23057c;

    /* renamed from: d */
    private final Account f23058d;

    /* renamed from: e */
    private final boolean f23059e;

    public jqj(rnt rnt, String str, boolean z, String str2) {
        super(142, "SetFeatureEnabled");
        this.f23056b = rnt;
        this.f23059e = z;
        this.f23057c = str;
        this.f23058d = new Account(str2, "com.google");
    }

    /* renamed from: a */
    public static boolean m17124a(String str, String str2, Context context) {
        return m17125a(str, false, str2, context);
    }

    /* renamed from: a */
    public static boolean m17125a(String str, boolean z, String str2, Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jqi jqi = new jqi(atomicBoolean);
        context.getPackageName();
        try {
            new jqj(jqi, str, z, str2).mo6502a(context);
            return atomicBoolean.get();
        } catch (aaaj | RemoteException e) {
            f23055a.mo25417e("Better Together feature was not enabled.", e, new Object[0]);
            jsw.m17254a().mo14033a(e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        jta a = jsz.m17257a();
        if (!cchr.m129714b()) {
            f23055a.mo25412b("CryptAuth V2 for proximity is disabled. Skipping.", new Object[0]);
            a.mo14035B(2);
            this.f23056b.mo11797a(Status.f30107a);
            return;
        }
        try {
            bsni a2 = bsni.m116007a(this.f23057c);
            sdo.m34974b(a2 != bsni.UNKNOWN_FEATURE);
            if (!soz.m35791a(context, this.f23058d)) {
                a.mo14035B(4);
                String valueOf = String.valueOf(this.f23058d.name);
                throw new aaaj(102, valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
            }
            jlg a3 = jlf.m16865a(context);
            if (a3.mo13852a(this.f23058d, a2, this.f23059e)) {
                jkn a4 = jkl.m16847a(inl.m15759a(context), jlh.m16871a(context), a3);
                try {
                    boolean a5 = job.m17010a(this.f23057c);
                    a.mo14045a(a5);
                    aucb a6 = a4.mo13835a(this.f23058d, a5, ccho.m129707c());
                    aucu.m76783a(a6, ccho.m129706b(), TimeUnit.SECONDS);
                    this.f23056b.mo11797a(((KeyRegistrationResult) a6.mo50386d()).f10542b);
                    a.mo14035B(0);
                } catch (InterruptedException | ExecutionException | TimeoutException | jkm e) {
                    boolean z = e instanceof ExecutionException;
                    if (!z || !(e.getCause() instanceof iot)) {
                        i = 8;
                    } else {
                        i = ((iot) e.getCause()).mo24655a();
                        if (iov.m15808a(i)) {
                            a.mo14035B(9);
                            this.f23056b.mo11797a(Status.f30107a);
                            return;
                        }
                    }
                    if (z) {
                        a.mo14035B(5);
                    } else if (e instanceof InterruptedException) {
                        a.mo14035B(6);
                    } else if (e instanceof TimeoutException) {
                        a.mo14035B(7);
                    } else {
                        a.mo14035B(8);
                    }
                    jsw.m17254a().mo14033a(e);
                    throw new aaaj(i, "Failed to enroll for newly enabled/disabled feature");
                }
            } else {
                a.mo14035B(1);
                this.f23056b.mo11797a(Status.f30107a);
            }
        } catch (IllegalArgumentException e2) {
            a.mo14035B(3);
            String valueOf2 = String.valueOf(this.f23057c);
            throw new aaaj(101, valueOf2.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23056b.mo11797a(status);
    }
}
