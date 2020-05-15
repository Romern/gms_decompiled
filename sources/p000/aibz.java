package p000;

import android.app.PendingIntent;
import android.content.Intent;

/* renamed from: aibz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibz extends buqn {

    /* renamed from: a */
    final /* synthetic */ boolean f68651a;

    /* renamed from: b */
    final /* synthetic */ Intent f68652b;

    /* renamed from: c */
    final /* synthetic */ String f68653c;

    /* renamed from: d */
    final /* synthetic */ PendingIntent f68654d;

    /* renamed from: e */
    final /* synthetic */ aics f68655e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibz(aics aics, String str, boolean z, Intent intent, String str2, PendingIntent pendingIntent) {
        super(str);
        this.f68655e = aics;
        this.f68651a = z;
        this.f68652b = intent;
        this.f68653c = str2;
        this.f68654d = pendingIntent;
    }

    public final void run() {
        if (cfoj.f184966a.mo6606a().mo82078aB()) {
            if (this.f68651a || this.f68652b.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT")) {
                this.f68655e.f68711h.mo37416a(this.f68652b);
            }
        } else if (this.f68651a) {
            this.f68655e.f68711h.mo37416a(this.f68652b);
        }
        boolean z = false;
        ((ahgp) ahgz.m55754a(this.f68655e.f68708e, ahgp.class)).mo36449a(this.f68652b.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", 0));
        if (!cfoj.m141541V()) {
            boolean booleanExtra = this.f68652b.getBooleanExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", true);
            aics aics = this.f68655e;
            String str = this.f68653c;
            if (this.f68654d != null) {
                z = true;
            }
            aics.mo37405a(booleanExtra, str, z, (String) null);
        }
    }
}
