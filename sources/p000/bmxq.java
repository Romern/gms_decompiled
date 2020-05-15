package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bmxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxq {

    /* renamed from: a */
    private final bmxr f131177a;

    /* renamed from: b */
    private final String f131178b;

    public bmxq(bmxr bmxr, String str) {
        this.f131177a = bmxr;
        bmxy.m108581a(str);
        this.f131178b = str;
    }

    /* renamed from: a */
    public final void mo66872a(StringBuilder sb, Iterable iterable) {
        Iterator it = iterable.iterator();
        try {
            bmxy.m108581a(sb);
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(bmxr.m108545a(entry.getKey()));
                sb.append((CharSequence) this.f131178b);
                sb.append(bmxr.m108545a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f131177a.f131179b);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(bmxr.m108545a(entry2.getKey()));
                    sb.append((CharSequence) this.f131178b);
                    sb.append(bmxr.m108545a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
