package p000;

import com.google.android.chimera.config.ModuleManager;

/* renamed from: wef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wef {

    /* renamed from: a */
    public final ModuleManager f50582a;

    public wef(ModuleManager moduleManager) {
        this.f50582a = moduleManager;
    }

    /* renamed from: a */
    public final boolean mo29058a() {
        ModuleManager moduleManager = this.f50582a;
        bxvd da = djf.f13322b.mo74144da();
        bxvd da2 = djc.f13307f.mo74144da();
        String str = wdp.f50561a.f30068a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        djc djc = (djc) da2.f164949b;
        str.getClass();
        int i = djc.f13309a | 1;
        djc.f13309a = i;
        djc.f13310b = str;
        djc.f13309a = i | 2;
        djc.f13311c = 0;
        da.mo74000a((djc) da2.mo74062i());
        if (moduleManager.checkFeaturesAreAvailable(ModuleManager.FeatureList.fromProto(((djf) da.mo74062i()).serializeToBytes())) != 0) {
            return false;
        }
        return true;
    }
}
