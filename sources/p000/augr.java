package p000;

import org.chromium.net.UrlRequest;

/* renamed from: augr */
final /* synthetic */ class augr implements Runnable {

    /* renamed from: a */
    private final UrlRequest f91785a;

    public augr(UrlRequest urlRequest) {
        this.f91785a = urlRequest;
    }

    public final void run() {
        this.f91785a.cancel();
    }
}
