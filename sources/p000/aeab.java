package p000;

import android.net.Uri;

/* renamed from: aeab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeab {

    /* renamed from: a */
    public final Uri f62977a;

    /* renamed from: b */
    public final int f62978b;

    public aeab(Uri uri, int i) {
        this.f62977a = uri;
        this.f62978b = i;
    }

    /* renamed from: a */
    public final boolean mo33968a() {
        return (this.f62978b & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeab) {
            aeab aeab = (aeab) obj;
            Uri uri = this.f62977a;
            if (uri != null) {
                if (!uri.equals(aeab.f62977a) || aeab.f62978b != this.f62978b) {
                    return false;
                }
                return true;
            } else if (aeab.f62977a == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f62977a;
        return (uri != null ? uri.hashCode() : 0) ^ this.f62978b;
    }
}
