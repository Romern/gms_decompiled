package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfj {

    /* renamed from: a */
    public final coi f6704a;

    /* renamed from: b */
    public final C1241og f6705b;

    /* renamed from: c */
    private final Class f6706c;

    /* renamed from: d */
    private final List f6707d;

    /* renamed from: e */
    private final String f6708e;

    public cfj(Class cls, Class cls2, Class cls3, List list, coi coi, C1241og ogVar) {
        this.f6706c = cls;
        this.f6707d = list;
        this.f6704a = coi;
        this.f6705b = ogVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.f6708e = sb.toString();
    }

    /* renamed from: a */
    public final cgj mo3814a(cdv cdv, int i, int i2, cdk cdk, List list) {
        int size = this.f6707d.size();
        cgj cgj = null;
        for (int i3 = 0; i3 < size; i3++) {
            cdm cdm = (cdm) this.f6707d.get(i3);
            try {
                if (cdm.mo3744a(cdv.mo3765a(), cdk)) {
                    cgj = cdm.mo3743a(cdv.mo3765a(), i, i2, cdk);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (cgj != null) {
                break;
            }
        }
        if (cgj != null) {
            return cgj;
        }
        throw new cgd(this.f6708e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6706c);
        String valueOf2 = String.valueOf(this.f6707d);
        String valueOf3 = String.valueOf(this.f6704a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(valueOf);
        sb.append(", decoders=");
        sb.append(valueOf2);
        sb.append(", transcoder=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
