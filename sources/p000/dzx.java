package p000;

import android.content.Intent;

/* renamed from: dzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dzx {

    /* renamed from: a */
    public final bxmq f14504a;

    /* renamed from: b */
    public final double f14505b;

    public dzx(Intent intent) {
        double d = -1.0d;
        if (intent == null) {
            this.f14504a = bxmq.UNKNOWN;
            this.f14505b = -1.0d;
            return;
        }
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra == 1) {
            this.f14504a = bxmq.CONNECTED_AC;
        } else if (intExtra == 2) {
            this.f14504a = bxmq.CONNECTED_USB;
        } else if (intExtra != 4) {
            this.f14504a = bxmq.DISCONNECTED;
        } else {
            this.f14504a = bxmq.CONNECTED_WIRELESS;
        }
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            double d2 = (double) intExtra2;
            double d3 = (double) intExtra3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        }
        this.f14505b = d;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("plug", Integer.valueOf(this.f14504a.f163976f));
        a.mo25396a("battery", Double.valueOf(this.f14505b));
        return a.toString();
    }
}
