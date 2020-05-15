package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* renamed from: fpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpo extends SearchIndexablesProvider {

    /* renamed from: a */
    private fpq f17097a;

    public final boolean onCreate() {
        this.f17097a = new fpq(getContext().getApplicationContext());
        return true;
    }

    public final Cursor queryNonIndexableKeys(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        if (cdpc.m134579b()) {
            for (fpr fpr : this.f17097a.mo11113a(true)) {
                Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
                objArr[0] = fpr.mo11115b();
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    public final Cursor queryRawData(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        if (cdpc.m134579b()) {
            for (fpr fpr : this.f17097a.mo11113a(false)) {
                Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
                objArr[1] = fpr.mo11114a();
                GoogleSettingsItem googleSettingsItem = fpr.f17102b;
                objArr[2] = googleSettingsItem.f29963i;
                List list = googleSettingsItem.f29966l;
                String str = null;
                if (list != null && !list.isEmpty()) {
                    str = bmxr.m108544a(",").mo66874a((Iterable) list);
                }
                objArr[5] = str;
                objArr[12] = fpr.mo11115b();
                objArr[9] = fpr.f17103c;
                objArr[10] = fpr.f17104d;
                objArr[11] = fpr.f17105e;
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        return new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
    }
}
