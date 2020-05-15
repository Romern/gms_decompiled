package p000;

import android.os.Bundle;

/* renamed from: awqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqb {

    /* renamed from: a */
    public final int f94841a;

    /* renamed from: b */
    public final Bundle f94842b;

    public awqb(int i, Bundle bundle) {
        this.f94841a = i;
        this.f94842b = bundle;
    }

    /* renamed from: a */
    public static awqb m80661a() {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        return new awqb(1, bundle);
    }
}
