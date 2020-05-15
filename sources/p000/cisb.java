package p000;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: cisb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisx f191316a;

    public cisb(cisx cisx) {
        this.f191316a = cisx;
    }

    public final void run() {
        cirw cirw = this.f191316a.f191376r;
        if (cirw != null) {
            try {
                cirw.mo86447b();
            } catch (IOException e) {
                Log.e(cisx.f191359a, "Exception when closing OutputChannel", e);
            }
        }
        HttpURLConnection httpURLConnection = this.f191316a.f191375q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f191316a.f191375q = null;
        }
    }
}
