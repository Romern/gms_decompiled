package p000;

/* renamed from: bhuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuj {

    /* renamed from: a */
    private static bhwp f119641a;

    /* renamed from: a */
    public static synchronized bhwp m101555a() {
        bhwp bhwp;
        synchronized (bhuj.class) {
            if (f119641a == null) {
                m101556a(new bhui());
            }
            bhwp = f119641a;
        }
        return bhwp;
    }

    /* renamed from: a */
    public static synchronized void m101556a(bhwo bhwo) {
        synchronized (bhuj.class) {
            f119641a = new bhwp("PlaceInferenceEngine", bhwo);
        }
    }
}
