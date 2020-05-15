package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyr implements Runnable {

    /* renamed from: a */
    final FontMatchSpec f56222a;

    /* renamed from: b */
    final String f56223b;

    /* renamed from: c */
    final zxq f56224c;

    /* renamed from: d */
    final zyn f56225d;

    public zyr(String str, FontMatchSpec fontMatchSpec, zxq zxq, zyn zyn) {
        this.f56223b = str;
        this.f56222a = fontMatchSpec;
        this.f56224c = zxq;
        this.f56225d = zyn;
    }

    public final void run() {
        zyh.m46683c("FontsPackageChangeOp", "Requesting download of font %s to satisfy manifest dependency.", this.f56222a);
        try {
            if (((FontFetchResult) this.f56225d.mo31600a(this.f56222a, this.f56223b).get(10, TimeUnit.SECONDS)).f32459b.mo17710c()) {
                zxq zxq = this.f56224c;
                String str = this.f56223b;
                FontMatchSpec fontMatchSpec = this.f56222a;
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabase = zxq.getWritableDatabase();
                    try {
                        boolean a = zxq.mo31561a(str, fontMatchSpec, sQLiteDatabase);
                        zxq.mo31562c(sQLiteDatabase);
                        if (!a) {
                            zyh.m46680a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.f56222a);
                        }
                        zyh.m46683c("FontsPackageChangeOp", "Download success: %s", this.f56222a);
                    } catch (SQLiteException e) {
                        zxq.mo31562c(sQLiteDatabase);
                        zyh.m46680a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.f56222a);
                    } catch (Throwable th) {
                        th = th;
                        zxq.mo31562c(sQLiteDatabase);
                        throw th;
                    }
                } catch (SQLiteException e2) {
                    zxq.mo31562c(sQLiteDatabase);
                    zyh.m46680a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.f56222a);
                } catch (Throwable th2) {
                    th = th2;
                    zxq.mo31562c(sQLiteDatabase);
                    throw th;
                }
            } else {
                zyh.m46680a("FontsPackageChangeOp", "Failure downloading font %s for manifest dependency.", this.f56222a);
            }
        } catch (TimeoutException e3) {
            zyh.m46681a("FontsPackageChangeOp", e3, "Failure downloading font %s for manifest dependency.", this.f56222a);
        } catch (InterruptedException | ExecutionException e4) {
            zyh.m46681a("FontsPackageChangeOp", e4, "Failure downloading font %s for manifest dependency.", this.f56222a);
        }
    }
}
