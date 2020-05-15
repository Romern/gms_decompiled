package p000;

/* renamed from: bmxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bmxh {
    protected bmxh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo66861a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo66862a(Object obj, Object obj2);

    /* renamed from: b */
    public final int mo66863b(Object obj) {
        if (obj != null) {
            return mo66861a(obj);
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo66864b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo66862a(obj, obj2);
    }
}
