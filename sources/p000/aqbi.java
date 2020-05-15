package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: aqbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbi extends apuj {

    /* renamed from: b */
    public static final /* synthetic */ int f85555b = 0;

    /* renamed from: a */
    final Intent f85556a;

    static {
        aqbi.class.getSimpleName();
    }

    public aqbi(Context context, Intent intent) {
        super(context, "rharesult");
        this.f85556a = intent;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int intExtra = this.f85556a.getIntExtra("nonce", -1);
        int d = aqbh.m71290a(context).mo47628d();
        if (d < 0 || intExtra != d) {
            mo47617b(Status.f30109c);
        } else if (!this.f85556a.hasExtra("pressed_uninstall_action") || !this.f85556a.hasExtra("dialog_not_shown")) {
            mo47617b(Status.f30109c);
        } else {
            boolean booleanExtra = this.f85556a.getBooleanExtra("pressed_uninstall_action", false);
            int intExtra2 = this.f85556a.getIntExtra("dialog_not_shown", 0);
            if (booleanExtra && intExtra2 == 2) {
                intExtra2 = 3;
            }
            aqbh.m71290a(context).mo47626a(new Status(0), intExtra2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47617b(Status status) {
        aqbh.m71290a(this.f84919c).mo47626a(status, 0);
    }
}
