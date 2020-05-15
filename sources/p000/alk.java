package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alk {

    /* renamed from: a */
    private ArrayList f837a;

    public alk() {
    }

    /* renamed from: a */
    public final all mo971a() {
        if (this.f837a == null) {
            return all.f838c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f837a);
        return new all(bundle, this.f837a);
    }

    public alk(all all) {
        if (all != null) {
            all.mo975b();
            if (!all.f840b.isEmpty()) {
                this.f837a = new ArrayList(all.f840b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: a */
    public final void mo972a(all all) {
        if (all != null) {
            List<String> a = all.mo974a();
            if (a == null) {
                throw new IllegalArgumentException("categories must not be null");
            } else if (!a.isEmpty()) {
                for (String str : a) {
                    mo973a(str);
                }
            }
        } else {
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    /* renamed from: a */
    public final void mo973a(String str) {
        if (str != null) {
            if (this.f837a == null) {
                this.f837a = new ArrayList();
            }
            if (!this.f837a.contains(str)) {
                this.f837a.add(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("category must not be null");
    }
}
