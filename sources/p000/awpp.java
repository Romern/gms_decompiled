package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: awpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpp extends bjfr {

    /* renamed from: a */
    private final Context f94814a;

    /* renamed from: b */
    private final bjfr f94815b;

    public awpp(Context context, bjfr bjfr) {
        this.f94814a = context;
        this.f94815b = bjfr;
    }

    /* renamed from: a */
    public final Intent mo52452a(Intent intent) {
        try {
            return this.f94815b.mo52452a(intent);
        } catch (Throwable th) {
            awye.m81493a(this.f94814a, th);
            return bjfd.m103295a(3);
        }
    }
}
