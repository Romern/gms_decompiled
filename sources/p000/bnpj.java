package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpj implements Iterator {

    /* renamed from: a */
    final Iterator f131957a = this.f131960d.f131971a.entrySet().iterator();

    /* renamed from: b */
    Map.Entry f131958b;

    /* renamed from: c */
    Iterator f131959c = bnjn.INSTANCE;

    /* renamed from: d */
    final /* synthetic */ bnpr f131960d;

    public bnpj(bnpr bnpr) {
        this.f131960d = bnpr;
    }

    public final boolean hasNext() {
        return this.f131957a.hasNext() || this.f131959c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f131959c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f131957a.next();
            this.f131958b = entry;
            this.f131959c = ((Map) entry.getValue()).entrySet().iterator();
        }
        Map.Entry entry2 = (Map.Entry) this.f131959c.next();
        return new bnql(this.f131958b.getKey(), entry2.getKey(), entry2.getValue());
    }

    public final void remove() {
        this.f131959c.remove();
        if (((Map) this.f131958b.getValue()).isEmpty()) {
            this.f131957a.remove();
            this.f131958b = null;
        }
    }
}
