package p000;

import android.net.Uri;

/* renamed from: baxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxc extends baxh {

    /* renamed from: a */
    public final Uri f102016a;

    /* renamed from: b */
    public final String f102017b;

    /* renamed from: c */
    public final baxf f102018c;

    /* renamed from: d */
    public final int f102019d;

    /* renamed from: e */
    public final bngx f102020e;

    public baxc(Uri uri, String str, baxf baxf, int i, bngx bngx) {
        this.f102016a = uri;
        this.f102017b = str;
        this.f102018c = baxf;
        this.f102019d = i;
        this.f102020e = bngx;
    }

    /* renamed from: a */
    public final Uri mo56007a() {
        return this.f102016a;
    }

    /* renamed from: b */
    public final String mo56008b() {
        return this.f102017b;
    }

    /* renamed from: c */
    public final baxf mo56009c() {
        return this.f102018c;
    }

    /* renamed from: d */
    public final int mo56010d() {
        return this.f102019d;
    }

    /* renamed from: e */
    public final bngx mo56011e() {
        return this.f102020e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxh) {
            baxh baxh = (baxh) obj;
            return this.f102016a.equals(baxh.mo56007a()) && this.f102017b.equals(baxh.mo56008b()) && this.f102018c.equals(baxh.mo56009c()) && this.f102019d == baxh.mo56010d() && bnkn.m109669a(this.f102020e, baxh.mo56011e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f102016a.hashCode() ^ 1000003) * 1000003) ^ this.f102017b.hashCode()) * 1000003) ^ this.f102018c.hashCode()) * 1000003) ^ this.f102019d) * 1000003) ^ this.f102020e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102016a);
        String str = this.f102017b;
        String valueOf2 = String.valueOf(this.f102018c);
        int i = this.f102019d;
        String valueOf3 = String.valueOf(this.f102020e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 106 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DownloadRequest{fileUri=");
        sb.append(valueOf);
        sb.append(", urlToDownload=");
        sb.append(str);
        sb.append(", downloadConstraints=");
        sb.append(valueOf2);
        sb.append(", trafficTag=");
        sb.append(i);
        sb.append(", extraHttpHeaders=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
