package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnek extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ bnel f131520a;

    public bnek(bnel bnel) {
        this.f131520a = bnel;
    }

    public final void clear() {
        this.f131520a.clear();
    }

    public final Iterator iterator() {
        bnel bnel = this.f131520a;
        Map d = bnel.mo67433d();
        if (d != null) {
            return d.values().iterator();
        }
        return new bnef(bnel);
    }

    public final int size() {
        return this.f131520a.size();
    }
}
