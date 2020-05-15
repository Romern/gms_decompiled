package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.NetworkKey;
import java.util.concurrent.Executor;

/* renamed from: akma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akma {

    /* renamed from: a */
    public final Context f72233a;

    /* renamed from: b */
    public final akmy f72234b;

    /* renamed from: c */
    public final akmg f72235c;

    /* renamed from: d */
    public final akmb f72236d;

    /* renamed from: e */
    public final akme f72237e;

    /* renamed from: f */
    private final Executor f72238f;

    public akma(Context context) {
        akmy a = akmy.m60045a(context);
        akmg akmg = new akmg(context);
        akme akme = new akme(context);
        bqgj a2 = snp.m35702a(10);
        this.f72233a = context;
        this.f72238f = a2;
        this.f72234b = a;
        this.f72235c = akmg;
        this.f72237e = akme;
        this.f72236d = new akmb(context);
    }

    /* renamed from: a */
    public final void mo39551a(NetworkKey[] networkKeyArr, PendingIntent pendingIntent) {
        this.f72238f.execute(new aklz(this, networkKeyArr, pendingIntent));
    }
}
