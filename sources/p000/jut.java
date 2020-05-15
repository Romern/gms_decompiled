package p000;

import android.content.Context;
import com.google.android.gms.auth.setup.devicesignals.LockScreenChimeraService;

/* renamed from: jut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jut implements gim {

    /* renamed from: a */
    public static final jut f23268a = new jut();

    private jut() {
    }

    /* renamed from: a */
    private static final void m17352a(Context context, boolean z) {
        context.startService(LockScreenChimeraService.m6899a(context).putExtra("is_boot", z));
    }

    /* renamed from: b */
    public final void mo11908b(Context context) {
        m17352a(context, true);
    }

    /* renamed from: c */
    public final void mo11909c(Context context) {
    }

    /* renamed from: a */
    public final void mo11907a(Context context) {
        m17352a(context, false);
    }
}
