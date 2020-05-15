package p000;

import android.content.Context;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: qdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qdi implements qcy {

    /* renamed from: a */
    protected final SSLSocketFactory f40980a;

    /* renamed from: b */
    private final qdt f40981b;

    /* renamed from: c */
    private final abop f40982c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
     arg types: [android.content.Context, java.lang.String, int, boolean]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void */
    public qdi(qdu qdu) {
        this.f40981b = qdu.f41035e;
        boolean booleanValue = ((Boolean) rsv.f43636y.mo25081c()).booleanValue();
        Context context = qdu.f41043m;
        int i = rfx.f42891a;
        StringBuilder sb = new StringBuilder(30);
        sb.append("CheckinService-");
        sb.append(i);
        sb.append("/2.0");
        abop abop = new abop(context, sb.toString(), false, booleanValue);
        this.f40982c = abop;
        SSLSocketFactory a = abop.mo32249a();
        if (a == null) {
            Log.w("CheckinConnFactory", "client socket factory is null, using default socket factory");
            a = (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        this.f40980a = a;
    }

    /* renamed from: a */
    public final bdbg mo23922a() {
        qdt qdt = this.f40981b;
        boolean z = qdt.f41030c;
        return new bdbg(new bdbl(qdt.f41028a), new bdbh(this.f40980a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final aboy mo23928b() {
        return (aboy) this.f40982c.f57803a;
    }

    /* renamed from: b */
    public final HttpURLConnection mo23926b(String str) {
        HttpURLConnection a = mo23924a(str);
        if (a instanceof HttpsURLConnection) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f40980a);
        }
        a.setRequestMethod(DataParser.CONNECT_TYPE_POST);
        return a;
    }

    /* renamed from: a */
    public String mo23923a(Context context) {
        int i;
        if (!sre.m36083c(context)) {
            i = 250;
        } else {
            i = 500;
        }
        try {
            return ((PseudonymousIdToken) aucu.m76783a(aonx.m66186a(context).mo43118a(), (long) i, TimeUnit.MILLISECONDS)).f83468a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    /* renamed from: a */
    public HttpURLConnection mo23924a(String str) {
        return ((aboy) this.f40982c.f57803a).mo32271a(new URL(str));
    }

    /* renamed from: a */
    public HttpURLConnection mo23925a(String str, bdbg bdbg) {
        URL url = new URL(str);
        cauf cauf = new cauf();
        cauf.f176011m = bdbg;
        HttpURLConnection a = new cauh(cauf).mo74899a(url);
        if (a instanceof HttpsURLConnection) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f40980a);
        }
        a.setRequestMethod(DataParser.CONNECT_TYPE_POST);
        return a;
    }
}
