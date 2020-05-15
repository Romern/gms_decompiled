package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: aykb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykb {
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0198, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a2, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ac, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b1, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c5, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cb, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x021e, code lost:
        if (r12 == null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025a, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e9, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ee, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0170, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ab A[Catch:{ aykl -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b0 A[Catch:{ aykl -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: Exception (e java.lang.Exception), Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d0 A[Catch:{ aykl -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: Exception (e java.lang.Exception), PHI: r6 10  PHI: (r6v13 long) = (r6v2 long), (r6v14 long), (r6v14 long) binds: [B:21:0x005a, B:23:0x005e, B:30:0x0079] A[DONT_GENERATE, DONT_INLINE], Splitter:B:21:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0243 A[Catch:{ aykl -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x025a A[Catch:{ aykl -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }] */
    /* renamed from: a */
    public static synchronized void m84141a(Context context, rjx rjx, bymq bymq, qxq qxq) {
        long j;
        long j2;
        Context context2 = context;
        qxq qxq2 = qxq;
        synchronized (aykb.class) {
            DropBoxManager dropBoxManager = (DropBoxManager) context2.getSystemService("dropbox");
            if (dropBoxManager != null) {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("WestworldIncidentOp", 0);
                long j3 = sharedPreferences.getLong(":lastRunMsec", -1);
                long currentTimeMillis = System.currentTimeMillis();
                int i = context.getApplicationInfo().uid;
                DropBoxManager.Entry entry = null;
                if (aykk.f97846e == null) {
                    aykk.f97846e = new qws(context2, chou.m149250b(), null);
                }
                qws qws = aykk.f97846e;
                while (true) {
                    if (j3 >= currentTimeMillis) {
                        break;
                    }
                    try {
                        entry = dropBoxManager.getNextEntry("incident", j3);
                        if (entry == null) {
                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                            break;
                        }
                        try {
                            j3 = entry.getTimeMillis();
                            if ((entry.getFlags() & 1) != 0) {
                                sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                entry.close();
                            } else {
                                qxq2.mo24383c("UploadIncident").mo24359a();
                                long j4 = j3;
                                try {
                                    aykm aykm = new aykm(entry.getInputStream(), (int) chpz.m149328e());
                                    while (true) {
                                        aykn aykn = aykm.f97852a;
                                        if (aykn.f97858b && aykn.f97857a == 0) {
                                            j = currentTimeMillis;
                                            break;
                                        }
                                        ByteString a = aykm.mo54055a();
                                        long f = chpw.m149307f();
                                        if (!aykm.f97854c) {
                                            Iterator it = aykm.f97853b.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    j = currentTimeMillis;
                                                    break;
                                                }
                                                caeh caeh = (caeh) it.next();
                                                caeg caeg = caeh.f172823a;
                                                if (caeg == null) {
                                                    caeg = caeg.f172816c;
                                                }
                                                j = currentTimeMillis;
                                                if (caeg.f172819b == f) {
                                                    caeg caeg2 = caeh.f172823a;
                                                    if (caeg2 == null) {
                                                        caeg2 = caeg.f172816c;
                                                    }
                                                    if (caeg2.f172818a == i) {
                                                        aykm.f97854c = true;
                                                        break;
                                                    }
                                                }
                                                currentTimeMillis = j;
                                            }
                                        } else {
                                            j = currentTimeMillis;
                                        }
                                        if (!aykm.f97854c) {
                                            break;
                                        }
                                        bxvd da = bymr.f167059e.mo74144da();
                                        long timeMillis = entry.getTimeMillis();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bymr bymr = (bymr) da.f164949b;
                                        int i2 = bymr.f167061a | 1;
                                        bymr.f167061a = i2;
                                        bymr.f167062b = timeMillis;
                                        int i3 = aykm.f97855d;
                                        int i4 = i2 | 2;
                                        bymr.f167061a = i4;
                                        bymr.f167063c = i3;
                                        a.getClass();
                                        bymr.f167061a = i4 | 4;
                                        bymr.f167064d = a;
                                        bxvd da2 = byms.f167065g.mo74144da();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        byms byms = (byms) da2.f164949b;
                                        bymr bymr2 = (bymr) da.mo74062i();
                                        bymr2.getClass();
                                        byms.f167069c = bymr2;
                                        byms.f167068b = 3;
                                        aykk.m84171a(rjx, qws, bymq, qxq2, da2);
                                        currentTimeMillis = j;
                                    }
                                    j3 = j4;
                                    sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                } catch (aykl e) {
                                    j2 = currentTimeMillis;
                                    j3 = j4;
                                    qxq2.mo24383c("BadIncidentReport").mo24359a();
                                    sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                    if (entry != null) {
                                    }
                                    currentTimeMillis = j;
                                } catch (IOException e2) {
                                    j = currentTimeMillis;
                                    j3 = j4;
                                    qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                                    sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                                } catch (Exception e3) {
                                } catch (Throwable th) {
                                }
                                entry.close();
                                currentTimeMillis = j;
                            }
                        } catch (aykl e4) {
                            j2 = currentTimeMillis;
                            qxq2.mo24383c("BadIncidentReport").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                            if (entry != null) {
                            }
                            currentTimeMillis = j;
                        } catch (IOException e5) {
                            j = currentTimeMillis;
                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        } catch (Exception e6) {
                        }
                    } catch (aykl e7) {
                        j = currentTimeMillis;
                        qxq2.mo24383c("BadIncidentReport").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        if (entry != null) {
                        }
                        currentTimeMillis = j;
                    } catch (IOException e8) {
                        j = currentTimeMillis;
                        qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                    } catch (Exception e9) {
                        e = e9;
                        qxq2.mo24383c("IncidentCrash").mo24359a();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedPreferences.edit().putLong(":lastRunMsec", j3).apply();
                        if (entry != null) {
                        }
                        throw th;
                    }
                }
            } else {
                Log.i("WestworldIncidentOp", "Can't find dropbox");
                qxq2.mo24383c("UploadIncidentFailsDropBoxManager").mo24359a();
                return;
            }
        }
    }
}
