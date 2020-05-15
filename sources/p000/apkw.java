package p000;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: apkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apkw extends adzt {

    /* renamed from: a */
    private final asfb f84645a;

    /* renamed from: b */
    private final aplb f84646b;

    /* renamed from: c */
    private long f84647c = 0;

    public apkw(Looper looper, asfb asfb, aplb aplb) {
        super(looper);
        this.f84645a = asfb;
        this.f84646b = aplb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    public final void handleMessage(Message message) {
        int i;
        bxvd da;
        bljb a;
        bljb a2;
        int i2 = message.what;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            return;
        }
        if (message.getWhen() >= this.f84647c) {
            this.f84647c = SystemClock.uptimeMillis();
            aapx a3 = aapx.m21801a(message.arg1);
            String a4 = apia.m70339a(a3);
            if (a4 == null) {
                a4 = "";
            }
            try {
                aech aech = new aech(a4.length() == 0 ? new String("nts:standalone:checkQueue:") : "nts:standalone:checkQueue:".concat(a4));
                try {
                    this.f84645a.mo49113a(a4);
                    int i3 = message.what;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            aplb aplb = this.f84646b;
                            a2 = blkh.m107281a("checkQueueLazily");
                            i = aplb.mo47380a(aplb.f84665k, a3);
                            if (a2 != null) {
                                a2.close();
                            }
                        } else if (i3 != 2) {
                            i = 0;
                        }
                        aech.close();
                        this.f84645a.mo49122c(a4);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f84647c;
                        aplb aplb2 = this.f84646b;
                        apia apia = aplb2.f84662h;
                        aapu d = aplb2.mo47386d();
                        da = aapz.f28865f.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aapz aapz = (aapz) da.f164949b;
                        aapz.f28868b = a3.f28863p;
                        int i4 = aapz.f28867a | 1;
                        aapz.f28867a = i4;
                        aapz.f28871e = 1;
                        int i5 = i4 | 8;
                        aapz.f28867a = i5;
                        aapz.f28867a = 4 | i5;
                        aapz.f28870d = (long) i;
                        bxun a5 = bxzr.m124575a(uptimeMillis - j);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aapz aapz2 = (aapz) da.f164949b;
                        a5.getClass();
                        aapz2.f28869c = a5;
                        aapz2.f28867a |= 2;
                        apia.mo47244a(d, (aapz) da.mo74062i());
                        return;
                    }
                    aplb aplb3 = this.f84646b;
                    a = blkh.m107281a("checkQueueEagerly");
                    i = aplb3.mo47380a(aplb3.f84664j, a3);
                    if (a != null) {
                        a.close();
                    }
                    aech.close();
                    this.f84645a.mo49122c(a4);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    long j2 = this.f84647c;
                    aplb aplb22 = this.f84646b;
                    apia apia2 = aplb22.f84662h;
                    aapu d2 = aplb22.mo47386d();
                    da = aapz.f28865f.mo74144da();
                    if (da.f164950c) {
                    }
                    aapz aapz3 = (aapz) da.f164949b;
                    aapz3.f28868b = a3.f28863p;
                    int i42 = aapz3.f28867a | 1;
                    aapz3.f28867a = i42;
                    aapz3.f28871e = 1;
                    int i52 = i42 | 8;
                    aapz3.f28867a = i52;
                    aapz3.f28867a = 4 | i52;
                    aapz3.f28870d = (long) i;
                    bxun a52 = bxzr.m124575a(uptimeMillis2 - j2);
                    if (da.f164950c) {
                    }
                    aapz aapz22 = (aapz) da.f164949b;
                    a52.getClass();
                    aapz22.f28869c = a52;
                    aapz22.f28867a |= 2;
                    apia2.mo47244a(d2, (aapz) da.mo74062i());
                    return;
                } catch (Throwable th) {
                    aech.close();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f84645a.mo49122c(a4);
                throw th2;
            }
        } else {
            if (Log.isLoggable("NetworkScheduler", 4)) {
                Log.i("NetworkScheduler", "ignoring stale queue check message");
            }
            aplb aplb4 = this.f84646b;
            apia apia3 = aplb4.f84662h;
            aapu d3 = aplb4.mo47386d();
            bxvd da2 = aapz.f28865f.mo74144da();
            aapx a6 = aapx.m21801a(message.arg1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapz aapz4 = (aapz) da2.f164949b;
            aapz4.f28868b = a6.f28863p;
            int i6 = aapz4.f28867a | 1;
            aapz4.f28867a = i6;
            aapz4.f28871e = 2;
            aapz4.f28867a = i6 | 8;
            apia3.mo47244a(d3, (aapz) da2.mo74062i());
            return;
        }
        throw th;
        throw th;
    }
}
