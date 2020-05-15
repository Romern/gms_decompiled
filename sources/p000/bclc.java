package p000;

import android.graphics.Color;

/* renamed from: bclc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclc {
    /* renamed from: a */
    private static int m89222a(float f) {
        if (f <= 1.0f) {
            f *= 255.0f;
        }
        int i = (int) f;
        if (i < 0) {
            return 0;
        }
        if (i <= 255) {
            return i;
        }
        return 255;
    }

    /* renamed from: b */
    private static float m89225b(int i) {
        return ((float) i) / 255.0f;
    }

    /* renamed from: a */
    public static int m89223a(bzrt bzrt) {
        int a = m89222a(bzrt.f171197a);
        int a2 = m89222a(bzrt.f171198b);
        int a3 = m89222a(bzrt.f171199c);
        bxva bxva = bzrt.f171200d;
        return bxva != null ? Color.argb(m89222a(bxva.f164944a), a, a2, a3) : Color.rgb(a, a2, a3);
    }

    /* renamed from: a */
    public static bzrt m89224a(int i) {
        bxvd da = bzrt.f171195e.mo74144da();
        float b = m89225b(Color.red(i));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzrt) da.f164949b).f171197a = b;
        float b2 = m89225b(Color.green(i));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzrt) da.f164949b).f171198b = b2;
        float b3 = m89225b(Color.blue(i));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzrt) da.f164949b).f171199c = b3;
        bxvd da2 = bxva.f164942b.mo74144da();
        float b4 = m89225b(Color.alpha(i));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bxva) da2.f164949b).f164944a = b4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxva bxva = (bxva) da2.mo74062i();
        bxva.getClass();
        ((bzrt) da.f164949b).f171200d = bxva;
        return (bzrt) da.mo74062i();
    }
}
