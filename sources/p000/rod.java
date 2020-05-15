package p000;

import android.os.Looper;

/* renamed from: rod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rod {

    /* renamed from: a */
    public volatile Object f43428a;

    /* renamed from: b */
    public volatile rob f43429b;

    /* renamed from: c */
    private final roa f43430c;

    public rod(Looper looper, Object obj, String str) {
        this.f43430c = new roa(this, looper);
        sdo.checkIfNull(obj, "Listener must not be null");
        this.f43428a = obj;
        sdo.m34977c(str);
        this.f43429b = new rob(obj, str);
    }

    /* renamed from: a */
    public final void mo24967a() {
        this.f43428a = null;
        this.f43429b = null;
    }

    /* renamed from: a */
    public final void mo24968a(roc roc) {
        sdo.checkIfNull(roc, "Notifier must not be null");
        this.f43430c.sendMessage(this.f43430c.obtainMessage(1, roc));
    }
}
