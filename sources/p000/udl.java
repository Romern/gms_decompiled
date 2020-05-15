package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.GetPermissionsRequest;
import com.google.android.gms.drive.internal.GetPermissionsResponse;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: udl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udl extends uci {

    /* renamed from: f */
    private final GetPermissionsRequest f47298f;

    public udl(ubk ubk, GetPermissionsRequest getPermissionsRequest, uto uto) {
        super("GetPermissionsOperation", ubk, uto, (String) twy.f46852aj.mo58455c(), 51);
        this.f47298f = getPermissionsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        Pair pair;
        aaal.m21020a(this.f47298f, "Invalid getPermissions request.");
        aaal.m21020a(this.f47298f.f30859a, "Invalid getPermissions request.");
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47298f.f30859a;
        vcy vcy = this.f47239c;
        ujx a = ubk.mo27078a(ubk.f47143d, driveId);
        int i = 0;
        if (a == null || a.mo27576al() < a.mo27569ae()) {
            if (driveId.f30728a != null) {
                a = ubk.mo27098g(driveId);
            }
            if (a != null) {
                vcy.mo28287a(a);
                if (a.mo27576al() < a.mo27569ae()) {
                    i = -1;
                }
                pair = Pair.create(ubk.mo27074a(a), Integer.valueOf(i));
            } else {
                throw ubk.m37920m();
            }
        } else {
            vcy.mo28287a(a);
            pair = Pair.create(ubk.mo27074a(a), 0);
        }
        this.f47238b.mo27973a(new GetPermissionsResponse((List) pair.first, ((Integer) pair.second).intValue()));
    }
}
