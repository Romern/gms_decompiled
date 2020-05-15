package p000;

import java.util.ArrayList;

/* renamed from: bhwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwr {

    /* renamed from: a */
    public final long f119748a;

    /* renamed from: b */
    private final ArrayList f119749b;

    public bhwr(long j, ArrayList arrayList) {
        this.f119748a = j;
        this.f119749b = arrayList;
    }

    /* renamed from: a */
    public final int mo64366a() {
        return this.f119749b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhwr) {
            bhwr bhwr = (bhwr) obj;
            if (this.f119748a == bhwr.f119748a && mo64366a() == bhwr.mo64366a()) {
                for (int i = 0; i < mo64366a(); i++) {
                    if (!mo64367a(i).equals(bhwr.mo64367a(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.f119748a) * 7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiScan [deliveryTime=");
        sb.append(this.f119748a);
        sb.append(", devices=[");
        ArrayList arrayList = this.f119749b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((bhwq) arrayList.get(i)).toString());
            sb.append(", ");
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public final bhwq mo64367a(int i) {
        return (bhwq) this.f119749b.get(i);
    }
}
