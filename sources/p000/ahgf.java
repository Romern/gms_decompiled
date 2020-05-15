package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahgf */
final /* synthetic */ class ahgf implements Callable {

    /* renamed from: a */
    private final Context f67149a;

    /* renamed from: b */
    private final Uri f67150b;

    /* renamed from: c */
    private final String[] f67151c;

    /* renamed from: d */
    private final String f67152d;

    /* renamed from: e */
    private final String[] f67153e;

    /* renamed from: f */
    private final String f67154f;

    public ahgf(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f67149a = context;
        this.f67150b = uri;
        this.f67151c = strArr;
        this.f67152d = str;
        this.f67153e = strArr2;
        this.f67154f = str2;
    }

    public final Object call() {
        Context context = this.f67149a;
        Uri uri = this.f67150b;
        Cursor query = context.getContentResolver().query(uri, this.f67151c, this.f67152d, this.f67153e, this.f67154f);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            return query;
        }
        query.close();
        ((bnsl) ahfp.f67119a.mo68388c()).mo68420a("Failed to open %s because the Cursor was empty", uri);
        return null;
    }
}
