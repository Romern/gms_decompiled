package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;

/* renamed from: aksl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksl implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public final Context f72639a;

    /* renamed from: b */
    public final LoaderManager f72640b;

    /* renamed from: c */
    public final akua f72641c;

    /* renamed from: d */
    public boolean f72642d;

    /* renamed from: e */
    private final akso f72643e;

    public aksl(Context context, LoaderManager loaderManager, akso akso, akua akua) {
        this.f72639a = context;
        this.f72640b = loaderManager;
        this.f72643e = akso;
        this.f72641c = akua;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i != 112358) {
            return new CursorLoader(this.f72639a);
        }
        return new CursorLoader(this.f72639a, Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), aksk.f72638a, "mimetype = ?", new String[]{"vnd.android.cursor.item/name"}, null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f72642d) {
            this.f72642d = false;
            if (!cursor.isClosed()) {
                try {
                    cursor.moveToFirst();
                    if (!cursor.isAfterLast()) {
                        DeviceAccountName deviceAccountName = new DeviceAccountName(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
                        akte akte = this.f72643e.f72669d;
                        if (akte != null) {
                            akte.f72719a = deviceAccountName;
                        }
                    }
                } finally {
                    cursor.close();
                }
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
