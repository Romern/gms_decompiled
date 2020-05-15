package p000;

import java.io.Serializable;

/* renamed from: bmzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmzk implements Serializable, bmzi {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bmzi f131267a;

    /* renamed from: b */
    volatile transient boolean f131268b;

    /* renamed from: c */
    transient Object f131269c;

    public bmzk(bmzi bmzi) {
        bmxy.m108581a(bmzi);
        this.f131267a = bmzi;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        if (!this.f131268b) {
            synchronized (this) {
                if (!this.f131268b) {
                    Object a = this.f131267a.mo6606a();
                    this.f131269c = a;
                    this.f131268b = true;
                    return a;
                }
            }
        }
        return this.f131269c;
    }

    public final String toString() {
        Object obj;
        if (this.f131268b) {
            String valueOf = String.valueOf(this.f131269c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f131267a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
