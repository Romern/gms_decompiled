package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: befi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befi {

    /* renamed from: a */
    public static final Pattern f111495a = Pattern.compile("[a-z]+");

    /* renamed from: b */
    static final Account f111496b = befd.f111477a;

    /* renamed from: c */
    public static final Set f111497c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* renamed from: d */
    public static final Set f111498d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    /* renamed from: a */
    public static befh m94962a(Context context) {
        return new befh(context);
    }
}
