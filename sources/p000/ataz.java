package p000;

import com.android.volley.Response;

/* renamed from: ataz */
final /* synthetic */ class ataz implements Response.Listener {

    /* renamed from: a */
    private final askf f89984a;

    public ataz(askf askf) {
        this.f89984a = askf;
    }

    public final void onResponse(Object obj) {
        int i;
        char c;
        askf askf = this.f89984a;
        srn srn = atbd.f89988a;
        bzud bzud = ((bzuh) obj).f171424a;
        if (bzud == null) {
            bzud = bzud.f171408b;
        }
        bxwc bxwc = bzud.f171410a;
        int size = bxwc.size();
        int i2 = 0;
        while (true) {
            i = 2;
            if (i2 >= size) {
                break;
            }
            bzuc bzuc = (bzuc) bxwc.get(i2);
            int i3 = bzuc.f171406a;
            if (i3 != 0) {
                c = i3 != 1 ? (char) 0 : 3;
            } else {
                c = 2;
            }
            if (c == 0) {
                c = 1;
            }
            i2++;
            if (c == 3) {
                int i4 = bzuc.f171407b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i = i4 != 2 ? 0 : 4;
                    } else {
                        i = 3;
                    }
                }
                if (i == 0) {
                    i = 1;
                }
            }
        }
        int i5 = i - 2;
        if (i5 == -1 || i5 == 0) {
            bnsl bnsl = (bnsl) atbd.f89988a.mo68388c();
            bnsl.mo68432a("atbd", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("chime status unknown");
        } else if (i5 != 1) {
            atbd.m75360b(askf, false);
        } else {
            atbd.m75360b(askf, true);
        }
    }
}
