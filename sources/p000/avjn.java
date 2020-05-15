package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: avjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjn {

    /* renamed from: a */
    private static final Random f93273a = new Random(System.currentTimeMillis());

    /* renamed from: b */
    private final qws f93274b;

    public avjn(Context context, String str) {
        this.f93274b = new qws(context, "IDENTITY_FRONTEND", str);
    }

    /* renamed from: a */
    public static int m78617a() {
        int nextInt;
        do {
            nextInt = f93273a.nextInt();
        } while (nextInt == 0);
        return nextInt;
    }

    /* renamed from: a */
    public final bsov mo51290a(String str, String str2, long j, String str3) {
        bxvd da = bsov.f146431f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsov bsov = (bsov) da.f164949b;
        str.getClass();
        int i = bsov.f146433a | 1;
        bsov.f146433a = i;
        bsov.f146434b = str;
        str2.getClass();
        int i2 = i | 2;
        bsov.f146433a = i2;
        bsov.f146435c = str2;
        int i3 = i2 | 4;
        bsov.f146433a = i3;
        bsov.f146436d = (int) j;
        str3.getClass();
        bsov.f146433a = i3 | 8;
        bsov.f146437e = str3;
        return (bsov) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo51291a(int i) {
        mo51292a(29020, i);
    }

    /* renamed from: a */
    public final void mo51292a(int i, int i2) {
        bxvd da = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.UDC_MOBILE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i3 = bspp.f146555a | 1;
        bspp.f146555a = i3;
        bspp.f146557c = i - 1;
        int i4 = i3 | 2;
        bspp.f146555a = i4;
        bspp.f146555a = i4 | 16;
        bspp.f146560f = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp2 = (bspp) bxvf.mo74062i();
        bspp2.getClass();
        bspq.f146570b = bspp2;
        bspq.f146569a |= 1;
        mo51295a((bspq) da.mo74062i(), i2);
    }

    /* renamed from: a */
    public final void mo51293a(int i, bsph bsph) {
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.UDC_MOBILE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i2 = bspp.f146555a | 1;
        bspp.f146555a = i2;
        bspp.f146557c = 29005;
        int i3 = i2 | 2;
        bspp.f146555a = i3;
        int i4 = i3 | 16;
        bspp.f146555a = i4;
        bspp.f146560f = true;
        if (bsph != null) {
            bsph.getClass();
            bspp.f146564j = bsph;
            bspp.f146555a = i4 | 1024;
        }
        bxvd da = bspq.f146567d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp2 = (bspp) bxvf.mo74062i();
        bspp2.getClass();
        bspq.f146570b = bspp2;
        bspq.f146569a |= 1;
        mo51295a((bspq) da.mo74062i(), i);
    }

    /* renamed from: a */
    public final void mo51294a(bspq bspq) {
        this.f93274b.mo24335a(bspq.mo73642k()).mo24327b();
    }

    /* renamed from: a */
    public final void mo51295a(bspq bspq, int i) {
        qwo a = this.f93274b.mo24335a(bspq.mo73642k());
        a.mo24323a((long) i);
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo51296a(String str, String str2, long j, int i, boolean z) {
        int i2;
        bxvd da = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.UDC_MOBILE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i3 = bspp.f146555a | 1;
        bspp.f146555a = i3;
        if (!z) {
            i2 = 29003;
        } else {
            i2 = 29002;
        }
        bspp.f146557c = i2 - 1;
        int i4 = i3 | 2;
        bspp.f146555a = i4;
        bspp.f146555a = i4 | 16;
        bspp.f146560f = true;
        bsov a = mo51290a(str, str2, j, Integer.toString(i));
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a.getClass();
        bspp2.f146563i = a;
        bspp2.f146555a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        mo51294a((bspq) da.mo74062i());
    }
}
