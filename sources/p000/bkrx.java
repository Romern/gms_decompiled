package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bkrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkrx {

    /* renamed from: a */
    private final Set f125185a = new HashSet();

    /* renamed from: a */
    public final boolean mo66290a(blhp blhp, blhp blhp2, bkqk bkqk, bkqk bkqk2) {
        if (blhp == null || blhp2 == null) {
            return blhp == null && blhp2 == null;
        }
        if (blhp.f126558b != blho.REFERENCED_ID || blhp2.f126558b != blho.REFERENCED_ID) {
            return bkta.m106588a(blhp, blhp2);
        }
        bksb b = ((bksp) bkqk).mo66227a(blhp.mo66554b());
        bkqo a = bkqk2.mo66227a(blhp2.mo66554b());
        bkrw bkrw = new bkrw(b, a);
        if (this.f125185a.contains(bkrw)) {
            return true;
        }
        this.f125185a.add(bkrw);
        if (b == null) {
            return a == null;
        }
        return b.mo66245a(this, a);
    }
}
