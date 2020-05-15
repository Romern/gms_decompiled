package com.google.android.gms.update.execution;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstallationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f109496a = avpq.m79018e("InstallationIntentOperation");

    /* renamed from: b */
    private static final bnic f109497b = bnic.m109490a("com.google.android.gms.update.INSTALL_UPDATE", "com.google.android.gms.update.SCHEDULED_INSTALL");

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0071, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        r2.mo51439a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        if (r5 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0 = r5.f93510d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0145, code lost:
        if (r0 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        p000.avnm.f93516a.mo25417e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
        if (r5 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0 = r5.f93510d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        p000.avnm.f93516a.mo25417e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2.mo51440b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if (r5 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = r5.f93510d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r0 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        p000.avnm.f93516a.mo25417e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    public final void onHandleIntent(Intent intent) {
        String str;
        f109496a.mo25414c("Received intent: %s.", intent);
        if (f109497b.contains(bmxx.m108578b(intent.getAction())) && avma.m78773a(this)) {
            avnm avnm = (avnm) avnm.f93517b.mo51589b();
            synchronized (avnm.f93522g) {
                synchronized (avnm.f93521f) {
                    String str2 = (String) avnm.f93519d.mo51607b(avnp.f93526a);
                    if (bmxx.m108577a(str2)) {
                        String valueOf = String.valueOf(SystemClock.elapsedRealtime());
                        avnm.f93519d.mo51605a(new avtc(avnp.f93526a, valueOf));
                        avnm.f93520e.f93724b.mo51605a(avpp.f93721a.mo51602b(valueOf));
                        str = valueOf;
                    } else {
                        str = str2;
                    }
                    avnm.f93524i = false;
                }
                while (true) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    avnj c = avnm.mo51441c();
                    avnk avnk = new avnk(avnm);
                    synchronized (c.f93512b) {
                        c.f93513c = bmxv.m108566b(avnk);
                    }
                    avni c2 = c.mo51435c();
                    sek sek = avnm.f93516a;
                    Object[] objArr = new Object[2];
                    objArr[0] = c.f93511a;
                    double elapsedRealtime2 = (double) (SystemClock.elapsedRealtime() - elapsedRealtime);
                    Double.isNaN(elapsedRealtime2);
                    objArr[1] = Double.valueOf(elapsedRealtime2 / 1000.0d);
                    sek.mo25414c("Action %s executed for %.2f seconds.", objArr);
                    String str3 = c.f93511a;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    bxvd da = boho.f133117d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boho boho = (boho) da.f164949b;
                    str3.getClass();
                    int i = boho.f133119a | 1;
                    boho.f133119a = i;
                    boho.f133120b = str3;
                    boho.f133119a = i | 2;
                    boho.f133121c = elapsedRealtime3;
                    boho boho2 = (boho) da.mo74062i();
                    avpp avpp = avnm.f93520e;
                    bxvd a = avpp.mo51476a(5);
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    bohn bohn = (bohn) a.f164949b;
                    bohn bohn2 = bohn.f133102n;
                    boho2.getClass();
                    bohn.f133111h = boho2;
                    bohn.f133104a |= 64;
                    avpp.mo51478a((bohn) a.mo74062i());
                    try {
                        synchronized (avnm.f93521f) {
                            if (!((String) avnm.f93519d.mo51607b(avnp.f93526a)).equals(str)) {
                                break;
                            }
                            avnm.f93519d.mo51605a(avnp.f93527b.mo51602b(c2.f93507a), avnp.f93528c.mo51602b(c2.f93508b));
                            if (c2.f93509c) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        if (c2 != null) {
                            Callable callable = c2.f93510d;
                            if (callable != null) {
                                try {
                                    callable.call();
                                } catch (Exception e) {
                                    avnm.f93516a.mo25417e("Error when executing onStatePersistedCallback.", e, new Object[0]);
                                }
                            }
                        }
                        throw th2;
                    }
                }
            }
            return;
        }
        return;
    }
}
