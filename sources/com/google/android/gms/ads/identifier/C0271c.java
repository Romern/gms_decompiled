package com.google.android.gms.ads.identifier;

/* renamed from: com.google.android.gms.ads.identifier.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0271c {

    /* renamed from: a */
    public final String f7985a;

    /* renamed from: b */
    public final boolean f7986b;

    public C0271c(String str, boolean z) {
        this.f7985a = str;
        this.f7986b = z;
    }

    public final String toString() {
        String str = this.f7985a;
        boolean z = this.f7986b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
