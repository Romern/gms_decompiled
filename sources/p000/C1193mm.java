package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: mm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1193mm {

    /* renamed from: a */
    public final String f26676a;

    /* renamed from: b */
    public final String f26677b;

    /* renamed from: c */
    public final String f26678c;

    /* renamed from: d */
    public final List f26679d;

    /* renamed from: e */
    public final String f26680e = (this.f26676a + "-" + this.f26677b + "-" + this.f26678c);

    public C1193mm(String str, String str2, String str3, List list) {
        C1244oj.m19766a(str);
        this.f26676a = str;
        C1244oj.m19766a(str2);
        this.f26677b = str2;
        C1244oj.m19766a(str3);
        this.f26678c = str3;
        C1244oj.m19766a(list);
        this.f26679d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f26676a + ", mProviderPackage: " + this.f26677b + ", mQuery: " + this.f26678c + ", mCertificates:");
        for (int i = 0; i < this.f26679d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f26679d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
