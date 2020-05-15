package p000;

import android.database.Cursor;
import java.io.IOException;

/* renamed from: ayto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayto implements ciwr {

    /* renamed from: a */
    public final ayti f98457a;

    public ayto(ayti ayti) {
        this.f98457a = ayti;
    }

    /* renamed from: a */
    public final ciwo mo54423a(civo civo) {
        throw null;
    }

    /* renamed from: a */
    public final void mo54424a(civo civo, ciwo ciwo) {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo54425b(civo civo) {
        throw null;
    }

    /* renamed from: c */
    public final ciwo mo54426c(civo civo) {
        ayti ayti = this.f98457a;
        String str = civo.f191537a;
        ayti.m84787a();
        Cursor query = ayti.f98447a.query("crypto_sessions", new String[]{"session_record"}, "user_id=? AND device_id=?", new String[]{str, "0"}, null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    ciwo ciwo = new ciwo(query.getBlob(0));
                    query.close();
                    return ciwo;
                }
            } catch (IOException e) {
                aytl.m84793a("DatabaseOperations", "EncryptionSession: IOException while deserializing SessionRecord", new Object[0]);
                query.close();
                return null;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
    }
}
