package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.IOException;
import java.util.UUID;

/* renamed from: aykf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykf {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01eb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ec, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ee, code lost:
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f3, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f5, code lost:
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f9, code lost:
        r17 = r3;
        r18 = r8;
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0208, code lost:
        r17 = r3;
        r18 = r8;
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0224, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0252, code lost:
        if (r11 == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0254, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0293, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0142, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
        throw new java.lang.RuntimeException("Unable to write chunk metadata", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01da, code lost:
        r17 = r3;
        r18 = r8;
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e3, code lost:
        r17 = r3;
        r18 = r8;
        r21 = r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01eb A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: all (th java.lang.Throwable), PHI: r6 r11 10  PHI: (r6v18 long) = (r6v2 long), (r6v19 long), (r6v19 long), (r6v19 long), (r6v19 long) binds: [B:21:0x0054, B:23:0x0058, B:33:0x00a5, B:40:0x00cc, B:43:0x00d6] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r11v16 android.os.DropBoxManager$Entry) = (r11v10 android.os.DropBoxManager$Entry), (r11v10 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry) binds: [B:21:0x0054, B:23:0x0058, B:33:0x00a5, B:40:0x00cc, B:43:0x00d6] A[DONT_GENERATE, DONT_INLINE], Splitter:B:21:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f2 A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: Exception (e java.lang.Exception), PHI: r6 r11 10  PHI: (r6v16 long) = (r6v2 long), (r6v19 long), (r6v19 long), (r6v19 long), (r6v19 long) binds: [B:21:0x0054, B:23:0x0058, B:33:0x00a5, B:40:0x00cc, B:43:0x00d6] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r11v14 android.os.DropBoxManager$Entry) = (r11v10 android.os.DropBoxManager$Entry), (r11v10 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry), (r11v20 android.os.DropBoxManager$Entry) binds: [B:21:0x0054, B:23:0x0058, B:33:0x00a5, B:40:0x00cc, B:43:0x00d6] A[DONT_GENERATE, DONT_INLINE], Splitter:B:21:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027b A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0293 A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: ayko (e ayko), Splitter:B:46:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0162 A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: ayko (e ayko), Splitter:B:40:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d1 A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: all (th java.lang.Throwable), PHI: r21 10  PHI: (r21v25 android.os.DropBoxManager$Entry) = (r21v19 android.os.DropBoxManager$Entry), (r21v19 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry) binds: [B:40:0x00cc, B:43:0x00d6, B:46:0x00dd, B:47:?, B:48:0x00f2, B:58:0x0120, B:54:0x010f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d3 A[Catch:{ ayko -> 0x01d7, IOException -> 0x01d5, Exception -> 0x01d3, all -> 0x01d1 }, ExcHandler: Exception (e java.lang.Exception), PHI: r21 10  PHI: (r21v24 android.os.DropBoxManager$Entry) = (r21v19 android.os.DropBoxManager$Entry), (r21v19 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry), (r21v31 android.os.DropBoxManager$Entry) binds: [B:40:0x00cc, B:43:0x00d6, B:46:0x00dd, B:47:?, B:48:0x00f2, B:58:0x0120, B:54:0x010f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x00dd] */
    /* renamed from: a */
    public static synchronized void m84155a(Context context, rjx rjx, bymq bymq, qxq qxq) {
        long j;
        DropBoxManager dropBoxManager;
        DropBoxManager.Entry entry;
        long j2;
        DropBoxManager dropBoxManager2;
        Context context2 = context;
        qxq qxq2 = qxq;
        synchronized (aykf.class) {
            DropBoxManager dropBoxManager3 = (DropBoxManager) context2.getSystemService("dropbox");
            if (dropBoxManager3 != null) {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("WestworldPerfettoOp", 0);
                long j3 = sharedPreferences.getLong(":lastRunMsec", -1);
                long currentTimeMillis = System.currentTimeMillis();
                DropBoxManager.Entry entry2 = null;
                if (aykk.f97847f == null) {
                    aykk.f97847f = new qws(context2, chpz.m149339p(), null);
                }
                qws qws = aykk.f97847f;
                while (true) {
                    if (j3 >= j) {
                        break;
                    }
                    try {
                        entry2 = dropBoxManager.getNextEntry("perfetto", j3);
                        if (entry2 == null) {
                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                            break;
                        }
                        try {
                            j3 = entry2.getTimeMillis();
                            if ((entry2.getFlags() & 1) == 0) {
                                qxq2.mo24383c("UploadPerfetto").mo24359a();
                                aykn aykn = new aykn(entry2.getInputStream(), ((int) chpz.m149328e()) - 26);
                                aykq aykq = new aykq(aykn);
                                UUID randomUUID = UUID.randomUUID();
                                boolean a = m84156a(aykn);
                                int i = 0;
                                while (a) {
                                    int i2 = 0;
                                    while (true) {
                                        aykp a2 = aykq.mo54067a();
                                        if (a2 == null) {
                                            break;
                                        }
                                        i2 += a2.f97866c;
                                    }
                                    if (i2 != 0) {
                                        bxtx a3 = bxtx.m123261a(aykn.mo54060a(0, i2));
                                        aykq.mo54070d();
                                        boolean a4 = m84156a(aykn);
                                        int i3 = i + 1;
                                        dropBoxManager2 = dropBoxManager;
                                        boolean z = !a4;
                                        j2 = j;
                                        byte[] bArr = new byte[26];
                                        bxuk a5 = bxuk.m123637a(bArr);
                                        boolean z2 = a4;
                                        int i4 = i;
                                        entry = entry2;
                                        try {
                                            a5.mo73846b(2, randomUUID.getLeastSignificantBits());
                                            a5.mo73846b(3, randomUUID.getMostSignificantBits());
                                            a5.mo73856d(4, i4);
                                            a5.mo73836a(5, z);
                                            bxtx a6 = bxtx.m123262a(bArr, 0, a5.mo73842b()).mo73770a(a3);
                                            bxvd da = byms.f167065g.mo74144da();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            byms byms = (byms) da.f164949b;
                                            a6.getClass();
                                            byms.f167068b = 4;
                                            byms.f167069c = a6;
                                            aykk.m84171a(rjx, qws, bymq, qxq2, da);
                                            a = z2;
                                            i = i3;
                                            dropBoxManager = dropBoxManager2;
                                            j = j2;
                                            entry2 = entry;
                                        } catch (ayko e) {
                                            entry2 = entry;
                                            qxq2.mo24383c("BadPerfettoFile").mo24359a();
                                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                            if (entry2 != null) {
                                            }
                                            dropBoxManager3 = dropBoxManager2;
                                            currentTimeMillis = j2;
                                        } catch (IOException e2) {
                                            entry2 = entry;
                                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                        } catch (Exception e3) {
                                        } catch (Throwable th) {
                                        }
                                    } else {
                                        DropBoxManager dropBoxManager4 = dropBoxManager;
                                        long j4 = j;
                                        entry = entry2;
                                        int i5 = i;
                                        if (aykq.mo54069c()) {
                                            qxq2.mo24383c("UploadPerfettoDroppedLargeField").mo24359a();
                                            boolean a7 = m84156a(aykn);
                                            Log.w("WestworldPerfettoOp", "Skipped perfetto trace field");
                                            i = i5;
                                            dropBoxManager = dropBoxManager4;
                                            j = j4;
                                            entry2 = entry;
                                            a = a7;
                                        } else {
                                            throw new ayko("Unable to skip a field in file");
                                        }
                                    }
                                }
                                sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                entry2.close();
                                dropBoxManager2 = dropBoxManager;
                                j2 = j;
                                dropBoxManager3 = dropBoxManager2;
                                currentTimeMillis = j2;
                            } else {
                                DropBoxManager dropBoxManager5 = dropBoxManager;
                                long j5 = j;
                                entry = entry2;
                                qxq2.mo24383c("UploadPerfettoFailsDropBoxEntryDeleted").mo24359a();
                                sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                entry.close();
                                dropBoxManager3 = dropBoxManager5;
                                currentTimeMillis = j5;
                                entry2 = entry;
                            }
                        } catch (ayko e4) {
                        } catch (IOException e5) {
                            entry = entry2;
                            entry2 = entry;
                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        } catch (Exception e6) {
                        } catch (Throwable th2) {
                        }
                    } catch (ayko e7) {
                        dropBoxManager2 = dropBoxManager;
                        j2 = j;
                        qxq2.mo24383c("BadPerfettoFile").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        if (entry2 != null) {
                        }
                        dropBoxManager3 = dropBoxManager2;
                        currentTimeMillis = j2;
                    } catch (IOException e8) {
                        dropBoxManager2 = dropBoxManager;
                        j2 = j;
                        qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                    } catch (Exception e9) {
                        e = e9;
                        qxq2.mo24383c("PerfettoCrash").mo24359a();
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        if (entry2 != null) {
                        }
                        throw th;
                    }
                }
            } else {
                Log.i("WestworldPerfettoOp", "Can't find dropbox");
                qxq2.mo24383c("UploadPerfettoFailsDropBoxManager").mo24359a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m84156a(aykn aykn) {
        return aykn.mo54059a() || aykn.f97857a != 0;
    }
}
