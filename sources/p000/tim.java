package p000;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: tim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tim {

    /* renamed from: a */
    public final Set f46079a = new HashSet();

    /* renamed from: b */
    private final til f46080b;

    public tim(Bundle bundle, til til) {
        this.f46080b = til;
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("veRecordedImpressionNodeIds");
            int[] intArray2 = bundle.getIntArray("veRecordedImpressionIndexes");
            if (intArray != null && intArray2 != null) {
                for (int i = 0; i < intArray.length; i++) {
                    int i2 = intArray2[i];
                    if (i2 == -1) {
                        this.f46079a.add(new tii(Integer.valueOf(intArray[i]), null));
                    } else {
                        this.f46079a.add(new tii(Integer.valueOf(intArray[i]), Integer.valueOf(i2)));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26567a(tin tin, tio... tioArr) {
        if (this.f46079a.add(tin)) {
            tik tik = (tik) this.f46080b;
            tio[] a = tik.mo26566a(tioArr);
            bxvd da = byfo.f166053c.mo74144da();
            bxvd a2 = tik.m37035a(tin, a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfo byfo = (byfo) da.f164949b;
            bocj bocj = (bocj) a2.mo74062i();
            bocj.getClass();
            byfo.f166056b = bocj;
            byfo.f166055a |= 1;
            tik.mo26565a((byfo) da.mo74062i());
        }
    }

    /* renamed from: b */
    public final void mo26569b(tio tio, tio... tioArr) {
        mo26567a(tin.m37041a(tio), tioArr);
    }

    /* renamed from: a */
    public final void mo26568a(tio tio, tio... tioArr) {
        til til = this.f46080b;
        bqbo bqbo = bqbo.TAP;
        tin a = tin.m37041a(tio);
        tik tik = (tik) til;
        tio[] a2 = tik.mo26566a(tioArr);
        bxvd da = byfo.f166053c.mo74144da();
        bxvd a3 = tik.m37035a(a, a2);
        if (a3.f164950c) {
            a3.mo74035c();
            a3.f164950c = false;
        }
        bocj bocj = (bocj) a3.f164949b;
        bocj bocj2 = bocj.f132559f;
        bocj.f132565e = bqbo.f140429Q;
        bocj.f132561a |= 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byfo byfo = (byfo) da.f164949b;
        bocj bocj3 = (bocj) a3.mo74062i();
        bocj3.getClass();
        byfo.f166056b = bocj3;
        byfo.f166055a |= 1;
        tik.mo26565a((byfo) da.mo74062i());
    }
}
