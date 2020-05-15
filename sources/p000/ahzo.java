package p000;

/* renamed from: ahzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahzo extends ahzt {

    /* renamed from: b */
    private final ahzs f68478b;

    /* renamed from: c */
    private final String f68479c;

    /* renamed from: d */
    private final String f68480d;

    /* renamed from: e */
    private final ByteString f68481e;

    public ahzo(ahzs ahzs, String str, String str2, ByteString bxtx) {
        this.f68478b = ahzs;
        this.f68479c = str;
        this.f68480d = str2;
        this.f68481e = bxtx;
    }

    /* renamed from: a */
    public final ahzs mo37319a() {
        return this.f68478b;
    }

    /* renamed from: b */
    public final String mo37320b() {
        return this.f68479c;
    }

    /* renamed from: c */
    public final String mo37321c() {
        return this.f68480d;
    }

    /* renamed from: d */
    public final ByteString mo37322d() {
        return this.f68481e;
    }

    public final boolean equals(Object obj) {
        String str;
        ByteString bxtx;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahzt)) {
            return false;
        }
        ahzt ahzt = (ahzt) obj;
        return this.f68478b.equals(ahzt.mo37319a()) && this.f68479c.equals(ahzt.mo37320b()) && ((str = this.f68480d) == null ? ahzt.mo37321c() == null : str.equals(ahzt.mo37321c())) && ((bxtx = this.f68481e) == null ? ahzt.mo37322d() == null : bxtx.equals(ahzt.mo37322d()));
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f68478b.hashCode() ^ 1000003) * 1000003) ^ this.f68479c.hashCode()) * 1000003;
        String str = this.f68480d;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode ^ i) * 1000003;
        ByteString bxtx = this.f68481e;
        if (bxtx != null) {
            i2 = bxtx.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68478b);
        String str = this.f68479c;
        String str2 = this.f68480d;
        String valueOf2 = String.valueOf(this.f68481e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("HeadsetPieceImage{type=");
        sb.append(valueOf);
        sb.append(", modelId=");
        sb.append(str);
        sb.append(", imageWebUrl=");
        sb.append(str2);
        sb.append(", imageByteString=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
