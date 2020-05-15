package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: aepp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepp {

    /* renamed from: a */
    private static final bmyx f63606a = bmyx.m108643a(",").mo66917a();

    /* renamed from: a */
    public static void m52352a(Context context, long j) {
        aepq.m52369b(context.getContentResolver(), "lowdLastDisplayedMillis", j);
    }

    /* renamed from: b */
    public static long m52356b(Context context) {
        return aepq.m52363a(context.getContentResolver(), "lowdLastDisplayedMillis", -9223372036854775807L);
    }

    /* renamed from: c */
    public static long m52358c(Context context) {
        return aepq.m52363a(context.getContentResolver(), "lowdCurrentBackoffDurationMillis", 0);
    }

    /* renamed from: d */
    public static Iterable m52360d(Context context) {
        return bqcq.f140484a.mo66860a(f63606a.mo66918a((CharSequence) aepq.m52365a(context.getContentResolver(), "nanoAppIds", 0, "")));
    }

    /* renamed from: e */
    public static void m52362e(Context context) {
        int i = Build.VERSION.SDK_INT;
        aepq.m52368b(context.getContentResolver(), "nlpPromptConsent");
    }

    /* renamed from: a */
    public static void m52353a(Context context, long j, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        aepq.m52366a(contentResolver, sb.toString(), uri.toString());
    }

    /* renamed from: b */
    public static void m52357b(Context context, long j) {
        aepq.m52369b(context.getContentResolver(), "lowdCurrentBackoffDurationMillis", j);
    }

    /* renamed from: c */
    public static Uri m52359c(Context context, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        String a = aepq.m52365a(contentResolver, sb.toString(), 0, null);
        if (a != null) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: a */
    public static void m52354a(Context context, Iterable iterable) {
        aepq.m52366a(context.getContentResolver(), "nanoAppIds", TextUtils.join(",", iterable));
    }

    /* renamed from: a */
    public static boolean m52355a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return aepq.m52367a(context.getContentResolver(), "nlpPromptConsent");
    }

    /* renamed from: d */
    public static void m52361d(Context context, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        contentResolver.call(aepq.f63607a, "remove", sb.toString(), (Bundle) null);
    }
}
