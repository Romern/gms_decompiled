package p000;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: gil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gil extends UserRecoverableAuthException {

    /* renamed from: a */
    public final int f18300a;

    public gil(int i, String str, Intent intent) {
        super(str, intent);
        this.f18300a = i;
    }
}
