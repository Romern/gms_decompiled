package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: sqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqb extends sqa {
    public sqb(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo25954a(String str, int i, String str2, String str3) {
        try {
            this.f44956b.finishOp(str, i, str2, str3);
        } catch (IllegalStateException e) {
            Log.e("AppOpsCompat30", String.format("Op %s finished but never started, %d:%s", str, Integer.valueOf(i), str2), e);
        }
    }

    /* renamed from: b */
    public final int mo25958b(String str, int i, String str2, String str3) {
        return this.f44956b.noteOpNoThrow(str, i, str2, str3, null);
    }

    /* renamed from: c */
    public final int mo25961c(String str, int i, String str2, String str3) {
        return this.f44956b.startOpNoThrow(str, i, str2, str3, null);
    }
}
