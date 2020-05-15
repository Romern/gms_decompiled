package p000;

import android.content.ContentValues;

/* renamed from: alrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrz extends alrl {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amwx.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      amwx.a(java.lang.String, java.lang.String):java.lang.String
      amwx.a(java.lang.String, boolean):java.lang.String */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        bley bley = (bley) obj;
        String a = amwx.m63590a(bley.f126307c, false);
        String str = bley.f126309e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/photo");
        alsf.m61643a(contentValues, "data_sync1", a);
        alsf.m61643a(contentValues, "data_sync2", str);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bley) obj).f126306b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String b = amwx.m63592b(contentValues.getAsString("data_sync1"));
        String asString = contentValues.getAsString("data_sync2");
        bxvd da = bley.f126303f.mo74144da();
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bley bley = (bley) da.f164949b;
            b.getClass();
            bley.f126305a |= 2;
            bley.f126307c = b;
        }
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bley bley2 = (bley) da.f164949b;
            asString.getClass();
            bley2.f126305a |= 8;
            bley2.f126309e = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bley bley3 = (bley) da.f164949b;
        f.getClass();
        bley3.f126306b = f;
        bley3.f126305a |= 1;
        return (bley) da.mo74062i();
    }
}
