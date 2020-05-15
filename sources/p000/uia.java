package p000;

import android.database.Cursor;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: uia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uia implements uhx {

    /* renamed from: a */
    public static final uia f47671a = new uia();

    private uia() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        vow vow;
        int i = ukp.f48032g;
        String a = ukr.CONTENT_HASH.f48050k.mo27702a(cursor);
        long longValue = ukr.LAST_ACCESSED.f48050k.mo27705b(cursor).longValue();
        long longValue2 = ukr.SIZE_BYTES.f48050k.mo27705b(cursor).longValue();
        String a2 = ukr.INTERNAL_FILE_NAME.f48050k.mo27702a(cursor);
        String a3 = ukr.SHARED_FILE_NAME.f48050k.mo27702a(cursor);
        if (a3 != null) {
            vow = new vow(new SecretKeySpec(cursor.getBlob(cursor.getColumnIndexOrThrow(ukr.ENCRYPTION_KEY.f48050k.mo27700a())), ukr.ENCRYPTION_ALGORITHM.f48050k.mo27702a(cursor)), ukr.ENCRYPTION_ALGORITHM_PARAMETERS.f48050k.mo27702a(cursor), cursor.getBlob(cursor.getColumnIndexOrThrow(ukr.ENCRYPTION_ALGORITHM_IV.f48050k.mo27700a())));
        } else {
            vow = null;
        }
        uko a4 = ukp.m38865a(uno, a, longValue, longValue2);
        a4.f48027c = a2;
        sdo.m34975b(true, "encryptionSpec must be set if and only if sharedFilename is set.");
        a4.f48028d = a3;
        a4.f48029e = vow;
        return new ukp(a4, true);
    }
}
