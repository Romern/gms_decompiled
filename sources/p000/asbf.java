package p000;

import android.os.AsyncTask;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: asbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbf extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ AccountChallengeWebView f88648a;

    public asbf(AccountChallengeWebView accountChallengeWebView) {
        this.f88648a = accountChallengeWebView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            AccountChallengeWebView accountChallengeWebView = this.f88648a;
            sek sek = AccountChallengeWebView.f108239a;
            accountChallengeWebView.f108248h.tryAcquire(accountChallengeWebView.f108247g, 30, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            AccountChallengeWebView.f108239a.mo25415d("Interrupted. Finishing this activity.", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        AccountChallengeWebView.f108239a.mo25409a("Returning results.", new Object[0]);
        AccountChallengeWebView accountChallengeWebView = this.f88648a;
        arwo arwo = accountChallengeWebView.f108255o;
        if (arwo != null) {
            ArrayList arrayList = accountChallengeWebView.f108246f;
            Activity activity = arwo.f88372a.getActivity();
            if (activity != null) {
                ((arwr) activity).mo48885a(arrayList);
            }
        }
    }
}
