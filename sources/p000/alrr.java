package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: alrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrr extends alrl {

    /* renamed from: a */
    private static final bnhe f74178a;

    /* renamed from: b */
    private static final Map f74179b;

    /* renamed from: c */
    private static final bnhe f74180c;

    /* renamed from: d */
    private static final Map f74181d;

    static {
        bnhe a = bnhe.m109410a("home", 1, "work", 2, "other", 3);
        f74178a = a;
        f74179b = alse.m61625a(a);
        bnha h = bnhe.m109414h();
        h.mo67695b("aim", 0);
        h.mo67695b("msn", 1);
        h.mo67695b("yahoo", 2);
        h.mo67695b("skype", 3);
        h.mo67695b("qq", 4);
        h.mo67695b("googleTalk", 5);
        h.mo67695b("icq", 6);
        h.mo67695b("jabber", 7);
        h.mo67695b("netMeeting", 8);
        bnhe b = h.mo67618b();
        f74180c = b;
        f74181d = alse.m61625a(b);
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
        bled bled = (bled) obj;
        alrm a = alse.m61618a(bled.f126181d, (Map) f74178a, (Integer) 0);
        String str = bled.f126182e;
        Integer num = (Integer) f74180c.get(str);
        String str2 = null;
        if (num != null) {
            str = null;
        } else if (!TextUtils.isEmpty(str)) {
            num = -1;
        } else {
            str = null;
        }
        int intValue = a.f74170a.intValue();
        String str3 = bled.f126180c;
        if (num != null) {
            str2 = num.toString();
        }
        String str4 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/im");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        alsf.m61643a(contentValues, "data1", str3);
        alsf.m61643a(contentValues, "data5", str2);
        alsf.m61643a(contentValues, "data6", str);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str4, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bled) obj).f126179b;
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
        String str2;
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74179b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        Integer asInteger = contentValues.getAsInteger("data5");
        if (asInteger == null || asInteger.intValue() != -1) {
            str2 = (String) f74181d.get(asInteger);
        } else {
            str2 = contentValues.getAsString("data6");
        }
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = bled.f126176f.mo74144da();
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bled bled = (bled) da.f164949b;
            a.getClass();
            bled.f126178a |= 4;
            bled.f126181d = a;
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bled bled2 = (bled) da.f164949b;
            asString.getClass();
            bled2.f126178a |= 2;
            bled2.f126180c = asString;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bled bled3 = (bled) da.f164949b;
            str2.getClass();
            bled3.f126178a |= 16;
            bled3.f126182e = str2;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bled bled4 = (bled) da.f164949b;
        a3.getClass();
        bled4.f126179b = a3;
        bled4.f126178a |= 1;
        return (bled) da.mo74062i();
    }
}
