package p000;

import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity;

/* renamed from: atlb */
final /* synthetic */ class atlb implements aubw {

    /* renamed from: a */
    private final TapAndPayHomeChimeraActivity f90435a;

    /* renamed from: b */
    private final String f90436b;

    public atlb(TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity, String str) {
        this.f90435a = tapAndPayHomeChimeraActivity;
        this.f90436b = str;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = this.f90435a;
        String str = this.f90436b;
        AccountInfo accountInfo = (AccountInfo) obj;
        if (str == null || accountInfo == null || !str.equals(accountInfo.f108326b)) {
            tapAndPayHomeChimeraActivity.mo59411g();
        }
    }
}
