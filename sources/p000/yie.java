package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yie implements yig {

    /* renamed from: a */
    public final yln f53855a;

    /* renamed from: b */
    public yhe f53856b;

    /* renamed from: c */
    public final caae f53857c;

    /* renamed from: d */
    public final List f53858d = new ArrayList();

    public yie(yln yln, yhe yhe, caae caae) {
        this.f53855a = yln;
        this.f53856b = yhe;
        this.f53857c = caae;
    }

    /* renamed from: a */
    public final void mo30534a(yif yif) {
        yif.mo30539a(this);
    }

    public final String toString() {
        String b = this.f53855a.mo30564b();
        String valueOf = String.valueOf(this.f53856b);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(valueOf).length());
        sb.append(b);
        sb.append(" ");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30536a(yig yig) {
        this.f53858d.add(yig);
    }
}
