package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.List;

/* renamed from: nng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nng implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f36086a;

    /* renamed from: b */
    final /* synthetic */ List f36087b;

    /* renamed from: c */
    final /* synthetic */ Intent f36088c;

    /* renamed from: d */
    final /* synthetic */ Bundle f36089d;

    /* renamed from: e */
    final /* synthetic */ noj f36090e;

    public nng(noj noj, int i, List list, Intent intent, Bundle bundle) {
        this.f36090e = noj;
        this.f36086a = i;
        this.f36087b = list;
        this.f36088c = intent;
        this.f36089d = bundle;
    }

    public final void run() {
        nip g = this.f36090e.mo21194g();
        if (g != null) {
            int i = this.f36086a;
            if (i == -1) {
                g.mo20807a(this.f36087b, this.f36088c, this.f36089d);
            } else {
                g.mo20800a(this.f36088c, this.f36089d, i);
            }
        }
    }
}
