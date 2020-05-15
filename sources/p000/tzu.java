package p000;

import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: tzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzu extends tzw {
    public tzu() {
        this(null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public tzu(AppIdentity appIdentity) {
        super(r1.toString());
        String valueOf = String.valueOf(appIdentity);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Application is no longer authorized: ");
        sb.append(valueOf);
    }
}
