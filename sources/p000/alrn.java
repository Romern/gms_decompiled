package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: alrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrn extends alrl {

    /* renamed from: a */
    private static final bnhe f74172a;

    /* renamed from: b */
    private static final Map f74173b;

    static {
        bnhe a = bnhe.m109410a("home", 1, "work", 2, "other", 3);
        f74172a = a;
        f74173b = alse.m61625a(a);
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
        bldu bldu = (bldu) obj;
        alrm a = alse.m61618a(bldu.f126136d, (Map) f74172a, (Integer) 0);
        if (cfwp.f185848a.mo6606a().mo82837c()) {
            return alsf.m61641a(a.f74170a.intValue(), bldu.f126135c, bldu.f126137e, a.f74171b, z);
        }
        return alsf.m61641a(a.f74170a.intValue(), bldu.f126135c, null, a.f74171b, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldu) obj).f126134b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74173b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = bldu.f126131f.mo74144da();
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldu bldu = (bldu) da.f164949b;
            a.getClass();
            bldu.f126133a |= 4;
            bldu.f126136d = a;
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldu bldu2 = (bldu) da.f164949b;
            asString.getClass();
            bldu2.f126133a |= 2;
            bldu2.f126135c = asString;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldu bldu3 = (bldu) da.f164949b;
        a3.getClass();
        bldu3.f126134b = a3;
        bldu3.f126133a |= 1;
        return (bldu) da.mo74062i();
    }
}
