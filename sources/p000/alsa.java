package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: alsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alsa extends alrl {

    /* renamed from: a */
    private static final bnhe f74186a;

    /* renamed from: b */
    private static final Map f74187b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("spouse", 14);
        h.mo67695b("child", 3);
        h.mo67695b("mother", 8);
        h.mo67695b("father", 5);
        h.mo67695b("parent", 9);
        h.mo67695b("brother", 2);
        h.mo67695b("sister", 13);
        h.mo67695b("friend", 6);
        h.mo67695b("relative", 12);
        h.mo67695b("domesticPartner", 4);
        h.mo67695b("manager", 7);
        h.mo67695b("assistant", 1);
        h.mo67695b("referredBy", 11);
        h.mo67695b("partner", 10);
        bnhe b = h.mo67618b();
        f74186a = b;
        f74187b = alse.m61625a(b);
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
        blfb blfb = (blfb) obj;
        alrm a = alse.m61618a(blfb.f126329c, (Map) f74186a, (Integer) 0);
        int intValue = a.f74170a.intValue();
        String str = blfb.f126330d;
        String str2 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/relation");
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blfb) obj).f126328b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74187b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        bxvd da = blfb.f126325e.mo74144da();
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfb blfb = (blfb) da.f164949b;
            a.getClass();
            blfb.f126327a |= 2;
            blfb.f126329c = a;
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfb blfb2 = (blfb) da.f164949b;
            asString.getClass();
            blfb2.f126327a |= 8;
            blfb2.f126330d = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfb blfb3 = (blfb) da.f164949b;
        f.getClass();
        blfb3.f126328b = f;
        blfb3.f126327a |= 1;
        return (blfb) da.mo74062i();
    }
}
