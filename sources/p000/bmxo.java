package p000;

import java.util.Iterator;

/* renamed from: bmxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxo extends bmxr {

    /* renamed from: a */
    final /* synthetic */ bmxr f131173a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bmxo(bmxr bmxr, bmxr bmxr2) {
        super(bmxr2);
        this.f131173a = bmxr;
    }

    /* renamed from: a */
    public final void mo66869a(Appendable appendable, Iterator it) {
        bmxy.m108582a(appendable, "appendable");
        bmxy.m108582a(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(bmxr.m108545a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.f131173a.f131179b);
                appendable.append(bmxr.m108545a(next2));
            }
        }
    }
}
