package p000;

import java.util.Set;

/* renamed from: btgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class btgg implements brum {

    /* renamed from: b */
    private final bdgg f148770b = bdgg.m90733a(bthv.f148878a, bdgg.m90734a("ValidatePerson"));

    /* renamed from: c */
    private final bnic f148771c = bnic.m109493a("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readonly", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite", "https://www.googleapis.com/auth/plus.me");

    /* renamed from: a */
    public final bdgg mo69982a() {
        return this.f148770b;
    }

    /* renamed from: b */
    public final bruo mo69983b() {
        return bthv.f148884af;
    }

    /* renamed from: c */
    public final Set mo69984c() {
        return this.f148771c.isEmpty() ? bthv.f148884af.f148912ag : this.f148771c;
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
        return this.f148770b.f105583a;
    }
}
