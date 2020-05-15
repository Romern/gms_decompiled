package p000;

import android.content.ContentValues;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Map;

/* renamed from: alrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrh extends alrl {

    /* renamed from: a */
    private static final bnhe f74166a;

    /* renamed from: b */
    private static final Map f74167b;

    static {
        bnhe a = bnhe.m109410a("home", 1, "work", 2, "other", 3);
        f74166a = a;
        f74167b = alse.m61625a(a);
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
        bldh bldh = (bldh) obj;
        alrm a = alse.m61618a(bldh.f126070c, (Map) f74166a, (Integer) 0);
        int intValue = a.f74170a.intValue();
        String str = bldh.f126073f;
        String str2 = bldh.f126072e;
        String str3 = bldh.f126074g;
        String str4 = bldh.f126075h;
        String str5 = bldh.f126076i;
        String str6 = bldh.f126078k;
        String str7 = bldh.f126077j;
        String str8 = bldh.f126071d;
        String str9 = a.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        alsf.m61643a(contentValues, "data4", str);
        alsf.m61643a(contentValues, "data5", str2);
        alsf.m61643a(contentValues, "data6", str3);
        alsf.m61643a(contentValues, "data7", str4);
        alsf.m61643a(contentValues, "data8", str5);
        alsf.m61643a(contentValues, "data10", str6);
        alsf.m61643a(contentValues, "data9", str7);
        alsf.m61643a(contentValues, "data1", str8);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str9, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldh) obj).f126069b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74167b, (Integer) 0);
        String asString = contentValues.getAsString("data4");
        String asString2 = contentValues.getAsString("data5");
        String asString3 = contentValues.getAsString("data6");
        String asString4 = contentValues.getAsString("data7");
        String asString5 = contentValues.getAsString("data8");
        String asString6 = contentValues.getAsString("data10");
        String asString7 = contentValues.getAsString("data9");
        String asString8 = contentValues.getAsString("data1");
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = bldh.f126066l.mo74144da();
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh = (bldh) da.f164949b;
            a.getClass();
            bldh.f126068a |= 2;
            bldh.f126070c = a;
        }
        if (asString2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh2 = (bldh) da.f164949b;
            asString2.getClass();
            bldh2.f126068a |= 16;
            bldh2.f126072e = asString2;
            z = true;
        } else {
            z = false;
        }
        if (asString3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh3 = (bldh) da.f164949b;
            asString3.getClass();
            bldh3.f126068a |= 64;
            bldh3.f126074g = asString3;
            z = true;
        }
        if (asString4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh4 = (bldh) da.f164949b;
            asString4.getClass();
            bldh4.f126068a |= 128;
            bldh4.f126075h = asString4;
            z = true;
        }
        if (asString5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh5 = (bldh) da.f164949b;
            asString5.getClass();
            bldh5.f126068a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bldh5.f126076i = asString5;
            z = true;
        }
        if (asString6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh6 = (bldh) da.f164949b;
            asString6.getClass();
            bldh6.f126068a |= 1024;
            bldh6.f126078k = asString6;
            z = true;
        }
        if (asString7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh7 = (bldh) da.f164949b;
            asString7.getClass();
            bldh7.f126068a |= 512;
            bldh7.f126077j = asString7;
            z = true;
        }
        if (asString8 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh8 = (bldh) da.f164949b;
            asString8.getClass();
            bldh8.f126068a |= 8;
            bldh8.f126071d = asString8;
        }
        if (asString != null && (z || !asString.equals(asString8))) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldh bldh9 = (bldh) da.f164949b;
            asString.getClass();
            bldh9.f126068a |= 32;
            bldh9.f126073f = asString;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldh bldh10 = (bldh) da.f164949b;
        a3.getClass();
        bldh10.f126069b = a3;
        bldh10.f126068a |= 1;
        return (bldh) da.mo74062i();
    }
}
