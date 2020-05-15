package p000;

import android.content.Context;
import android.os.Binder;

/* renamed from: ryv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryv {

    /* renamed from: a */
    public final Context f43865a;

    public ryv(Context context) {
        sdo.m34959a(context);
        this.f43865a = context;
    }

    /* renamed from: a */
    public static long m34678a(rtc rtc) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return ((Long) rtc.mo25081c()).longValue();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* renamed from: b */
    public static long m34682b(Context context, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return aymn.m84261a(context.getContentResolver(), str, 0L);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public static String m34679a(Context context) {
        return Long.toHexString(m34682b(context, "android_id"));
    }

    /* renamed from: a */
    public static String m34680a(Context context, String str) {
        return m34681a(context, str, null);
    }

    /* renamed from: a */
    public static String m34681a(Context context, String str, String str2) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return aymn.m84265a(context.getContentResolver(), str, str2);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
