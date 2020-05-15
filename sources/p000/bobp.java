package p000;

import java.io.Serializable;
import java.util.Map;

/* renamed from: bobp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobp implements Serializable {

    /* renamed from: a */
    public final Map f132512a = bnmt.m109804b();

    /* renamed from: a */
    private final bobo m111046a(Object obj) {
        bobo bobo = (bobo) this.f132512a.get(obj);
        if (bobo != null) {
            return mo68886a(bobo);
        }
        bobo bobo2 = new bobo(obj);
        this.f132512a.put(obj, bobo2);
        return bobo2;
    }

    /* renamed from: a */
    public final bobo mo68886a(bobo bobo) {
        bobo bobo2 = bobo.f132508a;
        if (bobo2 != bobo) {
            bobo.f132508a = mo68886a(bobo2);
        }
        return bobo.f132508a;
    }

    /* renamed from: a */
    public final void mo68887a(Object obj, Object obj2) {
        bobo a = m111046a(obj);
        bobo a2 = m111046a(obj2);
        if (a == a2) {
            Object obj3 = a.f132509b;
            return;
        }
        int i = a.f132510c;
        int i2 = a2.f132510c;
        if (i >= i2) {
            a2.f132508a = a;
            a.f132511d += a2.f132511d;
            if (i == i2) {
                a.f132510c = i + 1;
            }
            Object obj4 = a.f132509b;
            return;
        }
        a.f132508a = a2;
        a2.f132511d += a.f132511d;
        Object obj5 = a2.f132509b;
        a2.f132509b = a.f132509b;
        a.f132509b = obj5;
        Object obj6 = a2.f132509b;
    }
}
