package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: blha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blha {

    /* renamed from: a */
    public int f126489a = 0;

    /* renamed from: b */
    public List f126490b = new ArrayList();

    /* renamed from: c */
    public String f126491c = "";

    public blha() {
    }

    /* renamed from: a */
    public final blhb mo66520a() {
        blhb blhb = new blhb(this);
        this.f126489a = 0;
        this.f126490b = new ArrayList();
        this.f126491c = "";
        return blhb;
    }

    public blha(blhb blhb) {
        this.f126489a = blhb.f126493b;
        this.f126490b = new ArrayList(blhb.f126494c);
        this.f126491c = blhb.f126495d;
    }

    /* renamed from: a */
    public final void mo66521a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f126490b.add((blhp) it.next());
        }
    }
}
