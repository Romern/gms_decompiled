package p000;

/* renamed from: sna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sna {

    /* renamed from: a */
    public final zzq f44789a;

    /* renamed from: b */
    public final String f44790b;

    public sna(zzq zzq, String str) {
        this.f44789a = zzq;
        zzn zzn = zzq.f56326c;
        String str2 = (zzn == null ? zzn.f56307e : zzn).f56311c;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 1);
        sb.append(str2);
        sb.append('_');
        sb.append(str);
        this.f44790b = sb.toString();
    }
}
