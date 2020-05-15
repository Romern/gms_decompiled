package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yed {

    /* renamed from: a */
    public int f53687a = 0;

    /* renamed from: b */
    public final List f53688b;

    /* renamed from: c */
    public final List f53689c;

    /* renamed from: d */
    private final caae f53690d;

    /* renamed from: e */
    private final ydw f53691e;

    public yed(caae caae, List list, ydw ydw) {
        this.f53690d = caae;
        this.f53691e = ydw;
        this.f53688b = list;
        this.f53689c = new ArrayList(Collections.nCopies(list.size(), null));
    }

    /* renamed from: a */
    public final void mo30395a(int i, cadn cadn) {
        yfd yfd = (yfd) this.f53689c.get(i);
        if (yfd == null) {
            yfd = this.f53691e.mo30393b(this.f53690d);
            this.f53689c.set(i, yfd);
        }
        yfd.mo30381a(cadn);
    }
}
