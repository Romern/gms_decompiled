package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aiwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiwn extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f69943a;

    /* renamed from: b */
    final /* synthetic */ aiwp f69944b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiwn(aiwp aiwp, String str, String str2) {
        super(str);
        this.f69944b = aiwp;
        this.f69943a = str2;
    }

    public final void run() {
        srn srn = ahfq.f67120a;
        Context context = this.f69944b.f69948a;
        String str = this.f69943a;
        Intent b = aiyb.m58179b(context);
        b.setAction("com.google.android.gms.nearby.messages.service.STOP_CLIENT");
        b.putExtra("com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME", str);
        context.startService(b);
    }
}
