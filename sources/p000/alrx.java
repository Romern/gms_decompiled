package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: alrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrx extends alrl {

    /* renamed from: a */
    private static final bnhe f74182a;

    /* renamed from: b */
    private static final Map f74183b;

    static {
        bnhe a = bnhe.m109409a("work", 1, "other", 2);
        f74182a = a;
        f74183b = alse.m61625a(a);
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
        bleo bleo = (bleo) obj;
        int a = blen.m107077a(bleo.f126238i);
        String str = null;
        if (a != 0 && a == 2) {
            str = "work";
        } else {
            int a2 = blen.m107077a(bleo.f126238i);
            if (a2 != 0 && a2 == 3) {
                str = "school";
            }
        }
        alrm a3 = alse.m61618a(str, (Map) f74182a, (Integer) 0);
        int intValue = a3.f74170a.intValue();
        String str2 = bleo.f126232c;
        String str3 = bleo.f126234e;
        String str4 = bleo.f126233d;
        String str5 = bleo.f126237h;
        String str6 = bleo.f126235f;
        String str7 = bleo.f126236g;
        String str8 = a3.f74171b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/organization");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        alsf.m61643a(contentValues, "data1", str2);
        alsf.m61643a(contentValues, "data4", str3);
        alsf.m61643a(contentValues, "data5", str4);
        alsf.m61643a(contentValues, "data6", str5);
        alsf.m61643a(contentValues, "data7", str6);
        alsf.m61643a(contentValues, "data8", str7);
        alsf.m61644a(contentValues, "data2", "data3", intValue, str8, 0);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bleo) obj).f126231b;
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
        String a = alse.m61621a(alse.m61620a(contentValues, "data2"), contentValues.getAsString("data3"), f74183b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data4");
        String asString3 = contentValues.getAsString("data5");
        String asString4 = contentValues.getAsString("data6");
        String asString5 = contentValues.getAsString("data7");
        String asString6 = contentValues.getAsString("data8");
        boolean a2 = alse.m61626a(contentValues);
        bxvd da = bleo.f126228j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleo bleo = (bleo) da.f164949b;
        bleo.f126238i = 0;
        bleo.f126230a |= 8192;
        if (a != null) {
            if (a.equals("work")) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bleo bleo2 = (bleo) da.f164949b;
                bleo2.f126238i = 1;
                bleo2.f126230a |= 8192;
            } else if (a.equals("school")) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bleo bleo3 = (bleo) da.f164949b;
                bleo3.f126238i = 2;
                bleo3.f126230a |= 8192;
            }
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo4 = (bleo) da.f164949b;
            asString.getClass();
            bleo4.f126230a = 2 | bleo4.f126230a;
            bleo4.f126232c = asString;
        }
        if (asString2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo5 = (bleo) da.f164949b;
            asString2.getClass();
            bleo5.f126230a |= 8;
            bleo5.f126234e = asString2;
        }
        if (asString3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo6 = (bleo) da.f164949b;
            asString3.getClass();
            bleo6.f126230a |= 4;
            bleo6.f126233d = asString3;
        }
        if (asString4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo7 = (bleo) da.f164949b;
            asString4.getClass();
            bleo7.f126230a |= 128;
            bleo7.f126237h = asString4;
        }
        if (asString5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo8 = (bleo) da.f164949b;
            asString5.getClass();
            bleo8.f126230a |= 16;
            bleo8.f126235f = asString5;
        }
        if (asString6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleo bleo9 = (bleo) da.f164949b;
            asString6.getClass();
            bleo9.f126230a |= 32;
            bleo9.f126236g = asString6;
        }
        bleu a3 = alse.m61619a(str, a2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleo bleo10 = (bleo) da.f164949b;
        a3.getClass();
        bleo10.f126231b = a3;
        bleo10.f126230a |= 1;
        return (bleo) da.mo74062i();
    }
}
