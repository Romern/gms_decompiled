package p000;

import com.google.android.places.Subscription;
import java.util.concurrent.Callable;

/* renamed from: bhrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhrh implements Callable {

    /* renamed from: a */
    final /* synthetic */ bhri f119376a;

    /* renamed from: b */
    private final Subscription f119377b;

    public bhrh(bhri bhri, Subscription subscription) {
        this.f119376a = bhri;
        this.f119377b = subscription;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bhrc bhrc = this.f119376a.f119382h;
        if (bhrc.f119368b) {
            bhrc.f119367a.mo25067b(this.f119377b);
            if (this.f119376a.f119383i.isEmpty()) {
                bhri bhri = this.f119376a;
                bhri.f119381g.mo64176a(bhri.f119382h.mo64178b());
            }
            this.f119376a.mo25984a((Object) this.f119377b);
            return aemj.m52157b(0);
        }
        throw new IllegalStateException("Tried to remove a subscription before we were ready");
    }
}
