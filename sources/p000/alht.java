package p000;

import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

/* renamed from: alht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alht extends alhs {

    /* renamed from: a */
    public final aldi f73519a = new aldi();

    public alht() {
        super("com.google.android.gms.pay.fops.VIEW_FOP");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40352a(alfq alfq) {
        alfq.f73507a.f81553b = this.f73519a.f73497a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40354a(PayIntentArgs payIntentArgs) {
        boolean z;
        boolean z2 = false;
        if (payIntentArgs.f81552a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "account required");
        FopDetailIntentArgs fopDetailIntentArgs = payIntentArgs.f81553b;
        sdo.m34959a(fopDetailIntentArgs);
        if (!(fopDetailIntentArgs.f81471a == null && fopDetailIntentArgs.f81472b == null && fopDetailIntentArgs.f81473c == null)) {
            z2 = true;
        }
        sdo.m34975b(z2, "devicePaymentMethodId or cloudPaymentMethodId required");
    }
}
