package p000;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: ahhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhg {
    /* renamed from: a */
    public static String m55779a() {
        String h = spn.m35894h();
        return (TextUtils.isEmpty(h) || "unknown".equals(h)) ? UUID.randomUUID().toString() : h;
    }
}
