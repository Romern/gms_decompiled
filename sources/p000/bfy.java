package p000;

/* renamed from: bfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfy extends bfw {

    /* renamed from: a */
    public int f3138a;

    /* renamed from: b */
    public boolean f3139b;

    /* renamed from: f */
    public int f3140f;

    /* renamed from: g */
    public long f3141g;

    /* renamed from: h */
    public String f3142h;

    /* renamed from: i */
    public String f3143i;

    /* renamed from: j */
    public String f3144j;

    public final String toString() {
        int i = this.f3138a;
        boolean z = this.f3139b;
        int i2 = this.f3140f;
        long j = this.f3141g;
        String str = this.f3142h;
        String str2 = this.f3143i;
        String str3 = this.f3144j;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 189 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("TokenRefreshStatusResponse{lupcCount=");
        sb.append(i);
        sb.append(", refreshRequired=");
        sb.append(z);
        sb.append(", maxATC=");
        sb.append(i2);
        sb.append(", lupcRefreshCheckBack=");
        sb.append(j);
        sb.append(", tokenDataVersion='");
        sb.append(str);
        sb.append("', clientVersion='");
        sb.append(str2);
        sb.append("', tokenState='");
        sb.append(str3);
        sb.append("'}");
        return sb.toString();
    }
}
