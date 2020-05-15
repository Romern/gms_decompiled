package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: uac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uac extends tzw {
    /* JADX WARNING: Illegal instructions before constructor call */
    public uac(DriveId driveId) {
        super(r1.toString());
        String valueOf = String.valueOf(driveId);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Parent entry no longer exists: ");
        sb.append(valueOf);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public uac(ukk ukk) {
        super(r1.toString());
        String valueOf = String.valueOf(ukk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Parent entry no longer exists: ");
        sb.append(valueOf);
    }
}
