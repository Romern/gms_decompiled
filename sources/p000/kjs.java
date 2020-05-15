package p000;

import java.util.Iterator;

/* renamed from: kjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjs {

    /* renamed from: a */
    public final bngx f24276a;

    /* renamed from: b */
    public final bnic f24277b;

    /* renamed from: c */
    public final bnic f24278c;

    /* renamed from: d */
    public final bnic f24279d;

    /* renamed from: e */
    public final bngx f24280e;

    public kjs(Iterable iterable, Iterable iterable2, Iterable iterable3, Iterable iterable4) {
        this.f24276a = bngx.m109355a(iterable);
        this.f24278c = bnic.m109488a(iterable2);
        this.f24279d = bnic.m109488a(iterable3);
        bnia j = bnic.m109500j();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j.mo67752b((Iterable) ((kjp) it.next()).f24265b);
        }
        j.mo67752b(iterable2);
        j.mo67752b(iterable3);
        this.f24277b = j.mo67751a();
        this.f24280e = bngx.m109355a(iterable4);
    }
}
