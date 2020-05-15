package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PackageStatsCapture {
    static final PackageStatsInvocation[] GETTER_INVOCATIONS = {new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    /* renamed from: a */
    public static final bnrt f111396a = bnrt.m110178a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture");

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class PackageStatsCallback extends IPackageStatsObserver.Stub {

        /* renamed from: a */
        public final Semaphore f111397a = new Semaphore(1);

        /* renamed from: b */
        public volatile PackageStats f111398b;

        /* renamed from: a */
        public final PackageStats mo60591a(long j) {
            if (this.f111397a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                return this.f111398b;
            }
            bnrq bnrq = (bnrq) PackageStatsCapture.f111396a.mo68388c();
            bnrq.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Timeout while waiting for PackageStats callback");
            return null;
        }

        public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (!z) {
                bnrq bnrq = (bnrq) PackageStatsCapture.f111396a.mo68388c();
                bnrq.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Failure getting PackageStats");
            } else {
                bnrt bnrt = PackageStatsCapture.f111396a;
                this.f111398b = packageStats;
            }
            this.f111397a.release();
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class PackageStatsInvocation {

        /* renamed from: a */
        private final String f111399a;

        /* renamed from: b */
        private final Class[] f111400b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.f111399a = str;
            this.f111400b = clsArr;
        }

        public boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Object[] objArr;
            try {
                Method method = packageManager.getClass().getMethod(this.f111399a, this.f111400b);
                Class[] clsArr = this.f111400b;
                int length = clsArr.length;
                if (length == 2) {
                    if (clsArr[0] == String.class && clsArr[1] == IPackageStatsObserver.class) {
                        objArr = new Object[]{str, iPackageStatsObserver};
                    }
                    throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                }
                if (length == 3 && clsArr[0] == String.class && clsArr[1] == Integer.TYPE && this.f111400b[2] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                method.invoke(packageManager, objArr);
                return true;
            } catch (NoSuchMethodException e) {
                bnrt bnrt = PackageStatsCapture.f111396a;
                return false;
            } catch (Error | Exception e2) {
                bnrq bnrq = (bnrq) PackageStatsCapture.f111396a.mo68390d();
                bnrq.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsInvocation", "invoke", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68425a("%s for %s (%s) invocation", e2.getClass().getSimpleName(), this.f111399a, Arrays.asList(this.f111400b));
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    /* renamed from: a */
    private static boolean m94886a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers());
        } catch (Error | Exception e) {
            return false;
        }
    }

    public static PackageStats getPackageStats(Context context) {
        beel.m91856c();
        int i = Build.VERSION.SDK_INT;
        return bdja.m90886a(context);
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        if (!m94886a()) {
            bnrq bnrq = (bnrq) f111396a.mo68388c();
            bnrq.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Callback implementation stripped by proguard.");
            return null;
        }
        PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
        try {
            packageStatsCallback.f111397a.acquire();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            int myUid = Process.myUid();
            for (PackageStatsInvocation packageStatsInvocation : packageStatsInvocationArr) {
                if (packageStatsInvocation.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                    bnrq bnrq2 = (bnrq) f111396a.mo68390d();
                    bnrq2.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68405a("Success invoking PackageStats capture.");
                    if (packageStatsCallback.f111397a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.f111398b;
                    }
                    bnrq bnrq3 = (bnrq) f111396a.mo68388c();
                    bnrq3.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq3.mo68405a("Timeout while waiting for PackageStats callback");
                    return null;
                }
            }
            bnrq bnrq4 = (bnrq) f111396a.mo68388c();
            bnrq4.mo68432a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq4.mo68405a("Couldn't capture PackageStats.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
