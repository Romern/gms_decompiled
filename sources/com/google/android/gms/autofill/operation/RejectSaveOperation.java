package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RejectSaveOperation extends IntentOperation implements bqfp {

    /* renamed from: a */
    public static final /* synthetic */ int f11662a = 0;

    /* renamed from: b */
    private static final srn f11663b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    private final void m7154a(kuw kuw, kcv kcv) {
        bqga.m112781a(((kfx) kuw.mo14868f().mo66814b()).mo14455a(kcv), this, bqfb.INSTANCE);
    }

    public final void onHandleIntent(Intent intent) {
        kuw a = krc.m18382a(this).mo14825a(this);
        intent.setExtrasClassLoader(RejectSaveOperation.class.getClassLoader());
        kcv kcv = (kcv) bmxv.m108567c((DomainUtils$DomainParcel) intent.getParcelableExtra("save_data_domain")).mo66810a(kyv.f25434a).mo66815c();
        kck kck = (kck) bmxv.m108567c((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).mo66810a(kyw.f25435a).mo66815c();
        boolean z = false;
        laz a2 = laz.m18867a(intent.getIntExtra("save_data_type", 0));
        bmxy.m108582a(kcv, "Data domain can not be null.");
        bmxy.m108582a(kck, "Application domain can not be null.");
        if (a2 != laz.UNKNOWN_DATA_TYPE) {
            z = true;
        }
        bmxy.m108589a(z, "Data type can not be UNKNOWN_DATA_TYPE.");
        if (a2 == laz.CREDENTIAL) {
            if (!ccip.m129865e()) {
                m7154a(a, kcv);
            } else {
                lho e = krc.m18382a(this).mo14830e();
                if (lhj.m19079a(e, kck.f23817a)) {
                    m7154a(a, kcv);
                    e.mo15104b(kck.f23817a);
                } else {
                    e.mo15106c(kck.f23817a);
                }
            }
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                a.mo14863a().mo14903d(new kyx((lau) GeneratedMessageLite.m124014a(lau.f25613i, byteArrayExtra)));
            }
        } catch (bxwf e2) {
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f11663b.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
    }
}
