package p000;

import android.os.Bundle;
import android.os.Messenger;

/* renamed from: ald */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ald extends alo {

    /* renamed from: a */
    final /* synthetic */ Messenger f817a;

    /* renamed from: b */
    final /* synthetic */ int f818b;

    /* renamed from: c */
    final /* synthetic */ alj f819c;

    public ald(alj alj, Messenger messenger, int i) {
        this.f819c = alj;
        this.f817a = messenger;
        this.f818b = i;
    }

    /* renamed from: a */
    public final void mo957a(Bundle bundle) {
        if (this.f819c.mo968b(this.f817a) >= 0) {
            alj.m1008a(this.f817a, 3, this.f818b, 0, bundle, null);
        }
    }

    /* renamed from: a */
    public final void mo958a(String str, Bundle bundle) {
        if (this.f819c.mo968b(this.f817a) < 0) {
            return;
        }
        if (str != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("error", str);
            alj.m1008a(this.f817a, 4, this.f818b, 0, bundle, bundle2);
            return;
        }
        alj.m1008a(this.f817a, 4, this.f818b, 0, bundle, null);
    }
}
