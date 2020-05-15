package com.google.android.gms.backup.transport.component;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceStateSnapshotIntentOperation extends lvz {

    /* renamed from: a */
    private static final lvn f29221a = new lvn("DeviceStateSnapshotIntentOperation");

    /* renamed from: b */
    private rtj f29222b;

    /* renamed from: c */
    private long f29223c;

    /* renamed from: d */
    private nah f29224d;

    /* renamed from: a */
    public final void mo17242a(Intent intent) {
        mrf[] mrfArr;
        int i;
        mqp mqp;
        long j;
        long j2;
        int i2;
        Boolean b;
        Account[] accountArr;
        int i3 = Build.VERSION.SDK_INT;
        this.f29222b = new rtj(this, "BackupDeviceState", true);
        nah nah = this.f29224d;
        if (nah == null) {
            nah = new nah();
        }
        this.f29224d = nah;
        this.f29223c = System.currentTimeMillis();
        if (ccnf.f179489a.mo6606a().mo76448t() && (ccoa.m130958d() || mcl.m24877a())) {
            if (this.f29223c - this.f29222b.getLong("lastSnapshotLogTimeMs", 0) > ccnf.f179489a.mo6606a().mo76442n()) {
                f29221a.mo25412b("Logging DeviceStateSnapshot.", new Object[0]);
                SharedPreferences.Editor edit = this.f29222b.edit();
                edit.putLong("lastSnapshotLogTimeMs", this.f29223c);
                edit.apply();
                ndy ndy = new ndy(this);
                bxvd a = lyu.m24685a();
                bxvd da = mrh.f34400x.mo74144da();
                mrf a2 = ndy.m25998a(ndy.f35375c.mo19645c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh = (mrh) da.f164949b;
                mrh.f34409h = a2.f34398g;
                mrh.f34402a |= 64;
                String[] d = ndy.f35375c.mo19646d();
                if (d != null) {
                    mrfArr = new mrf[d.length];
                    for (int i4 = 0; i4 < d.length; i4++) {
                        mrfArr[i4] = ndy.m25998a(d[i4]);
                    }
                } else {
                    mrfArr = new mrf[0];
                }
                List<mrf> asList = Arrays.asList(mrfArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh2 = (mrh) da.f164949b;
                if (!mrh2.f34410i.mo73666a()) {
                    mrh2.f34410i = GeneratedMessageLite.m124019a(mrh2.f34410i);
                }
                for (mrf mrf : asList) {
                    mrh2.f34410i.mo74153d(mrf.f34398g);
                }
                boolean b2 = ndy.f35375c.mo19644b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh3 = (mrh) da.f164949b;
                mrh3.f34402a |= 1;
                mrh3.f34403b = b2;
                int i5 = -2;
                try {
                    Account a3 = new lsp(ndy.f35374b).mo19591a();
                    if (a3 != null) {
                        try {
                            accountArr = gie.m13199d(ndy.f35374b, "com.google");
                        } catch (RemoteException | rfv | rfw e) {
                            ndy.f35373a.mo25416d("Unable to get accounts on device.", new Object[0]);
                            accountArr = new Account[0];
                        }
                        if (accountArr.length != 0) {
                            Arrays.sort(accountArr, ndx.f35372a);
                            int a4 = sqc.m35953a(accountArr, a3);
                            if (a4 != -1) {
                                i5 = a4;
                            }
                        }
                    } else {
                        i5 = -1;
                    }
                } catch (IllegalArgumentException e2) {
                    i5 = -3;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh4 = (mrh) da.f164949b;
                mrh4.f34402a |= 4;
                mrh4.f34405d = i5;
                int i6 = ndy.f35377e.getInt("backupService", -1);
                if (i6 != 0) {
                    i = i6 != 1 ? 1 : 2;
                } else {
                    i = 3;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh5 = (mrh) da.f164949b;
                mrh5.f34404c = i - 1;
                mrh5.f34402a |= 2;
                boolean c = ndy.f35379g.mo19657c(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh6 = (mrh) da.f164949b;
                mrh6.f34402a |= 16;
                mrh6.f34407f = c;
                boolean a5 = ndy.f35379g.mo19652a(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh7 = (mrh) da.f164949b;
                mrh7.f34402a |= 32;
                mrh7.f34408g = a5;
                boolean masterSyncAutomatically = ContentResolver.getMasterSyncAutomatically();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh8 = (mrh) da.f164949b;
                mrh8.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                mrh8.f34418q = masterSyncAutomatically;
                boolean b3 = ndy.f35379g.mo19655b(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh9 = (mrh) da.f164949b;
                mrh9.f34402a |= 2048;
                mrh9.f34415n = b3;
                boolean e3 = ndy.f35379g.mo19660e(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh10 = (mrh) da.f164949b;
                mrh10.f34402a |= 512;
                mrh10.f34413l = e3;
                boolean f = ndy.f35379g.mo19661f(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh11 = (mrh) da.f164949b;
                mrh11.f34402a |= 1024;
                mrh11.f34414m = f;
                boolean d2 = ndy.f35379g.mo19659d(ndy.f35374b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh12 = (mrh) da.f164949b;
                mrh12.f34402a |= 8192;
                mrh12.f34417p = d2;
                long j3 = ndy.f35377e.getLong("lastKvBackupPassTimeMs", 0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh13 = (mrh) da.f164949b;
                mrh13.f34402a |= 128;
                mrh13.f34411j = j3;
                long j4 = ndy.f35377e.getLong("lastFullBackupPassTimeMs", 0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh14 = (mrh) da.f164949b;
                mrh14.f34402a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                mrh14.f34412k = j4;
                boolean isPowerSaveMode = ((PowerManager) ndy.f35374b.getSystemService("power")).isPowerSaveMode();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh15 = (mrh) da.f164949b;
                mrh15.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                mrh15.f34419r = isPowerSaveMode;
                Boolean a6 = ndy.f35378f.mo20509a();
                if (a6 != null) {
                    boolean booleanValue = a6.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh16 = (mrh) da.f164949b;
                    mrh16.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    mrh16.f34420s = booleanValue;
                }
                int c2 = ndy.f35378f.mo20511c();
                if (c2 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh17 = (mrh) da.f164949b;
                    mrh17.f34421t = c2 - 1;
                    mrh17.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                }
                if (ccnr.f179566a.mo6606a().mo76482c() && (b = ndy.f35378f.mo20510b()) != null) {
                    boolean booleanValue2 = b.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh18 = (mrh) da.f164949b;
                    mrh18.f34402a |= 4096;
                    mrh18.f34416o = booleanValue2;
                }
                rtj rtj = new rtj(ndy.f35374b, "backup_settings", true);
                Integer num = null;
                Boolean valueOf = rtj.contains("use_mobile_data") ? Boolean.valueOf(rtj.getBoolean("use_mobile_data", false)) : null;
                if (valueOf != null) {
                    boolean booleanValue3 = valueOf.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh19 = (mrh) da.f164949b;
                    mrh19.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    mrh19.f34422u = booleanValue3;
                }
                SharedPreferences sharedPreferences = ndy.f35374b.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
                if (sharedPreferences.contains("times_shown")) {
                    num = Integer.valueOf(sharedPreferences.getInt("times_shown", 0));
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh20 = (mrh) da.f164949b;
                    mrh20.f34402a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    mrh20.f34423v = intValue;
                }
                boolean b4 = new lsp(ndy.f35374b).mo19593b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrh mrh21 = (mrh) da.f164949b;
                mrh21.f34402a |= 8;
                mrh21.f34406e = b4;
                if (ccno.f179554a.mo6606a().mo76474f()) {
                    bxvd da2 = mqp.f34333g.mo74144da();
                    ApplicationBackupStats[] a7 = new ltt(ndy.f35374b).mo19601a(new BackupStatsRequestConfig(true, true));
                    if (a7 != null) {
                        int length = a7.length;
                        if (length != 0) {
                            long j5 = 0;
                            long j6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < length) {
                                ApplicationBackupStats applicationBackupStats = a7[i8];
                                if (applicationBackupStats.f28975b != 0) {
                                    i2 = length;
                                    j5 += applicationBackupStats.f28977d;
                                    i9++;
                                } else {
                                    i2 = length;
                                    if (applicationBackupStats.f28976c != 0) {
                                        j6 += applicationBackupStats.f28977d;
                                        i7++;
                                    } else {
                                        ndy.f35373a.mo25409a("Package %s has 0 backup size.", applicationBackupStats.f28974a);
                                    }
                                }
                                i8++;
                                length = i2;
                            }
                            int length2 = a7.length;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            mqp mqp2 = (mqp) da2.f164949b;
                            int i10 = mqp2.f34335a | 16;
                            mqp2.f34335a = i10;
                            mqp2.f34340f = length2;
                            int i11 = i10 | 4;
                            mqp2.f34335a = i11;
                            mqp2.f34338d = i9;
                            int i12 = i11 | 8;
                            mqp2.f34335a = i12;
                            mqp2.f34339e = i7;
                            if (i9 != 0) {
                                j = j5 / ((long) i9);
                            } else {
                                j = 0;
                            }
                            int i13 = 1 | i12;
                            mqp2.f34335a = i13;
                            mqp2.f34336b = j;
                            if (i7 != 0) {
                                j2 = j6 / ((long) i7);
                            } else {
                                j2 = 0;
                            }
                            mqp2.f34335a = i13 | 2;
                            mqp2.f34337c = j2;
                            mqp = (mqp) da2.mo74062i();
                        } else {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            mqp mqp3 = (mqp) da2.f164949b;
                            mqp3.f34335a |= 16;
                            mqp3.f34340f = 0;
                            mqp = (mqp) da2.mo74062i();
                        }
                    } else {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        mqp mqp4 = (mqp) da2.f164949b;
                        mqp4.f34335a |= 16;
                        mqp4.f34340f = -1;
                        mqp = (mqp) da2.mo74062i();
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrh mrh22 = (mrh) da.f164949b;
                    mqp.getClass();
                    mrh22.f34424w = mqp;
                    mrh22.f34402a |= 1048576;
                }
                mrh mrh23 = (mrh) da.mo74062i();
                int g = (int) ccnf.m130738g();
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                mqk mqk = (mqk) a.f164949b;
                mqk mqk2 = mqk.f34276G;
                mqk.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                mqk.f34304u = g;
                if (!ccnf.f179489a.mo6606a().mo76449u() && !mrh23.f34403b) {
                    ndy.f35373a.mo25412b("Unable to log device snapshot; backup disabled.", new Object[0]);
                    return;
                }
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                mqk mqk3 = (mqk) a.f164949b;
                mrh23.getClass();
                mqk3.f34302s = mrh23;
                mqk3.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                qwo a8 = ndy.f35376d.mo24335a(((mqk) a.mo74062i()).mo73642k());
                a8.mo24328b(15);
                a8.mo24327b();
                return;
            }
        }
        f29221a.mo25412b("Not logging DeviceStateSnapshot.", new Object[0]);
    }
}
