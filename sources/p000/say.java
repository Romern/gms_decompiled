package p000;

import android.content.Intent;

/* renamed from: say */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class say extends saz {

    /* renamed from: a */
    final /* synthetic */ Intent f43978a;

    /* renamed from: b */
    final /* synthetic */ rnx f43979b;

    public say(Intent intent, rnx rnx) {
        this.f43978a = intent;
        this.f43979b = rnx;
    }

    /* renamed from: a */
    public final void mo25323a() {
        Intent intent = this.f43978a;
        if (intent != null) {
            this.f43979b.startActivityForResult(intent, 2);
        }
    }
}
