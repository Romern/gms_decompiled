package p000;

import org.json.JSONObject;

/* renamed from: uax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uax implements txg {

    /* renamed from: a */
    private final txg f47077a;

    static {
        new sbw("JsonSerializableTransfe", "");
    }

    public uax(String str) {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("n");
        boolean z = jSONObject.getBoolean("r");
        int i2 = jSONObject.getInt("b");
        txi txi = new txi();
        txi.f46910b = i;
        txi.f46911c = z;
        txi.f46912d = i2;
        this.f47077a = txi.mo26871a();
    }

    /* renamed from: a */
    public final int mo18217a() {
        return ((txh) this.f47077a).f46906a;
    }

    /* renamed from: b */
    public final boolean mo18218b() {
        return ((txh) this.f47077a).f46907b;
    }

    /* renamed from: c */
    public final int mo18219c() {
        return ((txh) this.f47077a).f46908c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uax uax = (uax) obj;
            return mo18217a() == uax.mo18217a() && mo18218b() == uax.mo18218b() && mo18219c() == uax.mo18219c();
        }
    }

    public final int hashCode() {
        return this.f47077a.hashCode();
    }
}
