package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;
import com.google.android.gms.payse.internal.GetSeCardsRequest;
import com.google.android.gms.payse.internal.GetSeCardsResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bjyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjyf implements bjyg {

    /* renamed from: b */
    public bjye f123621b;

    /* renamed from: c */
    public SecureElementStoredValue[] f123622c;

    /* renamed from: d */
    public Account f123623d;

    /* renamed from: e */
    public long f123624e = -1;

    /* renamed from: f */
    public final rjx f123625f;

    public bjyf(Context context) {
        this.f123625f = new rjx(context, aljw.f73583a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    protected static Status m104886a(Exception exc) {
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
    private final void m104887b() {
        if (this.f123621b == null) {
            this.f123621b = new bjye();
        }
    }

    /* renamed from: a */
    public final void mo65625a() {
        this.f123622c = null;
        this.f123623d = null;
        this.f123624e = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52104a(Context context, int i, long j, rkk rkk, String str) {
    }

    /* renamed from: a */
    public final ExecuteSdkOperationResponse mo65623a(Context context, ExecuteSdkOperationRequest executeSdkOperationRequest) {
        long j;
        int i;
        alkb alkb;
        aucb aucb;
        if (!chgr.m148702b()) {
            return null;
        }
        int i2 = executeSdkOperationRequest.f81684b;
        if (i2 == 0) {
            j = chgo.m148689c();
            i = 3;
        } else if (i2 == 1) {
            j = chgo.f188594a.mo6606a().mo85218a();
            i = 4;
        } else {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unsupported PaySE operation type: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (!chgo.m148688b()) {
                rjx rjx = this.f123625f;
                roz b = rpa.m34196b();
                b.f43472a = new aljy(executeSdkOperationRequest);
                b.f43473b = new Feature[]{alju.f73582a};
                aucb = rjx.mo24732b(b.mo24977a());
            } else {
                m104887b();
                bmxy.m108601b(chgo.m148688b(), "FakePaySeClient shouldn't be delegated when enableFakePayseClient is false.");
                ExecuteSdkOperationResponse executeSdkOperationResponse = new ExecuteSdkOperationResponse(null, null, String.valueOf(Status.f30109c.f30115i), Status.f30109c.f30116j);
                String a = bjye.m104885a("executeSdkOperationResponse");
                Status status = Status.f30107a;
                if (!TextUtils.isEmpty(a)) {
                    byte[] b2 = boan.f132470d.mo68796b(a);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(b2, 0, b2.length);
                    obtain.setDataPosition(0);
                    executeSdkOperationResponse = (ExecuteSdkOperationResponse) ExecuteSdkOperationResponse.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                aucb = aucu.m76778a(new alkb(status, executeSdkOperationResponse));
            }
            alkb = (alkb) aucu.m76783a(aucb, j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Status a2 = m104886a(e);
            alkb = new alkb(a2, new ExecuteSdkOperationResponse(null, null, String.valueOf(a2.f30115i), a2.f30116j));
        }
        mo52104a(context, i, elapsedRealtime, alkb, executeSdkOperationRequest.f81683a.name);
        if (i == 4 && alkb.f73590a.equals(Status.f30107a)) {
            mo65625a();
        }
        return alkb.f73591b;
    }

    /* renamed from: a */
    public final GetSeCardsResponse mo65624a(Context context, Account account, GetSeCardsRequest getSeCardsRequest) {
        alkc alkc;
        aucb aucb;
        Account account2;
        if (!chgr.m148702b()) {
            return new GetSeCardsResponse(new SecureElementStoredValue[0]);
        }
        if (!(this.f123622c == null || (account2 = this.f123623d) == null || !account2.equals(account) || this.f123624e == -1)) {
            if (SystemClock.elapsedRealtime() - this.f123624e <= TimeUnit.SECONDS.toMillis(chgo.f188594a.mo6606a().mo85221d())) {
                return new GetSeCardsResponse(this.f123622c);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (!chgo.m148688b()) {
                rjx rjx = this.f123625f;
                roz b = rpa.m34196b();
                b.f43472a = new aljx(getSeCardsRequest);
                b.f43473b = new Feature[]{alju.f73582a};
                aucb = rjx.mo24701a(b.mo24977a());
            } else {
                m104887b();
                bmxy.m108601b(chgo.m148688b(), "FakePaySeClient shouldn't be delegated when enableFakePayseClient is false.");
                String a = bjye.m104885a("getSeCardsResponse");
                GetSeCardsResponse getSeCardsResponse = new GetSeCardsResponse(new SecureElementStoredValue[0]);
                if (!TextUtils.isEmpty(a)) {
                    byte[] b2 = boan.f132470d.mo68796b(a);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(b2, 0, b2.length);
                    obtain.setDataPosition(0);
                    obtain.recycle();
                    getSeCardsResponse = (GetSeCardsResponse) GetSeCardsResponse.CREATOR.createFromParcel(obtain);
                }
                aucb = aucu.m76778a(new alkc(Status.f30107a, getSeCardsResponse));
            }
            alkc = (alkc) aucu.m76783a(aucb, chgo.m148689c(), TimeUnit.MILLISECONDS);
            this.f123622c = alkc.f73592a.f81693a;
            this.f123623d = account;
            this.f123624e = SystemClock.elapsedRealtime();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            alkc = new alkc(m104886a(e), new GetSeCardsResponse(new SecureElementStoredValue[0]));
        }
        mo52104a(context, 2, elapsedRealtime, alkc, account.name);
        return alkc.f73592a;
    }

    /* renamed from: a */
    public final boolean mo65626a(Context context) {
        rjr rjr;
        aucb aucb;
        if (!chgr.m148702b()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (chgo.m148688b()) {
                m104887b();
                bmxy.m108601b(chgo.m148688b(), "FakePaySeClient shouldn't be delegated when enableFakePayseClient is false.");
                aucb = aucu.m76778a(new rjr(Status.f30107a, true));
            } else {
                rjx rjx = this.f123625f;
                int i = Build.VERSION.SDK_INT;
                aucb = rjx.mo24735b(BuildConfig.APPLICATION_ID, 512) ? (rjx.mo24735b("com.google.android.apps.walletnfcrel", 0) || rjx.mo24735b("com.google.commerce.tapandpay.dev", 0)) ? aucu.m76778a(new rjr(Status.f30107a, true)) : aucu.m76778a(new rjr(Status.f30107a, false)) : aucu.m76778a(new rjr(Status.f30107a, false));
            }
            rjr = (rjr) aucu.m76783a(aucb, 20, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            rjr = new rjr(m104886a(e), false);
        }
        mo52104a(context, 1, elapsedRealtime, rjr, null);
        return rjr.f43155b;
    }
}
