package p000;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: azcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcn implements bdae {

    /* renamed from: a */
    private final Context f98997a;

    /* renamed from: b */
    private final long f98998b;

    public azcn(Context context) {
        this.f98998b = -1;
        this.f98997a = context;
    }

    /* renamed from: a */
    private final Uri m85345a(String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(String.valueOf(this.f98997a.getPackageName()).concat(".lighter.data"));
        if (this.f98998b != -1) {
            str2 = "MESSAGING";
        } else {
            str2 = "REGISTRATION";
        }
        builder.appendEncodedPath(str2);
        builder.appendEncodedPath(str);
        long j = this.f98998b;
        if (j != -1) {
            builder.appendEncodedPath(Long.toString(j));
        }
        return builder.build();
    }

    /* renamed from: b */
    public final void mo54679b() {
        Cursor query;
        if (cfgs.m139392L() && (query = this.f98997a.getContentResolver().query(m85345a("END_TRANSACTION"), null, null, null, null)) != null) {
            query.close();
        }
    }

    /* renamed from: c */
    public final boolean mo54680c() {
        if (!cfgs.m139392L()) {
            return true;
        }
        Cursor query = this.f98997a.getContentResolver().query(m85345a("IN_TRANSACTION"), null, null, null, null);
        if (query == null || !query.moveToFirst()) {
            return false;
        }
        boolean equals = TextUtils.equals(query.getString(0), "0");
        query.close();
        return !equals;
    }

    /* renamed from: d */
    public final void mo54681d() {
        Cursor query;
        if (cfgs.m139392L() && (query = this.f98997a.getContentResolver().query(m85345a("TRANSACTION_SUCCESSFUL"), null, null, null, null)) != null) {
            query.close();
        }
    }

    public azcn(Context context, long j) {
        this.f98997a = context;
        this.f98998b = j;
    }

    /* renamed from: a */
    public final int mo54674a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f98997a.getContentResolver().update(uri, contentValues, str, strArr);
    }

    /* renamed from: a */
    public final int mo54675a(Uri uri, String str, String[] strArr) {
        return this.f98997a.getContentResolver().delete(uri, str, strArr);
    }

    /* renamed from: a */
    public final long mo54676a(Uri uri, ContentValues contentValues, int i) {
        Uri insert = this.f98997a.getContentResolver().insert(ContentUris.withAppendedId(uri, (long) i), contentValues);
        if (insert != null) {
            return ContentUris.parseId(insert);
        }
        return -1;
    }

    /* renamed from: a */
    public final Cursor mo54677a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        String str4;
        if (str3 != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + str3.length());
            sb.append(str2);
            sb.append(" LIMIT ");
            sb.append(str3);
            str4 = sb.toString();
        } else {
            str4 = str2;
        }
        return this.f98997a.getContentResolver().query(uri, strArr, str, strArr2, str4);
    }

    /* renamed from: a */
    public final void mo54678a() {
        Cursor query;
        if (cfgs.m139392L() && (query = this.f98997a.getContentResolver().query(m85345a("BEGIN_TRANSACTION"), null, null, null, null)) != null) {
            query.close();
        }
    }
}
