package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: iju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iju {

    /* renamed from: a */
    public static final AtomicLong f21147a = new AtomicLong(System.currentTimeMillis());

    /* renamed from: b */
    public final aakz f21148b;

    /* renamed from: c */
    public final String f21149c = ((String) igt.f20953c.mo58455c());

    /* renamed from: d */
    public final String f21150d;

    public iju(Context context, String str) {
        this.f21148b = aakz.m21424a(context);
        StringBuilder sb = new StringBuilder(str.length() + 1);
        sb.append(str);
        sb.append(':');
        this.f21150d = sb.toString();
    }
}
