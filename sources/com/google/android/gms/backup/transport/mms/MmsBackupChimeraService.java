package com.google.android.gms.backup.transport.mms;

import android.app.Notification;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.provider.Telephony;
import com.felicanetworks.mfc.C0126R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MmsBackupChimeraService extends sno implements ndd {

    /* renamed from: a */
    static final String f29237a = aymh.m84252a("g1phonebackup");

    /* renamed from: b */
    private static final lvn f29238b = new lvn("MmsBackupService");

    /* renamed from: c */
    private static final String f29239c = aymh.m84252a("googleone");

    /* renamed from: d */
    private static final String f29240d = aymh.m84252a("uca");

    /* renamed from: e */
    private static final String f29241e = aymh.m84252a("HOSTED");

    /* renamed from: f */
    private final lvt f29242f = lvt.f33072a;

    /* renamed from: g */
    private Intent f29243g;

    /* renamed from: h */
    private mbx f29244h;

    /* renamed from: a */
    private final Notification m22020a(boolean z) {
        Notification.Builder progress = mbv.m24816b(this).setProgress(0, 0, true);
        if (z) {
            progress.setContentTitle(getResources().getString(C0126R.string.mms_backup_foreground_notification_title));
        }
        progress.setSmallIcon(qkj.m32287a(this, C0126R.C0127drawable.g1_notification_logo_24));
        mbv.m24817b(this, progress);
        return progress.build();
    }

    /* renamed from: b */
    private static final void m22023b(Intent intent) {
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
    }

    /* renamed from: a */
    private final void m22021a(mbx mbx) {
        try {
            if (m22022a(f29237a)) {
                startForeground(9921, m22020a(false));
                nde nde = new nde(this, mbx, this);
                try {
                    if (!new rtj(nde.f35319b, "g1_shared_prefs", true).getBoolean("mms_data_deleted", false)) {
                        if (ccls.m130524c()) {
                            nde.mo20485a(false);
                        }
                        lyg lyg = nde.f35325m;
                        bxvd da = bzoh.f170810c.mo74144da();
                        long a = spn.m35843a(nde.f35319b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bzoh) da.f164949b).f170813b = a;
                        bxvd a2 = lyf.m24647a(nde.f35319b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzoa bzoa = (bzoa) a2.mo74062i();
                        bzoa.getClass();
                        ((bzoh) da.f164949b).f170812a = bzoa;
                        lyg.mo19739a((bzoh) da.mo74062i());
                        mbx mbx2 = nde.f35322j;
                        if (mbx2 != null) {
                            bxvd a3 = lyu.m24685a();
                            bxvd da2 = mrz.f34496i.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            mrz mrz = (mrz) da2.f164949b;
                            mrz.f34499b = 3;
                            mrz.f34498a |= 1;
                            if (a3.f164950c) {
                                a3.mo74035c();
                                a3.f164950c = false;
                            }
                            mqk mqk = (mqk) a3.f164949b;
                            mrz mrz2 = (mrz) da2.mo74062i();
                            mqk mqk2 = mqk.f34276G;
                            mrz2.getClass();
                            mqk.f34280C = mrz2;
                            mqk.f34285b |= 64;
                            mbx2.f33383c = mbx2.mo19820a();
                            mbx2.mo19833a(a3, mqj.MMS_BACKUP, mbx2.f33383c);
                        }
                        nde.mo20486b(true);
                    }
                } catch (FileNotFoundException e) {
                    nde.f35310a.mo25412b("No backup available to delete", new Object[0]);
                    nde.mo20486b(true);
                } catch (Exception e2) {
                    nde.f35310a.mo25415d("Error trying to delete backup", e2, new Object[0]);
                }
            }
        } catch (gid | IOException e3) {
            f29238b.mo25415d("Error retrieving account state", e3, new Object[0]);
        }
    }

    /* renamed from: a */
    private final boolean m22022a(String str) {
        return bngx.m109370a((Object[]) gie.m13193a(this, "com.google", new String[]{str})).contains(new lsp(this).mo19591a());
    }

    /* renamed from: a */
    public final void mo17285a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("totalMms", i);
        bundle.putInt("backedUpMms", i2);
        ResultReceiver resultReceiver = (ResultReceiver) this.f29243g.getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            resultReceiver.send(1000, bundle);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:304:0x06d3 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:158:0x040a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:241:0x0576 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:187:0x04dd */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:348:0x07dc */
    /* JADX WARN: Type inference failed for: r9v1, assign insn: 0x00f5: CONST  (r9v1 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v10, assign insn: PHI: (r9v10 ?) = (r9v14 ?), (r9v26 ?), (r9v1 ?), (r9v28 ? I:?[boolean, int, float, short, byte, char]) binds: [B:304:0x06d3, B:348:0x07dc, B:135:0x037a, B:124:0x0363] */
    /* JADX WARN: Type inference failed for: r9v14, types: [lvt], assign insn: 0x06d1: MOVE  (r9v14 ? I:?[OBJECT, ARRAY]) = (r24v1 lvt) */
    /* JADX WARN: Type inference failed for: r24v3, types: [android.net.Uri], assign insn: 0x03ec: INVOKE  (r24v3 ? I:android.net.Uri) = (r15v3 android.net.Uri$Builder) type: VIRTUAL call: android.net.Uri.Builder.build():android.net.Uri */
    /* JADX WARN: Type inference failed for: r24v4, assign insn: PHI: (r24v4 ?) = (r24v3 ?), (r24v6 ?), (r24v3 ?), (r24v15 ?) binds: [B:158:0x040a, B:241:0x0576, B:162:0x0420, B:187:0x04dd] */
    /* JADX WARN: Type inference failed for: r9v20, assign insn: 0x059e: MOVE  (r9v20 ? I:?[OBJECT, ARRAY]) = (r24v4 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r24v6, assign insn: PHI: (r24v6 ?) = (r24v8 ?), (r24v18 ?), (r24v19 ?) binds: [B:239:0x0571, B:161:0x041c, B:237:0x0567] */
    /* JADX WARN: Type inference failed for: r24v8, assign insn: 0x0571: MOVE  (r24v8 ? I:?[OBJECT, ARRAY]) = (r3v12 lvt) */
    /* JADX WARN: Type inference failed for: r24v15, assign insn: 0x04da: MOVE  (r24v15 ? I:?[OBJECT, ARRAY]) = (r3v43 lvt) */
    /* JADX WARN: Type inference failed for: r24v18, assign insn: 0x041c: MOVE  (r24v18 ? I:?[OBJECT, ARRAY]) = (r3v12 lvt) */
    /* JADX WARN: Type inference failed for: r9v26, assign insn: PHI: (r9v26 ?) = (r9v17 lvt), (r9v20 ?), (r9v27 ?) binds: [B:347:0x07da, B:252:0x059d, B:149:0x03c4] */
    /* JADX WARN: Type inference failed for: r9v27, assign insn: 0x03c5: MOVE  (r9v27 ? I:?[OBJECT, ARRAY]) = (r3v51 lvt) */
    /* JADX WARN: Type inference failed for: r9v28, assign insn: 0x00f5: CONST  (r9v28 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r24v19, assign insn: ?: MOVE  (r24v19 ?) = (r24v10 lvt) */
    /* JADX WARN: Type inference failed for: r24v20, assign insn: ?: MOVE  (r24v20 ?) = (r24v16 lvt) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0492, code lost:
        r13 = new java.lang.StringBuilder(30);
        r13.append("content://mms/part/");
        r13.append(r1);
        r1 = android.net.Uri.parse(r13.toString());
        r13 = new java.io.File(p000.mce.m24856a(r5.f35319b), "app_parts");
        r13.mkdirs();
        r14 = new java.io.File(r13, r7);
        r13 = p000.nde.f35310a;
        r2 = java.lang.String.valueOf(r14.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04ce, code lost:
        if (r2.length() != 0) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r2 = new java.lang.String("writing to file: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r2 = "writing to file: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04da, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r13.mo25409a(r2, new java.lang.Object[0]);
        r1 = r5.f35320c.openInputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r2 = new java.io.FileOutputStream(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        p000.srz.m36172a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04f3, code lost:
        if (r1 != null) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0504, code lost:
        if (r2.length() != 0) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0506, code lost:
        r2 = new java.lang.String("app_parts/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x050c, code lost:
        r2 = "app_parts/".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0510, code lost:
        r1 = r5.mo20483a(r11, r6, r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r14.delete();
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0519, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x051a, code lost:
        r1 = r0;
        r14.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x051e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x051f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0520, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0525, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        p000.bqye.m113761a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x052b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x052c, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x052d, code lost:
        if (r1 != null) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0533, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        p000.bqye.m113761a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0538, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x058c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05d9, code lost:
        r1 = r0;
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07d2, code lost:
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07ff, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0802, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0803, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06e3 A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06ef A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x06f4 A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x06fa A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x070a A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070b A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0777 A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0778 A[Catch:{ Exception -> 0x07fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x07d1 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:254:0x05a4] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07fe A[ExcHandler: all (th java.lang.Throwable), Splitter:B:45:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x084a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x085d  */
    /* JADX WARNING: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        mbx mbx;
        boolean z;
        ResultReceiver resultReceiver;
        lvt lvt;
        boolean z2;
        Exception exc;
        bzob bzob;
        Cursor cursor;
        Throwable th;
        int i;
        bzoq bzoq;
        ArrayList<bzok> arrayList;
        int i2;
        lvt lvt2;
        mbx mbx2;
        Throwable th2;
        Cursor cursor2;
        Throwable th3;
        String str;
        Throwable th4;
        this.f29243g = intent;
        if (ccls.m130535n()) {
            mbx = new mbx(this);
        } else {
            mbx = null;
        }
        if (this.f29244h == null) {
            this.f29244h = new mbx(this);
        }
        int i3 = 0;
        if (!new lvp(this).mo19644b()) {
            this.f29244h.mo19840c(3);
            if (ccls.f179387a.mo6606a().mo76323D()) {
                m22021a(mbx);
            }
            f29238b.mo25414c("Android Backup is not enabled, skip Mms backup", new Object[0]);
            m22023b(intent);
            return;
        } else if (this.f29242f.mo19682g(this)) {
            int i4 = Build.VERSION.SDK_INT;
            if (ccls.f179387a.mo6606a().mo76362x()) {
                try {
                    if (!m22022a(f29239c)) {
                        this.f29244h.mo19840c(5);
                        f29238b.mo25416d("User is not a G1 member which is required for mms backup, disabling backup", new Object[0]);
                        lvt.f33072a.mo19681g(this, false);
                        m22023b(intent);
                        return;
                    }
                } catch (gid | IOException e) {
                    this.f29244h.mo19840c(8);
                    f29238b.mo25415d("Error retrieving account state", e, new Object[0]);
                    m22023b(intent);
                    return;
                }
            }
            if (!ccls.f179387a.mo6606a().mo76360v()) {
                try {
                    if (m22022a(f29241e)) {
                        this.f29244h.mo19840c(6);
                        f29238b.mo25416d("User is a dasher account which is not supported", new Object[0]);
                        m22023b(intent);
                        return;
                    }
                } catch (gid | IOException e2) {
                    this.f29244h.mo19840c(8);
                    f29238b.mo25415d("Error retrieving account state", e2, new Object[0]);
                    m22023b(intent);
                    return;
                }
            }
            if (!ccls.f179387a.mo6606a().mo76361w()) {
                try {
                    if (m22022a(f29240d)) {
                        this.f29244h.mo19840c(7);
                        f29238b.mo25416d("User is a unicorn account which is not supported", new Object[0]);
                        m22023b(intent);
                        return;
                    }
                } catch (gid | IOException e3) {
                    this.f29244h.mo19840c(8);
                    f29238b.mo25415d("Error retrieving account state", e3, new Object[0]);
                    m22023b(intent);
                    return;
                }
            }
            lvt lvt3 = 1;
            lvt3 = 1;
            startForeground(9921, m22020a(true));
            nde nde = new nde(this, mbx, this);
            lvt lvt4 = lvt.f33072a;
            try {
                mbx mbx3 = nde.f35322j;
                if (mbx3 != null) {
                    bxvd a = lyu.m24685a();
                    bxvd da = mrz.f34496i.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mrz mrz = (mrz) da.f164949b;
                    mrz.f34499b = 1;
                    mrz.f34498a |= 1;
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    mqk mqk = (mqk) a.f164949b;
                    mrz mrz2 = (mrz) da.mo74062i();
                    mqk mqk2 = mqk.f34276G;
                    mrz2.getClass();
                    mqk.f34280C = mrz2;
                    mqk.f34285b |= 64;
                    mbx3.f33383c = mbx3.mo19820a();
                    mbx3.mo19833a(a, mqj.MMS_BACKUP, mbx3.f33383c);
                }
                if (ccls.m130524c()) {
                    nde.mo20485a(true);
                }
                lvt4.mo19683h(nde.f35319b, true);
                mce.m24860b(nde.f35319b);
                nde.mo20486b(false);
                lsp lsp = new lsp(nde.f35319b);
                if (!lsp.mo19593b()) {
                    nde.f35310a.mo25414c("Device is not initialized", new Object[0]);
                    lvw lvw = new lvw(snp.m35703a(1, 10), new rtj(nde.f35319b, "BackupDeviceState", true), srb.f45012a, 100);
                    lvw.mo19685a().get();
                    if (!lsp.mo19593b()) {
                        nde.f35310a.mo25414c("Starting KV backup of telephony to initialize backup", new Object[0]);
                        new lvp(nde.f35319b).mo19638a(new String[]{"com.android.providers.telephony"}, null, null, 0);
                        lvw.mo19685a().get();
                    }
                    nde.f35310a.mo25414c("Device is now initialized after waiting for backup", new Object[0]);
                }
                try {
                    lyg lyg = nde.f35325m;
                    bxvd da2 = bzol.f170830c.mo74144da();
                    long a2 = spn.m35843a(nde.f35319b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((bzol) da2.f164949b).f170833b = a2;
                    bxvd a3 = lyf.m24647a(nde.f35319b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzoa bzoa = (bzoa) a3.mo74062i();
                    bzoa.getClass();
                    ((bzol) da2.f164949b).f170832a = bzoa;
                    bzob = lyg.mo19735a((bzol) da2.mo74062i());
                } catch (chuw | gid | IOException | mbb | mbf | mbh e4) {
                    Throwable th5 = e4;
                    nde.f35310a.mo25415d("No existing backup", th5, new Object[0]);
                    bqye.m113758a(th5);
                    bzob = null;
                }
                if (bzob != null) {
                    nde.f35326n.mo19836a(false);
                    nde.f35328p = false;
                } else {
                    nde.f35326n.mo19836a(true);
                    nde.f35328p = true;
                    lyg lyg2 = nde.f35325m;
                    bxvd da3 = bzog.f170806c.mo74144da();
                    long a4 = spn.m35843a(nde.f35319b);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ((bzog) da3.f164949b).f170809b = a4;
                    bxvd a5 = lyf.m24647a(nde.f35319b);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzoa bzoa2 = (bzoa) a5.mo74062i();
                    bzoa2.getClass();
                    ((bzog) da3.f164949b).f170808a = bzoa2;
                    bzob = lyg2.mo19734a((bzog) da3.mo74062i());
                }
                nde.f35327o = new Timestamp(System.currentTimeMillis());
                if (bzob != null) {
                    bzoq a6 = nde.mo20482a(bzob);
                    ArrayList arrayList2 = new ArrayList();
                    lyg lyg3 = nde.f35325m;
                    bxvd da4 = bzon.f170839f.mo74144da();
                    String str2 = bzob.f170790a;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bzon bzon = (bzon) da4.f164949b;
                    str2.getClass();
                    bzon.f170842b = str2;
                    String str3 = a6.f170859a;
                    str3.getClass();
                    bzon.f170845e = str3;
                    bxvd a7 = lyf.m24647a(nde.f35319b);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bzoa bzoa3 = (bzoa) a7.mo74062i();
                    bzoa3.getClass();
                    ((bzon) da4.f164949b).f170841a = bzoa3;
                    bzoo a8 = lyg3.mo19736a((bzon) da4.mo74062i());
                    arrayList2.addAll(a8.f170848a);
                    while (!a8.f170849b.isEmpty()) {
                        lyg lyg4 = nde.f35325m;
                        bxvd da5 = bzon.f170839f.mo74144da();
                        String str4 = bzob.f170790a;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bzon bzon2 = (bzon) da5.f164949b;
                        str4.getClass();
                        bzon2.f170842b = str4;
                        String str5 = a6.f170859a;
                        str5.getClass();
                        bzon2.f170845e = str5;
                        String str6 = a8.f170849b;
                        str6.getClass();
                        bzon2.f170844d = str6;
                        bxvd a9 = lyf.m24647a(nde.f35319b);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bzoa bzoa4 = (bzoa) a9.mo74062i();
                        bzoa4.getClass();
                        ((bzon) da5.f164949b).f170841a = bzoa4;
                        a8 = lyg4.mo19736a((bzon) da5.mo74062i());
                        arrayList2.addAll(a8.f170848a);
                    }
                    HashSet hashSet = new HashSet();
                    try {
                        cursor = nde.mo20480a();
                        if (cursor != null) {
                            try {
                                cursor.moveToFirst();
                                bzoq = a6;
                                i = 0;
                            } catch (Throwable th6) {
                                th = th6;
                                srz.m36171a(cursor);
                                throw th;
                            }
                        } else {
                            bzoq = a6;
                            i = 0;
                        }
                        while (true) {
                            if (cursor == null) {
                                arrayList = arrayList2;
                                break;
                            }
                            try {
                                if (cursor.isAfterLast()) {
                                    arrayList = arrayList2;
                                    break;
                                }
                                int i5 = i + 1;
                                ArrayList arrayList3 = arrayList2;
                                bzoq = nde.mo20481a(cursor, String.format(Locale.US, "%06d_mms_backup", Integer.valueOf(i)), bzoq, bzob, hashSet);
                                arrayList2 = arrayList3;
                                i = i5;
                            } catch (Throwable th7) {
                                th = th7;
                                srz.m36171a(cursor);
                                throw th;
                            }
                        }
                        srz.m36171a(cursor);
                        nde.f35310a.mo25409a("Backing up mms attachments", new Object[0]);
                        nde.f35323k.mo17285a(nde.f35324l, 0);
                        Cursor a10 = nde.mo20480a();
                        if (a10 != null) {
                            try {
                                a10.moveToFirst();
                                i2 = 0;
                            } catch (Throwable th8) {
                                th2 = th8;
                                lvt3 = lvt4;
                                srz.m36171a(a10);
                                throw th2;
                            }
                        } else {
                            i2 = 0;
                        }
                        while (true) {
                            if (a10 == null) {
                                lvt2 = lvt4;
                                break;
                            }
                            try {
                                if (a10.isAfterLast()) {
                                    lvt2 = lvt4;
                                    break;
                                }
                                int i6 = a10.getInt(i3);
                                Uri.Builder buildUpon = Telephony.Mms.CONTENT_URI.buildUpon();
                                buildUpon.appendPath(String.valueOf(i6)).appendPath("part");
                                lvt build = buildUpon.build();
                                lvn lvn = nde.f35310a;
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("downloading mms id: ");
                                sb.append(i6);
                                lvn.mo25409a(sb.toString(), new Object[i3]);
                                try {
                                    cursor2 = nde.f35320c.query(build, nde.f35314h, null, null, "_id ASC");
                                    if (cursor2 == null) {
                                        build = lvt4;
                                    } else {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                while (true) {
                                                    String string = cursor2.getString(cursor2.getColumnIndex("ct"));
                                                    lvn lvn2 = nde.f35310a;
                                                    String valueOf = String.valueOf(string);
                                                    if (valueOf.length() == 0) {
                                                        try {
                                                            str = new String("attachment contentType = ");
                                                        } catch (Throwable th9) {
                                                            th3 = th9;
                                                        }
                                                    } else {
                                                        str = "attachment contentType = ".concat(valueOf);
                                                    }
                                                    lvn2.mo25409a(str, new Object[0]);
                                                    if (nde.m25957b(string)) {
                                                        int i7 = cursor2.getInt(cursor2.getColumnIndex("_id"));
                                                        String string2 = cursor2.getString(cursor2.getColumnIndex("cl"));
                                                        if (string2 != null) {
                                                            String encode = Uri.encode(mac.m24749a(string2, i7));
                                                            nde.f35310a.mo25409a("attachment filename: %s", encode);
                                                            hashSet.add(encode);
                                                            Iterator it = arrayList.iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    break;
                                                                }
                                                                lvt lvt5 = lvt4;
                                                                String str7 = ((bzok) it.next()).f170826a;
                                                                if (str7.substring(str7.lastIndexOf(47) + 1).equals(encode)) {
                                                                    build = lvt5;
                                                                    break;
                                                                }
                                                                lvt4 = lvt5;
                                                            }
                                                        } else {
                                                            build = lvt4;
                                                        }
                                                    } else {
                                                        build = lvt4;
                                                    }
                                                    if (!cursor2.moveToNext()) {
                                                        break;
                                                    }
                                                    lvt4 = build;
                                                }
                                                build = build;
                                            } else {
                                                build = lvt4;
                                            }
                                        } catch (Throwable th10) {
                                            th2 = th10;
                                            lvt3 = build;
                                            srz.m36171a(a10);
                                            throw th2;
                                        }
                                    }
                                    a10.moveToNext();
                                    srz.m36171a(cursor2);
                                    i2++;
                                    nde.f35323k.mo17285a(nde.f35324l, i2);
                                    lvt4 = build;
                                    i3 = 0;
                                } catch (Throwable th11) {
                                    th3 = th11;
                                    cursor2 = null;
                                    srz.m36171a(cursor2);
                                    throw th3;
                                }
                            } catch (Throwable th12) {
                                lvt3 = lvt4;
                                th2 = th12;
                                srz.m36171a(a10);
                                throw th2;
                            }
                        }
                        try {
                            srz.m36171a(a10);
                            ArrayList<String> arrayList4 = new ArrayList();
                            for (bzok bzok : arrayList) {
                                String str8 = bzok.f170826a;
                                if (!hashSet.contains(str8.substring(str8.lastIndexOf(47) + 1))) {
                                    arrayList4.add(nde.m25954a(str8));
                                }
                            }
                            if (ccly.m130639b()) {
                                if (ccme.f179443a.mo6606a().mo76370a()) {
                                    lyg lyg5 = nde.f35325m;
                                    bxvd da6 = bzoj.f170819d.mo74144da();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bzoj bzoj = (bzoj) da6.f164949b;
                                    if (!bzoj.f170822b.mo73666a()) {
                                        bzoj.f170822b = GeneratedMessageLite.m124021a(bzoj.f170822b);
                                    }
                                    bxsy.m123078a(arrayList4, bzoj.f170822b);
                                    String str9 = bzoq.f170859a;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    str9.getClass();
                                    ((bzoj) da6.f164949b).f170823c = str9;
                                    bxvd a11 = lyf.m24647a(nde.f35319b);
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bzoa bzoa5 = (bzoa) a11.mo74062i();
                                    bzoa5.getClass();
                                    ((bzoj) da6.f164949b).f170821a = bzoa5;
                                    lyg5.mo19741a((bzoj) da6.mo74062i());
                                    nde.mo20484a(bzoq, bzob);
                                    long j = Settings.Secure.getLong(nde.f35319b.getContentResolver(), "mms_backup_last_completed", 0);
                                    lvt3 = lvt2;
                                    lvt3.mo19669a(nde.f35319b, System.currentTimeMillis());
                                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                    long time = nde.f35327o == null ? timestamp.getTime() - nde.f35327o.getTime() : 0;
                                    long time2 = j == 0 ? timestamp.getTime() - j : -1;
                                    mbx mbx4 = nde.f35326n;
                                    boolean z3 = nde.f35328p;
                                    long j2 = time / 1000;
                                    long j3 = time2 / 1000;
                                    if (!ccls.m130540s()) {
                                        bxvd a12 = lyu.m24685a();
                                        bxvd da7 = mrz.f34496i.mo74144da();
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        mrz mrz3 = (mrz) da7.f164949b;
                                        mrz3.f34499b = 8;
                                        int i8 = mrz3.f34498a | 1;
                                        mrz3.f34498a = i8;
                                        mrz3.f34503f = (!z3 ? 3 : 2) - 1;
                                        int i9 = i8 | 16;
                                        mrz3.f34498a = i9;
                                        int i10 = i9 | 2;
                                        mrz3.f34498a = i10;
                                        mrz3.f34500c = j2;
                                        mrz3.f34498a = i10 | 4;
                                        mrz3.f34501d = j3;
                                        if (a12.f164950c) {
                                            a12.mo74035c();
                                            a12.f164950c = false;
                                        }
                                        mqk mqk3 = (mqk) a12.f164949b;
                                        mrz mrz4 = (mrz) da7.mo74062i();
                                        mqk mqk4 = mqk.f34276G;
                                        mrz4.getClass();
                                        mqk3.f34280C = mrz4;
                                        mqk3.f34285b |= 64;
                                        mbx4.mo19833a(a12, mqj.MMS_BACKUP, mbx4.f33383c);
                                    }
                                    mbx2 = nde.f35322j;
                                    if (mbx2 == null) {
                                        bxvd a13 = lyu.m24685a();
                                        bxvd da8 = mrz.f34496i.mo74144da();
                                        if (da8.f164950c) {
                                            da8.mo74035c();
                                            da8.f164950c = false;
                                        }
                                        mrz mrz5 = (mrz) da8.f164949b;
                                        mrz5.f34499b = 2;
                                        mrz5.f34498a |= 1;
                                        if (a13.f164950c) {
                                            a13.mo74035c();
                                            a13.f164950c = false;
                                        }
                                        mqk mqk5 = (mqk) a13.f164949b;
                                        mrz mrz6 = (mrz) da8.mo74062i();
                                        mqk mqk6 = mqk.f34276G;
                                        mrz6.getClass();
                                        mqk5.f34280C = mrz6;
                                        mqk5.f34285b |= 64;
                                        mbx2.mo19833a(a13, mqj.MMS_BACKUP, mbx2.f33383c);
                                    }
                                    mce.m24860b(nde.f35319b);
                                    lvt3.mo19683h(nde.f35319b, false);
                                    z = true;
                                    if (ccmb.f179440a.mo6606a().mo76368a() && !z) {
                                        m22023b(intent);
                                        return;
                                    }
                                    resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                                    if (resultReceiver != null) {
                                        resultReceiver.send(-1, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                            for (String str10 : arrayList4) {
                                lyg lyg6 = nde.f35325m;
                                bxvd da9 = bzoi.f170814d.mo74144da();
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                bzoi bzoi = (bzoi) da9.f164949b;
                                str10.getClass();
                                bzoi.f170817b = str10;
                                String str11 = bzoq.f170859a;
                                str11.getClass();
                                bzoi.f170818c = str11;
                                bxvd a14 = lyf.m24647a(nde.f35319b);
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                bzoa bzoa6 = (bzoa) a14.mo74062i();
                                bzoa6.getClass();
                                ((bzoi) da9.f164949b).f170816a = bzoa6;
                                lyg6.mo19740a((bzoi) da9.mo74062i());
                            }
                            nde.mo20484a(bzoq, bzob);
                            long j4 = Settings.Secure.getLong(nde.f35319b.getContentResolver(), "mms_backup_last_completed", 0);
                            lvt3 = lvt2;
                            try {
                                lvt3.mo19669a(nde.f35319b, System.currentTimeMillis());
                                Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
                                if (nde.f35327o == null) {
                                }
                                if (j4 == 0) {
                                }
                                mbx mbx42 = nde.f35326n;
                                boolean z32 = nde.f35328p;
                                long j22 = time / 1000;
                                long j32 = time2 / 1000;
                                if (!ccls.m130540s()) {
                                }
                                mbx2 = nde.f35322j;
                                if (mbx2 == null) {
                                }
                                mce.m24860b(nde.f35319b);
                                lvt3.mo19683h(nde.f35319b, false);
                                z = true;
                            } catch (Exception e5) {
                                e = e5;
                                lvt = lvt3;
                                exc = e;
                                try {
                                    z2 = true;
                                    try {
                                        nde.f35326n.mo19840c(1);
                                        try {
                                            mab.m24748a(nde.f35319b, exc, ccls.m130538q());
                                            nde.f35310a.mo25415d("Error when backing up", exc, new Object[0]);
                                            mce.m24860b(nde.f35319b);
                                            lvt.mo19683h(nde.f35319b, false);
                                            z = false;
                                        } catch (Throwable th13) {
                                            z2 = false;
                                            mce.m24860b(nde.f35319b);
                                            lvt.mo19683h(nde.f35319b, false);
                                            z = z2;
                                            if (ccmb.f179440a.mo6606a().mo76368a()) {
                                            }
                                            resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                                            if (resultReceiver != null) {
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        mce.m24860b(nde.f35319b);
                                        lvt.mo19683h(nde.f35319b, false);
                                        z = z2;
                                        if (ccmb.f179440a.mo6606a().mo76368a()) {
                                        }
                                        resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                                        if (resultReceiver != null) {
                                        }
                                    }
                                } catch (Throwable th15) {
                                    z2 = true;
                                    mce.m24860b(nde.f35319b);
                                    lvt.mo19683h(nde.f35319b, false);
                                    z = z2;
                                    if (ccmb.f179440a.mo6606a().mo76368a()) {
                                    }
                                    resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                                    if (resultReceiver != null) {
                                    }
                                }
                                if (ccmb.f179440a.mo6606a().mo76368a()) {
                                }
                                resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                                if (resultReceiver != null) {
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            lvt = lvt2;
                            exc = e;
                            z2 = true;
                            nde.f35326n.mo19840c(1);
                            mab.m24748a(nde.f35319b, exc, ccls.m130538q());
                            nde.f35310a.mo25415d("Error when backing up", exc, new Object[0]);
                            mce.m24860b(nde.f35319b);
                            lvt.mo19683h(nde.f35319b, false);
                            z = false;
                            if (ccmb.f179440a.mo6606a().mo76368a()) {
                            }
                            resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                            if (resultReceiver != null) {
                            }
                        } catch (Throwable th16) {
                        }
                        if (ccmb.f179440a.mo6606a().mo76368a()) {
                            m22023b(intent);
                            return;
                        }
                        resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
                        if (resultReceiver != null) {
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        cursor = null;
                        srz.m36171a(cursor);
                        throw th;
                    }
                } else {
                    nde.f35326n.mo19840c(9);
                    throw new mae("Mms backup is null");
                }
            } catch (Exception e7) {
                exc = e7;
                lvt = lvt4;
            } catch (Throwable th18) {
            }
        } else {
            this.f29244h.mo19840c(2);
            if (ccls.f179387a.mo6606a().mo76324E()) {
                m22021a(mbx);
            }
            f29238b.mo25414c("User has not enabled MMS Backup", new Object[0]);
            m22023b(intent);
            return;
        }
        throw th4;
    }
}
