package p000;

import android.content.ContentValues;

/* renamed from: agpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agpq extends agpy {

    /* renamed from: a */
    private final ContentValues f66251a;

    public agpq(ContentValues contentValues) {
        this.f66251a = contentValues;
    }

    /* renamed from: a */
    public final ContentValues mo35879a() {
        return this.f66251a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpy) {
            return this.f66251a.equals(((agpy) obj).mo35879a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66251a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66251a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("SubscriptionTableRowSet{contentValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
