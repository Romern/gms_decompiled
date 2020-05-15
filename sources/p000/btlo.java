package p000;

import java.util.Iterator;

/* renamed from: btlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlo extends bxvd implements bxxd {
    public btlo() {
        super(btlp.f149399e);
    }

    /* renamed from: a */
    public final void mo70826a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btlp btlp = (btlp) this.f164949b;
        btlp btlp2 = btlp.f149399e;
        if (!btlp.f149404d.mo73666a()) {
            btlp.f149404d = bxvk.m124019a(btlp.f149404d);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            btlp.f149404d.mo74153d(((btnv) it.next()).mo3214a());
        }
    }
}
