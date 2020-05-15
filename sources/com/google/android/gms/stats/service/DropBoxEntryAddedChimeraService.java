package com.google.android.gms.stats.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DropBoxEntryAddedChimeraService extends TracingIntentService {

    /* renamed from: a */
    private qws f108294a;

    /* renamed from: b */
    private qxq f108295b;

    /* renamed from: c */
    private aseq f108296c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Receiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES");
                intent2.setPackage(context.getPackageName());
                context.startService(intent2);
            }
        }
    }

    public DropBoxEntryAddedChimeraService() {
        super("DropBoxEntryAddedChimeraService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bd, code lost:
        r3 = r13;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r9.mo49091a(r10, r11, r12, (p000.calu) r1, r16, r17, r18, r19, p000.cgsu.m146907b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d1, code lost:
        if (p000.cgth.m146983c() != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d7, code lost:
        if (p000.cgth.m146986f() != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d9, code lost:
        p000.asfs.m73998a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01dc, code lost:
        r8.f108295b.mo24388e();
        r0 = r8.f108294a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e3, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e5, code lost:
        r0.mo24336a(r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01eb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ec, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f0, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0229, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022a, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = r9.mo49090a(r24, r3, r5, r8.f108295b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017e, code lost:
        if (r0 != null) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0180, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0188, code lost:
        if (r0.f175211i.size() != 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        r8.f108295b.mo24388e();
        r0 = r8.f108294a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0191, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0193, code lost:
        r0.mo24336a(r13, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019d, code lost:
        if (p000.cgth.m146983c() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a4, code lost:
        if (p000.cgth.m146986f() != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        p000.asfs.m73998a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r11 = r8.f108294a;
        r12 = r8.f108295b;
        r1 = (p000.bxvd) r0.mo74142c(5);
        r1.mo73625a((p000.bxvk) r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0229 A[ExcHandler: all (th java.lang.Throwable), PHI: r13 10  PHI: (r13v2 long) = (r13v0 long), (r13v0 long), (r13v0 long), (r13v0 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v0 long), (r13v0 long), (r13v0 long) binds: [B:9:0x002a, B:28:0x009c, B:37:0x00d7, B:68:0x0149, B:81:0x0175, B:90:0x0199, B:98:0x01a9, B:96:0x01a6, B:97:?, B:57:0x011e, B:58:?, B:44:0x00f3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:28:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m92996a() {
        long j;
        String str;
        qws qws;
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        rjx rjx;
        long j2;
        if (!stu.m36328n() && cgsx.f187685a.mo6606a().mo84431a() && ashd.m74118a()) {
            asfl h = asfl.m73964h();
            if (cgsf.m146815b()) {
                String str2 = h.f88779a;
                long j3 = 10;
                try {
                    this.f108294a = new qws(this, null, null);
                    this.f108295b = new qxq(this.f108294a, "PLATFORM_STATS_COUNTERS", 1024);
                    List arrayList = new ArrayList();
                    if (cgtv.m147055b()) {
                        list = arrayList;
                        z3 = false;
                        z2 = false;
                        z = false;
                    } else {
                        boolean b = cgub.m147064b();
                        boolean c = ashd.m74124c();
                        this.f108296c = new aseq();
                        List a = aseq.m73886a(this);
                        boolean z4 = true;
                        if (!cguz.m147112c() || a.isEmpty() || (cgsl.m146894b() && !c)) {
                            z4 = false;
                        }
                        if (c || z4 || b) {
                            z = b;
                            z2 = c;
                            list = a;
                            z3 = z4;
                        } else {
                            this.f108295b.mo24388e();
                            qws qws2 = this.f108294a;
                            if (qws2 != null) {
                                qws2.mo24336a(10, TimeUnit.SECONDS);
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        SharedPreferences sharedPreferences = getSharedPreferences(str2, 0);
                        long j4 = sharedPreferences.getLong(":lastRunMsec", -1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j4 >= cgty.f187761a.mo6606a().mo84498a()) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(":lastRunMsec", currentTimeMillis);
                            edit.apply();
                            if (currentTimeMillis < j4) {
                                this.f108295b.mo24388e();
                                qws qws3 = this.f108294a;
                                if (qws3 != null) {
                                    qws3.mo24336a(10, TimeUnit.SECONDS);
                                    return;
                                }
                                return;
                            }
                            if (cgtv.m147055b()) {
                                rjx a2 = avtz.m79336a(this, new avty());
                                aucb k = a2.mo24755k(h.f88780b);
                                try {
                                    aucu.m76783a(k, 10000, TimeUnit.MILLISECONDS);
                                    if (k.mo50384b()) {
                                        if (k.mo50386d() != null && ((Boolean) k.mo50386d()).booleanValue()) {
                                            rjx = a2;
                                        }
                                    }
                                    this.f108295b.mo24388e();
                                    qws qws4 = this.f108294a;
                                    if (qws4 != null) {
                                        qws4.mo24336a(10, TimeUnit.SECONDS);
                                        return;
                                    }
                                    return;
                                } catch (ExecutionException | TimeoutException e) {
                                    this.f108295b.mo24388e();
                                    qws qws5 = this.f108294a;
                                    if (qws5 != null) {
                                        qws5.mo24336a(10, TimeUnit.SECONDS);
                                        return;
                                    }
                                    return;
                                } catch (InterruptedException e2) {
                                    Thread.currentThread().interrupt();
                                    this.f108295b.mo24388e();
                                    qws qws6 = this.f108294a;
                                    if (qws6 != null) {
                                        qws6.mo24336a(10, TimeUnit.SECONDS);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                rjx = null;
                            }
                            DropBoxManager dropBoxManager = (DropBoxManager) getSystemService("dropbox");
                            long j5 = j4;
                            while (true) {
                                if (j5 < currentTimeMillis) {
                                    DropBoxManager.Entry nextEntry = dropBoxManager.getNextEntry(null, j5);
                                    if (nextEntry == null) {
                                        j2 = j3;
                                        break;
                                    }
                                    String tag = nextEntry.getTag();
                                    nextEntry.close();
                                    if (tag != null) {
                                        if (!tag.isEmpty() && !tag.equals("platform_stats_bookmark")) {
                                            break;
                                        }
                                        j = j3;
                                        str = str2;
                                    } else {
                                        j = j3;
                                        str = str2;
                                    }
                                    try {
                                        str2 = str;
                                        j5 = nextEntry.getTimeMillis();
                                        j3 = j;
                                    } catch (asel e3) {
                                        try {
                                            this.f108295b.mo24383c(String.valueOf(str).concat("CollectionException")).mo24359a();
                                            Log.e("DropBoxEntryAddedChiSer", "Fail to handle dropbox entry added.");
                                            this.f108295b.mo24388e();
                                            qws = this.f108294a;
                                            if (qws == null) {
                                                qws.mo24336a(j, TimeUnit.SECONDS);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            this.f108295b.mo24388e();
                                            qws qws7 = this.f108294a;
                                            if (qws7 != null) {
                                                qws7.mo24336a(j, TimeUnit.SECONDS);
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    j2 = j3;
                                    break;
                                }
                            }
                            this.f108295b.mo24388e();
                            qws qws8 = this.f108294a;
                            if (qws8 != null) {
                                qws8.mo24336a(j2, TimeUnit.SECONDS);
                                return;
                            }
                            return;
                        }
                        this.f108295b.mo24388e();
                        qws qws9 = this.f108294a;
                        if (qws9 != null) {
                            qws9.mo24336a(10, TimeUnit.SECONDS);
                        }
                    } catch (asel e4) {
                        str = str2;
                        j = j3;
                        this.f108295b.mo24383c(String.valueOf(str).concat("CollectionException")).mo24359a();
                        Log.e("DropBoxEntryAddedChiSer", "Fail to handle dropbox entry added.");
                        this.f108295b.mo24388e();
                        qws = this.f108294a;
                        if (qws == null) {
                        }
                    } catch (Throwable th2) {
                    }
                } catch (asel e5) {
                    j = j3;
                    str = str2;
                    this.f108295b.mo24383c(String.valueOf(str).concat("CollectionException")).mo24359a();
                    Log.e("DropBoxEntryAddedChiSer", "Fail to handle dropbox entry added.");
                    this.f108295b.mo24388e();
                    qws = this.f108294a;
                    if (qws == null) {
                    }
                } catch (Throwable th22) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if ("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES".equals(intent.getAction())) {
            m92996a();
        }
    }
}
