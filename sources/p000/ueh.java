package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFileRange;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import com.google.android.gms.drive.internal.OnStartStreamSession;
import com.google.android.gms.drive.internal.StreamContentsRequest;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ueh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ueh extends ucm {

    /* renamed from: g */
    public static final sbw f47344g = new sbw("StreamContentsOperation", "");

    /* renamed from: h */
    public final ubq f47345h;

    /* renamed from: i */
    public final StreamContentsRequest f47346i;

    /* renamed from: j */
    public volatile uga f47347j;

    /* renamed from: k */
    public volatile long f47348k = -1;

    /* renamed from: l */
    public volatile boolean f47349l = false;

    /* renamed from: o */
    private final ufx f47350o = new ueg(this);

    /* renamed from: p */
    private final AtomicBoolean f47351p = new AtomicBoolean(false);

    /* renamed from: q */
    private final veg f47352q;

    public ueh(ubk ubk, ubq ubq, StreamContentsRequest streamContentsRequest, veg veg, uto uto) {
        super("StreamContentsOperation", ubk, uto);
        this.f47345h = ubq;
        this.f47346i = streamContentsRequest;
        this.f47352q = veg;
    }

    /* renamed from: k */
    private final synchronized void m38226k() {
        DriveId driveId;
        if (!this.f47351p.getAndSet(true)) {
            StreamContentsRequest streamContentsRequest = this.f47346i;
            if (streamContentsRequest != null) {
                driveId = streamContentsRequest.f30922a;
            } else {
                driveId = null;
            }
            if (driveId != null) {
                this.f47237a.mo27085a(this.f47239c, driveId);
            }
        }
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27255b(Status status) {
        vcv g = this.f47239c.mo28306g();
        g.mo28257b(status.f30115i);
        if (this.f47237a.f47160u) {
            try {
                if (!this.f47349l) {
                    this.f47238b.mo27107a(status);
                } else {
                    this.f47238b.mo27976a(new OnDownloadProgressResponse(0, -1, 2, OnDownloadProgressResponse.f30875a));
                }
            } catch (RemoteException e) {
                g.mo28256b();
            }
        }
        g.mo28254a();
        vcy vcy = this.f47239c;
        vcy.mo28307h();
        vcy.mo28274a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo27236d() {
        String str = this.f47241e.f47395b;
        if (this.f47237a.mo27099g() || ((String) twy.f46819aC.mo58455c()).contains(str)) {
            aaal.m21020a(this.f47346i, "Invalid stream contents request: no request");
            aaal.m21020a(this.f47346i.f30922a, "Invalid stream contents request: no id");
            m38226k();
            this.f47347j = this.f47237a.mo27077a(this.f47346i.f30922a, this.f47350o);
            return;
        }
        throw new aaaj(10, "App is not whitelisted to make this request.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo27240h() {
        m38226k();
        mo27249a(4);
        if (this.f47347j != null) {
            this.f47347j.mo27305a();
        }
        mo27255b(Status.f30111e);
    }

    /* renamed from: a */
    public final void mo27249a(int i) {
        Long l;
        if (this.f47348k >= 0) {
            l = Long.valueOf(this.f47348k);
        } else {
            l = null;
        }
        this.f47239c.mo28278a(2, i, l, this.f47352q.mo28344b());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sce, android.os.IBinder], assign insn: 0x0012: IGET  (r2v1 ? I:sce) = (r3v0 'this' ueh A[THIS]) uco.f sce */
    /* renamed from: a */
    public final synchronized void mo27253a(ParcelFileDescriptor parcelFileDescriptor, String str) {
        aaal.m21021a(!this.f47349l, "A session is already in progress");
        if (this.f47237a.f47160u) {
            ? r2 = this.f47247f;
            r2.asBinder();
            try {
                this.f47238b.mo27980a(new OnStartStreamSession(parcelFileDescriptor, r2, str));
                this.f47349l = true;
            } catch (RemoteException e) {
                f47344g.mo25373b("StreamContentsOperation", "Failed to start a session", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo27254a(int i, long j, long j2) {
        if (!this.f47237a.f47160u) {
            return false;
        }
        try {
            this.f47238b.mo27976a(new OnDownloadProgressResponse(j, j2, i, Collections.singletonList(new DriveFileRange(0, j))));
            return true;
        } catch (RemoteException e) {
            f47344g.mo25373b("StreamContentsOperation", "Failed to call download progress listener", e);
            return false;
        }
    }
}
