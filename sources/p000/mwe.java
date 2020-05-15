package p000;

import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.settings.p033ui.DeviceBackupDetailFragment;
import java.util.Date;

/* renamed from: mwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwe implements mvt {

    /* renamed from: a */
    final /* synthetic */ DeviceBackupDetailFragment f34836a;

    /* renamed from: b */
    private mvp f34837b = mvp.f34818e;

    /* renamed from: c */
    private mvp f34838c = mvp.f34818e;

    /* renamed from: d */
    private mvp f34839d = mvp.f34818e;

    /* renamed from: e */
    private mvp f34840e = mvp.f34818e;

    /* renamed from: f */
    private mvp f34841f = mvp.f34818e;

    public mwe(DeviceBackupDetailFragment deviceBackupDetailFragment) {
        this.f34836a = deviceBackupDetailFragment;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        char c;
        ApplicationBackupStats[] a = new mty(this.f34836a.getActivity()).mo20242a();
        if (a != null) {
            mvp mvp = mvp.f34814a;
            this.f34841f = mvp;
            this.f34840e = mvp;
            this.f34839d = mvp;
            this.f34838c = mvp;
            this.f34837b = mvp;
            if (!this.f34836a.f29121d || !cclp.m130478h()) {
                Long l = null;
                Long l2 = null;
                for (ApplicationBackupStats applicationBackupStats : a) {
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
                        this.f34837b = a2;
                    } else if (c == 1) {
                        this.f34839d = a2;
                    } else if (c == 2) {
                        this.f34841f = a2;
                    } else if (c == 3 || c == 4) {
                        if (l == null || l.longValue() < applicationBackupStats.f28977d) {
                            l = Long.valueOf(applicationBackupStats.f28977d);
                            this.f34838c = a2;
                        }
                    } else if (l2 == null || l2.longValue() < applicationBackupStats.f28977d) {
                        l2 = Long.valueOf(applicationBackupStats.f28977d);
                        this.f34840e = a2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Void voidR = (Void) obj;
        this.f34836a.f29122e.mo17255a(this.f34837b);
        this.f34836a.f29123f.mo17255a(this.f34838c);
        this.f34836a.f29124g.mo17255a(this.f34839d);
        this.f34836a.f29126k.mo17255a(this.f34840e);
        this.f34836a.f29125j.mo17255a(this.f34841f);
    }
}
