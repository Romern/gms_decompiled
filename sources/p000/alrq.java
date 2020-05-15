package p000;

import android.content.ContentValues;

/* renamed from: alrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrq extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        String str = ((blea) obj).f126166c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_file_as");
        alsf.m61643a(contentValues, "data1", str);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blea) obj).f126165b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        bxvd da = blea.f126162d.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blea blea = (blea) da.f164949b;
            asString.getClass();
            blea.f126164a |= 2;
            blea.f126166c = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blea blea2 = (blea) da.f164949b;
        f.getClass();
        blea2.f126165b = f;
        blea2.f126164a |= 1;
        return (blea) da.mo74062i();
    }
}
