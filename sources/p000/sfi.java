package p000;

import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.LinkedHashSet;

/* renamed from: sfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfi {
    /* renamed from: a */
    public static Audience m35163a(Audience audience, AudienceMember audienceMember) {
        sdo.m34966a(audience, "Audience must not be null.");
        sdo.m34966a(audienceMember, "Audience member must not be null.");
        LinkedHashSet linkedHashSet = new LinkedHashSet(audience.f30287b);
        linkedHashSet.add(audienceMember);
        sfd sfd = new sfd(audience);
        sfd.mo25467a(linkedHashSet);
        return sfd.mo25465a();
    }

    /* renamed from: b */
    public static Audience m35165b(Audience audience, AudienceMember audienceMember) {
        sdo.m34966a(audience, "Audience must not be null.");
        sdo.m34966a(audienceMember, "Audience member must not be null.");
        LinkedHashSet linkedHashSet = new LinkedHashSet(audience.f30287b);
        linkedHashSet.remove(audienceMember);
        sfd sfd = new sfd(audience);
        sfd.mo25467a(linkedHashSet);
        return sfd.mo25465a();
    }

    /* renamed from: a */
    public static boolean m35164a(Audience audience) {
        sdo.m34966a(audience, "Audience must not be null.");
        return !audience.f30290e && audience.f30287b.isEmpty();
    }
}
