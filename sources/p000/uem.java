package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.UnsubscribeResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uem extends uch {

    /* renamed from: f */
    private final UnsubscribeResourceRequest f47361f;

    public uem(ubk ubk, UnsubscribeResourceRequest unsubscribeResourceRequest, uto uto) {
        super("UnsubscribeResourceOperation", ubk, uto, 43);
        this.f47361f = unsubscribeResourceRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c);
    }

    /* renamed from: d */
    public final void mo27234d(Context context) {
        aaal.m21020a(this.f47361f, "Invalid unsubscribe request.");
        aaal.m21020a(this.f47361f.f30925a, "Invalid unsubscribe request.");
        ubk ubk = this.f47237a;
        DriveId driveId = this.f47361f.f30925a;
        vcy vcy = this.f47239c;
        ujx b = ubk.mo27088b(driveId);
        if (!b.mo27621j()) {
            vcy.mo28287a(b);
            uey uey = ubk.f47143d;
            if (ubk.f47146g.mo26999a(new tzc(uey.f47394a, uey.f47396c, b.mo27551a(), false, tyq.NORMAL), vcy) == 0) {
                this.f47238b.mo27971a();
                return;
            }
            throw new aaaj(8, "Failed to unsubscribe resource.");
        }
        throw new aaaj(10, "Cannot unsubscribe from a resource you own.");
    }
}
