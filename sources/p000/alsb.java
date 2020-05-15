package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alsb extends alrl {

    /* renamed from: a */
    private static final bnhe f74188a;

    /* renamed from: b */
    private static final Map f74189b;

    static {
        bnhe a = bnhe.m109410a("home", 1, "work", 2, "other", 3);
        f74188a = a;
        f74189b = alse.m61625a(a);
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
        blfc blfc = (blfc) obj;
        alrm a = alse.m61618a(blfc.f126336d, (Map) f74188a, (Integer) 0);
        String str = blfc.f126335c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a.f74170a.intValue();
        String str2 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/sip_address");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        if (str != null && str.startsWith("sip:")) {
            str = str.substring(4);
        }
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blfc) obj).f126334b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74189b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = blfc.f126331e.mo74144da();
        if (asString != null) {
            if (!asString.contains(":")) {
                asString = asString.length() == 0 ? new String("sip:") : "sip:".concat(asString);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfc blfc = (blfc) da.f164949b;
            asString.getClass();
            blfc.f126333a |= 2;
            blfc.f126335c = asString;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfc blfc2 = (blfc) da.f164949b;
            a.getClass();
            blfc2.f126333a |= 4;
            blfc2.f126336d = a;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfc blfc3 = (blfc) da.f164949b;
        a3.getClass();
        blfc3.f126334b = a3;
        blfc3.f126333a |= 1;
        return (blfc) da.mo74062i();
    }
}
