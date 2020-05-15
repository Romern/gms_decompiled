package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;

/* renamed from: aoza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoza {

    /* renamed from: A */
    private static final String[] f83888A = {"raw_contact_id", "data1"};

    /* renamed from: B */
    private static final String[] f83889B = {"contact_id", "contact_deleted_timestamp"};

    /* renamed from: C */
    private static final String[] f83890C = {"contact_id", "display_name"};

    /* renamed from: D */
    private static final String[] f83891D = {"contact_id", "display_name", "lookup"};

    /* renamed from: E */
    private static final String[] f83892E = {"_id", "data_set", "title", "notes", "system_id", "group_visible", "deleted", "should_sync", "account_name", "account_type", "dirty", "sourceid"};

    /* renamed from: F */
    private static final String[] f83893F = {"raw_contact_id", "data1"};

    /* renamed from: a */
    public static final Integer f83894a = 0;

    /* renamed from: b */
    public static final boolean f83895b = true;

    /* renamed from: c */
    public static Set f83896c;

    /* renamed from: d */
    public static final byte[] f83897d = new byte[0];

    /* renamed from: h */
    static final String[] f83898h = {"_id", "times_contacted", "last_time_contacted", "starred"};

    /* renamed from: i */
    static final String[] f83899i = {"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "starred"};

    /* renamed from: j */
    static final String[] f83900j = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: k */
    static final String[] f83901k = {"raw_contact_id", "data1", "data2", "data3", "data5", "data6"};

    /* renamed from: l */
    static final String[] f83902l = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: m */
    static final String[] f83903m = {"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};

    /* renamed from: n */
    static final String[] f83904n = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};

    /* renamed from: o */
    private static final boolean f83905o = true;

    /* renamed from: p */
    private static final String[] f83906p = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: q */
    private static final String[] f83907q = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};

    /* renamed from: r */
    private static final String[] f83908r = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};

    /* renamed from: s */
    private static final String[] f83909s = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: t */
    private static final String[] f83910t = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: u */
    private static final String[] f83911u = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};

    /* renamed from: v */
    private static final String[] f83912v = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};

    /* renamed from: w */
    private static final String[] f83913w = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: x */
    private static final String[] f83914x = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: y */
    private static final String[] f83915y = {"raw_contact_id", "data1"};

    /* renamed from: z */
    private static final String[] f83916z = {"raw_contact_id", "data1", "data2", "data3"};

    /* renamed from: e */
    public final Context f83917e;

    /* renamed from: f */
    public long f83918f = 0;

    /* renamed from: g */
    public final aoyh f83919g;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public aoza(Context context) {
        this.f83917e = context;
        this.f83919g = aoyh.m69805a("ReadContactsHelper");
    }

    /* renamed from: a */
    private final Cursor m69873a(String str, String[] strArr) {
        ContentResolver contentResolver = this.f83917e.getContentResolver();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append("mimetype = '");
        sb.append(str);
        sb.append('\'');
        return contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, sb.toString(), null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r1 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r1 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8  */
    /* renamed from: b */
    private final Map m69877b(HashSet hashSet) {
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = m69873a("vnd.android.cursor.item/im", f83901k);
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
                            bxvd da = btfj.f148684h.mo74144da();
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
                            arrayList.add((btfj) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching im info");
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch im info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching im info");
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* renamed from: c */
    private final HashMap m69879c(long j) {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        if (j <= 0 || !f83895b) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder(51);
            sb.append("contact_last_updated_timestamp>");
            sb.append(j);
            str = sb.toString();
        }
        try {
            cursor = this.f83917e.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build(), f83898h, str, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        long j2 = cursor.getLong(cursor.getColumnIndex("_id"));
                        int i = cursor.getInt(cursor.getColumnIndex("times_contacted"));
                        long j3 = cursor.getLong(cursor.getColumnIndex("last_time_contacted"));
                        if (cursor.getInt(cursor.getColumnIndex("starred")) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hashMap.put(Long.valueOf(j2), new aoyr(j2, i, j3, z));
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching Contact Ids.");
                            String valueOf = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 34);
                            sb2.append("Fetching Contact Ids query failed.");
                            sb2.append(valueOf);
                            throw new aoyv(sb2.toString());
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                cursor.close();
                return hashMap;
            }
            this.f83919g.mo46983c("Could not query ContactsProvider to fetch Contact Ids; disabled? Give up.");
            throw new aoyu("Contacts query cursor is null");
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching Contact Ids.");
            String valueOf2 = String.valueOf(e);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
            sb22.append("Fetching Contact Ids query failed.");
            sb22.append(valueOf2);
            throw new aoyv(sb22.toString());
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013f, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0141, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0144, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148  */
    /* renamed from: a */
    private final Map m69874a(HashSet hashSet) {
        HashMap hashMap = new HashMap();
        ContentResolver contentResolver = this.f83917e.getContentResolver();
        String[] strArr = cgij.m145551i() ? f83913w : f83911u;
        String[] strArr2 = cgij.m145551i() ? f83912v : f83910t;
        Cursor cursor = null;
        try {
            Uri uri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            if (!f83905o) {
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
                            bxvd da = btfd.f148613h.mo74144da();
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
                            ((btfd) da.f164949b).f148619e = i;
                            String charSequence = ContactsContract.CommonDataKinds.Email.getTypeLabel(this.f83917e.getResources(), i, string2).toString();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            charSequence.getClass();
                            ((btfd) da.f164949b).f148616b = charSequence;
                            if (cgij.m145551i()) {
                                boolean z = true;
                                if (cursor.getInt(cursor.getColumnIndex("is_super_primary")) != 1) {
                                    z = false;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ((btfd) da.f164949b).f148621g = z;
                            }
                            if (f83905o) {
                                long j = cursor.getLong(cursor.getColumnIndex("times_used"));
                                long j2 = cursor.getLong(cursor.getColumnIndex("last_time_used"));
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                btfd btfd = (btfd) da.f164949b;
                                btfd.f148617c = j;
                                btfd.f148618d = j2;
                            }
                            arrayList.add((btfd) da.mo74062i());
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching email info");
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch Email info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching email info");
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    private final void m69880c(Map map) {
        Cursor cursor = null;
        try {
            cursor = m69873a("vnd.android.cursor.item/group_membership", f83893F);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (map.containsKey(valueOf)) {
                            ((aoyz) map.get(valueOf)).f83887o.add(Long.valueOf(cursor.getLong(cursor.getColumnIndex("data1"))));
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching group membership info");
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
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch group membership info.");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching group membership info");
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

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    private final void m69878b(Map map) {
        Cursor cursor = null;
        try {
            cursor = m69873a("vnd.android.cursor.item/nickname", f83916z);
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
                            ((aoyz) map.get(valueOf)).f83884l = (btfk) da.mo74062i();
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching note info");
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
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch Nickname info; disabled? Give up.");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching note info");
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

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        if (r5 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01be, code lost:
        if (r5 != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c0, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        return (p000.btfe[]) r2.toArray(new p000.btfe[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cf  */
    /* renamed from: c */
    public final btfe[] mo47031c() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 1;
        if (cgjy.m145760g()) {
            this.f83919g.mo46981b("Group ID : starting fetch of Groups");
        } else {
            aoyh aoyh = this.f83919g;
            Object[] objArr = {"Group ID : starting fetch of Groups"};
            if (Log.isLoggable(aoyh.f83843a, 4)) {
                Log.i(aoyh.f83843a, aoyh.m69806f("ContactsLogger", objArr));
            }
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f83917e.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, f83892E, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
                        String string = cursor.getString(cursor.getColumnIndex("data_set"));
                        String string2 = cursor.getString(cursor.getColumnIndex("title"));
                        String string3 = cursor.getString(cursor.getColumnIndex("notes"));
                        String string4 = cursor.getString(cursor.getColumnIndex("system_id"));
                        Integer valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("group_visible")));
                        Integer valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("deleted")));
                        Integer valueOf4 = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("should_sync")));
                        String string5 = cursor.getString(cursor.getColumnIndex("account_name"));
                        String string6 = cursor.getString(cursor.getColumnIndex("account_type"));
                        bxvd da = btfe.f148622m.mo74144da();
                        if (valueOf2.intValue() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((btfe) da.f164949b).f148629f = z;
                        if (valueOf3.intValue() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((btfe) da.f164949b).f148630g = z2;
                        if (valueOf4.intValue() == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((btfe) da.f164949b).f148631h = z3;
                        if (cgiw.m145589b()) {
                            boolean z4 = cursor.getInt(cursor.getColumnIndex("dirty")) == 1;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btfe) da.f164949b).f148634k = z4;
                        }
                        if (cgiw.m145590c()) {
                            String string7 = cursor.getString(cursor.getColumnIndex("sourceid"));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            string7.getClass();
                            ((btfe) da.f164949b).f148635l = string7;
                        }
                        long longValue = valueOf.longValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btfe btfe = (btfe) da.f164949b;
                        btfe.f148624a = longValue;
                        if (string != null) {
                            string.getClass();
                            btfe.f148625b = string;
                        }
                        if (string2 != null) {
                            string2.getClass();
                            btfe.f148626c = string2;
                        }
                        if (string3 != null) {
                            string3.getClass();
                            btfe.f148627d = string3;
                        }
                        if (string4 != null) {
                            string4.getClass();
                            btfe.f148628e = string4;
                        }
                        if (string5 != null) {
                            string5.getClass();
                            btfe.f148632i = string5;
                        }
                        if (string6 != null) {
                            string6.getClass();
                            btfe.f148633j = string6;
                        }
                        arrayList.add((btfe) da.mo74062i());
                        i = 1;
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching Group info");
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch Group info; disabled? Give up.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching Group info");
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final Map m69875a(String[] strArr) {
        HashMap hashMap = new HashMap();
        try {
            Cursor query = this.f83917e.getContentResolver().query(ContactsContract.Data.CONTENT_URI, strArr, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("contact_id")));
                    String string = query.getString(query.getColumnIndex("display_name"));
                    bxvd da = btfa.f148603c.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    string.getClass();
                    ((btfa) da.f164949b).f148606b = string;
                    if (cgij.m145553k()) {
                        String string2 = query.getString(query.getColumnIndex("lookup"));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        string2.getClass();
                        ((btfa) da.f164949b).f148605a = string2;
                    }
                    hashMap.put(valueOf, (btfa) da.mo74062i());
                    new Object[1][0] = string;
                }
                query.close();
            } else {
                this.f83919g.mo46983c("CP2 query failed when fetching lookup key.");
            }
            return hashMap;
        } catch (SQLiteException e) {
            if (cgjy.m145760g()) {
                this.f83919g.mo46980a(e, "CP2 query exception when fetching display name.");
            } else {
                this.f83919g.mo46987e("CP2 query exception when fetching display name.", e);
            }
            return hashMap;
        }
    }

    /* renamed from: b */
    public final Map mo47029b() {
        if (cgij.m145553k()) {
            return m69875a(f83891D);
        }
        return m69875a(f83890C);
    }

    /* renamed from: b */
    public final boolean mo47030b(long j) {
        synchronized (this) {
            if (this.f83918f + j > cgjy.m145767n()) {
                return false;
            }
            this.f83918f += j;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m69876a(Map map) {
        Cursor cursor = null;
        try {
            cursor = m69873a("vnd.android.cursor.item/name", f83915y);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        if (map.containsKey(valueOf)) {
                            ((aoyz) map.get(valueOf)).f83883k = cursor.getString(cursor.getColumnIndex("data1"));
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching note info");
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
                this.f83919g.mo46983c("Could not query ContactsProvider to fetch display name; disabled? Give up.");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f83919g.mo46980a(e, "ContentResolver.query threw an exception when fetching note info");
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

    /* renamed from: a */
    public final btem mo47025a() {
        return mo47026a(true);
    }

    /* renamed from: a */
    public final btem mo47026a(boolean z) {
        btfi[] a = mo47028a(z, 0);
        btel btel = (btel) btem.f148532c.mo74144da();
        btel.mo70754a(Arrays.asList(a));
        return (btem) btel.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* renamed from: a */
    public final HashSet mo47027a(long j) {
        String str;
        sdo.m34971a(f83895b, (Object) "Delta API not supported");
        if (aoyn.m69849a("android.permission.READ_CONTACTS")) {
            Cursor cursor = null;
            long j2 = 0;
            if (j > 0) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("contact_deleted_timestamp>");
                sb.append(j);
                str = sb.toString();
            } else {
                str = null;
            }
            HashSet hashSet = new HashSet();
            try {
                cursor = this.f83917e.getContentResolver().query(ContactsContract.DeletedContacts.CONTENT_URI, f83889B, str, null, null);
                if (cursor != null) {
                    try {
                        int columnIndex = cursor.getColumnIndex("contact_id");
                        while (cursor.moveToNext()) {
                            j2++;
                            hashSet.add(Long.valueOf(cursor.getLong(columnIndex)));
                        }
                        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
                        cursor.close();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    this.f83919g.mo46983c("Could not fetch deleted contacts");
                }
                hashSet.removeAll(m69879c(j).keySet());
                return hashSet;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            this.f83919g.mo46983c("Don't have READ_CONTACTS permission; giving up reading deleted contacts.");
            return new HashSet();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:419:0x077f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:340:0x05f9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:781:0x05f9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:254:0x04aa */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:773:0x04aa */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:775:0x04aa */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:268:0x0505 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:237:0x0479 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:198:0x03ac */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:769:0x03ac */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:771:0x03ac */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:213:0x0409 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:139:0x02b4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:765:0x02b4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:758:0x0088 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:130:0x029b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:760:0x0088 */
    /* JADX WARN: Type inference failed for: r23v1, assign insn: PHI: (r23v1 ?) = (r23v23 ?), (r23v30 ?), (r23v32 ?) binds: [B:237:0x0479, B:248:?, B:246:0x0492] */
    /* JADX WARN: Type inference failed for: r22v1, assign insn: PHI: (r22v1 ?) = (r22v21 ?), (r22v27 ?), (r22v29 ?) binds: [B:237:0x0479, B:248:?, B:246:0x0492] */
    /* JADX WARN: Type inference failed for: r23v21, assign insn: PHI: (r23v21 ?) = (r23v23 ?), (r23v31 ?) binds: [B:237:0x0479, B:246:0x0492] */
    /* JADX WARN: Type inference failed for: r22v19, assign insn: PHI: (r22v19 ?) = (r22v21 ?), (r22v28 ?) binds: [B:237:0x0479, B:246:0x0492] */
    /* JADX WARN: Type inference failed for: r24v24, assign insn: PHI: (r24v24 ?) = (r24v26 ?), (r24v29 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r24v30 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:243:0x0487, B:235:0x046e, B:208:0x03f4] */
    /* JADX WARN: Type inference failed for: r23v22, assign insn: PHI: (r23v22 ?) = (r23v24 ?), (r23v23 ?), (r23v23 ?) binds: [B:243:0x0487, B:235:0x046e, B:208:0x03f4] */
    /* JADX WARN: Type inference failed for: r22v20, assign insn: PHI: (r22v20 ?) = (r22v22 ?), (r22v21 ?), (r22v21 ?) binds: [B:243:0x0487, B:235:0x046e, B:208:0x03f4] */
    /* JADX WARN: Type inference failed for: r22v21, types: [android.net.Uri], assign insn: 0x039c: SGET  (r22v21 ? I:android.net.Uri) =  android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI android.net.Uri */
    /* JADX WARN: Type inference failed for: r23v23, types: [java.lang.String[]], assign insn: 0x039e: SGET  (r23v23 ? I:java.lang.String[]) =  aoza.x java.lang.String[] */
    /* JADX WARN: Type inference failed for: r20v23, assign insn: PHI: (r20v23 ?) = (r20v42 ?), (r20v29 ?) binds: [B:138:0x02b2, B:765:0x02b4] */
    /* JADX WARN: Type inference failed for: r20v24, assign insn: PHI: (r20v24 ?) = (r20v23 ?), (r20v33 bqgj) binds: [B:139:0x02b4, B:156:0x0317] */
    /* JADX WARN: Type inference failed for: r20v29, assign insn: PHI: (r20v29 ?) = (r20v30 bqgj), (r20v31 bqgj) binds: [B:768:0x02b4, B:767:0x02b4] */
    /* JADX WARN: Type inference failed for: r24v26, assign insn: PHI: (r24v26 ?) = (r24v26 ?), (r24v27 ?), (r24v27 ?) binds: [B:758:0x0088, B:760:0x0088, B:759:0x0088] */
    /* JADX WARN: Type inference failed for: r23v24, assign insn: PHI: (r23v24 ?) = (r23v24 ?), (r23v25 ?), (r23v25 ?) binds: [B:758:0x0088, B:760:0x0088, B:759:0x0088] */
    /* JADX WARN: Type inference failed for: r22v22, assign insn: PHI: (r22v22 ?) = (r22v22 ?), (r22v23 ?), (r22v23 ?) binds: [B:758:0x0088, B:760:0x0088, B:759:0x0088] */
    /* JADX WARN: Type inference failed for: r20v42, assign insn: PHI: (r20v42 ?) = (r20v42 ?), (r20v43 ?), (r20v43 ?) binds: [B:758:0x0088, B:760:0x0088, B:759:0x0088] */
    /* JADX WARN: Type inference failed for: r20v43, types: [java.lang.String], assign insn: 0x00cc: INVOKE  (r20v43 ? I:java.lang.String) = (r12v1 android.database.Cursor), (r5v60 int) type: INTERFACE call: android.database.Cursor.getString(int):java.lang.String */
    /* JADX WARN: Type inference failed for: r22v23, types: [java.lang.Long], assign insn: 0x00e4: INVOKE  (r22v23 ? I:java.lang.Long) = (r16v3 long) type: STATIC call: java.lang.Long.valueOf(long):java.lang.Long */
    /* JADX WARN: Type inference failed for: r23v25, types: [java.lang.Long], assign insn: 0x00f2: INVOKE  (r23v25 ? I:java.lang.Long) = (r16v4 long) type: STATIC call: java.lang.Long.valueOf(long):java.lang.Long */
    /* JADX WARN: Type inference failed for: r24v27, types: [int], assign insn: 0x00fc: INVOKE  (r24v27 ? I:int) = (r12v1 android.database.Cursor), (r5v68 int) type: INTERFACE call: android.database.Cursor.getInt(int):int */
    /* JADX WARN: Type inference failed for: r24v29, assign insn: 0x03a0: CONST  (r24v29 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r24v30, assign insn: 0x03a0: CONST  (r24v30 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v22, assign insn: ?: MOVE  (r32v22 ?) = (r32v0 long) */
    /* JADX WARN: Type inference failed for: r23v30, assign insn: ?: MOVE  (r23v30 ?) = (r23v21 ?) */
    /* JADX WARN: Type inference failed for: r22v27, assign insn: ?: MOVE  (r22v27 ?) = (r22v19 ?) */
    /* JADX WARN: Type inference failed for: r23v31, assign insn: ?: MOVE  (r23v31 ?) = (r23v22 ?) */
    /* JADX WARN: Type inference failed for: r23v32, assign insn: ?: MOVE  (r23v32 ?) = (r23v22 ?) */
    /* JADX WARN: Type inference failed for: r22v28, assign insn: ?: MOVE  (r22v28 ?) = (r22v20 ?) */
    /* JADX WARN: Type inference failed for: r22v29, assign insn: ?: MOVE  (r22v29 ?) = (r22v20 ?) */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0285, code lost:
        if (r13 == null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a2, code lost:
        if (r13 != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r2 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3 = m69873a("vnd.android.cursor.item/website", p000.aoza.f83900j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b2, code lost:
        if (r3 == null) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b8, code lost:
        if (r3.moveToNext() == false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ba, code lost:
        r6 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02cc, code lost:
        if (r5.contains(r6) == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ce, code lost:
        r7 = r3.getString(r3.getColumnIndex("data1"));
        r13 = r3.getInt(r3.getColumnIndex("data2"));
        r14 = r3.getString(r3.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f0, code lost:
        if (r2.containsKey(r6) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r2.put(r6, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fc, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0301, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0302, code lost:
        r6 = r0;
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r6 = (java.util.ArrayList) r2.get(r6);
        r15 = p000.btfp.f148731d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0313, code lost:
        if (r7 == null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0315, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0319, code lost:
        if (r15.f164950c != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031c, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0323, code lost:
        r7.getClass();
        ((p000.btfp) r15.f164949b).f148733a = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x032d, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0331, code lost:
        if (r15.f164950c != false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033a, code lost:
        r7 = (p000.btfp) r15.f164949b;
        r7.f148734b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0340, code lost:
        if (r14 != null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0343, code lost:
        r14.getClass();
        r7.f148735c = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0348, code lost:
        r6.add((p000.btfp) r15.mo74062i());
        r8 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0355, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0359, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0361, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0362, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0364, code lost:
        r6 = r0;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0366, code lost:
        r20 = r8;
        r1.f83919g.mo46983c("Could not query ContactsProvider to fetch Website info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x036f, code lost:
        if (r3 != null) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0372, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0374, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0377, code lost:
        r0 = e;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0379, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x037a, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0380, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0381, code lost:
        r20 = r8;
        r6 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1.f83919g.mo46980a(r6, "ContentResolver.query threw an exception when fetching website info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x038c, code lost:
        if (r3 == null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0391, code lost:
        r3 = new java.util.HashMap();
        r21 = r1.f83917e.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r22 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        r23 = p000.aoza.f83914x;
        r24 = null;
        r24 = 0;
        r24 = 0;
        r24 = null;
        r25 = null;
        r26 = null;
        r6 = r21.query(r22, r23, null, null, null);
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03aa, code lost:
        if (r6 == null) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03b0, code lost:
        if (r6.moveToNext() == false) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03b2, code lost:
        r7 = java.lang.Long.valueOf(r6.getLong(r6.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03c4, code lost:
        if (r5.contains(r7) == false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03c6, code lost:
        r8 = r6.getString(r6.getColumnIndex("data1"));
        r13 = r6.getInt(r6.getColumnIndex("data2"));
        r14 = r6.getString(r6.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e8, code lost:
        if (r3.containsKey(r7) != false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r3.put(r7, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f4, code lost:
        r7 = r0;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r7 = (java.util.List) r3.get(r7);
        r15 = p000.btfg.f148645f.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0405, code lost:
        if (r8 == null) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0407, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x040b, code lost:
        if (r15.f164950c != false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x040e, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0415, code lost:
        r8.getClass();
        ((p000.btfg) r15.f164949b).f148647a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0423, code lost:
        if (r15.f164950c != false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0426, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x042c, code lost:
        ((p000.btfg) r15.f164949b).f148649c = r13;
        r8 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r1.f83917e.getResources(), r13, r14).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0442, code lost:
        if (r15.f164950c != false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0445, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x044b, code lost:
        r8.getClass();
        ((p000.btfg) r15.f164949b).f148648b = r8;
        r7.add((p000.btfg) r15.mo74062i());
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0461, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0465, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0468, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0469, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x046b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x046c, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x046e, code lost:
        r7 = r0;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0470, code lost:
        r21 = r9;
        r1.f83919g.mo46983c("Could not query ContactsProvider to fetch Postal info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0479, code lost:
        if (r6 != null) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x047c, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x047f, code lost:
        r0 = e;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0481, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0482, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0486, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0487, code lost:
        r21 = r9;
        r7 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r1.f83919g.mo46980a(r7, "ContentResolver.query threw an exception when fetching postal info");
        r24 = r24;
        r24 = r24;
        r23 = r23;
        r23 = r23;
        r22 = r22;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0492, code lost:
        if (r6 == null) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r6.close();
        r24 = r24;
        r23 = r23;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0497, code lost:
        r6 = m69877b(r5);
        r7 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r8 = m69873a("vnd.android.cursor.item/relation", p000.aoza.f83902l);
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a8, code lost:
        if (r8 == null) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04ae, code lost:
        if (r8.moveToNext() == false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04b0, code lost:
        r9 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04c2, code lost:
        if (r5.contains(r9) == false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04c4, code lost:
        r13 = r8.getString(r8.getColumnIndex("data1"));
        r14 = r8.getInt(r8.getColumnIndex("data2"));
        r15 = r8.getString(r8.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04e6, code lost:
        if (r7.containsKey(r9) != false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04e8, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r7.put(r9, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04f3, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04f5, code lost:
        r4 = (java.util.ArrayList) r7.get(r9);
        r9 = p000.btfn.f148713d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0501, code lost:
        if (r13 == null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0503, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0507, code lost:
        if (r9.f164950c != false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x050a, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0511, code lost:
        r13.getClass();
        ((p000.btfn) r9.f164949b).f148715a = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x051b, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x051f, code lost:
        if (r9.f164950c != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0522, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0528, code lost:
        r3 = (p000.btfn) r9.f164949b;
        r3.f148716b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x052e, code lost:
        if (r15 != null) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0531, code lost:
        r15.getClass();
        r3.f148717c = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0536, code lost:
        r4.add((p000.btfn) r9.mo74062i());
        r3 = r32;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0545, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0546, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0549, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x054f, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0554, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0555, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0557, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0558, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x055c, code lost:
        r3 = r0;
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x055e, code lost:
        r32 = r3;
        r22 = r4;
        r1.f83919g.mo46983c("Could not query CP2 to fetch relation info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0569, code lost:
        if (r8 == null) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x056f, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0572, code lost:
        r0 = e;
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0574, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0575, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0579, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x057a, code lost:
        r32 = r3;
        r22 = r4;
        r3 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:?, code lost:
        r1.f83919g.mo46980a(r3, "ContentResolver.query threw an exception when fetching relation info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0587, code lost:
        if (r8 != null) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        m69876a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r3 = m69873a("vnd.android.cursor.item/note", p000.aoza.f83888A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0595, code lost:
        if (r3 == null) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x059b, code lost:
        if (r3.moveToNext() == false) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x059d, code lost:
        r4 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05af, code lost:
        if (r10.containsKey(r4) == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05b1, code lost:
        ((p000.aoyz) r10.get(r4)).f83882j = r3.getString(r3.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05c5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05c8, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05ca, code lost:
        r1.f83919g.mo46983c("Could not query ContactsProvider to fetch Note info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05d1, code lost:
        if (r3 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05d7, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05db, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05e0, code lost:
        r4 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r1.f83919g.mo46980a(r4, "ContentResolver.query threw an exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05e9, code lost:
        if (r3 != null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        m69878b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        r3 = m69873a("vnd.android.cursor.item/organization", p000.aoza.f83903m);
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05f7, code lost:
        if (r3 == null) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05fd, code lost:
        if (r3.moveToNext() == false) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05ff, code lost:
        r4 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0611, code lost:
        if (r10.containsKey(r4) == false) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0613, code lost:
        r8 = r3.getString(r3.getColumnIndex("data1"));
        r9 = r3.getInt(r3.getColumnIndex("data2"));
        r13 = r3.getString(r3.getColumnIndex("data3"));
        r14 = r3.getString(r3.getColumnIndex("data4"));
        r15 = r3.getString(r3.getColumnIndex("data5"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0645, code lost:
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        r7 = r3.getString(r3.getColumnIndex("data6"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0651, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        r6 = r3.getString(r3.getColumnIndex("data7"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x065d, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        r2 = r3.getString(r3.getColumnIndex("data8"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0669, code lost:
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r12 = r3.getString(r3.getColumnIndex("data9"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0675, code lost:
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        r11 = r3.getString(r3.getColumnIndex("data10"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0683, code lost:
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        r5 = p000.btfl.f148698k.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0689, code lost:
        if (r8 == null) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x068b, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x068f, code lost:
        if (r5.f164950c != false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0692, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0699, code lost:
        r8.getClass();
        ((p000.btfl) r5.f164949b).f148700a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06a3, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06a7, code lost:
        if (r5.f164950c != false) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06aa, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06b0, code lost:
        r3 = (p000.btfl) r5.f164949b;
        r3.f148701b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06b6, code lost:
        if (r13 == null) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06b8, code lost:
        r13.getClass();
        r3.f148702c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06bd, code lost:
        if (r14 == null) goto L_0x06c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06bf, code lost:
        r14.getClass();
        r3.f148703d = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06c4, code lost:
        if (r15 == null) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06c6, code lost:
        r15.getClass();
        r3.f148704e = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x06cb, code lost:
        if (r7 == null) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06cd, code lost:
        r7.getClass();
        r3.f148705f = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x06d2, code lost:
        if (r6 == null) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06d4, code lost:
        r6.getClass();
        r3.f148706g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06d9, code lost:
        if (r2 == null) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x06db, code lost:
        r2.getClass();
        r3.f148707h = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x06e0, code lost:
        if (r12 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06e2, code lost:
        r12.getClass();
        r3.f148708i = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06e7, code lost:
        if (r11 != null) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x06ea, code lost:
        r11.getClass();
        r3.f148709j = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x06ef, code lost:
        ((p000.aoyz) r10.get(r4)).f83885m = (p000.btfl) r5.mo74062i();
        r7 = r33;
        r6 = r23;
        r2 = r24;
        r12 = r25;
        r11 = r26;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x070d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x070e, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0712, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0713, code lost:
        r27 = r3;
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0719, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x071a, code lost:
        r27 = r3;
        r28 = r5;
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0721, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0723, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0724, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0726, code lost:
        r27 = r3;
        r28 = r5;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x072b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x072c, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0735, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0745, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0754, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0755, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0757, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0759, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x075a, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0764, code lost:
        r26 = r11;
        r25 = r12;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0768, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x076a, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
        r1.f83919g.mo46983c("Could not query CP2 to fetch Organization info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x077f, code lost:
        if (r27 != null) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0786, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0788, code lost:
        r5 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x078c, code lost:
        r0 = e;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x078e, code lost:
        r3 = r27;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0791, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0792, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0796, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0797, code lost:
        r24 = r2;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
        r2 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        r1.f83919g.mo46980a(r2, "ContentResolver.query threw an exception when fetching organization info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07ac, code lost:
        if (r3 != null) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:?, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r2 = m69873a("vnd.android.cursor.item/name", p000.aoza.f83904n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07bb, code lost:
        if (r2 != null) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x07c1, code lost:
        if (r2.moveToNext() != false) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x07c3, code lost:
        r3 = java.lang.Long.valueOf(r2.getLong(r2.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x07d5, code lost:
        if (r10.containsKey(r3) != false) goto L_0x07d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x07d7, code lost:
        r4 = r2.getString(r2.getColumnIndex("data1"));
        r5 = r2.getString(r2.getColumnIndex("data2"));
        r6 = r2.getString(r2.getColumnIndex("data5"));
        r7 = r2.getString(r2.getColumnIndex("data3"));
        r8 = android.os.Build.VERSION.SDK_INT;
        r8 = java.lang.Integer.valueOf(r2.getInt(r2.getColumnIndex("data10")));
        r9 = r2.getString(r2.getColumnIndex("data4"));
        r11 = r2.getString(r2.getColumnIndex("data6"));
        r12 = r2.getString(r2.getColumnIndex("data7"));
        r13 = r2.getString(r2.getColumnIndex("data8"));
        r14 = r2.getString(r2.getColumnIndex("data9"));
        r15 = android.os.Build.VERSION.SDK_INT;
        r15 = java.lang.Integer.valueOf(r2.getInt(r2.getColumnIndex("data11")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0853, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        r2 = p000.btfo.f148718l.mo74144da();
        r15 = r15.intValue();
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0861, code lost:
        if (r2.f164950c == false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0864, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x086a, code lost:
        ((p000.btfo) r2.f164949b).f148730k = r15;
        r3 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0876, code lost:
        if (r2.f164950c == false) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0879, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x087f, code lost:
        r8 = (p000.btfo) r2.f164949b;
        r8.f148724e = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0885, code lost:
        if (r4 != null) goto L_0x0887;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0887, code lost:
        r4.getClass();
        r8.f148720a = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x088c, code lost:
        if (r5 != null) goto L_0x088e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x088e, code lost:
        r5.getClass();
        r8.f148721b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0893, code lost:
        if (r6 != null) goto L_0x0895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0895, code lost:
        r6.getClass();
        r8.f148722c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x089a, code lost:
        if (r7 != null) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x089c, code lost:
        r7.getClass();
        r8.f148723d = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x08a1, code lost:
        if (r9 != null) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x08a3, code lost:
        r9.getClass();
        r8.f148725f = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x08a8, code lost:
        if (r11 != null) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08aa, code lost:
        r11.getClass();
        r8.f148726g = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x08af, code lost:
        if (r12 != null) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x08b1, code lost:
        r12.getClass();
        r8.f148727h = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x08b6, code lost:
        if (r13 != null) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x08b8, code lost:
        r13.getClass();
        r8.f148728i = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x08bd, code lost:
        if (r14 == null) goto L_0x08bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x08c0, code lost:
        r14.getClass();
        r8.f148729j = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x08c5, code lost:
        ((p000.aoyz) r10.get(r27)).f83886n = (p000.btfo) r2.mo74062i();
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x08d9, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x08dd, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x08e0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x08e1, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x08e3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x08e5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x08e6, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x08e8, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x08ea, code lost:
        r29 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x08f0, code lost:
        if (p000.cgjy.m145760g() == false) goto L_0x08f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x08f2, code lost:
        r1.f83919g.mo46984c("ReadContactsHelper", "Could not query ContactsProvider to fetch structured name.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0902, code lost:
        r1.f83919g.mo46983c("Could not query ContactsProvider to fetch structured name.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0909, code lost:
        if (r29 == null) goto L_0x0944;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:?, code lost:
        r29.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0910, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0912, code lost:
        r5 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0916, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0918, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0919, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x091d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x091e, code lost:
        r2 = r0;
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0925, code lost:
        if (p000.cgjy.m145760g() == false) goto L_0x0927;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0927, code lost:
        r1.f83919g.mo46987e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x093a, code lost:
        r1.f83919g.mo46980a(r2, "ContentResolver.query threw an exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0941, code lost:
        if (r29 != null) goto L_0x090c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0948, code lost:
        if (p000.cgij.m145552j() != false) goto L_0x094b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x094b, code lost:
        m69880c(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x094e, code lost:
        r2 = r10.size();
        r3 = new p000.btfi[r2];
        r4 = r28.iterator();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x095d, code lost:
        if (r4.hasNext() == false) goto L_0x0bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x095f, code lost:
        r6 = (java.lang.Long) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0969, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0ba6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x096b, code lost:
        r7 = (p000.aoyz) r10.get(r6);
        r8 = (p000.btfh) p000.btfi.f148652E.mo74144da();
        r11 = r6.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x097f, code lost:
        if (r8.f164950c != false) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0982, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0988, code lost:
        r6 = (p000.btfi) r8.f164949b;
        r6.f148670m = r11;
        r9 = r7.f83875c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0990, code lost:
        if (r9 == null) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0992, code lost:
        r9.getClass();
        r6.f148669l = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0997, code lost:
        r11 = r7.f83874b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x099f, code lost:
        if (r8.f164950c != false) goto L_0x09a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x09a2, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x09a8, code lost:
        ((p000.btfi) r8.f164949b).f148671n = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x09b2, code lost:
        if (r7.mo47024a() != false) goto L_0x09b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x09b5, code lost:
        r6 = r7.f83876d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x09b9, code lost:
        if (r8.f164950c != false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x09bc, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x09c2, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148664g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x09d1, code lost:
        if (android.text.TextUtils.isEmpty(r7.f83883k) == false) goto L_0x09d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x09d4, code lost:
        r6 = r7.f83883k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x09d8, code lost:
        if (r8.f164950c != false) goto L_0x09db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x09db, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x09e1, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148658a = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x09f0, code lost:
        if (android.text.TextUtils.isEmpty(r7.f83882j) != false) goto L_0x0a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x09f2, code lost:
        r6 = r7.f83882j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x09f6, code lost:
        if (r8.f164950c != false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x09f9, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x09ff, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148672o = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0a08, code lost:
        r6 = r7.f83884l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0a0a, code lost:
        if (r6 == null) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0a12, code lost:
        if (android.text.TextUtils.isEmpty(r6.f148695a) != false) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0a14, code lost:
        r6 = r7.f83884l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0a18, code lost:
        if (r8.f164950c != false) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0a1b, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0a21, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148675r = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0a2a, code lost:
        r6 = r7.f83886n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0a2c, code lost:
        if (r6 == null) goto L_0x0a43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0a30, code lost:
        if (r8.f164950c != false) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0a33, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0a3a, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148660c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0a43, code lost:
        r6 = r7.f83885m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0a45, code lost:
        if (r6 != null) goto L_0x0a48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a4a, code lost:
        if (r8.f164950c != false) goto L_0x0a4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0a4d, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0a53, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148678u = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0a62, code lost:
        if (android.text.TextUtils.isEmpty(r7.f83877e) == false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0a65, code lost:
        r6 = r7.f83877e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0a69, code lost:
        if (r8.f164950c != false) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0a6c, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0a72, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148681x = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0a81, code lost:
        if (android.text.TextUtils.isEmpty(r7.f83878f) != false) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0a83, code lost:
        r6 = r7.f83878f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a87, code lost:
        if (r8.f164950c != false) goto L_0x0a8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0a8a, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0a90, code lost:
        r6.getClass();
        ((p000.btfi) r8.f164949b).f148655B = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0a9b, code lost:
        if (r7.f83881i != false) goto L_0x0a9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0aa1, code lost:
        if (r8.f164950c != false) goto L_0x0aa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0aa4, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0aaa, code lost:
        ((p000.btfi) r8.f164949b).f148676s = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0ab7, code lost:
        if (r7.f83887o.isEmpty() != false) goto L_0x0acf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0ab9, code lost:
        r8.mo70756b(p000.bqcr.m112598b(p000.sqc.m35961a((java.lang.Long[]) r7.f83887o.toArray(new java.lang.Long[0]))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0acf, code lost:
        r6 = p000.bqcn.m112578a(r7.f83879g.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0adb, code lost:
        if (r8.f164950c != false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0ade, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0ae4, code lost:
        ((p000.btfi) r8.f164949b).f148665h = r6;
        r11 = (r7.f83880h.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0af8, code lost:
        if (r8.f164950c != false) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0afc, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0b02, code lost:
        ((p000.btfi) r8.f164949b).f148666i = r11;
        r12 = r26;
        r11 = (java.util.List) r12.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0b12, code lost:
        if (r11 != null) goto L_0x0b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0b15, code lost:
        r8.mo70755a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0b18, code lost:
        r13 = r25;
        r11 = (java.util.List) r13.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0b22, code lost:
        if (r11 != null) goto L_0x0b25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0b25, code lost:
        r8.mo70758d(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0b28, code lost:
        r14 = r24;
        r11 = (java.util.List) r14.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0b32, code lost:
        if (r11 != null) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0b35, code lost:
        r8.mo70761g(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0b38, code lost:
        r15 = r23;
        r11 = (java.util.List) r15.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0b42, code lost:
        if (r11 != null) goto L_0x0b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0b45, code lost:
        r8.mo70757c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0b48, code lost:
        r6 = r33;
        r11 = (java.util.List) r6.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0b52, code lost:
        if (r11 != null) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0b55, code lost:
        r8.mo70760f(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0b58, code lost:
        r9 = r32;
        r11 = (java.util.List) r9.get(r7.f83873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0b62, code lost:
        if (r11 == null) goto L_0x0b67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0b64, code lost:
        r8.mo70759e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0b67, code lost:
        if (r22 == false) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0b69, code lost:
        r21.submit(new p000.aoyy(r1, (p000.btfi) r8.mo74062i(), r7));
        r33 = r6;
        r21 = r21;
        r32 = r9;
        r26 = r12;
        r25 = r13;
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0b89, code lost:
        r3[r5] = (p000.btfi) r8.mo74062i();
        r33 = r6;
        r21 = r21;
        r32 = r9;
        r5 = r5 + 1;
        r26 = r12;
        r25 = r13;
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0bab, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0bac, code lost:
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0bae, code lost:
        if (r22 == false) goto L_0x0beb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0bb0, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0bb1, code lost:
        if (r4 >= r2) goto L_0x0beb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:?, code lost:
        r3[r4] = (p000.btfi) r7.take().get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0bbf, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0beb, code lost:
        if (r20 == null) goto L_0x0bf0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0bed, code lost:
        r20.shutdownNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0bf0, code lost:
        monitor-enter(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:?, code lost:
        r1.f83918f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0bf5, code lost:
        monitor-exit(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0bf6, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0bf7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0bfa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0bfb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0bfc, code lost:
        r2 = r0;
        r5 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0bff, code lost:
        if (r5 != null) goto L_0x0c01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0c04, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0c05, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0c06, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0c08, code lost:
        if (r5 != null) goto L_0x0c0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0c0a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0c0d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0c0e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0c0f, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0c11, code lost:
        if (r5 != null) goto L_0x0c13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0c13, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0c16, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0c17, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0c18, code lost:
        r2 = r0;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0c1a, code lost:
        if (r5 != null) goto L_0x0c1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0c1c, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0c1f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0c20, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0c21, code lost:
        r2 = r0;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0c23, code lost:
        if (r5 != null) goto L_0x0c25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0c25, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0c28, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0c29, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0c2a, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0c2c, code lost:
        if (r5 != null) goto L_0x0c2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0c2e, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0c31, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0468 A[Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }, ExcHandler: all (r0v62 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }]), Splitter:B:209:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0554 A[Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }, ExcHandler: all (r0v54 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }]), Splitter:B:254:0x04aa] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0754 A[Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:340:0x05f9] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x07ae A[SYNTHETIC, Splitter:B:433:0x07ae] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x07bd A[LOOP:7: B:438:0x07bd->B:785:0x07bd, LOOP_START, PHI: r2 10  PHI: (r2v48 android.database.Cursor) = (r2v44 android.database.Cursor), (r2v51 android.database.Cursor) binds: [B:437:0x07bb, B:785:0x07bd] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:438:0x07bd] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x08ea A[Catch:{ SQLiteException -> 0x0916, all -> 0x0910 }] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0927 A[Catch:{ all -> 0x0bfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x093a A[Catch:{ all -> 0x0bfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:674:0x0c01 A[SYNTHETIC, Splitter:B:674:0x0c01] */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x0c0a A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:685:0x0c13 A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:690:0x0c1c A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:695:0x0c25 A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x0c2e A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x0c39 A[Catch:{ ExecutionException -> 0x0bc8, InterruptedException -> 0x0bc2, all -> 0x0c9f, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:731:0x0c9b A[SYNTHETIC, Splitter:B:731:0x0c9b] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    public final btfi[] mo47028a(boolean z, long j) {
        boolean z2;
        boolean z3;
        bqgj bqgj;
        Throwable th;
        ExecutorCompletionService executorCompletionService;
        bqgj bqgj2;
        bqgj bqgj3;
        Cursor cursor;
        Throwable th2;
        bqgj bqgj4;
        SQLiteException sQLiteException;
        String[] strArr;
        Cursor cursor2;
        Throwable th3;
        Cursor cursor3;
        SQLiteException sQLiteException2;
        if (!aoyn.m69849a("android.permission.READ_CONTACTS")) {
            this.f83919g.mo46983c("Don't have READ_CONTACTS permission; giving up reading contacts.");
            return new btfi[0];
        }
        synchronized (this) {
            try {
                if (this.f83918f == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sdo.m34970a(z2);
            } finally {
                while (true) {
                    Throwable th4 = th;
                }
            }
        }
        if (z || !cgjy.m145757d()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            try {
                bqgj2 = sne.m35694a(5, 9);
                try {
                    executorCompletionService = new ExecutorCompletionService(bqgj2);
                } catch (Throwable th5) {
                    th = th5;
                    bqgj = bqgj2;
                }
            } catch (ExecutionException e) {
                ExecutionException executionException = e;
                if (executionException.getCause() instanceof InterruptedException) {
                    bqgj3.shutdownNow();
                    throw ((InterruptedException) executionException.getCause());
                }
                throw new RuntimeException("Exception when fetching contact images", executionException.getCause());
            } catch (InterruptedException e2) {
                InterruptedException interruptedException = e2;
                bqgj3.shutdownNow();
                throw interruptedException;
            } catch (Throwable th6) {
                th = th6;
                bqgj = null;
            }
        } else {
            bqgj2 = null;
            executorCompletionService = null;
        }
        try {
            if (cgjy.m145755b()) {
                f83896c = new aoys(this.f83917e).mo47021a();
            }
            HashSet hashSet = new HashSet(m69879c(j).keySet());
            HashMap hashMap = new HashMap();
            try {
                Cursor query = this.f83917e.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, f83899i, null, null, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            try {
                                Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("_id")));
                                Long valueOf2 = Long.valueOf(query.getLong(query.getColumnIndex("contact_id")));
                                if (hashSet.contains(valueOf2)) {
                                    String string = query.getString(query.getColumnIndex("sourceid"));
                                    String string2 = query.getString(query.getColumnIndex("account_type"));
                                    bqgj3 = query.getString(query.getColumnIndex("account_name"));
                                    String string3 = query.getString(query.getColumnIndex("data_set"));
                                    ? r22 = Long.valueOf(query.getLong(query.getColumnIndex("times_contacted")));
                                    ? r23 = Long.valueOf(query.getLong(query.getColumnIndex("last_time_contacted")));
                                    ? r24 = query.getInt(query.getColumnIndex("starred"));
                                    aoyz aoyz = r15;
                                    aoyz aoyz2 = new aoyz(valueOf, valueOf2, string, string2, bqgj3, string3, r22, r23, r24);
                                    if (hashMap.containsKey(valueOf)) {
                                        this.f83919g.mo46985d("Raw contact id already exists, this should not happen.");
                                    } else {
                                        hashMap.put(valueOf, aoyz);
                                    }
                                }
                            } catch (SQLiteException e3) {
                                sQLiteException = e3;
                                bqgj4 = bqgj2;
                                cursor = query;
                                try {
                                    this.f83919g.mo46980a(sQLiteException, "ContentResolver.query threw an exception when fetching raw-contacts.");
                                    String valueOf3 = String.valueOf(sQLiteException);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                                    sb.append("Fetching raw contacts query failed.");
                                    sb.append(valueOf3);
                                    throw new aoyv(sb.toString());
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    if (cursor != null) {
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th8) {
                                th2 = th8;
                                bqgj4 = bqgj2;
                                cursor = query;
                                if (cursor != null) {
                                }
                                throw th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            bqgj4 = bqgj2;
                            sQLiteException = e;
                            cursor = query;
                            this.f83919g.mo46980a(sQLiteException, "ContentResolver.query threw an exception when fetching raw-contacts.");
                            String valueOf32 = String.valueOf(sQLiteException);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf32).length() + 35);
                            sb2.append("Fetching raw contacts query failed.");
                            sb2.append(valueOf32);
                            throw new aoyv(sb2.toString());
                        } catch (Throwable th9) {
                            th = th9;
                            bqgj4 = bqgj2;
                            th2 = th;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th2;
                        }
                    }
                    query.close();
                    HashSet hashSet2 = new HashSet(hashMap.keySet());
                    Map a = m69874a(hashSet2);
                    HashMap hashMap2 = new HashMap();
                    ContentResolver contentResolver = this.f83917e.getContentResolver();
                    if (cgij.m145551i()) {
                        try {
                            strArr = f83909s;
                        } catch (Throwable th10) {
                            th = th10;
                            bqgj3 = bqgj2;
                        }
                    } else {
                        strArr = f83907q;
                    }
                    String[] strArr2 = cgij.m145551i() ? f83908r : f83906p;
                    try {
                        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                        if (!f83905o) {
                            strArr = strArr2;
                        }
                        cursor3 = contentResolver.query(uri, strArr, null, null, null);
                        if (cursor3 != null) {
                            while (cursor3.moveToNext()) {
                                try {
                                    Long valueOf4 = Long.valueOf(cursor3.getLong(cursor3.getColumnIndex("raw_contact_id")));
                                    if (hashSet2.contains(valueOf4)) {
                                        String string4 = cursor3.getString(cursor3.getColumnIndex("data1"));
                                        int i = cursor3.getInt(cursor3.getColumnIndex("data2"));
                                        String string5 = cursor3.getString(cursor3.getColumnIndex("data3"));
                                        if (!hashMap2.containsKey(valueOf4)) {
                                            hashMap2.put(valueOf4, new ArrayList());
                                        }
                                        ArrayList arrayList = (ArrayList) hashMap2.get(valueOf4);
                                        bxvd da = btff.f148636h.mo74144da();
                                        if (string4 != null) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            string4.getClass();
                                            ((btff) da.f164949b).f148638a = string4;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((btff) da.f164949b).f148642e = i;
                                        String charSequence = ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.f83917e.getResources(), i, string5).toString();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        charSequence.getClass();
                                        ((btff) da.f164949b).f148639b = charSequence;
                                        if (cgij.m145551i()) {
                                            boolean z4 = cursor3.getInt(cursor3.getColumnIndex("is_super_primary")) == 1;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            ((btff) da.f164949b).f148644g = z4;
                                        }
                                        if (f83905o) {
                                            int i2 = cursor3.getInt(cursor3.getColumnIndex("times_used"));
                                            long j2 = cursor3.getLong(cursor3.getColumnIndex("last_time_used"));
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            btff btff = (btff) da.f164949b;
                                            btff.f148640c = i2;
                                            btff.f148641d = j2;
                                        }
                                        arrayList.add((btff) da.mo74062i());
                                    }
                                } catch (SQLiteException e5) {
                                    sQLiteException2 = e5;
                                    try {
                                        this.f83919g.mo46980a(sQLiteException2, "ContentResolver.query threw an exception when fetching phone info");
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th12) {
                                    th3 = th12;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            this.f83919g.mo46983c("Could not query ContactsProvider to fetch Phone info; disabled? Give up.");
                        }
                    } catch (SQLiteException e6) {
                        sQLiteException2 = e6;
                        cursor3 = null;
                        this.f83919g.mo46980a(sQLiteException2, "ContentResolver.query threw an exception when fetching phone info");
                    } catch (Throwable th13) {
                        th3 = th13;
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        throw th3;
                    }
                } else {
                    bqgj4 = bqgj2;
                    try {
                        this.f83919g.mo46983c("Could not query ContactsProvider to fetch RawContacts; disabled? Give up.");
                        throw new aoyu("Raw contacts query cursor is null");
                    } catch (SQLiteException e7) {
                        e = e7;
                        sQLiteException = e;
                        cursor = query;
                        this.f83919g.mo46980a(sQLiteException, "ContentResolver.query threw an exception when fetching raw-contacts.");
                        String valueOf322 = String.valueOf(sQLiteException);
                        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf322).length() + 35);
                        sb22.append("Fetching raw contacts query failed.");
                        sb22.append(valueOf322);
                        throw new aoyv(sb22.toString());
                    } catch (Throwable th14) {
                        th = th14;
                        th2 = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th2;
                    }
                }
            } catch (SQLiteException e8) {
                bqgj4 = bqgj2;
                sQLiteException = e8;
                cursor = null;
                this.f83919g.mo46980a(sQLiteException, "ContentResolver.query threw an exception when fetching raw-contacts.");
                String valueOf3222 = String.valueOf(sQLiteException);
                StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf3222).length() + 35);
                sb222.append("Fetching raw contacts query failed.");
                sb222.append(valueOf3222);
                throw new aoyv(sb222.toString());
            } catch (Throwable th15) {
                bqgj4 = bqgj2;
                th2 = th15;
                cursor = null;
                if (cursor != null) {
                }
                throw th2;
            }
        } catch (Throwable th16) {
            th = th16;
            bqgj3 = bqgj2;
            th = th;
            bqgj = bqgj3;
            if (bqgj != null) {
                bqgj.shutdownNow();
            }
            synchronized (this) {
                try {
                    this.f83918f = 0;
                } catch (Throwable th17) {
                    while (true) {
                        throw th17;
                    }
                }
            }
            throw th;
        }
    }
}
