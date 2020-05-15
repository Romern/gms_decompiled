package p000;

import com.google.android.gms.drive.DriveId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: uow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uow {

    /* renamed from: a */
    public final ConcurrentMap f48442a = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27797a() {
        this.f48442a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27800b(DriveId driveId, uqi uqi) {
        sdo.m34959a(driveId);
        uoy uoy = (uoy) this.f48442a.get(driveId);
        if (uoy != null && uoy.mo27807b(uqi)) {
            synchronized (uoy.f48444a) {
                if (uoy.mo27806b()) {
                    this.f48442a.remove(driveId);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27798a(DriveId driveId, uox uox) {
        uoy uoy = (uoy) this.f48442a.get(driveId);
        if (uoy != null && uoy.mo27804a(uox)) {
            synchronized (uoy.f48444a) {
                if (uoy.mo27806b()) {
                    this.f48442a.remove(driveId);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo27801b() {
        return this.f48442a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo27799a(DriveId driveId, uqi uqi) {
        uoy uoy;
        sdo.m34959a(driveId);
        synchronized (this.f48442a) {
            uoy = (uoy) this.f48442a.get(driveId);
            if (uoy == null) {
                uoy = new uoy();
                this.f48442a.put(driveId, uoy);
            }
        }
        return uoy.mo27805a(uqi);
    }
}
