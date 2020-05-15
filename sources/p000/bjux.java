package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bjux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjux {

    /* renamed from: a */
    public final rjx f123374a;

    public bjux(rjx rjx) {
        this.f123374a = rjx;
    }

    /* renamed from: a */
    public static Status m104670a(Exception exc) {
        if (exc instanceof TimeoutException) {
            return Status.f30110d;
        }
        if (exc instanceof InterruptedException) {
            return Status.f30108b;
        }
        if (exc.getCause() instanceof rjp) {
            return new Status(((rjp) exc.getCause()).mo24655a());
        }
        return Status.f30109c;
    }

    /* renamed from: b */
    public Status mo65556b() {
        rkb rkb = this.f123374a.f43165D;
        aswy aswy = new aswy(rkb);
        rkb.mo24787a((rle) aswy);
        return (Status) aswy.mo9456a(((Long) awie.f94406b.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public Status mo65557c() {
        try {
            aucu.m76783a(this.f123374a.mo24771y(), ((Long) awie.f94407c.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
            return Status.f30107a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Status a = m104670a(e);
            Log.w("TapAndPayApiCaller", String.format(Locale.US, "Exception when calling reportInAppManualUnlock: statusCode = %d, message = %s", Integer.valueOf(a.f30115i), a.f30116j));
            return a;
        }
    }

    /* renamed from: d */
    public bjut mo65558d() {
        Status status;
        GetActiveAccountResponse getActiveAccountResponse;
        Exception e;
        try {
            getActiveAccountResponse = new GetActiveAccountResponse((AccountInfo) aucu.m76783a(this.f123374a.mo24770x(), ((Long) awie.f94407c.mo58455c()).longValue(), TimeUnit.MILLISECONDS));
            try {
                status = Status.f30107a;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            e = e3;
            getActiveAccountResponse = null;
            status = m104670a(e);
            Log.w("TapAndPayApiCaller", String.format(Locale.US, "Exception when calling getActiveAccount: statusCode = %d, message = %s", Integer.valueOf(status.f30115i), status.f30116j));
            return new bjut(status, getActiveAccountResponse);
        }
        return new bjut(status, getActiveAccountResponse);
    }

    /* renamed from: a */
    public asmi mo65552a(String str) {
        rkb rkb = this.f123374a.f43165D;
        asxb asxb = new asxb(rkb, str);
        rkb.mo24787a((rle) asxb);
        return (asmi) asxb.mo9456a(((Long) awie.f94405a.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public asmk mo65553a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest) {
        return (asmk) this.f123374a.mo24712a(retrieveInAppPaymentCredentialRequest).mo9456a(((Long) awie.f94408d.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public rjr mo65554a() {
        ConnectionResult connectionResult;
        boolean z;
        try {
            aucu.m76782a(rfi.f42868a.mo24582a(this.f123374a, new rjx[0]).mo50364a(rfg.f42865a));
            connectionResult = ConnectionResult.f30063a;
        } catch (InterruptedException | ExecutionException e) {
            if (e.getCause() instanceof rjq) {
                rjq rjq = (rjq) e.getCause();
                rkz rkz = this.f123374a.f43162A;
                if (rjq.f43153a.get(rkz) != null) {
                    z = true;
                } else {
                    z = false;
                }
                String a = rkz.mo24840a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
                sb.append("The given API (");
                sb.append(a);
                sb.append(") was not part of the availability request.");
                sdo.m34975b(z, sb.toString());
                connectionResult = (ConnectionResult) rjq.f43153a.get(rkz);
            } else {
                Log.w("TapAndPayApiCaller", "Unexpected exception when checking isServiceLayerEnabled", e);
                connectionResult = new ConnectionResult(8);
            }
        }
        if (connectionResult.mo17671b()) {
            return new rjr(Status.f30107a, true);
        }
        int i = connectionResult.f30065c;
        if (i == 16) {
            return new rjr(Status.f30107a, false);
        }
        return new rjr(new Status(i, connectionResult.f30067e), false);
    }

    /* renamed from: a */
    public rjr mo65555a(String str, String str2) {
        rkb rkb = this.f123374a.f43165D;
        aswx aswx = new aswx(rkb, str2, str);
        rkb.mo24787a((rle) aswx);
        return (rjr) aswx.mo9456a(((Long) awie.f94406b.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
    }
}
