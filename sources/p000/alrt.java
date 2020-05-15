package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrt extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        blef blef = (blef) obj;
        if (TextUtils.isEmpty(blef.f126192c)) {
            return null;
        }
        String str = blef.f126192c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_language");
        alsf.m61643a(contentValues, "data1", str);
        alsf.m61643a(contentValues, "data2", (String) null);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blef) obj).f126191b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        bxvd da = blef.f126188d.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blef blef = (blef) da.f164949b;
            asString.getClass();
            blef.f126190a |= 2;
            blef.f126192c = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blef blef2 = (blef) da.f164949b;
        f.getClass();
        blef2.f126191b = f;
        blef2.f126190a |= 1;
        return (blef) da.mo74062i();
    }
}
