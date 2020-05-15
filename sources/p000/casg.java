package p000;

import java.util.List;

/* renamed from: casg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casg {

    /* renamed from: a */
    public final List f175748a;

    /* renamed from: b */
    public final int f175749b;

    public casg(int i, List list) {
        this.f175749b = i;
        this.f175748a = list;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Assessment: ");
        int i = this.f175749b;
        if (i != 1) {
            str = i != 2 ? "DECLINE" : "ABORT";
        } else {
            str = "AGREE";
        }
        sb.append((Object) str);
        sb.append("\nReasons: ");
        for (cash cash : this.f175748a) {
            sb.append(cash);
        }
        sb.append("\n");
        return sb.toString();
    }
}
