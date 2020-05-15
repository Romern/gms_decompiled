package p000;

import android.content.Context;
import java.net.HttpURLConnection;

/* renamed from: abor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class abor {

    /* renamed from: a */
    public final abox f57810a;

    /* renamed from: b */
    public final aboq f57811b;

    public abor(Context context, aboq aboq) {
        this.f57810a = new abox(context);
        sdo.m34959a(aboq);
        this.f57811b = aboq;
    }

    /* renamed from: a */
    public final void mo32262a(HttpURLConnection httpURLConnection, int i) {
        if (httpURLConnection != null) {
            this.f57810a.mo32270a(httpURLConnection.getURL().toString(), i);
            httpURLConnection.disconnect();
        }
    }
}
