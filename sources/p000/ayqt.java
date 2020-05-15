package p000;

import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ayqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqt {

    /* renamed from: a */
    public final ayqk f98301a;

    /* renamed from: b */
    public final List f98302b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final String f98303c;

    public ayqt(String str, ayqk ayqk) {
        this.f98303c = str;
        this.f98301a = ayqk;
    }

    /* renamed from: a */
    private final long m84620a(long j) {
        return j - ((ayqs) this.f98302b.get(0)).f98298b;
    }

    /* renamed from: a */
    private static final String m84621a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo54289a() {
        if (this.f98301a.mo54113U()) {
            ArrayDeque arrayDeque = new ArrayDeque();
            for (ayqs ayqs : this.f98302b) {
                if (ayqs.mo54288a()) {
                    ayqs ayqs2 = (ayqs) arrayDeque.removeFirst();
                    long j = ayqs.f98298b - ayqs2.f98298b;
                    ayqs2.f98299c += j;
                    ayqs2.f98300d += j;
                    if (!arrayDeque.isEmpty()) {
                        ((ayqs) arrayDeque.peekFirst()).f98299c -= j;
                    }
                } else {
                    arrayDeque.addFirst(ayqs);
                }
            }
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqt", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s [Exclusive time] / [Total time] ([Timestamp])", this.f98303c);
            int i = 0;
            for (ayqs ayqs3 : this.f98302b) {
                if (!ayqs3.mo54288a()) {
                    i++;
                    if (ayqs3.f98299c != ayqs3.f98300d) {
                        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl2.mo68432a("ayqt", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68427a("%s%s %sms / %sms (%s)", m84621a(i), ayqs3.f98297a, Long.valueOf(ayqs3.f98299c), Long.valueOf(ayqs3.f98300d), Long.valueOf(m84620a(ayqs3.f98298b)));
                    } else {
                        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl3.mo68432a("ayqt", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68426a("%s%s %sms (%s)", m84621a(i), ayqs3.f98297a, Long.valueOf(ayqs3.f98299c), Long.valueOf(m84620a(ayqs3.f98298b)));
                    }
                } else {
                    i--;
                }
            }
            bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
            bnsl4.mo68432a("ayqt", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String str = this.f98303c;
            List list = this.f98302b;
            bnsl4.mo68423a("%s end, %sms", str, ((ayqs) list.get(list.size() - 1)).f98298b - ((ayqs) this.f98302b.get(0)).f98298b);
        }
    }
}
