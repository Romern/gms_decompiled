package p000;

import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;

/* renamed from: req */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class req {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.List, bmxe]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    public static bqyq m33478a(ExperimentTokens experimentTokens, int[] iArr, boolean z) {
        byte[][][] bArr;
        int[] iArr2 = null;
        if (experimentTokens == null && iArr == null) {
            return null;
        }
        bqyp bqyp = (bqyp) bqyq.f141967e.mo74144da();
        if (experimentTokens != null) {
            iArr2 = experimentTokens.f82094h;
        }
        if (!m33479a(iArr2) || !m33479a(iArr)) {
            bqyl bqyl = (bqyl) bqym.f141963b.mo74144da();
            if (iArr2 != null) {
                for (int i : iArr2) {
                    bqyl.mo69466a(i);
                }
            }
            if (iArr != null) {
                for (int i2 : iArr) {
                    bqyl.mo69466a(i2);
                }
            }
            bxtx aL = ((bqym) bqyl.mo74062i()).mo73639aL();
            if (bqyp.f164950c) {
                bqyp.mo74035c();
                bqyp.f164950c = false;
            }
            bqyq bqyq = (bqyq) bqyp.f164949b;
            aL.getClass();
            bqyq.f141969a |= 1;
            bqyq.f141970b = aL;
        }
        if (experimentTokens != null) {
            byte[] bArr2 = experimentTokens.f82089c;
            if (!(bArr2 == null || bArr2.length == 0)) {
                bqyp.mo69467a(bxtx.m123261a(bArr2));
            }
            byte[][] bArr3 = experimentTokens.f82095i;
            if (bArr3 != null) {
                for (byte[] bArr4 : bArr3) {
                    if (!(bArr4 == null || bArr4.length == 0)) {
                        bqyp.mo69467a(bxtx.m123261a(bArr4));
                    }
                }
            }
            if (bqyp.f164950c) {
                bqyp.mo74035c();
                bqyp.f164950c = false;
            }
            bqyq bqyq2 = (bqyq) bqyp.f164949b;
            bqyq2.f141969a |= 4;
            bqyq2.f141972d = z;
            if (!z) {
                bArr = new byte[][][]{experimentTokens.f82091e, experimentTokens.f82092f, experimentTokens.f82093g};
            } else {
                bArr = new byte[][][]{experimentTokens.f82090d, experimentTokens.f82091e, experimentTokens.f82092f, experimentTokens.f82093g};
            }
            for (byte[][] bArr5 : bArr) {
                if (bArr5 != null) {
                    List a = bnkn.m109668a(Arrays.asList(bArr5), (bmxj) bxzj.f165164a.mo66854a());
                    if (bqyp.f164950c) {
                        bqyp.mo74035c();
                        bqyp.f164950c = false;
                    }
                    bqyq bqyq3 = (bqyq) bqyp.f164949b;
                    bqyq3.mo69468a();
                    bxsy.m123078a(a, bqyq3.f141971c);
                }
            }
        }
        return (bqyq) bqyp.mo74062i();
    }

    /* renamed from: a */
    private static boolean m33479a(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }
}
