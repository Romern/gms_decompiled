package p000;

import android.content.Context;
import android.util.Log;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: aphc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aphc extends aaab {

    /* renamed from: a */
    private final int f84376a;

    public aphc(int i) {
        super(BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, "HandleWakeupEvent");
        this.f84376a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        aapx aapx = aapx.CAUSE_UNKNOWN;
        int ordinal = aapx.m21801a(this.f84376a).ordinal();
        if (ordinal == 1) {
            aphm.m70304b(context);
        } else if (ordinal == 2) {
            aphm.m70303b();
        } else if (ordinal == 3) {
            aphm.m70306c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Failed to send wakeup message");
        sb.append(valueOf);
        Log.e("NetworkScheduler", sb.toString());
    }
}
