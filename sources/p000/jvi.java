package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncAdapterType;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.UUID;

/* renamed from: jvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jvi extends AsyncTask {

    /* renamed from: a */
    private static final sek f23351a = ght.m13171a("AddAccountTask");

    /* renamed from: b */
    private final Context f23352b;

    /* renamed from: c */
    private final ilq f23353c;

    /* renamed from: d */
    private final jvg f23354d;

    /* renamed from: e */
    private final ixl f23355e;

    /* renamed from: f */
    private final String f23356f;

    /* renamed from: g */
    private final String f23357g;

    /* renamed from: h */
    private final String f23358h;

    /* renamed from: i */
    private final boolean f23359i;

    /* renamed from: j */
    private final boolean f23360j;

    /* renamed from: k */
    private final boolean f23361k;

    public jvi(Context context, ilq ilq, jvg jvg, ixl ixl, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f23352b = context;
        this.f23353c = ilq;
        this.f23354d = jvg;
        this.f23355e = ixl;
        this.f23358h = str3;
        this.f23357g = str2;
        this.f23359i = z3;
        this.f23360j = z;
        this.f23361k = z2;
        this.f23356f = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Account account;
        Object obj;
        String str;
        Intent intent;
        TokenData tokenData;
        Void[] voidArr = (Void[]) objArr;
        String uuid = UUID.randomUUID().toString();
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        AccountCredentials accountCredentials = new AccountCredentials(this.f23356f);
        accountCredentials.f10831e = this.f23357g;
        accountCredentials.f10829c = this.f23358h;
        accountSignInRequest.f10596f = accountCredentials;
        ilq ilq = this.f23353c;
        accountSignInRequest.f10592b = new AppDescription(ilq.f21309d, ilq.f21311f, uuid, uuid);
        TokenResponse a = this.f23355e.mo13418a(accountSignInRequest);
        if (a != null) {
            account = a.f10744u;
        } else {
            account = null;
        }
        if (account != null && a.mo7647b() == izj.SUCCESS) {
            if (this.f23359i) {
                ixl ixl = this.f23355e;
                TokenRequest tokenRequest = new TokenRequest(account, gnv.m13529ab());
                ilq ilq2 = this.f23353c;
                tokenRequest.f10714j = new AppDescription(ilq2.f21309d, ilq2.f21311f, uuid, uuid);
                TokenResponse a2 = ixl.mo13425a(tokenRequest);
                if (a2.mo7647b() == izj.SUCCESS && (tokenData = a2.f10746w) != null) {
                    str = this.f23355e.mo13427a(tokenData.f9944b);
                    String str2 = a.f10745v;
                    sek sek = f23351a;
                    String valueOf = String.valueOf(str2);
                    sek.mo25414c(valueOf.length() != 0 ? new String("DmStatus=") : "DmStatus=".concat(valueOf), new Object[0]);
                    boolean f = soz.m35808f(this.f23352b, account.name);
                    if (this.f23361k) {
                        String str3 = account.name;
                        Bundle a3 = jfn.m16646a();
                        if (a3.getBoolean("showOffer")) {
                            intent = (Intent) a3.getParcelable("offerIntent");
                            int i = Build.VERSION.SDK_INT;
                            if (!gnv.m13573r()) {
                                String v = gnv.m13577v();
                                if (!TextUtils.isEmpty(v)) {
                                    for (String str4 : v.split(",")) {
                                        ContentResolver.setSyncAutomatically(account, str4, true);
                                    }
                                }
                            } else {
                                for (SyncAdapterType syncAdapterType : ContentResolver.getSyncAdapterTypes()) {
                                    ContentResolver.setSyncAutomatically(account, syncAdapterType.authority, true);
                                }
                            }
                            if (this.f23360j) {
                                jvg jvg = this.f23354d;
                                jvf.f23330a.mo25412b("Sending Google play TOS broadcast...", new Object[0]);
                                Intent intent2 = new Intent("com.android.vending.TOS_ACKED");
                                intent2.setPackage("com.android.vending");
                                intent2.putExtra("TosAckedReceiver.account", account.name);
                                intent2.putExtra("TosAckedReceiver.account_type", account.type);
                                intent2.addFlags(268435456);
                                ((jvf) jvg).f23332c.sendBroadcast(intent2, "com.android.vending.TOS_ACKED");
                                jvg jvg2 = this.f23354d;
                                jvf.f23330a.mo25412b("Sending Chrome TOS broadcast...", new Object[0]);
                                Intent intent3 = new Intent("com.android.chrome.TOS_ACKED");
                                intent3.setPackage("com.android.chrome");
                                intent3.putExtra("TosAckedReceiver.account", account.name);
                                intent3.putExtra("TosAckedReceiver.account_type", account.type);
                                ((jvf) jvg2).f23332c.sendBroadcast(intent3, "com.android.chrome.TOS_ACKED");
                            }
                            f23351a.mo25414c("Added account successfully.", new Object[0]);
                            return new jvh(0, account, intent, str2, f, str, 0);
                        }
                        f23351a.mo25414c("No offers to show.", new Object[0]);
                    }
                    intent = null;
                    int i2 = Build.VERSION.SDK_INT;
                    if (!gnv.m13573r()) {
                    }
                    if (this.f23360j) {
                    }
                    f23351a.mo25414c("Added account successfully.", new Object[0]);
                    return new jvh(0, account, intent, str2, f, str, 0);
                }
            }
            str = null;
            String str22 = a.f10745v;
            sek sek2 = f23351a;
            String valueOf2 = String.valueOf(str22);
            sek2.mo25414c(valueOf2.length() != 0 ? new String("DmStatus=") : "DmStatus=".concat(valueOf2), new Object[0]);
            boolean f2 = soz.m35808f(this.f23352b, account.name);
            if (this.f23361k) {
            }
            intent = null;
            int i22 = Build.VERSION.SDK_INT;
            if (!gnv.m13573r()) {
            }
            if (this.f23360j) {
            }
            f23351a.mo25414c("Added account successfully.", new Object[0]);
            return new jvh(0, account, intent, str22, f2, str, 0);
        }
        sek sek3 = f23351a;
        Object[] objArr2 = new Object[1];
        if (a == null) {
            obj = "[no response]";
        } else {
            obj = a.mo7647b();
        }
        objArr2[0] = obj;
        sek3.mo25416d("Failed to sign in %s", objArr2);
        return new jvh(1, null, null, null, false, null, 0);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        f23351a.mo25414c("Delivering result.", new Object[0]);
        ((jvf) this.f23354d).deliverResult((jvh) obj);
    }
}
