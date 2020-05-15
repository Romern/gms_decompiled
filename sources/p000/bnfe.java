package p000;

import java.util.Iterator;

/* renamed from: bnfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfe extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131556a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnfe(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f131556a = iterable2;
    }

    public final Iterator iterator() {
        return this.f131556a.iterator();
    }
}
