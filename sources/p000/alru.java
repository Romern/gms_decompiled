package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alru extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        String str;
        bleg bleg = (bleg) obj;
        if (bleg.f126196b == 3) {
            str = (String) bleg.f126197c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return alsf.m61642a(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bleg) obj).f126198d;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("group_sourceid");
        bxvd da = bleg.f126193e.mo74144da();
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleg bleg = (bleg) da.f164949b;
        f.getClass();
        bleg.f126198d = f;
        bleg.f126195a |= 1;
        if (asString != null) {
            asString.getClass();
            bleg.f126196b = 3;
            bleg.f126197c = asString;
        }
        return (bleg) da.mo74062i();
    }
}
