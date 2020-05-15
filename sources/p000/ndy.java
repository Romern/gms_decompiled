package p000;

import android.content.Context;

/* renamed from: ndy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndy {

    /* renamed from: a */
    public static final lvn f35373a = new lvn("DeviceStateSnapshotLogger");

    /* renamed from: b */
    public final Context f35374b;

    /* renamed from: c */
    public final lvp f35375c;

    /* renamed from: d */
    public final qws f35376d;

    /* renamed from: e */
    public final rtj f35377e;

    /* renamed from: f */
    public final neb f35378f;

    /* renamed from: g */
    public final lvr f35379g = lvr.f33060a;

    public ndy(Context context) {
        neb neb;
        this.f35376d = new qws(context, "ANDROID_BACKUP", null);
        this.f35374b = context;
        this.f35375c = new lvp(context);
        this.f35377e = new rtj(context, "BackupDeviceState", true);
        lwc a = lwc.m24524a(context);
        if (lwb.m24519c()) {
            neb = new ndz(context, a);
        } else {
            neb = new nea();
        }
        this.f35378f = neb;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static mrf m25998a(String str) {
        char c;
        if (str == null) {
            return mrf.BACKUP_TRANSPORT_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1879725970:
                if (str.equals("com.android.localtransport/.LocalTransportService")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1249308490:
                if (str.equals("com.google.android.backup/.BackupTransportService")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -748111472:
                if (str.equals("android/com.android.internal.backup.LocalTransportService")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -269993627:
                if (str.equals("android/com.android.internal.backup.LocalTransport")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -178444217:
                if (str.equals("com.android.localtransport/.LocalTransport")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1204141506:
                if (str.equals("com.google.android.backuptransport/com.google.android.backup.BackupTransportService")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1320513942:
                if (str.equals("com.google.android.gms/.backup.migrate.service.D2dTransport")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1503304469:
                if (str.equals("com.google.android.gms/.backup.BackupTransportService")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return mrf.GMS_BACKUP_TRANSPORT_SERVICE;
            case 1:
                return mrf.D2D_TRANSPORT_SERVICE;
            case 2:
            case 3:
                return mrf.LEGACY_BACKUP_TRANSPORT_SERVICE;
            case 4:
            case 5:
                return mrf.LOCAL_TRANSPORT;
            case 6:
            case 7:
                if (ccop.f179637a.mo6606a().mo76546d()) {
                    return mrf.LOCAL_TRANSPORT;
                }
                break;
        }
        return mrf.UNKNOWN_TRANSPORT_SERVICE;
    }
}
