package p000;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.Dataset;

/* renamed from: ljv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ljv extends lim {
    public ljv(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
    }

    /* renamed from: a */
    public void mo15164a() {
        mo15208i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15208i() {
        Intent intent = new Intent();
        intent.putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", (Dataset) this.f26160b.getParcelable("com.google.android.gms.autofill.extra.DATASET"));
        mo15167a(-1, intent);
    }
}
