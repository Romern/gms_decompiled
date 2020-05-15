package p000;

import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import com.google.android.gms.mdi.download.p054ui.DebugUiChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqf implements aubw {

    /* renamed from: a */
    final /* synthetic */ DebugUiChimeraActivity f64543a;

    public afqf(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.f64543a = debugUiChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (FileGroupWithDownloadStatus fileGroupWithDownloadStatus : (List) obj) {
            Object[] objArr = {"DebugUiChimeraActivity", fileGroupWithDownloadStatus.f79965a, fileGroupWithDownloadStatus.f79966b};
            arrayList.add("GroupName = " + fileGroupWithDownloadStatus.f79965a + "\nOwnerPackage = " + fileGroupWithDownloadStatus.f79966b + "\nFileGroupVersionNumber = " + fileGroupWithDownloadStatus.f79967c + "\nDownloaded = " + fileGroupWithDownloadStatus.f79968d);
        }
        this.f64543a.f80024b.clear();
        this.f64543a.f80024b.addAll(arrayList);
    }
}
