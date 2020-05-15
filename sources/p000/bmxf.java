package p000;

import java.io.Serializable;

/* renamed from: bmxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxf extends bmxh implements Serializable {

    /* renamed from: a */
    public static final bmxf f131167a = new bmxf();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return f131167a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo66861a(Object obj) {
        return obj.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo66862a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
