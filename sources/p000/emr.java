package p000;

import android.app.DownloadManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.Map;

/* renamed from: emr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emr implements emu {

    /* renamed from: a */
    private final DownloadManager f15303a;

    public emr(Context context) {
        this.f15303a = (DownloadManager) context.getSystemService("download");
    }

    /* renamed from: a */
    public final long mo10290a(Uri uri, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        DownloadManager.Request request = new DownloadManager.Request(uri);
        int i2 = Build.VERSION.SDK_INT;
        request.setAllowedOverMetered(z);
        if (!z2) {
            int i3 = Build.VERSION.SDK_INT;
            request.setNotificationVisibility(2);
        } else {
            if (str3 != null) {
                request.setTitle(str3);
            }
            if (str4 != null) {
                request.setDescription(str4);
            }
        }
        return this.f15303a.enqueue(request);
    }

    /* renamed from: b */
    public final void mo10294b(long... jArr) {
        this.f15303a.remove(jArr);
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo10291a(long j) {
        return this.f15303a.openDownloadedFile(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        return java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* renamed from: a */
    public final Map mo10292a(long... jArr) {
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(jArr);
        Cursor cursor = null;
        try {
            cursor = this.f15303a.query(query);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("status");
                        C1223np npVar = new C1223np(jArr.length);
                        do {
                            npVar.put(Long.valueOf(cursor.getLong(columnIndexOrThrow)), Integer.valueOf(cursor.getInt(columnIndexOrThrow2)));
                        } while (cursor.moveToNext());
                        cursor.close();
                        return npVar;
                    }
                } catch (SQLiteException | IllegalArgumentException e) {
                    e = e;
                    try {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("DownloadManager.query() failed: ");
                        sb.append(valueOf);
                        Log.e("SystemZappDlMgr", sb.toString());
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            }
        } catch (SQLiteException | IllegalArgumentException e2) {
            e = e2;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            sb2.append("DownloadManager.query() failed: ");
            sb2.append(valueOf2);
            Log.e("SystemZappDlMgr", sb2.toString());
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo10293a(Context context) {
        if (this.f15303a != null) {
            try {
                int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
                if (applicationEnabledSetting != 0) {
                    if (applicationEnabledSetting != 1) {
                        return false;
                    }
                }
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("downloads");
                if (acquireContentProviderClient == null) {
                    return false;
                }
                acquireContentProviderClient.release();
                return true;
            } catch (IllegalArgumentException | SecurityException e) {
            }
        }
        return false;
    }
}
