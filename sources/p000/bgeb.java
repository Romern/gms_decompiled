package p000;

import java.util.LinkedList;

/* renamed from: bgeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgeb {

    /* renamed from: a */
    public final LinkedList f116210a = new LinkedList();

    /* renamed from: b */
    public long f116211b = 0;

    /* renamed from: c */
    public boolean f116212c = false;

    /* renamed from: d */
    public boolean f116213d = false;

    /* renamed from: e */
    public boolean f116214e = false;

    /* renamed from: f */
    public boolean f116215f = false;

    /* renamed from: g */
    public int f116216g = -1;

    /* renamed from: a */
    public final void mo62702a() {
        this.f116210a.clear();
        this.f116212c = false;
    }

    /* renamed from: b */
    public final boolean mo62703b() {
        return this.f116214e || this.f116213d;
    }

    public final String toString() {
        boolean z = this.f116213d;
        boolean z2 = this.f116214e;
        int i = this.f116216g;
        boolean z3 = this.f116212c;
        long j = this.f116211b;
        String valueOf = String.valueOf(this.f116210a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 204);
        sb.append("GlsFailureTracker [currentOnCellNetwork=");
        sb.append(z);
        sb.append(", currentOnWifiNetwork=");
        sb.append(z2);
        sb.append(", currentWifiNetworkId=");
        sb.append(i);
        sb.append(", inBackOffMode=");
        sb.append(z3);
        sb.append(", lastGlsFailureMillisSinceBoot=");
        sb.append(j);
        sb.append(", glsFailureTimestamps=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
