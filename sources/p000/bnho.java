package p000;

import java.util.Iterator;

/* renamed from: bnho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnho extends bnrd {

    /* renamed from: a */
    final Iterator f131634a = this.f131636c.f131642b.values().iterator();

    /* renamed from: b */
    Iterator f131635b = bnjl.f131707a;

    /* renamed from: c */
    final /* synthetic */ bnht f131636c;

    public bnho(bnht bnht) {
        this.f131636c = bnht;
    }

    public final boolean hasNext() {
        return this.f131635b.hasNext() || this.f131634a.hasNext();
    }

    public final Object next() {
        if (!this.f131635b.hasNext()) {
            this.f131635b = ((bngm) this.f131634a.next()).iterator();
        }
        return this.f131635b.next();
    }
}
