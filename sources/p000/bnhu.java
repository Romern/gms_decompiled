package p000;

import java.util.Iterator;

/* renamed from: bnhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhu extends bnrd {

    /* renamed from: a */
    int f131644a;

    /* renamed from: b */
    Object f131645b;

    /* renamed from: c */
    final /* synthetic */ Iterator f131646c;

    public bnhu(Iterator it) {
        this.f131646c = it;
    }

    public final boolean hasNext() {
        return this.f131644a > 0 || this.f131646c.hasNext();
    }

    public final Object next() {
        int i = this.f131644a;
        if (i <= 0) {
            bnno bnno = (bnno) this.f131646c.next();
            this.f131645b = bnno.f131866a;
            i = bnno.mo68118a();
        }
        this.f131644a = i - 1;
        return this.f131645b;
    }
}
