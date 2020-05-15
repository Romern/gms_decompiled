package com.google.android.gms.icing.appindexing;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppIndexingChimeraContentProvider extends acle {

    /* renamed from: a */
    private acri f79063a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final abrv mo43390a() {
        acri acri = this.f79063a;
        if (acri == null) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext != null && cemq.m137369f()) {
                this.f79063a = acri.m49734a("main", applicationContext);
            }
            acri = this.f79063a;
            if (acri == null) {
                return null;
            }
        }
        return acri.mo33016b();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (getContext() != null && mo43390a() != null) {
            acwz.m49916a(getContext(), printWriter, strArr, mo43390a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* renamed from: a */
    public final Cursor mo32832a(Uri uri, String[] strArr) {
        char c;
        String str;
        Throwable th;
        Uri uri2 = uri;
        abww a = abxn.m48472a(getContext(), uri2);
        String str2 = null;
        if (a == null) {
            return null;
        }
        fsz a2 = fsz.m12266a(strArr);
        absg.m48203d("AppIndexing: Queried by ContentFetcher uri=%s query=%s", uri2, a2);
        String str3 = a.f58662b;
        abvo a3 = abvo.m48336a(getContext().getApplicationContext(), str3);
        if (a3 == null) {
            absg.m48185a("3P AppIndexing disabled for uri %s", uri2);
            return null;
        }
        if (a2.mo11276c()) {
            absg.m48185a("Request to rebuild index for uri %s", uri2);
            try {
                if (TimeUnit.HOURS.convert(System.currentTimeMillis() - getContext().getPackageManager().getPackageInfo(str3, 0).lastUpdateTime, TimeUnit.MILLISECONDS) > 24) {
                    if (!((Boolean) abzt.f58869aJ.mo58455c()).booleanValue()) {
                        absg.m48184a("UPDATE_INDEX intent sending from content provider disabled.");
                    } else {
                        OneoffRebuildIndexChimeraService.m66670a(getContext(), str3, bpzu.ONE_OFF_REASON_REBUILD);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                absg.m48185a("Package %s is not present.", str3);
                return null;
            }
        }
        if (a2.mo11274a()) {
            c = 1;
        } else if (a2.mo11275b()) {
            c = 2;
        } else {
            absg.m48206e("Invalid query: %s", a2);
            return null;
        }
        long j = a2.f17206a;
        long j2 = a2.f17207b;
        SQLiteDatabase readableDatabase = a3.getReadableDatabase();
        if (c != 1) {
            str = " IS NOT NULL";
        } else {
            str = " IS NULL";
        }
        String str4 = str.length() == 0 ? new String("tag") : "tag".concat(str);
        String a4 = abxu.m48513a(a.mo32394a());
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 31);
        sb.append("seqno>");
        sb.append(j);
        sb.append(" AND ");
        sb.append(str4);
        Cursor query = readableDatabase.query(a4, null, sb.toString(), null, null, null, "seqno", Long.toString(j2));
        Cursor query2 = readableDatabase.query("incarnation_indexapi", new String[]{"incarnation"}, "app_name = ?", new String[]{a.f58662b}, null, null, null);
        try {
            if (query2.moveToNext()) {
                str2 = query2.getString(query2.getColumnIndex("incarnation"));
            }
            query2.close();
            if (str2 != null) {
                query = fta.m12292a(query, str2);
            }
            absg.m48203d("Returning document cursor with %d rows. Incarnation %s.", Integer.valueOf(query.getCount()), fta.m12293a(query));
            return query;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    public final String mo32833a(Uri uri) {
        abww a = abxn.m48472a(getContext(), uri);
        if (a == null) {
            return null;
        }
        String valueOf = String.valueOf(a.f58661a.f58531b);
        return valueOf.length() == 0 ? new String("vnd.android.cursor.dir/vnd.") : "vnd.android.cursor.dir/vnd.".concat(valueOf);
    }
}
