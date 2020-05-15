package p000;

import java.util.Set;

/* renamed from: btfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class btfs implements brum {

    /* renamed from: b */
    private final bdgg f148742b = bdgg.m90733a(bthv.f148878a, bdgg.m90734a("SearchDirectoryPeople"));

    /* renamed from: c */
    private final bnic f148743c = bnic.m109493a("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readonly", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite", "https://www.googleapis.com/auth/plus.me");

    /* renamed from: a */
    public final bdgg mo69982a() {
        return this.f148742b;
    }

    /* renamed from: b */
    public final bruo mo69983b() {
        return bthv.f148884af;
    }

    /* renamed from: c */
    public final Set mo69984c() {
        return this.f148743c.isEmpty() ? bthv.f148884af.f148912ag : this.f148743c;
    }

    /* renamed from: d */
    public final boolean mo69985d() {
        return false;
    }

    /* renamed from: e */
    public final int mo69986e() {
        return 2;
    }

    public final String toString() {
        return this.f148742b.f105583a;
    }
}
