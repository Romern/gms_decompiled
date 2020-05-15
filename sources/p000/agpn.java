package p000;

import android.content.ContentValues;

/* renamed from: agpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agpn extends agps {

    /* renamed from: a */
    private final ContentValues f66248a;

    public agpn(ContentValues contentValues) {
        this.f66248a = contentValues;
    }

    /* renamed from: a */
    public final ContentValues mo35868a() {
        return this.f66248a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agps) {
            return this.f66248a.equals(((agps) obj).mo35868a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66248a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66248a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("CarrierTableRowSet{contentValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
