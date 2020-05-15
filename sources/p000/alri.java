package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alri extends alrl {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo40671a(Object obj, boolean z) {
        String str;
        bldi bldi = (bldi) obj;
        long j = bldi.f126085c;
        if (j != 0 || bldi.f126087e.isEmpty()) {
            str = alse.m61630b(j);
            if (alse.m61629a(str)) {
                str = alse.m61634d(str);
            }
        } else {
            str = bldi.f126087e;
            alse alse = alse.f74192a;
            if (str == null) {
                str = null;
            } else if (str.matches("[0-2][0-9]/[0-3][0-9]")) {
                String valueOf = String.valueOf(str.replace('/', '-'));
                str = valueOf.length() == 0 ? new String("--") : "--".concat(valueOf);
            }
        }
        return alsf.m61640a(3, str, "");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bleu mo40672a(Object obj) {
        bleu bleu = ((bldi) obj).f126084b;
        return bleu == null ? bleu.f126278h : bleu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo40673a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        bxvd da = bldi.f126081f.mo74144da();
        if (alse.m61632b(asString)) {
            asString = alse.m61633c(asString);
        }
        Long e = alse.m61635e(asString);
        if (e != null) {
            long a = alse.m61617a(e.longValue());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldi bldi = (bldi) da.f164949b;
            bldi.f126083a |= 2;
            bldi.f126085c = a;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bldi bldi2 = (bldi) da.f164949b;
            asString.getClass();
            bldi2.f126083a |= 16;
            bldi2.f126087e = asString;
        }
        bleu f = alse.m61636f(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bldi bldi3 = (bldi) da.f164949b;
        f.getClass();
        bldi3.f126084b = f;
        bldi3.f126083a |= 1;
        return (bldi) da.mo74062i();
    }
}
