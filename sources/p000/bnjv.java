package p000;

import java.util.ListIterator;
import java.util.Map;

/* renamed from: bnjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjv extends bnqo {

    /* renamed from: a */
    final /* synthetic */ bnka f131724a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnjv(ListIterator listIterator, bnka bnka) {
        super(listIterator);
        this.f131724a = bnka;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo67847a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final void set(Object obj) {
        boolean z;
        bnka bnka = this.f131724a;
        if (bnka.f131742c != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bnka.f131742c.f131735b = obj;
    }
}
