package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;

/* renamed from: akfs */
final /* synthetic */ class akfs implements Runnable {

    /* renamed from: a */
    private final akgy f71827a;

    /* renamed from: b */
    private final String f71828b;

    public akfs(akgy akgy, String str) {
        this.f71827a = akgy;
        this.f71828b = str;
    }

    public final void run() {
        akgy akgy = this.f71827a;
        String str = this.f71828b;
        if (!akgy.mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "b", 1038, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring expired endpoint %s because we're no longer scanning", str);
            return;
        }
        ajsn ajsn = akgy.f71941h;
        ArrayList arrayList = new ArrayList(akgy.f71936c.values());
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            akgq akgq = (akgq) arrayList.get(i);
            i++;
            if (str.equals(akgq.f71895a)) {
                if (akgq.f71900g) {
                    srn srn = ajvp.f71371a;
                    return;
                }
            }
        }
        ShareTarget d = akgy.mo39403d(str);
        if (d == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "b", 1055, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", str);
            return;
        }
        ajsn.mo38709b(d);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akgy", "b", 1061, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Reported expired ShareTarget %s", d);
    }
}
