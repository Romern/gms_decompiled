package p000;

import java.util.HashMap;

/* renamed from: g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1009g extends C1207n {

    /* renamed from: a */
    public final HashMap f17755a = new HashMap();

    /* renamed from: a */
    public final C1097j mo11575a(Object obj) {
        return (C1097j) this.f17755a.get(obj);
    }

    /* renamed from: b */
    public final Object mo11576b(Object obj) {
        Object b = super.mo11576b(obj);
        this.f17755a.remove(obj);
        return b;
    }

    /* renamed from: c */
    public final boolean mo11577c(Object obj) {
        return this.f17755a.containsKey(obj);
    }
}
