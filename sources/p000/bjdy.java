package p000;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: bjdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjdy {

    /* renamed from: a */
    public final bjdw f122563a;

    public bjdy(bjdw bjdw) {
        this.f122563a = bjdw;
    }

    /* renamed from: a */
    public final HttpResponse mo65022a(HttpUriRequest httpUriRequest) {
        HttpResponse execute = this.f122563a.execute(bixi.m102934a(httpUriRequest, (bixj) null));
        bixi.m102936a(httpUriRequest, execute, null);
        return execute;
    }
}
