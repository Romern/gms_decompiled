package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ikk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikk {

    /* renamed from: c */
    public static final sek f21208c = new sek("TransactionMessageBuilder");

    /* renamed from: a */
    public final igh f21209a;

    /* renamed from: b */
    public final ijd f21210b;

    /* renamed from: d */
    rjx f21211d;

    /* renamed from: e */
    private final Context f21212e;

    /* renamed from: f */
    private final skh f21213f;

    public ikk(Context context) {
        igh igh = new igh(context);
        ijd ijd = new ijd(context);
        skh a = skh.m35531a();
        this.f21212e = context;
        this.f21209a = igh;
        this.f21210b = ijd;
        this.f21213f = a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[SYNTHETIC, Splitter:B:47:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bf  */
    /* renamed from: a */
    public final void mo13093a(bxvd bxvd) {
        long j;
        boolean z;
        rex rex;
        skh skh;
        Context context;
        iyv iyv;
        if ((((byqq) bxvd.f164949b).f167411a & 64) == 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byqq byqq = (byqq) bxvd.f164949b;
            byqq byqq2 = byqq.f167409i;
            byqq.f167411a |= 64;
            byqq.f167418h = false;
        }
        if (!cceo.m129401b()) {
            rjy rjy = new rjy(this.f21212e);
            rjy.mo24779a(aula.f92018a);
            rkb b = rjy.mo24784b();
            ConnectionResult f = b.mo24802f();
            try {
                if (!f.mo17671b()) {
                    sek sek = f21208c;
                    int i = f.f30065c;
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("Error while connecting to trustagent");
                    sb.append(i);
                    sek.mo25418e(sb.toString(), new Object[0]);
                    j = -1;
                    z = false;
                } else if (aurc.m77676a(this.f21212e)) {
                    aups aups = (aups) aurc.m77675a(b).mo9455a();
                    z = aups.f92290c;
                    if (!aups.f92288a.mo17710c()) {
                        f21208c.mo25418e("TrustAgentState not returned successfully", new Object[0]);
                        j = -1;
                    } else {
                        j = aups.f92291d;
                    }
                } else {
                    j = -1;
                    z = false;
                }
            } finally {
                b.mo24803g();
            }
        } else {
            if (this.f21211d == null) {
                this.f21211d = aula.m77249a(this.f21212e);
            }
            if (rjx.m33698c(this.f21212e)) {
                try {
                    aucb A = this.f21211d.mo24669A();
                    aucu.m76783a(A, 5, TimeUnit.SECONDS);
                    aups aups2 = (aups) A.mo50386d();
                    z = aups2.f92290c;
                    try {
                        j = aups2.f92291d;
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        e = e;
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    e = e2;
                    z = false;
                    f21208c.mo25417e("TrustAgentState not returned successfully", e, new Object[0]);
                    j = -1;
                    if (j > -1) {
                    }
                    rex = new rex();
                    if (!this.f21213f.mo25690a(this.f21212e, new Intent().setClassName(this.f21212e, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1)) {
                    }
                }
            } else {
                j = -1;
                z = false;
            }
        }
        if (j > -1) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byqq byqq3 = (byqq) bxvd.f164949b;
            byqq byqq4 = byqq.f167409i;
            byqq3.f167411a |= 8;
            byqq3.f167415e = j;
        }
        rex = new rex();
        if (!this.f21213f.mo25690a(this.f21212e, new Intent().setClassName(this.f21212e, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1)) {
            try {
                IBinder a = rex.mo24567a();
                if (a != null) {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                    iyv = !(queryLocalInterface instanceof iyv) ? new iyt(a) : (iyv) queryLocalInterface;
                } else {
                    iyv = null;
                }
                long c = iyv.mo13499c();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byqq byqq5 = (byqq) bxvd.f164949b;
                byqq byqq6 = byqq.f167409i;
                byqq5.f167411a |= 4;
                byqq5.f167414d = c;
                long j2 = 0;
                if (!z) {
                    long a2 = iyv.mo13498a();
                    if (a2 <= 0) {
                        sek sek2 = f21208c;
                        StringBuilder sb2 = new StringBuilder(90);
                        sb2.append("Unexpected value for IDeviceSignalsService.getLastSecureUnlockTime(): ");
                        sb2.append(a2);
                        sek2.mo25418e(sb2.toString(), new Object[0]);
                        j2 = 2592000000L - a2;
                    } else {
                        j2 = SystemClock.elapsedRealtime() - a2;
                    }
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byqq byqq7 = (byqq) bxvd.f164949b;
                int i2 = byqq7.f167411a | 16;
                byqq7.f167411a = i2;
                byqq7.f167416f = j2;
                byqq7.f167411a = i2 | 32;
                byqq7.f167417g = j2;
                skh = this.f21213f;
                context = this.f21212e;
            } catch (RemoteException | InterruptedException e3) {
                f21208c.mo25418e("Bind to DeviceSignalsService interrupted", new Object[0]);
                skh = this.f21213f;
                context = this.f21212e;
            } catch (Throwable th) {
                this.f21213f.mo25689a(this.f21212e, rex);
                throw th;
            }
            skh.mo25689a(context, rex);
            return;
        }
        f21208c.mo25418e("Failed to bind to DeviceSignalsService", new Object[0]);
    }
}
