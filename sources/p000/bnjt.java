package p000;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: bnjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjt extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ bnkc f131722a;

    public bnjt(bnkc bnkc) {
        this.f131722a = bnkc;
    }

    public final ListIterator listIterator(int i) {
        return new bnka(this.f131722a, i);
    }

    public final int size() {
        return this.f131722a.f131755d;
    }
}
