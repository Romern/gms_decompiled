package p000;

import android.net.Uri;

/* renamed from: ayuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayuk {

    /* renamed from: a */
    public final Uri f98527a;

    public ayuk(Uri uri) {
        this.f98527a = uri;
    }

    /* renamed from: a */
    public final ayuk mo54436a(String str) {
        return new ayuk(this.f98527a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.f98527a.toString();
    }

    /* renamed from: a */
    public final String mo54437a() {
        return this.f98527a.getPath();
    }
}
