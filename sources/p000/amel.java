package p000;

import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: amel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amel extends amdr {

    /* renamed from: a */
    final /* synthetic */ almm f74825a;

    /* renamed from: b */
    final /* synthetic */ ames f74826b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amel(ames ames, amdq amdq, Person person, Map map, boolean z, almm almm) {
        super(amdq, person, map, z);
        this.f74826b = ames;
        this.f74825a = almm;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41131a(Object obj, int i, Object obj2) {
        this.f74826b.f74842i.mo41159a(((Long) obj2).longValue(), (Person.Emails) obj, this.f74825a);
    }
}
