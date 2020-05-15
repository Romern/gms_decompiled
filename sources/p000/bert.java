package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bert */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bert {

    /* renamed from: a */
    public final List f112239a = new ArrayList(7);

    /* renamed from: a */
    public final void mo61067a(bfml bfml) {
        if (!this.f112239a.isEmpty()) {
            List list = this.f112239a;
            if (bfml.f114451e - ((bfml) list.get(list.size() - 1)).f114451e < 55000) {
                return;
            }
        }
        int size = this.f112239a.size();
        String valueOf = String.valueOf(bfml);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Cell history(");
        sb.append(size);
        sb.append(") updated with: ");
        sb.append(valueOf);
        sb.toString();
        this.f112239a.add(bfml);
        if (this.f112239a.size() > 7) {
            this.f112239a.remove(0);
        }
    }
}
