package p000;

import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;

/* renamed from: kyf */
final /* synthetic */ class kyf implements aubw {

    /* renamed from: a */
    private final aucb f25404a;

    public kyf(aucb aucb) {
        this.f25404a = aucb;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aucb aucb = this.f25404a;
        FileGroupResponse fileGroupResponse = (FileGroupResponse) obj;
        synchronized (kyi.f25408b) {
            FileGroupResponse fileGroupResponse2 = (FileGroupResponse) aucb.mo50386d();
            if (fileGroupResponse2 != null) {
                MddFile mddFile = null;
                MddFile mddFile2 = null;
                for (MddFile mddFile3 : fileGroupResponse2.f79963c) {
                    if ("autofill-model.fb_bin".equals(mddFile3.f79969a)) {
                        mddFile = mddFile3;
                    } else if ("autofill-model-config.bundle".equals(mddFile3.f79969a)) {
                        mddFile2 = mddFile3;
                    }
                }
                if (!kyi.m18784a(mddFile, kyi.f25411e)) {
                    kyi.f25409c = null;
                }
                if (cciw.m129953b()) {
                    if (!kyi.m18784a(mddFile2, kyi.f25412f)) {
                        kyi.f25410d = null;
                    }
                }
                kyi.f25411e = mddFile;
                kyi.f25412f = mddFile2;
                return;
            }
            kyi.f25409c = null;
            kyi.f25411e = null;
            if (cciw.m129953b()) {
                kyi.f25410d = null;
            }
            kyi.f25412f = null;
        }
    }
}
