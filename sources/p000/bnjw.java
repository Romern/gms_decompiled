package p000;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: bnjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjw extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ bnkc f131725a;

    public bnjw(bnkc bnkc) {
        this.f131725a = bnkc;
    }

    public final ListIterator listIterator(int i) {
        bnka bnka = new bnka(this.f131725a, i);
        return new bnjv(bnka, bnka);
    }

    public final int size() {
        return this.f131725a.f131755d;
    }
}
