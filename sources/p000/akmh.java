package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.NetworkKey;

/* renamed from: akmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmh {

    /* renamed from: a */
    public final Context f72256a;

    /* renamed from: b */
    public final akmd f72257b;

    /* renamed from: c */
    public final akmy f72258c;

    /* renamed from: d */
    private final akma f72259d;

    public akmh(Context context) {
        Context applicationContext = context.getApplicationContext();
        akma akma = new akma(context.getApplicationContext());
        akmd a = akmd.m59995a(context);
        akmy a2 = akmy.m60045a(context);
        this.f72256a = applicationContext;
        this.f72259d = akma;
        this.f72257b = a;
        this.f72258c = a2;
    }

    /* renamed from: a */
    public final void mo39559a(NetworkKey[] networkKeyArr) {
        mo39560a(networkKeyArr, null);
    }

    /* renamed from: a */
    public final void mo39560a(NetworkKey[] networkKeyArr, PendingIntent pendingIntent) {
        int i = spn.f44932a;
        if (networkKeyArr != null && networkKeyArr.length > 0) {
            this.f72259d.mo39551a(networkKeyArr, pendingIntent);
        }
    }
}
