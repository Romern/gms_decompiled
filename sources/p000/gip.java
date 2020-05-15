package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: gip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gip extends AsyncTask {

    /* renamed from: a */
    private final Activity f18301a;

    /* renamed from: b */
    private final String f18302b;

    /* renamed from: c */
    private final String f18303c;

    /* renamed from: d */
    private final String f18304d;

    /* renamed from: e */
    private final Bundle f18305e;

    /* renamed from: f */
    private final AppDescription f18306f;

    public gip(Activity activity, String str, String str2, String str3, Bundle bundle, AppDescription appDescription) {
        this.f18301a = activity;
        this.f18302b = str;
        this.f18303c = str2;
        this.f18304d = str3;
        this.f18305e = bundle;
        this.f18306f = appDescription;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(PendingIntent pendingIntent) {
        super.onPostExecute(pendingIntent);
        Object[] objArr = {ilq.m15665a(pendingIntent), this.f18303c, this.f18304d, this.f18306f.toString()};
        try {
            this.f18301a.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            Log.e("GLSActivity", "[TokenActivity] Unable to initiate auth delegate workflow!", e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        PACLConfig pACLConfig;
        gjy gjy = new gjy(this.f18301a);
        String str = this.f18302b;
        Account account = null;
        if (str != null) {
            pACLConfig = new PACLConfig(str, null);
        } else {
            pACLConfig = null;
        }
        TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
        String str2 = this.f18303c;
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        }
        tokenWorkflowRequest.f10819i = account;
        tokenWorkflowRequest.f10813c = str2;
        tokenWorkflowRequest.f10812b = this.f18304d;
        tokenWorkflowRequest.mo7667a(this.f18305e);
        tokenWorkflowRequest.f10816f = pACLConfig;
        tokenWorkflowRequest.f10817g = this.f18305e.getBoolean("suppressProgressScreen", false);
        tokenWorkflowRequest.f10818h = this.f18306f;
        return gjy.mo11950a(tokenWorkflowRequest);
    }
}
