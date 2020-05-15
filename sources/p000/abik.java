package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: abik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abik implements abij {

    /* renamed from: a */
    private final qws f57537a;

    public abik(qws qws) {
        this.f57537a = qws;
    }

    /* renamed from: a */
    private final void m47770a(String str, int i, bspz bspz) {
        qwo a = this.f57537a.mo24335a(bspz.serializeToBytes());
        a.mo24330c(str);
        a.mo24328b(i - 1);
        a.mo24327b();
    }

    /* renamed from: b */
    public final void mo32131b(String str, bxvd bxvd) {
        bxvd da = bspz.f146608e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspz bspz = (bspz) da.f164949b;
        bsqd bsqd = (bsqd) bxvd.mo74062i();
        bsqd.getClass();
        bspz.f146613d = bsqd;
        bspz.f146610a |= 2097152;
        m47770a(str, 110, (bspz) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo32129a(String str, int i, bxvd bxvd) {
        bxvd da = bspz.f146608e.mo74144da();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bspu bspu = (bspu) bxvd.f164949b;
        bspu bspu2 = bspu.f146587f;
        bspu.f146589a |= 1;
        bspu.f146590b = i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspz bspz = (bspz) da.f164949b;
        bspu bspu3 = (bspu) bxvd.mo74062i();
        bspu3.getClass();
        bspz.f146611b = bspu3;
        bspz.f146610a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        m47770a(str, (int) ErrorInfo.TYPE_SDU_FAILED, (bspz) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo32130a(String str, bxvd bxvd) {
        bxvd da = bspz.f146608e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspz bspz = (bspz) da.f164949b;
        bspy bspy = (bspy) bxvd.mo74062i();
        bspy.getClass();
        bspz.f146612c = bspy;
        bspz.f146610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        m47770a(str, (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, (bspz) da.mo74062i());
    }
}
