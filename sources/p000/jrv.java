package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;

/* renamed from: jrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jrv extends dcj implements jrx {
    public jrv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
    }

    /* renamed from: a */
    public final void mo13949a(jsa jsa, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jsa);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo13950a(jsd jsd) {
        throw null;
    }

    /* renamed from: a */
    public final void mo13953a(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter) {
        throw null;
    }

    /* renamed from: a */
    public final void mo13954a(rnt rnt, PendingIntent pendingIntent, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo13957b(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo13958b(rnt rnt, PendingIntent pendingIntent, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo13959b(rnt rnt, String str, boolean z, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo13951a(jsg jsg, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jsg);
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo13952a(jsj jsj) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jsj);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo13955a(rnt rnt, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo13956a(rnt rnt, String str, boolean z, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        bj.writeString(str2);
        mo8528b(6, bj);
    }
}
