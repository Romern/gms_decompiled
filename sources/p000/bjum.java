package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderResponse;
import java.util.Locale;

/* renamed from: bjum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjum extends AsyncTaskLoader {

    /* renamed from: a */
    public PaySePerformSdkOperationAsyncTaskLoaderResponse f123356a;

    /* renamed from: b */
    public boolean f123357b = false;

    /* renamed from: c */
    public final bjyg f123358c;

    /* renamed from: d */
    private final PaySePerformSdkOperationAsyncTaskLoaderRequest f123359d;

    public bjum(Context context, PaySePerformSdkOperationAsyncTaskLoaderRequest paySePerformSdkOperationAsyncTaskLoaderRequest, bjyg bjyg) {
        super(context);
        this.f123359d = paySePerformSdkOperationAsyncTaskLoaderRequest;
        this.f123358c = bjyg;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        PaySePerformSdkOperationAsyncTaskLoaderRequest paySePerformSdkOperationAsyncTaskLoaderRequest = this.f123359d;
        int i2 = paySePerformSdkOperationAsyncTaskLoaderRequest.f151812a;
        if (i2 != 0) {
            i = i2 != 1 ? -1 : 1;
        } else {
            i = 0;
        }
        SecureElementStoredValue secureElementStoredValue = new SecureElementStoredValue(null, paySePerformSdkOperationAsyncTaskLoaderRequest.f151813b, paySePerformSdkOperationAsyncTaskLoaderRequest.f151814c, null, null, 1, null);
        PaySePerformSdkOperationAsyncTaskLoaderRequest paySePerformSdkOperationAsyncTaskLoaderRequest2 = this.f123359d;
        ExecuteSdkOperationRequest executeSdkOperationRequest = new ExecuteSdkOperationRequest(paySePerformSdkOperationAsyncTaskLoaderRequest2.f151816e, i, secureElementStoredValue, paySePerformSdkOperationAsyncTaskLoaderRequest2.f151815d, paySePerformSdkOperationAsyncTaskLoaderRequest2.f151817f);
        this.f123357b = true;
        ExecuteSdkOperationResponse a = this.f123358c.mo65623a(getContext(), executeSdkOperationRequest);
        if (!TextUtils.isEmpty(a.f81690c)) {
            this.f123356a = new PaySePerformSdkOperationAsyncTaskLoaderResponse(2, a.f81690c, a.f81691d, null, null, null, null);
        } else if (i == 0) {
            SecureElementStoredValue secureElementStoredValue2 = a.f81689b;
            bxvd da = bmit.f129635e.mo74144da();
            String str = secureElementStoredValue2.f81676a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmit bmit = (bmit) da.f164949b;
            str.getClass();
            int i3 = 1 | bmit.f129637a;
            bmit.f129637a = i3;
            bmit.f129638b = str;
            int i4 = secureElementStoredValue2.f81677b;
            int i5 = i3 | 2;
            bmit.f129637a = i5;
            bmit.f129639c = i4;
            String str2 = secureElementStoredValue2.f81678c;
            str2.getClass();
            bmit.f129637a = i5 | 4;
            bmit.f129640d = str2;
            this.f123356a = new PaySePerformSdkOperationAsyncTaskLoaderResponse(0, null, null, secureElementStoredValue2.f81682g, secureElementStoredValue2.f81680e, secureElementStoredValue2.f81679d.toPlainString(), (bmit) da.mo74062i());
        } else if (i == 1) {
            SecureElementStoredValue secureElementStoredValue3 = a.f81689b;
            bxvd da2 = bmit.f129635e.mo74144da();
            String str3 = secureElementStoredValue3.f81676a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmit bmit2 = (bmit) da2.f164949b;
            str3.getClass();
            int i6 = 1 | bmit2.f129637a;
            bmit2.f129637a = i6;
            bmit2.f129638b = str3;
            int i7 = secureElementStoredValue3.f81677b;
            int i8 = i6 | 2;
            bmit2.f129637a = i8;
            bmit2.f129639c = i7;
            String str4 = secureElementStoredValue3.f81678c;
            str4.getClass();
            bmit2.f129637a = i8 | 4;
            bmit2.f129640d = str4;
            this.f123356a = new PaySePerformSdkOperationAsyncTaskLoaderResponse(1, null, null, null, null, null, (bmit) da2.mo74062i());
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Unsupported request type: %d", -1));
        }
        return this.f123356a;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        PaySePerformSdkOperationAsyncTaskLoaderResponse paySePerformSdkOperationAsyncTaskLoaderResponse = this.f123356a;
        if (paySePerformSdkOperationAsyncTaskLoaderResponse != null) {
            deliverResult(paySePerformSdkOperationAsyncTaskLoaderResponse);
        } else if (!this.f123357b) {
            forceLoad();
        }
    }
}
