package p000;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: ameg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ameg extends amdr {
    public ameg(amdq amdq, Person person, Map map, boolean z) {
        super(amdq, person, map, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41131a(Object obj, int i, Object obj2) {
        ((ContentValues) obj2).put("nickname", ((Person.Nicknames) obj).f83358d);
    }
}
