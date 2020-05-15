package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: bkpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpf extends bkor {

    /* renamed from: c */
    public static final Charset f125060c = Charset.forName("utf-8");

    /* renamed from: d */
    public HttpURLConnection f125061d;

    /* renamed from: e */
    public final bkpc f125062e;

    /* renamed from: f */
    public final ExecutorService f125063f;

    /* renamed from: g */
    public Future f125064g;

    /* renamed from: h */
    private final CountDownLatch f125065h = new CountDownLatch(1);

    /* renamed from: i */
    private Future f125066i;

    /* renamed from: a */
    public final void mo66190a(IOException iOException) {
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection = this.f125061d;
        int i = 0;
        String str = "";
        if (httpURLConnection != null) {
            try {
                i = httpURLConnection.getResponseCode();
                InputStream errorStream = this.f125061d.getErrorStream();
                if (errorStream != null) {
                    CharBuffer allocate = CharBuffer.allocate(2000);
                    StringBuilder sb = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f125060c));
                    for (int read = bufferedReader.read(allocate); read > 0; read = bufferedReader.read(allocate)) {
                        allocate.flip();
                        sb.append(allocate.toString());
                        allocate.clear();
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                    str = sb2;
                }
            } catch (IOException e2) {
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                }
            } catch (IOException e4) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                }
                throw th;
            }
            try {
                mo66174a(new bkot(i, this.f125061d.getHeaderFields()));
            } catch (IOException e6) {
            }
        }
        bkos bkos = new bkos(new bkow(iOException, i, str));
        bkou bkou = this.f125029a;
        if (bkou != null) {
            bkou.mo66152a(bkos);
        }
        mo66176b();
    }

    /* renamed from: c */
    public final void mo66177c() {
        this.f125066i = ((soc) this.f125063f).submit(new bkpd(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo66178d() {
        Future future = this.f125064g;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f125066i;
        if (future2 != null) {
            future2.cancel(true);
        }
        this.f125065h.countDown();
    }

    public bkpf(bkpc bkpc, ExecutorService executorService) {
        this.f125062e = bkpc;
        this.f125063f = executorService;
    }
}
