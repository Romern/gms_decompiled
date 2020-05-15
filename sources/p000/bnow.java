package p000;

import java.util.Iterator;

/* renamed from: bnow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnow extends bnch {

    /* renamed from: a */
    final Iterator f131939a = this.f131940b.f131941a.iterator();

    /* renamed from: b */
    final /* synthetic */ bnox f131940b;

    public bnow(bnox bnox) {
        this.f131940b = bnox;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        while (this.f131939a.hasNext()) {
            Object next = this.f131939a.next();
            if (this.f131940b.f131942b.contains(next)) {
                return next;
            }
        }
        return mo67118d();
    }
}
