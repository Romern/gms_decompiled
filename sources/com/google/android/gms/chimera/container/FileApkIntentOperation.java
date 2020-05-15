package com.google.android.gms.chimera.container;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.FileApkChimeraService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FileApkIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final bnkd f29975a = bndu.m109108a(3, 3);

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ExternalFileApkChimeraService extends Service {
        public final IBinder onBind(Intent intent) {
            return null;
        }

        public final int onStartCommand(Intent intent, int i, int i2) {
            String str;
            boolean equals;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str != null && (!(equals = "com.google.android.gms.chimera.container.STAGE_MODULE_APKS".equals(str)) ? "com.google.android.gms.chimera.container.CHIMERA_LOG".equals(str) : !FileApkIntentOperation.m22400a(intent) || FileApkIntentOperation.m22399a(this, intent))) {
                Intent startIntent = IntentOperation.getStartIntent(this, FileApkIntentOperation.class, str);
                if (startIntent != null) {
                    startIntent.putExtras(intent);
                    startService(startIntent);
                } else if (equals) {
                    FileApkIntentOperation.m22402b(intent);
                }
            }
            stopSelf(i2);
            return 2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ExternalFileApkService extends qlb {
    }

    /* renamed from: a */
    public static void m22392a(Context context) {
        m22395a(context, (String) null, (ResultReceiver) null, new Intent());
    }

    /* renamed from: b */
    private static ComponentName m22401b(Context context, Intent intent) {
        String name = ExternalFileApkService.class.getName();
        if (cdjl.m133597c() && "com.google.android.gms.chimera.container.STAGE_MODULE_APKS".equals(intent.getAction())) {
            name = FileApkChimeraService.FileApkService.class.getName();
        }
        intent.setClassName("com.google.android.gms", name);
        try {
            return context.startService(intent);
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e("FileApkIntOp", e.toString());
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(djz, java.io.File, java.io.File, bxvd, boolean):void
     arg types: [djz, java.io.File, java.io.File, bxvd, int]
     candidates:
      dgv.a(bxvd, java.io.File, dfz, java.util.Set, dkw):boolean
      dgv.a(dkw, java.util.Set, boolean, boolean, dks):boolean
      dgv.a(djz, java.io.File, java.io.File, bxvd, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0449, code lost:
        if (com.google.android.gms.chimera.container.FileApkIntentOperation.f29975a.mo67271d(r2) != false) goto L_0x044b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x02c8 A[SYNTHETIC] */
    public final void onHandleIntent(Intent intent) {
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        qmo d;
        int i;
        Intent intent2 = intent;
        String action = intent.getAction();
        bmzs.m108696a(action);
        int hashCode = action.hashCode();
        int i2 = 1;
        if (hashCode != -2053861313) {
            if (hashCode != -1492206664) {
                if (hashCode == -979854223 && action.equals("com.google.android.gms.chimera.container.STAGE_MODULE_APKS")) {
                    c = 1;
                    if (c == 0) {
                        bnic bnic = null;
                        if (c == 1) {
                            boolean booleanExtra = intent2.getBooleanExtra("DEXOPT_ALL_MODULES", false);
                            boolean booleanExtra2 = intent2.getBooleanExtra("ON_BOOT_OR_UPGRADE", false);
                            String stringExtra = intent2.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
                            dgv a = dgv.m8427a(this);
                            boolean booleanValue = ((Boolean) qlj.f41642a.mo58455c()).booleanValue();
                            boolean a2 = dfq.m8314a().mo8862a();
                            if (m22400a(intent)) {
                                if (m22399a(this, intent)) {
                                    z3 = true;
                                    z2 = false;
                                    i2 = 0;
                                } else {
                                    return;
                                }
                            } else if (booleanExtra2) {
                                z3 = !booleanValue;
                                z2 = true;
                            } else {
                                z3 = false;
                                z2 = false;
                            }
                            boolean z4 = booleanExtra;
                            while (true) {
                                if (z3) {
                                    z4 |= a.mo8979a((dks) null);
                                } else if (i2 != 0) {
                                    qmc.m32416a();
                                    z4 = a.mo8985a(qmc.m32431d(this), (dks) null, z2) | z4;
                                    i2 = 0;
                                } else if (a2) {
                                    return;
                                } else {
                                    if (z4 || booleanValue) {
                                        if (booleanExtra) {
                                            int i3 = Build.VERSION.SDK_INT;
                                            int i4 = Build.VERSION.SDK_INT;
                                        }
                                        int i5 = Build.VERSION.SDK_INT;
                                        return;
                                    }
                                    return;
                                }
                                if (a2) {
                                    a.mo8977a(z3);
                                }
                                qmc.m32424a(false);
                                synchronized (FileApkIntentOperation.class) {
                                    try {
                                        djz f = dfy.m8329a(this).mo8898f();
                                        ArrayList<String> arrayList = new ArrayList(((bndd) f29975a).f131478b);
                                        for (String str : f29975a.mo67316o()) {
                                            if (f.mo9172a(str) != null) {
                                                arrayList.add(str);
                                            }
                                        }
                                        for (String str2 : arrayList) {
                                            m22397a(str2, 0);
                                        }
                                        if (stringExtra != null) {
                                            if (f29975a.mo67271d(stringExtra)) {
                                                m22397a(stringExtra, -1);
                                            }
                                        }
                                    } catch (InvalidConfigException e) {
                                        if (stringExtra != null) {
                                        }
                                    } catch (Throwable th) {
                                        if (stringExtra != null && f29975a.mo67271d(stringExtra)) {
                                            m22397a(stringExtra, -1);
                                        }
                                        throw th;
                                    }
                                }
                                z3 = false;
                            }
                        } else if (c != 2) {
                            String valueOf = String.valueOf(action);
                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
                        } else {
                            try {
                                djz f2 = dfy.m8329a(this).mo8898f();
                                qnd a3 = qnd.m32471a(this);
                                if (a3.mo8638b()) {
                                    Log.e("ModuleSetMgr", "not migrated with user locked");
                                } else {
                                    synchronized (a3.f41765e) {
                                        d = a3.mo24125d();
                                    }
                                    bnia j = bnic.m109500j();
                                    bxwc bxwc = a3.mo24127g().f41708b;
                                    int size = bxwc.size();
                                    for (int i6 = 0; i6 < size; i6++) {
                                        j.mo67629b(qnm.m32494a((qmt) bxwc.get(i6)));
                                    }
                                    bxwc bxwc2 = d.f41728c;
                                    int size2 = bxwc2.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        bxwc bxwc3 = ((qmn) bxwc2.get(i7)).f41723a;
                                        int size3 = bxwc3.size();
                                        int i8 = 0;
                                        while (true) {
                                            i = i7 + 1;
                                            if (i8 >= size3) {
                                                break;
                                            }
                                            qmm qmm = (qmm) bxwc3.get(i8);
                                            if (!qmm.f41717c) {
                                                qmk qmk = qmm.f41716b;
                                                if (qmk == null) {
                                                    qmk = qmk.f41705d;
                                                }
                                                bxwc bxwc4 = qmk.f41708b;
                                                int size4 = bxwc4.size();
                                                for (int i9 = 0; i9 < size4; i9++) {
                                                    j.mo67629b(qnm.m32494a((qmt) bxwc4.get(i9)));
                                                }
                                            }
                                            i8++;
                                        }
                                        i7 = i;
                                    }
                                    bnic a4 = qnm.m32491a(dgv.m8427a(a3.f12990a).mo8990h());
                                    qnl a5 = a3.mo24121a(d, a4, bnon.f131923a, true, false);
                                    if (a5 == null) {
                                        Log.w("ModuleSetMgr", "failed to compute pending module sets");
                                        bnic = j.mo67751a();
                                    } else {
                                        String valueOf2 = String.valueOf(a4);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 8);
                                        sb.append("Staged: ");
                                        sb.append(valueOf2);
                                        sb.toString();
                                        String valueOf3 = String.valueOf(a5.f41779c.keySet());
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
                                        sb2.append("Wanted: ");
                                        sb2.append(valueOf3);
                                        sb2.toString();
                                        C1223np npVar = new C1223np(a5.f41779c.size());
                                        bnrd a6 = a5.f41779c.keySet().iterator();
                                        while (a6.hasNext()) {
                                            dhs dhs = (dhs) a6.next();
                                            if (!a4.contains(dhs)) {
                                                npVar.put(dhs.f13182a, new qna(dhs));
                                            }
                                        }
                                        bnrd a7 = a4.iterator();
                                        while (a7.hasNext()) {
                                            dhs dhs2 = (dhs) a7.next();
                                            int a8 = npVar.mo15616a(dhs2.f13182a);
                                            if (a8 >= 0) {
                                                qna qna = (qna) npVar.mo15621c(a8);
                                                bmzs.m108698a(dhs2.f13182a.equals(qna.f41749a.f13182a));
                                                dhs dhs3 = qna.f41750b;
                                                if (dhs3 == null || qnm.m32505a(qna.f41749a.f13183b, dhs3.f13183b, dhs2.f13183b)) {
                                                    qna.f41750b = dhs2;
                                                }
                                            }
                                        }
                                        for (int i10 = 0; i10 < npVar.f26809h; i10++) {
                                            dhs dhs4 = ((qna) npVar.mo15621c(i10)).f41750b;
                                            if (dhs4 != null) {
                                                j.mo67629b(dhs4);
                                            }
                                        }
                                        bnic = j.mo67751a();
                                    }
                                }
                                if (bnic == null) {
                                    Log.w("FileApkIntOp", "failed to compute retained apks, skipping cleanup");
                                    return;
                                }
                                dgv a9 = dgv.m8427a(this);
                                if (!a9.mo8638b()) {
                                    synchronized (dgv.f13087f) {
                                        File file = new File(a9.f12990a.getFilesDir(), "chimera-modules");
                                        if (file.isDirectory()) {
                                            dhb.m8476a(file);
                                        }
                                        File file2 = new File(dft.m8317a(a9.f12990a), "chimera-module-root");
                                        if (file2.isDirectory()) {
                                            dhb.m8476a(file2);
                                        }
                                        aytw.m84814b();
                                        if (aytw.m84815b(a9.f12990a) && a9.f12993d) {
                                            dgv.f13086e.writeLock().lock();
                                            try {
                                                dge.m8386a(dge.m8385a(a9.f12990a), "current_fileapks.pb", "m");
                                                dgv.f13086e.writeLock().unlock();
                                            } catch (Throwable th2) {
                                                dgv.f13086e.writeLock().unlock();
                                                throw th2;
                                            }
                                        }
                                        File d2 = a9.mo8986d();
                                        if (d2 != null) {
                                            if (d2.isDirectory()) {
                                                dgv.f13086e.readLock().lock();
                                                dgo j2 = a9.mo8992j();
                                                dgv.f13086e.readLock().unlock();
                                                File file3 = j2.f13073b;
                                                dke dke = j2.f13074c;
                                                bxvd bxvd = (bxvd) dke.mo74142c(5);
                                                bxvd.mo73625a((bxvk) dke);
                                                List<dkd> unmodifiableList = Collections.unmodifiableList(((dke) bxvd.f164949b).f13394c);
                                                ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
                                                dgz dgz = new dgz();
                                                for (dkd dkd : unmodifiableList) {
                                                    int a10 = dkc.m8723a(dkd.f13387g);
                                                    if (a10 != 0) {
                                                        if (a10 == 3) {
                                                            Iterator it = dkd.f13385e.iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    break;
                                                                }
                                                                dkf dkf = (dkf) it.next();
                                                                if (!dkf.f13405g.isEmpty()) {
                                                                    if (!dkf.f13406h.isEmpty()) {
                                                                        dgz.f13090a = dkf.f13405g;
                                                                        dgz.f13091b = dkf.f13406h;
                                                                        if (!bnic.contains(dgz)) {
                                                                            String valueOf4 = String.valueOf(dgz);
                                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 19);
                                                                            sb3.append("Obsolete download: ");
                                                                            sb3.append(valueOf4);
                                                                            sb3.toString();
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                String valueOf5 = String.valueOf(dkf.f13402d);
                                                                dgz.f13091b = valueOf5;
                                                                dgz.f13090a = valueOf5;
                                                                if (!bnic.contains(dgz)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList2.add(dkd);
                                                }
                                                if (arrayList2.size() != unmodifiableList.size()) {
                                                    if (bxvd.f164950c) {
                                                        bxvd.mo74035c();
                                                        bxvd.f164950c = false;
                                                    }
                                                    dke dke2 = dke.f13390f;
                                                    ((dke) bxvd.f164949b).f13394c = bxvk.m124030de();
                                                    bxvd.mo74075k(arrayList2);
                                                }
                                                a9.mo8976a(f2, d2, file3, bxvd, true);
                                            }
                                        }
                                        Log.w("FileApkMgr", "Main modules directory could not be created.");
                                    }
                                    return;
                                }
                                return;
                            } catch (InvalidConfigException e2) {
                                return;
                            }
                        }
                    } else {
                        int intExtra = intent2.getIntExtra("EVENT_CODE", 0);
                        if (intExtra == 0) {
                            Log.e("FileApkIntOp", "eventcode==0");
                            return;
                        }
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("EVENT_PROTO_BYTES");
                        if (byteArrayExtra == null) {
                            Log.e("FileApkIntOp", "eventProtoBytes==null");
                            return;
                        }
                        qlp.m32393a();
                        if (intExtra == 19) {
                            if (cdjh.f180979a.mo6606a().mo77751p()) {
                                try {
                                    bpuf bpuf = ((bpvf) bxvk.m124016a(bpvf.f139321t, byteArrayExtra, bxus.m123743b())).f139331i;
                                    if (bpuf == null) {
                                        bpuf = bpuf.f139232f;
                                    }
                                    int a11 = bpue.m112288a(bpuf.f139235b);
                                    if (a11 != 0) {
                                        i2 = a11;
                                    }
                                    int i11 = i2 - 1;
                                    if (i11 == 70 || i11 == 71) {
                                        z = cdjh.f180979a.mo6606a().mo77753r();
                                    } else {
                                        qwo a12 = sfa.m35133a().mo25463b(this).mo24335a(byteArrayExtra);
                                        a12.mo24329b("chimera");
                                        a12.mo24328b(intExtra);
                                        a12.mo24327b();
                                        return;
                                    }
                                } catch (bxwf e3) {
                                    String valueOf6 = String.valueOf(e3);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 29);
                                    sb4.append("Failed to parse GCoreLogData:");
                                    sb4.append(valueOf6);
                                    Log.e("ChmraDebugLogger", sb4.toString());
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (intExtra == 22) {
                            z = cdjh.f180979a.mo6606a().mo77752q();
                        } else {
                            return;
                        }
                        if (!z) {
                            return;
                        }
                        qwo a122 = sfa.m35133a().mo25463b(this).mo24335a(byteArrayExtra);
                        a122.mo24329b("chimera");
                        a122.mo24328b(intExtra);
                        a122.mo24327b();
                        return;
                    }
                }
            } else if (action.equals("com.google.android.gms.chimera.container.CHIMERA_LOG")) {
                c = 0;
                if (c == 0) {
                }
            }
        } else if (action.equals("com.google.android.chimera.FileApkManager.DELETE_UNUSED_FILEAPKS")) {
            c = 2;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    public static void m22393a(Context context, int i, byte[] bArr) {
        Intent intent = new Intent("com.google.android.gms.chimera.container.CHIMERA_LOG");
        intent.putExtra("EVENT_CODE", i - 1);
        intent.putExtra("EVENT_PROTO_BYTES", bArr);
        m22401b(context, intent);
    }

    /* renamed from: a */
    public static void m22394a(Context context, String str, ResultReceiver resultReceiver) {
        m22395a(context, str, resultReceiver, new Intent().putExtra("STAGE_FILE_APKS_MODULE_ID", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver));
    }

    /* renamed from: a */
    private static void m22395a(Context context, String str, ResultReceiver resultReceiver, Intent intent) {
        if (m22401b(context, intent.setAction("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").setPackage("com.google.android.gms")) == null && str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("Staging ");
            sb.append(str);
            sb.append(" failed, notifying receiver.");
            sb.toString();
            if (resultReceiver != null) {
                resultReceiver.send(-1, null);
            }
        }
    }

    /* renamed from: b */
    static void m22402b(Intent intent) {
        String stringExtra = intent.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        if (resultReceiver != null && stringExtra != null) {
            synchronized (FileApkIntentOperation.class) {
                f29975a.mo67310c(stringExtra, resultReceiver);
            }
            resultReceiver.send(-1, null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m22396a(Context context, boolean z) {
        m22395a(context, (String) null, (ResultReceiver) null, new Intent().putExtra("DEXOPT_ALL_MODULES", z).putExtra("ON_BOOT_OR_UPGRADE", true));
    }

    /* renamed from: a */
    private static void m22397a(String str, int i) {
        List<ResultReceiver> b = f29975a.mo67126b(str);
        if (!b.isEmpty()) {
            int size = b.size();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("Staging ");
            sb.append(str);
            sb.append(" completed, notifying ");
            sb.append(size);
            sb.append(" receiver(s).");
            sb.toString();
            for (ResultReceiver resultReceiver : b) {
                resultReceiver.send(i, null);
            }
        }
    }

    /* renamed from: a */
    public static void m22398a(boolean z, Context context, String str, ResultReceiver resultReceiver) {
        if (!cdjl.m133596b() || !cdjl.m133597c() || z) {
            m22395a(context, str, resultReceiver, new Intent().putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver));
        } else {
            qly.m32408a(context, new Intent("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver), -1);
        }
    }

    /* renamed from: a */
    static boolean m22399a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        if (stringExtra == null || resultReceiver == null) {
            return false;
        }
        synchronized (FileApkIntentOperation.class) {
            try {
                if (dfy.m8329a(context).mo8898f().mo9172a(stringExtra) == null) {
                    f29975a.mo67268a(stringExtra, resultReceiver);
                    return true;
                }
                StringBuilder sb = new StringBuilder(stringExtra.length() + 46);
                sb.append("Staging ");
                sb.append(stringExtra);
                sb.append(" already complete, notifying receiver.");
                sb.toString();
                resultReceiver.send(0, null);
                return false;
            } catch (InvalidConfigException e) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m22400a(Intent intent) {
        if (!cdjl.m133596b() || !intent.hasExtra("STAGE_FILE_APKS_ASSET_NAME") || !intent.hasExtra("STAGE_FILE_APKS_RESULT_RECEIVER")) {
            return intent.hasExtra("STAGE_FILE_APKS_MODULE_ID") && intent.hasExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        }
        return true;
    }
}
