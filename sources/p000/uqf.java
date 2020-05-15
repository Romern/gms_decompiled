package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: uqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqf {
    /* renamed from: a */
    public static boolean m39231a(int i, DriveId driveId) {
        if (i != 1) {
            if (i == 4 || i == 7) {
                return driveId == null;
            }
            if (i != 8) {
                return false;
            }
        }
        return driveId != null;
    }
}
