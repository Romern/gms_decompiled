package p000;

import android.content.Context;

/* renamed from: ahfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfl {
    /* renamed from: a */
    public static burk m55644a(Context context) {
        boolean z;
        burj burj = new burj();
        sre.m36087g(context);
        boolean z2 = false;
        if (sre.m36083c(context) || sre.m36082b(context) || sre.m36080a(context)) {
            z = true;
        } else {
            sre.m36088h(context);
            sre.m36089i(context);
            z = false;
        }
        burj.f154769a = Boolean.valueOf(z);
        if (C1133kh.m17835a(context, "android.permission.MANAGE_USERS") == 0 && ssh.m36213a(context).mo26045d()) {
            z2 = true;
        }
        burj.f154770b = Boolean.valueOf(z2);
        String str = burj.f154769a == null ? " isBlackListDeviceType" : "";
        if (burj.f154770b == null) {
            str = str.concat(" isManagedProfile");
        }
        if (str.isEmpty()) {
            return new buqv(burj.f154769a.booleanValue(), burj.f154770b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }
}
