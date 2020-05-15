package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aurc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurc {
    /* renamed from: a */
    public static final rke m77675a(rkb rkb) {
        return rkb.mo24787a((rle) new aurb(rkb));
    }

    /* renamed from: a */
    public static final boolean m77676a(Context context) {
        return context.getPackageManager().resolveService(new Intent("com.google.android.gms.trustagent.StateApi.START"), 0) != null;
    }
}
