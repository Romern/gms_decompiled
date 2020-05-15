package p000;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: bkpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkpd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bkpf f125056a;

    public bkpd(bkpf bkpf) {
        this.f125056a = bkpf;
    }

    public final void run() {
        byte[] bArr;
        try {
            String str = this.f125056a.f125062e.f125055d;
            if (str != null) {
                bArr = str.getBytes(bkpf.f125060c);
            } else {
                bArr = null;
            }
            bkpf bkpf = this.f125056a;
            bkpf.f125061d = (HttpURLConnection) stp.m36306a(new URL(bkpf.f125062e.f125053b), 2818);
            this.f125056a.f125061d.setConnectTimeout(30000);
            this.f125056a.f125061d.setReadTimeout(90000);
            bkpf bkpf2 = this.f125056a;
            bkpf2.f125061d.setRequestMethod(bkpf2.f125062e.f125052a.f125051c);
            for (Map.Entry entry : this.f125056a.f125062e.f125054c.entrySet()) {
                this.f125056a.f125061d.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (bArr != null) {
                this.f125056a.f125061d.setDoOutput(true);
                this.f125056a.f125061d.setFixedLengthStreamingMode(bArr.length);
            }
            this.f125056a.f125061d.connect();
            synchronized (this.f125056a) {
                bkpf bkpf3 = this.f125056a;
                if (bkpf3.f125030b == 2) {
                    bkpf3.f125030b = 4;
                } else {
                    throw new IllegalStateException("Expected connection state to be CONNECTING.");
                }
            }
            if (bArr != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f125056a.f125061d.getOutputStream());
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
            }
            bkpf bkpf4 = this.f125056a;
            bkpf4.mo66174a(new bkot(bkpf4.f125061d.getResponseCode(), this.f125056a.f125061d.getHeaderFields()));
            bkpf bkpf5 = this.f125056a;
            bkpf5.f125064g = ((soc) bkpf5.f125063f).submit(new bkpe(bkpf5));
        } catch (IOException e) {
            this.f125056a.mo66190a(e);
        }
    }
}
