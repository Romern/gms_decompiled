package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsCoreStatsChimeraService extends Service {

    /* renamed from: b */
    private static final Comparator f30352b = new sko();

    /* renamed from: a */
    sns f30353a;

    /* renamed from: c */
    private Handler f30354c;

    /* renamed from: a */
    public static final long m22710a(bpvw bpvw) {
        if ((bpvw.f139437a & 512) == 0) {
            return 0;
        }
        double d = (double) bpvw.f139444h;
        double d2 = bpvw.f139447k;
        Double.isNaN(d);
        return Math.round(d * d2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027c A[Catch:{ NumberFormatException -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x028d A[Catch:{ NumberFormatException -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0211  */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c;
        Collection<ModuleManager.ModuleInfo> collection;
        ModuleManager.ConfigInfo configInfo;
        long j;
        long j2;
        long j3;
        char c2;
        ArrayList arrayList;
        int i;
        String str;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        ssb ssb = new ssb(printWriter2, "  ");
        ssb.println("GMS Core Stats:");
        List<ApplicationInfo> installedApplications = getPackageManager().getInstalledApplications(128);
        ssb.mo26034a();
        ssb.println("Client jar version:");
        ssb.mo26034a();
        Collections.sort(installedApplications, f30352b);
        ssb.mo26034a();
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        int i2 = -2;
        while (true) {
            c = 65535;
            if (!it.hasNext()) {
                break;
            }
            ApplicationInfo next = it.next();
            if (next.metaData != null) {
                i = next.metaData.getInt("com.google.android.gms.version", -1);
            } else {
                i = -2;
            }
            if (!(i == -2 || i == -1)) {
                if (i2 != i) {
                    ssb.mo26035b();
                    if (i == -2) {
                        str = "EMPTY_METADATA:";
                    } else if (i != -1) {
                        StringBuilder sb = new StringBuilder(12);
                        sb.append(i);
                        sb.append(":");
                        str = String.valueOf(sb.toString());
                    } else {
                        str = "UNKNOWN_SDK_VERSION:";
                    }
                    ssb.println(str);
                    ssb.mo26034a();
                    i2 = i;
                }
                ssb.println(next.packageName);
            }
        }
        ssb.mo26035b();
        ssb.mo26035b();
        if (slh.f44684a != null) {
            slf a = slf.m35566a();
            ssb ssb2 = new ssb(printWriter2, "  ");
            ssb2.println("Open Events:");
            ssb2.mo26034a();
            synchronized (a.f44683g) {
                arrayList = new ArrayList(a.f44683g.values());
            }
            int size = arrayList.size();
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("There are ");
            sb2.append(size);
            sb2.append(" currently open events.");
            ssb2.println(sb2.toString());
            if (!arrayList.isEmpty()) {
                ssb2.println();
                int size2 = arrayList.size();
                boolean z = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    sld sld = (sld) arrayList.get(i3);
                    int i4 = ((WakeLockEvent) sld.f44671a).f30358c;
                    if (i4 == 7 || i4 == 8 || i4 == 9 || i4 == 10 || i4 == 11 || i4 == 12 || i4 == 16) {
                        if (!z) {
                            long j4 = a.f44678b;
                            StringBuilder sb3 = new StringBuilder(81);
                            sb3.append("Wakelocks acquired within past ");
                            sb3.append(j4);
                            sb3.append(" milliseconds but unreleased: ");
                            ssb2.println(sb3.toString());
                            ssb2.mo26034a();
                        }
                        ssb2.println(sld.f44671a.toString());
                        z = true;
                    }
                }
                if (z) {
                    ssb2.mo26035b();
                }
            }
            ssb2.mo26035b();
        }
        ssb.println("GMS Core Network Usage:");
        ssb.mo26034a();
        long currentTimeMillis = System.currentTimeMillis();
        long d = smh.m35659d(currentTimeMillis);
        ssb.println("TTL: Total, B: Bytes, BBg: Bytes Background, BFg: Bytes Foreground, BRx: Bytes Received, BTx: Bytes Transferred, PRx: Packets Received, PTx: Packets Transferred.");
        m22713a(ssb, "Last 24h:", currentTimeMillis - 86400000, d);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.add(6, -7);
        m22713a(ssb, "Last 7d:", instance.getTimeInMillis(), d);
        ssb.mo26035b();
        ssb.mo26035b();
        if (cdna.m134124e()) {
            int i5 = Build.VERSION.SDK_INT;
            ssb.println("GMS Core Radio Activity:");
            ssb.mo26034a();
            ssb.println("Lat = Latency, Med = Median, Std dev = Standard deviation, TTL = Total, Evt = Events");
            C1223np npVar = new C1223np();
            if (strArr2 != null) {
                int i6 = 0;
                while (i6 < strArr2.length - 1 && npVar.f26809h < 3) {
                    String str2 = strArr2[i6];
                    int hashCode = str2.hashCode();
                    if (hashCode != -745091864) {
                        if (hashCode != -651918950) {
                            if (hashCode == 2120970387 && str2.equals("--endTimeInMillis")) {
                                c2 = 2;
                                if (c2 != 0) {
                                    i6++;
                                    npVar.put("networkType", strArr2[i6]);
                                } else if (c2 == 1) {
                                    i6++;
                                    npVar.put("startTime", strArr2[i6]);
                                } else if (c2 == 2) {
                                    i6++;
                                    npVar.put("endTime", strArr2[i6]);
                                }
                                i6++;
                            }
                        } else if (str2.equals("--startTimeInMillis")) {
                            c2 = 1;
                            if (c2 != 0) {
                            }
                            i6++;
                        }
                    } else if (str2.equals("--networkType")) {
                        c2 = 0;
                        if (c2 != 0) {
                        }
                        i6++;
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    i6++;
                }
            }
            long j5 = -1;
            if (npVar.f26809h == 3) {
                try {
                    String str3 = (String) npVar.get("startTime");
                    String str4 = (String) npVar.get("endTime");
                    String str5 = (String) npVar.get("networkType");
                    if (str3 == null || str4 == null || str5 == null) {
                        throw new NumberFormatException("null");
                    }
                    j3 = Long.parseLong(str3);
                    try {
                        j = Long.parseLong(str4);
                    } catch (NumberFormatException e) {
                        e = e;
                        Log.e("GmsCoreStatsService", "Exception thrown while reading args: ", e);
                        j = j5;
                        j5 = j3;
                        if (j5 >= 0) {
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - cdna.f181280a.mo6606a().mo77938i();
                        j = System.currentTimeMillis();
                        j2 = currentTimeMillis2;
                        if (cdna.m134126g()) {
                        }
                        if (cdna.m134127h()) {
                        }
                        ssb.mo26035b();
                        ModuleManager moduleManager = ModuleManager.get(this);
                        ssb.println("Module Sets:");
                        ssb.mo26034a();
                        collection = null;
                        configInfo = moduleManager.getCurrentConfig();
                        if (configInfo != null) {
                        }
                        collection = moduleManager.getAllModules();
                        if (collection != null) {
                        }
                    }
                    try {
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -1068855134) {
                            if (hashCode2 != 96673) {
                                if (hashCode2 == 3649301 && str5.equals("wifi")) {
                                    c = 1;
                                    if (c != 0) {
                                        m22712a(ssb, 0, j3, j);
                                        ssb.mo26035b();
                                    } else if (c != 1) {
                                        j5 = j3;
                                    } else {
                                        m22712a(ssb, 1, j3, j);
                                        ssb.mo26035b();
                                    }
                                }
                            } else if (str5.equals("all")) {
                                c = 2;
                                if (c != 0) {
                                }
                            }
                        } else if (str5.equals("mobile")) {
                            c = 0;
                            if (c != 0) {
                            }
                        }
                        if (c != 0) {
                        }
                    } catch (NumberFormatException e2) {
                        e = e2;
                        j5 = j;
                        Log.e("GmsCoreStatsService", "Exception thrown while reading args: ", e);
                        j = j5;
                        j5 = j3;
                        if (j5 >= 0) {
                            j2 = j5;
                            if (cdna.m134126g()) {
                            }
                            if (cdna.m134127h()) {
                            }
                            ssb.mo26035b();
                            ModuleManager moduleManager2 = ModuleManager.get(this);
                            ssb.println("Module Sets:");
                            ssb.mo26034a();
                            collection = null;
                            configInfo = moduleManager2.getCurrentConfig();
                            if (configInfo != null) {
                            }
                            collection = moduleManager2.getAllModules();
                            if (collection != null) {
                            }
                        }
                        long currentTimeMillis22 = System.currentTimeMillis() - cdna.f181280a.mo6606a().mo77938i();
                        j = System.currentTimeMillis();
                        j2 = currentTimeMillis22;
                        if (cdna.m134126g()) {
                        }
                        if (cdna.m134127h()) {
                        }
                        ssb.mo26035b();
                        ModuleManager moduleManager22 = ModuleManager.get(this);
                        ssb.println("Module Sets:");
                        ssb.mo26034a();
                        collection = null;
                        configInfo = moduleManager22.getCurrentConfig();
                        if (configInfo != null) {
                        }
                        collection = moduleManager22.getAllModules();
                        if (collection != null) {
                        }
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    j3 = -1;
                    Log.e("GmsCoreStatsService", "Exception thrown while reading args: ", e);
                    j = j5;
                    j5 = j3;
                    if (j5 >= 0) {
                    }
                    long currentTimeMillis222 = System.currentTimeMillis() - cdna.f181280a.mo6606a().mo77938i();
                    j = System.currentTimeMillis();
                    j2 = currentTimeMillis222;
                    if (cdna.m134126g()) {
                    }
                    if (cdna.m134127h()) {
                    }
                    ssb.mo26035b();
                    ModuleManager moduleManager222 = ModuleManager.get(this);
                    ssb.println("Module Sets:");
                    ssb.mo26034a();
                    collection = null;
                    configInfo = moduleManager222.getCurrentConfig();
                    if (configInfo != null) {
                    }
                    collection = moduleManager222.getAllModules();
                    if (collection != null) {
                    }
                }
            } else {
                j = -1;
            }
            if (j5 >= 0 && j >= 0) {
                j2 = j5;
            } else {
                long currentTimeMillis2222 = System.currentTimeMillis() - cdna.f181280a.mo6606a().mo77938i();
                j = System.currentTimeMillis();
                j2 = currentTimeMillis2222;
            }
            if (cdna.m134126g()) {
                m22712a(ssb, 0, j2, j);
            }
            if (cdna.m134127h()) {
                m22712a(ssb, 1, j2, j);
            }
            ssb.mo26035b();
        }
        ModuleManager moduleManager2222 = ModuleManager.get(this);
        ssb.println("Module Sets:");
        ssb.mo26034a();
        collection = null;
        try {
            configInfo = moduleManager2222.getCurrentConfig();
        } catch (InvalidConfigException e4) {
            Log.e("GmsCoreStatsService", "Unable to get Chimera module config", e4);
            configInfo = null;
        }
        if (configInfo != null) {
            for (ModuleManager.ModuleSetInfo moduleSetInfo : configInfo.moduleSets) {
                String str6 = moduleSetInfo.moduleSetId;
                int i7 = moduleSetInfo.moduleSetVariant;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 48);
                sb4.append("Module Set ID: ");
                sb4.append(str6);
                sb4.append(", Module Set Variant: ");
                sb4.append(i7);
                ssb.println(sb4.toString());
            }
        }
        try {
            collection = moduleManager2222.getAllModules();
        } catch (InvalidConfigException e5) {
            Log.e("GmsCoreStatsService", "Unable to get Chimera module info collection", e5);
        }
        if (collection != null) {
            ssb.println();
            ssb.mo26035b();
            ssb.println("Chimera Module APKs:");
            ssb.mo26034a();
            C1245ok okVar = new C1245ok();
            for (ModuleManager.ModuleInfo moduleInfo : collection) {
                if (!TextUtils.isEmpty(moduleInfo.moduleId)) {
                    ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                    ArrayList arrayList2 = (ArrayList) okVar.get(moduleApkInfo);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        okVar.put(moduleApkInfo, arrayList2);
                    }
                    arrayList2.add(moduleInfo);
                }
            }
            for (int i8 = 0; i8 < okVar.f26809h; i8++) {
                ModuleManager.ModuleApkInfo moduleApkInfo2 = (ModuleManager.ModuleApkInfo) okVar.mo15620b(i8);
                ArrayList arrayList3 = (ArrayList) okVar.mo15621c(i8);
                String str7 = moduleApkInfo2.apkPackageName;
                int i9 = moduleApkInfo2.apkVersionCode;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str7).length() + 14);
                sb5.append(str7);
                sb5.append(" [");
                sb5.append(i9);
                sb5.append("]");
                String sb6 = sb5.toString();
                if (getPackageName().equals(moduleApkInfo2.apkPackageName) && !TextUtils.isEmpty(moduleApkInfo2.apkVersionName)) {
                    String valueOf = String.valueOf(sb6);
                    String str8 = moduleApkInfo2.apkVersionName;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(str8).length());
                    sb7.append(valueOf);
                    sb7.append(" [");
                    sb7.append(str8);
                    sb7.append("]");
                    sb6 = sb7.toString();
                }
                ssb.println(sb6);
                ssb.mo26034a();
                int size3 = arrayList3.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ModuleManager.ModuleInfo moduleInfo2 = (ModuleManager.ModuleInfo) arrayList3.get(i10);
                    String str9 = moduleInfo2.moduleId;
                    int i11 = moduleInfo2.moduleVersion;
                    StringBuilder sb8 = new StringBuilder(String.valueOf(str9).length() + 15);
                    sb8.append(str9);
                    sb8.append(" [v");
                    sb8.append(i11);
                    sb8.append("]");
                    ssb.print(sb8.toString());
                    ssb.println();
                }
                ssb.mo26035b();
                ssb.println();
            }
            ssb.mo26035b();
            ssb.println();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (slf.m35566a().f44677a.f44643c) {
            sns sns = new sns("GmsCoreStatsService", 10);
            this.f30353a = sns;
            sns.start();
            this.f30354c = new skp(this.f30353a);
        }
        int i = Build.VERSION.SDK_INT;
        smv.m35679a();
    }

    public final void onDestroy() {
        super.onDestroy();
        sns sns = this.f30353a;
        if (sns != null) {
            sns.quit();
        }
        int i = Build.VERSION.SDK_INT;
        smv a = smv.m35679a();
        if (a != null) {
            a.mo25761b();
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Handler handler;
        if (intent == null || (handler = this.f30354c) == null) {
            return 1;
        }
        handler.sendMessage(Message.obtain(handler, 0, intent));
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c6, code lost:
        r5 = java.lang.String.valueOf(r5);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 45);
        r7.append("Security exception trying to clear log file: ");
        r7.append(r5);
        android.util.Log.e("GmsCoreStatsService", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ec, code lost:
        android.util.Log.w("GmsCoreStatsService", java.lang.String.format(java.util.Locale.getDefault(), "Truncating %s was unsuccessful.", r6.getName()), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (r6.delete() != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        android.util.Log.e("GmsCoreStatsService", java.lang.String.format(java.util.Locale.getDefault(), "Deleting %s was unsuccessful.", r6.getName()));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC, Splitter:B:41:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5 A[ExcHandler: SecurityException (r5v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:13:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb A[ExcHandler: OverlappingFileLockException (e java.nio.channels.OverlappingFileLockException), Splitter:B:13:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c A[SYNTHETIC] */
    /* renamed from: a */
    public static void m22711a(Context context) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) skl.f44626a.mo58455c()).intValue();
        ComponentName componentName = skr.f44644a;
        if (intValue != 0) {
            arrayList.addAll(new slv().mo25684a(context));
        }
        if (((Integer) ski.f44617a.mo58455c()).intValue() != 0) {
            arrayList.addAll(new ske().mo25684a(context));
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            File file = (File) arrayList.get(i);
            try {
                if (file.exists()) {
                    FileLock fileLock = null;
                    try {
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            FileChannel channel = randomAccessFile.getChannel();
                            fileLock = channel.lock();
                            channel.truncate(0L);
                            if (fileLock != null) {
                                if (fileLock.isValid()) {
                                    fileLock.release();
                                }
                            }
                            srz.m36171a(randomAccessFile);
                            i++;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileLock != null && fileLock.isValid()) {
                                fileLock.release();
                            }
                            if (randomAccessFile == null) {
                                srz.m36171a(randomAccessFile);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                        fileLock.release();
                        if (randomAccessFile == null) {
                        }
                        throw th;
                    }
                } else {
                    throw new FileNotFoundException();
                }
            } catch (IOException e) {
            } catch (OverlappingFileLockException e2) {
            } catch (SecurityException e3) {
            }
        }
        if (((Integer) skj.f44618a.mo58455c()).intValue() != 0) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsageUploadStats", 0);
            Calendar a = sqn.m35983a();
            a.add(6, 1);
            sharedPreferences.edit().putLong("timeLastUpdate", a.getTimeInMillis()).apply();
        }
    }

    /* renamed from: a */
    static final void m22712a(ssb ssb, int i, long j, long j2) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        String a = sks.m35543a(i);
        ssb.println(a);
        ssb.mo26034a();
        List<bpvw> a2 = smr.m35675a(j, j2, i);
        ssb.println(smr.f44772a);
        if (a2.isEmpty()) {
            ssb.println("No data");
        } else {
            Collections.sort(a2, new skn());
            Collections.reverse(a2);
            for (bpvw bpvw : a2) {
                Object[] objArr = new Object[12];
                objArr[0] = shq.m35306a(bpvw.f139438b);
                String valueOf = String.valueOf(Integer.toHexString(bpvw.f139438b));
                objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
                objArr[2] = a;
                Long l = null;
                if ((2 & bpvw.f139437a) != 0) {
                    num = Integer.valueOf(bpvw.f139439c);
                } else {
                    num = null;
                }
                objArr[3] = num;
                if ((bpvw.f139437a & 8) != 0) {
                    l = Long.valueOf(bpvw.f139441e);
                }
                objArr[4] = l;
                String str3 = " ";
                if ((bpvw.f139437a & 16) != 0) {
                    obj = Long.valueOf(bpvw.f139442f);
                } else {
                    obj = str3;
                }
                objArr[5] = obj;
                if ((bpvw.f139437a & 128) != 0) {
                    obj2 = Long.valueOf(bpvw.f139445i);
                } else {
                    obj2 = str3;
                }
                objArr[6] = obj2;
                if ((bpvw.f139437a & 32) != 0) {
                    obj3 = Long.valueOf(bpvw.f139443g);
                } else {
                    obj3 = str3;
                }
                objArr[7] = obj3;
                if ((bpvw.f139437a & 64) != 0) {
                    obj4 = Long.valueOf(m22710a(bpvw));
                } else {
                    obj4 = str3;
                }
                objArr[8] = obj4;
                if ((bpvw.f139437a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    str = String.format("%.0f", Double.valueOf(Math.sqrt(bpvw.f139446j)));
                } else {
                    str = str3;
                }
                objArr[9] = str;
                if ((bpvw.f139437a & 512) != 0) {
                    str2 = String.format("%.0f", Double.valueOf(bpvw.f139447k));
                } else {
                    str2 = str3;
                }
                objArr[10] = str2;
                if ((bpvw.f139437a & 1024) != 0) {
                    str3 = String.format("%.0f", Double.valueOf(bpvw.f139448l));
                }
                objArr[11] = str3;
                ssb.println(String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", objArr));
            }
        }
        ssb.mo26035b();
    }

    /* renamed from: a */
    private final void m22713a(ssb ssb, String str, long j, long j2) {
        ssb.println(str);
        ssb.mo26034a();
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            ssb.println(smi.f44747k);
            m22714a(ssb, smg.m35655c(getContentResolver(), j, j2));
        } else {
            ssb.println(smc.f44718a);
            m22714a(ssb, smg.m35654b(getContentResolver(), j, j2));
        }
        ssb.mo26035b();
    }

    /* renamed from: a */
    private static final void m22714a(ssb ssb, Collection collection) {
        if (!collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection);
            Collections.sort(arrayList, Collections.reverseOrder());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ssb.print(((smj) arrayList.get(i)).mo25747b(-1).toString());
            }
        } else {
            ssb.println("No data");
        }
        ssb.println();
    }
}
