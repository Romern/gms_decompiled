package p000;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: aani */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aani {

    /* renamed from: a */
    public static final long f28537a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private static final long f28538c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    private static final int f28539d = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: b */
    public final aams f28540b;

    /* renamed from: e */
    private final Context f28541e;

    /* renamed from: f */
    private final Random f28542f;

    /* renamed from: g */
    private final aamu f28543g;

    /* renamed from: h */
    private final double f28544h;

    /* renamed from: i */
    private final aang f28545i;

    /* renamed from: j */
    private long f28546j;

    public aani(Context context, aang aang, aamu aamu, Random random) {
        this.f28541e = context;
        this.f28545i = aang;
        this.f28543g = aamu;
        this.f28542f = random;
        this.f28540b = new aams(context, "GCM_CONN_ALARM", "com.google.android.intent.action.GCM_RECONNECT");
        double d = 2.0d;
        if (!TextUtils.isEmpty(cecz.m136069q())) {
            try {
                d = Double.parseDouble(cecz.m136069q());
            } catch (NumberFormatException e) {
            }
        }
        this.f28544h = d;
    }

    /* renamed from: b */
    private final long m21630b(boolean z) {
        if (z) {
            return f28538c + ((long) this.f28542f.nextInt(f28539d * 3));
        }
        return (long) this.f28542f.nextInt(f28539d);
    }

    /* renamed from: c */
    private static int m21631c(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType();
        }
        return -1;
    }

    /* renamed from: d */
    private final synchronized void m21632d(NetworkInfo networkInfo) {
        double d = (double) this.f28546j;
        double d2 = this.f28544h;
        Double.isNaN(d);
        long max = Math.max((long) (d * d2), cecz.f182285a.mo6606a().mo78791J());
        long U = cecz.f182285a.mo6606a().mo78802U();
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                this.f28546j = Math.min(max, U);
            }
        }
        U = cecz.f182285a.mo6606a().mo78801T();
        this.f28546j = Math.min(max, U);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo17106a() {
        return this.f28546j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo17107a(NetworkInfo networkInfo) {
        mo17112c();
        if (this.f28540b.mo17058c()) {
            long a = this.f28540b.mo17055a() - SystemClock.elapsedRealtime();
            if (a > 0) {
                if (a < this.f28546j) {
                    return;
                }
            }
        }
        this.f28540b.mo17056a(this.f28546j);
        if (mo17111b()) {
            mo17110b(networkInfo);
        }
        m21632d(networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo17112c() {
        aand g = aakb.m21381a().mo16922g();
        if (g.mo17096d() && !mo17111b()) {
            if (g.mo17097e() >= cecz.m136068p()) {
                mo17109a(false);
                return;
            }
            this.f28546j = Math.min(cecz.m136068p() - g.mo17097e(), this.f28546j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo17110b(NetworkInfo networkInfo) {
        int c = m21631c(networkInfo);
        aamv a = this.f28543g.mo17064a(c).mo17079a(this.f28541e);
        if (a != null && c != -1) {
            long j = this.f28546j;
            bxvd bxvd = a.f28504b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aait aait = (aait) bxvd.f164949b;
            aait aait2 = aait.f28219k;
            aait.f28221a |= 128;
            aait.f28229i = j;
        }
    }

    /* renamed from: b */
    public final boolean mo17111b() {
        if (!cecz.m136065m()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return this.f28545i.mo17105b();
    }

    /* renamed from: a */
    public final synchronized void mo17108a(NetworkInfo networkInfo, boolean z) {
        int c = m21631c(networkInfo);
        aamx a = this.f28543g.mo17064a(c);
        this.f28546j = -1;
        aamv a2 = a.mo17079a(this.f28541e);
        if (a2 != null) {
            if (c != -1) {
                this.f28546j = ((aait) a2.f28504b.f164949b).f28229i;
            }
        }
        if (this.f28546j < 0) {
            this.f28546j = m21630b(z);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17109a(boolean z) {
        this.f28546j = m21630b(z);
    }
}
