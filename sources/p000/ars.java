package p000;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ars */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ars {

    /* renamed from: a */
    public final AtomicInteger f2096a = new AtomicInteger(0);

    /* renamed from: b */
    public volatile arr f2097b;

    /* renamed from: c */
    public volatile long f2098c = 0;

    /* renamed from: d */
    public volatile long f2099d = 0;

    public ars(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("resourceName cannot be empty or null!");
        }
    }
}
