package p000;

/* renamed from: bp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0058bp implements C0056bn {
    /* renamed from: a */
    public C0053bl mo3261a(Class cls) {
        try {
            return (C0053bl) cls.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        }
    }
}
