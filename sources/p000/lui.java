package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.android.gms.backup.transport.stats.BackupStatsChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lui extends dck implements luj {

    /* renamed from: a */
    final /* synthetic */ BackupStatsChimeraService f32998a;

    public lui() {
        super("com.google.android.gms.backup.IBackupStatsService");
    }

    /* renamed from: a */
    public final void mo19607a() {
        ndq.m25978a(this.f32998a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lui(BackupStatsChimeraService backupStatsChimeraService) {
        super("com.google.android.gms.backup.IBackupStatsService");
        this.f32998a = backupStatsChimeraService;
    }

    /* renamed from: a */
    public final void mo19608a(ApplicationBackupStats applicationBackupStats) {
        if (applicationBackupStats != null) {
            ndq.m25979a(this.f32998a, applicationBackupStats);
        }
    }

    /* renamed from: a */
    public final void mo19609a(String str, long j) {
        if (str == null) {
            BackupStatsChimeraService.f29251a.mo25409a("Called on null package.", new Object[0]);
        } else {
            ndq.m25980a(this.f32998a, str, j);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ApplicationBackupStats[] applicationBackupStatsArr;
        ApplicationBackupStats[] applicationBackupStatsArr2;
        ApplicationBackupStats[] applicationBackupStatsArr3;
        Account account;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        boolean z = false;
        switch (i) {
            case 1:
                BackupStatsRequestConfig backupStatsRequestConfig = (BackupStatsRequestConfig) dcl.m8163a(parcel3, BackupStatsRequestConfig.CREATOR);
                String[] createStringArray = parcel.createStringArray();
                BackupStatsChimeraService backupStatsChimeraService = this.f32998a;
                lvn lvn = BackupStatsChimeraService.f29251a;
                if (backupStatsChimeraService.mo17288a(backupStatsRequestConfig)) {
                    int i2 = Build.VERSION.SDK_INT;
                    int length = createStringArray.length;
                    if (length == 0) {
                        BackupStatsChimeraService.f29251a.mo25414c("Request getBackupDataStats for 0 packages", new Object[0]);
                        applicationBackupStatsArr = new ApplicationBackupStats[0];
                    } else {
                        BackupStatsChimeraService backupStatsChimeraService2 = this.f32998a;
                        HashMap a = bnmt.m109795a(2);
                        int i3 = 0;
                        while (i3 < length) {
                            String str = createStringArray[i3];
                            Long valueOf = Long.valueOf(new lvp(backupStatsChimeraService2).mo19639a(str));
                            bxvd bxvd = (bxvd) a.get(valueOf);
                            if (bxvd == null) {
                                bxvd da = ltc.f32888e.mo74144da();
                                boolean z2 = backupStatsRequestConfig.f28988a;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = z;
                                }
                                ltc ltc = (ltc) da.f164949b;
                                ltc.f32890a |= 1;
                                ltc.f32892c = z2;
                                da.mo74048e(str);
                                a.put(valueOf, da);
                            } else {
                                bxvd.mo74048e(str);
                            }
                            i3++;
                            z = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : a.entrySet()) {
                            long longValue = ((Long) entry.getKey()).longValue();
                            bxvd bxvd2 = (bxvd) entry.getValue();
                            bxvd da2 = lth.f32914q.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            lth lth = (lth) da2.f164949b;
                            lth.f32916a |= 1;
                            lth.f32917b = longValue;
                            ltc ltc2 = (ltc) bxvd2.mo74062i();
                            ltc2.getClass();
                            lth.f32929n = ltc2;
                            lth.f32916a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            if (cckq.m130234b()) {
                                long a2 = spn.m35843a(backupStatsChimeraService2);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                lth lth2 = (lth) da2.f164949b;
                                lth2.f32916a |= 2;
                                lth2.f32918c = a2;
                            }
                            arrayList.add(da2);
                        }
                        if (arrayList.size() > 2) {
                            BackupStatsChimeraService.f29251a.mo25416d("Request backup stats for more than 2 tokens.", new Object[0]);
                            applicationBackupStatsArr = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList(length);
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                bxvd bxvd3 = (bxvd) arrayList.get(i4);
                                try {
                                    String a3 = may.m24782a(this.f32998a, "android");
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    lth lth3 = (lth) bxvd3.f164949b;
                                    lth lth4 = lth.f32914q;
                                    a3.getClass();
                                    lth3.f32916a |= 16;
                                    lth3.f32920e = a3;
                                    try {
                                        arrayList2.addAll(this.f32998a.mo17287a(bxvd3));
                                        i4++;
                                    } catch (mbc e) {
                                        BackupStatsChimeraService.f29251a.mo25417e("auth exception when on getting backup stats", e, new Object[0]);
                                        applicationBackupStatsArr = null;
                                    } catch (mbn e2) {
                                        BackupStatsChimeraService.f29251a.mo25418e("Transfer exception during getBackupDataStats()", new Object[0]);
                                        applicationBackupStatsArr = null;
                                    }
                                } catch (mbh e3) {
                                    BackupStatsChimeraService.f29251a.mo25416d("There is no backup account.", new Object[0]);
                                    applicationBackupStatsArr = null;
                                } catch (mbb e4) {
                                    BackupStatsChimeraService.f29251a.mo25418e("Failed to get auth token for backup account.", new Object[0]);
                                    applicationBackupStatsArr = null;
                                }
                            }
                            applicationBackupStatsArr = (ApplicationBackupStats[]) arrayList2.toArray(new ApplicationBackupStats[0]);
                        }
                    }
                } else {
                    applicationBackupStatsArr = null;
                }
                parcel2.writeNoException();
                parcel4.writeTypedArray(applicationBackupStatsArr, 1);
                break;
            case 2:
                ApplicationBackupStats[] a4 = mo19610a((BackupStatsRequestConfig) dcl.m8163a(parcel3, BackupStatsRequestConfig.CREATOR));
                parcel2.writeNoException();
                parcel4.writeTypedArray(a4, 1);
                break;
            case 3:
                mo19608a((ApplicationBackupStats) dcl.m8163a(parcel3, ApplicationBackupStats.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                long readLong = parcel.readLong();
                BackupStatsRequestConfig backupStatsRequestConfig2 = (BackupStatsRequestConfig) dcl.m8163a(parcel3, BackupStatsRequestConfig.CREATOR);
                BackupStatsChimeraService backupStatsChimeraService3 = this.f32998a;
                lvn lvn2 = BackupStatsChimeraService.f29251a;
                if (backupStatsChimeraService3.mo17288a(backupStatsRequestConfig2)) {
                    int i5 = Build.VERSION.SDK_INT;
                    applicationBackupStatsArr2 = this.f32998a.mo17289a(readLong, backupStatsRequestConfig2);
                } else {
                    applicationBackupStatsArr2 = null;
                }
                parcel2.writeNoException();
                parcel4.writeTypedArray(applicationBackupStatsArr2, 1);
                break;
            case 5:
                long readLong2 = parcel.readLong();
                String readString = parcel.readString();
                BackupStatsRequestConfig backupStatsRequestConfig3 = (BackupStatsRequestConfig) dcl.m8163a(parcel3, BackupStatsRequestConfig.CREATOR);
                BackupStatsChimeraService backupStatsChimeraService4 = this.f32998a;
                lvn lvn3 = BackupStatsChimeraService.f29251a;
                if (backupStatsChimeraService4.mo17288a(backupStatsRequestConfig3)) {
                    int i6 = Build.VERSION.SDK_INT;
                    BackupStatsChimeraService backupStatsChimeraService5 = this.f32998a;
                    try {
                        Account[] d = gie.m13199d(backupStatsChimeraService5, "com.google");
                        int length2 = d.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length2) {
                                account = d[i7];
                                if (!readString.equals(account.name)) {
                                    i7++;
                                }
                            } else {
                                account = null;
                            }
                        }
                    } catch (RemoteException | rfv | rfw e5) {
                        BackupStatsChimeraService.f29251a.mo25416d("Unable to get the accounts on the device.", new Object[0]);
                        account = null;
                    }
                    if (account == null) {
                        BackupStatsChimeraService.f29251a.mo25418e("Failed to find the account on the device.", new Object[0]);
                        applicationBackupStatsArr3 = null;
                    } else {
                        try {
                            applicationBackupStatsArr3 = backupStatsChimeraService5.mo17290a(readLong2, may.m24780a(backupStatsChimeraService5, account, "android"), backupStatsRequestConfig3);
                        } catch (mbb e6) {
                            BackupStatsChimeraService.f29251a.mo25418e("Failed to get auth token for account.", new Object[0]);
                            applicationBackupStatsArr3 = null;
                        }
                    }
                } else {
                    applicationBackupStatsArr3 = null;
                }
                parcel2.writeNoException();
                parcel4.writeTypedArray(applicationBackupStatsArr3, 1);
                break;
            case 6:
                mo19609a(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 7:
                mo19607a();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo19610a(BackupStatsRequestConfig backupStatsRequestConfig) {
        BackupStatsChimeraService backupStatsChimeraService = this.f32998a;
        lvn lvn = BackupStatsChimeraService.f29251a;
        if (!backupStatsChimeraService.mo17288a(backupStatsRequestConfig)) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (!ndq.m25983b(this.f32998a)) {
            BackupStatsChimeraService backupStatsChimeraService2 = this.f32998a;
            ApplicationBackupStats[] a = backupStatsChimeraService2.mo17289a(spn.m35843a(backupStatsChimeraService2), new BackupStatsRequestConfig(true, true));
            if (a == null) {
                return null;
            }
            ndq.m25981a(this.f32998a, a);
        }
        return ndq.m25982a(this.f32998a, backupStatsRequestConfig);
    }
}
