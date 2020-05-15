package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: axuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuc {

    /* renamed from: a */
    public final List f96363a = new ArrayList();

    protected axuc() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f96363a.size(); i++) {
            sb.append((String) this.f96363a.get(i));
            if (i < this.f96363a.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
