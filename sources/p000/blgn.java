package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: blgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgn {

    /* renamed from: a */
    public List f126447a = new ArrayList();

    /* renamed from: b */
    public String f126448b = "";

    /* renamed from: c */
    public boolean f126449c = false;

    /* renamed from: a */
    public final int mo66497a() {
        return this.f126447a.size();
    }

    /* renamed from: b */
    public final blgo mo66500b() {
        blgo blgo = new blgo(this);
        this.f126447a = new ArrayList();
        this.f126448b = "";
        this.f126449c = false;
        return blgo;
    }

    /* renamed from: a */
    public final void mo66498a(blhg blhg) {
        this.f126447a.add(blhg);
    }

    /* renamed from: a */
    public final void mo66499a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f126447a.add((blhg) it.next());
        }
    }
}
