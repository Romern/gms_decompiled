package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: cjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cjj implements cdt {

    /* renamed from: a */
    private static final String[] f6939a = {"_data"};

    /* renamed from: b */
    private final Context f6940b;

    /* renamed from: c */
    private final Uri f6941c;

    public cjj(Context context, Uri uri) {
        this.f6940b = context;
        this.f6941c = uri;
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return File.class;
    }

    /* renamed from: b */
    public final void mo3753b() {
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        Cursor query = this.f6940b.getContentResolver().query(this.f6941c, f6939a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(this.f6941c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(valueOf);
            cds.mo3761a((Exception) new FileNotFoundException(sb.toString()));
            return;
        }
        cds.mo3762a(new File(str));
    }
}
