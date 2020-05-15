package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.Iterator;

/* renamed from: acpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpe {

    /* renamed from: a */
    private static final String[] f60404a = {"event_id", "fingerprint"};

    /* renamed from: a */
    private static void m49651a(long j, long j2) {
        boolean z;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34972a(z, "IDs must be strictly increasing (previous was: %d, next is: %d)", Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    static void m49652a(Context context, Iterator it, boolean z, brhj brhj, abym abym) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        String str2;
        String str3;
        String str4;
        SQLiteDatabase sQLiteDatabase2;
        String str5;
        String str6;
        aucb aucb;
        long j;
        long j2;
        boolean z2;
        brhj brhj2;
        String str7;
        long j3;
        long j4;
        acoz acoz;
        long j5;
        String str8 = "DROP TABLE EventFingerprintsUpdates";
        String str9 = "INSERT OR REPLACE INTO EventFingerprints(event_id,fingerprint) SELECT event_id,fingerprint FROM EventFingerprintsUpdates WHERE fingerprint IS NOT NULL";
        String str10 = "DELETE FROM EventFingerprints WHERE event_id IN (SELECT event_id FROM EventFingerprintsUpdates WHERE fingerprint IS NULL)";
        acpi acpi = new acpi(context);
        SQLiteDatabase writableDatabase = acpi.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            try {
                Cursor query = writableDatabase.query("EventFingerprints", f60404a, null, null, null, null, "event_id");
                if (query == null) {
                    acnv.m49546b("Failed to query Event Fingerprint table.");
                    writableDatabase.endTransaction();
                } else {
                    try {
                        writableDatabase.execSQL("CREATE TEMP TABLE EventFingerprintsUpdates(event_id INTEGER PRIMARY KEY, fingerprint INTEGER)");
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            acnv.m49551c("EventIndexer: starting %s update", !z ? "incremental" : "full");
                            long j6 = Long.MIN_VALUE;
                            long j7 = Long.MIN_VALUE;
                            int i = 0;
                            aucb aucb2 = null;
                            long j8 = 0;
                            boolean z3 = true;
                            boolean z4 = true;
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            acoz acoz2 = null;
                            int i5 = 0;
                            while (true) {
                                if (!z3) {
                                    str6 = str10;
                                    j = j6;
                                    aucb = aucb2;
                                    sQLiteDatabase2 = writableDatabase;
                                    str3 = str9;
                                    str5 = str8;
                                    j2 = j8;
                                } else {
                                    acoz acoz3 = it.hasNext() ? (acoz) it.next() : null;
                                    if (acoz3 != null) {
                                        str5 = str8;
                                        try {
                                            j4 = acoz3.f60384a;
                                        } catch (Throwable th) {
                                            th = th;
                                            str3 = str9;
                                            str2 = str10;
                                            sQLiteDatabase = writableDatabase;
                                            str = str5;
                                            query.close();
                                            sQLiteDatabase.execSQL(str2);
                                            sQLiteDatabase.execSQL(str3);
                                            sQLiteDatabase.execSQL(str);
                                            sQLiteDatabase.setTransactionSuccessful();
                                            throw th;
                                        }
                                    } else {
                                        str5 = str8;
                                        j4 = Long.MAX_VALUE;
                                    }
                                    m49651a(j6, j4);
                                    if (acoz3 != null) {
                                        j = j4;
                                        acoz = acoz3;
                                        long a = acpc.m49649a(acpc.m49648a(acpc.m49648a(acpc.m49648a(-3750763034362895579L, 1), acoz.f60384a), 2), acoz.f60385b);
                                        if (acoz.f60386c != null) {
                                            a = acpc.m49649a(acpc.m49648a(a, 3), acoz.f60386c);
                                        }
                                        if (acoz.f60387d != null) {
                                            a = acpc.m49649a(acpc.m49648a(a, 4), acoz.f60387d);
                                        }
                                        Boolean bool = acoz.f60388e;
                                        if (bool != null) {
                                            str3 = str9;
                                            str6 = str10;
                                            try {
                                                long a2 = acpc.m49648a(a, 7);
                                                if (!bool.booleanValue()) {
                                                    j5 = 0;
                                                } else {
                                                    j5 = 1;
                                                }
                                                a = acpc.m49648a(a2, j5);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = str6;
                                                str = str5;
                                                sQLiteDatabase = writableDatabase;
                                                query.close();
                                                sQLiteDatabase.execSQL(str2);
                                                sQLiteDatabase.execSQL(str3);
                                                sQLiteDatabase.execSQL(str);
                                                sQLiteDatabase.setTransactionSuccessful();
                                                throw th;
                                            }
                                        } else {
                                            str3 = str9;
                                            str6 = str10;
                                        }
                                        acph[] acphArr = acoz.f60389f;
                                        int length = acphArr.length;
                                        int i6 = 0;
                                        while (i6 < length) {
                                            int i7 = length;
                                            acph acph = acphArr[i6];
                                            aucb aucb3 = aucb2;
                                            sQLiteDatabase2 = writableDatabase;
                                            try {
                                                a = acpc.m49648a(acpc.m49648a(acpc.m49648a(acpc.m49648a(acpc.m49648a(j2, 5), 1), acph.f60413a), 2), acph.f60414b);
                                                i6++;
                                                length = i7;
                                                writableDatabase = sQLiteDatabase2;
                                                aucb2 = aucb3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str2 = str6;
                                                str = str5;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            }
                                        }
                                        aucb = aucb2;
                                        sQLiteDatabase2 = writableDatabase;
                                        acow[] acowArr = acoz.f60390g;
                                        int length2 = acowArr.length;
                                        int i8 = 0;
                                        while (i8 < length2) {
                                            acow acow = acowArr[i8];
                                            acow[] acowArr2 = acowArr;
                                            int i9 = length2;
                                            j2 = acpc.m49649a(acpc.m49648a(acpc.m49648a(j2, 6), 1), acow.f60377a);
                                            if (acow.f60378b != null) {
                                                j2 = acpc.m49649a(acpc.m49648a(j2, 2), acow.f60378b);
                                            }
                                            if (!"none".equals(acow.mo32970a())) {
                                                j2 = acpc.m49649a(acpc.m49648a(j2, 3), acow.f60379c);
                                            }
                                            i8++;
                                            acowArr = acowArr2;
                                            length2 = i9;
                                        }
                                    } else {
                                        j = j4;
                                        str3 = str9;
                                        aucb = aucb2;
                                        sQLiteDatabase2 = writableDatabase;
                                        acoz = acoz3;
                                        str6 = str10;
                                        j2 = 0;
                                    }
                                    acoz2 = acoz;
                                }
                                if (z4) {
                                    query.moveToNext();
                                    if (!query.isAfterLast()) {
                                        j3 = query.getLong(0);
                                    } else {
                                        j3 = Long.MAX_VALUE;
                                    }
                                    m49651a(j7, j3);
                                    j7 = j3;
                                }
                                char c = 3;
                                if (j == Long.MAX_VALUE && j7 == Long.MAX_VALUE) {
                                    break;
                                }
                                int i10 = i;
                                str2 = str6;
                                str = str5;
                                int i11 = i3;
                                int i12 = i4;
                                sQLiteDatabase = sQLiteDatabase2;
                                aucb aucb4 = aucb;
                                if (j < j7) {
                                    i3 = i11 + 1;
                                    i4 = i12;
                                    c = 1;
                                    z2 = true;
                                    z4 = false;
                                } else if (j7 < j) {
                                    i4 = i12 + 1;
                                    i3 = i11;
                                    z2 = false;
                                    z4 = true;
                                } else {
                                    try {
                                        if (j2 != query.getLong(1)) {
                                            i10++;
                                            c = 1;
                                        } else {
                                            c = !z ? (char) 0 : 2;
                                            i2++;
                                        }
                                        i4 = i12;
                                        i3 = i11;
                                        z2 = true;
                                        z4 = true;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        query.close();
                                        sQLiteDatabase.execSQL(str2);
                                        sQLiteDatabase.execSQL(str3);
                                        sQLiteDatabase.execSQL(str);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        throw th;
                                    }
                                }
                                long j9 = currentTimeMillis;
                                if (c == 1) {
                                    ContentValues contentValues = new ContentValues();
                                    Long valueOf = Long.valueOf(j);
                                    contentValues.put("event_id", valueOf);
                                    Long valueOf2 = Long.valueOf(j2);
                                    contentValues.put("fingerprint", valueOf2);
                                    if (sQLiteDatabase.insertOrThrow("EventFingerprintsUpdates", null, contentValues) < 0) {
                                        if (Log.isLoggable("IcingInternalCorpora", 6)) {
                                            Log.e("IcingInternalCorpora", acnv.m49540a("Update event fingerprint failed! eventId=%d fingerprint=0x%x", valueOf, valueOf2));
                                        }
                                        i5++;
                                        brhj2 = brhj;
                                    } else if (acoz2 != null) {
                                        brhj2 = brhj;
                                        aucb4 = brhj2.mo32869a(acoz2.mo32973a().mo69547a());
                                    } else {
                                        brhj2 = brhj;
                                    }
                                } else {
                                    brhj2 = brhj;
                                    if (c != 2) {
                                        if (c == 3) {
                                            ContentValues contentValues2 = new ContentValues();
                                            Long valueOf3 = Long.valueOf(j7);
                                            contentValues2.put("event_id", valueOf3);
                                            contentValues2.putNull("fingerprint");
                                            if (sQLiteDatabase.insertOrThrow("EventFingerprintsUpdates", null, contentValues2) >= 0) {
                                                aucb4 = brhj2.mo32870a(acoz.m49644a(j7));
                                            } else {
                                                acnv.m49547b("Delete event fingerprint failed! eventId=%d", valueOf3);
                                                i5++;
                                            }
                                        }
                                    } else if (acoz2 != null) {
                                        aucb4 = brhj2.mo32869a(acoz2.mo32973a().mo69547a());
                                    }
                                }
                                str9 = str3;
                                z3 = z2;
                                i = i10;
                                writableDatabase = sQLiteDatabase;
                                aucb2 = aucb4;
                                j6 = j;
                                str10 = str2;
                                j8 = j2;
                                currentTimeMillis = j9;
                                str8 = str;
                            }
                            try {
                                Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5)};
                                if (Log.isLoggable("IcingInternalCorpora", 4)) {
                                    Log.i("IcingInternalCorpora", acnv.m49540a("EventIndexer: %d added, %d removed, %d changed, %d unchanged, %d errors.", objArr));
                                }
                                bxvd da = bpym.f139887f.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpym bpym = (bpym) da.f164949b;
                                "calendar".getClass();
                                int i13 = bpym.f139889a | 1;
                                bpym.f139889a = i13;
                                bpym.f139890b = "calendar";
                                int i14 = i13 | 2;
                                bpym.f139889a = i14;
                                bpym.f139891c = i3;
                                int i15 = i14 | 4;
                                bpym.f139889a = i15;
                                bpym.f139892d = i4;
                                bpym.f139889a = i15 | 8;
                                bpym.f139893e = i;
                                abym.mo32443a((bpym) da.mo74062i());
                                acpd acpd = new acpd(currentTimeMillis);
                                if (aucb == null) {
                                    acnv.m49551c("EventIndexer: finished after %d ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                } else {
                                    aucb.mo50371a(acpd);
                                }
                                try {
                                    query.close();
                                    str7 = str6;
                                    sQLiteDatabase = sQLiteDatabase2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    query.close();
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                sQLiteDatabase = sQLiteDatabase2;
                                str2 = str6;
                                str = str5;
                                query.close();
                                sQLiteDatabase.execSQL(str2);
                                sQLiteDatabase.execSQL(str3);
                                sQLiteDatabase.execSQL(str);
                                sQLiteDatabase.setTransactionSuccessful();
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str = str8;
                            str3 = str9;
                            str4 = str10;
                            sQLiteDatabase = writableDatabase;
                            query.close();
                            sQLiteDatabase.execSQL(str2);
                            sQLiteDatabase.execSQL(str3);
                            sQLiteDatabase.execSQL(str);
                            sQLiteDatabase.setTransactionSuccessful();
                            throw th;
                        }
                        try {
                            sQLiteDatabase.execSQL(str7);
                            sQLiteDatabase.execSQL(str3);
                            sQLiteDatabase.execSQL(str5);
                            sQLiteDatabase.setTransactionSuccessful();
                        } catch (Throwable th8) {
                            th = th8;
                            query.close();
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteDatabase = writableDatabase;
                        query.close();
                        throw th;
                    }
                    try {
                        query.close();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                sQLiteDatabase = writableDatabase;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } finally {
            acpi.close();
        }
    }
}
