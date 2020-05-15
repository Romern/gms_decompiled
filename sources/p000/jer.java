package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.login.LoginActivityChimeraTask;

/* renamed from: jer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jer extends jfh {

    /* renamed from: a */
    final /* synthetic */ LoginActivityChimeraTask f22301a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jer(LoginActivityChimeraTask loginActivityChimeraTask, Context context, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(context, tokenRequest, str, str2, z, z2, z3);
        this.f22301a = loginActivityChimeraTask;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo13669a(Object... objArr) {
        Bundle a = super.doInBackground(objArr);
        if (ilu.f21314a.f21316c == ((TokenResponse) a.getParcelable("token_response")).mo7647b()) {
            LoginActivityChimeraTask loginActivityChimeraTask = this.f22301a;
            int i = LoginActivityChimeraTask.f10997n;
            if (loginActivityChimeraTask.f11012m) {
                Log.i("GLSActivity", "Fetching market offers");
                new jfn();
                String str = this.f22301a.f11011a.f10707c;
                a.putAll(jfn.m16646a());
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return doInBackground(objArr);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        super.onPostExecute(bundle);
        TokenResponse tokenResponse = (TokenResponse) bundle.getParcelable("token_response");
        Intent intent = new Intent();
        if (tokenResponse == null) {
            Log.w("GLSActivity", String.valueOf(this.f22301a.f22279b).concat(" #onPostExecute(Intent) - No TokenResponse!"));
        } else if (tokenResponse.mo7647b() == null) {
            Log.w("GLSActivity", String.valueOf(this.f22301a.f22279b).concat(" #onPostExecute(Intent) - status is null!"));
        } else {
            intent.putExtra("token_response", tokenResponse);
        }
        jfn.m16647a(bundle, intent);
        this.f22301a.setResult(-1, intent);
        this.f22301a.finish();
    }
}
