package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;

/* renamed from: aopr */
final /* synthetic */ class aopr implements Callable {

    /* renamed from: a */
    private final String f78662a;

    /* renamed from: b */
    private final String f78663b;

    public aopr(String str, String str2) {
        this.f78662a = str;
        this.f78663b = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e3 A[Catch:{ all -> 0x00ed }] */
    public final Object call() {
        String str = this.f78662a;
        String str2 = this.f78663b;
        bxvd da = bymu.f167075c.mo74144da();
        bxvd da2 = bymw.f167083c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bymw bymw = (bymw) da2.f164949b;
        str.getClass();
        bymw.f167085a = str;
        str2.getClass();
        bymw.f167086b = str2;
        bymw bymw2 = (bymw) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bymu bymu = (bymu) da.f164949b;
        bymw2.getClass();
        bymu.f167078b = bymw2;
        bymu.f167077a = 2;
        byte[] k = ((bymu) da.mo74062i()).mo73642k();
        HttpURLConnection httpURLConnection = null;
        try {
            String d = cghx.m145516d();
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
            sb.append(d);
            sb.append("/recaptcha/api3/ac");
            httpURLConnection = aoqr.m66289a(sb.toString(), 21505);
            try {
                httpURLConnection.setConnectTimeout((int) cghx.m145514b());
                httpURLConnection.setReadTimeout((int) cghx.m145515c());
                httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                httpURLConnection.setRequestProperty("Content-type", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Length", Integer.toString(k.length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(k);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    bymv bymv = (bymv) bxvk.m124011a(bymv.f167079c, httpURLConnection.getInputStream(), bxus.m123744c());
                    stp.m36307a(httpURLConnection);
                    return bymv;
                }
                throw new aopo("Failed to fetch landing token", responseCode);
            } catch (IOException e) {
                e = e;
                try {
                    if (e instanceof MalformedURLException) {
                    }
                } catch (Throwable th) {
                    th = th;
                    stp.m36307a(httpURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                stp.m36307a(httpURLConnection);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            if (e instanceof MalformedURLException) {
                throw new aoqt("Failed to connect to reCAPTCHA challenge endpoint", e);
            }
            throw new aoqt(e.getMessage(), e);
        } catch (Throwable th3) {
            th = th3;
            stp.m36307a(httpURLConnection);
            throw th;
        }
    }
}
