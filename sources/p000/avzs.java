package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: avzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzs {
    /* renamed from: a */
    public static final void m79554a(Context context, avzn avzn, String str, boolean z) {
        long j;
        File a = avzr.m79552a(context, str);
        long j2 = 0;
        if (a == null) {
            j = 0;
        } else {
            String str2 = "";
            if (a.exists()) {
                try {
                    str2 = new String(bobi.m111041b(a));
                } catch (IOException e) {
                    new Object[1][0] = a.getAbsolutePath();
                }
            }
            if (!bmxx.m108577a(str2)) {
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException e2) {
                    avxz.m79526a(e2, "Failed to parse: %s", str2);
                }
            }
            a.delete();
            j2 = System.currentTimeMillis() - j2;
            j = j2;
        }
        avxz.m79527b("Time to download %s: %d", str, Long.valueOf(j2));
        bxvd da = btus.f150619g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btus btus = (btus) da.f164949b;
        str.getClass();
        btus.f150621a |= 1;
        btus.f150622b = str;
        bxvd da2 = btut.f150628c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btus btus2 = (btus) da.f164949b;
        int i = btus2.f150621a | 8;
        btus2.f150621a = i;
        btus2.f150624d = j;
        int i2 = i | 32;
        btus2.f150621a = i2;
        btus2.f150625e = j2;
        btus2.f150621a = 2 | i2;
        btus2.f150623c = !z;
        btus.m117166a(btus2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btut btut = (btut) da2.f164949b;
        btus btus3 = (btus) da.mo74062i();
        btus3.getClass();
        btut.f150631b = btus3;
        btut.f150630a |= 1;
        avzn.f94118c.mo59735a((btut) da2.mo74062i());
    }

    /* renamed from: a */
    public static final void m79555a(avzn avzn, String str, boolean z) {
        bxvd da = btus.f150619g.mo74144da();
        bxvd da2 = btut.f150628c.mo74144da();
        boolean z2 = !z;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btus btus = (btus) da.f164949b;
        int i = btus.f150621a | 2;
        btus.f150621a = i;
        btus.f150623c = z2;
        str.getClass();
        btus.f150621a = i | 64;
        btus.f150626f = str;
        btus.m117166a(btus);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btut btut = (btut) da2.f164949b;
        btus btus2 = (btus) da.mo74062i();
        btus2.getClass();
        btut.f150631b = btus2;
        btut.f150630a |= 1;
        avzn.f94118c.mo59735a((btut) da2.mo74062i());
    }
}
