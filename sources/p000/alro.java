package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alro extends alrl {

    /* renamed from: a */
    private static final bnhe f74174a;

    /* renamed from: b */
    private static final Map f74175b;

    static {
        bnhe a = bnhe.m109409a("anniversary", 1, "other", 2);
        f74174a = a;
        f74175b = alse.m61625a(a);
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
        bldv bldv = (bldv) obj;
        alrm a = alse.m61618a(bldv.f126143d, (Map) f74174a, (Integer) 0);
        String b = alse.m61630b(bldv.f126142c);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        amig.m62939a();
        if (((Boolean) amif.f74934a.mo41191a()).booleanValue() && alse.m61629a(b)) {
            b = alse.m61634d(b);
        }
        return alsf.m61640a(a.f74170a.intValue(), b, a.f74171b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldv) obj).f126141b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74175b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        bxvd da = bldv.f126138e.mo74144da();
        if (asString != null) {
            amig.m62939a();
            if (((Boolean) amif.f74934a.mo41191a()).booleanValue() && alse.m61632b(asString)) {
                asString = alse.m61633c(asString);
            }
            Long e = alse.m61635e(asString);
            if (e != null) {
                long a2 = alse.m61617a(e.longValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bldv bldv = (bldv) da.f164949b;
                bldv.f126140a |= 2;
                bldv.f126142c = a2;
            }
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldv bldv2 = (bldv) da.f164949b;
            a.getClass();
            bldv2.f126140a |= 8;
            bldv2.f126143d = a;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldv bldv3 = (bldv) da.f164949b;
        f.getClass();
        bldv3.f126141b = f;
        bldv3.f126140a |= 1;
        return (bldv) da.mo74062i();
    }
}
