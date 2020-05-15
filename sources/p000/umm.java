package p000;

import android.database.Cursor;
import com.google.android.gms.drive.DriveId;

/* renamed from: umm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class umm implements uhx {

    /* renamed from: a */
    private final uhn f48222a;

    public umm(uhn uhn) {
        this.f48222a = uhn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        DriveId driveId;
        umn a = umn.m38963a(uno, cursor);
        ujl f = this.f48222a.mo27441f(a.f48224b);
        uih c = this.f48222a.mo27427c(f.f47792a);
        ukk ukk = a.f48223a;
        if (ukk != null) {
            driveId = new DriveId(a.f48226d, ukk.f47941a, a.f48334am.mo27481g(), 0);
        } else {
            String str = a.f48226d;
            driveId = str != null ? DriveId.m22924a(str) : null;
        }
        return new vhb(driveId, c, f.f47793b);
    }
}
