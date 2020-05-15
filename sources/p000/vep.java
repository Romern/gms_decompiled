package p000;

import android.net.Network;
import java.net.HttpURLConnection;

/* renamed from: vep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vep implements vfj {

    /* renamed from: a */
    public final Network f49127a;

    /* renamed from: b */
    final /* synthetic */ veq f49128b;

    /* renamed from: c */
    private final HttpURLConnection f49129c;

    /* renamed from: d */
    private final vew f49130d = new veo(this);

    public vep(veq veq, Network network, HttpURLConnection httpURLConnection) {
        this.f49128b = veq;
        this.f49127a = network;
        this.f49129c = httpURLConnection;
    }

    /* renamed from: a */
    public final HttpURLConnection mo28346a() {
        return this.f49129c;
    }

    /* renamed from: b */
    public final vew mo28347b() {
        return this.f49130d;
    }

    public final void close() {
        stp.m36307a(this.f49129c);
    }
}
