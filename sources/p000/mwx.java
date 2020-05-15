package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;
import java.util.Date;

/* renamed from: mwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwx implements mvt {

    /* renamed from: a */
    final /* synthetic */ Activity f34865a;

    /* renamed from: b */
    final /* synthetic */ DriveBackupSettingsFragment f34866b;

    /* renamed from: c */
    private mvp f34867c = mvp.f34818e;

    /* renamed from: d */
    private mvp f34868d = mvp.f34818e;

    /* renamed from: e */
    private mvp f34869e = mvp.f34818e;

    /* renamed from: f */
    private mvp f34870f = mvp.f34818e;

    /* renamed from: g */
    private mvp f34871g = mvp.f34814a;

    /* renamed from: h */
    private mvp f34872h = mvp.f34818e;

    public mwx(DriveBackupSettingsFragment driveBackupSettingsFragment, Activity activity) {
        this.f34866b = driveBackupSettingsFragment;
        this.f34865a = activity;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        char c;
        ApplicationBackupStats[] a = new mty(this.f34865a).mo20242a();
        if (a == null) {
            return null;
        }
        mvp mvp = mvp.f34814a;
        this.f34872h = mvp;
        this.f34870f = mvp;
        this.f34869e = mvp;
        this.f34868d = mvp;
        this.f34867c = mvp;
        if (this.f34866b.f29165e && cclp.m130478h()) {
            return null;
        }
        long j = 0;
        Long l = null;
        Long l2 = null;
        for (ApplicationBackupStats applicationBackupStats : a) {
            if (this.f34866b.f29163c) {
                long j2 = applicationBackupStats.f28977d;
                if (j2 > j) {
                    j = j2;
                }
            } else {
                mvp a2 = mvp.m25668a(new Date(applicationBackupStats.f28977d));
                String str = applicationBackupStats.f28974a;
                switch (str.hashCode()) {
                    case -2000648992:
                        if (str.equals("com.android.providers.telephony")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -861391249:
                        if (str.equals("android")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -317738405:
                        if (str.equals("com.android.providers.settings")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 325967270:
                        if (str.equals("com.google.android.gms")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 350579580:
                        if (str.equals("com.android.calllogbackup")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.f34867c = a2;
                } else if (c == 1) {
                    this.f34869e = a2;
                } else if (c == 2) {
                    this.f34872h = a2;
                } else if (c == 3 || c == 4) {
                    if (l2 == null || l2.longValue() < applicationBackupStats.f28977d) {
                        l2 = Long.valueOf(applicationBackupStats.f28977d);
                        this.f34868d = a2;
                    }
                } else if (l == null || l.longValue() < applicationBackupStats.f28977d) {
                    l = Long.valueOf(applicationBackupStats.f28977d);
                    this.f34870f = a2;
                }
            }
        }
        if (!this.f34866b.f29163c || j <= 0) {
            return null;
        }
        this.f34871g = mvp.m25668a(new Date(j));
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Void voidR = (Void) obj;
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34866b;
        if (driveBackupSettingsFragment.f29163c) {
            driveBackupSettingsFragment.f29172o.mo17255a(this.f34871g);
            return;
        }
        driveBackupSettingsFragment.f29175r.mo17255a(this.f34867c);
        this.f34866b.f29176s.mo17255a(this.f34868d);
        this.f34866b.f29177t.mo17255a(this.f34869e);
        this.f34866b.f29178u.mo17255a(this.f34870f);
        this.f34866b.f29174q.mo17255a(this.f34872h);
    }
}
