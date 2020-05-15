package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: agbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbu extends agas {

    /* renamed from: a */
    public List f65197a;

    public agbu(String[] strArr, agap agap) {
        super(strArr, 16, agap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35136a(agap agap) {
        this.f65197a = new ArrayList();
        while (agap.mo35143a() > 0) {
            this.f65197a.add(agap.mo35149e());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof agbu) && super.equals(obj) && sdg.m34949a(this.f65197a, ((agbu) obj).f65197a);
        }
        return true;
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.f65197a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TXT: {");
        List list = this.f65197a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(' ');
                sb.append((String) list.get(i));
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
