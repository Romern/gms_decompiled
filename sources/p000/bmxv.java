package p000;

import java.io.Serializable;

/* renamed from: bmxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bmxv implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public static bmxv m108566b(Object obj) {
        bmxy.m108581a(obj);
        return new bmyg(obj);
    }

    /* renamed from: c */
    public static bmxv m108567c(Object obj) {
        return obj != null ? new bmyg(obj) : bmvz.f131120a;
    }

    /* renamed from: a */
    public abstract bmxv mo66810a(bmxj bmxj);

    /* renamed from: a */
    public abstract bmxv mo66811a(bmxv bmxv);

    /* renamed from: a */
    public abstract Object mo66812a(Object obj);

    /* renamed from: a */
    public abstract boolean mo66813a();

    /* renamed from: b */
    public abstract Object mo66814b();

    /* renamed from: c */
    public abstract Object mo66815c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
