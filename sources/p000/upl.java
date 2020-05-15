package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.Set;

/* renamed from: upl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class upl implements uoz {

    /* renamed from: a */
    public static final sbw f48480a = new sbw("CallbackStoreImpl", "");

    /* renamed from: b */
    final uoy f48481b = new uoy();

    /* renamed from: c */
    final uoy f48482c = new uoy();

    /* renamed from: d */
    private final uow f48483d = new uow();

    /* renamed from: e */
    private final uow f48484e = new uow();

    /* renamed from: f */
    private final uow f48485f = new uow();

    /* renamed from: g */
    private final vcz f48486g;

    /* renamed from: h */
    private final uqh f48487h;

    /* renamed from: i */
    private volatile vau f48488i;

    public upl(vcz vcz, uqh uqh) {
        sdo.m34959a(vcz);
        this.f48486g = vcz;
        sdo.m34959a(uqh);
        this.f48487h = uqh;
    }

    /* renamed from: a */
    private static final uox m39186a(TransferProgressEvent transferProgressEvent, String str) {
        return new uph(transferProgressEvent, str);
    }

    /* renamed from: a */
    public final void mo27820a(vau vau) {
        this.f48488i = vau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27827b() {
        vau vau = this.f48488i;
        if (vau != null) {
            boolean z = true;
            if (this.f48483d.mo27801b() && this.f48484e.mo27801b() && this.f48481b.mo27806b() && this.f48482c.mo27806b()) {
                z = false;
            }
            vau.mo28180a(z);
        }
    }

    /* renamed from: a */
    public final void mo27808a() {
        this.f48483d.mo27797a();
        this.f48484e.mo27797a();
        this.f48485f.mo27797a();
        this.f48481b.mo27803a();
        this.f48482c.mo27803a();
        mo27827b();
    }

    /* renamed from: b */
    public final void mo27822b(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        this.f48485f.mo27798a(driveId, m39186a(transferProgressEvent, "pinned download"));
    }

    /* renamed from: a */
    public final void mo27826a(int i, ujx ujx) {
        vdk d = ((vdd) this.f48486g).mo28316d();
        d.mo28300c(2, i);
        d.mo28299c(0);
        d.mo28309j();
        if (ujx != null) {
            d.mo28287a(ujx);
        }
        d.mo28274a();
    }

    /* renamed from: b */
    public final void mo27823b(utr utr) {
        this.f48482c.mo27807b(upq.m39209a(utr));
    }

    /* renamed from: a */
    public final void mo27809a(DriveId driveId, long j, utr utr) {
        if (this.f48483d.mo27799a(driveId, new upm(utr, driveId, j))) {
            mo27827b();
        }
    }

    /* renamed from: a */
    public final void mo27810a(DriveId driveId, utr utr) {
        this.f48483d.mo27800b(driveId, upm.m39205a(utr));
    }

    /* renamed from: a */
    public final void mo27811a(DriveId driveId, utr utr, TransferProgressOptions transferProgressOptions) {
        int i = transferProgressOptions.f30788a;
        if (i == 0) {
            this.f48484e.mo27800b(driveId, uqv.m39279a(utr));
        } else if (i != 1) {
            f48480a.mo25374b("CallbackStoreImpl", "Invalid transfer type: %d", Integer.valueOf(transferProgressOptions.f30788a));
        } else {
            this.f48485f.mo27800b(driveId, uqv.m39279a(utr));
        }
    }

    /* renamed from: a */
    public final void mo27812a(ChangeEvent changeEvent, ujx ujx) {
        DriveId driveId = changeEvent.f30770a;
        sdo.m34959a(driveId);
        sdo.checkIfNull(ujx, "Entry can't be null for change events");
        sdo.m34975b(driveId.equals(ujx.mo27610g()), "Event and entry mismatch");
        this.f48483d.mo27798a(ujx.mo27610g(), new upj(this, changeEvent, ujx));
        this.f48482c.mo27804a(new upk(this, ujx));
    }

    /* renamed from: a */
    public final void mo27813a(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        this.f48484e.mo27798a(driveId, m39186a(transferProgressEvent, "upload"));
    }

    /* renamed from: a */
    public final void mo27814a(String str, boolean z) {
        this.f48481b.mo27804a(new upi(str, z));
    }

    /* renamed from: a */
    public final void mo27815a(Set set) {
        this.f48481b.mo27804a(new upg(this, set));
    }

    /* renamed from: a */
    public final void mo27816a(uqv uqv) {
        int i = uqv.f48570d;
        if (i == 0) {
            this.f48484e.mo27799a(uqv.f48569c, uqv);
        } else if (i != 1) {
            f48480a.mo25374b("CallbackStoreImpl", "Invalid transfer type: %s", Integer.valueOf(uqv.f48570d));
        } else {
            this.f48485f.mo27799a(uqv.f48569c, uqv);
        }
        try {
            uqv.mo27897a(new TransferProgressEvent(this.f48487h.mo27864a(uqv.f48570d, uqv.f48569c)));
        } catch (RemoteException e) {
            f48480a.mo25378c("CallbackStoreImpl", "Error raising progress event", e);
        }
    }

    /* renamed from: a */
    public final void mo27817a(utr utr) {
        this.f48481b.mo27807b(uqm.m39250a(utr));
    }

    /* renamed from: a */
    public final void mo27818a(utr utr, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        sdo.m34959a(utr);
        sdo.m34959a(changesAvailableOptions);
        sdo.m34959a(set);
        if (this.f48482c.mo27805a(new upq(utr, j, changesAvailableOptions, set))) {
            mo27827b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uqm.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      uqm.a(java.lang.String, boolean):void
      uqm.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo27819a(utr utr, Query query, String str, ubi ubi, Set set, boolean z) {
        uqm uqm = new uqm(utr, query, str, ubi, set, this.f48486g);
        try {
            uqm.mo27878a(true, z);
            if (this.f48481b.mo27805a(uqm)) {
                mo27827b();
            }
        } catch (RemoteException e) {
            f48480a.mo25376c("Unable to raise a query callback. The callback is not added.");
        }
    }

    /* renamed from: a */
    public final boolean mo27821a(DriveId driveId) {
        return !this.f48482c.mo27806b() || this.f48483d.f48442a.containsKey(driveId);
    }
}
