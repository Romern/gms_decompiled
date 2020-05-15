package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: tzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzz extends tzw {
    /* JADX WARNING: Illegal instructions before constructor call */
    public tzz(DriveId driveId) {
        super(r1.toString());
        String valueOf = String.valueOf(driveId);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Singleton entry already exists: DriveId:");
        sb.append(valueOf);
    }
}
