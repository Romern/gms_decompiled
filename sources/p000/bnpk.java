package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpk implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f131961a;

    /* renamed from: b */
    final /* synthetic */ bnpm f131962b;

    public bnpk(bnpm bnpm, Iterator it) {
        this.f131962b = bnpm;
        this.f131961a = it;
    }

    public final boolean hasNext() {
        return this.f131961a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new bnpl((Map.Entry) this.f131961a.next());
    }

    public final void remove() {
        this.f131961a.remove();
        this.f131962b.mo68249c();
    }
}
