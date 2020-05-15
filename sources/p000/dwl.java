package p000;

/* renamed from: dwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwl extends tjz {

    /* renamed from: a */
    public final bxdi f14275a;

    public dwl(bxdi bxdi) {
        sdo.m34959a(bxdi);
        this.f14275a = bxdi;
    }

    /* renamed from: a */
    public final int mo9785a() {
        int a = bxdh.m122598a(this.f14275a.f163033b);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(mo9785a()));
        int a = mo9785a();
        if (a == 1) {
            sb.append(" durn=");
            int a2 = mo9785a();
            if (a2 == 1) {
                sb.append(this.f14275a.f163034c);
            } else {
                String valueOf = String.valueOf(Integer.toString(a2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("No duration for type ") : "No duration for type ".concat(valueOf));
            }
        } else if (a == 2) {
            sb.append(" cnt=");
            int a3 = mo9785a();
            if (a3 == 2) {
                sb.append((long) this.f14275a.f163035d);
            } else {
                String valueOf2 = String.valueOf(Integer.toString(a3));
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("No count for type ") : "No count for type ".concat(valueOf2));
            }
        }
        return sb.toString();
    }
}
