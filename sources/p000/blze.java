package p000;

import java.util.Iterator;

/* renamed from: blze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blze extends bxvd implements bxxd {
    public blze() {
        super(blzf.f128337k);
    }

    /* renamed from: a */
    public final void mo66774a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        blzf blzf = (blzf) this.f164949b;
        bxvu bxvu = blzf.f128336h;
        if (!blzf.f128345g.mo73666a()) {
            blzf.f128345g = bxvk.m124019a(blzf.f128345g);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            blzf.f128345g.mo74153d(((bmfk) it.next()).f129115j);
        }
    }
}
