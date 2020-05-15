package p000;

import java.io.Serializable;

/* renamed from: bqcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcq extends bmxe implements Serializable {

    /* renamed from: a */
    public static final bqcq f140484a = new bqcq();
    private static final long serialVersionUID = 1;

    private bqcq() {
    }

    private Object readResolve() {
        return f140484a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        return ((Long) obj).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        return Long.decode((String) obj);
    }

    public final String toString() {
        return "Longs.stringConverter()";
    }
}
