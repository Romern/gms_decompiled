package p000;

import android.content.ContentValues;

/* renamed from: alrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrw extends alrl {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        blek blek = (blek) obj;
        int a = blej.m107073a(blek.f126221d);
        if (a != 0 && a != 1) {
            return null;
        }
        String str = blek.f126220c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/nickname");
        contentValues.put("data2", (Integer) 1);
        alsf.m61643a(contentValues, "data1", str);
        return contentValues;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((blek) obj).f126219b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        bxvd da = blek.f126216e.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blek blek = (blek) da.f164949b;
            asString.getClass();
            int i = blek.f126218a | 2;
            blek.f126218a = i;
            blek.f126220c = asString;
            blek.f126221d = 0;
            blek.f126218a = i | 4;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blek blek2 = (blek) da.f164949b;
        f.getClass();
        blek2.f126219b = f;
        blek2.f126218a |= 1;
        return (blek) da.mo74062i();
    }
}
