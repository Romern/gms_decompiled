package p000;

import java.util.Iterator;

/* renamed from: bonx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonx extends bxvd implements bxxd {
    public bonx() {
        super(bony.f133869c);
    }

    /* renamed from: a */
    public final void mo68919a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bony bony = (bony) this.f164949b;
        bony bony2 = bony.f133869c;
        if (!bony.f133872b.mo73666a()) {
            bony.f133872b = bxvk.m124019a(bony.f133872b);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bony.f133872b.mo74153d(((bxzv) it.next()).mo3214a());
        }
    }
}
