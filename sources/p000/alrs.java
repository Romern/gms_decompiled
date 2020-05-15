package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrs extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        blee blee = (blee) obj;
        if (TextUtils.isEmpty(blee.f126187c)) {
            return null;
        }
        String str = blee.f126187c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_hobby");
        alsf.m61643a(contentValues, "data1", str);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blee) obj).f126186b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        bxvd da = blee.f126183d.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blee blee = (blee) da.f164949b;
            asString.getClass();
            blee.f126185a |= 2;
            blee.f126187c = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blee blee2 = (blee) da.f164949b;
        f.getClass();
        blee2.f126186b = f;
        blee2.f126185a |= 1;
        return (blee) da.mo74062i();
    }
}
