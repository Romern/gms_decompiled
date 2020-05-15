package p000;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: veh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class veh implements vfj {

    /* renamed from: a */
    final /* synthetic */ URL f49116a;

    /* renamed from: b */
    final /* synthetic */ vei f49117b;

    /* renamed from: c */
    private final HttpURLConnection f49118c = ((HttpURLConnection) stp.m36306a(this.f49116a, 2818));

    public veh(vei vei, URL url) {
        this.f49117b = vei;
        this.f49116a = url;
    }

    /* renamed from: a */
    public final HttpURLConnection mo28346a() {
        return this.f49118c;
    }

    /* renamed from: b */
    public final vew mo28347b() {
        return this.f49117b.f49119a;
    }

    public final void close() {
        stp.m36307a(this.f49118c);
    }
}
