package p000;

/* renamed from: barc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class barc implements barb {

    /* renamed from: a */
    private final barb f101593a;

    /* renamed from: b */
    private volatile boolean f101594b;

    /* renamed from: c */
    private Object f101595c;

    public barc(barb barb) {
        this.f101593a = barb;
    }

    /* renamed from: a */
    public final Object mo32621a() {
        if (!this.f101594b) {
            synchronized (this) {
                if (!this.f101594b) {
                    Object a = this.f101593a.mo32621a();
                    this.f101595c = a;
                    this.f101594b = true;
                    return a;
                }
            }
        }
        return this.f101595c;
    }
}
