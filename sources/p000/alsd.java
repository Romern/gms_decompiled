package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alsd extends alrl {

    /* renamed from: a */
    private static final bnhe f74190a;

    /* renamed from: b */
    private static final Map f74191b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("home", 4);
        h.mo67695b("work", 5);
        h.mo67695b("blog", 2);
        h.mo67695b("profile", 3);
        h.mo67695b("homePage", 1);
        h.mo67695b("ftp", 6);
        h.mo67695b("other", 7);
        bnhe b = h.mo67618b();
        f74190a = b;
        f74191b = alse.m61625a(b);
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
        blff blff = (blff) obj;
        alrm a = alse.m61618a(blff.f126356d, (Map) f74190a, (Integer) 0);
        String str = blff.f126355c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a.f74170a.intValue();
        String str2 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/website");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blff) obj).f126354b;
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
        String asString = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74191b, (Integer) 0);
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = blff.f126351e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blff blff = (blff) da.f164949b;
        asString.getClass();
        int i = blff.f126353a | 2;
        blff.f126353a = i;
        blff.f126355c = asString;
        if (a != null) {
            a.getClass();
            blff.f126353a = i | 4;
            blff.f126356d = a;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blff blff2 = (blff) da.f164949b;
        a3.getClass();
        blff2.f126354b = a3;
        blff2.f126353a |= 1;
        return (blff) da.mo74062i();
    }
}
