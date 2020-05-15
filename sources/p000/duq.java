package p000;

import com.google.android.gms.awareness.fence.FenceState;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: duq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class duq implements duv {

    /* renamed from: a */
    public final bxcl f14074a;

    /* renamed from: b */
    public final int f14075b;

    /* renamed from: c */
    public bxxc f14076c;

    /* renamed from: d */
    public duu f14077d;

    /* renamed from: e */
    public int f14078e = 0;

    /* renamed from: f */
    private final Class f14079f;

    /* renamed from: g */
    private final int[] f14080g;

    /* renamed from: h */
    private int f14081h = 0;

    public duq(Class cls, bxxc bxxc, int i, bxcl bxcl, int[] iArr) {
        sdo.m34959a(cls);
        this.f14079f = cls;
        sdo.m34959a(bxxc);
        this.f14076c = bxxc;
        this.f14075b = i;
        this.f14074a = bxcl;
        this.f14080g = iArr;
    }

    /* renamed from: a */
    public static boolean m9408a(long j, long j2, long j3) {
        return j >= j2 && j <= j2 + j3;
    }

    /* renamed from: a */
    public boolean mo9645a(Collection collection, Collection collection2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo9646b() {
        this.f14078e = 0;
        return 0;
    }

    /* renamed from: c */
    public boolean mo9647c() {
        return this.f14078e != this.f14081h;
    }

    /* renamed from: d */
    public final int mo9648d() {
        int i = this.f14078e;
        this.f14081h = i;
        return i;
    }

    /* renamed from: e */
    public int mo9649e() {
        return this.f14075b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.f14079f.equals(obj.getClass())) {
            return this.f14076c.equals(((duv) obj).mo9651f());
        }
        return false;
    }

    /* renamed from: f */
    public final bxxc mo9651f() {
        return this.f14076c;
    }

    /* renamed from: g */
    public int[] mo9652g() {
        return this.f14080g;
    }

    /* renamed from: h */
    public dui mo9653h() {
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("duq", "h", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[BaseFenceImpl] getTimeIntervalsWhenFenceIsTrue is not supposed to be called without overriding");
        return dui.m9372b();
    }

    public int hashCode() {
        bxxc bxxc = this.f14076c;
        return Arrays.hashCode(new Object[]{bxxc.getClass(), Integer.valueOf(bxxc.hashCode())});
    }

    /* renamed from: i */
    public long mo9655i() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9643a(boolean z) {
        int a = FenceState.m7187a(z);
        this.f14078e = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9644a(boolean z, long j) {
        if (z && this.f14078e != 2) {
            dwq.m9648E().mo9554a(j, this.f14077d);
        }
        int a = FenceState.m7187a(z);
        this.f14078e = a;
        return a;
    }
}
