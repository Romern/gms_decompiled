package p000;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: amef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amef extends amdr {
    public amef(amdq amdq, Person person, Map map, boolean z) {
        super(amdq, person, map, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41131a(Object obj, int i, Object obj2) {
        Person.Names names = (Person.Names) obj;
        ContentValues contentValues = (ContentValues) obj2;
        contentValues.put("display_name", names.f83341b);
        contentValues.put("formatted_name", names.f83343d);
        contentValues.put("given_name", names.f83344e);
        contentValues.put("family_name", names.f83342c);
        contentValues.put("middle_name", names.f83348i);
        contentValues.put("honorific_suffix", names.f83346g);
        contentValues.put("honorific_prefix", names.f83345f);
        contentValues.put("yomi_given_name", names.f83350k);
        contentValues.put("yomi_family_name", names.f83349j);
        contentValues.put("yomi_honorific_suffix", names.f83352m);
        contentValues.put("yomi_honorific_prefix", names.f83351l);
    }
}
