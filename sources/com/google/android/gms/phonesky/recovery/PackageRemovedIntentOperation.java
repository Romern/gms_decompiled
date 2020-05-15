package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageRemovedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private anje f82159a;

    /* renamed from: b */
    private anjd f82160b;

    public final void onCreate() {
        this.f82159a = new anje(this);
        this.f82160b = new anjd(new svq(this));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            anjb.m64557b("Invalid package removed intent", new Object[0]);
        } else if (intent.getData().getSchemeSpecificPart().equals("com.android.vending")) {
            long b = anjc.m64559b(this);
            anjc.m64560c(this);
            if (b == -1 || System.currentTimeMillis() - b > cgez.m144970b()) {
                anjb.m64556a("No recent notifications shown - organic recovery", new Object[0]);
            } else if (this.f82160b.mo41865a(cgez.m144971c())) {
                anjb.m64557b("Bad version still installed", new Object[0]);
                this.f82159a.mo41867a(4, 3);
            } else {
                anjb.m64556a("Successful recovery", new Object[0]);
                this.f82159a.mo41866a(4);
            }
        }
    }
}
