package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.CallLog;
import android.provider.Telephony;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: tdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdg {

    /* renamed from: a */
    public static final sek f45688a = tea.m36798a("sms_reader");

    /* renamed from: b */
    private static final String[] f45689b = {"date", "address"};

    /* renamed from: c */
    private final beao f45690c;

    private tdg(beao beao) {
        this.f45690c = beao;
    }

    /* renamed from: a */
    private static int m36746a(long j, long j2, int i) {
        return ((int) ((j2 - j) / TimeUnit.HOURS.toMillis((long) i))) + 1;
    }

    /* renamed from: a */
    public static bxtx m36747a(String str) {
        return bxtx.m123261a((byte[]) bmxy.m108581a(bnzi.m110903e().mo68721a(str, StandardCharsets.UTF_8).mo68740b()));
    }

    /* renamed from: a */
    private final List m36748a(Cursor cursor, int i, int i2, int i3, long j, long j2) {
        Cursor cursor2 = cursor;
        int i4 = i;
        int i5 = i2;
        long j3 = j;
        ArrayList arrayList = new ArrayList();
        int w = (int) cdfn.f180658a.mo6606a().mo77421w();
        int i6 = 0;
        int i7 = 0;
        while (cursor.moveToNext() && (i6 < i4 || i7 < i5)) {
            long j4 = cursor2.getLong(cursor2.getColumnIndex("date"));
            if (j4 < j2) {
                break;
            }
            int a = m36746a(j4, j3, w);
            bxvd da = cbpa.f177883d.mo74144da();
            bxyk a2 = tdo.m36764a(j3 - TimeUnit.HOURS.toMillis((long) (a * w)));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbpa cbpa = (cbpa) da.f164949b;
            a2.getClass();
            cbpa.f177885a = a2;
            cbpa.f177886b = cboy.m128062a(i3);
            if (cdfn.f180658a.mo6606a().mo77412n()) {
                try {
                    if (!this.f45690c.mo58492b(this.f45690c.mo58483a(cursor2.getString(cursor2.getColumnIndex("address")), "ZZ"))) {
                        if (i6 < i4) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((cbpa) da.f164949b).f177887c = cboz.m128063a(4);
                            i6++;
                            arrayList.add((cbpa) da.mo74062i());
                        }
                    } else if (i7 < i5) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((cbpa) da.f164949b).f177887c = cboz.m128063a(3);
                        i7++;
                        arrayList.add((cbpa) da.mo74062i());
                    }
                } catch (bean e) {
                    if (i6 < i4) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((cbpa) da.f164949b).f177887c = cboz.m128063a(4);
                        i6++;
                        arrayList.add((cbpa) da.mo74062i());
                    }
                }
            } else if (i6 < i4) {
                i6++;
                arrayList.add((cbpa) da.mo74062i());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static tdg m36749a() {
        return new tdg(beao.m91670a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2 A[Catch:{ SecurityException -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7 A[Catch:{ SecurityException -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0140 A[Catch:{ SecurityException -> 0x03dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0165 A[Catch:{ SecurityException -> 0x03dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181 A[Catch:{ SecurityException -> 0x03dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018a A[Catch:{ SecurityException -> 0x03dd }] */
    /* renamed from: a */
    public final Map mo26395a(tdx tdx) {
        HashMap hashMap;
        ArrayList arrayList;
        Iterator<SubscriptionInfo> it;
        String str;
        String str2;
        ArrayList arrayList2;
        char c;
        long j;
        String str3;
        String str4;
        ArrayList arrayList3;
        String str5;
        HashMap hashMap2;
        Cursor cursor;
        List list;
        ArrayList arrayList4;
        String str6;
        String str7;
        Cursor cursor2;
        List list2;
        long millis;
        Cursor cursor3;
        List list3;
        tdx tdx2 = tdx;
        String str8 = "date";
        String str9 = "duration";
        String str10 = "type";
        HashMap hashMap3 = new HashMap();
        if (!cdfn.m132942e() && !cdfn.m132941d()) {
            return hashMap3;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(rpr.m34216b()).getActiveSubscriptionInfoList();
            long currentTimeMillis = System.currentTimeMillis();
            if (activeSubscriptionInfoList == null) {
                return hashMap3;
            }
            Iterator<SubscriptionInfo> it2 = activeSubscriptionInfoList.iterator();
            while (it2.hasNext()) {
                SubscriptionInfo next = it2.next();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (cdfn.m132942e()) {
                    int subscriptionId = next.getSubscriptionId();
                    ArrayList arrayList7 = arrayList5;
                    long millis2 = currentTimeMillis - TimeUnit.HOURS.toMillis(cdfn.m132943f());
                    try {
                        ContentResolver contentResolver = rpr.m34216b().getContentResolver();
                        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
                        String[] strArr = f45689b;
                        String[] strArr2 = new String[2];
                        strArr2[0] = String.valueOf(subscriptionId);
                        try {
                            strArr2[1] = String.valueOf(millis2);
                            cursor2 = contentResolver.query(uri, strArr, "sub_id = ? AND date > ?", strArr2, "date DESC");
                        } catch (SQLiteException e) {
                            e = e;
                            tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 50, e);
                            cursor2 = null;
                            if (cursor2 != null) {
                            }
                            arrayList2.addAll(list2);
                            int subscriptionId2 = next.getSubscriptionId();
                            millis = j - TimeUnit.HOURS.toMillis(cdfn.m132943f());
                            ContentResolver contentResolver2 = rpr.m34216b().getContentResolver();
                            Uri uri2 = Telephony.Sms.Sent.CONTENT_URI;
                            String[] strArr3 = f45689b;
                            String[] strArr4 = new String[2];
                            try {
                                strArr4[0] = String.valueOf(subscriptionId2);
                                strArr4[1] = String.valueOf(millis);
                                hashMap = hashMap3;
                                try {
                                    cursor3 = contentResolver2.query(uri2, strArr3, "sub_id = ? AND date > ?", strArr4, "date DESC");
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    try {
                                        tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 50, e);
                                        cursor3 = null;
                                        if (cursor3 == null) {
                                        }
                                        arrayList2.addAll(list3);
                                        if (cdfn.m132941d()) {
                                        }
                                        Integer valueOf = Integer.valueOf(next.getSubscriptionId());
                                        Pair pair = new Pair(arrayList2, arrayList3);
                                        hashMap2 = hashMap;
                                        hashMap2.put(valueOf, pair);
                                        currentTimeMillis = j;
                                        hashMap3 = hashMap2;
                                        str10 = str4;
                                        it2 = it;
                                        str8 = str3;
                                        str9 = str5;
                                        tdx2 = tdx;
                                    } catch (SecurityException e3) {
                                        return hashMap;
                                    }
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                hashMap = hashMap3;
                                tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 50, e);
                                cursor3 = null;
                                if (cursor3 == null) {
                                }
                                arrayList2.addAll(list3);
                                if (cdfn.m132941d()) {
                                }
                                Integer valueOf2 = Integer.valueOf(next.getSubscriptionId());
                                Pair pair2 = new Pair(arrayList2, arrayList3);
                                hashMap2 = hashMap;
                                hashMap2.put(valueOf2, pair2);
                                currentTimeMillis = j;
                                hashMap3 = hashMap2;
                                str10 = str4;
                                it2 = it;
                                str8 = str3;
                                str9 = str5;
                                tdx2 = tdx;
                            }
                            if (cursor3 == null) {
                            }
                            arrayList2.addAll(list3);
                            if (cdfn.m132941d()) {
                            }
                            Integer valueOf22 = Integer.valueOf(next.getSubscriptionId());
                            Pair pair22 = new Pair(arrayList2, arrayList3);
                            hashMap2 = hashMap;
                            hashMap2.put(valueOf22, pair22);
                            currentTimeMillis = j;
                            hashMap3 = hashMap2;
                            str10 = str4;
                            it2 = it;
                            str8 = str3;
                            str9 = str5;
                            tdx2 = tdx;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 50, e);
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        arrayList2.addAll(list2);
                        int subscriptionId22 = next.getSubscriptionId();
                        millis = j - TimeUnit.HOURS.toMillis(cdfn.m132943f());
                        ContentResolver contentResolver22 = rpr.m34216b().getContentResolver();
                        Uri uri22 = Telephony.Sms.Sent.CONTENT_URI;
                        String[] strArr32 = f45689b;
                        String[] strArr42 = new String[2];
                        strArr42[0] = String.valueOf(subscriptionId22);
                        strArr42[1] = String.valueOf(millis);
                        hashMap = hashMap3;
                        cursor3 = contentResolver22.query(uri22, strArr32, "sub_id = ? AND date > ?", strArr42, "date DESC");
                        if (cursor3 == null) {
                        }
                        arrayList2.addAll(list3);
                        if (cdfn.m132941d()) {
                        }
                        Integer valueOf222 = Integer.valueOf(next.getSubscriptionId());
                        Pair pair222 = new Pair(arrayList2, arrayList3);
                        hashMap2 = hashMap;
                        hashMap2.put(valueOf222, pair222);
                        currentTimeMillis = j;
                        hashMap3 = hashMap2;
                        str10 = str4;
                        it2 = it;
                        str8 = str3;
                        str9 = str5;
                        tdx2 = tdx;
                    }
                    if (cursor2 != null) {
                        it = it2;
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        str2 = str8;
                        str = str9;
                        j = currentTimeMillis;
                        list2 = m36748a(cursor2, (int) cdfn.f180658a.mo6606a().mo77397A(), (int) cdfn.f180658a.mo6606a().mo77422x(), 3, currentTimeMillis, millis2);
                        cursor2.close();
                    } else {
                        str = str9;
                        arrayList = arrayList6;
                        it = it2;
                        arrayList2 = arrayList7;
                        str2 = str8;
                        j = currentTimeMillis;
                        list2 = Collections.emptyList();
                    }
                    arrayList2.addAll(list2);
                    int subscriptionId222 = next.getSubscriptionId();
                    millis = j - TimeUnit.HOURS.toMillis(cdfn.m132943f());
                    try {
                        ContentResolver contentResolver222 = rpr.m34216b().getContentResolver();
                        Uri uri222 = Telephony.Sms.Sent.CONTENT_URI;
                        String[] strArr322 = f45689b;
                        String[] strArr422 = new String[2];
                        strArr422[0] = String.valueOf(subscriptionId222);
                        strArr422[1] = String.valueOf(millis);
                        hashMap = hashMap3;
                        cursor3 = contentResolver222.query(uri222, strArr322, "sub_id = ? AND date > ?", strArr422, "date DESC");
                    } catch (SQLiteException e6) {
                        e = e6;
                        hashMap = hashMap3;
                        tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 50, e);
                        cursor3 = null;
                        if (cursor3 == null) {
                        }
                        arrayList2.addAll(list3);
                        if (cdfn.m132941d()) {
                        }
                        Integer valueOf2222 = Integer.valueOf(next.getSubscriptionId());
                        Pair pair2222 = new Pair(arrayList2, arrayList3);
                        hashMap2 = hashMap;
                        hashMap2.put(valueOf2222, pair2222);
                        currentTimeMillis = j;
                        hashMap3 = hashMap2;
                        str10 = str4;
                        it2 = it;
                        str8 = str3;
                        str9 = str5;
                        tdx2 = tdx;
                    }
                    if (cursor3 == null) {
                        c = 0;
                        list3 = m36748a(cursor3, (int) cdfn.f180658a.mo6606a().mo77398B(), (int) cdfn.f180658a.mo6606a().mo77423y(), 4, j, millis);
                        cursor3.close();
                    } else {
                        c = 0;
                        list3 = Collections.emptyList();
                    }
                    arrayList2.addAll(list3);
                } else {
                    str2 = str8;
                    str = str9;
                    hashMap = hashMap3;
                    arrayList = arrayList6;
                    j = currentTimeMillis;
                    it = it2;
                    c = 0;
                    arrayList2 = arrayList5;
                }
                if (cdfn.m132941d()) {
                    str4 = str10;
                    str3 = str2;
                    str5 = str;
                    arrayList3 = arrayList;
                } else {
                    String iccId = next.getIccId();
                    long millis3 = j - TimeUnit.HOURS.toMillis(cdfn.f180658a.mo6606a().mo77401c());
                    try {
                        ContentResolver contentResolver3 = rpr.m34216b().getContentResolver();
                        Uri uri3 = CallLog.Calls.CONTENT_URI;
                        String[] strArr5 = new String[3];
                        strArr5[c] = str10;
                        strArr5[1] = str;
                        strArr5[2] = str2;
                        String[] strArr6 = new String[2];
                        strArr6[c] = String.valueOf(iccId).concat("%");
                        strArr6[1] = String.valueOf(millis3);
                        cursor = contentResolver3.query(uri3, strArr5, "subscription_id LIKE ? AND date > ?", strArr6, "date DESC");
                    } catch (SQLiteException e7) {
                        tds.m36774a(rpr.m34216b()).mo26410a(tdx2, 49, e7);
                        cursor = null;
                    }
                    if (cursor != null) {
                        ArrayList arrayList8 = new ArrayList();
                        int b = (int) cdfn.f180658a.mo6606a().mo77400b();
                        ArrayList arrayList9 = new ArrayList();
                        int e8 = (int) cdfn.f180658a.mo6606a().mo77403e();
                        ArrayList arrayList10 = new ArrayList();
                        int d = (int) cdfn.f180658a.mo6606a().mo77402d();
                        str4 = str10;
                        int a = (int) cdfn.f180658a.mo6606a().mo77399a();
                        while (true) {
                            if (cursor.moveToNext()) {
                                if (arrayList8.size() >= b) {
                                    if (arrayList9.size() >= e8) {
                                        if (arrayList10.size() >= d) {
                                            arrayList4 = arrayList8;
                                            str3 = str2;
                                            str5 = str;
                                            break;
                                        }
                                    }
                                }
                                String str11 = str2;
                                ArrayList arrayList11 = arrayList8;
                                ArrayList arrayList12 = arrayList9;
                                long j2 = cursor.getLong(cursor.getColumnIndex(str11));
                                if (j2 < millis3) {
                                    str3 = str11;
                                    arrayList4 = arrayList11;
                                    str5 = str;
                                    arrayList9 = arrayList12;
                                    break;
                                }
                                int a2 = m36746a(j2, j, a);
                                bxvd da = cbov.f177867c.mo74144da();
                                String str12 = str11;
                                int i2 = a;
                                bxyk a3 = tdo.m36764a(j - TimeUnit.HOURS.toMillis((long) (a2 * a)));
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                a3.getClass();
                                ((cbov) da.f164949b).f177869a = a3;
                                int i3 = cursor.getInt(cursor.getColumnIndex(str4));
                                if (i3 == 1) {
                                    str6 = str;
                                    arrayList9 = arrayList12;
                                } else if (i3 != 2) {
                                    if (i3 != 3) {
                                        if (i3 != 5) {
                                            arrayList8 = arrayList11;
                                            arrayList9 = arrayList12;
                                            a = i2;
                                            str7 = str12;
                                        } else {
                                            str6 = str;
                                            arrayList9 = arrayList12;
                                        }
                                    } else if (arrayList10.size() < d) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((cbov) da.f164949b).f177870b = cboy.m128062a(5);
                                        arrayList10.add((cbov) da.mo74062i());
                                        arrayList8 = arrayList11;
                                        arrayList9 = arrayList12;
                                        a = i2;
                                        str7 = str12;
                                    } else {
                                        arrayList8 = arrayList11;
                                        arrayList9 = arrayList12;
                                        a = i2;
                                        str7 = str12;
                                    }
                                } else if (arrayList12.size() < e8) {
                                    String str13 = str;
                                    if (cursor.getLong(cursor.getColumnIndex(str13)) > 0) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((cbov) da.f164949b).f177870b = cboy.m128062a(4);
                                        arrayList9 = arrayList12;
                                        arrayList9.add((cbov) da.mo74062i());
                                        str = str13;
                                        arrayList8 = arrayList11;
                                        a = i2;
                                        str7 = str12;
                                    } else {
                                        arrayList9 = arrayList12;
                                        str = str13;
                                        arrayList8 = arrayList11;
                                        a = i2;
                                        str7 = str12;
                                    }
                                } else {
                                    arrayList9 = arrayList12;
                                    arrayList8 = arrayList11;
                                    a = i2;
                                    str7 = str12;
                                }
                                if (arrayList11.size() < b) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((cbov) da.f164949b).f177870b = cboy.m128062a(3);
                                    arrayList11.add((cbov) da.mo74062i());
                                    str = str6;
                                    arrayList8 = arrayList11;
                                    a = i2;
                                    str7 = str12;
                                } else {
                                    str = str6;
                                    arrayList8 = arrayList11;
                                    a = i2;
                                    str7 = str12;
                                }
                            } else {
                                arrayList4 = arrayList8;
                                str3 = str2;
                                str5 = str;
                                break;
                            }
                        }
                        arrayList4.addAll(arrayList9);
                        arrayList4.addAll(arrayList10);
                        cursor.close();
                        list = arrayList4;
                    } else {
                        str4 = str10;
                        str3 = str2;
                        str5 = str;
                        list = Collections.emptyList();
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(list);
                }
                Integer valueOf22222 = Integer.valueOf(next.getSubscriptionId());
                Pair pair22222 = new Pair(arrayList2, arrayList3);
                hashMap2 = hashMap;
                try {
                    hashMap2.put(valueOf22222, pair22222);
                    currentTimeMillis = j;
                    hashMap3 = hashMap2;
                    str10 = str4;
                    it2 = it;
                    str8 = str3;
                    str9 = str5;
                    tdx2 = tdx;
                } catch (SecurityException e9) {
                    return hashMap2;
                }
            }
            return hashMap3;
        } catch (SecurityException e10) {
            return hashMap3;
        }
    }
}
