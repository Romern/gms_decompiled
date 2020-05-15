package p000;

import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: attt */
final /* synthetic */ class attt implements aubq {

    /* renamed from: a */
    private final attw f90883a;

    /* renamed from: b */
    private final atsy f90884b;

    public attt(attw attw, atsy atsy) {
        this.f90883a = attw;
        this.f90884b = atsy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        attw attw = this.f90883a;
        atsy atsy = this.f90884b;
        if (aucb.mo50384b()) {
            byte[] bArr = (byte[]) aucb.mo50386d();
            atsy.f90809A = bArr;
            if (atsy.mo50164b() || atsy.mo50165c()) {
                attw.mo50175a(atsy, 20);
            } else if (atsy.f90862y) {
                attw.mo50175a(atsy, 6);
            } else if (atsy.f90811C == null && atsy.f90812D == null) {
                askf askf = new askf(atsy.f90857t, askc.m74272b(), attw.f90898f);
                bxvd da = btjf.f149105c.mo74144da();
                ByteString a = ByteString.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btjf) da.f164949b).f149107a = a;
                atff.m75765a(askf, "t/untokenizedcards/list", (btjf) da.mo74062i(), btjg.f149109e, new attv(attw, askf, atsy, bArr), attw);
            }
        } else {
            bnsl bnsl = (bnsl) attw.f90890a.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("attw", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get client token");
            attw.mo50184a(attw.mo50186b(C0126R.string.common_something_went_wrong), attw.mo50186b(C0126R.string.tp_generic_error_content));
        }
    }
}
