package p000;

import android.service.autofill.SaveCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: lcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lcw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ SaveCallback f25811a;

    /* renamed from: b */
    final /* synthetic */ lcx f25812b;

    public lcw(lcx lcx, SaveCallback saveCallback) {
        this.f25812b = lcx;
        this.f25811a = saveCallback;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        lcx lcx = this.f25812b;
        SaveCallback saveCallback = this.f25811a;
        srn srn = lcx.f25813a;
        lcx.mo14988a(saveCallback);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lcx.f25813a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68432a("lcw", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68448m();
        this.f25812b.mo14988a(this.f25811a);
    }
}
