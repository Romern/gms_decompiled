package p000;

import android.content.ContentValues;

/* renamed from: alrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrg extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        String str = ((bldg) obj).f126065c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/note");
        alsf.m61643a(contentValues, "data1", str);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldg) obj).f126064b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        bxvd da = bldg.f126061d.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldg bldg = (bldg) da.f164949b;
            asString.getClass();
            bldg.f126063a |= 4;
            bldg.f126065c = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldg bldg2 = (bldg) da.f164949b;
        f.getClass();
        bldg2.f126064b = f;
        bldg2.f126063a |= 1;
        return (bldg) da.mo74062i();
    }
}
