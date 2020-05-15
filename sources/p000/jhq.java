package p000;

import android.content.Context;
import android.os.Binder;
import android.os.SystemClock;
import java.util.Random;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: jhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhq {

    /* renamed from: a */
    public static final imn f22499a = new jhp();

    /* renamed from: b */
    private final Context f22500b;

    /* renamed from: c */
    private final boolean f22501c;

    /* renamed from: d */
    private final abop f22502d;

    /* renamed from: a */
    public final HttpResponse mo13753a(HttpUriRequest httpUriRequest) {
        long clearCallingIdentity;
        shr.m35313a(1025, Binder.getCallingUid());
        try {
            clearCallingIdentity = Binder.clearCallingIdentity();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            abop abop = this.f22502d;
            HttpResponse a = abop.mo32250a(httpUriRequest, new abot(abop));
            bxvd da = bocw.f132642f.mo74144da();
            boolean z = this.f22501c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocw bocw = (bocw) da.f164949b;
            bocw.f132644a |= 1;
            bocw.f132645b = z;
            String uri = httpUriRequest.getURI().toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocw bocw2 = (bocw) da.f164949b;
            uri.getClass();
            bocw2.f132644a |= 2;
            bocw2.f132646c = uri;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocw bocw3 = (bocw) da.f164949b;
            bocw3.f132644a |= 4;
            bocw3.f132647d = elapsedRealtime2;
            StatusLine statusLine = a.getStatusLine();
            if (statusLine != null) {
                int statusCode = statusLine.getStatusCode();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bocw bocw4 = (bocw) da.f164949b;
                bocw4.f132644a |= 8;
                bocw4.f132648e = statusCode;
            }
            bxvd da2 = boct.f132600I.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boct boct = (boct) da2.f164949b;
            boct.f132612c = 5;
            boct.f132610a |= 1;
            bocw bocw5 = (bocw) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boct boct2 = (boct) da2.f164949b;
            bocw5.getClass();
            boct2.f132617h = bocw5;
            boct2.f132610a |= 32;
            if (((double) new Random().nextFloat()) >= gnv.m13576u()) {
                new qws(this.f22500b, "ANDROID_AUTH", null).mo24335a(((boct) da2.mo74062i()).mo73642k()).mo24327b();
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            shr.m35312a();
            return a;
        } catch (Throwable th) {
            shr.m35312a();
            throw th;
        }
    }

    public jhq(Context context) {
        abop abop = new abop(context, "GoogleAuth/1.4", cbxv.m128864b(), rfy.m33550g(context) ? aboq.PERMIT_ALL : aboq.PERMIT_BLOCK);
        HttpParams httpParams = abop.f57804b;
        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
        HttpConnectionParams.setSoTimeout(httpParams, 30000);
        ConnManagerParams.setTimeout(httpParams, 30000);
        sdo.m34959a(context);
        this.f22500b = context;
        sdo.m34959a(abop);
        this.f22502d = abop;
        this.f22501c = ((rqt) rqt.f43529a.mo13145b()).mo25035a(abop, this.f22500b);
    }
}
