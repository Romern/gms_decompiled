package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: rbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbq {
    /* renamed from: a */
    public static rbp m33303a(Context context, rdq rdq) {
        sdo.m34959a(context);
        if (!cdeb.f180572a.mo6606a().mo77324a()) {
            try {
                bnre i = rdq.mo24519b().listIterator();
                while (i.hasNext()) {
                    if (((rdp) i.next()).mo24489a("METALOG_COUNTERS")) {
                        qws qws = new qws(context, "METALOG_COUNTERS", null);
                        return new rbn(context, qws, new qxq(qws, "METALOG_COUNTERS", (int) cdeb.f180572a.mo6606a().mo77327d()));
                    }
                }
            } catch (SQLiteException e) {
                Log.e("MetaLoggerFactory", "Failed to check if log store has non metalog log source logs.", e);
            }
        }
        return new rbo();
    }
}
