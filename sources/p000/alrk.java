package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alrk extends alrl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        String str = ((bldl) obj).f126105c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return alsf.m61642a(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldl) obj).f126104b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("group_sourceid");
        bxvd da = bldl.f126101d.mo74144da();
        if (asString != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldl bldl = (bldl) da.f164949b;
            asString.getClass();
            bldl.f126103a |= 2;
            bldl.f126105c = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldl bldl2 = (bldl) da.f164949b;
        f.getClass();
        bldl2.f126104b = f;
        bldl2.f126103a |= 1;
        return (bldl) da.mo74062i();
    }
}
