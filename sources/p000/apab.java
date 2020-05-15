package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: apab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apab {

    /* renamed from: a */
    public final ContentValues f83971a;

    /* renamed from: b */
    public final ContentValues f83972b;

    /* renamed from: c */
    public final Map f83973c;

    /* renamed from: d */
    public final Map f83974d;

    /* renamed from: e */
    public final Map f83975e;

    public apab(ContentValues contentValues, ContentValues contentValues2, Map map, Map map2, Map map3) {
        sdo.m34959a(contentValues);
        this.f83971a = contentValues;
        this.f83972b = contentValues2;
        sdo.m34959a(map);
        this.f83973c = map;
        sdo.m34959a(map2);
        this.f83974d = map2;
        sdo.m34959a(map3);
        this.f83975e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof apab) {
            apab apab = (apab) obj;
            return this.f83971a.equals(apab.f83971a) && this.f83973c.equals(apab.f83973c) && this.f83974d.equals(apab.f83974d) && this.f83975e.equals(apab.f83975e);
        }
    }

    public final int hashCode() {
        return ((((((this.f83971a.hashCode() + 527) * 31) + this.f83973c.hashCode()) * 31) + this.f83974d.hashCode()) * 31) + this.f83975e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f83971a);
        String valueOf2 = String.valueOf(this.f83972b);
        String valueOf3 = String.valueOf(this.f83973c);
        String valueOf4 = String.valueOf(this.f83974d);
        String valueOf5 = String.valueOf(this.f83975e);
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
