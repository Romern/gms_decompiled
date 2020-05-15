package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.Process;
import android.util.SparseArray;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: nuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nuu {

    /* renamed from: a */
    private final SparseArray f36572a;

    public nuu() {
        SparseArray sparseArray = new SparseArray(8);
        this.f36572a = sparseArray;
        sparseArray.put(Process.myUid(), true);
    }

    /* renamed from: a */
    public static Object m27789a(Callable callable) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            try {
                return callable.call();
            } catch (IllegalStateException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            adzt adzt = new adzt(mainLooper);
            nus nus = new nus(callable);
            adzt.post(nus);
            try {
                nus.f36565a.await();
                IllegalStateException illegalStateException = nus.f36567c;
                if (illegalStateException == null) {
                    return nus.f36566b;
                }
                throw illegalStateException;
            } catch (InterruptedException e3) {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static String m27794b(Context context, boolean z) {
        boolean z2;
        if (z) {
            z2 = rfz.m33557a(context).mo24610b(context.getPackageName());
        } else {
            z2 = rfy.m33550g(context);
        }
        return nqs.m27346a(context, z2);
    }

    /* renamed from: c */
    public static void m27797c(Looper looper, Runnable runnable) {
        if (Looper.myLooper() == looper) {
            runnable.run();
            return;
        }
        adzt adzt = new adzt(looper);
        nut nut = new nut(runnable);
        adzt.post(nut);
        nut.mo21620a();
    }

    /* renamed from: b */
    public static void m27795b(Looper looper, Runnable runnable) {
        if (Looper.myLooper() == looper) {
            runnable.run();
        } else {
            new adzt(looper).post(runnable);
        }
    }

    /* renamed from: c */
    public static void m27798c(Runnable runnable) {
        m27797c(Looper.getMainLooper(), runnable);
    }

    /* renamed from: b */
    public static void m27796b(Runnable runnable) {
        m27795b(Looper.getMainLooper(), runnable);
    }

    /* renamed from: a */
    public static String m27790a(Context context, boolean z) {
        try {
            return m27794b(context, z);
        } catch (IllegalStateException | SecurityException e) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m27791a(Looper looper, Runnable runnable) {
        new adzt(looper).post(runnable);
    }

    /* renamed from: a */
    public static void m27792a(Runnable runnable) {
        m27791a(Looper.getMainLooper(), runnable);
    }

    /* renamed from: a */
    public static void m27793a(byte[] bArr) {
        if (bArr != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (options.outHeight < 0 || options.outHeight > 256 || options.outWidth < 0 || options.outWidth > 256) {
                int i = options.outHeight;
                int i2 = options.outWidth;
                StringBuilder sb = new StringBuilder(43);
                sb.append("Image size invalid: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (!"image/png".equals(options.outMimeType)) {
                throw new IllegalArgumentException("Given image not a png");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21622a(Context context, int i) {
        Boolean bool = (Boolean) this.f36572a.get(i);
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (rfz.m33557a(context).mo24610b(packagesForUid[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        if (this.f36572a.size() == 8) {
            this.f36572a.removeAt(new Random().nextInt(8));
        }
        this.f36572a.put(i, Boolean.valueOf(z));
        return z;
    }
}
