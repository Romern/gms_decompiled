package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: ameh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ameh extends amdr {
    public ameh(amdq amdq, Person person, Map map, boolean z) {
        super(amdq, person, map, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41131a(Object obj, int i, Object obj2) {
        ContentValues contentValues = (ContentValues) obj2;
        contentValues.putNull("compressed_avatar_url");
        String str = ((Person.Images) obj).f83277e;
        if (TextUtils.isEmpty(str)) {
            contentValues.put("has_avatar", (Integer) 0);
            return;
        }
        contentValues.put("has_avatar", (Integer) 1);
        if (i == 0) {
            contentValues.put("compressed_avatar_url", ancc.m63969a(str));
        }
    }
}
