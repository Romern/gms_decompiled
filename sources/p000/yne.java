package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yne extends bnch {

    /* renamed from: a */
    private final ynd f54120a;

    /* renamed from: b */
    private final List f54121b = new ArrayList();

    /* renamed from: c */
    private long f54122c = 0;

    /* renamed from: d */
    private final bnjq f54123d;

    public yne(Iterator it, ynd ynd) {
        this.f54123d = bnjr.m109626h(it);
        this.f54120a = ynd;
    }

    /* renamed from: b */
    private final yhu m44402b() {
        if (this.f54121b.isEmpty()) {
            return null;
        }
        yhu a = this.f54120a.mo30584a(this.f54121b, this.f54122c);
        this.f54121b.clear();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        yhu b;
        while (true) {
            if (this.f54123d.hasNext()) {
                yhu yhu = (yhu) this.f54123d.mo67862a();
                long a = yfp.m43958a(yhu);
                long b2 = yhu.mo30387b();
                if (a > b2) {
                    this.f54123d.next();
                } else {
                    long nanos = TimeUnit.MINUTES.toNanos(this.f54122c + 1);
                    if (a < nanos || b2 <= nanos) {
                        this.f54121b.add(yhu);
                    }
                    if (b2 >= nanos) {
                        b = m44402b();
                        this.f54122c = Math.max(TimeUnit.MINUTES.convert(a, TimeUnit.NANOSECONDS), this.f54122c + 1);
                        if (b != null) {
                            break;
                        }
                    } else {
                        this.f54123d.next();
                    }
                }
            } else {
                b = m44402b();
                if (b == null) {
                    return (yhu) mo67118d();
                }
            }
        }
        return b;
    }
}
