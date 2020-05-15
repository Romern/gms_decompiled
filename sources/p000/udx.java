package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.internal.RemoveEventListenerRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udx extends ucg {

    /* renamed from: f */
    private final RemoveEventListenerRequest f47331f;

    /* renamed from: g */
    private final utr f47332g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public udx(ubk ubk, RemoveEventListenerRequest removeEventListenerRequest, utr utr, uto uto) {
        super("RemoveEventListenerOperation", ubk, uto, r0);
        int i;
        int i2 = 17;
        if (!(removeEventListenerRequest == null || (i = removeEventListenerRequest.f30912b) == 1)) {
            if (i == 4) {
                i2 = 46;
            } else if (i == 7) {
                i2 = 70;
            } else if (i == 8) {
                int i3 = removeEventListenerRequest.f30913c.f30788a;
                i2 = i3 != 0 ? i3 == 1 ? 59 : 0 : 60;
            }
        }
        this.f47331f = removeEventListenerRequest;
        this.f47332g = utr;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        ujx d;
        aaal.m21020a(this.f47331f, "Invalid remove event listener request: no request");
        int i = this.f47331f.f30912b;
        if (i != 1) {
            if (i != 4) {
                if (i == 7 || i == 8) {
                    String str = this.f47241e.f47395b;
                    if (!this.f47237a.mo27099g()) {
                        if (!(twy.f46796G.mo58455c() == null ? Collections.EMPTY_LIST : Arrays.asList(((String) twy.f46796G.mo58455c()).split("\\s*,\\s*"))).contains(str)) {
                            throw new aaaj(10, "App is not whitelisted to make this request.");
                        }
                    }
                } else {
                    throw new aaaj(8, "Unexpected event type");
                }
            } else if (!this.f47237a.mo27097f()) {
                throw new aaaj(10, "App is not authorized to make this request.");
            }
        }
        RemoveEventListenerRequest removeEventListenerRequest = this.f47331f;
        DriveId driveId = removeEventListenerRequest.f30911a;
        int i2 = removeEventListenerRequest.f30912b;
        TransferProgressOptions transferProgressOptions = removeEventListenerRequest.f30913c;
        aaal.m21021a(uqf.m39231a(i2, driveId), "Invalid remove event listener request: invalid drive id");
        if (!(driveId == null || (d = this.f47237a.mo27092d(driveId)) == null)) {
            this.f47239c.mo28287a(d);
        }
        if (this.f47332g == null) {
            this.f47239c.mo28299c(1);
            ubk ubk = this.f47237a;
            uey uey = ubk.f47143d;
            if (i2 == 1) {
                ubk.f47152m.mo27891a(uey, driveId);
            } else if (i2 == 4) {
                ubk.f47152m.mo27890a(uey);
            } else if (i2 == 7) {
                ubk.f47152m.mo27896b(uey);
            } else {
                throw new aaaj(8, "Unexpected event type");
            }
        } else {
            this.f47239c.mo28299c(0);
            if (i2 == 1) {
                this.f47237a.f47151l.mo27810a(driveId, this.f47332g);
            } else if (i2 == 4) {
                this.f47237a.f47151l.mo27823b(this.f47332g);
            } else if (i2 == 8) {
                aaal.m21020a(transferProgressOptions, "Invalid remove transfer progress listener request: no options");
                this.f47237a.f47151l.mo27811a(driveId, this.f47332g, transferProgressOptions);
            } else {
                throw new aaaj(8, "Unexpected event type");
            }
        }
        this.f47238b.mo27971a();
    }
}
