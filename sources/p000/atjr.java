package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: atjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjr extends atkk {
    public atjr(String str, aswm aswm) {
        super("keyguardDismissed", str, aswm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (cgwn.m147265o()) {
            astb.f89622c = 0;
            bnsl a = astb.f89620a.mo26019b(aske.m74275a());
            a.mo68432a("astb", "c", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68405a("notifyCdcvmCleared");
        } else {
            astb.m74739b(0);
        }
        this.f90414d.mo49629f(Status.f30107a);
    }
}
