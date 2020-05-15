package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alsc extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        blfe blfe = (blfe) obj;
        if (blfe.f126350d.isEmpty()) {
            return null;
        }
        String str = !blfe.f126349c.isEmpty() ? blfe.f126349c : "Custom";
        String str2 = blfe.f126350d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_user_defined_field");
        contentValues.put("data1", str);
        alsf.m61643a(contentValues, "data2", str2);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blfe) obj).f126348b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data2");
        bxvd da = blfe.f126345e.mo74144da();
        if (TextUtils.isEmpty(asString2)) {
            return null;
        }
        if (TextUtils.isEmpty(asString)) {
            asString = "Custom";
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfe blfe = (blfe) da.f164949b;
        asString.getClass();
        int i = blfe.f126347a | 2;
        blfe.f126347a = i;
        blfe.f126349c = asString;
        asString2.getClass();
        blfe.f126347a = i | 4;
        blfe.f126350d = asString2;
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfe blfe2 = (blfe) da.f164949b;
        f.getClass();
        blfe2.f126348b = f;
        blfe2.f126347a |= 1;
        return (blfe) da.mo74062i();
    }
}
