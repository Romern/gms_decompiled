package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: axqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqu extends rtr implements axop {

    /* renamed from: d */
    private final int f96280d;

    public axqu(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f96280d = i2;
    }

    /* renamed from: a */
    public final axoq mo53315a() {
        return new axra(this.f43672a, this.f43673b, this.f96280d);
    }

    /* renamed from: b */
    public final int mo53316b() {
        return mo25146b("event_type");
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new axqt(this);
    }

    public final String toString() {
        String str = mo53316b() == 1 ? "changed" : mo53316b() != 2 ? "unknown" : "deleted";
        String valueOf = String.valueOf(mo53315a());
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(valueOf).length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
