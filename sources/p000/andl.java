package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: andl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andl {

    /* renamed from: b */
    public static final String[] f76683b = {"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail"};

    /* renamed from: c */
    public static final String[] f76684c = {"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail", "contact_last_updated_timestamp"};

    /* renamed from: d */
    public static final String[] f76685d = {"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "display_name", "display_name_alt"};

    /* renamed from: e */
    public static final String[] f76686e = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: f */
    static final String[] f76687f = {"raw_contact_id", "data1", "data2", "data3", "data5", "data6", "is_primary", "is_super_primary"};

    /* renamed from: g */
    public static final String[] f76688g = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: h */
    static final String[] f76689h = {"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};

    /* renamed from: i */
    public static final String[] f76690i = {"raw_contact_id", "data1", "data2", "data3", "is_primary", "is_super_primary"};

    /* renamed from: j */
    public static final String[] f76691j = {"raw_contact_id", "data1"};

    /* renamed from: k */
    public static final String[] f76692k = {"raw_contact_id", "photo_uri"};

    /* renamed from: l */
    public static final String[] f76693l = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};

    /* renamed from: m */
    public static final String[] f76694m = {"raw_contact_id", "data1"};

    /* renamed from: n */
    private static final String[] f76695n = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};

    /* renamed from: o */
    private static final String[] f76696o = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};

    /* renamed from: p */
    private static final String[] f76697p = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: a */
    public final Context f76698a;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    public andl(Context context) {
        this.f76698a = context;
    }

    /* renamed from: a */
    public static final boolean m64075a() {
        int i = Build.VERSION.SDK_INT;
        amig.m62939a();
        return Boolean.valueOf(cfvh.f185774a.mo6606a().mo82775c()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* renamed from: b */
    public final Map mo41736b(HashSet hashSet) {
        boolean z;
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = this.f76698a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f76695n, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (hashSet.contains(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            int i = cursor.getInt(cursor.getColumnIndex("data2"));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            int i2 = cursor.getInt(cursor.getColumnIndex("is_primary"));
                            int i3 = cursor.getInt(cursor.getColumnIndex("is_super_primary"));
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, new ArrayList());
                            }
                            ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
                            bxvd da = btff.f148636h.mo74144da();
                            boolean z2 = false;
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((btff) da.f164949b).f148638a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btff btff = (btff) da.f164949b;
                            btff.f148642e = i;
                            if (string2 != null) {
                                string2.getClass();
                                btff.f148639b = string2;
                            }
                            int i4 = cursor.getInt(cursor.getColumnIndex("times_used"));
                            long j = cursor.getLong(cursor.getColumnIndex("last_time_used"));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btff btff2 = (btff) da.f164949b;
                            btff2.f148640c = i4;
                            btff2.f148641d = j;
                            if (i2 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            btff2.f148643f = z;
                            if (i3 == 1) {
                                z2 = true;
                            }
                            btff2.f148644g = z2;
                            arrayList.add((btff) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching phone info", e);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Phone info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching phone info", e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r2 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r2 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* renamed from: c */
    public final Map mo41738c(HashSet hashSet) {
        boolean z;
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = mo41733a("vnd.android.cursor.item/im", f76687f);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (hashSet.contains(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            int i = cursor.getInt(cursor.getColumnIndex("data2"));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            int i2 = cursor.getInt(cursor.getColumnIndex("data5"));
                            String string3 = cursor.getString(cursor.getColumnIndex("data6"));
                            int i3 = cursor.getInt(cursor.getColumnIndex("is_primary"));
                            int i4 = cursor.getInt(cursor.getColumnIndex("is_super_primary"));
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, new ArrayList());
                            }
                            ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
                            bxvd da = btfj.f148684h.mo74144da();
                            boolean z2 = false;
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((btfj) da.f164949b).f148686a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btfj btfj = (btfj) da.f164949b;
                            btfj.f148687b = i;
                            if (string2 != null) {
                                string2.getClass();
                                btfj.f148688c = string2;
                            }
                            btfj.f148689d = i2;
                            if (string3 != null) {
                                string3.getClass();
                                btfj.f148690e = string3;
                            }
                            if (i3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            btfj.f148691f = z;
                            if (i4 == 1) {
                                z2 = true;
                            }
                            btfj.f148692g = z2;
                            arrayList.add((btfj) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching im info", e);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch im info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching im info", e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final Cursor mo41733a(String str, String[] strArr) {
        ContentResolver contentResolver = this.f76698a.getContentResolver();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append("mimetype = '");
        sb.append(str);
        sb.append('\'');
        return contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, sb.toString(), null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* renamed from: a */
    public final Map mo41734a(HashSet hashSet) {
        boolean z;
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = this.f76698a.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, f76696o, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (hashSet.contains(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            int i = cursor.getInt(cursor.getColumnIndex("data2"));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            int i2 = cursor.getInt(cursor.getColumnIndex("is_primary"));
                            int i3 = cursor.getInt(cursor.getColumnIndex("is_super_primary"));
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, new ArrayList());
                            }
                            ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
                            bxvd da = btfd.f148613h.mo74144da();
                            boolean z2 = false;
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((btfd) da.f164949b).f148615a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btfd btfd = (btfd) da.f164949b;
                            btfd.f148619e = i;
                            if (string2 != null) {
                                string2.getClass();
                                btfd.f148616b = string2;
                            }
                            long j = cursor.getLong(cursor.getColumnIndex("times_used"));
                            long j2 = cursor.getLong(cursor.getColumnIndex("last_time_used"));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btfd btfd2 = (btfd) da.f164949b;
                            btfd2.f148617c = j;
                            btfd2.f148618d = j2;
                            if (i2 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            btfd2.f148620f = z;
                            if (i3 == 1) {
                                z2 = true;
                            }
                            btfd2.f148621g = z2;
                            arrayList.add((btfd) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching email info", e);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Email info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching email info", e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo41737b(Map map) {
        Cursor cursor = null;
        try {
            cursor = mo41733a("vnd.android.cursor.item/nickname", f76697p);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (map.containsKey(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            Integer valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("data2")));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            bxvd da = btfk.f148693d.mo74144da();
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((btfk) da.f164949b).f148695a = string;
                            }
                            int intValue = valueOf2.intValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btfk btfk = (btfk) da.f164949b;
                            btfk.f148697c = intValue;
                            if (string2 != null) {
                                string2.getClass();
                                btfk.f148696b = string2;
                            }
                            ((andk) map.get(valueOf)).f76677i = (btfk) da.mo74062i();
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", e);
                            if (cursor == null) {
                            }
                            cursor.close();
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Nickname info; disabled? Give up.");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", e);
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo41735a(Map map) {
        Map map2 = map;
        Cursor cursor = null;
        try {
            cursor = mo41733a("vnd.android.cursor.item/organization", f76689h);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (map2.containsKey(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            int i = cursor.getInt(cursor.getColumnIndex("data2"));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            String string3 = cursor.getString(cursor.getColumnIndex("data4"));
                            String string4 = cursor.getString(cursor.getColumnIndex("data5"));
                            String string5 = cursor.getString(cursor.getColumnIndex("data6"));
                            String string6 = cursor.getString(cursor.getColumnIndex("data7"));
                            String string7 = cursor.getString(cursor.getColumnIndex("data8"));
                            String string8 = cursor.getString(cursor.getColumnIndex("data9"));
                            String string9 = cursor.getString(cursor.getColumnIndex("data10"));
                            bxvd da = btfl.f148698k.mo74144da();
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((btfl) da.f164949b).f148700a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btfl btfl = (btfl) da.f164949b;
                            btfl.f148701b = i;
                            if (string2 != null) {
                                string2.getClass();
                                btfl.f148702c = string2;
                            }
                            if (string3 != null) {
                                string3.getClass();
                                btfl.f148703d = string3;
                            }
                            if (string4 != null) {
                                string4.getClass();
                                btfl.f148704e = string4;
                            }
                            if (string5 != null) {
                                string5.getClass();
                                btfl.f148705f = string5;
                            }
                            if (string6 != null) {
                                string6.getClass();
                                btfl.f148706g = string6;
                            }
                            if (string7 != null) {
                                string7.getClass();
                                btfl.f148707h = string7;
                            }
                            if (string8 != null) {
                                string8.getClass();
                                btfl.f148708i = string8;
                            }
                            if (string9 != null) {
                                string9.getClass();
                                btfl.f148709j = string9;
                            }
                            ((andk) map2.get(valueOf)).f76678j = (btfl) da.mo74062i();
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching organization info", e);
                            if (cursor == null) {
                            }
                            cursor.close();
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ReadContactsHelper", "Could not query CP2 to fetch Organization info; disabled? Give up.");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching organization info", e);
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }
}
