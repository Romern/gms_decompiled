package p000;

import java.io.Serializable;

/* renamed from: bmxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxg extends bmxh implements Serializable {

    /* renamed from: a */
    public static final bmxg f131168a = new bmxg();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return f131168a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo66861a(Object obj) {
        return System.identityHashCode(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo66862a(Object obj, Object obj2) {
        return false;
    }
}
