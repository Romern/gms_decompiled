package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfq {

    /* renamed from: a */
    static final SharedPreferences f88850a = rpr.m34216b().getSharedPreferences("EastworldUtilPrefs", 0);

    /* renamed from: b */
    public static final /* synthetic */ int f88851b = 0;

    /* renamed from: c */
    private static avua f88852c = null;

    /* renamed from: a */
    public static int m73984a(qxq qxq) {
        try {
            return ((Integer) aucu.m76783a(qwh.m32998a(rpr.m34216b()).mo24319a(), cgtd.f187715a.mo6606a().mo84475d(), TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return -1;
        } catch (ExecutionException | TimeoutException e2) {
            qxq.mo24383c("EastworldBootApiFailure").mo24359a();
            qxq.mo24388e();
            return -1;
        }
    }

    /* renamed from: a */
    public static long m73985a(Context context) {
        return spn.getAndroidId(context) % TimeUnit.DAYS.toMillis(1);
    }

    /* renamed from: a */
    static bxvd m73986a(boolean z, boolean z2, int i, qxq qxq) {
        cala cala;
        boolean z3;
        int i2;
        Cursor query;
        Throwable th;
        if (!cgtd.m146970b()) {
            return cala.f175092h.mo74144da();
        }
        try {
            String str = "";
            if (!cguw.m147106b()) {
                str = f88850a.getString(":eastworldStats", str);
            } else {
                try {
                    query = asfo.m73974a(rpr.m34216b()).getReadableDatabase().query("eastworld_stats", new String[]{"stats_proto"}, null, null, null, null, null);
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("stats_proto"));
                        if (query != null) {
                            query.close();
                        }
                        str = string;
                    } else if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e) {
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            cala = (cala) GeneratedMessageLite.m124014a(cala.f175092h, Base64.decode(str, 0));
        } catch (bxwf e2) {
            qxq.mo24383c("EastworldStatsParseFailure").mo24359a();
            qxq.mo24388e();
            cala = cala.f175092h;
        }
        int i3 = cala.f175095b;
        int i4 = cala.f175096c;
        bxvd bxvd = (bxvd) cala.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cala);
        if (z) {
            int i5 = i3 + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cala cala2 = (cala) bxvd.f164949b;
            cala2.f175094a |= 1;
            cala2.f175095b = i5;
        }
        if (z2) {
            int i6 = i4 + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cala cala3 = (cala) bxvd.f164949b;
            cala3.f175094a |= 2;
            cala3.f175096c = i6;
            i2 = 0;
            z3 = true;
        } else {
            i2 = 0;
            z3 = true;
        }
        while (i2 < ((cala) bxvd.f164949b).f175097d.size()) {
            cakw cakw = (cakw) ((cala) bxvd.f164949b).f175097d.get(i2);
            calc a = calc.m126745a(cakw.f175075b);
            if (a == null) {
                a = calc.UNKNOWN;
            }
            if (a.f175111i == i) {
                int i7 = cakw.f175076c;
                bxvd bxvd2 = (bxvd) cakw.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) cakw);
                int i8 = i7 + 1;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cakw cakw2 = (cakw) bxvd2.f164949b;
                cakw cakw3 = cakw.f175072d;
                cakw2.f175074a |= 2;
                cakw2.f175076c = i8;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cala cala4 = (cala) bxvd.f164949b;
                cakw cakw4 = (cakw) bxvd2.mo74062i();
                cakw4.getClass();
                cala4.mo74657c();
                cala4.f175097d.set(i2, cakw4);
                z3 = false;
            }
            i2++;
        }
        if (z3) {
            calc a2 = calc.m126745a(i);
            bxvd da = cakw.f175072d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakw cakw5 = (cakw) da.f164949b;
            cakw5.f175075b = a2.f175111i;
            int i9 = cakw5.f175074a | 1;
            cakw5.f175074a = i9;
            cakw5.f175074a = i9 | 2;
            cakw5.f175076c = 1;
            cakw cakw6 = (cakw) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cala cala5 = (cala) bxvd.f164949b;
            cakw6.getClass();
            cala5.mo74657c();
            cala5.f175097d.add(cakw6);
        }
        return bxvd;
        throw th;
    }

    /* renamed from: a */
    public static void m73987a(bxvd bxvd, int i, int i2) {
        if (cgtd.m146970b()) {
            bxvd da = cakx.f175077f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakx cakx = (cakx) da.f164949b;
            cakx.f175080b = i2 - 1;
            cakx.f175079a |= 1;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakx cakx2 = (cakx) da.f164949b;
            cakx2.f175079a |= 2;
            cakx2.f175081c = elapsedRealtime;
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakx cakx3 = (cakx) da.f164949b;
            int i3 = cakx3.f175079a | 4;
            cakx3.f175079a = i3;
            cakx3.f175082d = currentTimeMillis;
            cakx3.f175079a = i3 | 8;
            cakx3.f175083e = i;
            ArrayDeque arrayDeque = new ArrayDeque(Collections.unmodifiableList(((cala) bxvd.f164949b).f175099f));
            arrayDeque.addFirst((cakx) da.mo74062i());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cala cala = cala.f175092h;
            ((cala) bxvd.f164949b).f175099f = GeneratedMessageLite.m124030de();
            Iterator it = arrayDeque.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                cakx cakx4 = (cakx) it.next();
                if (i4 < 10) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cala cala2 = (cala) bxvd.f164949b;
                    cakx4.getClass();
                    if (!cala2.f175099f.mo73666a()) {
                        cala2.f175099f = GeneratedMessageLite.m124021a(cala2.f175099f);
                    }
                    cala2.f175099f.add(cakx4);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m73988a(bxvd bxvd, int i, int i2, long j, long j2) {
        if (cgtd.m146970b()) {
            caky caky = (caky) Collections.unmodifiableMap(Collections.unmodifiableMap(((cala) bxvd.f164949b).f175098e)).get(3);
            bxvd da = caky.f175084f.mo74144da();
            if (caky != null) {
                da = (bxvd) caky.mo74142c(5);
                da.mo73625a((GeneratedMessageLite) caky);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caky caky2 = (caky) da.f164949b;
            int i3 = caky2.f175086a | 1;
            caky2.f175086a = i3;
            caky2.f175087b = i;
            int i4 = i3 | 8;
            caky2.f175086a = i4;
            caky2.f175090e = i2;
            int i5 = i4 | 2;
            caky2.f175086a = i5;
            caky2.f175088c = j;
            caky2.f175086a = i5 | 4;
            caky2.f175089d = j2;
            caky caky3 = (caky) da.mo74062i();
            caky3.getClass();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cala cala = (cala) bxvd.f164949b;
            cala cala2 = cala.f175092h;
            bxww bxww = cala.f175098e;
            if (!bxww.f165014a) {
                cala.f175098e = bxww.mo74203a();
            }
            cala.f175098e.put(3, caky3);
        }
    }

    /* renamed from: a */
    static void m73989a(cala cala) {
        if (!cgtd.m146970b()) {
            return;
        }
        if (cguw.m147106b()) {
            asfo a = asfo.m73974a(rpr.m34216b());
            String encodeToString = Base64.encodeToString(cala.serializeToBytes(), 0);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("stats_proto", encodeToString);
                a.getWritableDatabase().update("eastworld_stats", contentValues, null, null);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = f88850a.edit();
            edit.putString(":eastworldStats", Base64.encodeToString(cala.serializeToBytes(), 0));
            edit.apply();
        }
    }

    /* renamed from: a */
    public static void m73990a(rjx rjx, qws qws, qxq qxq, bxvd bxvd, boolean z, List list, boolean z2, boolean z3, String str, String str2, int i, bxvd bxvd2) {
        qws qws2 = qws;
        qxq qxq2 = qxq;
        bxvd bxvd3 = bxvd;
        List list2 = list;
        boolean z4 = z2;
        boolean z5 = z3;
        String str3 = str2;
        bxvd bxvd4 = bxvd2;
        if (rjx != null) {
            m73991a(rjx, qxq, bxvd, str2, i, bxvd2);
            qxq.mo24388e();
        } else if (!z && !z4 && !z5) {
            qxq2.mo24383c("REQUEST_UPLOAD_WITHOUT_CONSENT").mo24359a();
            qxq.mo24388e();
        } else if (z && (list2 == null || list.isEmpty())) {
            qxq2.mo24383c(str.concat("_LOCKBOX_OPTED_IN_WITH_EMPTY_ACCOUNTS")).mo24359a();
            qxq.mo24388e();
        } else {
            bxvd da = cald.f175112d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cald cald = (cald) da.f164949b;
            cald.f175114a |= 4;
            cald.f175116c = z5;
            bxvd da2 = bosx.f134741g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosx bosx = (bosx) da2.f164949b;
            bosx.f134743a |= 2;
            bosx.f134745c = z4;
            int i2 = 1;
            if (!z) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cald cald2 = (cald) da.f164949b;
                bosx bosx2 = (bosx) da2.mo74062i();
                bosx2.getClass();
                cald2.f175115b = bosx2;
                cald2.f175114a |= 2;
                if (bxvd3.f164950c) {
                    bxvd.mo74035c();
                    bxvd3.f164950c = false;
                }
                calg calg = (calg) bxvd3.f164949b;
                cald cald3 = (cald) da.mo74062i();
                calg calg2 = calg.f175118j;
                cald3.getClass();
                calg.f175122c = cald3;
                calg.f175120a |= 2;
                qwo a = qws2.mo24335a(((calg) bxvd.mo74062i()).serializeToBytes());
                a.f42322f = cagz.m126622a(i);
                a.f42320d = str3;
                a.mo24327b();
                if (cgtd.m146973e()) {
                    calg calg3 = (calg) bxvd.mo74062i();
                    int i3 = calg3.f164961ai;
                    if (i3 == -1) {
                        i3 = bxxm.f165037a.mo74228a(calg3).mo74223b(calg3);
                        calg3.f164961ai = i3;
                    }
                    int a2 = calf.m126750a(((calg) bxvd3.f164949b).f175121b);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    m73987a(bxvd4, i3, i2);
                    return;
                }
                return;
            }
            int size = list.size();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosx bosx3 = (bosx) da2.f164949b;
            bosx3.f134743a |= 1;
            bosx3.f134744b = size;
            for (int i4 = 0; i4 < list.size(); i4++) {
                aeyi aeyi = (aeyi) list2.get(i4);
                if (cgsl.m146894b()) {
                    boolean c = aeyi.mo34651c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bosx bosx4 = (bosx) da2.f164949b;
                    bosx4.f134743a |= 32;
                    bosx4.f134748f = c;
                } else {
                    boolean d = aeyi.mo34652d();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bosx bosx5 = (bosx) da2.f164949b;
                    bosx5.f134743a |= 8;
                    bosx5.f134747e = d;
                }
                bosx bosx6 = (bosx) da2.f164949b;
                bosx6.f134743a |= 4;
                bosx6.f134746d = i4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cald cald4 = (cald) da.f164949b;
                bosx bosx7 = (bosx) da2.mo74062i();
                bosx7.getClass();
                cald4.f175115b = bosx7;
                cald4.f175114a |= 2;
                if (bxvd3.f164950c) {
                    bxvd.mo74035c();
                    bxvd3.f164950c = false;
                }
                calg calg4 = (calg) bxvd3.f164949b;
                cald cald5 = (cald) da.mo74062i();
                calg calg5 = calg.f175118j;
                cald5.getClass();
                calg4.f175122c = cald5;
                calg4.f175120a |= 2;
                qwo a3 = qws2.mo24335a(((calg) bxvd.mo74062i()).serializeToBytes());
                a3.mo24330c(aeyi.mo34650b());
                a3.f42322f = cagz.m126622a(i);
                a3.f42320d = str3;
                a3.mo24327b();
            }
            if (cgtd.m146973e()) {
                calg calg6 = (calg) bxvd.mo74062i();
                int i5 = calg6.f164961ai;
                if (i5 == -1) {
                    i5 = bxxm.f165037a.mo74228a(calg6).mo74223b(calg6);
                    calg6.f164961ai = i5;
                }
                int a4 = calf.m126750a(((calg) bxvd3.f164949b).f175121b);
                if (a4 != 0) {
                    i2 = a4;
                }
                m73987a(bxvd4, i5, i2);
            }
        }
    }

    /* renamed from: a */
    private static void m73991a(rjx rjx, qxq qxq, bxvd bxvd, String str, int i, bxvd bxvd2) {
        calg calg = (calg) bxvd.mo74062i();
        try {
            byte[] k = calg.serializeToBytes();
            if (f88852c == null) {
                f88852c = new asfp();
            }
            aucb a = rjx.mo24695a(str, k, f88852c, i);
            if (cgtd.m146973e()) {
                aucu.m76783a(a, 10000, TimeUnit.MILLISECONDS);
                if (a.mo50384b()) {
                    int i2 = calg.f164961ai;
                    if (i2 == -1) {
                        i2 = bxxm.f165037a.mo74228a(calg).mo74223b(calg);
                        calg.f164961ai = i2;
                    }
                    int a2 = calf.m126750a(calg.f175121b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    m73987a(bxvd2, i2, a2);
                }
            }
        } catch (ExecutionException | TimeoutException e) {
            if (cgtd.m146972d()) {
                qxq.mo24383c("ConsentApiUploadException").mo24359a();
            }
        } catch (InterruptedException e2) {
            if (cgtd.m146972d()) {
                qxq.mo24383c("ConsentApiUploadException").mo24359a();
            }
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    static boolean m73992a() {
        long j;
        rpr b = rpr.m34216b();
        long currentTimeMillis = System.currentTimeMillis();
        if (cguw.m147106b()) {
            j = asfo.m73974a(rpr.m34216b()).mo49134a();
        } else {
            j = f88850a.getLong(":lastRandomSplitMillis", -1);
        }
        if (currentTimeMillis - j < TimeUnit.DAYS.toMillis(1)) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() + m73985a(b);
        if (cguw.m147106b()) {
            asfo a = asfo.m73974a(rpr.m34216b());
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_split_millis", Long.valueOf(timeInMillis));
                a.getWritableDatabase().update("eastworld_stats", contentValues, null, null);
                return true;
            } catch (SQLiteException e) {
                return true;
            }
        } else {
            SharedPreferences.Editor edit = f88850a.edit();
            edit.putLong(":lastRandomSplitMillis", timeInMillis);
            edit.apply();
            return true;
        }
    }
}
