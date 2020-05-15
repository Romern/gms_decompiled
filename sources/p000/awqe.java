package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: awqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqe {

    /* renamed from: a */
    public final SharedPreferences f94843a;

    /* renamed from: b */
    public final long f94844b = 86400000;

    /* renamed from: c */
    public final int f94845c = 60;

    /* renamed from: d */
    public final Context f94846d;

    public awqe(Context context) {
        this.f94846d = context;
        this.f94843a = context.getSharedPreferences("com.google.android.gms.wallet.service.analytics.AnalyticsPersistentStore", 4);
    }
}
