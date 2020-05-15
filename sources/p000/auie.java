package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: auie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auie implements spr {

    /* renamed from: a */
    public static final aehz f91869a = auid.f91868a;

    /* renamed from: b */
    public final int[] f91870b;

    /* renamed from: c */
    public final sps f91871c;

    /* renamed from: d */
    public final rjx f91872d;

    /* renamed from: e */
    private long f91873e;

    public auie(Context context, Handler handler) {
        String[] split = cgyq.m147650h().split(",");
        PackageManager packageManager = context.getPackageManager();
        int length = split.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : split) {
            if (!TextUtils.isEmpty(str)) {
                int i2 = i + 1;
                try {
                    iArr[i] = packageManager.getPackageUid(str, 0);
                } catch (PackageManager.NameNotFoundException e) {
                }
                i = i2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i);
        sps a = sps.m35913a(context, handler);
        rjx c = aeie.m51878c(context);
        this.f91873e = 0;
        int i3 = Build.VERSION.SDK_INT;
        bmxy.m108600b(true);
        this.f91870b = copyOf;
        this.f91871c = a;
        this.f91872d = c;
    }

    /* renamed from: a */
    public final void mo50549a() {
        this.f91871c.mo25944a();
    }

    /* renamed from: a */
    public final void mo25943a(int i, boolean z) {
        if (z && sqc.m35957a(this.f91870b, i) && SystemClock.elapsedRealtime() - this.f91873e >= cgyq.m147651i()) {
            this.f91873e = SystemClock.elapsedRealtime();
            this.f91872d.mo24756l().mo50373a(new auic(this));
        }
    }
}
