package p000;

import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;

/* renamed from: kyj */
public final /* synthetic */ class kyj implements aubw {

    /* renamed from: a */
    private final aucb f25415a;

    public kyj(aucb aucb) {
        this.f25415a = aucb;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aucb aucb = this.f25415a;
        FileGroupResponse fileGroupResponse = (FileGroupResponse) obj;
        synchronized (kym.f25419b) {
            FileGroupResponse fileGroupResponse2 = (FileGroupResponse) aucb.mo50386d();
            if (fileGroupResponse2 == null) {
                kym.f25420c = null;
                kym.f25421d = null;
                kym.f25422e = null;
                return;
            }
            MddFile mddFile = null;
            MddFile mddFile2 = null;
            for (MddFile mddFile3 : fileGroupResponse2.f79963c) {
                if ("autofill-model.fb_bin".equals(mddFile3.f79969a)) {
                    mddFile = mddFile3;
                } else if ("autofill-model-config.bundle".equals(mddFile3.f79969a)) {
                    mddFile2 = mddFile3;
                }
            }
            MddFile mddFile4 = kym.f25421d;
            if (!(mddFile == null && mddFile4 == null)) {
                if (mddFile != null) {
                    if (mddFile4 != null && mddFile.f79969a.equals(mddFile4.f79969a) && mddFile.f79970b.equals(mddFile4.f79970b)) {
                    }
                }
                kym.f25420c = null;
            }
            kym.f25421d = mddFile;
            kym.f25422e = mddFile2;
        }
    }
}
