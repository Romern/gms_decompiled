package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: qlu */
final /* synthetic */ class qlu implements Callable {

    /* renamed from: a */
    private final Intent f41672a;

    /* renamed from: b */
    private final Context f41673b;

    /* renamed from: c */
    private final dks f41674c;

    /* renamed from: d */
    private final ExecutorService f41675d;

    /* renamed from: e */
    private final int f41676e;

    public qlu(Intent intent, Context context, dks dks, ExecutorService executorService, int i) {
        this.f41672a = intent;
        this.f41673b = context;
        this.f41674c = dks;
        this.f41675d = executorService;
        this.f41676e = i;
    }

    public final Object call() {
        boolean z;
        boolean z2;
        boolean z3;
        Intent intent = this.f41672a;
        Context context = this.f41673b;
        dks dks = this.f41674c;
        ExecutorService executorService = this.f41675d;
        int i = this.f41676e;
        boolean booleanExtra = intent.getBooleanExtra("DEXOPT_ALL_MODULES", false);
        boolean booleanExtra2 = intent.getBooleanExtra("ON_BOOT_OR_UPGRADE", false);
        dgv a = dgv.m8427a(context);
        boolean booleanValue = ((Boolean) qlj.f41642a.mo58455c()).booleanValue();
        boolean a2 = dfq.m8314a().mo8862a();
        if (FileApkIntentOperation.m22400a(intent)) {
            z3 = true;
            z2 = false;
            z = false;
        } else if (booleanExtra2) {
            z3 = !booleanValue;
            z2 = true;
            z = true;
        } else {
            z3 = false;
            z2 = true;
            z = false;
        }
        boolean z4 = booleanExtra;
        while (true) {
            if (!z3) {
                if (!z2) {
                    break;
                }
                qmc.m32416a();
                z4 = a.mo8985a(qmc.m32431d(context), dks, z) | z4;
                z2 = false;
            } else {
                z4 |= a.mo8979a(dks);
            }
            if (a2) {
                a.mo8977a(z3);
            }
            qmc.m32424a(false);
            z3 = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        executorService.execute(new qlv(countDownLatch));
        do {
            try {
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } while (!countDownLatch.await(60, TimeUnit.SECONDS));
        if (!a2 && (z4 || booleanValue)) {
            if (booleanExtra) {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = Build.VERSION.SDK_INT;
            }
            int i4 = Build.VERSION.SDK_INT;
        }
        return new qlx(intent, i);
    }
}
