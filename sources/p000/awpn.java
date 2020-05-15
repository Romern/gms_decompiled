package p000;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: awpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpn {

    /* renamed from: a */
    boolean f94808a = false;

    /* renamed from: b */
    volatile CountDownLatch f94809b = new CountDownLatch(1);

    /* renamed from: c */
    volatile bjfs f94810c;

    /* renamed from: d */
    public final Context f94811d;

    /* renamed from: e */
    final aeaa f94812e;

    public awpn(Context context) {
        this.f94811d = context;
        this.f94812e = new awpm(this, "wallet");
    }
}
