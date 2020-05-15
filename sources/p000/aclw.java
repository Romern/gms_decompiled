package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: aclw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aclw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f60139a;

    /* renamed from: b */
    final /* synthetic */ aclx f60140b;

    public aclw(aclx aclx, Context context) {
        this.f60140b = aclx;
        this.f60139a = context;
    }

    public final void run() {
        Intent c = UpdateIcingCorporaIntentOperation.m66731c(this.f60139a);
        if (c != null) {
            this.f60139a.startService(c);
            this.f60140b.f60142b.set(false);
        }
    }
}
