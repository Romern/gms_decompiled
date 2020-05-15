package com.google.android.gms.thunderbird.settings.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdSettingsChimeraContentProvider extends auia {

    /* renamed from: a */
    public static final /* synthetic */ int f109070a = 0;

    public ThunderbirdSettingsChimeraContentProvider() {
        super(auhi.f91817a, auhg.f91813a, auhc.f91805d);
    }

    /* renamed from: a */
    public static Object m93359a(Context context, String str) {
        try {
            Bundle call = context.getContentResolver().call(auhi.f91817a, "read", str, (Bundle) null);
            bmxy.m108581a(call);
            Object obj = call.get("value");
            bmxy.m108581a(obj);
            return obj;
        } catch (IllegalStateException e) {
            throw new IOException(e.getCause());
        }
    }

    /* renamed from: a */
    public static void m93360a(Context context, String str, Object obj) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = auhi.f91817a;
        try {
            Bundle bundle = new Bundle();
            auia.m77091a(bundle, obj);
            contentResolver.call(uri, "write", str, bundle);
        } catch (IllegalStateException e) {
            throw new IOException(e.getCause());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bmxj mo50547a(Uri uri, String str, Object obj) {
        return new auhh(uri, obj, str);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50548a(Uri uri, bxxc bxxc) {
        char c;
        auhc auhc = (auhc) bxxc;
        String lastPathSegment = uri.getLastPathSegment();
        int hashCode = lastPathSegment.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode == -1342497116 && lastPathSegment.equals("corruptConfigs")) {
                c = 1;
                if (c == 0) {
                    return Boolean.valueOf(auhc.f91808b);
                }
                if (c == 1) {
                    return auhc.f91809c;
                }
                String valueOf = String.valueOf(uri.getPath());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown path - ") : "Unknown path - ".concat(valueOf));
            }
        } else if (lastPathSegment.equals("enabled")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
