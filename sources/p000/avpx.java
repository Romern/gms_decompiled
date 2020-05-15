package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;

/* renamed from: avpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avpx implements Runnable {

    /* renamed from: a */
    private final HttpURLConnection f93739a;

    /* renamed from: b */
    private final int f93740b;

    public avpx(HttpURLConnection httpURLConnection, int i) {
        this.f93739a = httpURLConnection;
        this.f93740b = i;
    }

    public final void run() {
        try {
            int responseCode = this.f93739a.getResponseCode();
            if (responseCode != this.f93740b) {
                throw new RuntimeException("Execution exception", new avpt(this.f93739a.getHeaderFields(), String.format(Locale.US, "Unexpected status code: %d.", Integer.valueOf(responseCode))));
            }
        } catch (IOException e) {
            throw new RuntimeException("Execution exception", new avpt("Unable to get response code.", e));
        }
    }
}
