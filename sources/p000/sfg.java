package p000;

import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: sfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sfg implements amfa {

    /* renamed from: a */
    private final AudienceMember f44113a;

    public sfg(AudienceMember audienceMember) {
        sdo.m34975b(audienceMember.mo17847c(), "AudienceMember must be a person.");
        this.f44113a = audienceMember;
    }

    /* renamed from: a */
    public final String mo25472a() {
        return this.f44113a.f30295e;
    }

    /* renamed from: b */
    public final String mo25473b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final String mo25474c() {
        return this.f44113a.f30296f;
    }

    /* renamed from: d */
    public final String mo25475d() {
        return this.f44113a.f30297g;
    }

    /* renamed from: e */
    public final String[] mo25476e() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amfa) {
            return mo25472a().equals(((amfa) obj).mo25472a());
        }
        return false;
    }

    /* renamed from: f */
    public final Iterable mo25478f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final Iterable mo25479g() {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return mo25472a().hashCode();
    }
}
