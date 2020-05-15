package p000;

/* renamed from: fnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnh {

    /* renamed from: a */
    private final fng f16912a;

    /* renamed from: b */
    private final Object f16913b;

    /* renamed from: c */
    private final Object f16914c = new Object();

    private fnh(Object obj, fng fng) {
        this.f16913b = obj;
        this.f16912a = fng;
    }

    /* renamed from: a */
    static fnh m12006a(Object obj, fng fng) {
        return new fnh(obj, fng);
    }

    /* renamed from: a */
    public final Object mo11021a() {
        synchronized (this.f16914c) {
        }
        try {
            return this.f16912a.mo11017a();
        } catch (IllegalStateException | SecurityException e) {
            return this.f16913b;
        }
    }
}
