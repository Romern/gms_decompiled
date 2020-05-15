package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrp extends alrl {

    /* renamed from: a */
    private static final bnhe f74176a;

    /* renamed from: b */
    private static final Map f74177b;

    static {
        bnhe a = bnhe.m109411a("account", 1, "customer", 2, "network", 3, "organization", 4);
        f74176a = a;
        f74177b = alse.m61625a(a);
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
        bldw bldw = (bldw) obj;
        alrm a = alse.m61618a(bldw.f126149d, (Map) f74176a, (Integer) 5);
        String str = bldw.f126148c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a.f74170a.intValue();
        String str2 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_external_id");
        contentValues.put("data1", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str2, 5);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldw) obj).f126147b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74177b, (Integer) 5);
        String asString = contentValues.getAsString("data1");
        bxvd da = bldw.f126144e.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldw bldw = (bldw) da.f164949b;
            asString.getClass();
            bldw.f126146a |= 2;
            bldw.f126148c = asString;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldw bldw2 = (bldw) da.f164949b;
            a.getClass();
            bldw2.f126146a |= 4;
            bldw2.f126149d = a;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldw bldw3 = (bldw) da.f164949b;
        f.getClass();
        bldw3.f126147b = f;
        bldw3.f126146a |= 1;
        return (bldw) da.mo74062i();
    }
}
