package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: lki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lki extends lim {
    public lki(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        if (cciw.m129955d()) {
            Intent intent = (Intent) bundle.getParcelable("com.google.android.gms.autofill.extra.INTENT");
            if (intent != null) {
                lir.startActivityForResult(intent, 1000);
            } else {
                mo15165a(0);
            }
        } else {
            mo15165a(0);
        }
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i == 1000) {
            mo15165a(0);
        }
    }
}
