package p000;

import android.os.AsyncTask;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.frp.FrpInterstitialChimeraActivity;

/* renamed from: jdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdt extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ FrpInterstitialChimeraActivity f22233a;

    public jdt(FrpInterstitialChimeraActivity frpInterstitialChimeraActivity) {
        this.f22233a = frpInterstitialChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ixl ixl = new ixl(this.f22233a);
        boolean z = ixl.mo13424a(CheckFactoryResetPolicyComplianceRequest.m6563a(this.f22233a.f10943a)).f10600b;
        if (z) {
            ixl.mo13428a();
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f22233a.setResult(!((Boolean) obj).booleanValue() ? 0 : -1);
        this.f22233a.finish();
    }
}
