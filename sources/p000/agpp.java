package p000;

import android.content.ContentValues;

/* renamed from: agpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agpp extends agpw {

    /* renamed from: a */
    private final ContentValues f66250a;

    public agpp(ContentValues contentValues) {
        this.f66250a = contentValues;
    }

    /* renamed from: a */
    public final ContentValues mo35876a() {
        return this.f66250a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpw) {
            return this.f66250a.equals(((agpw) obj).mo35876a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66250a.hashCode() ^ 1000003;
    }
}
