package com.google.android.gms.icing.proxy;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsChimeraContentProvider extends aclf {

    /* renamed from: a */
    public static final ftw f79082a;

    /* renamed from: b */
    private static final String[] f79083b = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read", "content_type", "media_uri"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fty.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      fty.a(java.lang.String, java.lang.String):void
      fty.a(java.lang.String, boolean):void */
    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.sms/appdatasearch/sms");
        fty a = ftz.m12397a();
        a.mo11331b("mmssms");
        a.mo11328a("sms");
        a.mo11330a("uri", false);
        a.f17239g = "score";
        a.f17240h = "date";
        if (!TextUtils.isEmpty("mmssms_tag")) {
            a.f17236d = "mmssms_tag";
            if (!TextUtils.isEmpty("tag")) {
                a.f17238f = "tag";
                String[] strArr = f79083b;
                for (String str : strArr) {
                    a.mo11329a(str, str);
                }
                f79082a = new ftw("com.google.android.gms.icing.proxy.sms", new ftz[]{a.mo11327a()});
                return;
            }
            throw new IllegalArgumentException("A valid tagCol must be supplied");
        }
        throw new IllegalArgumentException("A valid tagTableName must be supplied");
    }

    /* renamed from: a */
    public final Cursor mo32837a(Uri uri, String[] strArr) {
        return null;
    }

    /* renamed from: c */
    public final boolean mo32838c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ftw mo32839d() {
        return f79082a;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final String mo32840e() {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ftv mo32834a() {
        acom a;
        synchronized (this) {
            a = acom.m49611a(getContext(), f79082a);
        }
        return a;
    }
}
