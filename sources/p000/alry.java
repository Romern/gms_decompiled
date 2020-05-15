package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: alry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alry extends alrl {

    /* renamed from: a */
    private static final bnhe f74184a;

    /* renamed from: b */
    private static final Map f74185b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("home", 1);
        h.mo67695b("work", 3);
        h.mo67695b("mobile", 2);
        h.mo67695b("homeFax", 5);
        h.mo67695b("workFax", 4);
        h.mo67695b("otherFax", 13);
        h.mo67695b("pager", 6);
        h.mo67695b("workMobile", 17);
        h.mo67695b("workPager", 18);
        h.mo67695b("main", 12);
        h.mo67695b("other", 7);
        bnhe b = h.mo67618b();
        f74184a = b;
        f74185b = alse.m61625a(b);
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
        blex blex = (blex) obj;
        alrm a = alse.m61618a(blex.f126300d, (Map) f74184a, (Integer) 0);
        int intValue = a.f74170a.intValue();
        String str = blex.f126299c;
        String str2 = blex.f126302f;
        String str3 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61643a(contentValues, "data4", str2);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str3, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blex) obj).f126298b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74185b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data4");
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = blex.f126295g.mo74144da();
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blex blex = (blex) da.f164949b;
            a.getClass();
            blex.f126297a |= 4;
            blex.f126300d = a;
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blex blex2 = (blex) da.f164949b;
            asString.getClass();
            blex2.f126297a |= 2;
            blex2.f126299c = asString;
        }
        if (asString2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blex blex3 = (blex) da.f164949b;
            asString2.getClass();
            blex3.f126297a |= 16;
            blex3.f126302f = asString2;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blex blex4 = (blex) da.f164949b;
        a3.getClass();
        blex4.f126298b = a3;
        blex4.f126297a |= 1;
        return (blex) da.mo74062i();
    }
}
