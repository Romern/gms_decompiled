package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mhg {

    /* renamed from: a */
    static final String[] f33718a = {"_data"};

    /* renamed from: b */
    private static final lvn f33719b = new lvn("MediaFetcher");

    /* renamed from: c */
    private final Context f33720c;

    public mhg(Context context) {
        this.f33720c = context;
    }

    /* renamed from: a */
    public final List mo20014a(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f33720c.getContentResolver().query(uri, f33718a, null, null, null);
        if (query == null) {
            f33719b.mo25416d("MediaStore provider not found.", new Object[0]);
            return arrayList;
        }
        if (query.moveToFirst()) {
            do {
                String string = query.getString(query.getColumnIndex("_data"));
                if (cckx.f179265a.mo6606a().mo76208d() && string == null) {
                    f33719b.mo25416d("Ignoring media with no path.", new Object[0]);
                } else {
                    arrayList.add(string);
                }
            } while (query.moveToNext());
        }
        query.close();
        return arrayList;
    }
}
