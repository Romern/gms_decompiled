package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.WorkSource;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: bgju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgju implements bgns {

    /* renamed from: a */
    final bgky[] f116657a = new bgky[f116893e];

    /* renamed from: b */
    public final Context f116658b;

    /* renamed from: c */
    public final PendingIntent[] f116659c;

    /* renamed from: d */
    public final bgid f116660d;

    /* renamed from: f */
    private final bfor f116661f;

    /* renamed from: g */
    private final AlarmManager f116662g;

    /* renamed from: h */
    private final long[] f116663h = new long[f116893e];

    /* renamed from: i */
    private final long[] f116664i = new long[f116893e];

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    public bgju(Context context, bgid bgid, bfor bfor) {
        this.f116658b = context;
        this.f116661f = bfor;
        this.f116660d = bgid;
        Arrays.fill(this.f116663h, -1L);
        Arrays.fill(this.f116664i, -1L);
        this.f116662g = (AlarmManager) context.getSystemService("alarm");
        this.f116659c = new PendingIntent[f116893e];
    }

    /* renamed from: a */
    public static final Intent m99160a(String str) {
        return new Intent(str);
    }

    /* renamed from: d */
    private final void m99162d(bgnq bgnq) {
        this.f116660d.mo62847a(new bgjs(this, bgnq));
    }

    /* renamed from: b */
    public final Executor mo62922b() {
        return new bgjt(this);
    }

    /* renamed from: c */
    public final void mo62925c(bgnq bgnq) {
        int ordinal = bgnq.ordinal();
        bfor bfor = this.f116661f;
        bfor.mo62047a(new bfop(bfos.WAKELOCK_RELEASE, bfor.mo62055b(), "%2$d", ordinal));
        bgky bgky = this.f116657a[ordinal];
        try {
            bgla bgla = bgla.f116740a;
            synchronized (bgla) {
                if (bgky.mo62964a()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bgky.f116731b.mo49120c();
                    if (!bgky.mo62964a() && bgky.f116733d != -1) {
                        long a = bgky.mo62963a(elapsedRealtime);
                        bgla.f116741b.remove(bgky);
                        String str = bgky.f116732c;
                        bgkz bgkz = (bgkz) bgla.f116742c.get(str);
                        if (bgkz == null) {
                            bgkz = new bgkz(bgla, bgky);
                            bgla.f116742c.put(str, bgkz);
                        }
                        short[] sArr = bgkz.f116737c;
                        bgkz.f116735a += a;
                        bgkz.f116736b++;
                        int i = 0;
                        boolean z = false;
                        while (true) {
                            int length = sArr.length;
                            if (i < length) {
                                if (z) {
                                    break;
                                }
                                if (a < ((long) sArr[i])) {
                                    int[] iArr = bgkz.f116738d;
                                    iArr[i] = iArr[i] + 1;
                                    z = true;
                                }
                                i++;
                            } else if (!z) {
                                int[] iArr2 = bgkz.f116738d;
                                iArr2[length] = iArr2[length] + 1;
                            }
                        }
                        bgky.f116733d = -1;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private static boolean m99161a(long j, long j2) {
        return j2 - j <= 5000 && cese.f183399a.mo6606a().allowInstantAlarm();
    }

    /* renamed from: b */
    public final void mo62923b(bgnq bgnq, long j, bgmj bgmj) {
        WorkSource b;
        int ordinal = bgnq.ordinal();
        bfor bfor = this.f116661f;
        bfor.mo62047a(new bfop(bfos.WAKELOCK_ACQUIRE, bfor.mo62055b(), "%2$d", ordinal));
        bgky bgky = this.f116657a[ordinal];
        if (bgmj == null || svr.m36484b(this.f116658b).mo26169a("android.permission.UPDATE_DEVICE_STATS") != 0) {
            bgmj = null;
        }
        if ((bgmj instanceof bhcv) && (b = ((bhcv) bgmj).mo63559b()) != null) {
            bgky.f116731b.mo49121c(b);
        }
        bgky.f116731b.mo49111a(j);
        bgla bgla = bgla.f116740a;
        synchronized (bgla) {
            if (bgky.f116733d == -1) {
                bgky.f116733d = SystemClock.elapsedRealtime();
                if (bgla.f116743d == -1) {
                    bgla.f116743d = SystemClock.elapsedRealtime();
                }
                bgla.f116741b.add(bgky);
            }
        }
    }

    /* renamed from: a */
    public final bgmj mo62912a() {
        return new bhcw();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62913a(int i) {
        this.f116663h[i] = -1;
        this.f116664i[i] = -1;
    }

    /* renamed from: a */
    public final void mo62914a(bgnq bgnq) {
        int ordinal = bgnq.ordinal();
        mo62913a(ordinal);
        bfor bfor = this.f116661f;
        bfor.mo62047a(new bfop(bfos.ALARM_CANCEL, bfor.mo62055b(), "%2$d", ordinal));
        PendingIntent pendingIntent = this.f116659c[ordinal];
        if (pendingIntent != null) {
            this.f116662g.cancel(pendingIntent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgfx.a(bfor, int, long, boolean):void
     arg types: [bfor, int, long, int]
     candidates:
      bgfx.a(bfor, bfos, boolean, int):void
      bgfx.a(bfor, boolean, boolean, int):void
      bgfx.a(bfor, int, long, boolean):void */
    /* renamed from: a */
    public final void mo62915a(bgnq bgnq, long j) {
        int ordinal = bgnq.ordinal();
        long[] jArr = this.f116663h;
        if (jArr[ordinal] != j) {
            jArr[ordinal] = j;
            bgfx.m98778a(this.f116661f, ordinal, j, true);
            boolean a = m99161a(SystemClock.elapsedRealtime(), j);
            if (!a) {
                String str = bgnq.f116891v;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                sb.append("Alarm ");
                sb.append(str);
                sb.append(" will ring at ");
                sb.append(j);
                sb.toString();
                bgkx bgkx = bgkx.f116729g;
                AlarmManager alarmManager = this.f116662g;
                PendingIntent pendingIntent = this.f116659c[ordinal];
                String valueOf = String.valueOf(pendingIntent.getIntentSender());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb2.append("setAlarmAndAllowIdle from ");
                sb2.append(valueOf);
                sb2.append(" at ");
                sb2.append(j);
                sb2.toString();
                alarmManager.setExactAndAllowWhileIdle(2, j, pendingIntent);
            }
            this.f116660d.mo62839a(bgnq, j, 0);
            if (a) {
                String str2 = bgnq.f116891v;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 21);
                sb3.append("Alarm ");
                sb3.append(str2);
                sb3.append(" will ring now.");
                sb3.toString();
                m99162d(bgnq);
                return;
            }
            return;
        }
        String str3 = bgnq.f116891v;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 79);
        sb4.append("Redundant alarmSetExactAndAllowWhileIdle of ");
        sb4.append(str3);
        sb4.append(" with deadline ");
        sb4.append(j);
        sb4.toString();
    }

    /* renamed from: b */
    public final boolean mo62924b(bgnq bgnq) {
        return this.f116657a[bgnq.ordinal()].mo62964a();
    }

    /* renamed from: a */
    public final void mo62916a(bgnq bgnq, long j, long j2, bgmj bgmj) {
        bgnq bgnq2 = bgnq;
        long j3 = j;
        long j4 = j2;
        bgmj bgmj2 = bgmj;
        int ordinal = bgnq.ordinal();
        long[] jArr = this.f116663h;
        if (jArr[ordinal] == j3 && this.f116664i[ordinal] == j4) {
            String str = bgnq2.f116891v;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("Redundant alarmWindowReset of ");
            sb.append(str);
            sb.append(" with deadline ");
            sb.append(j3);
            sb.toString();
            return;
        }
        jArr[ordinal] = j3;
        this.f116664i[ordinal] = j4;
        bfor bfor = this.f116661f;
        bfor.mo62047a(new bgfo(bfos.ALARM_RESET_WINDOW, bfor.mo62055b(), ordinal, (int) j3, (int) j4, ordinal, j, j2));
        boolean a = m99161a(SystemClock.elapsedRealtime(), j3);
        if (!a) {
            bgkx bgkx = bgkx.f116729g;
            AlarmManager alarmManager = this.f116662g;
            PendingIntent pendingIntent = this.f116659c[ordinal];
            if (bgmj2 instanceof bhcv) {
                WorkSource b = ((bhcv) bgmj2).mo63559b();
                if (b == null) {
                    try {
                        alarmManager.setWindow(2, j, j2, pendingIntent);
                    } catch (Exception e) {
                    }
                } else {
                    alarmManager.set(2, j, j2, 0, pendingIntent, b);
                }
            }
            try {
                alarmManager.setWindow(2, j, j2, pendingIntent);
            } catch (SecurityException e2) {
            }
        }
        this.f116660d.mo62839a(bgnq, j, j2);
        if (a) {
            String str2 = bgnq2.f116891v;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("Alarm ");
            sb2.append(str2);
            sb2.append(" will ring now.");
            sb2.toString();
            m99162d(bgnq);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgfx.a(bfor, int, long, boolean):void
     arg types: [bfor, int, long, int]
     candidates:
      bgfx.a(bfor, bfos, boolean, int):void
      bgfx.a(bfor, boolean, boolean, int):void
      bgfx.a(bfor, int, long, boolean):void */
    /* renamed from: a */
    public final void mo62917a(bgnq bgnq, long j, bgmj bgmj) {
        bgnq bgnq2 = bgnq;
        long j2 = j;
        int ordinal = bgnq.ordinal();
        long[] jArr = this.f116663h;
        if (jArr[ordinal] == j2 && this.f116664i[ordinal] == -1) {
            String str = bgnq2.f116891v;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("Redundant alarmReset of ");
            sb.append(str);
            sb.append(" with deadline ");
            sb.append(j);
            sb.toString();
            return;
        }
        jArr[ordinal] = j2;
        this.f116664i[ordinal] = -1;
        bgfx.m98778a(this.f116661f, ordinal, j, false);
        boolean a = m99161a(SystemClock.elapsedRealtime(), j);
        if (!a) {
            bgkx.f116729g.mo62946a(this.f116662g, j, this.f116659c[ordinal], bgmj);
        }
        this.f116660d.mo62839a(bgnq, j, -1);
        if (a) {
            String str2 = bgnq2.f116891v;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("Alarm ");
            sb2.append(str2);
            sb2.append(" will ring now.");
            sb2.toString();
            m99162d(bgnq);
        }
    }

    /* renamed from: a */
    public final void mo62918a(Object obj) {
        bgid bgid = this.f116660d;
        bgid.mo62847a(new bgho(bgid, obj));
    }

    /* renamed from: a */
    public final void mo62919a(Runnable runnable, long j) {
        bgid bgid = this.f116660d;
        if (bgid.f116486g) {
            return;
        }
        if (j != 0) {
            bgid.f116487h.postDelayed(runnable, j);
        } else {
            bgid.f116487h.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo62920a(boolean z) {
        bgnq[] values = bgnq.values();
        for (bgnq bgnq : values) {
            int ordinal = bgnq.ordinal();
            if (!z || (bgnq.f116892w & 1) != 0) {
                if (this.f116657a[ordinal].mo62964a()) {
                    String str = bgnq.f116891v;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
                    sb.append("Client ");
                    sb.append(str);
                    sb.append(" leaked wakelock.");
                    sb.toString();
                    mo62925c(bgnq);
                }
                mo62914a(bgnq);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62921a(Runnable runnable) {
        return this.f116660d.mo62847a(runnable);
    }
}
