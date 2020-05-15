package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import android.util.Patterns;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: teq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class teq implements teu {

    /* renamed from: a */
    private static final Logger f45789a = tea.m36798a("registered_sms_verifier");

    /* renamed from: b */
    private final cbqy f45790b;

    /* renamed from: c */
    private final sza f45791c;

    /* renamed from: d */
    private final tdx f45792d;

    /* renamed from: e */
    private final List f45793e;

    public teq(cbqy cbqy, sza sza, tdx tdx) {
        cbqg cbqg;
        cbot cbot;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
        } else {
            cbqg = cbqg.f178018b;
        }
        cbnz cbnz = cbqg.f178020a;
        cbnz = cbnz == null ? cbnz.f177781f : cbnz;
        if (cbnz.f177783a == 7) {
            cbot = (cbot) cbnz.f177784b;
        } else {
            cbot = cbot.f177861b;
        }
        bxwc bxwc = cbot.f177863a;
        tdg.m36749a();
        this.f45790b = cbqy;
        this.f45791c = sza;
        this.f45792d = tdx;
        this.f45793e = bxwc;
    }

    /* renamed from: a */
    public final void mo26427a() {
    }

    /* renamed from: b */
    public final cbqy mo26428b() {
        return this.f45790b;
    }

    /* renamed from: c */
    public final String mo26429c() {
        cbqg cbqg;
        cbqy cbqy = this.f45790b;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
        } else {
            cbqg = cbqg.f178018b;
        }
        cbnz cbnz = cbqg.f178020a;
        if (cbnz == null) {
            cbnz = cbnz.f177781f;
        }
        cboa cboa = cbnz.f177785c;
        if (cboa == null) {
            cboa = cboa.f177788b;
        }
        return cboa.f177790a;
    }

    /* renamed from: d */
    public final cbqy mo26430d() {
        List list;
        cbqg cbqg;
        cbqg cbqg2;
        long j;
        Cursor cursor;
        List list2;
        long j2;
        long j3;
        String str;
        int i;
        List list3;
        f45789a.mo25414c("do verification", new Object[0]);
        long parseLong = Long.parseLong(szq.m36667a(rpr.m34216b()).mo26282a("previous_session_sync_timestamp_millis", "1000000"));
        long currentTimeMillis = System.currentTimeMillis();
        tec a = tec.m36805a(rpr.m34216b(), this.f45792d);
        rpr.m34216b();
        Map a2 = a.mo26419a();
        szr.m36692a();
        Map c = szr.m36698c();
        HashMap hashMap = new HashMap();
        if (a2 == null || a2.isEmpty()) {
            int i2 = Build.VERSION.SDK_INT;
            if (!c.keySet().isEmpty()) {
                hashMap.put(-1, (String) c.keySet().toArray()[0]);
            }
        } else {
            for (Map.Entry entry : c.entrySet()) {
                String str2 = (String) ((List) entry.getValue()).get(0);
                if (TextUtils.isEmpty(str2) || !a2.containsKey(str2)) {
                    f45789a.mo25416d("Missing imsi:%s from imsiSubIdMap:%s", str2, a2);
                    tds.m36774a(rpr.m34216b()).mo26411a(this.f45792d, this.f45790b, 71);
                } else {
                    hashMap.put(Integer.valueOf(((Integer) a2.get(str2)).intValue()), (String) entry.getKey());
                }
            }
        }
        tdx tdx = this.f45792d;
        List list4 = this.f45793e;
        if (!cdgc.f180745a.mo6606a().mo77488j()) {
            list = bngx.m109376e();
        } else {
            if (cdgc.f180745a.mo6606a().mo77482d() || currentTimeMillis - parseLong > TimeUnit.HOURS.toMillis(168)) {
                parseLong = currentTimeMillis - TimeUnit.HOURS.toMillis(168);
            }
            long millis = currentTimeMillis - TimeUnit.HOURS.toMillis(cdgc.f180745a.mo6606a().mo77479a());
            String[] strArr = {"date", "address", "body", "sub_id"};
            try {
                cursor = rpr.m34216b().getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, strArr, "type = 1 AND date > ? AND date < ?", new String[]{String.valueOf(j), String.valueOf(millis)}, "date DESC");
            } catch (SQLiteException e) {
                tdg.f45688a.mo25418e("Error reading SMS logs.", new Object[0]);
                tds.m36774a(rpr.m34216b()).mo26410a(tdx, 50, e);
                cursor = null;
            }
            if (cursor != null) {
                tdg.f45688a.mo25414c("Retrieved filtered SMS from client.", new Object[0]);
                int c2 = (int) cdgc.f180745a.mo6606a().mo77481c();
                List arrayList = new ArrayList();
                HashMap hashMap2 = hashMap;
                int b = (int) cdgc.f180745a.mo6606a().mo77480b();
                HashSet hashSet = new HashSet();
                List list5 = arrayList;
                String str3 = "body";
                int i3 = 0;
                for (int size = list4.size(); i3 < size; size = size) {
                    hashSet.add(((cbor) list4.get(i3)).f177854a);
                    i3++;
                }
                int i4 = 0;
                while (true) {
                    if (cursor.moveToNext()) {
                        if (i4 >= c2) {
                            list2 = list5;
                            break;
                        }
                        ByteString a3 = tdg.m36747a(cursor.getString(cursor.getColumnIndex("address")));
                        long j4 = cursor.getLong(cursor.getColumnIndex("date"));
                        if (!hashSet.contains(a3) || j4 >= millis || j4 <= j) {
                            j3 = j;
                            j2 = millis;
                            list3 = list5;
                            str = str3;
                            i = c2;
                        } else {
                            j3 = j;
                            int i5 = c2;
                            long millis2 = j4 - (j4 % (TimeUnit.HOURS.toMillis((long) b) / 2));
                            int i6 = cursor.getInt(cursor.getColumnIndex("sub_id"));
                            int i7 = Build.VERSION.SDK_INT;
                            if (hashMap2.containsKey(-1)) {
                                i6 = -1;
                            }
                            String str4 = str3;
                            i = i5;
                            if (!Patterns.WEB_URL.matcher(cursor.getString(cursor.getColumnIndex(str4))).find()) {
                                Integer valueOf = Integer.valueOf(i6);
                                if (hashMap2.containsKey(valueOf)) {
                                    ByteString a4 = tdg.m36747a((String) hashMap2.get(valueOf));
                                    String string = cursor.getString(cursor.getColumnIndex(str4));
                                    String str5 = str4;
                                    long j5 = millis;
                                    bnzd a5 = bnzi.m110903e().mo68732a().mo68725a(Long.toString(millis2), StandardCharsets.UTF_8);
                                    a5.mo68717b(a4.getKey());
                                    a5.mo68717b(a3.getKey());
                                    ByteString a6 = ByteString.m123261a((byte[]) bmxy.m108581a(a5.mo68725a(string, StandardCharsets.UTF_8).mo68729a().mo68740b()));
                                    i4++;
                                    bxvd da = cboq.f177849b.mo74144da();
                                    bxvd da2 = cbop.f177846b.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    a6.getClass();
                                    ((cbop) da2.f164949b).f177848a = a6;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    cbop cbop = (cbop) da2.mo74062i();
                                    cbop.getClass();
                                    ((cboq) da.f164949b).f177851a = cbop;
                                    list5.add((cboq) da.mo74062i());
                                    c2 = i;
                                    str3 = str5;
                                    j = j3;
                                    millis = j5;
                                } else {
                                    str = str4;
                                    j2 = millis;
                                    list3 = list5;
                                }
                            } else {
                                str = str4;
                                j2 = millis;
                                list3 = list5;
                            }
                        }
                        list5 = list3;
                        c2 = i;
                        str3 = str;
                        j = j3;
                        millis = j2;
                    } else {
                        list2 = list5;
                        break;
                    }
                }
                Logger Logger = tdg.f45688a;
                int size2 = list2.size();
                StringBuilder sb = new StringBuilder(33);
                sb.append("Found ");
                sb.append(size2);
                sb.append(" valid messages.");
                Logger.mo25414c(sb.toString(), new Object[0]);
                cursor.close();
                list = list2;
            } else {
                list = bngx.m109376e();
            }
        }
        sza sza = this.f45791c;
        tdx tdx2 = this.f45792d;
        cbqy cbqy = this.f45790b;
        bxvd da3 = cboe.f177806c.mo74144da();
        bxvd da4 = cbou.f177864b.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbou cbou = (cbou) da4.f164949b;
        if (!cbou.f177866a.mo73666a()) {
            cbou.f177866a = GeneratedMessageLite.m124021a(cbou.f177866a);
        }
        bxsy.m123078a(list, cbou.f177866a);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cboe cboe = (cboe) da3.f164949b;
        cbou cbou2 = (cbou) da4.mo74062i();
        cbou2.getClass();
        cboe.f177809b = cbou2;
        cboe.f177808a = 6;
        cbqy a7 = sza.mo26253a(tdx2, cbqy, (cboe) da3.mo74062i());
        tdz.m36796a();
        if (tdz.m36797a(a7)) {
            if (a7.f178083a == 4) {
                cbqg = (cbqg) a7.f178084b;
            } else {
                cbqg = cbqg.f178018b;
            }
            cbnz cbnz = cbqg.f178020a;
            if (cbnz == null) {
                cbnz = cbnz.f177781f;
            }
            cboa cboa = cbnz.f177785c;
            if (cboa == null) {
                cboa = cboa.f177788b;
            }
            String str6 = cboa.f177790a;
            cbqy cbqy2 = this.f45790b;
            if (cbqy2.f178083a == 4) {
                cbqg2 = (cbqg) cbqy2.f178084b;
            } else {
                cbqg2 = cbqg.f178018b;
            }
            cbnz cbnz2 = cbqg2.f178020a;
            if (cbnz2 == null) {
                cbnz2 = cbnz.f177781f;
            }
            cboa cboa2 = cbnz2.f177785c;
            if (cboa2 == null) {
                cboa2 = cboa.f177788b;
            }
            if (str6.equals(cboa2.f177790a)) {
                f45789a.mo25418e("Registered SMS Verifier timed out.", new Object[0]);
                tds.m36774a(rpr.m34216b()).mo26411a(this.f45792d, this.f45790b, 55);
                return a7;
            }
        }
        return a7;
    }
}
