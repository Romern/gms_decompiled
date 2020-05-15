package p000;

import android.net.Uri;

/* renamed from: ajwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwu {

    /* renamed from: a */
    public final String f71465a;

    /* renamed from: b */
    public final Uri f71466b;

    /* renamed from: c */
    public final boolean f71467c;

    public ajwu(String str, Uri uri, boolean z) {
        this.f71465a = str;
        this.f71466b = uri;
        this.f71467c = z;
    }

    public final String toString() {
        return String.format("Profile<name: %s, uri: %s>", this.f71465a, this.f71466b);
    }
}
