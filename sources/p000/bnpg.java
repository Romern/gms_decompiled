package p000;

/* renamed from: bnpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnpg extends bnic {

    /* renamed from: a */
    final transient Object f131955a;

    /* renamed from: b */
    private transient int f131956b;

    public bnpg(Object obj) {
        bmxy.m108581a(obj);
        this.f131955a = obj;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        objArr[i] = this.f131955a;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f131955a.equals(obj);
    }

    /* renamed from: d */
    public final boolean mo67658d() {
        return this.f131956b != 0;
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    public final int hashCode() {
        int i = this.f131956b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f131955a.hashCode();
        this.f131956b = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public final bngx mo67756i() {
        return bngx.m109356a(this.f131955a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f131955a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public bnpg(Object obj, int i) {
        this.f131955a = obj;
        this.f131956b = i;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnjk(this.f131955a);
    }
}
