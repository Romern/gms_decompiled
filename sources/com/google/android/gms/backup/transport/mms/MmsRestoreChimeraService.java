package com.google.android.gms.backup.transport.mms;

import android.app.Notification;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MmsRestoreChimeraService extends sno {

    /* renamed from: d */
    private static final lvn f29245d = new lvn("MmsRestoreService");

    /* renamed from: a */
    public mcb f29246a;

    /* renamed from: b */
    public Timestamp f29247b;

    /* renamed from: c */
    public mbx f29248c;

    /* renamed from: e */
    private mad f29249e;

    /* renamed from: f */
    private final lvt f29250f = lvt.f33072a;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.gms.fileprovider").appendPath("mms").build();
        TimeUnit.SECONDS.toMillis(5);
    }

    /* renamed from: a */
    private final File m22026a(bzob bzob, String str, boolean z) {
        File file = new File(new File(new File(getFilesDir(), "mms"), bzob.f170790a), str);
        m22030a(z, file);
        return file;
    }

    /* renamed from: b */
    private final long m22031b() {
        if (!ccls.m130526e() || bmxx.m108577a(this.f29250f.mo19679f(this))) {
            return new lvp(this).mo19639a("--");
        }
        try {
            return Long.parseLong(this.f29250f.mo19679f(this));
        } catch (NullPointerException | NumberFormatException e) {
            f29245d.mo25418e("AncestorId read from G1Settings is not parseable, falling back to reading from BackupManager", new Object[0]);
            return new lvp(this).mo19639a("--");
        }
    }

    /* renamed from: a */
    private final File m22027a(String str, boolean z) {
        File file = new File(new File(getFilesDir(), "mms"), str);
        m22030a(z, file);
        return file;
    }

    /* renamed from: a */
    private final void m22028a() {
        File b = this.f29246a.mo19847b("com.android.providers.telephony");
        File a = this.f29246a.mo19845a("com.android.providers.telephony");
        File file = new File(getFilesDir(), "mms");
        if (b.exists()) {
            b.delete();
        }
        if (a.exists()) {
            a.delete();
        }
        if (file.exists()) {
            srj.m36120a(file);
        }
        new adzt(Looper.getMainLooper()).post(new ndh(this));
        if (ccls.m130543v()) {
            lvt.f33072a.mo19673c(this, false);
        } else {
            lvt.f33072a.mo19673c(this, true);
        }
        stopForeground(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: a */
    private static final void m22029a(File file, bzoo bzoo) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8));
        try {
            for (bzok bzok : bzoo.f170848a) {
                bufferedWriter.append((CharSequence) bzok.f170826a);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static final void m22030a(boolean z, File file) {
        if (z) {
            if (file.exists()) {
                file.delete();
            }
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(java.lang.String, boolean):java.io.File
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(java.io.File, bzoo):void
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(boolean, java.io.File):void
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(java.lang.String, boolean):java.io.File */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(boolean, java.io.File):void
     arg types: [int, java.io.File]
     candidates:
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(java.lang.String, boolean):java.io.File
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(java.io.File, bzoo):void
      com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService.a(boolean, java.io.File):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0591, code lost:
        if (r3 == 1) goto L_0x0593;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x036a A[Catch:{ all -> 0x066e, all -> 0x0674, all -> 0x0667, all -> 0x061e, all -> 0x0624, all -> 0x0618, all -> 0x0600, all -> 0x05a6, all -> 0x05ac, Exception -> 0x06da }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        lyg lyg;
        FileOutputStream fileOutputStream;
        Throwable th;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        DataOutputStream dataOutputStream;
        Throwable th7;
        FileInputStream fileInputStream;
        Throwable th8;
        Throwable th9;
        Throwable th10;
        File a;
        File file;
        lym lym;
        boolean z;
        BufferedReader bufferedReader;
        Throwable th11;
        lym lym2;
        FileOutputStream fileOutputStream2;
        Throwable th12;
        if (this.f29248c == null) {
            this.f29248c = new mbx(this);
        }
        if (!lvt.f33072a.mo19674c(this)) {
            boolean z2 = false;
            Notification.Builder progress = mbv.m24816b(this).setContentTitle(getResources().getString(C0126R.string.mms_restore_foreground_notification_title)).setProgress(0, 0, true);
            progress.setSmallIcon(qkj.m32287a(this, C0126R.C0127drawable.g1_notification_logo_24));
            mbv.m24817b(this, progress);
            startForeground(9901, progress.build());
            this.f29249e = new mad(this, getPackageManager());
            this.f29246a = new mcb(this);
            if (ccly.m130639b()) {
                lyg = new lxu(this);
            } else {
                lyg = new lye(this);
            }
            lym lym3 = new lym(this);
            long b = m22031b();
            if (b == 0 || b == 1) {
                if (ccls.m130539r()) {
                    b = spn.m35843a(this);
                } else {
                    f29245d.mo25416d("No ancestor Id", new Object[0]);
                    this.f29248c.mo19841d(4);
                    m22028a();
                    return;
                }
            }
            this.f29247b = new Timestamp(System.currentTimeMillis());
            mbx mbx = this.f29248c;
            if (ccls.m130540s()) {
                bxvd a2 = lyu.m24685a();
                bxvd da = mse.f34525e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mse mse = (mse) da.f164949b;
                mse.f34528b = 2;
                mse.f34527a |= 1;
                if (a2.f164950c) {
                    a2.mo74035c();
                    a2.f164950c = false;
                }
                mqk mqk = (mqk) a2.f164949b;
                mse mse2 = (mse) da.mo74062i();
                mqk mqk2 = mqk.f34276G;
                mse2.getClass();
                mqk.f34282E = mse2;
                mqk.f34285b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                mbx.mo19833a(a2, mqj.MMS_RESTORE, mbx.f33384d);
            }
            try {
                bxvd da2 = bzol.f170830c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bzol) da2.f164949b).f170833b = b;
                bxvd a3 = lyf.m24647a(this);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzoa bzoa = (bzoa) a3.mo74062i();
                bzoa.getClass();
                ((bzol) da2.f164949b).f170832a = bzoa;
                bzob a4 = lyg.mo19735a((bzol) da2.mo74062i());
                File a5 = this.f29246a.mo19845a("com.android.providers.telephony");
                File b2 = this.f29246a.mo19847b("com.android.providers.telephony");
                int i = Build.VERSION.SDK_INT;
                if (b2.exists()) {
                    if (!a5.exists()) {
                        f29245d.mo25414c("Restore file already exists.", new Object[0]);
                        if (a4.f170792c > 0) {
                            int i2 = Build.VERSION.SDK_INT;
                            File a6 = this.f29246a.mo19845a("com.android.providers.telephony");
                            if (!this.f29246a.mo19847b("com.android.providers.telephony").exists() || a6.exists()) {
                                if (!a6.exists() || new File(getFilesDir(), "mms").exists()) {
                                    if (!ccls.m130523b()) {
                                        if (a6.exists()) {
                                            a6.delete();
                                        }
                                        a6.createNewFile();
                                    } else {
                                        m22030a(true, a6);
                                    }
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(a6);
                                    try {
                                        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileOutputStream3.getFD());
                                        try {
                                            a = mce.m24857a(this, "_manifest");
                                            this.f29249e.mo19798a(a);
                                            FullBackupDataOutput fullBackupDataOutput = (FullBackupDataOutput) Class.forName("android.app.backup.FullBackupDataOutput").getConstructor(ParcelFileDescriptor.class).newInstance(dup);
                                            mad.m24757b("com.android.providers.telephony", null, a.getParent(), a.getAbsolutePath(), fullBackupDataOutput);
                                            File file2 = new File(new File(new File(getFilesDir(), "mms"), a4.f170790a), "files");
                                            File[] listFiles = file2.listFiles();
                                            int length = listFiles.length;
                                            int i3 = 0;
                                            while (i3 < length) {
                                                File file3 = listFiles[i3];
                                                if (!file3.isDirectory()) {
                                                    file = file2;
                                                    mad.m24757b("com.android.providers.telephony", "d_f", file3.getParent(), file3.getAbsolutePath(), fullBackupDataOutput);
                                                } else {
                                                    file = file2;
                                                }
                                                i3++;
                                                file2 = file;
                                            }
                                            File[] listFiles2 = new File(file2, "app_parts").listFiles();
                                            for (File file4 : listFiles2) {
                                                mad.m24757b("com.android.providers.telephony", "d_r", file4.getParentFile().getParent(), file4.getAbsolutePath(), fullBackupDataOutput);
                                            }
                                            a.delete();
                                            fileOutputStream3.write(new byte[4]);
                                            srj.m36120a(new File(getFilesDir(), "mms"));
                                            if (dup != null) {
                                                dup.close();
                                            }
                                            fileOutputStream3.close();
                                        } catch (Throwable th13) {
                                            th10 = th13;
                                            if (dup != null) {
                                                dup.close();
                                            }
                                            throw th10;
                                        }
                                    } catch (Throwable th14) {
                                        th9 = th14;
                                        fileOutputStream3.close();
                                        throw th9;
                                    }
                                } else {
                                    f29245d.mo25414c("Dump file exists", new Object[0]);
                                }
                            }
                            File a7 = this.f29246a.mo19845a("com.android.providers.telephony");
                            File b3 = this.f29246a.mo19847b("com.android.providers.telephony");
                            if (b3.exists() && !a7.exists()) {
                                f29245d.mo25414c("Restore file already exists.", new Object[0]);
                            } else {
                                this.f29249e.mo19799a(a7, b3);
                                a7.delete();
                            }
                            File file5 = this.f29246a.f33397b;
                            File file6 = new File(file5, "restore_token_file");
                            if (!ccls.m130523b()) {
                                file6.createNewFile();
                            } else {
                                m22030a(true, file6);
                            }
                            String valueOf = String.valueOf(b);
                            fileOutputStream = new FileOutputStream(file6);
                            fileOutputStream.write(valueOf.getBytes(StandardCharsets.UTF_8));
                            fileOutputStream.close();
                            File file7 = new File(file5, "@pm@");
                            if (!ccls.m130523b()) {
                                file7.createNewFile();
                            } else {
                                m22030a(true, file7);
                            }
                            FileOutputStream fileOutputStream4 = new FileOutputStream(file7);
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                BackupDataOutput backupDataOutput = new BackupDataOutput(fileOutputStream4.getFD());
                                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                                dataOutputStream2.writeInt(23);
                                dataOutputStream2.writeUTF("2920157");
                                dataOutputStream2.flush();
                                mad.m24751a(backupDataOutput, "@meta@", byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.close();
                                fileOutputStream4.close();
                                File a8 = mce.m24857a(this, "telephony_metadata");
                                FileInputStream fileInputStream2 = new FileInputStream(file7);
                                try {
                                    FileOutputStream fileOutputStream5 = new FileOutputStream(a8);
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
                                            dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                                            BackupDataInput backupDataInput = new BackupDataInput(fileInputStream2.getFD());
                                            BackupDataOutput backupDataOutput2 = new BackupDataOutput(fileOutputStream5.getFD());
                                            while (backupDataInput.readNextHeader()) {
                                                String key = backupDataInput.getKey();
                                                int dataSize = backupDataInput.getDataSize();
                                                if (dataSize < 0 || "com.android.providers.telephony".equals(key)) {
                                                    backupDataInput.skipEntityData();
                                                } else {
                                                    byte[] bArr = new byte[dataSize];
                                                    backupDataInput.readEntityData(bArr, 0, dataSize);
                                                    mad.m24751a(backupDataOutput2, key, bArr);
                                                }
                                            }
                                            dataOutputStream.writeInt(23);
                                            mad.m24753a(dataOutputStream, mad.m24750a(new byte[][]{mad.m24756a(this)}));
                                            mad.m24751a(backupDataOutput2, "com.android.providers.telephony", byteArrayOutputStream2.toByteArray());
                                            fileInputStream2.close();
                                            file7.delete();
                                            dataOutputStream.close();
                                            byteArrayOutputStream2.close();
                                            fileOutputStream5.close();
                                            fileInputStream2.close();
                                            fileInputStream = new FileInputStream(a8);
                                            srj.m36118a(fileInputStream, file7);
                                            a8.delete();
                                            fileInputStream.close();
                                            long b4 = m22031b();
                                            mas mas = new mas(this, "com.android.providers.telephony", new lvp(this));
                                            if (ccls.m130539r()) {
                                                if (b4 == 0) {
                                                }
                                                mas = new mas(this, new lvp(this));
                                            }
                                            mas.mo19813a(new ndf(this));
                                            return;
                                        } catch (Throwable th15) {
                                            th6 = th15;
                                            byteArrayOutputStream2.close();
                                            throw th6;
                                        }
                                    } catch (Throwable th16) {
                                        th5 = th16;
                                        fileOutputStream5.close();
                                        throw th5;
                                    }
                                } catch (Throwable th17) {
                                    th4 = th17;
                                    fileInputStream2.close();
                                    throw th4;
                                }
                            } catch (Throwable th18) {
                                th2 = th18;
                                fileOutputStream4.close();
                                throw th2;
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (a5.exists() && !new File(getFilesDir(), "mms").exists()) {
                    f29245d.mo25414c("Temp file already exists.", new Object[0]);
                    if (a4.f170792c > 0) {
                    }
                } else {
                    lym lym4 = lym3;
                    if (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() < a4.f170792c * 3) {
                        f29245d.mo25416d("Not enough space for restore", new Object[0]);
                        this.f29248c.mo19841d(5);
                        m22028a();
                        return;
                    }
                    bxvd da3 = bzop.f170851e.mo74144da();
                    String str = a4.f170790a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str.getClass();
                    ((bzop) da3.f164949b).f170854b = str;
                    bxvd da4 = bzos.f170860b.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    ((bzos) da4.f164949b).f170862a = bzor.m125993a(3);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzos bzos = (bzos) da4.mo74062i();
                    bzos.getClass();
                    ((bzop) da3.f164949b).f170855c = bzos;
                    bxvd a9 = lyf.m24647a(this);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzoa bzoa2 = (bzoa) a9.mo74062i();
                    bzoa2.getClass();
                    ((bzop) da3.f164949b).f170853a = bzoa2;
                    bzoq a10 = lyg.mo19737a((bzop) da3.mo74062i());
                    File a11 = m22026a(a4, "fileIds.txt", false);
                    if (a11.exists()) {
                        a11.delete();
                    }
                    File a12 = m22026a(a4, "fileIds.txt.tmp", true);
                    bxvd da5 = bzon.f170839f.mo74144da();
                    String str2 = a4.f170790a;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bzon bzon = (bzon) da5.f164949b;
                    str2.getClass();
                    bzon.f170842b = str2;
                    String str3 = a10.f170859a;
                    str3.getClass();
                    bzon.f170845e = str3;
                    bxvd a13 = lyf.m24647a(this);
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bzoa bzoa3 = (bzoa) a13.mo74062i();
                    bzoa3.getClass();
                    ((bzon) da5.f164949b).f170841a = bzoa3;
                    bzoo a14 = lyg.mo19736a((bzon) da5.mo74062i());
                    m22029a(a12, a14);
                    while (!a14.f170849b.isEmpty()) {
                        lym lym5 = lym;
                        bxvd da6 = bzon.f170839f.mo74144da();
                        String str4 = a4.f170790a;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bzon bzon2 = (bzon) da6.f164949b;
                        str4.getClass();
                        bzon2.f170842b = str4;
                        String str5 = a10.f170859a;
                        str5.getClass();
                        bzon2.f170845e = str5;
                        String str6 = a14.f170849b;
                        str6.getClass();
                        bzon2.f170844d = str6;
                        bxvd a15 = lyf.m24647a(this);
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bzoa bzoa4 = (bzoa) a15.mo74062i();
                        bzoa4.getClass();
                        ((bzon) da6.f164949b).f170841a = bzoa4;
                        a14 = lyg.mo19736a((bzon) da6.mo74062i());
                        m22029a(a12, a14);
                        lym4 = lym5;
                        z2 = false;
                    }
                    a12.renameTo(m22026a(a4, "fileIds.txt", z));
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m22026a(a4, "fileIds.txt", z)), StandardCharsets.UTF_8));
                    String readLine = bufferedReader.readLine();
                    boolean z3 = true;
                    while (readLine != null) {
                        if (!m22027a(readLine, z).exists()) {
                            try {
                                bxvd da7 = bzom.f170834d.mo74144da();
                                bxvd a16 = lyf.m24647a(this);
                                if (da7.f164950c) {
                                    da7.mo74035c();
                                    da7.f164950c = z;
                                }
                                bzoa bzoa5 = (bzoa) a16.mo74062i();
                                bzoa5.getClass();
                                ((bzom) da7.f164949b).f170836a = bzoa5;
                                String a17 = nde.m25954a(readLine);
                                if (da7.f164950c) {
                                    da7.mo74035c();
                                    da7.f164950c = z;
                                }
                                bzom bzom = (bzom) da7.f164949b;
                                a17.getClass();
                                bzom.f170837b = a17;
                                String str7 = a10.f170859a;
                                str7.getClass();
                                bzom.f170838c = str7;
                                bzom bzom2 = (bzom) da7.mo74062i();
                                lym2 = lym;
                                try {
                                    lzy lzy = (lzy) lym2.f33194b.mo6606a();
                                    byte[] bArr2 = (byte[]) new lyl(bzom2).mo19750a(lym2.f33193a, lym2.f33195c.mo19723a(), "application/octet-stream");
                                    File a18 = m22027a(String.valueOf(readLine).concat(".tmp"), true);
                                    fileOutputStream2 = new FileOutputStream(a18);
                                    fileOutputStream2.write(bArr2);
                                    fileOutputStream2.close();
                                    a18.renameTo(m22027a(readLine, false));
                                } catch (mbf e) {
                                } catch (Throwable th19) {
                                    bqye.m113761a(th12, th19);
                                }
                            } catch (mbf e2) {
                                lym2 = lym;
                                this.f29248c.mo19841d(6);
                                z3 = false;
                                readLine = bufferedReader.readLine();
                                lym = lym2;
                                z = false;
                            }
                            readLine = bufferedReader.readLine();
                            lym = lym2;
                            z = false;
                        } else {
                            lym lym6 = lym;
                            readLine = bufferedReader.readLine();
                            lym = lym6;
                            z = false;
                        }
                    }
                    bufferedReader.close();
                    if (!z3) {
                        return;
                    }
                    if (a4.f170792c > 0) {
                    }
                }
            } catch (Exception e3) {
                f29245d.mo25415d("Error restoring MMS", e3, new Object[0]);
                this.f29248c.mo19841d(1);
                m22028a();
                return;
            } catch (Throwable th20) {
                bqye.m113761a(th8, th20);
            }
        } else {
            this.f29248c.mo19841d(3);
            return;
        }
        throw th7;
        throw th;
        throw th8;
        throw th3;
        throw th11;
        throw th12;
    }
}
