package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: lzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzg {

    /* renamed from: a */
    public static final lvn f33247a = new lvn("ReadContacts");

    /* renamed from: b */
    public static final Integer f33248b = 0;

    /* renamed from: c */
    public static final boolean f33249c = true;

    /* renamed from: e */
    public static Set f33250e;

    /* renamed from: f */
    public static final byte[] f33251f = new byte[0];

    /* renamed from: i */
    static final String[] f33252i = {"_id", "times_contacted", "last_time_contacted", "starred"};

    /* renamed from: j */
    static final String[] f33253j = {"_id", "contact_id", "account_type", "account_name", "sourceid"};

    /* renamed from: k */
    public static final String[] f33254k = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: l */
    public static final String[] f33255l = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};

    /* renamed from: m */
    public static final String[] f33256m = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};

    /* renamed from: n */
    public static final String[] f33257n = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: o */
    static final String[] f33258o = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: p */
    static final String[] f33259p = {"raw_contact_id", "data1", "data2", "data3", "data5", "data6"};

    /* renamed from: q */
    static final String[] f33260q = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: r */
    static final String[] f33261r = {"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};

    /* renamed from: s */
    public static final String[] f33262s = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: t */
    public static final String[] f33263t = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: u */
    public static final String[] f33264u = {"raw_contact_id", "data1"};

    /* renamed from: v */
    private static final String[] f33265v = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: w */
    private static final String[] f33266w = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};

    /* renamed from: x */
    private static final String[] f33267x = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};

    /* renamed from: y */
    private static final String[] f33268y = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: z */
    private static final String[] f33269z = {"raw_contact_id", "data1"};

    /* renamed from: d */
    public final bmzi f33270d = bmzn.m108681a(lzc.f33234a);

    /* renamed from: g */
    public final Context f33271g;

    /* renamed from: h */
    public long f33272h = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public lzg(Context context) {
        this.f33271g = context;
    }

    /* renamed from: a */
    public final Cursor mo19775a(String str, String[] strArr) {
        ContentResolver contentResolver = this.f33271g.getContentResolver();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append("mimetype = '");
        sb.append(str);
        sb.append('\'');
        return contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, sb.toString(), null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r1 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r1 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* renamed from: b */
    public final Map mo19779b(HashSet hashSet) {
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = mo19775a("vnd.android.cursor.item/im", f33259p);
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
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, new ArrayList());
                            }
                            ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
                            bxvd da = bssx.f146932f.mo74144da();
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((bssx) da.f164949b).f146934a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bssx bssx = (bssx) da.f164949b;
                            bssx.f146935b = i;
                            if (string2 != null) {
                                string2.getClass();
                                bssx.f146936c = string2;
                            }
                            bssx.f146937d = i2;
                            if (string3 != null) {
                                string3.getClass();
                                bssx.f146938e = string3;
                            }
                            arrayList.add((bssx) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            f33247a.mo25417e("ContentResolver.query threw an exception when fetching im info", e, new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                f33247a.mo25416d("Could not query ContactsProvider to fetch im info; disabled? Give up.", new Object[0]);
            }
        } catch (SQLiteException e2) {
            e = e2;
            f33247a.mo25417e("ContentResolver.query threw an exception when fetching im info", e, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0119, code lost:
        if (r8 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        if (r8 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012d, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0131  */
    /* renamed from: a */
    public final Map mo19776a(HashSet hashSet) {
        HashMap hashMap = new HashMap();
        ContentResolver contentResolver = this.f33271g.getContentResolver();
        String[] strArr = cckw.m130266d() ? f33268y : f33267x;
        String[] strArr2 = cckw.m130266d() ? f33266w : f33265v;
        Cursor cursor = null;
        try {
            Uri uri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            if (!f33249c) {
                strArr = strArr2;
            }
            cursor = contentResolver.query(uri, strArr, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (hashSet.contains(valueOf)) {
                            String string = cursor.getString(cursor.getColumnIndex("data1"));
                            int i = cursor.getInt(cursor.getColumnIndex("data2"));
                            String string2 = cursor.getString(cursor.getColumnIndex("data3"));
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, new ArrayList());
                            }
                            ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
                            bxvd da = bssw.f146924g.mo74144da();
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                string.getClass();
                                ((bssw) da.f164949b).f146926a = string;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bssw bssw = (bssw) da.f164949b;
                            bssw.f146930e = i;
                            if (string2 != null) {
                                string2.getClass();
                                bssw.f146927b = string2;
                            }
                            if (cckw.m130266d()) {
                                boolean z = cursor.getInt(cursor.getColumnIndex("is_super_primary")) != 0;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ((bssw) da.f164949b).f146931f = z;
                            }
                            if (f33249c) {
                                long j = cursor.getLong(cursor.getColumnIndex("times_used"));
                                long j2 = cursor.getLong(cursor.getColumnIndex("last_time_used"));
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bssw bssw2 = (bssw) da.f164949b;
                                bssw2.f146928c = j;
                                bssw2.f146929d = j2;
                            }
                            arrayList.add((bssw) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            f33247a.mo25417e("ContentResolver.query threw an exception when fetching email info", e, new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                f33247a.mo25416d("Could not query ContactsProvider to fetch Email info; disabled? Give up.", new Object[0]);
            }
        } catch (SQLiteException e2) {
            e = e2;
            f33247a.mo25417e("ContentResolver.query threw an exception when fetching email info", e, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo19780b(Map map) {
        Cursor cursor = null;
        try {
            cursor = mo19775a("vnd.android.cursor.item/name", f33269z);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (map.containsKey(valueOf)) {
                            ((lzf) map.get(valueOf)).f33244g = cursor.getString(cursor.getColumnIndex("data1"));
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            f33247a.mo25417e("ContentResolver.query threw an exception when fetching note info", e, new Object[0]);
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
                f33247a.mo25416d("Could not query ContactsProvider to fetch display name; disabled? Give up.", new Object[0]);
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            f33247a.mo25417e("ContentResolver.query threw an exception when fetching note info", e, new Object[0]);
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

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo19777a(Map map) {
        Map map2 = map;
        Cursor cursor = null;
        try {
            try {
                cursor = mo19775a("vnd.android.cursor.item/organization", f33261r);
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
                                bxvd da = bssz.f146944k.mo74144da();
                                if (string != null) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    string.getClass();
                                    ((bssz) da.f164949b).f146946a = string;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bssz bssz = (bssz) da.f164949b;
                                bssz.f146947b = i;
                                if (string2 != null) {
                                    string2.getClass();
                                    bssz.f146948c = string2;
                                }
                                if (string3 != null) {
                                    string3.getClass();
                                    bssz.f146949d = string3;
                                }
                                if (string4 != null) {
                                    string4.getClass();
                                    bssz.f146950e = string4;
                                }
                                if (string5 != null) {
                                    string5.getClass();
                                    bssz.f146951f = string5;
                                }
                                if (string6 != null) {
                                    string6.getClass();
                                    bssz.f146952g = string6;
                                }
                                if (string7 != null) {
                                    string7.getClass();
                                    bssz.f146953h = string7;
                                }
                                if (string8 != null) {
                                    string8.getClass();
                                    bssz.f146954i = string8;
                                }
                                if (string9 != null) {
                                    string9.getClass();
                                    bssz.f146955j = string9;
                                }
                                ((lzf) map2.get(valueOf)).f33246i = (bssz) da.mo74062i();
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            try {
                                f33247a.mo25417e("ContentResolver.query threw an exception when fetching organization info", e, new Object[0]);
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
                    f33247a.mo25416d("Could not query CP2 to fetch Organization info; disabled? Give up.", new Object[0]);
                }
                if (cursor == null) {
                    return;
                }
            } catch (SQLiteException e2) {
                e = e2;
                f33247a.mo25417e("ContentResolver.query threw an exception when fetching organization info", e, new Object[0]);
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
        } catch (SQLiteException e3) {
            e = e3;
            f33247a.mo25417e("ContentResolver.query threw an exception when fetching organization info", e, new Object[0]);
            if (cursor == null) {
            }
            cursor.close();
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: a */
    public final boolean mo19778a(long j) {
        synchronized (this) {
            if (this.f33272h + j > cckw.m130270h()) {
                return false;
            }
            this.f33272h += j;
            return true;
        }
    }
}
