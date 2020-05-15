package p000;

import java.util.Map;

/* renamed from: bnpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpl extends bnfn {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f131963a;

    public bnpl(Map.Entry entry) {
        this.f131963a = entry;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Map.Entry mo67549a() {
        return this.f131963a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131963a;
    }

    public final Object setValue(Object obj) {
        bmxy.m108581a(obj);
        return super.setValue(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return bmxi.m108538a(getKey(), entry.getKey()) && bmxi.m108538a(getValue(), entry.getValue());
    }
}
