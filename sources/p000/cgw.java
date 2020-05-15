package p000;

import java.util.List;

/* renamed from: cgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgw {

    /* renamed from: a */
    final Object f6826a;

    /* renamed from: b */
    public List f6827b;

    /* renamed from: c */
    cgw f6828c;

    /* renamed from: d */
    cgw f6829d;

    cgw() {
        this(null);
    }

    /* renamed from: a */
    public final Object mo3883a() {
        int b = mo3884b();
        if (b > 0) {
            return this.f6827b.remove(b - 1);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo3884b() {
        List list = this.f6827b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public cgw(Object obj) {
        this.f6829d = this;
        this.f6828c = this;
        this.f6826a = obj;
    }
}
