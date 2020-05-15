package p000;

import android.os.Bundle;

/* renamed from: awgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgc implements Runnable {

    /* renamed from: a */
    public final Bundle f94286a;

    /* renamed from: b */
    private final awgb f94287b;

    private awgc(awgb awgb, Bundle bundle) {
        this.f94286a = bundle;
        this.f94287b = awgb;
    }

    /* renamed from: a */
    public static awgc m79888a(awgb awgb, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        return new awgc(awgb, bundle);
    }

    public final void run() {
        this.f94287b.mo52066h(this.f94286a);
    }

    /* renamed from: a */
    public static String m79889a(Bundle bundle) {
        return bundle.getString("action");
    }
}
