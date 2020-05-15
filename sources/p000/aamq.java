package p000;

/* renamed from: aamq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aamq {

    /* renamed from: c */
    final aamh f28478c;

    /* renamed from: d */
    final String f28479d;

    /* renamed from: e */
    final int f28480e;

    public aamq(blmp blmp) {
        this.f28478c = aamh.m21512a(blmp);
        String str = blmp.f126873h;
        sdo.m34959a((Object) str);
        this.f28479d = str;
        this.f28480e = blmp.f126882q;
    }

    /* renamed from: a */
    public abstract int mo17038a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo17041a(aamh aamh, String str) {
        return this.f28478c.equals(aamh) && this.f28479d.equals(str);
    }

    public String toString() {
        String str;
        aamh aamh = this.f28478c;
        String str2 = this.f28479d;
        int a = mo17038a();
        String valueOf = String.valueOf(aamh);
        if (a == 0) {
            str = "null";
        } else if (a == 0) {
            throw null;
        } else if (a != 0) {
            str = Integer.toString(a - 1);
        } else {
            throw null;
        }
        String valueOf2 = String.valueOf(str);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("QueuedMessage for ");
        sb.append(valueOf);
        sb.append(" id=");
        sb.append(str2);
        sb.append(" reason=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo17042a(blmp blmp) {
        return mo17041a(aamh.m21512a(blmp), blmp.f126873h);
    }
}
