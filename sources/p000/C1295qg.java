package p000;

import android.os.Build;
import java.util.Objects;

/* renamed from: qg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1295qg {

    /* renamed from: b */
    final C1296qh f26854b;

    public C1295qg(C1296qh qhVar) {
        this.f26854b = qhVar;
    }

    /* renamed from: a */
    public C1296qh mo15719a(int i, int i2, int i3, int i4) {
        return C1296qh.f26855a;
    }

    /* renamed from: a */
    public boolean mo15720a() {
        return false;
    }

    /* renamed from: b */
    public C1166ln mo15721b() {
        return C1166ln.f26425a;
    }

    /* renamed from: c */
    public boolean mo15722c() {
        return false;
    }

    /* renamed from: d */
    public C1296qh mo15723d() {
        return this.f26854b;
    }

    /* renamed from: e */
    public C1296qh mo15724e() {
        return this.f26854b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1295qg) {
            C1295qg qgVar = (C1295qg) obj;
            return mo15720a() == qgVar.mo15720a() && mo15722c() == qgVar.mo15722c() && C1239oe.m19757a(mo15721b(), qgVar.mo15721b()) && C1239oe.m19757a(mo15725f(), qgVar.mo15725f()) && C1239oe.m19757a(mo15727g(), qgVar.mo15727g());
        }
    }

    /* renamed from: f */
    public C1166ln mo15725f() {
        return C1166ln.f26425a;
    }

    /* renamed from: g */
    public C1253os mo15727g() {
        return null;
    }

    /* renamed from: h */
    public C1296qh mo15728h() {
        return this.f26854b;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(mo15720a()), Boolean.valueOf(mo15722c()), mo15721b(), mo15725f(), mo15727g()};
        int i = Build.VERSION.SDK_INT;
        return Objects.hash(objArr);
    }

    /* renamed from: i */
    public C1166ln mo15730i() {
        return mo15721b();
    }
}
