package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: bjjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjf implements bjew {

    /* renamed from: a */
    private final RequestQueue f122817a;

    /* renamed from: b */
    private final Context f122818b;

    /* renamed from: c */
    private final bjjb f122819c;

    public bjjf(Context context, RequestQueue requestQueue, bjjb bjjb) {
        this.f122818b = context;
        this.f122817a = requestQueue;
        this.f122819c = bjjb;
    }

    /* renamed from: a */
    public static bjfc m103648a(int i, WidgetConfig widgetConfig, String str, byte[] bArr, bwmj bwmj, bwmi bwmi, long j, int i2, GoogleAccountStateSnapshot googleAccountStateSnapshot) {
        Intent a = bjfc.m103290a("o2NetworkAction", widgetConfig);
        a.putExtra("actionRequestType", i);
        a.putExtra("urlPath", str);
        a.putExtra("bodyBytes", bArr);
        a.putExtra("googleAccountStateSnapshot", googleAccountStateSnapshot);
        if (bwmj != null) {
            a.putExtra("sessionData", bwmj.serializeToBytes());
        }
        bjhq.m103513b(a, "secureDataHeader", bwmi);
        a.putExtra("clientSessionId", j);
        a.putExtra("logEndpoint", i2 - 1);
        return new bjfc(a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent;
        String str;
        bwmj bwmj;
        byte[] bArr;
        boolean z;
        int i;
        bjfd bjfd;
        Intent intent2 = bjfc.f122612a;
        WidgetConfig b = bjfc.mo65079b();
        String a = b.mo71762a();
        String a2 = bjje.m103643a(b.f151761b);
        String stringExtra = intent2.getStringExtra("urlPath");
        String valueOf = String.valueOf(a2);
        String valueOf2 = String.valueOf(stringExtra);
        String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        int intExtra = intent2.getIntExtra("actionRequestType", 0);
        byte[] byteArrayExtra = intent2.getByteArrayExtra("bodyBytes");
        byte[] byteArrayExtra2 = intent2.hasExtra("sessionData") ? intent2.getByteArrayExtra("sessionData") : null;
        bwmi bwmi = (bwmi) bjhq.m103510a(intent2, "secureDataHeader", bwmi.f160277b);
        long longExtra = intent2.getLongExtra("clientSessionId", 0);
        int a3 = bpse.m112230a(intent2.getIntExtra("logEndpoint", 0));
        GoogleAccountStateSnapshot googleAccountStateSnapshot = (GoogleAccountStateSnapshot) intent2.getParcelableExtra("googleAccountStateSnapshot");
        Context context = this.f122818b;
        if (bjhz.m103567a().mo65276l()) {
            intent = intent2;
            bmxy.m108582a(googleAccountStateSnapshot, "googleAccountStateSnapshot can not be null");
        } else {
            intent = intent2;
        }
        if (byteArrayExtra2 != null) {
            str = "actionRequestType";
            bwmj = (bwmj) bjhq.m103512a(byteArrayExtra2, (bxxk) bwmj.f160280a.mo74142c(7));
        } else {
            str = "actionRequestType";
            bwmj = null;
        }
        int i2 = b.f151763d;
        String packageName = context.getPackageName();
        String str3 = "bodyBytes";
        boolean z2 = intExtra != 0;
        Account account = b.f151760a;
        Account[] accountArr = googleAccountStateSnapshot != null ? googleAccountStateSnapshot.f151759a : null;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        String str4 = str2;
        try {
            bjku bjku = new bjku(context.getApplicationContext());
            bjku.f122895b = bwmj;
            bjku.f122898e = longExtra;
            bjku.f122904k = 1;
            bjku.f122896c = true;
            bjku.f122905l = 3;
            bjku.f122897d = i2;
            bjku.f122899f = packageName;
            bjku.f122900g = bjyu.m104932c(null);
            bjku.f122901h = z2;
            bjku.f122902i = account;
            bjku.f122903j = accountArr;
            bwmg a4 = bjku.mo65343a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            if (intExtra == 0) {
                bwzf bwzf = (bwzf) bjhq.m103512a(byteArrayExtra, (bxxk) bwzf.f161591f.mo74142c(7));
                bxvd bxvd = (bxvd) bwzf.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bwzf);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwzf bwzf2 = (bwzf) bxvd.f164949b;
                a4.getClass();
                bwzf2.f161594b = a4;
                bwzf2.f161593a |= 1;
                bArr = ((bwzf) bxvd.mo74062i()).serializeToBytes();
            } else if (intExtra != 1) {
                bArr = byteArrayExtra;
            } else {
                bwzg bwzg = (bwzg) bjhq.m103512a(byteArrayExtra, (bxxk) bwzg.f161599e.mo74142c(7));
                bxvd bxvd2 = (bxvd) bwzg.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bwzg);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bwzg bwzg2 = (bwzg) bxvd2.f164949b;
                a4.getClass();
                bwzg2.f161602b = a4;
                bwzg2.f161601a |= 1;
                bArr = ((bwzg) bxvd2.mo74062i()).serializeToBytes();
            }
            bxvd da = bpsi.f138959d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsi bpsi = (bpsi) da.f164949b;
            int i3 = a3 - 1;
            if (a3 != 0) {
                bpsi.f138962b = i3;
                int i4 = bpsi.f138961a | 1;
                bpsi.f138961a = i4;
                int i5 = a3;
                long j = a4.f160263h;
                bpsi.f138961a = i4 | 4;
                bpsi.f138963c = j;
                bpsi bpsi2 = (bpsi) da.mo74062i();
                if (i5 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bjja.m103638a(longExtra, a, bpsi2);
                }
                RequestFuture newFuture = RequestFuture.newFuture();
                try {
                    newFuture.setRequest(this.f122817a.add(new bjjg(str4, bArr, newFuture, this.f122819c.mo65089a(this.f122818b, b.f151760a, bjje.m103645b(b.f151761b), z, longExtra), bwmi != null ? bwmi.f160279a : null)));
                    Intent a5 = bjfd.m103295a(0);
                    a5.putExtra(str3, ((NetworkResponse) newFuture.get()).data);
                    a5.putExtra(str, intExtra);
                    bjfd = new bjfd(a5);
                    i = 2;
                } catch (AuthFailureError | InterruptedException | ExecutionException e) {
                    Log.e("O2NetworkAction", String.format(Locale.US, "Network Error: %s", e));
                    Intent a6 = bjfd.m103295a(2);
                    int i6 = 1004;
                    if (e instanceof AuthFailureError) {
                        i6 = 1002;
                    } else if (e instanceof ExecutionException) {
                        VolleyError volleyError = (VolleyError) e.getCause();
                        if (volleyError instanceof NoConnectionError) {
                            i6 = 1003;
                        } else if (volleyError instanceof NetworkError) {
                            i6 = 1001;
                        }
                    }
                    a6.putExtra("actionResponseErrorType", i6);
                    a6.putExtras(intent);
                    bjfd = new bjfd(a6);
                    i = 5;
                }
                if (z) {
                    bjja.m103639a(longExtra, a, bpsi2, i);
                }
                return bjfd;
            }
            throw null;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
