package p000;

import android.util.Log;

/* renamed from: auju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auju {

    /* renamed from: a */
    String f91957a;

    /* renamed from: b */
    int f91958b;

    /* renamed from: c */
    String f91959c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo50601a(String str) {
        if (str != null) {
            boolean c = cgzf.m147724c();
            String[] split = str.split("\\|");
            if (split.length == 5) {
                try {
                    Integer.parseInt(split[0]);
                    this.f91957a = split[1];
                    this.f91958b = Integer.parseInt(split[2]);
                    this.f91959c = !split[3].equals("null") ? split[3] : "";
                    Integer.parseInt(split[4]);
                    return true;
                } catch (NumberFormatException e) {
                    if (c) {
                        Log.w("NotificationKey", "could not parse notification key.", e);
                    }
                    return false;
                }
            } else if (c) {
                Log.w("NotificationKey", str.length() == 0 ? new String("wrong number of parts in notification key: ") : "wrong number of parts in notification key: ".concat(str));
            }
        }
        return false;
    }
}
