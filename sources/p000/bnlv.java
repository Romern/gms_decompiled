package p000;

import java.util.Map;

/* renamed from: bnlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlv extends bndi {

    /* renamed from: a */
    final Object f131819a;

    /* renamed from: b */
    Object f131820b;

    /* renamed from: c */
    final /* synthetic */ bnlw f131821c;

    public bnlv(bnlw bnlw, Object obj, Object obj2) {
        this.f131821c = bnlw;
        this.f131819a = obj;
        this.f131820b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f131819a.equals(entry.getKey()) && this.f131820b.equals(entry.getValue());
        }
    }

    public final Object getKey() {
        return this.f131819a;
    }

    public final Object getValue() {
        return this.f131820b;
    }

    public final int hashCode() {
        return this.f131819a.hashCode() ^ this.f131820b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.f131821c.put(this.f131819a, obj);
        this.f131820b = obj;
        return put;
    }
}
