package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: asfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfc extends asen {

    /* renamed from: j */
    private static Pattern f88829j = Pattern.compile(cgrw.m146783b());

    /* renamed from: h */
    final String f88830h = "BatterystatsDumpsysTask.gz";

    /* renamed from: i */
    final String f88831i = "BatterystatsDumpsysTask_last.gz";

    /* renamed from: a */
    public final int mo49089a() {
        return (int) cgrw.f187616a.mo6606a().mo84373c();
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgrt.f187611a.mo6606a().mo84369c();
    }

    /* renamed from: d */
    public final long mo49095d() {
        return 0;
    }

    /* renamed from: f */
    public final boolean mo49097f() {
        return cgrt.f187611a.mo6606a().mo84367a();
    }

    /* renamed from: g */
    public final boolean mo49098g() {
        return cgrw.f187616a.mo6606a().mo84375e();
    }

    public asfc() {
        super("Batterystats", "batterystats", "BATTERY_STATS", cgrw.f187616a.mo6606a().mo84372b());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        r6.write(r0);
        r6.newLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r14 != -1) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r0.contains(p000.cgrw.f187616a.mo84370c().mo84378h()) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10 = p000.cgrw.m146783b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (p000.asfc.f88829j.pattern().equals(r10) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        p000.asfc.f88829j = java.util.regex.Pattern.compile(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        r0 = p000.asfc.f88829j.matcher(r0);
        r11 = (int) p000.cgrw.f187616a.mo84370c().mo84376f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0.find() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        if (r0.groupCount() <= r11) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        r10 = java.lang.Long.parseLong(r0.group(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        android.util.Log.w("BatterystatsDumpsysTask", "Couldn't find battery stats reset timestamp.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        android.util.Log.e("BatterystatsDumpsysTask", "Fail to get reset time", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020e, code lost:
        r11 = r2;
        r1 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x007b] */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        String[] strArr;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        calu calu;
        Context context2 = context;
        qxq qxq2 = qxq;
        long currentTimeMillis = System.currentTimeMillis();
        File fileStreamPath = context2.getFileStreamPath(this.f88830h);
        File fileStreamPath2 = context2.getFileStreamPath(this.f88831i);
        if (fileStreamPath2.exists()) {
            Log.w("BatterystatsDumpsysTask", "Last dump exists!");
            fileStreamPath2.delete();
        }
        if (fileStreamPath.exists()) {
            fileStreamPath.renameTo(fileStreamPath2);
        }
        int i = 0;
        String[] strArr2 = new String[0];
        if (cgrt.f187611a.mo6606a().mo84368b()) {
            strArr = cgrw.f187616a.mo6606a().mo84371a().split("&");
        } else {
            strArr = strArr2;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(context2.getFileStreamPath(this.f88830h));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(fileOutputStream), asem.f88778e));
                long j3 = -1;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        int length = strArr.length;
                        while (true) {
                            if (i < length) {
                                if (readLine.contains(strArr[i])) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        i = 0;
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        bufferedWriter = bufferedWriter2;
                        try {
                            Log.w("BatterystatsDumpsysTask", e);
                            throw new asel(e);
                        } catch (Throwable th) {
                            th = th;
                            srz.m36171a(bufferedReader);
                            srz.m36171a(bufferedWriter);
                            throw th;
                        }
                    } catch (Throwable th2) {
                    }
                }
                if (j3 != -1) {
                    srz.m36171a(bufferedReader2);
                    srz.m36171a(bufferedWriter2);
                    SharedPreferences sharedPreferences = context2.getSharedPreferences(this.f88779a, 0);
                    long j4 = sharedPreferences.getLong(":resetMillis", -1);
                    File fileStreamPath3 = context2.getFileStreamPath(this.f88831i);
                    if (j3 == j4) {
                        qxq2.mo24383c("BatteryStatsDuplicatedDumps").mo24359a();
                        mo49126a(context, currentTimeMillis, j3);
                        calu = null;
                    } else {
                        if (j3 < j4) {
                            qxq2.mo24383c("BatteryStatsWrongResetTimer").mo24359a();
                            StringBuilder sb = new StringBuilder(92);
                            sb.append("Reset timestamp incorrect: last_reset = ");
                            sb.append(j4);
                            sb.append(",new_reset= ");
                            sb.append(j3);
                            Log.e("BatterystatsDumpsysTask", sb.toString());
                        }
                        long j5 = sharedPreferences.getLong(":dumpMillis", -1);
                        if (j5 > 0) {
                            qxq2.mo24380b("BatteryStatsLossDuration", aser.f88786a).mo24368a(j3 - j5);
                        }
                        mo49126a(context, currentTimeMillis, j3);
                        if (j4 > 0) {
                            try {
                                calx a = mo49099a(context, new GZIPInputStream(new FileInputStream(fileStreamPath3)), j4, j5, qxq);
                                bxvd bxvd = (bxvd) a.mo74142c(5);
                                bxvd.mo73625a((bxvk) a);
                                calu = (calu) bxvd;
                                bxvd da = calt.f175176c.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                calt calt = (calt) da.f164949b;
                                calt.f175178a |= 4;
                                calt.f175179b = j3;
                                if (calu.f164950c) {
                                    calu.mo74035c();
                                    calu.f164950c = false;
                                }
                                calx calx = (calx) calu.f164949b;
                                calt calt2 = (calt) da.mo74062i();
                                calx calx2 = calx.f175201v;
                                calt2.getClass();
                                calx.f175208f = calt2;
                                calx.f175203a |= 4;
                            } catch (IOException e2) {
                                throw new asel(e2);
                            }
                        } else {
                            calu = null;
                        }
                    }
                    fileStreamPath3.delete();
                    if (calu != null) {
                        return (calx) calu.mo74062i();
                    }
                    return null;
                }
                throw new asel("Can't find reset timestamp in the dump!");
            } catch (IOException e3) {
                e = e3;
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                Log.w("BatterystatsDumpsysTask", e);
                throw new asel(e);
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                srz.m36171a(bufferedReader);
                srz.m36171a(bufferedWriter);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedWriter = null;
            bufferedReader = null;
            Log.w("BatterystatsDumpsysTask", e);
            throw new asel(e);
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = null;
            bufferedReader = null;
            srz.m36171a(bufferedReader);
            srz.m36171a(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: e */
    public final boolean mo49096e() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49126a(Context context, long j, long j2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(this.f88779a, 0).edit();
        edit.putLong(":dumpMillis", j);
        edit.putLong(":resetMillis", j2);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        return cgrw.f187616a.mo6606a().mo84374d().split(" ");
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        int i = Build.VERSION.SDK_INT;
        return cgsf.f187633a.mo6606a().mo84385a();
    }
}
