package p000;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: bdzc */
final /* synthetic */ class bdzc implements bmzi {

    /* renamed from: a */
    private final bdzj f106669a;

    public bdzc(bdzj bdzj) {
        this.f106669a = bdzj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ed  */
    /* renamed from: a */
    public final Object mo6606a() {
        Map map;
        boolean booleanValue;
        StrictMode.ThreadPolicy allowThreadDiskWrites;
        Map map2;
        bdzj bdzj = this.f106669a;
        if (bdzj.f106686a) {
            String valueOf = String.valueOf(bdzj.f106691f);
            Trace.beginSection(valueOf.length() == 0 ? new String("Querying for ") : "Querying for ".concat(valueOf));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Uri a = bdyj.m91581a(bdzj.f106691f);
            if (bdyi.m91580a(bdzj.f106690e.f106636d, a)) {
                synchronized (bdzj.class) {
                    if (!bdzj.f106689d.mo66813a()) {
                        try {
                            bdzj.f106689d = bmxv.m108566b(Boolean.valueOf(rfz.m33557a(bdzj.f106690e.f106636d).mo24609b(bdzj.f106690e.f106636d.getPackageManager().getPackageInfo("com.google.android.gms", 64))));
                        } catch (PackageManager.NameNotFoundException e) {
                            bdzj.f106689d = bmxv.m108566b(false);
                        }
                    }
                    booleanValue = ((Boolean) bdzj.f106689d.mo66814b()).booleanValue();
                }
                if (booleanValue) {
                    ContentResolver contentResolver = bdzj.f106690e.f106636d.getContentResolver();
                    String[] strArr = !aytw.m84813a(bdzj.f106690e.f106636d) ? new String[]{"account", ""} : null;
                    allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        int i = Build.VERSION.SDK_INT;
                        map2 = bdzj.mo58463a(contentResolver, a, strArr, new CancellationSignal());
                        bdzj.f106690e.mo58441a().execute(new bdzg(bdzj, map2));
                    } catch (IOException e2) {
                        Log.w("ContentProviderFlagSource", "Could not read flags from disk snapshot, falling back to default values");
                        map2 = bnoj.f131912b;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    map = map2;
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (bdzj.f106686a) {
                        Trace.endSection();
                    }
                    bdzj.f106690e.mo58441a().execute(new bdze(bdzj, uptimeMillis2, uptimeMillis, elapsedRealtime2, elapsedRealtime));
                    return map;
                }
            }
            map = bnoj.f131912b;
            long uptimeMillis22 = SystemClock.uptimeMillis();
            long elapsedRealtime22 = SystemClock.elapsedRealtime();
            if (bdzj.f106686a) {
            }
            bdzj.f106690e.mo58441a().execute(new bdze(bdzj, uptimeMillis22, uptimeMillis, elapsedRealtime22, elapsedRealtime));
            return map;
        } catch (Throwable th) {
            Throwable th2 = th;
            long uptimeMillis3 = SystemClock.uptimeMillis();
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (bdzj.f106686a) {
                Trace.endSection();
            }
            bdzj.f106690e.mo58441a().execute(new bdzf(bdzj, uptimeMillis3, uptimeMillis, elapsedRealtime3, elapsedRealtime));
            throw th2;
        }
    }
}
