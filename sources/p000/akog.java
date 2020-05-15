package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: akog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akog {

    /* renamed from: a */
    private static final srn f72352a = srn.m36127a(sgj.GUNS);

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r7 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r7 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a A[SYNTHETIC, Splitter:B:40:0x007a] */
    /* renamed from: a */
    public static synchronized List m60128a(Context context) {
        ArrayList arrayList;
        Cursor cursor;
        Exception e;
        blcs blcs;
        synchronized (akog.class) {
            arrayList = new ArrayList();
            SQLiteDatabase a = aknu.m60096a(context);
            if (a != null) {
                Cursor cursor2 = null;
                try {
                    cursor = a.rawQuery("SELECT * FROM notifications", null);
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                byte[] blob = cursor.getBlob(cursor.getColumnIndex("payload"));
                                if (blob == null || blob.length <= 0) {
                                    blcs = null;
                                } else {
                                    blcs = (blcs) bxvk.m124016a(blcs.f125974l, blob, bxus.m123744c());
                                }
                            } catch (bxwf e2) {
                                bnsl bnsl = (bnsl) f72352a.mo68387b();
                                bnsl.mo68437a(e2);
                                bnsl.mo68405a("Exception trying to parse payload from protocol buffer.");
                                blcs = null;
                            }
                            if (blcs != null) {
                                arrayList.add(blcs);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            try {
                                bnsl bnsl2 = (bnsl) f72352a.mo68387b();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68405a("Error while loading notifications from DB.");
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    cursor = null;
                    bnsl bnsl22 = (bnsl) f72352a.mo68387b();
                    bnsl22.mo68437a(e);
                    bnsl22.mo68405a("Error while loading notifications from DB.");
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized void m60129a(Context context, String str) {
        SQLiteDatabase b;
        synchronized (akog.class) {
            if (!TextUtils.isEmpty(str) && (b = aknu.m60098b(context)) != null) {
                try {
                    b.delete("notifications", "key = ? ", new String[]{str});
                } catch (Exception e) {
                    bnsl bnsl = (bnsl) f72352a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Error deleting from DB.");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m60130a(Context context, String str, blcs blcs) {
        synchronized (akog.class) {
            if (!TextUtils.isEmpty(str) && akoc.m60124c(blcs) && akoc.m60125d(blcs)) {
                if (blcs.f125983h == 0) {
                    bxvd a = blcs.f125974l.mo74141a(blcs);
                    long convert = TimeUnit.MICROSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    blcs blcs2 = (blcs) a.f164949b;
                    blcs2.f125976a |= 64;
                    blcs2.f125983h = convert;
                    blcs = (blcs) a.mo74062i();
                }
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("key", str);
                contentValues.put("payload", blcs.mo73642k());
                contentValues.put("insertion_time_ms", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("creation_time_usec", Long.valueOf(blcs.f125983h));
                SQLiteDatabase b = aknu.m60098b(context);
                if (b != null) {
                    try {
                        long insertWithOnConflict = b.insertWithOnConflict("notifications", null, contentValues, 5);
                        aknu.m60097a(b, TimeUnit.MICROSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) - cfqb.f185420a.mo6606a().mo82504q());
                        int i = (insertWithOnConflict > 0 ? 1 : (insertWithOnConflict == 0 ? 0 : -1));
                    } catch (Exception e) {
                        bnsl bnsl = (bnsl) f72352a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Error inserting in DB.");
                    }
                }
            }
        }
    }
}
