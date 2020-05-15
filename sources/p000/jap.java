package p000;

import com.google.android.gms.auth.folsom.SharedKey;
import java.util.List;

/* renamed from: jap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jap implements roo {

    /* renamed from: a */
    final /* synthetic */ List f22027a;

    /* renamed from: b */
    final /* synthetic */ String f22028b;

    public jap(List list, String str) {
        this.f22027a = list;
        this.f22028b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6476a(Object obj, Object obj2) {
        jao jao = new jao((aucf) obj2);
        SharedKey[] sharedKeyArr = new SharedKey[this.f22027a.size()];
        this.f22027a.toArray(sharedKeyArr);
        ((jac) ((jaq) obj).mo25289B()).mo13550a(jao, this.f22028b, sharedKeyArr);
    }
}
