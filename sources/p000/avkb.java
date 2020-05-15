package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avkb extends dcj implements avkd {
    public avkb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.ISystemUpdateApiService");
    }

    /* renamed from: a */
    public final SystemUpdateStatus mo51315a() {
        Parcel a = mo8526a(4, mo8529bj());
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) dcl.m8163a(a, SystemUpdateStatus.CREATOR);
        a.recycle();
        return systemUpdateStatus;
    }

    /* renamed from: b */
    public final void mo51321b(avkj avkj) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avkj);
        mo8528b(3, bj);
    }

    /* renamed from: c */
    public final void mo51324c() {
        mo8528b(7, mo8529bj());
    }

    /* renamed from: d */
    public final void mo51325d() {
        mo8528b(9, mo8529bj());
    }

    /* renamed from: e */
    public final void mo51326e() {
        mo8528b(11, mo8529bj());
    }

    /* renamed from: f */
    public final void mo51327f() {
        throw null;
    }

    /* renamed from: g */
    public final boolean mo51328g() {
        Parcel a = mo8526a(14, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final long mo51329h() {
        Parcel a = mo8526a(16, mo8529bj());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    /* renamed from: a */
    public final void mo51316a(avkj avkj) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avkj);
        mo8528b(2, bj);
    }

    /* renamed from: b */
    public final void mo51322b(DownloadOptions downloadOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, downloadOptions);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo51317a(ActivityStatus activityStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, activityStatus);
        mo8528b(10, bj);
    }

    /* renamed from: b */
    public final void mo51323b(InstallationOptions installationOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, installationOptions);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo51318a(DownloadOptions downloadOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, downloadOptions);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo51319a(InstallationOptions installationOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, installationOptions);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo51320a(rnt rnt, ConfigUpdateOptions configUpdateOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, configUpdateOptions);
        mo8528b(15, bj);
    }
}
