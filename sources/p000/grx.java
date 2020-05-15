package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: grx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grx implements grn {

    /* renamed from: a */
    private static final byte[] f18913a = {71, 111, 111, 103, 108, 101, 79, 102, 102, 108, 105, 110, 101, 79, 84, 80};

    /* renamed from: b */
    private static final byte[] f18914b = {84, 72, 79, 84, 80, 45, 67, 111, 117, 110, 116, 101, 114};

    /* renamed from: c */
    private final grw f18915c;

    /* renamed from: a */
    private static final Long m13790a(byte[] bArr) {
        MessageDigest b = spn.m35868b("SHA256");
        if (b != null) {
            byte[] digest = b.digest(f18913a);
            try {
                return Long.valueOf(ByteBuffer.wrap(byst.m125284a(new SecretKeySpec(bArr, "AES"), digest, f18914b)).order(ByteOrder.LITTLE_ENDIAN).getLong() & Long.MAX_VALUE);
            } catch (GeneralSecurityException e) {
            }
        }
        return null;
    }

    public grx(Context context) {
        this.f18915c = new grw(context);
    }

    /* renamed from: a */
    public final Long mo12136a(grv grv) {
        String str;
        Long l;
        long j;
        grv grv2 = grv;
        try {
            byte[] bArr = grv2.f18911b;
            MessageDigest b = spn.m35868b("SHA256");
            if (b != null) {
                b.update(bArr);
                str = srv.m36164d(b.digest());
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            try {
                SQLiteDatabase writableDatabase = this.f18915c.getWritableDatabase();
                writableDatabase.beginTransaction();
                Cursor query = writableDatabase.query("otp_counters", new String[]{"counter"}, "otp_secret_hash = ?", new String[]{str}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        l = m13790a(grv2.f18911b);
                        if (l == null) {
                            query.close();
                            writableDatabase.endTransaction();
                            return null;
                        }
                    } else {
                        l = Long.valueOf(query.getLong(query.getColumnIndexOrThrow("counter")));
                    }
                    query.close();
                    ContentValues contentValues = new ContentValues();
                    if (l.longValue() != Long.MAX_VALUE) {
                        j = l.longValue() + 1;
                    } else {
                        j = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    contentValues.put("counter", Long.valueOf(j));
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    contentValues.put("modification_time_millis", valueOf);
                    if (writableDatabase.update("otp_counters", contentValues, "otp_secret_hash = ?", new String[]{str}) == 0) {
                        contentValues.put("otp_secret_hash", str);
                        contentValues.put("account_name", grv2.f18910a);
                        contentValues.put("creation_time_millis", valueOf);
                        contentValues.put("otp_secret_creation_time_millis", Long.valueOf(grv2.f18912c));
                        if (writableDatabase.insert("otp_counters", null, contentValues) == -1) {
                            writableDatabase.endTransaction();
                            return null;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return l;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                Log.e("SqliteCounterStorage", "Unexpected exception.", e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            Log.e("SqliteCounterStorage", "Unexpected exception.", e);
            return null;
        }
    }
}
