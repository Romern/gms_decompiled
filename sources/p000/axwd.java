package p000;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: axwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwd {

    /* renamed from: a */
    final /* synthetic */ axwi f96545a;

    /* renamed from: b */
    private final ConcurrentLinkedQueue f96546b = new ConcurrentLinkedQueue();

    public axwd(axwi axwi) {
        this.f96545a = axwi;
    }

    /* renamed from: a */
    public final void mo53660a(axwx axwx) {
        if (!this.f96546b.contains(axwx)) {
            this.f96546b.offer(axwx);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo53661a(String str) {
        String str2;
        axwx axwx = (axwx) this.f96546b.peek();
        if (axwx != null && Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "processAssetsDownload: there are assets to fetch, processing...");
        }
        while (axwx != null && this.f96545a.mo53681b()) {
            boolean z = true;
            if (axwx.f96634b) {
                this.f96545a.mo53683d();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    axwn axwn = this.f96545a.f96584i;
                    String str3 = axwx.f96633a;
                    str2 = axwn.mo53697a(str3, Uri.parse(chnj.m149028d()).buildUpon().appendPath(chnj.m149029e()).appendPath("media").appendPath(str3).appendQueryParameter("alt", "media").build().toString());
                    this.f96545a.mo53675a(9, elapsedRealtime, 1);
                } catch (axwq | IOException e) {
                    this.f96545a.mo53676a(9, elapsedRealtime, e);
                    throw e;
                }
            } else {
                str2 = null;
            }
            this.f96545a.f96586k.mo53758a("getAssetAcl");
            this.f96545a.mo53683d();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                axwj c = this.f96545a.f96583h.mo53696c(str, axwx.f96633a);
                this.f96545a.mo53675a(10, elapsedRealtime2, 1);
                this.f96545a.f96586k.mo53760b("getAssetAcl");
                if (c != null) {
                    axxv axxv = this.f96545a.f96582g;
                    String str4 = c.f96602a;
                    if (str2 == null) {
                        z = false;
                    }
                    Set set = c.f96603b;
                    if (Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", str4.length() == 0 ? new String("addAsset from cloud for digest: ") : "addAsset from cloud for digest: ".concat(str4));
                    }
                    SQLiteDatabase writableDatabase = axxv.f96695c.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        axxu a = axxv.m83492a(writableDatabase, str4, z, (axue[]) set.toArray(new axue[set.size()]));
                        if (Log.isLoggable("DataItems", 3)) {
                            int size = a.f96687a.size();
                            StringBuilder sb = new StringBuilder(84);
                            sb.append("Asset metadata written from cloud asset, number of data items to notify: ");
                            sb.append(size);
                            Log.d("DataItems", sb.toString());
                            Iterator it = a.f96687a.iterator();
                            while (it.hasNext()) {
                                String valueOf = String.valueOf((String) it.next());
                                Log.d("DataItems", valueOf.length() == 0 ? new String("Changed data item id: ") : "Changed data item id: ".concat(valueOf));
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        boolean z2 = a.f96688b;
                        if (z2 || a.f96689c) {
                            axxv.f96697e.mo53591a(str4, z2, null, (axue[]) set.toArray(new axue[set.size()]));
                        }
                        axxv.mo53739a(a.f96687a);
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f96546b.poll();
                axwx = (axwx) this.f96546b.peek();
            } catch (axwq | IOException e2) {
                this.f96545a.mo53676a(10, elapsedRealtime2, e2);
                throw e2;
            }
        }
    }
}
