package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
import com.google.android.gms.drive.internal.AddEventListenerRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucc extends ucg {

    /* renamed from: f */
    private final AddEventListenerRequest f47231f;

    /* renamed from: g */
    private final utr f47232g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ucc(ubk ubk, AddEventListenerRequest addEventListenerRequest, utr utr, uto uto) {
        super("AddEventListenerOperation", ubk, uto, r0);
        int i;
        int i2 = 0;
        if (!(addEventListenerRequest == null || (i = addEventListenerRequest.f30797b) == 1)) {
            if (i == 4) {
                i2 = 45;
            } else if (i == 7) {
                i2 = 69;
            } else if (i == 8) {
                int i3 = addEventListenerRequest.f30800e.f30788a;
                if (i3 == 0) {
                    i2 = 58;
                } else if (i3 == 1) {
                    i2 = 57;
                }
            }
        }
        this.f47231f = addEventListenerRequest;
        this.f47232g = utr;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47231f, "Invalid add event listener request: no request");
        int i = this.f47231f.f30797b;
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
        AddEventListenerRequest addEventListenerRequest = this.f47231f;
        DriveId driveId = addEventListenerRequest.f30796a;
        int i2 = addEventListenerRequest.f30797b;
        aaal.m21021a(uqf.m39231a(i2, driveId), "Invalid add event listener request: invalid drive id");
        AddEventListenerRequest addEventListenerRequest2 = this.f47231f;
        ChangesAvailableOptions changesAvailableOptions = addEventListenerRequest2.f30798c;
        TransferStateOptions transferStateOptions = addEventListenerRequest2.f30799d;
        TransferProgressOptions transferProgressOptions = addEventListenerRequest2.f30800e;
        if (i2 == 4) {
            aaal.m21020a(changesAvailableOptions, "Invalid add event listener request: null changes available options");
        } else if (i2 == 7) {
            aaal.m21020a(transferStateOptions, "Invalid add event listener request: null transfer state options");
        } else if (i2 == 8) {
            aaal.m21020a(transferProgressOptions, "Invalid add event listener request: null transfer progress options");
        }
        if (driveId != null) {
            this.f47239c.mo28287a(this.f47237a.mo27088b(driveId));
        }
        if (this.f47232g == null) {
            this.f47239c.mo28299c(1);
            if (i2 == 1) {
                ubk ubk = this.f47237a;
                ubk.f47152m.mo27892a(ubk.f47143d, ubk.mo27097f(), driveId);
            } else if (i2 == 4) {
                ubk ubk2 = this.f47237a;
                uey uey = ubk2.f47143d;
                String a = ubk2.mo27073a();
                Set a2 = vpv.m41035a(uey, changesAvailableOptions.mo18151a());
                ubk ubk3 = this.f47237a;
                ubk3.f47152m.mo27893a(uey, ubk3.mo27097f(), changesAvailableOptions, a, a2);
            } else if (i2 == 7) {
                ubk ubk4 = this.f47237a;
                uey uey2 = ubk4.f47143d;
                String a3 = ubk4.mo27073a();
                Set a4 = vpv.m41035a(uey2, transferStateOptions.mo18165a());
                ubk ubk5 = this.f47237a;
                ubk5.f47152m.mo27894a(uey2, ubk5.mo27097f(), transferStateOptions, a3, a4);
            } else {
                throw new aaaj(8, "Unexpected event type");
            }
        } else {
            this.f47239c.mo28299c(0);
            if (i2 == 1) {
                this.f47237a.f47151l.mo27809a(driveId, this.f47237a.mo27104k().f30716a, this.f47232g);
            } else if (i2 == 4) {
                utr utr = this.f47232g;
                ubk ubk6 = this.f47237a;
                uey uey3 = ubk6.f47143d;
                ubk6.mo27073a();
                this.f47237a.f47151l.mo27818a(utr, this.f47237a.mo27104k().f30716a, changesAvailableOptions, vpv.m41035a(uey3, changesAvailableOptions.mo18151a()));
            } else if (i2 == 8) {
                this.f47237a.f47151l.mo27816a(new uqv(this.f47232g, driveId, transferProgressOptions));
            } else {
                throw new aaaj(8, "Unexpected event type");
            }
        }
        this.f47238b.mo27971a();
    }
}
