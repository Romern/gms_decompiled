package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: amwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amwk {
    INSTANCE;
    

    /* renamed from: b */
    private static final String[] f76185b = {"system_id", "title", "account_name", "auto_add", "favorites", "_id", "sourceid", "group_is_read_only"};

    /* renamed from: c */
    private ContentResolver f76187c;

    /* renamed from: d */
    private Set f76188d;

    /* renamed from: e */
    private Set f76189e;

    /* renamed from: f */
    private final ancw f76190f = anbx.INSTANCE;

    private amwk(String str) {
    }

    /* renamed from: a */
    private final void m63531a(long j, ContentValues contentValues) {
        m63535a(amvt.m63470a(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, j)), contentValues, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    private final void m63532a(amvy amvy) {
        boolean z;
        this.f76188d = new HashSet();
        this.f76189e = new HashSet();
        while (true) {
            try {
                amvr a = amvy.mo41464b();
                if (a != null) {
                    String n = a.mo41408n();
                    String l = a.mo41406l();
                    if (!TextUtils.isEmpty(n)) {
                        String k = a.mo41405k();
                        if (!"Contacts".equals(k)) {
                            if (k == null) {
                                if (a.mo41404j() == null) {
                                    if (!"System Group: My Contacts".equals(a.mo41406l())) {
                                    }
                                }
                            }
                            if (a.mo41405k() != null) {
                                String l2 = a.mo41406l();
                                if (l2 == null || !l2.startsWith("System Group: ")) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    if (!a.mo41396d() && a.mo41395c()) {
                                    }
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("auto_add", (Integer) 0);
                                contentValues.put("group_is_read_only", (Integer) 1);
                                if (z) {
                                    contentValues.put("title", l2.substring(14));
                                }
                                m63531a(a.mo41400g().longValue(), contentValues);
                            }
                            if ("Starred in Android".equals(l)) {
                                this.f76189e.add(n);
                                if (a.mo41393a()) {
                                    if (!a.mo41395c()) {
                                    }
                                }
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("favorites", (Integer) 1);
                                contentValues2.put("group_is_read_only", (Integer) 1);
                                m63531a(a.mo41400g().longValue(), contentValues2);
                            }
                        }
                        this.f76188d.add(n);
                        if ("My Contacts".equals(a.mo41406l())) {
                            if ("Contacts".equals(a.mo41405k()) && "6".equals(a.mo41404j()) && a.mo41396d() && a.mo41395c()) {
                            }
                        }
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("title", "My Contacts");
                        contentValues3.put("system_id", "Contacts");
                        contentValues3.put("sourceid", "6");
                        contentValues3.put("auto_add", (Integer) 1);
                        contentValues3.put("group_is_read_only", (Integer) 1);
                        m63531a(a.mo41400g().longValue(), contentValues3);
                    }
                } else {
                    return;
                }
            } finally {
                amvy.mo41472f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: b */
    private final void m63536b(Context context, Account account, anaz anaz) {
        String str;
        Account account2 = account;
        String str2 = account2.name;
        if (!this.f76188d.contains(str2)) {
            String str3 = account2.name;
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", "My Contacts");
            contentValues.put("system_id", "Contacts");
            contentValues.put("sourceid", "6");
            contentValues.put("auto_add", (Integer) 1);
            m63534a(contentValues, account2);
        }
        if (!this.f76189e.contains(str2)) {
            String str4 = account2.name;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("title", "Starred in Android");
            contentValues2.put("favorites", (Integer) 1);
            m63534a(contentValues2, account2);
        }
        String str5 = account2.name;
        amig.m62939a();
        if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo83041r()).booleanValue()) {
            if (cfxe.m143364c()) {
                String str6 = account2.name;
                amsd c = amvj.m63368a(context).mo41381c();
                if (!c.f75843b || !c.f75844c.equals(str6) || !c.f75845d.contains(1)) {
                    return;
                }
            } else {
                return;
            }
        }
        String str7 = account2.name;
        ContentResolver contentResolver = this.f76187c;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr = amvt.f76137a;
        Cursor query = contentResolver.query(uri, new String[]{"_id"}, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL", null, null);
        if (query != null) {
            try {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("account_name", str7);
                contentValues3.put("account_type", account2.type);
                while (true) {
                    str = "account_name IS NULL AND account_type IS NULL AND data_set IS NULL";
                    if (!query.moveToNext()) {
                        break;
                    }
                    m63535a(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, query.getLong(0)), contentValues3, str);
                }
                query.close();
                amwf amwf = new amwf(this.f76187c, account2);
                String str8 = amwf.f76169b.name;
                String[] strArr2 = {"_id"};
                if (cfwm.f185845a.mo6606a().mo82833a()) {
                    str = "account_name IS NULL AND account_type IS NULL AND data_set IS NULL AND deleted = 0";
                }
                Cursor query2 = amwf.f76168a.query(ContactsContract.RawContacts.CONTENT_URI, strArr2, str, null, null);
                if (query2 != null) {
                    try {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("account_name", str8);
                        contentValues4.put("account_type", amwf.f76169b.type);
                        int i = 0;
                        while (query2.moveToNext()) {
                            amwf.mo41479a(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, query2.getLong(0)), contentValues4, str);
                            i++;
                        }
                        query2.close();
                        amwf.m63522a(str8, i, anaz);
                    } catch (Throwable th) {
                        query2.close();
                        throw th;
                    }
                } else {
                    throw new amyc(new RemoteException("Unable to query CP2"));
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        } else {
            throw new amyc(new RemoteException("Unable to query CP2"));
        }
    }

    /* renamed from: a */
    private static void m63533a(anaz anaz, int i) {
        anaz.mo41631a(amjf.CONTACT, amkb.BEFORE_PREPARE_TO_SYNC, amjd.CP2, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    private final void m63534a(ContentValues contentValues, Account account) {
        contentValues.put("group_visible", (Integer) 1);
        contentValues.put("group_is_read_only", (Integer) 1);
        this.f76187c.insert(amvt.m63471a(ContactsContract.Groups.CONTENT_URI, account), contentValues);
    }

    /* renamed from: a */
    private final void m63535a(Uri uri, ContentValues contentValues, String str) {
        ContentResolver contentResolver = this.f76187c;
        String[] strArr = amvt.f76137a;
        contentResolver.update(uri, contentValues, str, null);
    }

    /* renamed from: a */
    public final synchronized void mo41484a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.f76187c = contentResolver;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr = f76185b;
        String[] strArr2 = amvt.f76137a;
        amvy a = amvy.m63503a(contentResolver, uri, strArr, "account_type='com.google' AND data_set IS NULL", null, "_id");
        if (a != null) {
            m63532a(a);
            bnrd a2 = this.f76190f.mo41678b(context).iterator();
            while (a2.hasNext()) {
                m63536b(context, (Account) a2.next(), null);
            }
        } else {
            throw new amyc(new RemoteException("Unable to query CP2"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0264, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0265, code lost:
        r2 = r0;
        r3 = r13;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04c3, code lost:
        r2 = r0;
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r3.mo41472f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (p000.cfxe.m143375n() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0852, code lost:
        r19.mo41472f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0936, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0937, code lost:
        r2 = r0;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b23, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0b7a, code lost:
        r3 = r13;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        if (p000.amvl.m63383a(r8, r3) == false) goto L_0x0182;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ed A[SYNTHETIC, Splitter:B:169:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04c2 A[ExcHandler: all (r0v26 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:199:0x04a0] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04d5 A[SYNTHETIC, Splitter:B:222:0x04d5] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04e7 A[Catch:{ all -> 0x08fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0621 A[Catch:{ all -> 0x084a, all -> 0x08f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x063a A[Catch:{ all -> 0x084a, all -> 0x08f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0852 A[Catch:{ all -> 0x084a, all -> 0x08f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0880 A[Catch:{ all -> 0x084a, all -> 0x08f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x08bd A[Catch:{ all -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x08c3 A[Catch:{ all -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x093c  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0946 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0947 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0978 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0979 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0989 A[SYNTHETIC, Splitter:B:437:0x0989] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x099c  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x09aa A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x09ae A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0a71 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0a72 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0ac3 A[SYNTHETIC, Splitter:B:492:0x0ac3] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0ae5 A[Catch:{ RemoteException -> 0x0b22, all -> 0x0b1e }] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x0b0a A[Catch:{ aaaj -> 0x0175, all -> 0x0c03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0b0b A[Catch:{ aaaj -> 0x0175, all -> 0x0c03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0b22 A[ExcHandler: RemoteException (e android.os.RemoteException), PHI: r9 10  PHI: (r9v12 bxvd) = (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v13 bxvd), (r9v16 bxvd) binds: [B:422:0x0940, B:440:0x099e, B:472:0x0a65, B:500:0x0ae0, B:492:0x0ac3, B:484:0x0a96, B:466:0x0a2e, B:470:0x0a59, B:471:?, B:449:0x09c7, B:437:0x0989, B:438:?, B:413:0x091c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:413:0x091c] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0b3a A[SYNTHETIC, Splitter:B:526:0x0b3a] */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0b57 A[Catch:{ RemoteException -> 0x0b72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0b79 A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:97:0x024a] */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0bb0 A[Catch:{ aaaj -> 0x0175, all -> 0x0c03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x0bb1 A[Catch:{ aaaj -> 0x0175, all -> 0x0c03 }] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x090a A[SYNTHETIC] */
    /* renamed from: a */
    public final synchronized void mo41485a(Context context, Account account, anaz anaz) {
        bxvd bxvd;
        bxvd bxvd2;
        almg almg;
        bxvd bxvd3;
        ammv ammv;
        int i;
        String str;
        String[] strArr;
        int i2;
        int i3;
        Throwable th;
        boolean z;
        int i4;
        almg almg2;
        allz allz;
        String str2;
        int i5;
        bxvd bxvd4;
        alsj alsj;
        boolean z2;
        int i6;
        amwd amwd;
        Account account2;
        alsj alsj2;
        String str3;
        int i7;
        String str4;
        alsj alsj3;
        int i8;
        almg almg3;
        allz allz2;
        ContentValues contentValues;
        allz allz3;
        ContentValues contentValues2;
        int i9;
        amvw amvw;
        Throwable th2;
        List list;
        Iterator it;
        bndu bndu;
        Iterator it2;
        amvw amvw2;
        Throwable th3;
        amyc amyc;
        amvw amvw3;
        amyc amyc2;
        int i10;
        Context context2 = context;
        Account account3 = account;
        anaz anaz2 = anaz;
        synchronized (this) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                this.f76187c = contentResolver;
                amvy a = amvy.m63503a(contentResolver, ContactsContract.Groups.CONTENT_URI, f76185b, "account_type='com.google' AND data_set IS NULL AND account_name = ?", new String[]{account3.name}, "_id");
                if (a != null) {
                    m63532a(a);
                    m63536b(context, account, anaz);
                    if (cfxe.m143364c()) {
                        bxvd da = ammv.f75396e.mo74144da();
                        String str5 = account3.name;
                        amsd c = amvj.m63368a(context).mo41381c();
                        if (!c.f75843b) {
                            bxvd2 = da;
                        } else if (!c.f75844c.equals(str5)) {
                            bxvd2 = da;
                        } else if (!c.f75845d.contains(3)) {
                            bxvd2 = da;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ammv ammv2 = (ammv) da.f164949b;
                            ammv2.f75399b = 3;
                            ammv2.f75398a |= 1;
                            if (cfxe.m143376o()) {
                            }
                            String str6 = account3.name;
                            amvl amvl = new amvl(context2);
                            int b = amvl.mo41388b();
                            int a2 = amvl.mo41386a(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", str6).appendQueryParameter("account_type", "com.google").build(), (String) null) + b;
                            if (cfxe.m143368g()) {
                                m63533a(anaz2, a2);
                            }
                            if (!cfxe.m143376o() || (((long) b) < cfxe.f185877a.mo6606a().mo82870L() && ((long) a2) < cfxe.f185877a.mo6606a().mo82871M())) {
                                if (cfxe.m143375n()) {
                                    if (b > 0) {
                                        i10 = amvl.mo41385a();
                                    } else {
                                        i10 = 0;
                                    }
                                    if (cfxe.m143369h()) {
                                        bxvd da2 = ammu.f75391d.mo74144da();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        ammu ammu = (ammu) da2.f164949b;
                                        int i11 = ammu.f75393a | 1;
                                        ammu.f75393a = i11;
                                        ammu.f75394b = b;
                                        ammu.f75393a = i11 | 2;
                                        ammu.f75395c = i10;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ammv ammv3 = (ammv) da.f164949b;
                                        ammu ammu2 = (ammu) da2.mo74062i();
                                        ammu2.getClass();
                                        ammv3.f75401d = ammu2;
                                        ammv3.f75398a |= 4;
                                    }
                                }
                                if (cfxe.f185877a.mo6606a().mo82865G()) {
                                    if (alsj.m61651a(context).mo40703g(account3.name) > 0) {
                                        bxvd da3 = ammt.f75376n.mo74144da();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        ammt ammt = (ammt) da3.f164949b;
                                        ammt.f75379b = 4;
                                        ammt.f75378a |= 1;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ammv ammv4 = (ammv) da.f164949b;
                                        ammt ammt2 = (ammt) da3.mo74062i();
                                        ammt2.getClass();
                                        ammv4.f75400c = ammt2;
                                        ammv4.f75398a |= 2;
                                        Log.w("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync but last sync wasn't successful");
                                        bxvd = da;
                                        ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                        return;
                                    }
                                }
                                String str7 = account3.name;
                                bxvd da4 = ammt.f75376n.mo74144da();
                                if (cfum.m143092c()) {
                                    almg = almc.m61252a(context).mo40498a(EnumSet.of(almb.SHEEPDOG_ELIGIBLE));
                                } else {
                                    almg = new almg(cfum.m143091b());
                                }
                                try {
                                    alsj a3 = alsj.m61651a(context);
                                    String str8 = account3.name;
                                    SharedPreferences sharedPreferences = a3.f74200a;
                                    String valueOf = String.valueOf(str8);
                                    if (valueOf.length() == 0) {
                                        str = new String("focus_last_device_contact_and_group_migrate_status_");
                                    } else {
                                        str = "focus_last_device_contact_and_group_migrate_status_".concat(valueOf);
                                    }
                                    int a4 = amjk.m62972a(sharedPreferences.getInt(str, 0));
                                    if (a4 == 0) {
                                        a4 = 1;
                                    }
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    ammt ammt3 = (ammt) da4.f164949b;
                                    ammt3.f75379b = 2;
                                    ammt3.f75378a |= 1;
                                    a3.mo40701e(account3.name, 3);
                                    amwf amwf = new amwf(this.f76187c, account3);
                                    allz allz4 = allz.DEVICE;
                                    String str9 = amwf.f76169b.name;
                                    if (cfxe.m143378q()) {
                                        strArr = new String[]{"_id", "account_type", "data_set"};
                                    } else {
                                        strArr = new String[]{"_id", "account_type"};
                                    }
                                    ContentResolver contentResolver2 = amwf.f76168a;
                                    Uri uri = ContactsContract.RawContacts.CONTENT_URI;
                                    String a5 = amwf.m63521a();
                                    String[] strArr2 = amvt.f76137a;
                                    Cursor query = contentResolver2.query(uri, strArr, a5, null, null);
                                    if (query == null) {
                                        bxvd da5 = amms.f75372c.mo74144da();
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        amms amms = (amms) da5.f164949b;
                                        amms.f75375b = 1;
                                        amms.f75374a = 1 | amms.f75374a;
                                        amms amms2 = (amms) da5.mo74062i();
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        ammt ammt4 = (ammt) da4.f164949b;
                                        amms2.getClass();
                                        ammt4.f75389l = amms2;
                                        ammt4.f75378a |= 2048;
                                        throw new RemoteException("Unable to query CP2");
                                    }
                                    try {
                                        String str10 = amwf.f76169b.type;
                                        ContentValues contentValues3 = new ContentValues();
                                        contentValues3.put("account_name", str9);
                                        contentValues3.put("account_type", str10);
                                        if (cfxe.f185877a.mo6606a().mo82903z()) {
                                            contentValues3.putNull("sourceid");
                                        }
                                        if (cfxe.f185877a.mo6606a().mo82902y()) {
                                            contentValues3.putNull("data_set");
                                        }
                                        bxvd da6 = alvh.f74376d.mo74144da();
                                        bxvd da7 = amsb.f75832c.mo74144da();
                                        bxvd bxvd5 = da;
                                        try {
                                            allz allz5 = allz.DEVICE;
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            amsb amsb = (amsb) da7.f164949b;
                                            amsb.f75835b = allz5.f73664j;
                                            amsb.f75834a |= 1;
                                            amsb amsb2 = (amsb) da7.mo74062i();
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            alvh alvh = (alvh) da6.f164949b;
                                            amsb2.getClass();
                                            alvh.f74379b = amsb2;
                                            alvh.f74378a |= 1;
                                            byte[] k = ((alvh) da6.mo74062i()).serializeToBytes();
                                            if (cfxe.f185877a.mo6606a().mo82868J()) {
                                                try {
                                                    if (cfxe.f185877a.mo6606a().mo82869K()) {
                                                        contentValues3.put("sync1", Base64.encodeToString(k, 2));
                                                        z = true;
                                                        i3 = 0;
                                                        i2 = 0;
                                                        while (true) {
                                                            try {
                                                                if (query.moveToNext()) {
                                                                    i4 = a4;
                                                                    almg2 = almg;
                                                                    allz = allz4;
                                                                    str2 = str9;
                                                                    i5 = i3;
                                                                    bxvd4 = da4;
                                                                    alsj = a3;
                                                                    z2 = true;
                                                                    break;
                                                                }
                                                                try {
                                                                    if (!cfxe.f185877a.mo6606a().mo82878a()) {
                                                                        bxvd4 = da4;
                                                                    } else {
                                                                        bxvd4 = da4;
                                                                        try {
                                                                            if (((long) i3) >= cfxe.f185877a.mo6606a().mo82898u()) {
                                                                                i4 = a4;
                                                                                almg2 = almg;
                                                                                allz = allz4;
                                                                                str2 = str9;
                                                                                i5 = i3;
                                                                                alsj = a3;
                                                                                z2 = false;
                                                                                break;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            bxvd = bxvd5;
                                                                            bxvd3 = bxvd4;
                                                                        }
                                                                    }
                                                                    String string = query.getString(1);
                                                                    if (cfxe.m143378q()) {
                                                                        str3 = query.getString(2);
                                                                    } else {
                                                                        str3 = null;
                                                                    }
                                                                    if (almg.mo40506a(string, str3).f81698c != allz4) {
                                                                        i8 = a4;
                                                                        almg3 = almg;
                                                                        str4 = str9;
                                                                        alsj3 = a3;
                                                                        allz2 = allz4;
                                                                        contentValues = contentValues3;
                                                                    } else {
                                                                        if (allz4 != allz.DEVICE) {
                                                                            i8 = a4;
                                                                            almg3 = almg;
                                                                            allz3 = allz4;
                                                                            str4 = str9;
                                                                            i7 = i3;
                                                                            contentValues2 = contentValues3;
                                                                            alsj3 = a3;
                                                                        } else if (z) {
                                                                            if (!a3.mo40710n(str9)) {
                                                                                sdo.m34973b((String) null);
                                                                                SharedPreferences.Editor edit = a3.f74200a.edit();
                                                                                String valueOf2 = String.valueOf(str9);
                                                                                edit.putBoolean(valueOf2.length() == 0 ? new String("focus_seen_device_contacts_before_") : "focus_seen_device_contacts_before_".concat(valueOf2), true).commit();
                                                                            }
                                                                            if (cfxe.m143365d()) {
                                                                                String a6 = amwf.m63521a();
                                                                                almg3 = almg;
                                                                                amyl amyl = new amyl(amwf.f76168a, amwf.f76169b);
                                                                                try {
                                                                                    i8 = a4;
                                                                                    amvw a7 = amvw.m63489a(amyl.f76387a, null, amyl.f76386c, a6, null);
                                                                                    try {
                                                                                        list = amyl.m63726a(a7, true);
                                                                                        a7.mo41472f();
                                                                                    } catch (amyc e) {
                                                                                        amvw3 = a7;
                                                                                        amyc2 = e;
                                                                                        try {
                                                                                            amyc2.toString();
                                                                                            if (amvw3 != null) {
                                                                                            }
                                                                                            list = new ArrayList();
                                                                                            bndu r = bndu.m109109r();
                                                                                            if (list.isEmpty()) {
                                                                                            }
                                                                                            HashSet hashSet = new HashSet();
                                                                                            it = list.iterator();
                                                                                            while (it.hasNext()) {
                                                                                            }
                                                                                            amwf.f76170c = hashSet;
                                                                                            z = false;
                                                                                            long j = query.getLong(0);
                                                                                            if (cfxe.m143365d()) {
                                                                                            }
                                                                                            allz2 = allz3;
                                                                                            i9 = i2;
                                                                                            Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j);
                                                                                            if (cfxb.f185869a.mo6606a().mo82857f()) {
                                                                                            }
                                                                                            da4 = bxvd4;
                                                                                            almg = almg3;
                                                                                            a4 = i8;
                                                                                            a3 = alsj3;
                                                                                            str9 = str4;
                                                                                            contentValues3 = contentValues;
                                                                                            allz4 = allz2;
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            bxvd = bxvd5;
                                                                                            bxvd3 = bxvd4;
                                                                                            i3 = i7;
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        amvw = a7;
                                                                                        th2 = th6;
                                                                                        if (amvw != null) {
                                                                                        }
                                                                                        throw th2;
                                                                                    }
                                                                                } catch (amyc e2) {
                                                                                    e = e2;
                                                                                    i8 = a4;
                                                                                    amyc2 = e;
                                                                                    amvw3 = null;
                                                                                    amyc2.toString();
                                                                                    if (amvw3 != null) {
                                                                                    }
                                                                                    list = new ArrayList();
                                                                                    bndu r2 = bndu.m109109r();
                                                                                    if (list.isEmpty()) {
                                                                                    }
                                                                                    HashSet hashSet2 = new HashSet();
                                                                                    it = list.iterator();
                                                                                    while (it.hasNext()) {
                                                                                    }
                                                                                    amwf.f76170c = hashSet2;
                                                                                    z = false;
                                                                                    long j2 = query.getLong(0);
                                                                                    if (cfxe.m143365d()) {
                                                                                    }
                                                                                    allz2 = allz3;
                                                                                    i9 = i2;
                                                                                    Uri withAppendedId2 = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j2);
                                                                                    if (cfxb.f185869a.mo6606a().mo82857f()) {
                                                                                    }
                                                                                    da4 = bxvd4;
                                                                                    almg = almg3;
                                                                                    a4 = i8;
                                                                                    a3 = alsj3;
                                                                                    str9 = str4;
                                                                                    contentValues3 = contentValues;
                                                                                    allz4 = allz2;
                                                                                } catch (Throwable th7) {
                                                                                }
                                                                                bndu r22 = bndu.m109109r();
                                                                                if (list.isEmpty()) {
                                                                                    ArrayList arrayList = new ArrayList();
                                                                                    for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                                                                                        arrayList.add(((amyx) it3.next()).f76419a);
                                                                                    }
                                                                                    alsj3 = a3;
                                                                                    int f = (int) cfxe.f185877a.mo6606a().mo82883f();
                                                                                    if (f <= 0) {
                                                                                        Log.e("FSA2_DedupHelper", "cp2 read dedup records limit is less or equal to zero");
                                                                                        allz3 = allz4;
                                                                                        str4 = str9;
                                                                                        i7 = i3;
                                                                                        contentValues2 = contentValues3;
                                                                                    } else {
                                                                                        int i12 = 0;
                                                                                        while (i12 < arrayList.size()) {
                                                                                            int i13 = i12 + f;
                                                                                            int i14 = f;
                                                                                            int min = Math.min(i13, arrayList.size());
                                                                                            int i15 = i13;
                                                                                            ArrayList arrayList2 = new ArrayList();
                                                                                            String str11 = str9;
                                                                                            ContentValues contentValues4 = contentValues3;
                                                                                            Uri a8 = amvt.m63471a(ContactsContract.RawContactsEntity.CONTENT_URI, amyl.f76388b);
                                                                                            ContentResolver contentResolver3 = amyl.f76387a;
                                                                                            i7 = i3;
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            allz allz6 = allz4;
                                                                                            sb.append("( (data1 IN (\"");
                                                                                            sb.append(TextUtils.join("\",\"", arrayList.subList(i12, min)));
                                                                                            sb.append("\") ) AND (account_type = \"com.google\"))");
                                                                                            Cursor query2 = contentResolver3.query(a8, new String[]{"_id"}, sb.toString(), null, null);
                                                                                            while (query2.moveToNext()) {
                                                                                                arrayList2.add(Long.valueOf(query2.getLong(0)));
                                                                                            }
                                                                                            if (query2 != null) {
                                                                                                query2.close();
                                                                                            }
                                                                                            if (!arrayList2.isEmpty()) {
                                                                                                try {
                                                                                                    amvw2 = amvw.m63489a(amyl.f76387a, amyl.f76388b, amyl.f76386c, " (_id IN (" + TextUtils.join(",", arrayList2) + ") ) ", null);
                                                                                                    try {
                                                                                                        for (amyx amyx : amyl.m63726a(amvw2, false)) {
                                                                                                            r22.mo67268a(amyx.f76419a, amyx.f76420b);
                                                                                                        }
                                                                                                    } catch (amyc e3) {
                                                                                                        amyc = e3;
                                                                                                        try {
                                                                                                            amyc.toString();
                                                                                                            amvw2.mo41472f();
                                                                                                            f = i14;
                                                                                                            i12 = i15;
                                                                                                            str9 = str11;
                                                                                                            contentValues3 = contentValues4;
                                                                                                            i3 = i7;
                                                                                                            allz4 = allz6;
                                                                                                        } catch (Throwable th8) {
                                                                                                            th3 = th8;
                                                                                                        }
                                                                                                    } catch (Throwable th9) {
                                                                                                        th3 = th9;
                                                                                                        amvw2.mo41472f();
                                                                                                        throw th3;
                                                                                                    }
                                                                                                } catch (amyc e4) {
                                                                                                    amyc = e4;
                                                                                                    amvw2 = null;
                                                                                                    amyc.toString();
                                                                                                    amvw2.mo41472f();
                                                                                                    f = i14;
                                                                                                    i12 = i15;
                                                                                                    str9 = str11;
                                                                                                    contentValues3 = contentValues4;
                                                                                                    i3 = i7;
                                                                                                    allz4 = allz6;
                                                                                                } catch (Throwable th10) {
                                                                                                    th3 = th10;
                                                                                                    amvw2 = null;
                                                                                                    amvw2.mo41472f();
                                                                                                    throw th3;
                                                                                                }
                                                                                                amvw2.mo41472f();
                                                                                            }
                                                                                            f = i14;
                                                                                            i12 = i15;
                                                                                            str9 = str11;
                                                                                            contentValues3 = contentValues4;
                                                                                            i3 = i7;
                                                                                            allz4 = allz6;
                                                                                        }
                                                                                        allz3 = allz4;
                                                                                        str4 = str9;
                                                                                        i7 = i3;
                                                                                        contentValues2 = contentValues3;
                                                                                    }
                                                                                } else {
                                                                                    allz3 = allz4;
                                                                                    str4 = str9;
                                                                                    i7 = i3;
                                                                                    contentValues2 = contentValues3;
                                                                                    alsj3 = a3;
                                                                                }
                                                                                HashSet hashSet22 = new HashSet();
                                                                                it = list.iterator();
                                                                                while (it.hasNext()) {
                                                                                    amyx amyx2 = (amyx) it.next();
                                                                                    String str12 = amyx2.f76419a;
                                                                                    amvp amvp = amyx2.f76420b;
                                                                                    if (!amwi.m63528a(amvp.f76103l)) {
                                                                                        if (!amwi.m63528a(amvp.f76104m)) {
                                                                                            if (!amwi.m63528a(amvp.f76105n)) {
                                                                                                if (!amwi.m63528a(amvp.f76107p)) {
                                                                                                    if (!amwi.m63528a(amvp.f76108q)) {
                                                                                                        if (!amwi.m63528a(amvp.f76110s)) {
                                                                                                            if (!amwi.m63528a(amvp.f76111t)) {
                                                                                                                if (!amwi.m63528a(amvp.f76112u)) {
                                                                                                                    if (!amwi.m63528a(amvp.f76113v)) {
                                                                                                                        if (!amwi.m63528a(amvp.f76114w)) {
                                                                                                                            if (!amwi.m63528a(amvp.f76115x)) {
                                                                                                                                if (!amwi.m63528a(amvp.f76116y)) {
                                                                                                                                    if (!amwi.m63528a(amvp.f76117z)) {
                                                                                                                                        if (!amwi.m63528a(amvp.f76082B)) {
                                                                                                                                            if (!amwi.m63528a(amvp.f76083C)) {
                                                                                                                                                if (!amwi.m63528a(amvp.f76084D)) {
                                                                                                                                                    if (!amwi.m63528a(amvp.f76086F)) {
                                                                                                                                                        if (!amwi.m63528a(amvp.f76088H)) {
                                                                                                                                                            if (!amwi.m63528a(amvp.f76082B)) {
                                                                                                                                                                if (!amwi.m63528a(amvp.f76089I)) {
                                                                                                                                                                    if (!amwi.m63528a(amvp.f76090J) && !amvp.f76102k) {
                                                                                                                                                                        List a9 = r22.mo67124a(str12);
                                                                                                                                                                        if (a9 != null) {
                                                                                                                                                                            long longValue = amvp.f76095d.longValue();
                                                                                                                                                                            Iterator it4 = a9.iterator();
                                                                                                                                                                            while (true) {
                                                                                                                                                                                if (!it4.hasNext()) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                amvp amvp2 = (amvp) it4.next();
                                                                                                                                                                                List<ContentValues> list2 = amvp.f76085E;
                                                                                                                                                                                List<ContentValues> list3 = amvp2.f76085E;
                                                                                                                                                                                if (ancm.m64008a((Collection) list2)) {
                                                                                                                                                                                    bndu = r22;
                                                                                                                                                                                    it2 = it;
                                                                                                                                                                                } else if (!ancm.m64008a((Collection) list3)) {
                                                                                                                                                                                    HashSet hashSet3 = new HashSet();
                                                                                                                                                                                    for (ContentValues contentValues5 : list2) {
                                                                                                                                                                                        hashSet3.add(amwi.m63527a(contentValues5.get("data1").toString()));
                                                                                                                                                                                        it = it;
                                                                                                                                                                                        r22 = r22;
                                                                                                                                                                                    }
                                                                                                                                                                                    bndu = r22;
                                                                                                                                                                                    it2 = it;
                                                                                                                                                                                    HashSet hashSet4 = new HashSet();
                                                                                                                                                                                    for (ContentValues contentValues6 : list3) {
                                                                                                                                                                                        hashSet4.add(amwi.m63527a(contentValues6.get("data1").toString()));
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!hashSet4.containsAll(hashSet3)) {
                                                                                                                                                                                        it = it2;
                                                                                                                                                                                        r22 = bndu;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (!amwi.m63529a(amvp.f76106o, amvp2.f76106o)) {
                                                                                                                                                                                    it = it2;
                                                                                                                                                                                    r22 = bndu;
                                                                                                                                                                                } else if (amwi.m63529a(amvp.f76087G, amvp2.f76087G)) {
                                                                                                                                                                                    hashSet22.add(Long.valueOf(longValue));
                                                                                                                                                                                    it = it2;
                                                                                                                                                                                    r22 = bndu;
                                                                                                                                                                                    break;
                                                                                                                                                                                } else {
                                                                                                                                                                                    it = it2;
                                                                                                                                                                                    r22 = bndu;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                amwf.f76170c = hashSet22;
                                                                                z = false;
                                                                            } else {
                                                                                i8 = a4;
                                                                                almg3 = almg;
                                                                                allz3 = allz4;
                                                                                str4 = str9;
                                                                                i7 = i3;
                                                                                contentValues2 = contentValues3;
                                                                                alsj3 = a3;
                                                                                z = false;
                                                                            }
                                                                        } else {
                                                                            i8 = a4;
                                                                            almg3 = almg;
                                                                            allz3 = allz4;
                                                                            str4 = str9;
                                                                            i7 = i3;
                                                                            contentValues2 = contentValues3;
                                                                            alsj3 = a3;
                                                                        }
                                                                        long j22 = query.getLong(0);
                                                                        if (cfxe.m143365d() || !cfxe.f185877a.mo6606a().mo82895r() || !amwf.f76170c.contains(Long.valueOf(j22))) {
                                                                            allz2 = allz3;
                                                                            i9 = i2;
                                                                        } else {
                                                                            i9 = i2 + 1;
                                                                            try {
                                                                                allz2 = allz3;
                                                                                amdk.m62657a("FSA2_DeviceContactsMigrater", "%d duplicate %s contacts.", Integer.valueOf(i9), allz2);
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                i2 = i9;
                                                                                bxvd = bxvd5;
                                                                                bxvd3 = bxvd4;
                                                                                i3 = i7;
                                                                                if (i3 > 0) {
                                                                                }
                                                                                if (cfxe.m143365d()) {
                                                                                }
                                                                                query.close();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        Uri withAppendedId22 = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j22);
                                                                        if (cfxb.f185869a.mo6606a().mo82857f()) {
                                                                            i3 = i7 + 1;
                                                                            i2 = i9;
                                                                            contentValues = contentValues2;
                                                                        } else {
                                                                            contentValues = contentValues2;
                                                                            int a10 = amwf.mo41479a(withAppendedId22, contentValues, (String) null);
                                                                            if (a10 > 0) {
                                                                                i3 = i7 + a10;
                                                                                i2 = i9;
                                                                            } else {
                                                                                i2 = i9;
                                                                                i3 = i7;
                                                                            }
                                                                        }
                                                                    }
                                                                    da4 = bxvd4;
                                                                    almg = almg3;
                                                                    a4 = i8;
                                                                    a3 = alsj3;
                                                                    str9 = str4;
                                                                    contentValues3 = contentValues;
                                                                    allz4 = allz2;
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    bxvd3 = da4;
                                                                    bxvd = bxvd5;
                                                                    if (i3 > 0) {
                                                                        try {
                                                                            if (bxvd3.f164950c) {
                                                                                bxvd3.mo74035c();
                                                                                bxvd3.f164950c = false;
                                                                            }
                                                                            ammt ammt5 = (ammt) bxvd3.f164949b;
                                                                            ammt5.f75378a |= 2;
                                                                            ammt5.f75380c = i3;
                                                                        } catch (RemoteException e5) {
                                                                            try {
                                                                                Log.e("FSA2_GoogleAccountUtil", "@prepareToSync Failed to migrate the groups.");
                                                                                ammt ammt6 = (ammt) bxvd3.mo74062i();
                                                                                if (bxvd.f164950c) {
                                                                                    bxvd.mo74035c();
                                                                                    bxvd.f164950c = false;
                                                                                }
                                                                                ammv = (ammv) bxvd.f164949b;
                                                                                ammt6.getClass();
                                                                                ammv.f75400c = ammt6;
                                                                                i = ammv.f75398a;
                                                                                ammv.f75398a = i | 2;
                                                                                ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                                                                return;
                                                                            } catch (Throwable th13) {
                                                                                th = th13;
                                                                                Throwable th14 = th;
                                                                                ammt ammt7 = (ammt) bxvd3.mo74062i();
                                                                                if (bxvd.f164950c) {
                                                                                    bxvd.mo74035c();
                                                                                    bxvd.f164950c = false;
                                                                                }
                                                                                ammv ammv5 = (ammv) bxvd.f164949b;
                                                                                ammt7.getClass();
                                                                                ammv5.f75400c = ammt7;
                                                                                ammv5.f75398a |= 2;
                                                                                throw th14;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (cfxe.m143365d()) {
                                                                        if (bxvd3.f164950c) {
                                                                            bxvd3.mo74035c();
                                                                            bxvd3.f164950c = false;
                                                                        }
                                                                        ammt ammt8 = (ammt) bxvd3.f164949b;
                                                                        ammt8.f75378a |= 1024;
                                                                        ammt8.f75388k = i2;
                                                                    }
                                                                    query.close();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th15) {
                                                                bxvd3 = da4;
                                                                bxvd = bxvd5;
                                                                th = th15;
                                                                if (i3 > 0) {
                                                                }
                                                                if (cfxe.m143365d()) {
                                                                }
                                                                query.close();
                                                                throw th;
                                                            }
                                                        }
                                                        if (i5 <= 0) {
                                                            bxvd3 = bxvd4;
                                                            try {
                                                                if (bxvd3.f164950c) {
                                                                    bxvd3.mo74035c();
                                                                    bxvd3.f164950c = false;
                                                                }
                                                                ammt ammt9 = (ammt) bxvd3.f164949b;
                                                                ammt9.f75378a |= 2;
                                                                i6 = i5;
                                                                ammt9.f75380c = i6;
                                                            } catch (RemoteException e6) {
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                                bxvd = bxvd5;
                                                                Throwable th142 = th;
                                                                ammt ammt72 = (ammt) bxvd3.mo74062i();
                                                                if (bxvd.f164950c) {
                                                                }
                                                                ammv ammv52 = (ammv) bxvd.f164949b;
                                                                ammt72.getClass();
                                                                ammv52.f75400c = ammt72;
                                                                ammv52.f75398a |= 2;
                                                                throw th142;
                                                            }
                                                        } else {
                                                            bxvd3 = bxvd4;
                                                            i6 = i5;
                                                        }
                                                        if (!cfxe.m143365d()) {
                                                            if (bxvd3.f164950c) {
                                                                bxvd3.mo74035c();
                                                                bxvd3.f164950c = false;
                                                            }
                                                            ammt ammt10 = (ammt) bxvd3.f164949b;
                                                            ammt10.f75378a |= 1024;
                                                            ammt10.f75388k = i2;
                                                        }
                                                        query.close();
                                                        amdk.m62657a("FSA2_DeviceContactsMigrater", "Moved %d %s contacts to Google", Integer.valueOf(i6), allz);
                                                        if (cfwv.f185860a.mo6606a().mo82847c()) {
                                                            amwf.m63522a(str2, i6, (anaz) null);
                                                        }
                                                        amwd = new amwd(i6, z2);
                                                        if (amwd.f76167b) {
                                                            Bundle bundle = new Bundle();
                                                            bundle.putBoolean("upload", true);
                                                            account2 = account;
                                                            ContentResolver.requestSync(account2, "com.android.contacts", bundle);
                                                        } else {
                                                            account2 = account;
                                                        }
                                                        if (cfxe.f185877a.mo6606a().mo82901x()) {
                                                            alsj2 = alsj;
                                                        } else {
                                                            String str13 = account2.name;
                                                            int i16 = amwd.f76166a;
                                                            int i17 = amwh.f76172a;
                                                            if (cfxe.f185877a.mo6606a().mo82874P()) {
                                                                alsj2 = alsj;
                                                            } else if (i16 <= 0) {
                                                                alsj2 = alsj;
                                                                if (alsj2.mo40710n(str13)) {
                                                                    if (i4 == 2) {
                                                                        SharedPreferences sharedPreferences2 = alsj2.f74200a;
                                                                        String valueOf3 = String.valueOf(str13);
                                                                        long j3 = sharedPreferences2.getLong(valueOf3.length() == 0 ? new String("focus_last_group_migration_start_time_") : "focus_last_group_migration_start_time_".concat(valueOf3), 0);
                                                                        long currentTimeMillis = System.currentTimeMillis();
                                                                        if (currentTimeMillis - j3 > cfxe.f185877a.mo6606a().mo82861C() * 1000) {
                                                                            SharedPreferences.Editor edit2 = alsj2.f74200a.edit();
                                                                            String valueOf4 = String.valueOf(str13);
                                                                            edit2.putLong(valueOf4.length() == 0 ? new String("focus_last_group_migration_start_time_") : "focus_last_group_migration_start_time_".concat(valueOf4), currentTimeMillis).apply();
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                alsj2 = alsj;
                                                            }
                                                            amwh amwh = new amwh(this.f76187c, almg2, account, anaz, bxvd3);
                                                            amwh.mo41482a(amwh.mo41481a(amwh.mo41480a("account_type!='com.google' AND system_id IS NULL AND group_is_read_only IS 0")), false);
                                                            if (cfxe.f185877a.mo6606a().mo82899v()) {
                                                                amwh.mo41482a(amwh.mo41481a(amwh.mo41480a("account_type != \"com.google\" AND deleted = 0 AND (group_is_read_only = 1 OR system_id IS NOT NULL)")), true);
                                                            }
                                                        }
                                                        if (!cfxe.f185877a.mo6606a().mo82892o()) {
                                                            try {
                                                                int b2 = new amvl(context).mo41388b();
                                                                if (bxvd3.f164950c) {
                                                                    bxvd3.mo74035c();
                                                                    bxvd3.f164950c = false;
                                                                }
                                                                ammt ammt11 = (ammt) bxvd3.f164949b;
                                                                ammt11.f75378a |= 8192;
                                                                ammt11.f75390m = b2;
                                                            } catch (aaaj e7) {
                                                                if (bxvd3.f164950c) {
                                                                    bxvd3.mo74035c();
                                                                    bxvd3.f164950c = false;
                                                                }
                                                                ammt ammt12 = (ammt) bxvd3.f164949b;
                                                                ammt12.f75378a |= 8192;
                                                                ammt12.f75390m = 16777215;
                                                                Log.e("FSA2_GoogleAccountUtil", "Cannot query the device contact count after sweep.");
                                                            }
                                                        }
                                                        if (cfxe.f185877a.mo6606a().mo82894q()) {
                                                            if (!amwd.f76167b) {
                                                                if (bxvd3.f164950c) {
                                                                    bxvd3.mo74035c();
                                                                    bxvd3.f164950c = false;
                                                                }
                                                                ammt ammt13 = (ammt) bxvd3.f164949b;
                                                                ammt13.f75379b = 5;
                                                                ammt13.f75378a |= 1;
                                                                alsj2.mo40701e(account2.name, 2);
                                                                ammt ammt14 = (ammt) bxvd3.mo74062i();
                                                                bxvd = bxvd5;
                                                                if (bxvd.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd.f164950c = false;
                                                                }
                                                                ammv = (ammv) bxvd.f164949b;
                                                                ammt14.getClass();
                                                                ammv.f75400c = ammt14;
                                                                i = ammv.f75398a;
                                                                ammv.f75398a = i | 2;
                                                                ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                                                return;
                                                            }
                                                        }
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        ammt ammt15 = (ammt) bxvd3.f164949b;
                                                        ammt15.f75379b = 1;
                                                        ammt15.f75378a = 1 | ammt15.f75378a;
                                                        alsj2.mo40701e(account2.name, 2);
                                                        ammt ammt142 = (ammt) bxvd3.mo74062i();
                                                        bxvd = bxvd5;
                                                        if (bxvd.f164950c) {
                                                        }
                                                        ammv = (ammv) bxvd.f164949b;
                                                        ammt142.getClass();
                                                        ammv.f75400c = ammt142;
                                                        i = ammv.f75398a;
                                                        ammv.f75398a = i | 2;
                                                        ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                                        return;
                                                    }
                                                    contentValues3.put("sync1", k);
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    bxvd3 = da4;
                                                    bxvd = bxvd5;
                                                    i3 = 0;
                                                    i2 = 0;
                                                    if (i3 > 0) {
                                                    }
                                                    if (cfxe.m143365d()) {
                                                    }
                                                    query.close();
                                                    throw th;
                                                }
                                            }
                                            z = true;
                                            i3 = 0;
                                            i2 = 0;
                                            while (true) {
                                                if (query.moveToNext()) {
                                                }
                                                da4 = bxvd4;
                                                almg = almg3;
                                                a4 = i8;
                                                a3 = alsj3;
                                                str9 = str4;
                                                contentValues3 = contentValues;
                                                allz4 = allz2;
                                            }
                                            if (i5 <= 0) {
                                            }
                                            if (!cfxe.m143365d()) {
                                            }
                                            query.close();
                                            amdk.m62657a("FSA2_DeviceContactsMigrater", "Moved %d %s contacts to Google", Integer.valueOf(i6), allz);
                                            if (cfwv.f185860a.mo6606a().mo82847c()) {
                                            }
                                            amwd = new amwd(i6, z2);
                                            if (amwd.f76167b) {
                                            }
                                            if (cfxe.f185877a.mo6606a().mo82901x()) {
                                            }
                                            if (!cfxe.f185877a.mo6606a().mo82892o()) {
                                            }
                                            if (cfxe.f185877a.mo6606a().mo82894q()) {
                                            }
                                            if (bxvd3.f164950c) {
                                            }
                                            ammt ammt152 = (ammt) bxvd3.f164949b;
                                            ammt152.f75379b = 1;
                                            ammt152.f75378a = 1 | ammt152.f75378a;
                                            alsj2.mo40701e(account2.name, 2);
                                            ammt ammt1422 = (ammt) bxvd3.mo74062i();
                                            bxvd = bxvd5;
                                            if (bxvd.f164950c) {
                                            }
                                            ammv = (ammv) bxvd.f164949b;
                                            ammt1422.getClass();
                                            ammv.f75400c = ammt1422;
                                            i = ammv.f75398a;
                                            ammv.f75398a = i | 2;
                                            ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                            return;
                                        } catch (Throwable th18) {
                                            th = th18;
                                            bxvd3 = da4;
                                            bxvd = bxvd5;
                                            th = th;
                                            i3 = 0;
                                            i2 = 0;
                                            if (i3 > 0) {
                                            }
                                            if (cfxe.m143365d()) {
                                            }
                                            query.close();
                                            throw th;
                                        }
                                    } catch (Throwable th19) {
                                        th = th19;
                                        bxvd = da;
                                        bxvd3 = da4;
                                        th = th;
                                        i3 = 0;
                                        i2 = 0;
                                        if (i3 > 0) {
                                        }
                                        if (cfxe.m143365d()) {
                                        }
                                        query.close();
                                        throw th;
                                    }
                                } catch (RemoteException e8) {
                                } catch (Throwable th20) {
                                    th = th20;
                                    bxvd = da;
                                    bxvd3 = da4;
                                    Throwable th1422 = th;
                                    ammt ammt722 = (ammt) bxvd3.mo74062i();
                                    if (bxvd.f164950c) {
                                    }
                                    ammv ammv522 = (ammv) bxvd.f164949b;
                                    ammt722.getClass();
                                    ammv522.f75400c = ammt722;
                                    ammv522.f75398a |= 2;
                                    throw th1422;
                                }
                            } else {
                                if (cfxe.m143369h()) {
                                    bxvd da8 = ammu.f75391d.mo74144da();
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    ammu ammu3 = (ammu) da8.f164949b;
                                    ammu3.f75393a |= 1;
                                    ammu3.f75394b = b;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ammv ammv6 = (ammv) da.f164949b;
                                    ammu ammu4 = (ammu) da8.mo74062i();
                                    ammu4.getClass();
                                    ammv6.f75401d = ammu4;
                                    ammv6.f75398a |= 4;
                                }
                                bxvd da9 = ammt.f75376n.mo74144da();
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                ammt ammt16 = (ammt) da9.f164949b;
                                ammt16.f75379b = 3;
                                ammt16.f75378a |= 1;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ammv ammv7 = (ammv) da.f164949b;
                                ammt ammt17 = (ammt) da9.mo74062i();
                                ammt17.getClass();
                                ammv7.f75400c = ammt17;
                                ammv7.f75398a |= 2;
                                Log.w("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync but there are too many contacts.");
                                bxvd = da;
                                ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                                return;
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ammv ammv8 = (ammv) bxvd.f164949b;
                        ammv8.f75399b = 2;
                        ammv8.f75398a |= 1;
                        ((anbh) anaz).f76564x = bmxv.m108566b((ammv) bxvd.mo74062i());
                        return;
                    }
                    return;
                }
                throw new amyc(new RemoteException("Unable to query CP2"));
            } catch (aaaj e9) {
                if (cfxe.m143368g()) {
                    m63533a(anaz2, 16777215);
                }
            } catch (Throwable th21) {
                throw th21;
            }
        }
    }
}
