package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: amsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsa implements amrz {

    /* renamed from: a */
    public static final Uri f75828a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: c */
    private static final String[] f75829c = {"android_id"};

    /* renamed from: b */
    public final Context f75830b;

    /* renamed from: d */
    private final rjx f75831d;

    public amsa(Context context) {
        this.f75830b = context;
        this.f75831d = aeyf.m52681a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        android.util.Log.e("DeviceUsageSettingsHelper", "getAndroidId: Unable to get androidId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        return p000.bmvz.f131120a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* renamed from: a */
    public final bmxv mo41295a() {
        Cursor cursor = null;
        try {
            cursor = this.f75830b.getContentResolver().query(f75828a, null, null, f75829c, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && cursor.getColumnCount() >= 2) {
                        bmxv b = bmxv.m108566b(cursor.getString(1));
                        cursor.close();
                        return b;
                    }
                } catch (SecurityException e) {
                    e = e;
                    try {
                        amig.m62939a();
                        ande.f76660a.mo41719a(this.f75830b).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            amig.m62939a();
            ande.f76660a.mo41719a(this.f75830b).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final bmxv mo41296b() {
        try {
            return bmxv.m108566b((rkj) aucu.m76783a(this.f75831d.mo24760n(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("DeviceUsageSettingsHelper", "Failed to get Lockbox signed-in status");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return bmvz.f131120a;
        }
    }
}
