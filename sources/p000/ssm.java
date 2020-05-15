package p000;

import java.util.ArrayList;

/* renamed from: ssm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssm {

    /* renamed from: a */
    public final ArrayList f45088a = new ArrayList(4);

    /* renamed from: a */
    public final void mo26046a(Object obj) {
        synchronized (this.f45088a) {
            int size = this.f45088a.size();
            int i = 0;
            while (i < size) {
                if (this.f45088a.get(i) != obj) {
                    i++;
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Object released already: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (size < 4) {
                this.f45088a.add(obj);
            }
        }
    }
}
