package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RejectSavePromoOperation extends IntentOperation {

    /* renamed from: a */
    public static final /* synthetic */ int f11664a = 0;

    /* renamed from: b */
    private static final srn f11665b = srn.m36127a(sgj.AUTOFILL);

    public final void onHandleIntent(Intent intent) {
        boolean z;
        lho e = krc.m18382a(this).mo14830e();
        if (!kdi.f23885a.equals(e.mo15081a())) {
            ((bnsl) f11665b.mo68388c()).mo68405a("RejectSavePromoOperation called when already setup");
            return;
        }
        kre a = krc.m18382a(this);
        kuw a2 = a.mo14825a(this);
        Intent intent2 = null;
        if (ccjf.m130040j()) {
            kck kck = (kck) bmxv.m108567c((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).mo66810a(kyy.f25437a).mo66815c();
            if (kck != null) {
                e.mo15106c(kck.f23817a);
                if (ccjf.f179148a.mo6606a().mo76106c() && e.mo15080a(kck.f23817a) >= lhi.f26105c) {
                    intent2 = lio.m19193a((int) C0126R.string.autofill_manage_save_preferences, (int) C0126R.string.common_settings, (int) C0126R.string.common_dismiss);
                }
            }
            z = false;
        } else {
            e.mo15115r();
            if (e.mo15084d() >= lhi.f26105c) {
                ((bnsl) f11665b.mo68390d()).mo68405a("Disabling Autofill with Google");
                bmxv s = a.mo14844s();
                if (s.mo66813a()) {
                    ((kyi) s.mo66814b()).mo14943d();
                }
                a.mo14835j().disableAutofillServices();
                z = true;
            } else {
                z = false;
            }
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (!(byteArrayExtra == null || byteArrayExtra.length == 0)) {
                lau lau = (lau) GeneratedMessageLite.m124014a(lau.f25613i, byteArrayExtra);
                bxvd bxvd = (bxvd) lau.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) lau);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((lau) bxvd.f164949b).f25622h = z;
                a2.mo14863a().mo14903d(new kyz((lau) bxvd.mo74062i()));
            }
        } catch (bxwf e2) {
        }
        if (intent2 != null) {
            startActivity(intent2);
        }
    }
}
