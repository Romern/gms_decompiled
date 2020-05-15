package p000;

import java.util.Iterator;

/* renamed from: bnpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpa extends bnch {

    /* renamed from: a */
    final /* synthetic */ Iterator f131947a;

    /* renamed from: b */
    final /* synthetic */ Iterator f131948b;

    /* renamed from: c */
    final /* synthetic */ bnpb f131949c;

    public bnpa(bnpb bnpb, Iterator it, Iterator it2) {
        this.f131949c = bnpb;
        this.f131947a = it;
        this.f131948b = it2;
    }

    /* renamed from: a */
    public final Object mo8969a() {
        while (this.f131947a.hasNext()) {
            Object next = this.f131947a.next();
            if (!this.f131949c.f131951b.contains(next)) {
                return next;
            }
        }
        while (this.f131948b.hasNext()) {
            Object next2 = this.f131948b.next();
            if (!this.f131949c.f131950a.contains(next2)) {
                return next2;
            }
        }
        return mo67118d();
    }
}
