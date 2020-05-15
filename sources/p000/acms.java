package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: acms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acms implements acmn {

    /* renamed from: b */
    private static final String[] f60172b = {"display_name", "nickname", "phonetic_name", "given_names"};

    /* renamed from: c */
    private static final String[] f60173c = {"label", "email"};

    /* renamed from: d */
    private static final String[] f60174d = {"label", "phone"};

    /* renamed from: e */
    private static final String[] f60175e = {"label", "postal"};

    /* renamed from: f */
    private final Context f60176f;

    /* renamed from: g */
    private final acnc f60177g;

    /* renamed from: h */
    private final abym f60178h = new abym(this.f60176f);

    public acms(Context context, acnc acnc) {
        this.f60176f = context;
        this.f60177g = acnc;
    }

    /* renamed from: a */
    public static int m49459a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str.length() == 0 ? new String("SELECT COUNT(*) FROM ") : "SELECT COUNT(*) FROM ".concat(str), null);
        try {
            if (rawQuery.moveToNext()) {
                int i = rawQuery.getInt(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return i;
            } else if (rawQuery == null) {
                return -1;
            } else {
                rawQuery.close();
                return -1;
            }
        } catch (Throwable th) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    static ContentValues m49471b(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("phone", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    /* renamed from: c */
    static ContentValues m49472c(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("postal", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    /* renamed from: b */
    public final Pair mo32883b(SQLiteDatabase sQLiteDatabase, Resources resources) {
        return m49465a(sQLiteDatabase, resources, true, null);
    }

    /* renamed from: a */
    private static final int m49460a(SQLiteDatabase sQLiteDatabase, String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            acnv.m49552c("Inserting into %s: %s", str, contentValues);
            i += sQLiteDatabase.insert(str, null, contentValues) == -1 ? 0 : 1;
        }
        return i;
    }

    /* renamed from: a */
    static final int m49461a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return sQLiteDatabase.delete(str, str2, null);
    }

    /* renamed from: a */
    static long m49462a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    static ContentValues m49463a(long j, long j2, String str, int i, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("email", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        return contentValues;
    }

    /* renamed from: a */
    static ContentValues m49464a(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", str4);
        contentValues.put("score", Long.valueOf(j2));
        contentValues.put("emails", str5);
        contentValues.put("nickname", str6);
        contentValues.put("note", str7);
        contentValues.put("organization", str8);
        contentValues.put("phone_numbers", str9);
        contentValues.put("postal_address", str10);
        contentValues.put("phonetic_name", str11);
        return contentValues;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0183  */
    /* renamed from: a */
    private final Pair m49465a(SQLiteDatabase sQLiteDatabase, Resources resources, boolean z, Collection collection) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        long j;
        long j2;
        acmp acmp;
        boolean z5;
        String str3;
        boolean z6;
        acoa acoa;
        String str4;
        acnu acnu;
        String str5;
        long j3;
        acoa acoa2;
        boolean z7;
        int i;
        int i2;
        boolean z8;
        String str6;
        int i3;
        String str7;
        acoa acoa3;
        int i4;
        Cursor cursor;
        long j4;
        acms acms = this;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Resources resources2 = resources;
        Collection collection2 = collection;
        String str8 = "contacts";
        if (!z) {
            z2 = true;
        } else {
            z2 = collection2 == null;
        }
        sdo.m34975b(z2, "Can not do a delta update with filterContactIds");
        long j5 = mo32895a().getLong("key_last_contacts_delta_delete_timestamp", 0);
        String str9 = "key_last_contacts_delta_delete_timestamp";
        long j6 = mo32895a().getLong("key_last_contacts_delta_update_timestamp", 0);
        if (!z || mo32895a().contains("key_last_contacts_delta_update_timestamp")) {
            z3 = z;
        } else {
            acnv.m49550c("Delta update with no prior full sync - doing full sync instead.");
            z3 = false;
        }
        if (z3) {
            z4 = false;
        } else {
            z4 = collection2 == null;
        }
        Context context = acms.f60176f;
        String str10 = "key_last_contacts_delta_update_timestamp";
        SharedPreferences a = mo32895a();
        String str11 = "data_id";
        String str12 = "postals";
        String str13 = "phones";
        boolean z9 = a.getBoolean("key_person_indexer_enabled", false);
        if (z9 != cemw.m137397e()) {
            if (!cemw.m137397e()) {
                str = "emails";
                brhj.m114016a(context).mo32873b("Person");
                z9 = false;
            } else {
                str = "emails";
                if (z4) {
                    z9 = true;
                }
            }
            a.edit().putBoolean("key_person_indexer_enabled", z9).commit();
        } else {
            str = "emails";
        }
        acoa acoa4 = z9 ? new acoa(brhj.m114016a(context)) : null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (collection2 != null) {
            str2 = collection.toString();
        } else {
            str2 = "<null>";
        }
        acnv.m49552c("Updating contacts db, delta=%b, filter=%s", Boolean.valueOf(z3), str2);
        HashSet hashSet = new HashSet();
        if (z3) {
            acnc acnc = acms.f60177g;
            sdo.m34970a(true);
            String valueOf = String.valueOf(String.valueOf(j6));
            Pair a2 = acnc.mo32904a(resources2, valueOf.length() == 0 ? new String("contact_last_updated_timestamp>") : "contact_last_updated_timestamp>".concat(valueOf));
            acmp = (acmp) a2.first;
            j = elapsedRealtime;
            long max = Math.max(((Long) a2.second).longValue(), j6);
            acnc acnc2 = acms.f60177g;
            sdo.m34971a(true, (Object) "Delta API not supported");
            try {
                Cursor a3 = acnc2.f60228a.mo32907a(ContactsContract.DeletedContacts.CONTENT_URI, new String[]{"contact_id", "contact_deleted_timestamp"}, "contact_deleted_timestamp>?", new String[]{Long.toString(j5)}, null);
                if (a3 != null) {
                    try {
                        int columnIndex = a3.getColumnIndex("contact_id");
                        int columnIndex2 = a3.getColumnIndex("contact_deleted_timestamp");
                        j4 = max;
                        long j7 = j5;
                        long j8 = 0;
                        while (a3.moveToNext()) {
                            j8++;
                            hashSet.add(Long.valueOf(a3.getLong(columnIndex)));
                            j7 = Math.max(j7, a3.getLong(columnIndex2));
                        }
                        acnv.m49543a("Got %d deleted contacts since %d", Long.valueOf(j8), Long.valueOf(j5));
                        a3.close();
                        j5 = j7;
                    } catch (Throwable th) {
                        th = th;
                        cursor = a3;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    j4 = max;
                    acnv.m49550c("Could not fetch deleted contacts - no contacts provider present?");
                }
                j2 = j5;
                j6 = j4;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            j = elapsedRealtime;
            if (collection2 == null) {
                Pair a4 = acms.f60177g.mo32904a(resources2, "");
                acmp = (acmp) a4.first;
                j2 = Math.max(((Long) a4.second).longValue(), j6);
                j6 = j2;
            } else {
                hashSet.addAll(collection2);
                acmp = (acmp) acms.f60177g.mo32904a(resources2, m49467a("_id", collection2)).first;
                j2 = j5;
            }
        }
        HashMap hashMap = new HashMap();
        while (acmp.hasNext()) {
            try {
                acmo acmo = (acmo) acmp.next();
                ContentValues contentValues = acmo.f60161a;
                long a5 = m49462a(contentValues);
                if (!(m49462a(contentValues) == 0 || contentValues.get("lookup_key") == null || contentValues.get("display_name") == null)) {
                    Long valueOf2 = Long.valueOf(a5);
                    hashMap.put(valueOf2, acmo);
                    hashSet.remove(valueOf2);
                }
            } catch (Throwable th3) {
                acmp.mo32887a();
                throw th3;
            }
        }
        acmp.mo32887a();
        if (!acmp.mo32889c()) {
            return new Pair(-1, false);
        }
        if (z4 || !hashSet.isEmpty()) {
            z5 = true;
        } else {
            z5 = false;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Set keySet = hashMap.keySet();
            if (z4) {
                String join = TextUtils.join(",", keySet);
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 20);
                sb.append("contact_id NOT IN (");
                sb.append(join);
                sb.append(")");
                str3 = sb.toString();
            } else {
                str3 = m49466a(hashSet);
            }
            if (acoa4 == null) {
                z6 = z5;
                acoa = acoa4;
            } else {
                acno acno = new acno(sQLiteDatabase2, str3);
                while (acno.hasNext()) {
                    Long l = (Long) acno.next();
                    if (l != null) {
                        acoa4.f60316a.mo32870a(acoa.m49583a(l.longValue()));
                        z5 = z5;
                        acno = acno;
                        acoa4 = acoa4;
                    }
                }
                z6 = z5;
                acoa = acoa4;
            }
            int a6 = m49461a(sQLiteDatabase2, str8, str3);
            if (a6 > 0) {
                acnv.m49542a("Deleted %d contacts.", Integer.valueOf(a6));
            }
            String str14 = str;
            String str15 = str13;
            String str16 = str12;
            int a7 = a6 + m49461a(sQLiteDatabase2, str14, str3) + m49461a(sQLiteDatabase2, str15, str3) + m49461a(sQLiteDatabase2, str16, str3);
            if (!z4) {
                str4 = m49466a(keySet);
            } else {
                str4 = null;
            }
            acnu = new acnu(sQLiteDatabase2, str4);
            acmr acmr = new acmr(str8, "contact_id");
            acmr acmr2 = new acmr(str14, str11);
            int i5 = a7;
            acmr acmr3 = new acmr(str15, str11);
            String str17 = str15;
            acmr acmr4 = new acmr(str16, str11);
            boolean z10 = z6;
            while (acnu.hasNext()) {
                acoa acoa5 = acoa;
                String str18 = str16;
                String str19 = str14;
                String str20 = str9;
                acmo d = acnu.next();
                str9 = str20;
                ContentValues contentValues2 = d.f60161a;
                long j9 = j2;
                Long valueOf3 = Long.valueOf(m49462a(contentValues2));
                acmo acmo2 = (acmo) hashMap.get(valueOf3);
                if (acmo2 != null) {
                    str5 = str8;
                    ContentValues contentValues3 = acmo2.f60161a;
                    if (!contentValues2.equals(contentValues3)) {
                        acnv.m49555d("Contact %d has changed. Updating.", valueOf3);
                        acmr.f60171e.put(valueOf3, contentValues3);
                    }
                    m49468a(acmr2, acmo2.f60163c, d.f60163c);
                    m49468a(acmr3, acmo2.f60164d, d.f60164d);
                    m49468a(acmr4, acmo2.f60165e, d.f60165e);
                    hashMap.remove(valueOf3);
                    if (acmo2 != d && (m49469a(acmo2.f60161a, d.f60161a, f60172b) || m49470a(acmo2.f60163c, d.f60163c, f60173c) || m49470a(acmo2.f60164d, d.f60164d, f60174d) || m49470a(acmo2.f60165e, d.f60165e, f60175e))) {
                        if (acoa5 != null) {
                            acoa5.mo32941a(acmo2);
                        }
                        sQLiteDatabase2 = sQLiteDatabase;
                        str14 = str19;
                        str16 = str18;
                        str8 = str5;
                        j3 = j9;
                        z10 = true;
                        acoa2 = acoa5;
                        acms = this;
                    }
                } else {
                    str5 = str8;
                }
                sQLiteDatabase2 = sQLiteDatabase;
                str14 = str19;
                str16 = str18;
                str8 = str5;
                j3 = j9;
                acoa2 = acoa5;
                acms = this;
            }
            try {
                acnu.mo32887a();
                if (hashMap.size() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z11 = z7 | z10;
                bnia j10 = bnic.m109500j();
                j10.mo67629b(acmr);
                j10.mo67629b(acmr2);
                j10.mo67629b(acmr3);
                j10.mo67629b(acmr4);
                bnrd a8 = j10.mo67751a().iterator();
                i = i5;
                i2 = 0;
                int i6 = 0;
                while (a8.hasNext()) {
                    acmr acmr5 = (acmr) a8.next();
                    bnrd bnrd = a8;
                    String str21 = acmr5.f60167a;
                    acnv.m49542a("Applying deltas: %s", acmr5);
                    Iterator it = acmr5.f60169c.iterator();
                    int i7 = i6;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        ContentValues contentValues4 = (ContentValues) it.next();
                        String str22 = str16;
                        acnv.m49552c("Inserting into %s: %s", str21, contentValues4);
                        i7 += sQLiteDatabase2.insert(str21, null, contentValues4) == -1 ? 0 : 1;
                        str16 = str22;
                        it = it2;
                    }
                    String str23 = str16;
                    Iterator it3 = acmr5.f60171e.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        acnv.m49552c("Updating in %s: %s", str21, entry.getValue());
                        String str24 = acmr5.f60168b;
                        String valueOf4 = String.valueOf(entry.getKey());
                        StringBuilder sb2 = new StringBuilder(str24.length() + 1 + String.valueOf(valueOf4).length());
                        sb2.append(str24);
                        sb2.append("=");
                        sb2.append(valueOf4);
                        i2 += sQLiteDatabase2.update(str21, (ContentValues) entry.getValue(), sb2.toString(), null);
                        it3 = it3;
                        z11 = z11;
                        str14 = str14;
                    }
                    boolean z12 = z11;
                    String str25 = str14;
                    acnv.m49552c("Deleting from %s: %s", str21, acmr5.f60170d);
                    i += sQLiteDatabase2.delete(str21, m49467a(acmr5.f60168b, acmr5.f60170d), null);
                    a8 = bnrd;
                    i6 = i7;
                    str16 = str23;
                    z11 = z12;
                    str14 = str25;
                }
                z8 = z11;
                str6 = str14;
                i3 = i6;
                str7 = str16;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase.endTransaction();
                throw th;
            }
            try {
                Iterator it4 = hashMap.values().iterator();
                int i8 = i3;
                while (it4.hasNext()) {
                    String str26 = str9;
                    String str27 = str10;
                    acmo acmo3 = (acmo) it4.next();
                    if (acoa == null) {
                        acoa3 = acoa;
                    } else {
                        acoa3 = acoa;
                        acoa3.mo32941a(acmo3);
                    }
                    ContentValues contentValues5 = acmo3.f60161a;
                    Iterator it5 = it4;
                    acnv.m49555d("Inserting contact %s", contentValues5);
                    str10 = str27;
                    if (sQLiteDatabase2.insert(str8, null, contentValues5) == -1) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    String str28 = str6;
                    String str29 = str17;
                    int a9 = i8 + i4 + m49460a(sQLiteDatabase2, str28, acmo3.f60163c.values()) + m49460a(sQLiteDatabase2, str29, acmo3.f60164d.values());
                    String str30 = str7;
                    i8 = a9 + m49460a(sQLiteDatabase2, str30, acmo3.f60165e.values());
                    it4 = it5;
                    str17 = str29;
                    str7 = str30;
                    str9 = str26;
                    str6 = str28;
                    acoa = acoa3;
                }
                acnv.m49543a("New timestamps: update=%d, delete=%d", Long.valueOf(j6), Long.valueOf(j2));
                mo32895a().edit().putLong(str10, j6).putLong(str9, j2).apply();
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                acnv.m49549b("Contacts update done [inserted %d, updated %d deleted %d, took %d ms]", Integer.valueOf(i8), Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime() - j));
                bxvd da = bpym.f139887f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpym bpym = (bpym) da.f164949b;
                str8.getClass();
                int i9 = bpym.f139889a | 1;
                bpym.f139889a = i9;
                bpym.f139890b = str8;
                int i10 = i9 | 2;
                bpym.f139889a = i10;
                bpym.f139891c = i8;
                int i11 = 4 | i10;
                bpym.f139889a = i11;
                bpym.f139892d = i;
                bpym.f139889a = i11 | 8;
                bpym.f139893e = i2;
                this.f60178h.mo32443a((bpym) da.mo74062i());
                return new Pair(Integer.valueOf(i8 + i2 + i), Boolean.valueOf(z8));
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    private static String m49466a(Iterable iterable) {
        return m49467a("contact_id", iterable);
    }

    /* renamed from: a */
    static String m49467a(String str, Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        return String.format(Locale.US, "%s IN (%s)", str, TextUtils.join(",", iterable));
    }

    /* renamed from: a */
    private static final void m49468a(acmr acmr, Map map, Map map2) {
        HashSet hashSet = new HashSet(map2.keySet());
        for (Map.Entry entry : map.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            ContentValues contentValues = (ContentValues) entry.getValue();
            Long valueOf = Long.valueOf(longValue);
            hashSet.remove(valueOf);
            if (!map2.containsKey(valueOf)) {
                acmr.f60169c.add(contentValues);
            } else {
                ContentValues contentValues2 = (ContentValues) map2.get(valueOf);
                if (contentValues2 != null && !contentValues.equals(contentValues2)) {
                    acmr.f60171e.put(valueOf, contentValues);
                }
            }
        }
        acmr.f60170d.addAll(hashSet);
    }

    /* renamed from: a */
    static final boolean m49469a(ContentValues contentValues, ContentValues contentValues2, String[] strArr) {
        if (sdg.m34949a(contentValues, contentValues2)) {
            return false;
        }
        if (contentValues == null || contentValues2 == null) {
            return true;
        }
        for (String str : strArr) {
            if (!sdg.m34949a(contentValues.get(str), contentValues2.get(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static final boolean m49470a(Map map, Map map2, String[] strArr) {
        if (map == map2) {
            return false;
        }
        if (map.size() == map2.size()) {
            Set<Long> keySet = map.keySet();
            if (keySet.equals(map2.keySet())) {
                for (Long l : keySet) {
                    if (m49469a((ContentValues) map.get(l), (ContentValues) map2.get(l), strArr)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final SharedPreferences mo32895a() {
        return this.f60176f.getSharedPreferences("icing_internal_corpora_prefs", 0);
    }

    /* renamed from: a */
    public final Pair mo32881a(SQLiteDatabase sQLiteDatabase, Resources resources) {
        return m49465a(sQLiteDatabase, resources, false, null);
    }

    /* renamed from: a */
    public final Pair mo32882a(SQLiteDatabase sQLiteDatabase, Resources resources, Collection collection) {
        return m49465a(sQLiteDatabase, resources, false, collection);
    }
}
