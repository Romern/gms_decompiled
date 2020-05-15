package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bksa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bksa implements bkqr {

    /* renamed from: a */
    final /* synthetic */ bksb f125186a;

    /* renamed from: b */
    private final Set f125187b = new HashSet();

    public bksa(bksb bksb) {
        this.f125186a = bksb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo66291a(bkqo bkqo);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo66292a(blgm blgm);

    /* renamed from: a */
    public final Object mo66261a(blhp blhp) {
        if (blhp.f126558b != blho.REFERENCED_ID) {
            return mo66292a(blhp.mo66553a());
        }
        String b = blhp.mo66554b();
        if (this.f125187b.contains(b)) {
            return mo66293b(this.f125186a.f125189b.mo66329b(b));
        }
        this.f125187b.add(b);
        return mo66291a(this.f125186a.f125189b.mo66329b(b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo66293b(bkqo bkqo);
}
