package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.TrafficStats;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.transport.component.GmsBackupSchedulerChimeraService;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: mzl */
final /* synthetic */ class mzl implements Callable {

    /* renamed from: a */
    private final nab f35045a;

    /* renamed from: b */
    private final PackageInfo f35046b;

    /* renamed from: c */
    private final ParcelFileDescriptor f35047c;

    /* renamed from: d */
    private final int f35048d;

    public mzl(nab nab, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.f35045a = nab;
        this.f35046b = packageInfo;
        this.f35047c = parcelFileDescriptor;
        this.f35048d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0227  */
    public final Object call() {
        myt myt;
        int i;
        int i2;
        mcf mcf;
        nab nab = this.f35045a;
        PackageInfo packageInfo = this.f35046b;
        ParcelFileDescriptor parcelFileDescriptor = this.f35047c;
        int i3 = this.f35048d;
        String str = packageInfo.packageName;
        int i4 = i3 & 1;
        boolean a = nab.mo20369a();
        Logger Logger = nab.f35075a;
        String valueOf = String.valueOf(str);
        Logger.mo25414c(valueOf.length() == 0 ? new String("Attempt to do full backup on ") : "Attempt to do full backup on ".concat(valueOf), new Object[0]);
        nab.f35117x.mo19828a(5, str, i4 != 0, a);
        nab.f35110q.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP").setPackage("com.google.android.gms"));
        int i5 = -1002;
        if (nab.f35111r.mo17284d()) {
            nab.f35075a.mo25416d("Not performing full backup - GmsBackupTransport is explicitly disabled", new Object[0]);
            nab.f35117x.mo19822a(12, 4);
            i5 = -1000;
        } else {
            nab.f35097d = str;
            if (nab.f35103j != null) {
                nab.f35075a.mo25418e("Attempt to initiate full backup while one is in progress", new Object[0]);
                nab.f35117x.mo19822a(11, 4);
                i5 = -1000;
            } else if (!ccmk.f179455a.mo6606a().mo76383d()) {
                nab.f35075a.mo25414c("Full backup feature is disabled by gservice.", new Object[0]);
                nab.f35117x.mo19822a(2, 4);
                i5 = -1000;
            } else if (a && nab.mo20386g()) {
                nab.f35075a.mo25416d("Not performing full backup - Encryption key has not synced", new Object[0]);
            } else {
                nab.f35075a.logVerbose("Rescheduling gms backup task", new Object[0]);
                GmsBackupSchedulerChimeraService.m22012a(nab.f35110q);
                nds nds = new nds(nab.f35110q, packageInfo.packageName, nab.f35117x.f33381a);
                try {
                    myt = mzb.m25803a(nab.f35110q, nab.f35078C, nab.f35109p, packageInfo.packageName, nab.f35086K, nds, nab.f35088M, nab.f35117x);
                } catch (lwh e) {
                    nab.f35075a.mo25417e("Secondary key init error", e, new Object[0]);
                    nab.f35117x.mo19822a(17, 4);
                    mab.m24748a(nab.f35110q, e, cclp.m130474d());
                    myt = null;
                } catch (lwt | lxc e2) {
                    nab.f35075a.mo25418e("Secondary key init error", new Object[0]);
                    i5 = -1000;
                }
                Context context = nab.f35110q;
                nab.f35103j = new mzb(context, nab.f35117x, nds, nab.f35115v, nab.f35113t, nab.f35116w, nab.f35118y, new myx(context), new nad(context), parcelFileDescriptor, packageInfo, myt);
                PackageInfo packageInfo2 = packageInfo;
                nab.f35095b = packageInfo2.applicationInfo != null ? packageInfo2.applicationInfo.uid : 1000;
                TrafficStats.setThreadStatsTagBackup();
                TrafficStats.setThreadStatsUid(nab.f35095b);
                nab.f35102i = true;
                mzb mzb = nab.f35103j;
                if (!mzb.f35004e.mo19625b()) {
                    mzb.f35000a.mo25414c("Try to backup for an uninitialized backup account.", new Object[0]);
                    mzb.f35002c.mo19822a(3, 4);
                    i = -1001;
                } else if (!ccnf.m130736e() || mzb.f35004e.mo19624a() != null) {
                    Context context2 = mzb.f35001b;
                    PackageInfo packageInfo3 = mzb.f35012m;
                    lvn lvn = mcg.f33412a;
                    lvr lvr = lvr.f33060a;
                    if (!ccmk.f179455a.mo6606a().mo76386g()) {
                        i2 = 1;
                    } else if (lvr.mo19660e(context2)) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                        mcg.f33412a.mo25416d("Rejecting backup of %s. Full data backup does not have consent", packageInfo3.packageName);
                        mcf = mcf.INELIGIBLE_DOLLY_CONSENT;
                        int i6 = 7;
                        if (mcf == mcf.ELIGIBLE) {
                            lvn lvn2 = mzb.f35000a;
                            Object[] objArr = new Object[2];
                            objArr[0] = mzb.f35013n;
                            objArr[i2] = mcf;
                            lvn2.mo25416d("Rejecting package %s for full backup because ineligible (%s).", objArr);
                            nds nds2 = mzb.f35003d;
                            bzsr bzsr = bzsr.BAD_URL;
                            int ordinal = mcf.ordinal();
                            if (ordinal != 6) {
                                if (ordinal != 7) {
                                    i6 = 9;
                                } else {
                                    i6 = 8;
                                }
                            }
                            nds2.mo20497a(i6);
                            mzb.f35002c.mo19834a(mcf);
                            i = -1002;
                        } else {
                            if (i4 == 0) {
                                myz myz = mzb.f35007h;
                                String str2 = mzb.f35013n;
                                long currentTimeMillis = System.currentTimeMillis();
                                SharedPreferences sharedPreferences = myz.f34998c;
                                String valueOf2 = String.valueOf(str2);
                                long j = sharedPreferences.getLong(valueOf2.length() == 0 ? new String("Tracker_") : "Tracker_".concat(valueOf2), 0);
                                if (currentTimeMillis < j) {
                                    long b = currentTimeMillis + (ccnf.m130733b() * 1000);
                                    if (b < j) {
                                        myz.mo20343a(str2, b);
                                    }
                                    lvn lvn3 = mzb.f35000a;
                                    Object[] objArr2 = new Object[i2];
                                    objArr2[0] = mzb.f35013n;
                                    lvn3.mo25416d("Package rejected because it is in backoff: %s", objArr2);
                                    mzb.f35003d.mo20497a(10);
                                    mzb.f35002c.mo19822a(7, 4);
                                    i = -1002;
                                } else if (j > 0) {
                                    myz.mo20342a(str2);
                                }
                            }
                            myx myx = mzb.f35008i;
                            String str3 = mzb.f35013n;
                            long j2 = myx.f34994d.getLong(str3, 0);
                            sqv sqv = myx.f34992b;
                            if (System.currentTimeMillis() < j2 - myx.f34993c) {
                                lvn lvn4 = myx.f34991a;
                                Object[] objArr3 = new Object[3];
                                sqv sqv2 = myx.f34992b;
                                objArr3[0] = Long.valueOf(System.currentTimeMillis());
                                objArr3[i2] = Long.valueOf(j2);
                                objArr3[2] = str3;
                                lvn4.mo25412b("Clock has rolled backwards. current=%d, next allowed=%d. Allowing app to back up: %s", objArr3);
                                myx.f34994d.edit().remove(str3).apply();
                            } else {
                                sqv sqv3 = myx.f34992b;
                                if (System.currentTimeMillis() < j2) {
                                    lvn lvn5 = mzb.f35000a;
                                    Object[] objArr4 = new Object[i2];
                                    objArr4[0] = mzb.f35013n;
                                    lvn5.mo25412b("Package is on quota black list, rejecting it: %s", objArr4);
                                    mzb.f35003d.mo20497a(12);
                                    i = -1002;
                                }
                            }
                            try {
                                try {
                                    if (mzb.f35010k.mo20335a(new FileInputStream(mzb.f35011l.getFileDescriptor()), mzb.f35005f.mo17278a(mzb.f35013n, mzb.f35006g))) {
                                        mzb.f35010k.mo20333a();
                                        i = 0;
                                    } else {
                                        i = -1002;
                                    }
                                } catch (IOException e3) {
                                    mzb.f35000a.mo25417e("Exception initiating backup data processor", e3, new Object[0]);
                                    mzb.f35002c.mo19822a(14, 4);
                                    i = -1000;
                                }
                            } catch (mbb | mbh e4) {
                                lvn lvn6 = mzb.f35000a;
                                String valueOf3 = String.valueOf(e4);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                                sb.append("Exception when generating full backup request : ");
                                sb.append(valueOf3);
                                lvn6.mo25418e(sb.toString(), new Object[0]);
                                i = -1000;
                            }
                        }
                    }
                    if (!mcg.m24866a(context2, packageInfo3.packageName)) {
                        lvn lvn7 = mcg.f33412a;
                        Object[] objArr5 = new Object[i2];
                        objArr5[0] = packageInfo3.packageName;
                        lvn7.mo25416d("Rejecting backup of %s. Package does not have consent.", objArr5);
                        mcf = mcf.INELIGIBLE_PACKAGE_CONSENT;
                    } else {
                        mcf = mcg.m24870c(context2, packageInfo3);
                        if (mcf == mcf.ELIGIBLE) {
                            mcf = mcf.ELIGIBLE;
                        }
                    }
                    int i62 = 7;
                    if (mcf == mcf.ELIGIBLE) {
                    }
                } else {
                    mzb.f35002c.mo19822a(4, 4);
                    i = -1000;
                }
                if (i != 0) {
                    nab.f35103j = null;
                    TrafficStats.clearThreadStatsTag();
                    TrafficStats.clearThreadStatsUid();
                }
                i5 = i;
            }
        }
        return Integer.valueOf(i5);
    }
}
