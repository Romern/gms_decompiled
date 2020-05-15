package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;

/* renamed from: asbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbj extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ AccountChallengeWebView f88658a;

    /* renamed from: b */
    private final String f88659b;

    /* renamed from: c */
    private String f88660c;

    /* renamed from: d */
    private String f88661d;

    /* renamed from: e */
    private String f88662e;

    /* renamed from: f */
    private String f88663f;

    /* renamed from: g */
    private final Context f88664g = this.f88658a.getContext();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public asbj(AccountChallengeWebView accountChallengeWebView, String str, String str2) {
        this.f88658a = accountChallengeWebView;
        this.f88659b = str;
        sdo.checkIfNull((Object) str2, (Object) "authCode cannot be null.");
        this.f88660c = str2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        sdp sdp;
        Void[] voidArr = (Void[]) objArr;
        if (!TextUtils.isEmpty(this.f88660c)) {
            Context context = this.f88664g;
            String str = this.f88659b;
            String str2 = this.f88660c;
            Logger Logger = AccountChallengeWebView.f108239a;
            sdp = new asbg(context, str, str2);
        } else if (!TextUtils.isEmpty(this.f88661d)) {
            Context context2 = this.f88664g;
            String str3 = this.f88659b;
            String str4 = this.f88661d;
            String str5 = this.f88662e;
            String str6 = this.f88663f;
            Logger logger2 = AccountChallengeWebView.f108239a;
            sdp = new asbh(context2, str3, str4, str5, str6);
        } else {
            sdp = null;
        }
        if (sdp != null) {
            AccountChallengeWebView accountChallengeWebView = this.f88658a;
            Logger logger3 = AccountChallengeWebView.f108239a;
            accountChallengeWebView.mo59182g();
            AccountChallengeWebView.m92965a(sdp);
            return null;
        }
        throw new IllegalStateException("Neither authCode nor credential were set");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.f88658a.mo59176c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public asbj(AccountChallengeWebView accountChallengeWebView, String str, String str2, String str3, String str4) {
        this.f88658a = accountChallengeWebView;
        this.f88659b = str;
        sdo.checkIfNull((Object) str2, (Object) "credentials cannot be null.");
        this.f88661d = str2;
        this.f88662e = str3;
        this.f88663f = str4;
    }
}
