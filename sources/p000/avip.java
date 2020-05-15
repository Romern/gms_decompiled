package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;

/* renamed from: avip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avip extends AsyncTask {

    /* renamed from: a */
    private final deu f93239a;

    /* renamed from: b */
    private final String f93240b;

    /* renamed from: c */
    private final String f93241c;

    /* renamed from: d */
    private final avir f93242d;

    /* renamed from: e */
    private aviq f93243e;

    /* renamed from: f */
    private final boolean f93244f;

    public avip(deu deu, String str, String str2, avir avir) {
        this.f93239a = deu;
        this.f93240b = str;
        this.f93241c = str2;
        sdo.m34959a(avir);
        this.f93242d = avir;
        boolean z = false;
        if (!TextUtils.isEmpty(this.f93240b) && this.f93239a != null) {
            z = true;
        }
        this.f93244f = z;
    }

    /* renamed from: a */
    private final void m78591a() {
        aviq aviq = this.f93243e;
        if (aviq != null) {
            aviq.dismissAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        Void[] voidArr = (Void[]) objArr;
        if (!this.f93244f) {
            return this.f93241c;
        }
        try {
            String valueOf = String.valueOf(Uri.encode(this.f93241c));
            str = gik.m13216d(this.f93239a, new Account(this.f93240b, "com.google"), valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) avis.f93246a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avip", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("unable to retrieve token");
            String str2 = this.f93240b;
            String str3 = this.f93241c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 59 + String.valueOf(str3).length());
            sb.append("https://accounts.google.com/AccountChooser?Email=");
            sb.append(str2);
            sb.append("&continue=");
            sb.append(str3);
            str = sb.toString();
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("sarp", "1").toString();
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        m78591a();
        this.f93242d.mo51281e();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        m78591a();
        this.f93242d.mo51280a((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f93244f) {
            String string = this.f93239a.getResources().getString(C0126R.string.udc_url_login_notice, this.f93240b);
            Bundle bundle = new Bundle();
            bundle.putString("ProgressDialogMessage", string);
            aviq aviq = new aviq();
            aviq.setCancelable(true);
            aviq.setArguments(bundle);
            this.f93243e = aviq;
            aviq.show(this.f93239a.getSupportFragmentManager(), "WebLoginProgressDialog");
            this.f93243e.f93245a = new avio(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo51275a(Void... voidArr) {
        String str;
        if (!this.f93244f) {
            return this.f93241c;
        }
        try {
            String valueOf = String.valueOf(Uri.encode(this.f93241c));
            str = gik.m13216d(this.f93239a, new Account(this.f93240b, "com.google"), valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) avis.f93246a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avip", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("unable to retrieve token");
            String str2 = this.f93240b;
            String str3 = this.f93241c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 59 + String.valueOf(str3).length());
            sb.append("https://accounts.google.com/AccountChooser?Email=");
            sb.append(str2);
            sb.append("&continue=");
            sb.append(str3);
            str = sb.toString();
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("sarp", "1").toString();
    }
}
