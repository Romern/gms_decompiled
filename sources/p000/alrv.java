package p000;

import android.content.ContentValues;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: alrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrv extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        bleh bleh = (bleh) obj;
        String str = bleh.f126208h;
        String str2 = bleh.f126205e;
        String str3 = bleh.f126207g;
        String str4 = bleh.f126206f;
        String str5 = bleh.f126209i;
        String str6 = bleh.f126203c;
        String str7 = bleh.f126211k;
        String str8 = bleh.f126213m;
        String str9 = bleh.f126212l;
        String str10 = bleh.f126210j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/name");
        alsf.m61643a(contentValues, "data4", str);
        alsf.m61643a(contentValues, "data2", str2);
        alsf.m61643a(contentValues, "data5", str3);
        alsf.m61643a(contentValues, "data3", str4);
        alsf.m61643a(contentValues, "data6", str5);
        alsf.m61643a(contentValues, "data1", str6);
        if (ancm.m64013b(str7, str8, str9)) {
            alsf.m61643a(contentValues, "data7", str10);
            contentValues.putNull("data8");
            contentValues.putNull("data9");
        } else {
            alsf.m61643a(contentValues, "data7", str7);
            alsf.m61643a(contentValues, "data8", str8);
            alsf.m61643a(contentValues, "data9", str9);
        }
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bleh) obj).f126202b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data4");
        String asString2 = contentValues.getAsString("data2");
        String asString3 = contentValues.getAsString("data5");
        String asString4 = contentValues.getAsString("data3");
        String asString5 = contentValues.getAsString("data6");
        String asString6 = contentValues.getAsString("data1");
        String asString7 = contentValues.getAsString("data7");
        String asString8 = contentValues.getAsString("data8");
        String asString9 = contentValues.getAsString("data9");
        bxvd da = bleh.f126199o.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh = (bleh) da.f164949b;
            asString.getClass();
            bleh.f126201a |= 128;
            bleh.f126208h = asString;
        }
        if (asString2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh2 = (bleh) da.f164949b;
            asString2.getClass();
            bleh2.f126201a |= 16;
            bleh2.f126205e = asString2;
        }
        if (asString3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh3 = (bleh) da.f164949b;
            asString3.getClass();
            bleh3.f126201a |= 64;
            bleh3.f126207g = asString3;
        }
        if (asString4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh4 = (bleh) da.f164949b;
            asString4.getClass();
            bleh4.f126201a |= 32;
            bleh4.f126206f = asString4;
        }
        if (asString5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh5 = (bleh) da.f164949b;
            asString5.getClass();
            bleh5.f126201a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bleh5.f126209i = asString5;
        }
        if (asString6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh6 = (bleh) da.f164949b;
            asString6.getClass();
            bleh6.f126201a |= 2;
            bleh6.f126203c = asString6;
        }
        if (asString7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh7 = (bleh) da.f164949b;
            asString7.getClass();
            bleh7.f126201a |= 1024;
            bleh7.f126211k = asString7;
        }
        if (asString8 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh8 = (bleh) da.f164949b;
            asString8.getClass();
            bleh8.f126201a |= 4096;
            bleh8.f126213m = asString8;
        }
        if (asString9 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh9 = (bleh) da.f164949b;
            asString9.getClass();
            bleh9.f126201a |= 2048;
            bleh9.f126212l = asString9;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleh bleh10 = (bleh) da.f164949b;
        f.getClass();
        bleh10.f126202b = f;
        bleh10.f126201a |= 1;
        return (bleh) da.mo74062i();
    }
}
