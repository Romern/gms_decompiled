package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.common.p079ui.ErrorChimeraActivity;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: awrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class awrb {

    /* renamed from: a */
    public final Context f94888a;

    /* renamed from: b */
    public final rfz f94889b;

    /* renamed from: c */
    public final awwt f94890c;

    /* renamed from: d */
    public final awta f94891d;

    /* renamed from: e */
    public final Bundle f94892e;

    /* renamed from: f */
    BuyFlowConfig f94893f;

    /* renamed from: g */
    public int f94894g = 8;

    /* renamed from: h */
    String f94895h;

    /* renamed from: i */
    public int f94896i = 1;

    /* renamed from: j */
    private final awra f94897j;

    /* renamed from: k */
    private final awua f94898k;

    /* renamed from: l */
    private final awsm f94899l;

    /* renamed from: m */
    private final awsz f94900m;

    /* renamed from: n */
    private Account[] f94901n;

    /* renamed from: o */
    private boolean f94902o;

    public awrb(Context context, awra awra, rfz rfz, awua awua, awwt awwt, awsm awsm, awsz awsz, awta awta, Bundle bundle) {
        this.f94888a = context;
        this.f94897j = awra;
        this.f94889b = rfz;
        this.f94898k = awua;
        this.f94890c = awwt;
        this.f94899l = awsm;
        this.f94900m = awsz;
        this.f94891d = awta;
        this.f94892e = bundle;
    }

    /* renamed from: a */
    private final awsk m80745a(BuyFlowIntegratorDataResponse buyFlowIntegratorDataResponse, IbBuyFlowInput ibBuyFlowInput) {
        IbBuyFlowInput ibBuyFlowInput2;
        Intent intent;
        byte[] bArr;
        byte[] bArr2;
        if (ibBuyFlowInput.mo60002j()) {
            ibBuyFlowInput2 = ibBuyFlowInput;
        } else {
            IbBuyFlowInput b = ibBuyFlowInput.mo59984b();
            b.mo59996f(true);
            ibBuyFlowInput2 = b;
        }
        BuyFlowConfig buyFlowConfig = this.f94893f;
        if (buyFlowConfig == null || buyFlowConfig.f110418b.f110406a == 3 || ((chhy.f188634a.mo6606a().mo85247b() && this.f94901n.length > 1) || (!chhy.f188634a.mo6606a().mo85249d().f165797a.contains(this.f94893f.f110419c) && !chhy.f188634a.mo6606a().mo85252g()))) {
            BuyFlowConfig buyFlowConfig2 = this.f94893f;
            if (buyFlowIntegratorDataResponse != null) {
                bArr = buyFlowIntegratorDataResponse.f110375a;
            } else {
                bArr = null;
            }
            if (buyFlowIntegratorDataResponse != null) {
                bArr2 = buyFlowIntegratorDataResponse.f110377c;
            } else {
                bArr2 = null;
            }
            intent = IbChimeraActivity.m93947a(buyFlowConfig2, bArr, bArr2, ibBuyFlowInput2, mo52474a(), null);
        } else {
            intent = awef.m79686a(this.f94888a, 2, this.f94893f, SystemClock.elapsedRealtime());
            Bundle bundle = new Bundle();
            bundle.putParcelable("buyflowConfig", this.f94893f);
            bundle.putParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", IbChimeraActivity.m93948a(ibBuyFlowInput2, mo52474a(), null));
            intent.putExtra("IbWidgetAdapterprotectedExtras", awsp.m80970a(bundle));
        }
        Status status = new Status(6, "BuyFlow UI needs to be shown.", spn.m35844a(this.f94888a, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
        this.f94894g = 6;
        return new awsk(Bundle.EMPTY, null, status);
    }

    /* renamed from: e */
    private final awsk m80746e(awru awru) {
        ArrayList arrayList = awru.f94946a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            awrt.m80846a(mo52481c(), (String) arrayList.get(i));
        }
        return mo52472a(10, awru.f94947b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Account mo52471a(Account[] accountArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract awsk mo52473a(IbBuyFlowInput ibBuyFlowInput);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract IbMerchantParameters mo52474a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo52475a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo52476a(awru awru);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo52477a(bxvd bxvd);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo52478a(IbBuyFlowInput ibBuyFlowInput, awru awru, Account account);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List mo52479b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract JSONObject mo52480b(awru awru);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo52481c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo52482c(awru awru);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Intent mo52483d(awru awru);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo52484d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo52485e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo52486f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo52487g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo52488h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo52489i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo52490j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo52491k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract awsk mo52492l();

    /* renamed from: m */
    public final awsk mo52493m() {
        awsk awsk;
        GcoreTapAndPayConsumerVerificationServerResponse gcoreTapAndPayConsumerVerificationServerResponse;
        JSONObject b;
        awru awru = new awru();
        String a = mo52476a(awru);
        this.f94895h = a;
        this.f94893f = awrt.m80827a(this.f94892e, a);
        if (mo52484d() == null) {
            awrt.m80846a(mo52481c(), "Request should not be null!");
            awsk = mo52472a(10, 1068);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (soz.m35807f(this.f94888a)) {
                awsk = mo52472a(409, 1);
            } else {
                awsk = mo52492l();
                if (awsk == null) {
                    awsk = null;
                }
            }
        }
        if (awsk == null) {
            Account[] a2 = adyd.m51363a(this.f94888a).mo33916a("com.google");
            this.f94901n = a2;
            Account a3 = mo52471a(a2);
            if (a3 == null) {
                a3 = awrt.m80809a(this.f94901n, this.f94892e, this.f94889b, this.f94890c, this.f94891d);
            }
            if (a3 != null) {
                this.f94892e.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", a3);
                this.f94893f = awrt.m80827a(this.f94892e, this.f94895h);
                List arrayList = new ArrayList();
                if (!(mo52485e() == null || (b = mo52480b(awru)) == null)) {
                    int c = awrt.m80863c(b, awru);
                    int e = awrt.m80872e(b, awru);
                    List f = awrt.m80873f(b, awru);
                    if (!awrt.m80850a(mo52486f(), c, e)) {
                        awsk = mo52472a(412, 1085);
                    } else {
                        arrayList = f;
                    }
                }
                if (!mo52488h()) {
                    rjr b2 = this.f94890c.mo65548b(this.f94893f, a3, this.f94895h);
                    if (!b2.f43154a.mo17710c()) {
                        Log.w("BLoadPaymentDataAction", String.format(Locale.US, "Failed to check Service Layer enabled! status = %s message = %s", Integer.valueOf(b2.f43154a.f30115i), b2.f43154a.f30116j));
                        awsk = mo52472a(8, 1056);
                    } else {
                        int length = this.f94901n.length;
                        boolean z = b2.f43155b;
                        IbBuyFlowInput a4 = IbBuyFlowInput.m94103a();
                        a4.mo59985b(mo52494n());
                        a4.mo59995e(this.f94893f.f110418b.f110406a == 3);
                        a4.mo59986b(this.f94895h);
                        bwgu a5 = awrt.m80817a(this.f94897j.mo52470a(this.f94892e.getString("androidPackageName")));
                        bxvd bxvd = (bxvd) a5.mo74142c(5);
                        bxvd.mo73625a((bxvk) a5);
                        mo52477a(bxvd);
                        a4.mo59979a((bwgu) bxvd.mo74062i());
                        a4.mo59976a(length);
                        a4.mo59991d(z);
                        mo52478a(a4, awru, a3);
                        if (mo52482c(awru)) {
                            awsk = mo52473a(a4);
                        } else if (!awru.f94946a.isEmpty()) {
                            awsk = m80746e(awru);
                        } else {
                            RefreshUserSpecificDataResponse a6 = new awsv(this.f94890c, this.f94891d, this.f94893f, a4).mo52543a();
                            int i2 = a6.f110367b;
                            if (i2 != 0) {
                                awsk = mo52472a(i2, a6.f110368c);
                            } else {
                                IbBuyFlowInput ibBuyFlowInput = a6.f110366a;
                                byal a7 = this.f94891d.mo52547a(this.f94893f.f110418b.f110406a, a3, this.f94892e.getString("androidPackageName"));
                                if (!mo52487g()) {
                                    ibBuyFlowInput.mo60004l();
                                }
                                if (arrayList.contains(6)) {
                                    ibBuyFlowInput.mo60004l();
                                }
                                if (mo52491k()) {
                                    this.f94902o = ibBuyFlowInput.mo60000h();
                                    if (!mo52490j() && this.f94902o) {
                                        if (mo52479b().contains(2) && a7.f165286f && ibBuyFlowInput.mo59974a(a7.f165283c) != 0) {
                                            try {
                                                awua awua = this.f94898k;
                                                BuyFlowConfig buyFlowConfig = this.f94893f;
                                                String str = a7.f165283c;
                                                gcoreTapAndPayConsumerVerificationServerResponse = awua.mo52575a(buyFlowConfig, new TapAndPayConsumerVerificationRequest(str, ibBuyFlowInput.mo59974a(str)));
                                            } catch (RemoteException e2) {
                                                Log.e("BLoadPaymentDataAction", "Error when performing TapAndPay consumer verification!", e2);
                                                gcoreTapAndPayConsumerVerificationServerResponse = null;
                                            }
                                            if (gcoreTapAndPayConsumerVerificationServerResponse != null && gcoreTapAndPayConsumerVerificationServerResponse.f152324b == 0) {
                                                ibBuyFlowInput.mo59978a(gcoreTapAndPayConsumerVerificationServerResponse.f152323a);
                                            } else {
                                                String str2 = "Failed to perform TapAndPay consumer verification!";
                                                if (gcoreTapAndPayConsumerVerificationServerResponse != null) {
                                                    String valueOf = String.valueOf(String.format(Locale.US, " StatusCode = %s", Integer.valueOf(gcoreTapAndPayConsumerVerificationServerResponse.f152324b)));
                                                    str2 = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
                                                }
                                                Log.w("BLoadPaymentDataAction", str2);
                                            }
                                        }
                                        ibBuyFlowInput.mo60004l();
                                        try {
                                            IbBuyFlowInput b3 = ibBuyFlowInput.mo59984b();
                                            b3.mo59996f(true);
                                            awtd a8 = BuyFlowIntegratorDataRequest.m94146a();
                                            a8.mo52554a("com.google.android.gms.wallet.ib.INSTANT_BUY");
                                            a8.mo52555a(ibBuyFlowInput.mo59992d());
                                            a8.mo52553a(IbChimeraActivity.m93948a(b3, mo52474a(), null));
                                            BuyFlowIntegratorDataResponse a9 = this.f94898k.mo52569a(this.f94893f, a8.mo52552a());
                                            int i3 = a9.f110379e;
                                            if (i3 == 5 || i3 == 6 || i3 == 22) {
                                                awsk = m80745a((BuyFlowIntegratorDataResponse) null, ibBuyFlowInput);
                                            } else if (i3 == 49) {
                                                ProcessBuyFlowResultResponse a10 = new awsq(this.f94888a, this.f94890c, this.f94899l, this.f94900m, this.f94891d, this.f94893f, new ProcessBuyFlowResultRequest(ibBuyFlowInput, mo52474a(), a9.f110377c, a9.f110376b, 0)).mo52536a();
                                                if (a10.f110362b != -1) {
                                                    Log.e("BLoadPaymentDataAction", String.format(Locale.US, "Received unexpected activityResultCode = %d", Integer.valueOf(a10.f110362b)));
                                                    int i4 = a10.f110365e;
                                                    if (i4 == 1) {
                                                        i4 = 1062;
                                                    }
                                                    awsk = mo52472a(a10.f110363c.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8), i4);
                                                } else {
                                                    Object a11 = mo52475a(a10.f110363c);
                                                    if (a11 == null) {
                                                        Log.e("BLoadPaymentDataAction", "Could not derive payment data from the buyFlowResult");
                                                        awsk = mo52472a(8, 1063);
                                                    } else {
                                                        this.f94894g = 0;
                                                        awsk = new awsk(Bundle.EMPTY, a11, Status.f30107a);
                                                    }
                                                }
                                            } else if (i3 != 50) {
                                                Log.e("BLoadPaymentDataAction", String.format(Locale.US, "Falling back to showing UI after receiving unexpected code %d from getBuyFlowIntegratorData", Integer.valueOf(a9.f110379e)));
                                                awsk = m80745a((BuyFlowIntegratorDataResponse) null, ibBuyFlowInput);
                                            } else {
                                                awsk = m80745a(a9, ibBuyFlowInput);
                                            }
                                        } catch (RemoteException e3) {
                                            Log.e("BLoadPaymentDataAction", "Error when retrieving preauth response using getBuyFlowIntegratorData!", e3);
                                            awsk = mo52472a(8, 1064);
                                        }
                                    }
                                    awsk = m80745a((BuyFlowIntegratorDataResponse) null, ibBuyFlowInput);
                                } else {
                                    awsk = m80745a((BuyFlowIntegratorDataResponse) null, ibBuyFlowInput);
                                }
                            }
                        }
                    }
                } else {
                    Intent d = mo52483d(awru);
                    if (!awru.f94946a.isEmpty()) {
                        awsk = m80746e(awru);
                    } else {
                        Status status = new Status(6, "BuyFlow UI needs to be shown.", spn.m35844a(this.f94888a, d, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                        this.f94894g = 6;
                        awsk = new awsk(Bundle.EMPTY, null, status);
                    }
                }
            } else {
                String string = this.f94888a.getString(C0126R.string.google_pay_no_google_accounts_error);
                this.f94894g = 409;
                Intent intent = new Intent();
                if (this.f94893f == null) {
                    this.f94893f = awrt.m80827a(this.f94892e, this.f94895h);
                }
                awfm.m79848a(this.f94893f, intent, 409);
                awsk = new awsk(Bundle.EMPTY, null, new Status(6, "BuyFlow UI needs to be shown.", spn.m35844a(this.f94888a, ErrorChimeraActivity.m93895a(this.f94893f, intent, string), (int) JGCastService.FLAG_PRIVATE_DISPLAY)));
            }
        }
        mo52489i();
        return awsk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo52494n();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final awsk mo52472a(int i, int i2) {
        this.f94894g = i;
        this.f94896i = i2;
        return new awsk(Bundle.EMPTY, null, new Status(i));
    }
}
