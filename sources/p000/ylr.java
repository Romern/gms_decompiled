package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ylr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ylr extends bnch {

    /* renamed from: a */
    final /* synthetic */ ylt f54045a;

    /* renamed from: b */
    private final Iterator f54046b;

    /* renamed from: c */
    private final List f54047c;

    /* renamed from: d */
    private long f54048d = 0;

    public ylr(ylt ylt, Iterator it) {
        this.f54045a = ylt;
        this.f54046b = it;
        this.f54047c = new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        while (this.f54046b.hasNext()) {
            yhu yhu = (yhu) this.f54046b.next();
            long a = yhu.mo30385a();
            long j = this.f54048d;
            if (a == j || j == 0 || this.f54047c.isEmpty()) {
                this.f54047c.add(yhu);
                this.f54048d = yhu.mo30387b();
            } else {
                yhu a2 = this.f54045a.mo30600a(this.f54047c);
                this.f54047c.clear();
                this.f54047c.add(yhu);
                this.f54048d = yhu.mo30387b();
                return a2;
            }
        }
        if (this.f54047c.isEmpty()) {
            return (yhu) mo67118d();
        }
        yhu a3 = this.f54045a.mo30600a(this.f54047c);
        this.f54047c.clear();
        return a3;
    }
}
