package p000;

/* renamed from: vez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vez implements vew {

    /* renamed from: a */
    public static final vew f49153a = new vey();

    /* renamed from: b */
    private int f49154b = 0;

    /* renamed from: b */
    private final synchronized boolean m40259b() {
        return this.f49154b != 0;
    }

    /* renamed from: a */
    public final synchronized int mo28370a() {
        return this.f49154b;
    }

    /* renamed from: a */
    public final synchronized void mo28371a(int i) {
        this.f49154b = i;
        notifyAll();
    }

    /* renamed from: a */
    public final void mo28356a(String str) {
        if (m40259b()) {
            throw new vex(str);
        }
    }
}
