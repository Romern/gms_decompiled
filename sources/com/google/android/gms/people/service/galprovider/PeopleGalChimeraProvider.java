package com.google.android.gms.people.service.galprovider;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleGalChimeraProvider extends ContentProvider {

    /* renamed from: b */
    private static final UriMatcher f82040b;

    /* renamed from: a */
    public ampm f82041a;

    /* renamed from: c */
    private final ArrayDeque f82042c = new ArrayDeque();

    /* renamed from: d */
    private adyd f82043d;

    /* renamed from: e */
    private Context f82044e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "directories", 0);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/filter/*", 1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/entities", 2);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/#/entities", 3);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/emails/filter/*", 4);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/phones/filter/*", 5);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "phone_lookup/*", 6);
        f82040b = uriMatcher;
    }

    public PeopleGalChimeraProvider() {
    }

    /* renamed from: a */
    private final Cursor m68186a(Uri uri, int i, String[] strArr, String str, Account account, bxvd bxvd) {
        boolean z;
        String queryParameter = uri.getQueryParameter("limit");
        long a = cfyo.f186156a.mo6606a().mo83124a();
        if (queryParameter != null) {
            try {
                a = Long.parseLong(queryParameter);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder(queryParameter.length() + 34);
                sb.append("query: invalid limit parameter: '");
                sb.append(queryParameter);
                sb.append("'");
                Log.e("PeopleGalProvider", sb.toString());
            }
        }
        long j = a;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        return (Cursor) amps.m63150a(this.f82042c, new ampz(this, i, strArr, account, Uri.encode(uri.getLastPathSegment()), str, j, z, bxvd), "GalFilterThread", cfyo.m143931f());
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        if (f82040b.match(uri) == 1) {
            return "vnd.android.cursor.item/contact";
        }
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        Context context = this.f82044e;
        if (context == null) {
            context = getContext();
        }
        this.f82044e = context;
        this.f82043d = adyd.m51363a(context);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String str2 = null;
        if (!cfyo.f186156a.mo6606a().mo83130g()) {
            return null;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("openFile uri=");
        sb.append(valueOf);
        sb.toString();
        bxvd da = amlc.f75159h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amlc amlc = (amlc) da.f164949b;
        amlc.f75162b = 8;
        amlc.f75161a |= 1;
        try {
            Account a = mo46470a(uri.getQueryParameter("account_name"), da);
            if (a == null) {
                int a2 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                if (a2 == 0 || a2 == 1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlc amlc2 = (amlc) da.f164949b;
                    amlc2.f75163c = 1;
                    amlc2.f75161a |= 2;
                }
                almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                return null;
            }
            String str3 = a.name;
            try {
                if (!"r".equals(str)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlc amlc3 = (amlc) da.f164949b;
                    amlc3.f75163c = 10;
                    amlc3.f75161a |= 2;
                    Log.e("PeopleGalProvider", "mode must be \"r\"");
                    int a3 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                    if (a3 == 0 || a3 == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc4 = (amlc) da.f164949b;
                        amlc4.f75163c = 1;
                        amlc4.f75161a |= 2;
                    }
                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str3);
                    return null;
                } else if (!amur.m63322a(this.f82044e).mo41356a()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlc amlc5 = (amlc) da.f164949b;
                    amlc5.f75163c = 2;
                    amlc5.f75161a |= 2;
                    Log.e("PeopleGalProvider", "Don't have Contacts permission.");
                    int a4 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                    if (a4 == 0 || a4 == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc6 = (amlc) da.f164949b;
                        amlc6.f75163c = 1;
                        amlc6.f75161a |= 2;
                    }
                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str3);
                    return null;
                } else {
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) amps.m63150a(this.f82042c, new ampy(this, uri, a, da), "GalOpenFileThread", cfyo.m143934i());
                    int a5 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                    if (a5 == 0 || a5 == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc7 = (amlc) da.f164949b;
                        amlc7.f75163c = 1;
                        amlc7.f75161a |= 2;
                    }
                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str3);
                    return parcelFileDescriptor;
                }
            } catch (Throwable th) {
                th = th;
                str2 = str3;
                int a6 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                if (a6 == 0 || a6 == 1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlc amlc8 = (amlc) da.f164949b;
                    amlc8.f75163c = 1;
                    amlc8.f75161a = 2 | amlc8.f75161a;
                }
                almk.m61263a().mo40518a((amlc) da.mo74062i(), str2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            int a62 = amjr.m62980a(((amlc) da.f164949b).f75163c);
            if (da.f164950c) {
            }
            amlc amlc82 = (amlc) da.f164949b;
            amlc82.f75163c = 1;
            amlc82.f75161a = 2 | amlc82.f75161a;
            almk.m61263a().mo40518a((amlc) da.mo74062i(), str2);
            throw th;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0be9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0bea, code lost:
        r19 = r13;
        r13 = 2;
        r2 = "PeopleGalProvider";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0c8e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0c90, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0c96, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0c97, code lost:
        r19 = r13;
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0c9c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0c9d, code lost:
        r2 = "PeopleGalProvider";
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:?, code lost:
        android.util.Log.e(r2, "Gal task threw exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0cae, code lost:
        android.util.Log.e(r2, "Gal task threw exception.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0cc1, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0cf2, code lost:
        if (r15.f164950c != false) goto L_0x0cf5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0cf5, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0cfb, code lost:
        ((p000.amlc) r15.f164949b).mo41214a(r13);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:314:0x0892, B:444:0x0c11] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0c90 A[ExcHandler: all (th java.lang.Throwable), PHI: r13 r19 10  PHI: (r13v7 int) = (r13v8 int), (r13v8 int), (r13v8 int), (r13v10 int), (r13v10 int), (r13v11 int), (r13v11 int), (r13v11 int), (r13v11 int) binds: [B:437:0x0bf7, B:444:0x0c11, B:445:?, B:382:0x0a5f, B:402:0x0aeb, B:314:0x0892, B:333:0x091b, B:356:0x09bf, B:357:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r19v7 long) = (r19v8 long), (r19v8 long), (r19v8 long), (r19v10 long), (r19v10 long), (r19v11 long), (r19v11 long), (r19v11 long), (r19v11 long) binds: [B:437:0x0bf7, B:444:0x0c11, B:445:?, B:382:0x0a5f, B:402:0x0aeb, B:314:0x0892, B:333:0x091b, B:356:0x09bf, B:357:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:314:0x0892] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0c96 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0caa A[SYNTHETIC, Splitter:B:475:0x0caa] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0cae A[Catch:{ all -> 0x0cb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0cc1  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0cf0  */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        long j;
        int i;
        int a;
        String str3;
        String str4;
        String str5;
        String str6;
        long j2;
        String str7;
        ampw ampw;
        String str8;
        String str9;
        String str10;
        String str11;
        ampx ampx;
        Uri uri2 = uri;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(uri);
        String arrays = Arrays.toString(strArr);
        String arrays2 = Arrays.toString(strArr2);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(arrays).length() + String.valueOf(str).length() + String.valueOf(arrays2).length() + String.valueOf(str2).length());
        sb.append("query: uri=");
        sb.append(valueOf);
        sb.append("  projection=");
        sb.append(arrays);
        sb.append("  selection=[");
        sb.append(str);
        sb.append("]  args=");
        sb.append(arrays2);
        sb.append("  order=[");
        sb.append(str2);
        sb.append("]");
        sb.toString();
        bxvd da = amlc.f75159h.mo74144da();
        String str12 = null;
        try {
            if (amur.m63322a(this.f82044e).mo41357b()) {
                int match = f82040b.match(uri2);
                switch (match) {
                    case 0:
                        str4 = "PeopleGalProvider";
                        j = elapsedRealtime;
                        i = 2;
                        if (!cfyo.m143929d()) {
                            int a2 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            String valueOf2 = String.valueOf(amjp.m62978b(a2));
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                            sb2.append("Method ");
                            sb2.append(valueOf2);
                            sb2.append(" completed.");
                            sb2.toString();
                            int a3 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a3 == 0 || a3 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc = (amlc) da.f164949b;
                                amlc.f75163c = 1;
                                amlc.f75161a |= 2;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc2 = (amlc) da.f164949b;
                            amlc2.f75161a |= 8;
                            amlc2.f75165e = elapsedRealtime2;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                            return null;
                        }
                        Cursor a4 = m68187a(strArr);
                        int a5 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        String valueOf3 = String.valueOf(amjp.m62978b(a5));
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 18);
                        sb3.append("Method ");
                        sb3.append(valueOf3);
                        sb3.append(" completed.");
                        sb3.toString();
                        int a6 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                        if (a6 == 0 || a6 == 1) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc3 = (amlc) da.f164949b;
                            amlc3.f75163c = 1;
                            amlc3.f75161a |= 2;
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc4 = (amlc) da.f164949b;
                        amlc4.f75161a |= 8;
                        amlc4.f75165e = elapsedRealtime3;
                        almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                        return a4;
                    case 1:
                        str4 = "PeopleGalProvider";
                        j = elapsedRealtime;
                        i = 2;
                        try {
                            if (!cfyo.m143930e()) {
                                int a7 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a7 == 0) {
                                    a7 = 1;
                                }
                                String valueOf4 = String.valueOf(amjp.m62978b(a7));
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 18);
                                sb4.append("Method ");
                                sb4.append(valueOf4);
                                sb4.append(" completed.");
                                sb4.toString();
                                int a8 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                if (a8 == 0 || a8 == 1) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amlc amlc5 = (amlc) da.f164949b;
                                    amlc5.f75163c = 1;
                                    amlc5.f75161a |= 2;
                                }
                                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc6 = (amlc) da.f164949b;
                                amlc6.f75161a |= 8;
                                amlc6.f75165e = elapsedRealtime4 - j;
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                                return null;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc7 = (amlc) da.f164949b;
                            amlc7.f75162b = 2;
                            amlc7.f75161a |= 1;
                            Account a9 = mo46470a(uri2.getQueryParameter("account_name"), da);
                            if (a9 == null) {
                                int a10 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a10 == 0) {
                                    a10 = 1;
                                }
                                String valueOf5 = String.valueOf(amjp.m62978b(a10));
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 18);
                                sb5.append("Method ");
                                sb5.append(valueOf5);
                                sb5.append(" completed.");
                                sb5.toString();
                                int a11 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                if (a11 == 0 || a11 == 1) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amlc amlc8 = (amlc) da.f164949b;
                                    amlc8.f75163c = 1;
                                    amlc8.f75161a |= 2;
                                }
                                long elapsedRealtime5 = SystemClock.elapsedRealtime();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc9 = (amlc) da.f164949b;
                                amlc9.f75161a |= 8;
                                amlc9.f75165e = elapsedRealtime5 - j;
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                                return null;
                            }
                            String str13 = a9.name;
                            try {
                                Cursor a12 = m68186a(uri, match, strArr, str2, a9, da);
                                int a13 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a13 == 0) {
                                    a13 = 1;
                                }
                                String valueOf6 = String.valueOf(amjp.m62978b(a13));
                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 18);
                                sb6.append("Method ");
                                sb6.append(valueOf6);
                                sb6.append(" completed.");
                                sb6.toString();
                                int a14 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                if (a14 == 0 || a14 == 1) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amlc amlc10 = (amlc) da.f164949b;
                                    amlc10.f75163c = 1;
                                    amlc10.f75161a |= 2;
                                }
                                long elapsedRealtime6 = SystemClock.elapsedRealtime();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc11 = (amlc) da.f164949b;
                                amlc11.f75161a |= 8;
                                amlc11.f75165e = elapsedRealtime6 - j;
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str13);
                                return a12;
                            } catch (Exception e) {
                                e = e;
                                str5 = str13;
                                str3 = str4;
                                try {
                                    if (!cfyo.m143927b()) {
                                    }
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a == 0) {
                                    }
                                    String valueOf7 = String.valueOf(amjp.m62978b(a));
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 18);
                                    sb7.append("Method ");
                                    sb7.append(valueOf7);
                                    sb7.append(" completed.");
                                    sb7.toString();
                                    if (((amlc) da.f164949b).mo41213a() == 1) {
                                    }
                                    long elapsedRealtime7 = SystemClock.elapsedRealtime();
                                    da.mo74025b();
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime7 - j);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str12 = str13;
                                a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a == 0) {
                                }
                                String valueOf72 = String.valueOf(amjp.m62978b(a));
                                StringBuilder sb72 = new StringBuilder(String.valueOf(valueOf72).length() + 18);
                                sb72.append("Method ");
                                sb72.append(valueOf72);
                                sb72.append(" completed.");
                                sb72.toString();
                                if (((amlc) da.f164949b).mo41213a() == 1) {
                                }
                                long elapsedRealtime72 = SystemClock.elapsedRealtime();
                                da.mo74025b();
                                ((amlc) da.f164949b).mo41215a(elapsedRealtime72 - j);
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str4;
                            if (!cfyo.m143927b()) {
                            }
                            throw e;
                        } catch (Throwable th3) {
                        }
                        break;
                    case 2:
                        String str14 = "GalHandleContactThread";
                        str4 = "PeopleGalProvider";
                        j = elapsedRealtime;
                        i = 2;
                        try {
                            String queryParameter = uri2.getQueryParameter("account_name");
                            try {
                                String str15 = uri.getPathSegments().get(2);
                                if (!cfyo.m143928c()) {
                                    int a15 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a15 == 0) {
                                        a15 = 1;
                                    }
                                    String valueOf8 = String.valueOf(amjp.m62978b(a15));
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 18);
                                    sb8.append("Method ");
                                    sb8.append(valueOf8);
                                    sb8.append(" completed.");
                                    sb8.toString();
                                    int a16 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                    if (a16 == 0 || a16 == 1) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((amlc) da.f164949b).mo41214a(2);
                                    }
                                    long elapsedRealtime8 = SystemClock.elapsedRealtime() - j;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime8);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), queryParameter);
                                    return null;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc12 = (amlc) da.f164949b;
                                amlc12.f75162b = 5;
                                amlc12.f75161a |= 1;
                                try {
                                    Cursor cursor = (Cursor) amps.m63150a(this.f82042c, new ampv(this, strArr, str15, queryParameter, da), str14, cfyo.m143931f());
                                    int a17 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a17 == 0) {
                                        a17 = 1;
                                    }
                                    String valueOf9 = String.valueOf(amjp.m62978b(a17));
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf9).length() + 18);
                                    sb9.append("Method ");
                                    sb9.append(valueOf9);
                                    sb9.append(" completed.");
                                    sb9.toString();
                                    if (((amlc) da.f164949b).mo41213a() == 1) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((amlc) da.f164949b).mo41214a(2);
                                    }
                                    long elapsedRealtime9 = SystemClock.elapsedRealtime() - j;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime9);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), queryParameter);
                                    return cursor;
                                } catch (Exception e3) {
                                    e = e3;
                                    str5 = queryParameter;
                                    str3 = str4;
                                    if (!cfyo.m143927b()) {
                                    }
                                    throw e;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str12 = queryParameter;
                                    a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a == 0) {
                                    }
                                    String valueOf722 = String.valueOf(amjp.m62978b(a));
                                    StringBuilder sb722 = new StringBuilder(String.valueOf(valueOf722).length() + 18);
                                    sb722.append("Method ");
                                    sb722.append(valueOf722);
                                    sb722.append(" completed.");
                                    sb722.toString();
                                    if (((amlc) da.f164949b).mo41213a() == 1) {
                                    }
                                    long elapsedRealtime722 = SystemClock.elapsedRealtime();
                                    da.mo74025b();
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime722 - j);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str5 = queryParameter;
                                str3 = str4;
                                if (!cfyo.m143927b()) {
                                }
                                throw e;
                            } catch (Throwable th5) {
                                th = th5;
                                str12 = queryParameter;
                                a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a == 0) {
                                }
                                String valueOf7222 = String.valueOf(amjp.m62978b(a));
                                StringBuilder sb7222 = new StringBuilder(String.valueOf(valueOf7222).length() + 18);
                                sb7222.append("Method ");
                                sb7222.append(valueOf7222);
                                sb7222.append(" completed.");
                                sb7222.toString();
                                if (((amlc) da.f164949b).mo41213a() == 1) {
                                }
                                long elapsedRealtime7222 = SystemClock.elapsedRealtime();
                                da.mo74025b();
                                ((amlc) da.f164949b).mo41215a(elapsedRealtime7222 - j);
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str3 = str4;
                            if (!cfyo.m143927b()) {
                            }
                            throw e;
                        } catch (Throwable th6) {
                            th = th6;
                            a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a == 0) {
                            }
                            String valueOf72222 = String.valueOf(amjp.m62978b(a));
                            StringBuilder sb72222 = new StringBuilder(String.valueOf(valueOf72222).length() + 18);
                            sb72222.append("Method ");
                            sb72222.append(valueOf72222);
                            sb72222.append(" completed.");
                            sb72222.toString();
                            if (((amlc) da.f164949b).mo41213a() == 1) {
                            }
                            long elapsedRealtime72222 = SystemClock.elapsedRealtime();
                            da.mo74025b();
                            ((amlc) da.f164949b).mo41215a(elapsedRealtime72222 - j);
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                            throw th;
                        }
                    case 3:
                        str4 = "PeopleGalProvider";
                        try {
                            String queryParameter2 = uri2.getQueryParameter("account_name");
                            try {
                                String str16 = uri.getPathSegments().get(2);
                                long parseLong = Long.parseLong(uri.getPathSegments().get(3));
                                if (!cfyo.m143928c()) {
                                    int a18 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a18 == 0) {
                                        a18 = 1;
                                    }
                                    String valueOf10 = String.valueOf(amjp.m62978b(a18));
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf10).length() + 18);
                                    sb10.append("Method ");
                                    sb10.append(valueOf10);
                                    sb10.append(" completed.");
                                    sb10.toString();
                                    int a19 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                    if (a19 == 0 || a19 == 1) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        amlc amlc13 = (amlc) da.f164949b;
                                        amlc13.f75163c = 1;
                                        amlc13.f75161a |= 2;
                                    }
                                    long elapsedRealtime10 = SystemClock.elapsedRealtime();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime10 - elapsedRealtime);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), queryParameter2);
                                    return null;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc14 = (amlc) da.f164949b;
                                amlc14.f75162b = 6;
                                amlc14.f75161a |= 1;
                                ArrayDeque arrayDeque = this.f82042c;
                                ampw ampw2 = ampw;
                                String str17 = "GalHandleContactThread";
                                String str18 = queryParameter2;
                                j2 = elapsedRealtime;
                                i = 2;
                                try {
                                    ampw = new ampw(this, strArr, str16, queryParameter2, parseLong, da);
                                    Cursor cursor2 = (Cursor) amps.m63150a(arrayDeque, ampw2, str17, cfyo.m143931f());
                                    int a20 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a20 == 0) {
                                        a20 = 1;
                                    }
                                    String valueOf11 = String.valueOf(amjp.m62978b(a20));
                                    StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf11).length() + 18);
                                    sb11.append("Method ");
                                    sb11.append(valueOf11);
                                    sb11.append(" completed.");
                                    sb11.toString();
                                    if (((amlc) da.f164949b).mo41213a() == 1) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((amlc) da.f164949b).mo41214a(2);
                                    }
                                    long elapsedRealtime11 = SystemClock.elapsedRealtime();
                                    da.mo74025b();
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime11 - j2);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str18);
                                    return cursor2;
                                } catch (Exception e6) {
                                    e = e6;
                                    str6 = str18;
                                    str5 = str6;
                                    str3 = str4;
                                    if (!cfyo.m143927b()) {
                                    }
                                    throw e;
                                } catch (Throwable th7) {
                                    th = th7;
                                    str7 = str18;
                                    str12 = str7;
                                    a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                    if (a == 0) {
                                    }
                                    String valueOf722222 = String.valueOf(amjp.m62978b(a));
                                    StringBuilder sb722222 = new StringBuilder(String.valueOf(valueOf722222).length() + 18);
                                    sb722222.append("Method ");
                                    sb722222.append(valueOf722222);
                                    sb722222.append(" completed.");
                                    sb722222.toString();
                                    if (((amlc) da.f164949b).mo41213a() == 1) {
                                    }
                                    long elapsedRealtime722222 = SystemClock.elapsedRealtime();
                                    da.mo74025b();
                                    ((amlc) da.f164949b).mo41215a(elapsedRealtime722222 - j);
                                    almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                str6 = queryParameter2;
                                j2 = elapsedRealtime;
                                i = 2;
                                str5 = str6;
                                str3 = str4;
                                if (!cfyo.m143927b()) {
                                }
                                throw e;
                            } catch (Throwable th8) {
                                th = th8;
                                str7 = queryParameter2;
                                j2 = elapsedRealtime;
                                i = 2;
                                str12 = str7;
                                a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a == 0) {
                                }
                                String valueOf7222222 = String.valueOf(amjp.m62978b(a));
                                StringBuilder sb7222222 = new StringBuilder(String.valueOf(valueOf7222222).length() + 18);
                                sb7222222.append("Method ");
                                sb7222222.append(valueOf7222222);
                                sb7222222.append(" completed.");
                                sb7222222.toString();
                                if (((amlc) da.f164949b).mo41213a() == 1) {
                                }
                                long elapsedRealtime7222222 = SystemClock.elapsedRealtime();
                                da.mo74025b();
                                ((amlc) da.f164949b).mo41215a(elapsedRealtime7222222 - j);
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            j = elapsedRealtime;
                            i = 2;
                            str3 = str4;
                            if (!cfyo.m143927b()) {
                            }
                            throw e;
                        } catch (Throwable th9) {
                            th = th9;
                            j = elapsedRealtime;
                            i = 2;
                            a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a == 0) {
                            }
                            String valueOf72222222 = String.valueOf(amjp.m62978b(a));
                            StringBuilder sb72222222 = new StringBuilder(String.valueOf(valueOf72222222).length() + 18);
                            sb72222222.append("Method ");
                            sb72222222.append(valueOf72222222);
                            sb72222222.append(" completed.");
                            sb72222222.toString();
                            if (((amlc) da.f164949b).mo41213a() == 1) {
                            }
                            long elapsedRealtime72222222 = SystemClock.elapsedRealtime();
                            da.mo74025b();
                            ((amlc) da.f164949b).mo41215a(elapsedRealtime72222222 - j);
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                            throw th;
                        }
                    case 4:
                        str8 = "PeopleGalProvider";
                        if (!cfyo.m143930e()) {
                            int a21 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a21 == 0) {
                                a21 = 1;
                            }
                            String valueOf12 = String.valueOf(amjp.m62978b(a21));
                            StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf12).length() + 18);
                            sb12.append("Method ");
                            sb12.append(valueOf12);
                            sb12.append(" completed.");
                            sb12.toString();
                            int a22 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a22 == 0 || a22 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc15 = (amlc) da.f164949b;
                                amlc15.f75163c = 1;
                                amlc15.f75161a |= 2;
                            }
                            long elapsedRealtime12 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc16 = (amlc) da.f164949b;
                            amlc16.f75161a |= 8;
                            amlc16.f75165e = elapsedRealtime12;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                            return null;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc17 = (amlc) da.f164949b;
                        amlc17.f75162b = 4;
                        amlc17.f75161a |= 1;
                        Account a23 = mo46470a(uri2.getQueryParameter("account_name"), da);
                        if (a23 == null) {
                            int a24 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a24 == 0) {
                                a24 = 1;
                            }
                            String valueOf13 = String.valueOf(amjp.m62978b(a24));
                            StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf13).length() + 18);
                            sb13.append("Method ");
                            sb13.append(valueOf13);
                            sb13.append(" completed.");
                            sb13.toString();
                            int a25 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a25 == 0 || a25 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc18 = (amlc) da.f164949b;
                                amlc18.f75163c = 1;
                                amlc18.f75161a |= 2;
                            }
                            long elapsedRealtime13 = SystemClock.elapsedRealtime();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc19 = (amlc) da.f164949b;
                            amlc19.f75161a |= 8;
                            amlc19.f75165e = elapsedRealtime13 - elapsedRealtime;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                            return null;
                        }
                        String str19 = a23.name;
                        Cursor a26 = m68186a(uri, match, strArr, str2, a23, da);
                        int a27 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                        if (a27 == 0) {
                            a27 = 1;
                        }
                        String valueOf14 = String.valueOf(amjp.m62978b(a27));
                        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf14).length() + 18);
                        sb14.append("Method ");
                        sb14.append(valueOf14);
                        sb14.append(" completed.");
                        sb14.toString();
                        int a28 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                        if (a28 == 0 || a28 == 1) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc20 = (amlc) da.f164949b;
                            amlc20.f75163c = 1;
                            amlc20.f75161a |= 2;
                        }
                        long elapsedRealtime14 = SystemClock.elapsedRealtime();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc21 = (amlc) da.f164949b;
                        amlc21.f75161a |= 8;
                        amlc21.f75165e = elapsedRealtime14 - elapsedRealtime;
                        almk.m61263a().mo40518a((amlc) da.mo74062i(), str19);
                        return a26;
                    case 5:
                        if (!cfyo.m143930e()) {
                            int a29 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a29 == 0) {
                                a29 = 1;
                            }
                            String valueOf15 = String.valueOf(amjp.m62978b(a29));
                            StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf15).length() + 18);
                            sb15.append("Method ");
                            sb15.append(valueOf15);
                            sb15.append(" completed.");
                            sb15.toString();
                            int a30 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a30 == 0 || a30 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc22 = (amlc) da.f164949b;
                                amlc22.f75163c = 1;
                                amlc22.f75161a |= 2;
                            }
                            long elapsedRealtime15 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc23 = (amlc) da.f164949b;
                            amlc23.f75161a |= 8;
                            amlc23.f75165e = elapsedRealtime15;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                            return null;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc24 = (amlc) da.f164949b;
                        amlc24.f75162b = 3;
                        amlc24.f75161a |= 1;
                        Account a31 = mo46470a(uri2.getQueryParameter("account_name"), da);
                        if (a31 == null) {
                            int a32 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a32 == 0) {
                                a32 = 1;
                            }
                            String valueOf16 = String.valueOf(amjp.m62978b(a32));
                            StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf16).length() + 18);
                            sb16.append("Method ");
                            sb16.append(valueOf16);
                            sb16.append(" completed.");
                            sb16.toString();
                            int a33 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a33 == 0 || a33 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc25 = (amlc) da.f164949b;
                                amlc25.f75163c = 1;
                                amlc25.f75161a |= 2;
                            }
                            long elapsedRealtime16 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc26 = (amlc) da.f164949b;
                            amlc26.f75161a |= 8;
                            amlc26.f75165e = elapsedRealtime16;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                            return null;
                        }
                        Uri uri3 = uri;
                        String str20 = a31.name;
                        str8 = "PeopleGalProvider";
                        try {
                            Cursor a34 = m68186a(uri3, match, strArr, str2, a31, da);
                            int a35 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a35 == 0) {
                                a35 = 1;
                            }
                            String valueOf17 = String.valueOf(amjp.m62978b(a35));
                            StringBuilder sb17 = new StringBuilder(String.valueOf(valueOf17).length() + 18);
                            sb17.append("Method ");
                            sb17.append(valueOf17);
                            sb17.append(" completed.");
                            sb17.toString();
                            int a36 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                            if (a36 == 0 || a36 == 1) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc27 = (amlc) da.f164949b;
                                amlc27.f75163c = 1;
                                amlc27.f75161a |= 2;
                            }
                            long elapsedRealtime17 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc28 = (amlc) da.f164949b;
                            amlc28.f75161a |= 8;
                            amlc28.f75165e = elapsedRealtime17;
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), str20);
                            return a34;
                        } catch (Exception e9) {
                            e = e9;
                            str9 = str20;
                            j = elapsedRealtime;
                            str3 = str8;
                            i = 2;
                            if (!cfyo.m143927b()) {
                            }
                            throw e;
                        } catch (Throwable th10) {
                            th = th10;
                            str12 = str20;
                            j = elapsedRealtime;
                            i = 2;
                            a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a == 0) {
                            }
                            String valueOf722222222 = String.valueOf(amjp.m62978b(a));
                            StringBuilder sb722222222 = new StringBuilder(String.valueOf(valueOf722222222).length() + 18);
                            sb722222222.append("Method ");
                            sb722222222.append(valueOf722222222);
                            sb722222222.append(" completed.");
                            sb722222222.toString();
                            if (((amlc) da.f164949b).mo41213a() == 1) {
                            }
                            long elapsedRealtime722222222 = SystemClock.elapsedRealtime();
                            da.mo74025b();
                            ((amlc) da.f164949b).mo41215a(elapsedRealtime722222222 - j);
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                            throw th;
                        }
                    case 6:
                        String queryParameter3 = uri2.getQueryParameter("account_name");
                        try {
                            String lastPathSegment = uri.getPathSegments().size() <= 1 ? "" : uri.getLastPathSegment();
                            if (!cfyo.f186156a.mo6606a().mo83129f()) {
                                int a37 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a37 == 0) {
                                    a37 = 1;
                                }
                                String valueOf18 = String.valueOf(amjp.m62978b(a37));
                                StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf18).length() + 18);
                                sb18.append("Method ");
                                sb18.append(valueOf18);
                                sb18.append(" completed.");
                                sb18.toString();
                                int a38 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                if (a38 == 0 || a38 == 1) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amlc amlc29 = (amlc) da.f164949b;
                                    amlc29.f75163c = 1;
                                    amlc29.f75161a |= 2;
                                }
                                long elapsedRealtime18 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc30 = (amlc) da.f164949b;
                                amlc30.f75161a |= 8;
                                amlc30.f75165e = elapsedRealtime18;
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), queryParameter3);
                                return null;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc31 = (amlc) da.f164949b;
                            amlc31.f75162b = 7;
                            amlc31.f75161a |= 1;
                            ArrayDeque arrayDeque2 = this.f82042c;
                            ampx ampx2 = ampx;
                            String str21 = queryParameter3;
                            try {
                                ampx = new ampx(this, strArr, lastPathSegment, queryParameter3, da);
                                Cursor cursor3 = (Cursor) amps.m63150a(arrayDeque2, ampx2, "GalPhoneLookupThread", cfyo.m143931f());
                                int a39 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a39 == 0) {
                                    a39 = 1;
                                }
                                String valueOf19 = String.valueOf(amjp.m62978b(a39));
                                StringBuilder sb19 = new StringBuilder(String.valueOf(valueOf19).length() + 18);
                                sb19.append("Method ");
                                sb19.append(valueOf19);
                                sb19.append(" completed.");
                                sb19.toString();
                                int a40 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                                if (a40 == 0 || a40 == 1) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amlc amlc32 = (amlc) da.f164949b;
                                    amlc32.f75163c = 1;
                                    amlc32.f75161a |= 2;
                                }
                                long elapsedRealtime19 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amlc amlc33 = (amlc) da.f164949b;
                                amlc33.f75161a |= 8;
                                amlc33.f75165e = elapsedRealtime19;
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str21);
                                return cursor3;
                            } catch (Exception e10) {
                                e = e10;
                                str10 = str21;
                                str9 = str10;
                                str3 = "PeopleGalProvider";
                                j = elapsedRealtime;
                                i = 2;
                                if (!cfyo.m143927b()) {
                                }
                                throw e;
                            } catch (Throwable th11) {
                                th = th11;
                                str11 = str21;
                                str12 = str11;
                                j = elapsedRealtime;
                                i = 2;
                                a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                                if (a == 0) {
                                }
                                String valueOf7222222222 = String.valueOf(amjp.m62978b(a));
                                StringBuilder sb7222222222 = new StringBuilder(String.valueOf(valueOf7222222222).length() + 18);
                                sb7222222222.append("Method ");
                                sb7222222222.append(valueOf7222222222);
                                sb7222222222.append(" completed.");
                                sb7222222222.toString();
                                if (((amlc) da.f164949b).mo41213a() == 1) {
                                }
                                long elapsedRealtime7222222222 = SystemClock.elapsedRealtime();
                                da.mo74025b();
                                ((amlc) da.f164949b).mo41215a(elapsedRealtime7222222222 - j);
                                almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str10 = queryParameter3;
                            str9 = str10;
                            str3 = "PeopleGalProvider";
                            j = elapsedRealtime;
                            i = 2;
                            if (!cfyo.m143927b()) {
                            }
                            throw e;
                        } catch (Throwable th12) {
                            th = th12;
                            str11 = queryParameter3;
                            str12 = str11;
                            j = elapsedRealtime;
                            i = 2;
                            a = amjp.m62977a(((amlc) da.f164949b).f75162b);
                            if (a == 0) {
                            }
                            String valueOf72222222222 = String.valueOf(amjp.m62978b(a));
                            StringBuilder sb72222222222 = new StringBuilder(String.valueOf(valueOf72222222222).length() + 18);
                            sb72222222222.append("Method ");
                            sb72222222222.append(valueOf72222222222);
                            sb72222222222.append(" completed.");
                            sb72222222222.toString();
                            if (((amlc) da.f164949b).mo41213a() == 1) {
                            }
                            long elapsedRealtime72222222222 = SystemClock.elapsedRealtime();
                            da.mo74025b();
                            ((amlc) da.f164949b).mo41215a(elapsedRealtime72222222222 - j);
                            almk.m61263a().mo40518a((amlc) da.mo74062i(), str12);
                            throw th;
                        }
                    default:
                        long j3 = elapsedRealtime;
                        int a41 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                        if (a41 == 0) {
                            a41 = 1;
                        }
                        String valueOf20 = String.valueOf(amjp.m62978b(a41));
                        StringBuilder sb20 = new StringBuilder(String.valueOf(valueOf20).length() + 18);
                        sb20.append("Method ");
                        sb20.append(valueOf20);
                        sb20.append(" completed.");
                        sb20.toString();
                        int a42 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                        if (a42 == 0 || a42 == 1) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amlc amlc34 = (amlc) da.f164949b;
                            amlc34.f75163c = 1;
                            amlc34.f75161a |= 2;
                        }
                        long elapsedRealtime20 = SystemClock.elapsedRealtime() - j3;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amlc amlc35 = (amlc) da.f164949b;
                        amlc35.f75161a |= 8;
                        amlc35.f75165e = elapsedRealtime20;
                        almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                        return null;
                }
            } else {
                str4 = "PeopleGalProvider";
                j = elapsedRealtime;
                i = 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amlc amlc36 = (amlc) da.f164949b;
                amlc36.f75163c = 2;
                amlc36.f75161a |= 2;
                str3 = str4;
                Log.e(str3, "Don't have Contacts permission.");
                int a43 = amjp.m62977a(((amlc) da.f164949b).f75162b);
                if (a43 == 0) {
                    a43 = 1;
                }
                String valueOf21 = String.valueOf(amjp.m62978b(a43));
                StringBuilder sb21 = new StringBuilder(String.valueOf(valueOf21).length() + 18);
                sb21.append("Method ");
                sb21.append(valueOf21);
                sb21.append(" completed.");
                sb21.toString();
                int a44 = amjr.m62980a(((amlc) da.f164949b).f75163c);
                if (a44 == 0 || a44 == 1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((amlc) da.f164949b).mo41214a(2);
                }
                long elapsedRealtime21 = SystemClock.elapsedRealtime() - j;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((amlc) da.f164949b).mo41215a(elapsedRealtime21);
                almk.m61263a().mo40518a((amlc) da.mo74062i(), (String) null);
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            long j4 = elapsedRealtime;
            String str22 = str8;
            i = 2;
            if (!cfyo.m143927b()) {
            }
            throw e;
        } catch (Throwable th13) {
        }
    }

    public PeopleGalChimeraProvider(Context context, ampm ampm) {
        this.f82044e = context;
        this.f82041a = ampm;
    }

    /* renamed from: a */
    private final Cursor m68187a(String[] strArr) {
        if (cfyo.f186156a.mo6606a().mo83126c()) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            Account[] a = this.f82043d.mo33916a("com.google");
            for (Account account : a) {
                String valueOf = String.valueOf(account);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("handleDirectories: ");
                sb.append(valueOf);
                sb.toString();
                String str = account.name;
                if (!str.endsWith("@gmail.com") && !str.endsWith("@googlemail.com")) {
                    Object[] objArr = new Object[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        String str2 = strArr[i];
                        if ("accountName".equals(str2)) {
                            objArr[i] = str;
                        } else if ("accountType".equals(str2)) {
                            objArr[i] = account.type;
                        } else if ("typeResourceId".equals(str2)) {
                            objArr[i] = "Google Apps Contacts";
                        } else if ("displayName".equals(str2)) {
                            int indexOf = str.indexOf(64);
                            if (indexOf == -1 || indexOf >= str.length() - 2) {
                                objArr[i] = str;
                            } else {
                                char upperCase = Character.toUpperCase(str.charAt(indexOf + 1));
                                String substring = str.substring(indexOf + 2);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1);
                                sb2.append(upperCase);
                                sb2.append(substring);
                                objArr[i] = sb2.toString();
                            }
                        } else if ("exportSupport".equals(str2)) {
                            objArr[i] = 1;
                        } else if ("shortcutSupport".equals(str2)) {
                            objArr[i] = 0;
                        } else if ("photoSupport".equals(str2)) {
                            objArr[i] = 3;
                        }
                    }
                    matrixCursor.addRow(objArr);
                }
            }
            return matrixCursor;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static Uri m68188a(String str, boolean z, String str2) {
        Uri build = new Uri.Builder().scheme("content").authority("com.google.contacts.gal.provider").appendEncodedPath("people_photo/").appendQueryParameter("account_name", str).appendQueryParameter("lookup", str2).build();
        return z ? build.buildUpon().appendQueryParameter("sz", Long.toString(cfyo.m143933h())).build() : build;
    }

    /* renamed from: a */
    public static boolean m68189a(bler bler) {
        if (bler.f126255e.size() <= 0 || ((bley) bler.f126255e.get(0)).f126308d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Account mo46470a(String str, bxvd bxvd) {
        if (str != null) {
            Account[] a = this.f82043d.mo33916a("com.google");
            for (Account account : a) {
                if (account.name.equals(str)) {
                    return account;
                }
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc = (amlc) bxvd.f164949b;
            amlc amlc2 = amlc.f75159h;
            amlc.f75163c = 5;
            amlc.f75161a |= 2;
            Log.e("PeopleGalProvider", str.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(str));
            return null;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amlc amlc3 = (amlc) bxvd.f164949b;
        amlc amlc4 = amlc.f75159h;
        amlc3.f75163c = 4;
        amlc3.f75161a |= 2;
        Log.e("PeopleGalProvider", "Account name cannot be null.");
        return null;
    }

    /* renamed from: a */
    public final Cursor mo46471a(String[] strArr, String str, String str2, long j, bxvd bxvd) {
        String str3;
        List<ContentValues> a;
        List<ContentValues> a2;
        List<ContentValues> a3;
        List<ContentValues> a4;
        List<ContentValues> a5;
        List<ContentValues> a6;
        List<ContentValues> a7;
        List<ContentValues> a8;
        List<ContentValues> a9;
        List<ContentValues> a10;
        List<ContentValues> a11;
        List<ContentValues> a12;
        List<ContentValues> a13;
        List b;
        List a14;
        List a15;
        List a16;
        List a17;
        String[] strArr2 = strArr;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        bxvd bxvd2 = bxvd;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 39 + String.valueOf(str).length());
        sb.append("handleContact(");
        sb.append(str5);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        sb.toString();
        if (str4 != null) {
            Account a18 = mo46470a(str5, bxvd2);
            if (a18 == null) {
                return new MatrixCursor(strArr2);
            }
            btcy btcy = (btcy) btcz.f148362g.mo74144da();
            bxvd da = btea.f148482d.mo74144da();
            bxvd a19 = ampu.m63153a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btcb btcb = (btcb) a19.mo74062i();
            btcb.getClass();
            ((btea) da.f164949b).f148484a = btcb;
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            btea btea = (btea) da.mo74062i();
            btea.getClass();
            ((btcz) btcy.f164949b).f148367d = btea;
            btef btef = (btef) bteh.f148502d.mo74144da();
            bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
            bxuv.mo73906a("person.name");
            bxuv.mo73906a("person.about");
            bxuv.mo73906a("person.nickname");
            bxuv.mo73906a("person.birthday");
            bxuv.mo73906a("person.gender");
            bxuv.mo73906a("person.occupation");
            bxuv.mo73906a("person.other_keyword");
            bxuv.mo73906a("person.email");
            bxuv.mo73906a("person.address");
            bxuv.mo73906a("person.im");
            bxuv.mo73906a("person.organization");
            bxuv.mo73906a("person.contact_group_membership");
            bxuv.mo73906a("person.interest");
            bxuv.mo73906a("person.user_defined");
            bxuv.mo73906a("person.language");
            bxuv.mo73906a("person.external_id");
            bxuv.mo73906a("person.phone");
            bxuv.mo73906a("person.website");
            bxuv.mo73906a("person.relation");
            bxuv.mo73906a("person.event");
            bxuv.mo73906a("person.sip_address");
            bxuv.mo73906a("person.client_data");
            bxuv.mo73906a("person.photo");
            if (btef.f164950c) {
                btef.mo74035c();
                btef.f164950c = false;
            }
            bxuw bxuw = (bxuw) bxuv.mo74062i();
            bxuw.getClass();
            ((bteh) btef.f164949b).f148504a = bxuw;
            btef.mo70751a(btei.DOMAIN_PROFILE);
            btef.mo70751a(btei.PROFILE);
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            bteh bteh = (bteh) btef.mo74062i();
            bteh.getClass();
            ((btcz) btcy.f164949b).f148365b = bteh;
            btcy.mo70740a(str4);
            try {
                btdb a20 = this.f82041a.mo41249a(mo46472a(a18), (btcz) btcy.mo74062i());
                if (!a20.f148372a.isEmpty() && ((btec) a20.f148372a.get(0)).f148492a != null) {
                    bler bler = ((btec) a20.f148372a.get(0)).f148492a;
                    if (bler == null) {
                        bler = bler.f126245D;
                    }
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < strArr2.length; i++) {
                        hashMap.put(strArr2[i], Integer.valueOf(i));
                    }
                    ArrayList arrayList = new ArrayList();
                    String str6 = bler.f126252b;
                    alse alse = alse.f74192a;
                    if (!bler.f126254d.isEmpty() && (a17 = alse.mo40675a(bler.f126254d, str6)) != null && !a17.isEmpty()) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) a17.get(0), j2));
                    }
                    if (!bler.f126259i.isEmpty() && (a16 = alse.mo40675a(bler.f126259i, str6)) != null && !a16.isEmpty()) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) a16.get(0), j2));
                    }
                    if (!bler.f126262l.isEmpty() && (a15 = alse.mo40675a(bler.f126262l, str6)) != null && !a15.isEmpty()) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) a15.get(0), j2));
                    }
                    if (!bler.f126261k.isEmpty() && (a14 = alse.mo40675a(bler.f126261k, str6)) != null && !a14.isEmpty()) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) a14.get(0), j2));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    amww.m63586a(bler.f126256f, bler.f126262l, bler.f126264n, bler.f126273w, arrayList2, arrayList3);
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) arrayList3.get(i2), j2));
                    }
                    if (!bler.f126257g.isEmpty() && (b = alse.m61631b(bler.f126257g, str6)) != null && !b.isEmpty()) {
                        int size2 = b.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList.add(amqa.m63155a(hashMap, (ContentValues) b.get(i3), j2));
                        }
                    }
                    if (!bler.f126265o.isEmpty() && (a13 = alse.mo40675a(bler.f126265o, str6)) != null && !a13.isEmpty()) {
                        for (ContentValues contentValues : a13) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues, j2));
                        }
                    }
                    if (!bler.f126267q.isEmpty() && (a12 = alse.mo40675a(bler.f126267q, str6)) != null && !a12.isEmpty()) {
                        for (ContentValues contentValues2 : a12) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues2, j2));
                        }
                    }
                    if (!bler.f126263m.isEmpty() && (a11 = alse.mo40675a(bler.f126263m, str6)) != null && !a11.isEmpty()) {
                        for (ContentValues contentValues3 : a11) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues3, j2));
                        }
                    }
                    if (!bler.f126249C.isEmpty() && (a10 = alse.mo40675a(bler.f126249C, str6)) != null && !a10.isEmpty()) {
                        for (ContentValues contentValues4 : a10) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues4, j2));
                        }
                    }
                    if (!bler.f126272v.isEmpty() && (a9 = alse.mo40675a(bler.f126272v, str6)) != null && !a9.isEmpty()) {
                        for (ContentValues contentValues5 : a9) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues5, j2));
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        arrayList.add(amqa.m63155a(hashMap, (ContentValues) arrayList2.get(i4), j2));
                    }
                    if (!bler.f126269s.isEmpty() && (a8 = alse.mo40675a(bler.f126269s, str6)) != null && !a8.isEmpty()) {
                        for (ContentValues contentValues6 : a8) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues6, j2));
                        }
                    }
                    if (!bler.f126275y.isEmpty() && (a7 = alse.mo40675a(bler.f126275y, str6)) != null && !a7.isEmpty()) {
                        for (ContentValues contentValues7 : a7) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues7, j2));
                        }
                    }
                    if (!bler.f126276z.isEmpty() && (a6 = alse.mo40675a(bler.f126276z, str6)) != null && !a6.isEmpty()) {
                        for (ContentValues contentValues8 : a6) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues8, j2));
                        }
                    }
                    if (!bler.f126258h.isEmpty() && (a5 = alse.mo40675a(bler.f126258h, str6)) != null && !a5.isEmpty()) {
                        for (ContentValues contentValues9 : a5) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues9, j2));
                        }
                    }
                    if (!bler.f126260j.isEmpty() && (a4 = alse.mo40675a(bler.f126260j, str6)) != null && !a4.isEmpty()) {
                        for (ContentValues contentValues10 : a4) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues10, j2));
                        }
                    }
                    if (!bler.f126266p.isEmpty() && (a3 = alse.mo40675a(bler.f126266p, str6)) != null && !a3.isEmpty()) {
                        for (ContentValues contentValues11 : a3) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues11, j2));
                        }
                    }
                    if (!bler.f126268r.isEmpty() && (a2 = alse.mo40675a(bler.f126268r, str6)) != null && !a2.isEmpty()) {
                        for (ContentValues contentValues12 : a2) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues12, j2));
                        }
                    }
                    if (!bler.f126271u.isEmpty() && (a = alse.mo40675a(bler.f126271u, str6)) != null && !a.isEmpty()) {
                        for (ContentValues contentValues13 : a) {
                            arrayList.add(amqa.m63155a(hashMap, contentValues13, j2));
                        }
                    }
                    List a21 = amww.m63585a((bldk[]) bler.f126247A.toArray(new bldk[0]));
                    if (a21 != null && !a21.isEmpty()) {
                        int size4 = a21.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            arrayList.add(amqa.m63155a(hashMap, (ContentValues) a21.get(i5), j2));
                        }
                    }
                    MatrixCursor matrixCursor = null;
                    String str7 = null;
                    if (!arrayList.isEmpty()) {
                        Object[] objArr = (Object[]) arrayList.get(0);
                        amqa.m63154a(objArr, hashMap, "contact_id", Long.valueOf(j));
                        Pair a22 = ampt.m63151a(bler);
                        if (a22 != null) {
                            String a23 = ampt.m63152a(bler, (String) a22.first);
                            amqa.m63154a(objArr, hashMap, "display_name", a22.first);
                            amqa.m63154a(objArr, hashMap, "display_name_source", a22.second);
                            amqa.m63154a(objArr, hashMap, "display_name_alt", a23);
                        }
                        amqa.m63154a(objArr, hashMap, "account_type", "com.google");
                        amqa.m63154a(objArr, hashMap, "account_name", str5);
                        amqa.m63154a(objArr, hashMap, "raw_contact_is_read_only", 1);
                        amqa.m63154a(objArr, hashMap, "is_read_only", 1);
                        if (m68189a(bler)) {
                            Uri a24 = m68188a(str5, false, bler.f126252b);
                            if (a24 != null) {
                                str3 = a24.toString();
                            } else {
                                str3 = null;
                            }
                            amqa.m63154a(objArr, hashMap, "photo_uri", str3);
                            Uri a25 = m68188a(str5, true, bler.f126252b);
                            if (a25 != null) {
                                str7 = a25.toString();
                            }
                            amqa.m63154a(objArr, hashMap, "photo_thumb_uri", str7);
                        }
                        matrixCursor = new MatrixCursor(strArr2, arrayList.size());
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            Object[] objArr2 = (Object[]) arrayList.get(i6);
                            if (objArr2 != null) {
                                amqa.m63154a(objArr2, hashMap, "data_id", Integer.valueOf(i6 + 1));
                                matrixCursor.addRow(objArr2);
                            }
                        }
                    }
                    if (matrixCursor != null) {
                        int count = matrixCursor.getCount();
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        amlc amlc = (amlc) bxvd2.f164949b;
                        amlc amlc2 = amlc.f75159h;
                        amlc.f75161a |= 32;
                        amlc.f75167g = count;
                    }
                    return matrixCursor;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 44);
                sb2.append("Can't find person: ");
                sb2.append(str5);
                sb2.append(" for the given lookup key");
                Log.e("PeopleGalProvider", sb2.toString());
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                amlc amlc3 = (amlc) bxvd2.f164949b;
                amlc amlc4 = amlc.f75159h;
                amlc3.f75163c = 7;
                amlc3.f75161a |= 2;
                return new MatrixCursor(strArr2);
            } catch (gid e) {
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                amlc amlc5 = (amlc) bxvd2.f164949b;
                amlc amlc6 = amlc.f75159h;
                amlc5.f75163c = 3;
                amlc5.f75161a |= 2;
                String valueOf = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb3.append("Error getPeople grpc response: ");
                sb3.append(valueOf);
                Log.e("PeopleGalProvider", sb3.toString());
                return new MatrixCursor(strArr2);
            } catch (chuw e2) {
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                amlc amlc7 = (amlc) bxvd2.f164949b;
                amlc amlc8 = amlc.f75159h;
                amlc7.f75163c = 14;
                int i7 = amlc7.f75161a | 2;
                amlc7.f75161a = i7;
                int i8 = e2.f189236a.f189233s.f189211r;
                amlc7.f75161a = i7 | 16;
                amlc7.f75166f = i8;
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb4.append("Error getPeople grpc response: ");
                sb4.append(valueOf2);
                Log.e("PeopleGalProvider", sb4.toString());
                return new MatrixCursor(strArr2);
            }
        } else {
            Log.e("PeopleGalProvider", "lookup key cannot be null.");
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            amlc amlc9 = (amlc) bxvd2.f164949b;
            amlc amlc10 = amlc.f75159h;
            amlc9.f75163c = 6;
            amlc9.f75161a |= 2;
            return new MatrixCursor(strArr2);
        }
    }

    /* renamed from: a */
    public final ClientContext mo46472a(Account account) {
        ClientContext a = ampi.m63122a(this.f82044e, account);
        if (this.f82041a == null) {
            Context context = this.f82044e;
            this.f82041a = ampm.m63135a(context, context.getApplicationInfo().uid);
        }
        return a;
    }
}
