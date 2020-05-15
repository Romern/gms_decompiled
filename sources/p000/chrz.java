package p000;

import java.util.Arrays;

/* renamed from: chrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrz {

    /* renamed from: a */
    public final String f189076a;

    /* renamed from: b */
    public final chry f189077b;

    /* renamed from: c */
    public final long f189078c;

    /* renamed from: d */
    public final chsi f189079d = null;

    /* renamed from: e */
    public final chsi f189080e;

    public chrz(String str, chry chry, long j, chsi chsi) {
        this.f189076a = str;
        bmxy.m108582a(chry, "severity");
        this.f189077b = chry;
        this.f189078c = j;
        this.f189080e = chsi;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chrz) {
            chrz chrz = (chrz) obj;
            if (bmxi.m108538a(this.f189076a, chrz.f189076a) && bmxi.m108538a(this.f189077b, chrz.f189077b) && this.f189078c == chrz.f189078c) {
                chsi chsi = chrz.f189079d;
                if (!bmxi.m108538a(null, null) || !bmxi.m108538a(this.f189080e, chrz.f189080e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189076a, this.f189077b, Long.valueOf(this.f189078c), null, this.f189080e});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("description", this.f189076a);
        a.mo66885a("severity", this.f189077b);
        a.mo66884a("timestampNanos", this.f189078c);
        a.mo66885a("channelRef", (Object) null);
        a.mo66885a("subchannelRef", this.f189080e);
        return a.toString();
    }
}
