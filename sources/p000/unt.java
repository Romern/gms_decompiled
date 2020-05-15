package p000;

import android.database.SQLException;
import java.util.Locale;

/* renamed from: unt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class unt extends uob {

    /* renamed from: a */
    public final unp f48341a;

    /* renamed from: d */
    private final vpj f48342d;

    /* renamed from: e */
    private final vpj f48343e = new unr(this);

    protected unt(int i, uns uns) {
        super(i, uns);
        this.f48342d = uns.f48338a;
        this.f48341a = uns.f48339b.mo27745a(i, this);
    }

    /* renamed from: b */
    public final String mo27735b() {
        mo27754h();
        return mo27732a(this.f48377c);
    }

    public final String toString() {
        return String.format(Locale.US, "DatabaseTable[%s]", mo27735b());
    }

    /* renamed from: a */
    public final String mo27732a(int i) {
        String str = ((unz) mo27750c(i)).f48367a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo27733a(StringBuilder sb, int i, String str) {
        sdo.m34974b(mo27752e(i));
        sb.append("SELECT ");
        boolean z = false;
        for (vpj vpj : mo27734a()) {
            unp unp = (unp) vpj.mo27461b();
            if (unp.mo27752e(i)) {
                if (z) {
                    sb.append(", ");
                }
                unx unx = (unx) unp.mo27750c(i);
                unx unx2 = (unx) unp.mo27751d(i - 1);
                if (unx2 != null) {
                    sdo.m34959a((Object) str);
                    sb.append(unp.m38991a(str));
                    sb.append('.');
                    sb.append(unp.m38991a(unx2.f48357a));
                } else if (!unx.f48363g || unx.f48362f != null || str == null) {
                    sb.append(unp.m38990a(unx.f48362f));
                } else {
                    throw new SQLException("Cannot add not null field without default to existing table");
                }
                sb.append(" AS ");
                sb.append(unp.m38991a(unx.f48357a));
                z = true;
            }
        }
        if (str != null) {
            sb.append(" FROM ");
            sb.append(unp.m38991a(str));
            return;
        }
        sb.append(" LIMIT 0");
    }

    /* renamed from: a */
    public final vpj[] mo27734a() {
        vpj[] vpjArr = (vpj[]) this.f48342d.mo27461b();
        int length = vpjArr.length;
        vpj[] vpjArr2 = new vpj[(length + 1)];
        vpjArr2[0] = this.f48343e;
        System.arraycopy(vpjArr, 0, vpjArr2, 1, length);
        return vpjArr2;
    }
}
