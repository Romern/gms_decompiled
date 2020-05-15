package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnmf extends bnrd {

    /* renamed from: a */
    final /* synthetic */ Iterator f131840a;

    public bnmf(Iterator it) {
        this.f131840a = it;
    }

    public final boolean hasNext() {
        return this.f131840a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return bnmt.m109798a((Map.Entry) this.f131840a.next());
    }
}
