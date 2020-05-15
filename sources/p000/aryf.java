package p000;

import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.p066ui.D2DSetupChimeraActivity;
import java.util.List;

/* renamed from: aryf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aryf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f88449a;

    /* renamed from: b */
    final /* synthetic */ D2DSetupChimeraActivity f88450b;

    public aryf(D2DSetupChimeraActivity d2DSetupChimeraActivity, Account account) {
        this.f88450b = d2DSetupChimeraActivity;
        this.f88449a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        for (Boolean bool : (List) obj) {
            if (Boolean.TRUE.equals(bool)) {
                this.f88450b.runOnUiThread(new aryc(this));
                return;
            }
        }
        this.f88450b.runOnUiThread(new aryd(this, this.f88449a));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        D2DSetupChimeraActivity.f108197b.mo25416d("Unsupported account status lookup timed out", new Object[0]);
        this.f88450b.runOnUiThread(new arye(this, this.f88449a));
    }
}
