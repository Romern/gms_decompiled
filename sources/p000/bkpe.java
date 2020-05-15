package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;

/* renamed from: bkpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkpe implements Runnable {

    /* renamed from: a */
    final CharBuffer f125057a = CharBuffer.allocate(2000);

    /* renamed from: b */
    BufferedReader f125058b = null;

    /* renamed from: c */
    final /* synthetic */ bkpf f125059c;

    public bkpe(bkpf bkpf) {
        this.f125059c = bkpf;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        try {
            this.f125058b = new BufferedReader(new InputStreamReader(this.f125059c.f125061d.getInputStream(), bkpf.f125060c));
            while (true) {
                if (Thread.interrupted() || this.f125059c.f125030b != 4) {
                    BufferedReader bufferedReader = this.f125058b;
                } else {
                    int read = this.f125058b.read(this.f125057a);
                    if (read > 0) {
                        this.f125057a.flip();
                        bkpf bkpf = this.f125059c;
                        CharBuffer charBuffer = this.f125057a;
                        int position = charBuffer.position();
                        int limit = this.f125057a.limit();
                        bkou bkou = bkpf.f125029a;
                        if (bkou != null) {
                            bkou.mo66154a(charBuffer, position, limit);
                        }
                        this.f125057a.clear();
                    } else if (read == -1) {
                        this.f125059c.mo66176b();
                        BufferedReader bufferedReader2 = this.f125058b;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e) {
                            }
                        }
                        httpURLConnection = this.f125059c.f125061d;
                        if (httpURLConnection == null) {
                            return;
                        }
                    }
                }
            }
            BufferedReader bufferedReader3 = this.f125058b;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (IOException e2) {
                }
            }
            httpURLConnection = this.f125059c.f125061d;
            if (httpURLConnection == null) {
                return;
            }
        } catch (IOException e3) {
            this.f125059c.mo66190a(e3);
            BufferedReader bufferedReader4 = this.f125058b;
            if (bufferedReader4 != null) {
                try {
                    bufferedReader4.close();
                } catch (IOException e4) {
                }
            }
            httpURLConnection = this.f125059c.f125061d;
            if (httpURLConnection == null) {
                return;
            }
        } catch (Throwable th) {
            BufferedReader bufferedReader5 = this.f125058b;
            if (bufferedReader5 != null) {
                try {
                    bufferedReader5.close();
                } catch (IOException e5) {
                }
            }
            HttpURLConnection httpURLConnection2 = this.f125059c.f125061d;
            if (httpURLConnection2 != null) {
                stp.m36307a(httpURLConnection2);
            }
            throw th;
        }
        stp.m36307a(httpURLConnection);
    }
}
