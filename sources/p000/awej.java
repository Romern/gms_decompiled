package p000;

import android.os.Bundle;

/* renamed from: awej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awej {
    /* renamed from: a */
    public static awei m79707a(dnx dnx, bjhm bjhm, Bundle bundle) {
        if (dnx.getIntent().getIntExtra("widgetType", 0) == 2) {
            return new aweh(dnx, bjhm, bundle);
        }
        return new awed(dnx, bjhm);
    }
}
