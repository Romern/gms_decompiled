package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

/* renamed from: bwbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbb extends bwaw {

    /* renamed from: a */
    private final bwbe f158690a;

    public bwbb(bwbe bwbe) {
        bwao bwao = bwao.f158669a;
        bwan.m121656a(bwbe, "DataRequestDispatcher");
        this.f158690a = bwbe;
        bwan.m121656a(bwao, "ProtoUtils");
    }

    /* renamed from: a */
    public final int mo73402a() {
        return 62;
    }

    /* renamed from: b */
    public final boolean mo73405b() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo73418d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwbb)) {
            return false;
        }
        bwbe bwbe = this.f158690a;
        bwbe bwbe2 = ((bwbb) obj).f158690a;
        return bwbe == bwbe2 || bwbe.equals(bwbe2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f158690a});
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.f158690a);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 3 + String.valueOf(valueOf).length());
        sb.append("[");
        sb.append(simpleName);
        sb.append("@");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo73403a(DataOutputStream dataOutputStream) {
        this.f158690a.mo73445p();
        bwao.m121658a(dataOutputStream, this.f158690a.mo73444o());
    }

    /* renamed from: a */
    public final boolean mo73404a(DataInputStream dataInputStream) {
        this.f158690a.mo73429a((canf) bwao.m121657a((bxxk) canf.f175355d.mo74142c(7), dataInputStream));
        return true;
    }
}
