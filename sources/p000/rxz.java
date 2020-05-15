package p000;

import android.database.MatrixCursor;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;

/* renamed from: rxz */
final /* synthetic */ class rxz implements Runnable {

    /* renamed from: a */
    private final rya f43841a;

    /* renamed from: b */
    private final MatrixCursor f43842b;

    public rxz(rya rya, MatrixCursor matrixCursor) {
        this.f43841a = rya;
        this.f43842b = matrixCursor;
    }

    public final void run() {
        rya rya = this.f43841a;
        MatrixCursor matrixCursor = this.f43842b;
        ListView listView = (ListView) rya.f43843a.findViewById(16908298);
        if (listView.getAdapter() == null) {
            listView.setAdapter((ListAdapter) new ajb(rya.f43843a, matrixCursor, new String[]{DownloadServiceSettingsChimeraActivity.f30193e[1], DownloadServiceSettingsChimeraActivity.f30193e[2]}, new int[]{16908308, 16908309}));
        } else {
            ((aix) listView.getAdapter()).mo431a(matrixCursor);
        }
        DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity = rya.f43843a;
        downloadServiceSettingsChimeraActivity.f30195g.postDelayed(downloadServiceSettingsChimeraActivity.f30194f, 2000);
    }
}
