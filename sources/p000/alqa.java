package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: alqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqa {

    /* renamed from: a */
    public final ContentValues f74049a;

    /* renamed from: b */
    public final ContentValues f74050b;

    /* renamed from: c */
    public final Map f74051c;

    /* renamed from: d */
    public final Map f74052d;

    /* renamed from: e */
    public final Map f74053e;

    public alqa(ContentValues contentValues, ContentValues contentValues2, Map map, Map map2, Map map3) {
        sdo.m34959a(contentValues);
        this.f74049a = contentValues;
        this.f74050b = contentValues2;
        sdo.m34959a(map);
        this.f74051c = map;
        sdo.m34959a(map2);
        this.f74052d = map2;
        sdo.m34959a(map3);
        this.f74053e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alqa) {
            alqa alqa = (alqa) obj;
            return this.f74049a.equals(alqa.f74049a) && this.f74051c.equals(alqa.f74051c) && this.f74052d.equals(alqa.f74052d) && this.f74053e.equals(alqa.f74053e);
        }
    }

    public final int hashCode() {
        return ((((((this.f74049a.hashCode() + 527) * 31) + this.f74051c.hashCode()) * 31) + this.f74052d.hashCode()) * 31) + this.f74053e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f74049a);
        String valueOf2 = String.valueOf(this.f74050b);
        String valueOf3 = String.valueOf(this.f74051c);
        String valueOf4 = String.valueOf(this.f74052d);
        String valueOf5 = String.valueOf(this.f74053e);
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
