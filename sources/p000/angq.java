package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver;

/* renamed from: angq */
public final /* synthetic */ class angq implements aubq {

    /* renamed from: a */
    public static final aubq f76808a = new angq();

    private angq() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bnsl bnsl = (bnsl) FlagOverrideChimeraReceiver.f82138b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Successfully set flag overrides? %b", Boolean.valueOf(aucb.mo50384b()));
    }
}
