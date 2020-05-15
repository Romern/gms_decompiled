package p000;

import android.content.ContentValues;

/* renamed from: agpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agpo extends agpu {

    /* renamed from: a */
    private final ContentValues f66249a;

    public agpo(ContentValues contentValues) {
        this.f66249a = contentValues;
    }

    /* renamed from: a */
    public final ContentValues mo35872a() {
        return this.f66249a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpu) {
            return this.f66249a.equals(((agpu) obj).mo35872a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66249a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66249a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("DeviceTableRowSet{contentValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
