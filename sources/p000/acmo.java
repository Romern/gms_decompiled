package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: acmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acmo {

    /* renamed from: a */
    public final ContentValues f60161a;

    /* renamed from: b */
    public final ContentValues f60162b;

    /* renamed from: c */
    public final Map f60163c;

    /* renamed from: d */
    public final Map f60164d;

    /* renamed from: e */
    public final Map f60165e;

    public acmo(ContentValues contentValues, ContentValues contentValues2, Map map, Map map2, Map map3) {
        sdo.m34959a(contentValues);
        this.f60161a = contentValues;
        this.f60162b = contentValues2;
        sdo.m34959a(map);
        this.f60163c = map;
        sdo.m34959a(map2);
        this.f60164d = map2;
        sdo.m34959a(map3);
        this.f60165e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acmo) {
            acmo acmo = (acmo) obj;
            return this.f60161a.equals(acmo.f60161a) && this.f60163c.equals(acmo.f60163c) && this.f60164d.equals(acmo.f60164d) && this.f60165e.equals(acmo.f60165e);
        }
    }

    public final int hashCode() {
        return ((((((this.f60161a.hashCode() + 527) * 31) + this.f60163c.hashCode()) * 31) + this.f60164d.hashCode()) * 31) + this.f60165e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f60161a);
        String valueOf2 = String.valueOf(this.f60162b);
        String valueOf3 = String.valueOf(this.f60163c);
        String valueOf4 = String.valueOf(this.f60164d);
        String valueOf5 = String.valueOf(this.f60165e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ContactData[contactValues=");
        sb.append(valueOf);
        sb.append(", interactionValues=");
        sb.append(valueOf2);
        sb.append(", emailValues=");
        sb.append(valueOf3);
        sb.append(", phoneValues=");
        sb.append(valueOf4);
        sb.append(", postalValues=");
        sb.append(valueOf5);
        sb.append("]");
        return sb.toString();
    }
}
