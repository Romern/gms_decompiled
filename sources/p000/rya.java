package p000;

import android.app.DownloadManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rya extends soa {

    /* renamed from: a */
    public final DownloadServiceSettingsChimeraActivity f43843a;

    /* renamed from: b */
    private final rxv f43844b;

    public rya(DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity) {
        super(9);
        this.f43843a = downloadServiceSettingsChimeraActivity;
        this.f43844b = rxl.m34617a(downloadServiceSettingsChimeraActivity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo25251a(MatrixCursor matrixCursor, long j) {
        String str;
        long j2 = j + 1;
        matrixCursor.addRow(new Object[]{Long.valueOf(j), "DownloadStatus", ""});
        try {
            int i = ((Status) aucu.m76783a(this.f43844b.mo25245a(DownloadServiceSettingsChimeraActivity.m22572e().f30175a), 1, TimeUnit.SECONDS)).f30115i;
            switch (i) {
                case 7000:
                    str = "PENDING";
                    break;
                case 7001:
                    str = "IN_PROGRESS";
                    break;
                case 7002:
                    str = "NOT_ALLOWED";
                    break;
                default:
                    str = rjs.m33677c(i);
                    break;
            }
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) DownloadServiceSettingsChimeraActivity.f30190b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("rya", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unknown execution exception");
            str = "Unknown";
            matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.m22572e().f30175a, str});
            return j2 + 1;
        } catch (InterruptedException | TimeoutException e2) {
            srn srn = DownloadServiceSettingsChimeraActivity.f30190b;
            str = "Unknown";
            matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.m22572e().f30175a, str});
            return j2 + 1;
        }
        matrixCursor.addRow(new Object[]{Long.valueOf(j2), DownloadServiceSettingsChimeraActivity.m22572e().f30175a, str});
        return j2 + 1;
    }

    public final void run() {
        long j;
        MatrixCursor matrixCursor = new MatrixCursor(DownloadServiceSettingsChimeraActivity.f30193e);
        matrixCursor.addRow(new Object[]{1L, "Enabled status", ""});
        DownloadDetails[] a = ryd.m34642a(this.f43843a);
        int length = a.length;
        long j2 = 2;
        int i = 0;
        while (i < length) {
            DownloadDetails downloadDetails = a[i];
            boolean a2 = DownloadIntentOperation.m22559a(this.f43843a, downloadDetails.f30175a);
            boolean c = DownloadIntentOperation.m22564c(this.f43843a, downloadDetails.f30175a);
            String str = downloadDetails.f30175a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append(str);
            sb.append(" downloaded:");
            sb.append(a2);
            sb.append(" , enabled:");
            sb.append(c);
            matrixCursor.addRow(new Object[]{Long.valueOf(j), sb.toString(), downloadDetails.f30176b});
            i++;
            j2 = j + 1;
        }
        Cursor a3 = ryd.m34634a((DownloadManager) this.f43843a.getSystemService("download"), new DownloadManager.Query());
        if (a3 != null) {
            try {
                if (a3.getCount() > 0) {
                    matrixCursor.addRow(new Object[]{Long.valueOf(j), "DownloadManager status", ""});
                    j++;
                    while (a3.moveToNext()) {
                        String string = a3.getString(a3.getColumnIndexOrThrow("title"));
                        int i2 = a3.getInt(a3.getColumnIndexOrThrow("status"));
                        long j3 = j + 1;
                        matrixCursor.addRow(new Object[]{Long.valueOf(j), string, i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? i2 != 16 ? "Unknown" : "Failed" : "Successful" : "Paused" : "Running" : "Pending"});
                        j = j3;
                    }
                }
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
        }
        if (a3 != null) {
            a3.close();
        }
        mo25251a(matrixCursor, j);
        this.f43843a.runOnUiThread(new rxz(this, matrixCursor));
    }
}
