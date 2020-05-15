package p000;

import android.app.backup.BackupDataInput;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: mzs */
final /* synthetic */ class mzs implements Callable {

    /* renamed from: a */
    private final nab f35058a;

    /* renamed from: b */
    private final PackageInfo f35059b;

    /* renamed from: c */
    private final ParcelFileDescriptor f35060c;

    /* renamed from: d */
    private final int f35061d;

    public mzs(nab nab, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.f35058a = nab;
        this.f35059b = packageInfo;
        this.f35060c = parcelFileDescriptor;
        this.f35061d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026a, code lost:
        if (r10.length() == 0) goto L_0x026c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c0  */
    public final Object call() {
        int i;
        String str;
        char c;
        int i2;
        myj myj;
        bxvd bxvd;
        Iterator it;
        int i3;
        nab nab = this.f35058a;
        PackageInfo packageInfo = this.f35059b;
        ParcelFileDescriptor parcelFileDescriptor = this.f35060c;
        int i4 = this.f35061d;
        int i5 = i4 & 1;
        mbx mbx = nab.f35117x;
        String str2 = packageInfo.packageName;
        boolean a = nab.mo20369a();
        boolean z = i5 != 0;
        mbx.mo19828a(4, str2, z, a);
        if (nab.f35111r.mo17284d()) {
            nab.f35075a.mo25416d("Not performing KV backup - GmsBackupTransport is explicitly disabled", new Object[0]);
            nab.f35117x.mo19822a(12, 4);
            i = -1000;
        } else if (!ccnf.f179489a.mo6606a().mo76419M()) {
            nab.f35116w.mo3201b(System.currentTimeMillis() + (ccnf.f179489a.mo6606a().mo76421O() * 1000));
            nab.f35117x.mo19822a(2, 4);
            i = -1000;
        } else if (nab.f35103j != null && ccnf.f179489a.mo6606a().mo76452x()) {
            nab.f35075a.mo25418e("Attempt to initiate k/v backup while full backup is in progress", new Object[0]);
            nab.f35117x.mo19822a(11, 4);
            i = -1000;
        } else {
            nab.m25824a(nab.f35110q, nab.f35117x).mo20328a();
            if (nab.mo20369a()) {
                try {
                    Context context = nab.f35110q;
                    nbm nbm = new nbm(context, lwb.m24518a(context), nab.f35088M.mo20314a(), nab.f35109p, srb.f45012a);
                    File file = new File(nbm.f35188b.getFilesDir(), "force_secondary_key_rotation");
                    if (file.exists()) {
                        file.delete();
                        nbm.f35187a.mo25414c("Found force flag for secondary rotation. Starting now.", new Object[0]);
                        nbm.mo20435a();
                    } else {
                        lwc lwc = nbm.f35189c;
                        bmxv b = lwc.f33100c.contains("secondaryKeyLastRotatedAt") ? bmxv.m108566b(Long.valueOf(lwc.f33100c.getLong("secondaryKeyLastRotatedAt", -1))) : bmvz.f131120a;
                        if (!b.mo66813a()) {
                            nbm.f35187a.mo25409a("No previous rotation, scheduling from now.", new Object[0]);
                            nbm.f35189c.mo19692a(System.currentTimeMillis());
                        } else {
                            long longValue = ((Long) b.mo66814b()).longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (longValue > currentTimeMillis) {
                                nbm.f35187a.mo25414c("Last rotation was in the future. Clock must have changed. Rotate now.", new Object[0]);
                                nbm.mo20435a();
                            } else {
                                long j = currentTimeMillis - longValue;
                                long m = cclp.f179364a.mo6606a().mo76310m();
                                if (j >= m) {
                                    i3 = 1;
                                    nbm.f35187a.mo25414c("Last rotation was more than %dms (%dms) in the past. Rotate now.", Long.valueOf(m), Long.valueOf(j));
                                    nbm.mo20435a();
                                } else {
                                    i3 = 1;
                                }
                                lvn lvn = nbm.f35187a;
                                Object[] objArr = new Object[i3];
                                objArr[0] = Long.valueOf(longValue);
                                lvn.mo25409a("No rotation required, last %d.", objArr);
                            }
                        }
                    }
                } catch (lwh e) {
                    nab.f35075a.mo25417e("Error checking secondary key rotation schedule", e, new Object[0]);
                }
            }
            if (!nab.f35115v.mo19625b()) {
                nab.f35075a.mo25414c("Try to backup for an uninitialized backup account.", new Object[0]);
                nab.f35117x.mo19822a(3, 4);
                i = -1001;
            } else if (!ccnf.m130736e() || nab.f35115v.mo19624a() != null) {
                int i6 = Build.VERSION.SDK_INT;
                Context context2 = nab.f35110q;
                mcf a2 = mcg.m24865a(context2, packageInfo);
                if (a2 == mcf.ELIGIBLE) {
                    a2 = !mcg.m24866a(context2, packageInfo.packageName) ? mcf.INELIGIBLE_PACKAGE_CONSENT : mcf.ELIGIBLE;
                }
                if (a2 != mcf.ELIGIBLE) {
                    nab.f35075a.mo25416d("Rejecting package %s for kv backup because ineligible (%s).", packageInfo.packageName, a2);
                    nab.f35117x.mo19834a(a2);
                    i = -1002;
                } else {
                    String str3 = packageInfo.packageName;
                    nab.f35097d = str3;
                    if (i5 == 0) {
                        nac nac = nab.f35119z;
                        long j2 = nac.f35121b.getLong(str3, 0);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (nac.mo20406a(str3) && currentTimeMillis2 < j2) {
                            nac.f35120a.mo25414c("K/V backup for %s aborted by rate limiter. next=%d, current=%d", str3, Long.valueOf(j2), Long.valueOf(currentTimeMillis2));
                            int i7 = Build.VERSION.SDK_INT;
                            nab.f35117x.mo19822a(6, 4);
                            i = -1002;
                        }
                    }
                    if (!ccnr.f179566a.mo6606a().mo76486g()) {
                        try {
                            ApplicationInfo applicationInfo = nab.f35110q.getPackageManager().getApplicationInfo(str3, 128);
                            str = applicationInfo.metaData != null ? applicationInfo.metaData.getString("com.google.android.backup.api_key") : null;
                            try {
                                if ((applicationInfo.flags & 1) == 0) {
                                    if (str == null) {
                                    }
                                    sek sek = nab.f35075a;
                                    String valueOf = String.valueOf(str3);
                                    sek.mo25418e(valueOf.length() == 0 ? new String("IGNORING BACKUP DATA without API key: ") : "IGNORING BACKUP DATA without API key: ".concat(valueOf), new Object[0]);
                                    nab.f35117x.mo19822a(5, 4);
                                    i = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                nab.f35075a.mo25412b("Unknown package, continuing: %s", str3);
                                nab.f35095b = packageInfo.applicationInfo != null ? packageInfo.applicationInfo.uid : 1000;
                                TrafficStats.setThreadStatsTagBackup();
                                TrafficStats.setThreadStatsUid(nab.f35095b);
                                if (!nab.mo20369a()) {
                                }
                                return Integer.valueOf(i);
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            str = null;
                            nab.f35075a.mo25412b("Unknown package, continuing: %s", str3);
                            nab.f35095b = packageInfo.applicationInfo != null ? packageInfo.applicationInfo.uid : 1000;
                            TrafficStats.setThreadStatsTagBackup();
                            TrafficStats.setThreadStatsUid(nab.f35095b);
                            if (!nab.mo20369a()) {
                            }
                            return Integer.valueOf(i);
                        }
                    } else {
                        str = null;
                    }
                    nab.f35095b = packageInfo.applicationInfo != null ? packageInfo.applicationInfo.uid : 1000;
                    TrafficStats.setThreadStatsTagBackup();
                    TrafficStats.setThreadStatsUid(nab.f35095b);
                    if (!nab.mo20369a()) {
                        nab.f35075a.mo25414c("Performing unencrypted kv backup: %s", str3);
                        try {
                            if (nab.mo20370a((i5 ^ 1) != 0)) {
                                myj myj2 = new myj(new BackupDataInput(parcelFileDescriptor.getFileDescriptor()), nab.f35096c.mo19796a(str3, str));
                                while (true) {
                                    try {
                                        int i8 = myj2.f34938e;
                                        if (i8 < 0 || i8 >= myj2.f34936c.getDataSize()) {
                                            if (!myj2.f34936c.readNextHeader()) {
                                                break;
                                            }
                                            myj2.f34938e = 0;
                                        }
                                        String key = myj2.f34936c.getKey();
                                        int dataSize = myj2.f34936c.getDataSize();
                                        if (dataSize < 0) {
                                            myj2.f34937d.mo19794a(key, null);
                                            myj2.f34937d.mo19793a(String.valueOf(key).concat(":#"));
                                        } else {
                                            int min = Math.min(512000, dataSize - myj2.f34938e);
                                            byte[] bArr = new byte[min];
                                            myj2.f34936c.readEntityData(bArr, 0, min);
                                            if (myj2.f34938e == 0) {
                                                if (dataSize <= 512000 && !key.contains(":#")) {
                                                    myj2.f34937d.mo19794a(key, bArr);
                                                    myj2.f34938e += min;
                                                }
                                            }
                                            int i9 = myj2.f34938e / 512000;
                                            if (i9 == 0) {
                                                if (!key.contains(":#")) {
                                                    myj2.f34937d.mo19794a(key, null);
                                                }
                                                myj2.f34937d.mo19793a(String.valueOf(key).concat(":#"));
                                            }
                                            lzv lzv = myj2.f34937d;
                                            String format = myj.f34934a.format((long) i9);
                                            String format2 = myj.f34935b.format((long) dataSize);
                                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + String.valueOf(format).length() + String.valueOf(format2).length());
                                            sb.append(key);
                                            sb.append(format);
                                            sb.append(format2);
                                            lzv.mo19794a(sb.toString(), bArr);
                                            myj2.f34938e += min;
                                        }
                                        int i10 = 0;
                                        for (Map.Entry entry : nab.f35096c.f33308b.entrySet()) {
                                            for (Map.Entry entry2 : ((lzv) entry.getValue()).f33303a.entrySet()) {
                                                if (entry2.getValue() != null) {
                                                    i10 += ((String) entry2.getKey()).length() + 5 + ((byte[]) entry2.getValue()).length;
                                                }
                                            }
                                        }
                                        if (i10 >= 512000) {
                                            lvu lvu = nab.f35112s;
                                            msk msk = msk.KV_BACKUP_PARTIAL_REQUEST;
                                            lzw lzw = nab.f35096c;
                                            bxvd da = lth.f32914q.mo74144da();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            lth lth = (lth) da.f164949b;
                                            lth.f32916a |= 64;
                                            lth.f32922g = 2;
                                            if (lzw.f33309c) {
                                                bxvd da2 = lta.f32883a.mo74144da();
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                lta.m24364a((lta) da2.f164949b);
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                lth lth2 = (lth) da.f164949b;
                                                lta lta = (lta) da2.mo74062i();
                                                lta.getClass();
                                                lth2.f32928m = lta;
                                                lth2.f32916a |= 8192;
                                                lzw.f33309c = false;
                                            }
                                            Iterator it2 = lzw.f33308b.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry entry3 = (Map.Entry) it2.next();
                                                lzv lzv2 = (lzv) entry3.getValue();
                                                Iterator it3 = lzv2.f33303a.entrySet().iterator();
                                                bxvd bxvd2 = null;
                                                while (it3.hasNext()) {
                                                    Map.Entry entry4 = (Map.Entry) it3.next();
                                                    if (entry4.getValue() != null) {
                                                        if (bxvd2 != null) {
                                                            myj = myj2;
                                                            bxvd = bxvd2;
                                                        } else {
                                                            bxvd da3 = lsz.f32870k.mo74144da();
                                                            String str4 = (String) entry3.getKey();
                                                            if (da3.f164950c) {
                                                                da3.mo74035c();
                                                                da3.f164950c = false;
                                                            }
                                                            lsz lsz = (lsz) da3.f164949b;
                                                            str4.getClass();
                                                            myj = myj2;
                                                            int i11 = lsz.f32872a | 1;
                                                            bxvd bxvd3 = da3;
                                                            lsz.f32872a = i11;
                                                            lsz.f32873b = str4;
                                                            String str5 = lzv2.f33306d;
                                                            if (str5 != null) {
                                                                str5.getClass();
                                                                lsz.f32872a = i11 | 2;
                                                                lsz.f32874c = str5;
                                                            }
                                                            bxvd = bxvd3;
                                                        }
                                                        if (!lzv2.f33305c.isEmpty()) {
                                                            it = it2;
                                                        } else {
                                                            bxvd da4 = lsw.f32856c.mo74144da();
                                                            if (da4.f164950c) {
                                                                da4.mo74035c();
                                                                da4.f164950c = false;
                                                            }
                                                            lsw lsw = (lsw) da4.f164949b;
                                                            "_tmp_".getClass();
                                                            it = it2;
                                                            lsw.f32858a |= 1;
                                                            lsw.f32859b = "_tmp_";
                                                            bxvd.mo74051f(da4);
                                                        }
                                                        bxvd da5 = ltr.f32982d.mo74144da();
                                                        String valueOf2 = String.valueOf(lzw.f33307a);
                                                        String valueOf3 = String.valueOf((String) entry4.getKey());
                                                        String str6 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
                                                        if (da5.f164950c) {
                                                            da5.mo74035c();
                                                            da5.f164950c = false;
                                                        }
                                                        ltr ltr = (ltr) da5.f164949b;
                                                        str6.getClass();
                                                        ltr.f32984a |= 1;
                                                        ltr.f32985b = str6;
                                                        bxtx a3 = bxtx.m123261a((byte[]) entry4.getValue());
                                                        if (da5.f164950c) {
                                                            da5.mo74035c();
                                                            da5.f164950c = false;
                                                        }
                                                        ltr ltr2 = (ltr) da5.f164949b;
                                                        a3.getClass();
                                                        ltr2.f32984a |= 2;
                                                        ltr2.f32986c = a3;
                                                        bxvd.mo74055g(da5);
                                                        lzv2.f33305c.add((String) entry4.getKey());
                                                        it3.remove();
                                                        bxvd2 = bxvd;
                                                        myj2 = myj;
                                                        it2 = it;
                                                    }
                                                }
                                                myj myj3 = myj2;
                                                Iterator it4 = it2;
                                                if (bxvd2 != null) {
                                                    da.mo74059h(bxvd2);
                                                    myj2 = myj3;
                                                    it2 = it4;
                                                } else {
                                                    myj2 = myj3;
                                                    it2 = it4;
                                                }
                                            }
                                            myj myj4 = myj2;
                                            lvu.mo17279a(msk, da, nab.f35116w, z);
                                            nab.f35116w.mo3199a(0);
                                            myj2 = myj4;
                                        }
                                    } catch (IOException e4) {
                                        nab.f35075a.mo25417e("Error reading from backup data fragmenter.", e4, new Object[0]);
                                        nab.f35117x.mo19822a(8, 4);
                                    } catch (mbm e5) {
                                        sek sek2 = nab.f35075a;
                                        String valueOf4 = String.valueOf(str3);
                                        sek2.mo25418e(valueOf4.length() == 0 ? new String("Size quota exceeded for package: ") : "Size quota exceeded for package: ".concat(valueOf4), new Object[0]);
                                        if (ccno.m130867b()) {
                                            nab.mo20373c();
                                        }
                                        nab.f35114u.mo3199a(0);
                                        nab.f35112s.mo17279a(msk.KV_BACKUP_ABORT_REQUEST, nab.f35096c.mo19795a(), nab.f35114u, z);
                                        int i12 = Build.VERSION.SDK_INT;
                                        TrafficStats.clearThreadStatsTag();
                                        TrafficStats.clearThreadStatsUid();
                                        i = -1005;
                                    } catch (mbk e6) {
                                        nab.f35075a.mo25417e("Server policy rejection: ", e6, new Object[0]);
                                        nab.f35114u.mo3199a(0);
                                        nab.f35112s.mo17279a(msk.KV_BACKUP_ABORT_REQUEST, nab.f35096c.mo19795a(), nab.f35114u, z);
                                    } catch (mbs e7) {
                                        nab.f35075a.mo25418e("Unencrypted backup tried; server expected encrypted. Re-initializing.", new Object[0]);
                                        TrafficStats.clearThreadStatsTag();
                                        TrafficStats.clearThreadStatsUid();
                                        i = -1001;
                                        return Integer.valueOf(i);
                                    }
                                }
                                sek sek3 = nab.f35075a;
                                String valueOf5 = String.valueOf(str3);
                                sek3.mo25414c(valueOf5.length() == 0 ? new String("performBackup done for ") : "performBackup done for ".concat(valueOf5), new Object[0]);
                                TrafficStats.clearThreadStatsTag();
                                TrafficStats.clearThreadStatsUid();
                                i = 0;
                            } else {
                                nab.f35117x.mo19823a(9, 4, nab.f35116w.f34946d);
                                nab.f35075a.mo25416d("initRequestGeneratorLocked() failed, returning error", new Object[0]);
                                TrafficStats.clearThreadStatsTag();
                                TrafficStats.clearThreadStatsUid();
                                i = -1000;
                            }
                        } catch (mbt e8) {
                            nab.f35075a.mo25417e("Uninitialized device: ", e8, new Object[0]);
                        } catch (mbd e9) {
                            nab.f35075a.mo25417e("Error sending partial backup to server: ", e9, new Object[0]);
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            TrafficStats.clearThreadStatsTag();
                            TrafficStats.clearThreadStatsUid();
                            throw th2;
                        }
                    } else {
                        if (nab.f35096c == null) {
                            i2 = 1;
                            c = 0;
                        } else {
                            int b2 = nab.mo20372b();
                            if (b2 != 0) {
                                nab.f35075a.mo25418e("Encrypted init failed, %d", Integer.valueOf(b2));
                                i = b2;
                            } else {
                                i2 = 1;
                                c = 0;
                            }
                        }
                        sek sek4 = nab.f35075a;
                        Object[] objArr2 = new Object[i2];
                        objArr2[c] = str3;
                        sek4.mo25414c("Performing encrypted kv backup: %s", objArr2);
                        i = nab.mo20367a(str3, str, parcelFileDescriptor, i4);
                    }
                }
            } else {
                nab.f35117x.mo19822a(4, 4);
                i = -1000;
            }
        }
        return Integer.valueOf(i);
    }
}
