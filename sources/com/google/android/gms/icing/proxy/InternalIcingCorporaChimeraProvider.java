package com.google.android.gms.icing.proxy;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.appdatasearch.CorpusStatus;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalIcingCorporaChimeraProvider extends aclf {

    /* renamed from: a */
    static final Uri.Builder f79077a;

    /* renamed from: b */
    public static final Uri f79078b;

    /* renamed from: c */
    private ftw f79079c;

    /* renamed from: d */
    private UriMatcher f79080d;

    /* renamed from: e */
    private AtomicBoolean f79081e;

    static {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority("com.google.android.gms.icing.proxy");
        f79077a = authority;
        f79078b = authority.path("contacts").build();
        f79077a.path("request_indexing").build();
        f79077a.path("dump").build();
        f79077a.path("diagnose").build();
    }

    /* renamed from: f */
    public static boolean m66711f() {
        return rfy.m33543a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A[Catch:{ RuntimeException -> 0x0111, all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0 A[Catch:{ RuntimeException -> 0x0111, all -> 0x013e }] */
    /* renamed from: a */
    public final Cursor mo32837a(Uri uri, String[] strArr) {
        int i;
        String str;
        int i2;
        Uri uri2 = uri;
        acnv.m49555d("query(uri=%s)", uri2);
        int callingUid = Binder.getCallingUid();
        if (callingUid == Process.myUid()) {
            int match = this.f79080d.match(uri2);
            char c = 0;
            if (match == 3) {
                boolean equals = strArr[0].equals(String.valueOf(Boolean.TRUE));
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                printWriter.println("InternalIcingCorporaProvider:");
                acnl g = mo43415g();
                SQLiteDatabase readableDatabase = g.getReadableDatabase();
                acng.m49500a(printWriter, "  ", "Max seqnos:");
                bnrd a = acnk.f60240e.iterator();
                while (a.hasNext()) {
                    ftz b = ((acnk) a.next()).mo32910b();
                    Object[] objArr = new Object[5];
                    objArr[c] = "  ";
                    objArr[1] = "  ";
                    objArr[2] = b.f17242a;
                    objArr[3] = ": ";
                    objArr[4] = Long.valueOf(g.mo11317b(b));
                    acng.m49500a(printWriter, objArr);
                    c = 0;
                }
                acng.m49500a(printWriter, new Object[0]);
                acmn acmn = g.f60245e;
                if (acmn == null) {
                    acng.m49500a(printWriter, "  ", "ContactsHelper not loaded (potentially failed).");
                    i = 1;
                } else {
                    if (!equals) {
                        str = "simple";
                    } else {
                        str = "extensive";
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 18);
                    sb.append("ContactsHelper (");
                    sb.append(str);
                    sb.append("):");
                    acng.m49500a(printWriter, "  ", sb.toString());
                    try {
                        int a2 = acms.m49459a(readableDatabase, "contacts");
                        StringBuilder sb2 = new StringBuilder(26);
                        sb2.append("Contact count: ");
                        sb2.append(a2);
                        acng.m49500a(printWriter, "    ", sb2.toString());
                        int a3 = acms.m49459a(readableDatabase, "emails");
                        StringBuilder sb3 = new StringBuilder(24);
                        sb3.append("Email count: ");
                        sb3.append(a3);
                        acng.m49500a(printWriter, "    ", sb3.toString());
                        int a4 = acms.m49459a(readableDatabase, "phones");
                        StringBuilder sb4 = new StringBuilder(24);
                        sb4.append("Phone count: ");
                        sb4.append(a4);
                        acng.m49500a(printWriter, "    ", sb4.toString());
                        int a5 = acms.m49459a(readableDatabase, "postals");
                        StringBuilder sb5 = new StringBuilder(25);
                        sb5.append("Postal count: ");
                        sb5.append(a5);
                        acng.m49500a(printWriter, "    ", sb5.toString());
                        acng.m49500a(printWriter, "    ", "Last delta update timestamp: ", acng.m49498a(((acms) acmn).mo32895a().getLong("key_last_contacts_delta_delete_timestamp", 0)));
                        acng.m49500a(printWriter, "    ", "Last delta delete timestamp: ", acng.m49498a(((acms) acmn).mo32895a().getLong("key_last_contacts_delta_update_timestamp", 0)));
                        acng.m49500a(printWriter, new Object[0]);
                        if (equals) {
                            acng.m49499a(readableDatabase, "    ", printWriter, "contacts");
                            acng.m49499a(readableDatabase, "    ", printWriter, "emails");
                            acng.m49499a(readableDatabase, "    ", printWriter, "phones");
                            acng.m49499a(readableDatabase, "    ", printWriter, "postals");
                            i = 1;
                        } else {
                            i = 1;
                        }
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                        sb6.append("Exception while dumping state");
                        sb6.append(valueOf);
                        i = 1;
                        acng.m49500a(printWriter, "    ", sb6.toString());
                    }
                }
                UpdateIcingCorporaIntentOperation.m66727a(getContext(), "  ", printWriter);
                String[] strArr2 = new String[i];
                strArr2[0] = "dump";
                MatrixCursor matrixCursor = new MatrixCursor(strArr2);
                Object[] objArr2 = new Object[i];
                objArr2[0] = stringWriter.toString();
                matrixCursor.addRow(objArr2);
                return matrixCursor;
            } else if (match != 4) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf2).length() + 13);
                sb7.append("illegal uri: ");
                sb7.append(valueOf2);
                throw new IllegalArgumentException(sb7.toString());
            } else if (this.f79081e.compareAndSet(false, true)) {
                try {
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"corpus", "diagnostic"});
                    bnrd a6 = acnk.f60240e.iterator();
                    while (a6.hasNext()) {
                        acnk acnk = (acnk) a6.next();
                        acnl g2 = mo43415g();
                        ftz b2 = acnk.mo32910b();
                        if (Arrays.asList(g2.f17227c.f17229b).contains(b2)) {
                            aucb b3 = g2.f17226b.mo47488b(g2.f17225a.getPackageName(), b2.f17242a);
                            try {
                                aucu.m76782a(b3);
                                CorpusStatus corpusStatus = (CorpusStatus) b3.mo50386d();
                                if (corpusStatus.f9523a) {
                                    long b4 = g2.mo11317b(b2);
                                    long j = corpusStatus.f9524b;
                                    if (b4 != 0) {
                                        if (b4 < j) {
                                            StringBuilder sb8 = new StringBuilder(88);
                                            sb8.append("Local highest seqno=");
                                            sb8.append(b4);
                                            sb8.append(" less than lastIndexedSeqno=");
                                            sb8.append(j);
                                            Log.e("AppDataSearchHelper", sb8.toString());
                                            i2 = 4;
                                        } else if (b4 != j) {
                                            i2 = j != 0 ? 1 : 2;
                                        }
                                    }
                                    i2 = 0;
                                } else {
                                    i2 = 3;
                                }
                            } catch (ExecutionException e2) {
                                String valueOf3 = String.valueOf(b2.f17242a);
                                Log.e("AppDataSearchHelper", valueOf3.length() != 0 ? new String("Couldn't fetch status for corpus ") : "Couldn't fetch status for corpus ".concat(valueOf3));
                                i2 = 4;
                                matrixCursor2.addRow(new Object[]{acnk.mo32909a(), Integer.valueOf(i2)});
                            } catch (InterruptedException e3) {
                                String valueOf32 = String.valueOf(b2.f17242a);
                                Log.e("AppDataSearchHelper", valueOf32.length() != 0 ? new String("Couldn't fetch status for corpus ") : "Couldn't fetch status for corpus ".concat(valueOf32));
                                i2 = 4;
                                matrixCursor2.addRow(new Object[]{acnk.mo32909a(), Integer.valueOf(i2)});
                            }
                            matrixCursor2.addRow(new Object[]{acnk.mo32909a(), Integer.valueOf(i2)});
                        } else {
                            String str2 = b2.f17242a;
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str2).length() + 57);
                            sb9.append("The table ");
                            sb9.append(str2);
                            sb9.append(" does not have a registered CorpusTableMapping.");
                            throw new IllegalArgumentException(sb9.toString());
                        }
                    }
                    this.f79081e.set(false);
                    return matrixCursor2;
                } catch (RuntimeException e4) {
                    acnv.m49544a(e4, "Exception thrown from diagnoseTable", new Object[0]);
                    if (rfy.m33543a()) {
                        i2 = 4;
                    } else {
                        throw e4;
                    }
                } catch (Throwable th) {
                    this.f79081e.set(false);
                    throw th;
                }
            } else {
                acnv.m49556e("Diagnose returning early - external call pending");
                return null;
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf4).length() + 39);
            sb10.append("No access to query ");
            sb10.append(valueOf4);
            sb10.append(" for uid ");
            sb10.append(callingUid);
            throw new SecurityException(sb10.toString());
        }
    }

    /* renamed from: c */
    public final boolean mo32838c() {
        this.f79080d = new UriMatcher(-1);
        this.f79081e = new AtomicBoolean();
        this.f79080d.addURI("com.google.android.gms.icing.proxy", "contacts", 1);
        this.f79080d.addURI("com.google.android.gms.icing.proxy", "request_indexing", 2);
        this.f79080d.addURI("com.google.android.gms.icing.proxy", "dump", 3);
        this.f79080d.addURI("com.google.android.gms.icing.proxy", "diagnose", 4);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ftw mo32839d() {
        if (this.f79079c == null) {
            this.f79079c = new ftw("com.google.android.gms.icing.proxy", acnm.m49518a());
        }
        return this.f79079c;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final String mo32840e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final acnl mo43415g() {
        return acnl.m49509a(getContext());
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair pair;
        acnv.m49555d("update(uri=%s)", uri);
        int callingUid = Binder.getCallingUid();
        if (callingUid == Process.myUid()) {
            int match = this.f79080d.match(uri);
            if (match != -1) {
                boolean z = true;
                if (match != 2) {
                    acnl g = mo43415g();
                    SQLiteDatabase f = g.mo32915f();
                    if (f == null) {
                        return -1;
                    }
                    if (match == 1) {
                        Resources resources = getContext().getResources();
                        if (g.mo32914e() == null) {
                            acnv.m49541a("ContactsHelper failed to load.");
                            pair = new Pair(-1, false);
                        } else {
                            if ("delta".equals(str)) {
                                pair = g.mo32914e().mo32883b(f, resources);
                            } else if ("ids".equals(str) && strArr != null) {
                                HashSet hashSet = new HashSet();
                                for (String str2 : strArr) {
                                    hashSet.add(Long.valueOf(Long.parseLong(str2)));
                                }
                                pair = g.mo32914e().mo32882a(f, resources, hashSet);
                            } else if (str == null) {
                                pair = g.mo32914e().mo32881a(f, resources);
                            } else {
                                throw new IllegalArgumentException("unrecognized selection");
                            }
                            g.mo32912a(((Integer) pair.first).intValue(), acnm.f60246a.mo32919c());
                            g.mo32912a(((Integer) pair.first).intValue(), acnm.f60247b.mo32919c());
                            g.mo32912a(((Integer) pair.first).intValue(), acnm.f60248c.mo32919c());
                            g.mo32912a(((Integer) pair.first).intValue(), acnm.f60249d.mo32919c());
                        }
                        int intValue = ((Integer) pair.first).intValue();
                        boolean booleanValue = ((Boolean) pair.second).booleanValue();
                        boolean booleanValue2 = ((Boolean) abzt.f58898am.mo58455c()).booleanValue();
                        acnv.m49553c("InternalIcingCorporaChimeraProvider.update numUpdate = %d isSignificant = %b G.sendContactChangedBroadcastNoUpdates = %b", Integer.valueOf(intValue), Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
                        if (intValue <= 0 && !booleanValue2) {
                            acnv.m49554d("InternalIcingCorporaChimeraProvider doesn't send contact changed broadcast");
                        } else {
                            acnv.m49554d("InternalIcingCorporaChimeraProvider sending contact changed broadcast");
                            sbv.m34876a(getContext(), booleanValue);
                        }
                        return intValue;
                    }
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("unhandled match for uri ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else if (this.f79081e.compareAndSet(false, true)) {
                    try {
                        ftz[] a = acnm.m49518a();
                        for (ftz ftz : a) {
                            String valueOf2 = String.valueOf(ftz);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                            sb2.append("Requesting indexing: ");
                            sb2.append(valueOf2);
                            acnv.m49541a(sb2.toString());
                            z &= mo43415g().mo32913c(ftz);
                        }
                        if (!z) {
                            acnv.m49556e("Request indexing failed");
                        }
                        return 0;
                    } finally {
                        this.f79081e.set(false);
                    }
                } else {
                    acnv.m49556e("Request indexing returning early - external call pending");
                    return 0;
                }
            } else {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 13);
                sb3.append("invalid uri: ");
                sb3.append(valueOf3);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
            sb4.append("No access to update ");
            sb4.append(valueOf4);
            sb4.append(" for uid ");
            sb4.append(callingUid);
            throw new SecurityException(sb4.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ftv mo32834a() {
        return mo43415g();
    }
}
