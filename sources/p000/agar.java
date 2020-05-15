package p000;

import java.util.Arrays;

/* renamed from: agar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agar extends agas {

    /* renamed from: a */
    public String[] f65091a;

    public agar(String[] strArr, agap agap) {
        super(strArr, 12, agap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35136a(agap agap) {
        this.f65091a = agap.mo35148d();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof agar) && super.equals(obj) && Arrays.equals(this.f65091a, ((agar) obj).f65091a);
        }
        return true;
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f65091a);
    }

    public final String toString() {
        String a = agas.m53825a(this.f65092c);
        String a2 = agas.m53825a(this.f65091a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 9 + String.valueOf(a2).length());
        sb.append("PTR: ");
        sb.append(a);
        sb.append(" -> ");
        sb.append(a2);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo35154a() {
        String[] strArr = this.f65092c;
        return strArr != null && strArr.length > 2 && strArr[1].equals("_sub");
    }
}
