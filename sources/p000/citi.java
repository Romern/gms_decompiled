package p000;

import org.chromium.net.UrlRequest;

/* renamed from: citi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class citi extends UrlRequest.StatusListener {

    /* renamed from: a */
    private final UrlRequest.StatusListener f191410a;

    public citi(UrlRequest.StatusListener statusListener) {
        this.f191410a = statusListener;
    }

    public final void onStatus(int i) {
        this.f191410a.onStatus(i);
    }
}
