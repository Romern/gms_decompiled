package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhn extends bnrd {

    /* renamed from: a */
    final Iterator f131630a = this.f131633d.f131642b.entrySet().iterator();

    /* renamed from: b */
    Object f131631b = null;

    /* renamed from: c */
    Iterator f131632c = bnjl.f131707a;

    /* renamed from: d */
    final /* synthetic */ bnht f131633d;

    public bnhn(bnht bnht) {
        this.f131633d = bnht;
    }

    public final boolean hasNext() {
        return this.f131632c.hasNext() || this.f131630a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f131632c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f131630a.next();
            this.f131631b = entry.getKey();
            this.f131632c = ((bngm) entry.getValue()).iterator();
        }
        return bnmt.m109797a(this.f131631b, this.f131632c.next());
    }
}
