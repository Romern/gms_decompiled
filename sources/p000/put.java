package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: put */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class put {

    /* renamed from: a */
    public final Intent f40290a;

    /* renamed from: b */
    public final alo f40291b;

    /* renamed from: c */
    public long f40292c = -1;

    public put(Intent intent, alo alo) {
        this.f40290a = intent;
        this.f40291b = alo;
    }

    /* renamed from: a */
    public final void mo23710a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.cast.EXTRA_ERROR_CODE", i);
        this.f40291b.mo958a(str, bundle);
    }

    /* renamed from: a */
    public final void mo23711a(Bundle bundle) {
        this.f40291b.mo957a(bundle);
    }
}
