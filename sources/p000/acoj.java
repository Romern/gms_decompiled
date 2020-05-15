package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: acoj */
final /* synthetic */ class acoj implements Runnable {

    /* renamed from: a */
    private final acok f60334a;

    /* renamed from: b */
    private final boolean f60335b;

    public acoj(acok acok, boolean z) {
        this.f60334a = acok;
        this.f60335b = z;
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
    public final void run() {
        int i;
        boolean z;
        C1240of ofVar;
        Throwable th;
        Throwable th2;
        acok acok = this.f60334a;
        boolean z2 = this.f60335b;
        bxvd da = bpym.f139887f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpym bpym = (bpym) da.f164949b;
        "sms".getClass();
        bpym.f139889a |= 1;
        bpym.f139890b = "sms";
        long currentTimeMillis = System.currentTimeMillis();
        acol a = acok.mo32950a().mo32957a("sms", new acon(acok.f60344f, acok.mo32953b(), acok.m49605e(acok.f60342d).getInt("last_sms_id", -1)));
        C1240of ofVar2 = a.f60347b;
        if (ofVar2 != null) {
            acok.m49605e(acok.f60342d).edit().putLong("last_sms_date", ((Long) ofVar2.f26798a).longValue()).apply();
            acok.m49605e(acok.f60342d).edit().putInt("last_sms_id", ((Integer) a.f60347b.f26799b).intValue()).apply();
        }
        int i2 = a.f60346a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpym bpym2 = (bpym) da.f164949b;
        bpym2.f139889a |= 2;
        bpym2.f139891c = i2;
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        acnv.m49555d("ProcessNewSms completed in %d ms", Integer.valueOf(currentTimeMillis2));
        acok.mo32951a(bpzm.SMS_CORPUS_PROCESS_NEW_SMS, currentTimeMillis2);
        long currentTimeMillis3 = System.currentTimeMillis();
        int i3 = ((bpym) da.f164949b).f139891c;
        acol a2 = acok.mo32950a().mo32957a("mms", new acoo(acok.f60344f, acok.mo32954c(), acok.m49605e(acok.f60342d).getInt("last_mms_id", -1)));
        C1240of ofVar3 = a2.f60347b;
        if (ofVar3 != null) {
            acok.m49605e(acok.f60342d).edit().putLong("last_mms_date", ((Long) ofVar3.f26798a).longValue()).apply();
            acok.m49605e(acok.f60342d).edit().putInt("last_mms_id", ((Integer) a2.f60347b.f26799b).intValue()).apply();
        }
        int i4 = i3 + a2.f60346a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpym bpym3 = (bpym) da.f164949b;
        bpym3.f139889a |= 2;
        bpym3.f139891c = i4;
        int currentTimeMillis4 = (int) (System.currentTimeMillis() - currentTimeMillis3);
        acnv.m49555d("ProcessNewMms completed in %d ms", Integer.valueOf(currentTimeMillis4));
        acok.mo32951a(bpzm.SMS_CORPUS_PROCESS_NEW_MMS, currentTimeMillis4);
        if (!z2) {
            long currentTimeMillis5 = System.currentTimeMillis();
            acnv.m49552c("Processing read status changes with lastSmsDate = %d, lastMmsDate = %d", Long.valueOf(acok.mo32953b()), Long.valueOf(acok.mo32954c()));
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            acom a3 = acok.mo32950a();
            SQLiteDatabase e = a3.mo32958e();
            if (e == null) {
                acnv.m49556e("Got null db in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
            } else {
                Cursor query = e.query("mmssms_tag", acom.f60349e, "tag=?", new String[]{"unread"}, null, null, null, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            int intValue = sra.m36061a(query, 0, (Integer) 0).intValue();
                            if (!"sms".equals(query.getString(1))) {
                                hashSet2.add(String.format(Locale.US, "'%d;%d'", Integer.valueOf(intValue), Long.valueOf(query.getLong(2))));
                            } else {
                                hashSet.add(String.format(Locale.US, "'%d;%d'", Integer.valueOf(intValue), Long.valueOf(query.getLong(2))));
                            }
                        } catch (Throwable th3) {
                            bqye.m113761a(th2, th3);
                        }
                    }
                    query.close();
                } else {
                    acnv.m49556e("Got null Cursor in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
                }
            }
            acnv.m49552c("Currently unread sms: %d, unread mms: %d", Integer.valueOf(hashSet.size()), Integer.valueOf(hashSet2.size()));
            int max = Math.max(1, ((Integer) abzt.f58896ak.mo58455c()).intValue());
            List a4 = acok.f60344f.mo32963a(max, acok.f60336a, hashSet);
            int a5 = a3.mo32956a(a4, "sms");
            List a6 = acok.f60344f.mo32963a(max, acok.f60337b, hashSet2);
            acnv.m49552c("New read sms: %d, New read mms: %d", Integer.valueOf(a4.size()), Integer.valueOf(a6.size()));
            int a7 = a5 + a3.mo32956a(a6, "mms");
            acnv.m49555d("Updated %d MMS/SMS readstatus in total", Integer.valueOf(a7));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpym bpym4 = (bpym) da.f164949b;
            bpym4.f139889a |= 8;
            bpym4.f139893e = a7;
            int currentTimeMillis6 = (int) (System.currentTimeMillis() - currentTimeMillis5);
            acnv.m49555d("ProcessReadStatusChanges completed in %d ms", Integer.valueOf(currentTimeMillis6));
            acok.mo32951a(bpzm.SMS_CORPUS_PROCESS_READ_STATUS_CHANGES, currentTimeMillis6);
        }
        if (System.currentTimeMillis() - acok.m49605e(acok.f60342d).getLong("last_deletion_time_ms", -1) > ((Long) abzt.f58854V.mo58455c()).longValue()) {
            long currentTimeMillis7 = System.currentTimeMillis();
            acnv.m49554d("Processing deletions");
            acom a8 = acok.mo32950a();
            Iterator a9 = acok.f60344f.mo32962a(acok.f60336a);
            Iterator a10 = acok.f60344f.mo32962a(acok.f60337b);
            SQLiteDatabase f = a8.mo32959f();
            if (f == null) {
                acnv.m49556e("Got null db in SmsCorpusDbOpenHelper.processDeletions.");
                ofVar = new C1240of(null, 0);
            } else {
                HashSet hashSet3 = new HashSet();
                HashSet<Integer> hashSet4 = new HashSet();
                Cursor query2 = f.query("mmssms", acom.f60348d, null, null, null, null, null, null);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        try {
                            Integer a11 = sra.m36060a(query2, 0);
                            if (a11 != null) {
                                if (!"sms".equals(sra.m36069c(query2, 1))) {
                                    hashSet4.add(a11);
                                } else {
                                    hashSet3.add(a11);
                                }
                            }
                        } catch (Throwable th4) {
                            bqye.m113761a(th, th4);
                        }
                    }
                    query2.close();
                    while (a9.hasNext()) {
                        hashSet3.remove(a9.next());
                    }
                    while (a10.hasNext()) {
                        hashSet4.remove(a10.next());
                    }
                    f.beginTransaction();
                    try {
                        for (Iterator it = hashSet3.iterator(); it.hasNext(); it = it) {
                            Integer num = (Integer) it.next();
                            f.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num), "sms"});
                            f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(num), "sms"});
                        }
                        for (Integer num2 : hashSet4) {
                            f.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num2), "mms"});
                            f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(num2), "mms"});
                        }
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        f.setTransactionSuccessful();
                        f.endTransaction();
                        acnv.m49552c("Processed %d SMS and %d MMS deletions", Integer.valueOf(hashSet3.size()), Integer.valueOf(hashSet4.size()));
                        ofVar = new C1240of(valueOf, Integer.valueOf(hashSet3.size() + hashSet4.size()));
                    } catch (Throwable th5) {
                        f.endTransaction();
                        throw th5;
                    }
                } else {
                    acnv.m49556e("Got null cursor in SmsCorpusDbOpenHelper.processDeletions.");
                    ofVar = new C1240of(null, 0);
                }
            }
            Object obj = ofVar.f26798a;
            if (obj != null) {
                acok.m49605e(acok.f60342d).edit().putLong("last_deletion_time_ms", ((Long) obj).longValue()).apply();
            }
            int intValue2 = ((Integer) ofVar.f26799b).intValue();
            if (!da.f164950c) {
                i = 0;
            } else {
                da.mo74035c();
                i = 0;
                da.f164950c = false;
            }
            bpym bpym5 = (bpym) da.f164949b;
            bpym5.f139889a |= 4;
            bpym5.f139892d = intValue2;
            int currentTimeMillis8 = (int) (System.currentTimeMillis() - currentTimeMillis7);
            acnv.m49555d("ProcessDeletions completed in %d ms", Integer.valueOf(currentTimeMillis8));
            acok.mo32951a(bpzm.SMS_CORPUS_PROCESS_DELETIONS, currentTimeMillis8);
        } else {
            i = 0;
        }
        acok.f60343e.mo32443a((bpym) da.mo74062i());
        bpym bpym6 = (bpym) da.f164949b;
        if (bpym6.f139891c > 0 || bpym6.f139892d > 0 || bpym6.f139893e > 0) {
            acom a12 = acok.mo32950a();
            ftz[] ftzArr = a12.f17227c.f17229b;
            int length = ftzArr.length;
            boolean z3 = true;
            while (i < length) {
                ftz ftz = ftzArr[i];
                String valueOf2 = String.valueOf(ftz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb.append("Requesting indexing: ");
                sb.append(valueOf2);
                acnv.m49541a(sb.toString());
                if (acaw.m48796m()) {
                    z = a12.mo11316a(ftz, acnj.f60235a);
                } else {
                    z = a12.mo11315a(ftz);
                }
                z3 = z & z3;
                i++;
            }
            acnv.m49555d("requestIndexing with status %b", Boolean.valueOf(z3));
            return;
        }
        return;
        throw th2;
        throw th;
    }
}
