package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrj extends alrl {

    /* renamed from: a */
    private static final bnhe f74168a;

    /* renamed from: b */
    private static final Map f74169b;

    static {
        bnhe a = bnhe.m109410a("home", 2, "work", 1, "freeBusy", 3);
        f74168a = a;
        f74169b = alse.m61625a(a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alse.a(java.lang.String, java.util.Map, java.lang.Integer):alrm
     arg types: [java.lang.String, bnhe, int]
     candidates:
      alse.a(java.util.List, java.lang.String, alrl):java.util.List
      alse.a(bleu, java.lang.String, int):boolean
      alse.a(java.lang.String, java.util.Map, java.lang.Integer):alrm */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        bldj bldj = (bldj) obj;
        alrm a = alse.m61618a(bldj.f126093d, (Map) f74168a, (Integer) 4);
        String str = bldj.f126092c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a.f74170a.intValue();
        String str2 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_calendar_link");
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str2, 4);
        contentValues.put("data4", Integer.valueOf(z ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldj) obj).f126091b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alse.a(java.lang.Integer, java.lang.String, java.util.Map, java.lang.Integer):java.lang.String
     arg types: [java.lang.Integer, java.lang.String, java.util.Map, int]
     candidates:
      alse.a(bleu, java.lang.String, java.lang.String, java.util.List):java.util.List
      alse.a(java.util.List, java.lang.String, alrl, int):java.util.List
      alse.a(java.lang.Integer, java.lang.String, java.util.Map, java.lang.Integer):java.lang.String */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        boolean z;
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74169b, (Integer) 4);
        String asString = contentValues.getAsString("data1");
        amig.m62939a();
        if (((Boolean) amic.f74931a.mo41191a()).booleanValue()) {
            Long asLong = contentValues.getAsLong("data4");
            if (asLong == null || asLong.longValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = alse.m61626a(contentValues);
        }
        bxvd da = bldj.f126088e.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldj bldj = (bldj) da.f164949b;
            asString.getClass();
            bldj.f126090a |= 2;
            bldj.f126092c = asString;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldj bldj2 = (bldj) da.f164949b;
            a.getClass();
            bldj2.f126090a = 4 | bldj2.f126090a;
            bldj2.f126093d = a;
        }
        bleu a2 = alse.m61619a(str, z);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldj bldj3 = (bldj) da.f164949b;
        a2.getClass();
        bldj3.f126091b = a2;
        bldj3.f126090a |= 1;
        return (bldj) da.mo74062i();
    }
}
