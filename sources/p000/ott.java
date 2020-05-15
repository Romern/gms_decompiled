package p000;

import android.content.Intent;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.carsetup.FirstActivityImpl;

/* renamed from: ott */
final /* synthetic */ class ott implements Runnable {

    /* renamed from: a */
    private final FirstActivityImpl f38436a;

    /* renamed from: b */
    private final boolean f38437b;

    /* renamed from: c */
    private final Intent f38438c;

    public ott(FirstActivityImpl firstActivityImpl, boolean z, Intent intent) {
        this.f38436a = firstActivityImpl;
        this.f38437b = z;
        this.f38438c = intent;
    }

    public final void run() {
        FirstActivityImpl firstActivityImpl = this.f38436a;
        boolean z = this.f38437b;
        Intent intent = this.f38438c;
        if (!z) {
            bnsi b = FirstActivityImpl.f29636a.mo68387b();
            b.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Intent validation failed %s", intent);
            firstActivityImpl.finish();
            return;
        }
        firstActivityImpl.mo17441a(intent);
    }
}
