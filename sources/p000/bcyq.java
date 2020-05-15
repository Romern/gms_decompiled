package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bcyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyq extends bczh {

    /* renamed from: a */
    private final bcwp f105135a;

    /* renamed from: b */
    private final String f105136b;

    /* renamed from: c */
    private final ByteString f105137c;

    /* renamed from: d */
    private final int f105138d;

    /* renamed from: e */
    private final int f105139e;

    /* renamed from: f */
    private final String f105140f;

    public bcyq(bcwp bcwp, String str, ByteString bxtx, int i, int i2, String str2) {
        this.f105135a = bcwp;
        this.f105136b = str;
        this.f105137c = bxtx;
        this.f105138d = i;
        this.f105139e = i2;
        this.f105140f = str2;
    }

    /* renamed from: a */
    public final bcwp mo57715a() {
        return this.f105135a;
    }

    /* renamed from: b */
    public final String mo57716b() {
        return this.f105136b;
    }

    /* renamed from: c */
    public final ByteString mo57717c() {
        return this.f105137c;
    }

    /* renamed from: d */
    public final int mo57718d() {
        return this.f105138d;
    }

    /* renamed from: e */
    public final int mo57719e() {
        return this.f105139e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczh) {
            bczh bczh = (bczh) obj;
            return this.f105135a.equals(bczh.mo57715a()) && ((str = this.f105136b) == null ? bczh.mo57716b() == null : str.equals(bczh.mo57716b())) && this.f105137c.equals(bczh.mo57717c()) && this.f105138d == bczh.mo57718d() && this.f105139e == bczh.mo57719e() && this.f105140f.equals(bczh.mo57721f());
        }
    }

    /* renamed from: f */
    public final String mo57721f() {
        return this.f105140f;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f105135a.hashCode() ^ 1000003) * 1000003;
        String str = this.f105136b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.f105137c.hashCode()) * 1000003) ^ this.f105138d) * 1000003) ^ this.f105139e) * 1000003) ^ this.f105140f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105135a);
        String str = this.f105136b;
        String valueOf2 = String.valueOf(this.f105137c);
        int i = this.f105138d;
        int i2 = this.f105139e;
        String str2 = this.f105140f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + ErrorInfo.TYPE_SDU_COMMUNICATIONERROR + length2 + length3 + String.valueOf(str2).length());
        sb.append("ImageElement{mediaId=");
        sb.append(valueOf);
        sb.append(", localURI=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", imageDescription=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
