package p000;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: adsz */
final /* synthetic */ class adsz implements Runnable {

    /* renamed from: a */
    private final adta f62676a;

    /* renamed from: b */
    private final boolean f62677b;

    /* renamed from: c */
    private final boolean f62678c;

    public adsz(adta adta, boolean z, boolean z2) {
        this.f62676a = adta;
        this.f62677b = z;
        this.f62678c = z2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x08aa  */
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        String str2;
        adta adta;
        C1240of ofVar;
        bxvd bxvd;
        int i;
        char c;
        char c2;
        char c3;
        bnkc bnkc;
        adno adno;
        Integer num;
        int i2;
        Integer num2;
        String str3;
        Iterator it;
        adtc adtc;
        int i3;
        String str4;
        bngx bngx;
        int size;
        int i4;
        adtg adtg;
        brhy brhy;
        adsr adsr;
        String str5;
        String str6;
        String str7;
        Throwable th;
        Throwable th2;
        adsp adsp;
        int i5;
        Throwable th3;
        Throwable th4;
        adta adta2 = this.f62676a;
        boolean z = this.f62677b;
        boolean z2 = this.f62678c;
        bxvd da = bome.f133636h.mo74144da();
        int i6 = 0;
        if (!z && !z2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bome) da.f164949b).f133638a = bomd.m111330a(3);
        } else if (!z) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bome) da.f164949b).f133638a = bomd.m111330a(4);
        } else if (!z2) {
            adns.m50862a().mo33690a(11);
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bome) da.f164949b).f133638a = bomd.m111330a(5);
        }
        bome bome = (bome) da.mo74062i();
        bxvd bxvd2 = (bxvd) bome.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bome);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            adta.m51153b(adta2.f62686d);
        }
        if (!z2) {
            int a = adta2.f62687e.mo33804a("sms", adta2.mo33795b(), adta2.mo33797d());
            int a2 = adta2.f62687e.mo33804a("mms", adta2.mo33796c(), adta2.mo33798e());
            if (((long) (a + a2)) > ceqm.f183265a.mo6606a().mo79610W()) {
                adnt.m50872b("Too many new messages. numNewSms = %d, numNewMms = %d Wait for batch indexing instead.", Integer.valueOf(a), Integer.valueOf(a2));
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                ((bome) bxvd2.f164949b).f133639b = 1;
                adns.m50862a().mo33693a((bome) bxvd2.mo74062i());
                return;
            }
        }
        adta2.mo33799f();
        int i7 = ((bome) bxvd2.f164949b).f133642e;
        boolean z3 = z2;
        String str8 = "mms";
        adtb a3 = adta2.mo33793a().mo33801a("sms", new adtd(adta2.f62687e, Math.max(adta2.mo33795b(), adtg.m51177a()), adta2.mo33797d()));
        C1240of ofVar2 = a3.f62691b;
        String str9 = "last_sms_date";
        if (ofVar2 != null) {
            adta.m51157f(adta2.f62686d).edit().putLong(str9, ((Long) ofVar2.f26798a).longValue()).apply();
            adta.m51157f(adta2.f62686d).edit().putInt("last_sms_id", ((Integer) a3.f62691b.f26799b).intValue()).apply();
        }
        int i8 = i7 + a3.f62690a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((bome) bxvd2.f164949b).f133642e = i8;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        new Object[1][0] = Long.valueOf(elapsedRealtime2 - elapsedRealtime);
        int i9 = ((bome) bxvd2.f164949b).f133642e;
        long j = elapsedRealtime;
        String str10 = str8;
        adtb a4 = adta2.mo33793a().mo33801a(str10, new adte(adta2.f62687e, Math.max(adta2.mo33796c(), adtg.m51177a() / 1000), adta2.mo33798e()));
        C1240of ofVar3 = a4.f62691b;
        String str11 = "last_mms_date";
        if (ofVar3 != null) {
            adta.m51157f(adta2.f62686d).edit().putLong(str11, ((Long) ofVar3.f26798a).longValue()).apply();
            adta.m51157f(adta2.f62686d).edit().putInt("last_mms_id", ((Integer) a4.f62691b.f26799b).intValue()).apply();
        }
        int i10 = i9 + a4.f62690a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((bome) bxvd2.f164949b).f133642e = i10;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        new Object[1][0] = Long.valueOf(elapsedRealtime3 - elapsedRealtime2);
        if (z3) {
            Object[] objArr = {Long.valueOf(adta2.mo33795b()), Long.valueOf(adta2.mo33796c())};
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            adtc a5 = adta2.mo33793a();
            try {
                sQLiteDatabase = a5.getReadableDatabase();
            } catch (SQLiteException e) {
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase != null) {
                Cursor query = sQLiteDatabase.query("mmssms", adtc.f62692a, "read=?", new String[]{"0"}, null, null, null, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            int intValue = sra.m36061a(query, 0, (Integer) 0).intValue();
                            if (!"sms".equals(query.getString(1))) {
                                hashSet2.add(String.format(Locale.US, "'%d;%d'", Integer.valueOf(intValue), Long.valueOf(query.getLong(2))));
                                str11 = str11;
                                str9 = str9;
                            } else {
                                String str12 = str9;
                                String str13 = str11;
                                hashSet.add(String.format(Locale.US, "'%d;%d'", Integer.valueOf(intValue), Long.valueOf(query.getLong(2))));
                                str11 = str13;
                                str9 = str12;
                            }
                        } catch (Throwable th5) {
                            bqye.m113761a(th4, th5);
                        }
                    }
                    str = str9;
                    str2 = str11;
                    query.close();
                } else {
                    str = str9;
                    str2 = str11;
                    adnt.m50871b("Got null Cursor in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
                }
            } else {
                str = str9;
                str2 = str11;
                adnt.m50871b("Got null db in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
            }
            Object[] objArr2 = {Integer.valueOf(hashSet.size()), Integer.valueOf(hashSet2.size())};
            int max = Math.max(1, (int) ceqm.f183265a.mo6606a().mo79601N());
            List a6 = adta2.f62687e.mo33808a(max, adta.f62679a, hashSet);
            int a7 = a5.mo33800a(a6, "sms", adta2.f62687e);
            List a8 = adta2.f62687e.mo33808a(max, adta.f62680b, hashSet2);
            Object[] objArr3 = {Integer.valueOf(a6.size()), Integer.valueOf(a8.size())};
            int a9 = a7 + a5.mo33800a(a8, str10, adta2.f62687e);
            new Object[1][0] = Integer.valueOf(a9);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((bome) bxvd2.f164949b).f133641d = a9;
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            new Object[1][0] = Long.valueOf(elapsedRealtime4 - elapsedRealtime3);
            adtc a10 = adta2.mo33793a();
            Iterator a11 = adta2.f62687e.mo33807a(adta.f62679a);
            Iterator a12 = adta2.f62687e.mo33807a(adta.f62680b);
            SQLiteDatabase a13 = a10.mo33802a();
            if (a13 == null) {
                adnt.m50871b("Got null db in SmsCorpusDbOpenHelper.processDeletions.");
                ofVar = new C1240of(null, 0);
                adta = adta2;
            } else {
                HashSet<Integer> hashSet3 = new HashSet();
                HashSet<Integer> hashSet4 = new HashSet();
                Cursor query2 = a13.query("mmssms", adtc.f62693b, null, null, null, null, null, null);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        try {
                            Integer a14 = sra.m36060a(query2, 0);
                            if (a14 != null) {
                                adta adta3 = adta2;
                                if (!"sms".equals(sra.m36069c(query2, 1))) {
                                    hashSet4.add(a14);
                                    adta2 = adta3;
                                } else {
                                    hashSet3.add(a14);
                                    adta2 = adta3;
                                }
                            }
                        } catch (Throwable th6) {
                            bqye.m113761a(th3, th6);
                        }
                    }
                    adta = adta2;
                    query2.close();
                    while (a11.hasNext()) {
                        hashSet3.remove(a11.next());
                    }
                    while (a12.hasNext()) {
                        hashSet4.remove(a12.next());
                    }
                    a13.beginTransaction();
                    try {
                        adsm adsm = new adsm(a10.f62696d, (int) ceqm.f183265a.mo6606a().mo79598K());
                        for (Integer num3 : hashSet3) {
                            a13.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num3), "sms"});
                            adsm.mo33683a(adtc.m51168a("sms", num3));
                        }
                        for (Integer num4 : hashSet4) {
                            a13.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num4), str10});
                            adsm.mo33683a(adtc.m51168a(str10, num4));
                        }
                        adsm.mo33684b();
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        a13.setTransactionSuccessful();
                        a13.endTransaction();
                        adnt.m50872b("Processed %d SMS and %d MMS deletions", Integer.valueOf(hashSet3.size()), Integer.valueOf(hashSet4.size()));
                        ofVar = new C1240of(valueOf, Integer.valueOf(hashSet3.size() + hashSet4.size()));
                    } catch (Throwable th7) {
                        a13.endTransaction();
                        throw th7;
                    }
                } else {
                    adta = adta2;
                    adnt.m50871b("Got null cursor in SmsCorpusDbOpenHelper.processDeletions.");
                    ofVar = new C1240of(null, 0);
                }
            }
            int intValue2 = ((Integer) ofVar.f26799b).intValue();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((bome) bxvd2.f164949b).f133643f = intValue2;
            new Object[1][0] = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime4);
            if (ceqm.m137880k()) {
                adtc a15 = adta.mo33793a();
                brhj d = adta.m51155d(adta.f62686d);
                adsp adsp2 = adta.f62688f;
                adtg adtg2 = adta.f62687e;
                if (ceqm.m137880k()) {
                    SQLiteDatabase a16 = a15.mo33802a();
                    if (a16 == null) {
                        adnt.m50871b("Null db in sms contact annotations");
                        bxvd = bxvd2;
                        i = -1;
                    } else {
                        bnkc a17 = bnkc.m109632a();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            if (((long) i11) < ceqm.f183265a.mo6606a().mo79623h()) {
                                Cursor a18 = adsp2.f62644c.mo33689a(ContactsContract.Data.CONTENT_URI, adsp.f62642a, "mimetype = ?", adsp.f62643b, String.format(Locale.US, "_id DESC LIMIT %d OFFSET %d", Long.valueOf(ceqm.m137871b()), Integer.valueOf(i12)));
                                if (a18 == null) {
                                    adnt.m50871b("Null cursor in updatePhoneNumberToNamesMap()");
                                    adns.m50862a().mo33690a(22);
                                    adsp = adsp2;
                                    i5 = -1;
                                } else {
                                    i5 = 0;
                                    while (a18.moveToNext()) {
                                        i5++;
                                        String c4 = sra.m36069c(a18, 0);
                                        adsp adsp3 = adsp2;
                                        String a19 = adnu.m50878a(adsp2.f62645d, sra.m36069c(a18, 1));
                                        if (TextUtils.isEmpty(c4) || TextUtils.isEmpty(a19)) {
                                            adnt.m50872b("Empty contactName<%s> or phoneNumber<%s>", c4, a19);
                                        } else {
                                            a17.mo67268a(a19, c4);
                                        }
                                        adsp2 = adsp3;
                                    }
                                    adsp = adsp2;
                                }
                                if (i5 == -1) {
                                    c3 = 1;
                                    c2 = 0;
                                    a17 = null;
                                    break;
                                }
                                i11 += i5;
                                if (((long) i5) < ceqm.m137871b()) {
                                    break;
                                }
                                i12 = (int) (((long) i12) + ceqm.m137871b());
                                adsp2 = adsp;
                            } else {
                                break;
                            }
                        }
                        c3 = 1;
                        c2 = 0;
                        new Object[1][0] = a17;
                        if (a17 != null) {
                            String[] strArr = new String[2];
                            strArr[c2] = "phone_number";
                            strArr[c3] = "contact_name";
                            Cursor a20 = adso.m51104a(a16, "contact_annotation", strArr, null, null);
                            if (a20 == null) {
                                try {
                                    adnt.m50871b("Null Cursor in getPhoneNumberToNamesMap()");
                                    bxvd = bxvd2;
                                    bnkc = null;
                                } catch (Throwable th8) {
                                    bqye.m113761a(th2, th8);
                                }
                            } else {
                                bnkc a21 = bnkc.m109632a();
                                while (a20.moveToNext()) {
                                    String b = bmxx.m108578b(sra.m36063a(a20, 0, ""));
                                    String b2 = bmxx.m108578b(sra.m36063a(a20, 1, ""));
                                    if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
                                        a21.mo67268a(b, b2);
                                    } else {
                                        bxvd bxvd3 = bxvd2;
                                        bnkc bnkc2 = a21;
                                        adnt.m50872b("Empty phoneNumber<%s> or contactName<%s>", b, b2);
                                        a21 = bnkc2;
                                        bxvd2 = bxvd3;
                                    }
                                }
                                bxvd = bxvd2;
                                a20.close();
                                bnkc = a21;
                            }
                            if (bnkc != null) {
                                Object[] objArr4 = {a17, bnkc};
                                HashSet hashSet5 = new HashSet();
                                Iterator it2 = bnkc.mo67902b().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    String str14 = (String) entry.getKey();
                                    String str15 = (String) entry.getValue();
                                    if (!a17.mo67309b(str14, str15)) {
                                        a16.delete("contact_annotation", "phone_number=? AND contact_name=?", new String[]{str14, str15});
                                        hashSet5.add(str14);
                                        it2 = it2;
                                        adtg2 = adtg2;
                                    }
                                }
                                adtg adtg3 = adtg2;
                                for (Map.Entry entry2 : a17.mo67902b()) {
                                    String str16 = (String) entry2.getKey();
                                    String str17 = (String) entry2.getValue();
                                    if (!bnkc.mo67309b(str16, str17)) {
                                        ContentValues contentValues = new ContentValues();
                                        sra.m36065a(contentValues, "phone_number", str16);
                                        sra.m36065a(contentValues, "contact_name", str17);
                                        a16.insert("contact_annotation", null, contentValues);
                                        hashSet5.add(str16);
                                    }
                                }
                                if (ceqm.m137879j()) {
                                    adno = new adsl(d, 25, (int) ceqm.m137886q());
                                } else {
                                    adno = new adsn(d, 20, (int) ceqm.m137886q());
                                }
                                HashSet hashSet6 = new HashSet();
                                Iterator it3 = hashSet5.iterator();
                                int i13 = 0;
                                while (it3.hasNext()) {
                                    String str18 = (String) it3.next();
                                    SharedPreferences f = adta.m51157f(a15.f62695c);
                                    String str19 = str;
                                    if (!f.contains(str19)) {
                                        str4 = str2;
                                        if (!f.contains(str4)) {
                                            bngx = bngx.m109376e();
                                            adtc = a15;
                                            it = it3;
                                            i3 = i2;
                                            num2 = num;
                                            str3 = str19;
                                            Object[] objArr5 = {str18, bngx};
                                            size = bngx.size();
                                            i4 = 0;
                                            while (i4 < size) {
                                                adsr adsr2 = (adsr) bngx.get(i4);
                                                if (hashSet6.contains(adsr2.mo33762c())) {
                                                    adtg = adtg3;
                                                } else {
                                                    hashSet6.add(adsr2.mo33762c());
                                                    if (!ceqm.m137879j()) {
                                                        if ("sms".equals(adsr2.mo33761b())) {
                                                            adtg = adtg3;
                                                            adsr = adtg.mo33805a(adsr2.mo33760a());
                                                        } else {
                                                            adtg = adtg3;
                                                            adsr = adtg.mo33809b(adsr2.mo33760a());
                                                        }
                                                        if (adsr != null) {
                                                            brhy = adsr.mo33784a(a16);
                                                        } else {
                                                            brhy = null;
                                                        }
                                                    } else {
                                                        adtg = adtg3;
                                                        bric a22 = brid.m114045a();
                                                        a22.mo69557b(adsr2.mo33762c());
                                                        Set p = adsr2.mo33786p();
                                                        bmxy.m108581a(p);
                                                        if (adsr2.mo33785o()) {
                                                            bric b3 = adsr.m51116b(p, a16);
                                                            bmxy.m108581a(b3);
                                                            a22.mo69549a(b3);
                                                        } else {
                                                            a22.mo69555a((bric[]) adsr.m51114a(p, a16).toArray(new bric[0]));
                                                        }
                                                        brhy = a22.mo69547a();
                                                    }
                                                    if (brhy != null) {
                                                        adno.mo33683a(brhy);
                                                        i3++;
                                                    }
                                                }
                                                i4++;
                                                adtg3 = adtg;
                                            }
                                            i13 = i3;
                                            a15 = adtc;
                                            it3 = it;
                                            str = str3;
                                            i6 = num2;
                                            str2 = str4;
                                        }
                                    } else {
                                        str4 = str2;
                                    }
                                    String[] strArr2 = new String[4];
                                    strArr2[0] = str18;
                                    strArr2[1] = String.valueOf(str18).concat(",%");
                                    String valueOf2 = String.valueOf(str18);
                                    strArr2[2] = valueOf2.length() == 0 ? new String("%,") : "%,".concat(valueOf2);
                                    adtc = a15;
                                    it = it3;
                                    StringBuilder sb = new StringBuilder(String.valueOf(str18).length() + 4);
                                    sb.append("%,");
                                    sb.append(str18);
                                    sb.append(",%");
                                    strArr2[3] = sb.toString();
                                    Cursor query3 = a16.query("mmssms", new String[]{"_id", "msg_type", "phone_numbers", "msg_box"}, "phone_numbers=? OR phone_numbers LIKE ? OR phone_numbers LIKE ? OR phone_numbers LIKE ?", strArr2, null, null, null, null);
                                    if (query3 == null) {
                                        try {
                                            adnt.m50871b("Got null cursor in getMessagesByPhoneNumber()");
                                            bngx = bngx.m109376e();
                                            i3 = i2;
                                            num2 = num;
                                            str3 = str19;
                                        } catch (Throwable th9) {
                                            bqye.m113761a(th, th9);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        while (query3.moveToNext()) {
                                            Integer a23 = sra.m36061a(query3, 0, (Integer) -1);
                                            String a24 = sra.m36063a(query3, 1, "");
                                            String a25 = sra.m36063a(query3, 2, "");
                                            int i14 = i2;
                                            Integer a26 = sra.m36061a(query3, 3, num);
                                            Integer num5 = num;
                                            if (a23.intValue() == -1) {
                                                str5 = str19;
                                            } else if (!TextUtils.isEmpty(a24)) {
                                                if (!"sms".equals(a24)) {
                                                    String valueOf3 = String.valueOf(a23);
                                                    str6 = str19;
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 14);
                                                    sb2.append("content://mms/");
                                                    sb2.append(valueOf3);
                                                    str7 = sb2.toString();
                                                } else {
                                                    str6 = str19;
                                                    String valueOf4 = String.valueOf(a23);
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 14);
                                                    sb3.append("content://sms/");
                                                    sb3.append(valueOf4);
                                                    str7 = sb3.toString();
                                                }
                                                adsq n = adsr.m51117n();
                                                n.mo33777a(a23.intValue());
                                                n.mo33782b(a24);
                                                n.mo33783c(str7);
                                                n.f62648c = a25;
                                                n.f62646a = a26;
                                                arrayList.add(n.mo33776a());
                                                i2 = i14;
                                                str19 = str6;
                                                num = num5;
                                            } else {
                                                str5 = str19;
                                            }
                                            adnt.m50872b("Invalid msgId<%d> or msgType<%s>", a23, a24);
                                            i2 = i14;
                                            str19 = str5;
                                            num = num5;
                                        }
                                        i3 = i2;
                                        num2 = num;
                                        str3 = str19;
                                        bngx a27 = bngx.m109368a((Collection) arrayList);
                                        query3.close();
                                        bngx = a27;
                                    }
                                    Object[] objArr52 = {str18, bngx};
                                    size = bngx.size();
                                    i4 = 0;
                                    while (i4 < size) {
                                    }
                                    i13 = i3;
                                    a15 = adtc;
                                    it3 = it;
                                    str = str3;
                                    i6 = num2;
                                    str2 = str4;
                                }
                                adno.mo33684b();
                                i = i2;
                            } else {
                                adnt.m50871b("Null phoneNumberToNamesMap");
                                i = -1;
                            }
                        } else {
                            bxvd = bxvd2;
                            adnt.m50871b("Null freshPhoneNumberToNamesMap");
                            i = -1;
                        }
                    }
                } else {
                    bxvd = bxvd2;
                    i = 0;
                }
                bxvd2 = bxvd;
                if (!bxvd2.f164950c) {
                    c = 0;
                } else {
                    bxvd2.mo74035c();
                    c = 0;
                    bxvd2.f164950c = false;
                }
                ((bome) bxvd2.f164949b).f133644g = i;
                new Object[1][c] = Integer.valueOf(i);
            }
        }
        long elapsedRealtime5 = SystemClock.elapsedRealtime() - j;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((bome) bxvd2.f164949b).f133640c = elapsedRealtime5;
        adns.m50862a().mo33693a((bome) bxvd2.mo74062i());
        return;
        throw th4;
        throw th2;
        throw th;
        throw th3;
    }
}
