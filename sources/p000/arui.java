package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: arui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arui implements rkk {

    /* renamed from: a */
    public final UserCredential[] f88316a;

    /* renamed from: b */
    public final String f88317b;

    /* renamed from: c */
    public final String f88318c;

    /* renamed from: d */
    private final Status f88319d;

    public arui(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        this.f88319d = status;
        this.f88316a = userCredentialArr;
        this.f88317b = str;
        this.f88318c = str2;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f88319d;
    }
}
