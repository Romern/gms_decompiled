package p000;

import android.os.Handler;
import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONObject;

/* renamed from: cilf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cilf implements Runnable {

    /* renamed from: a */
    private final String f190598a;

    /* renamed from: b */
    private final Card f190599b;

    /* renamed from: c */
    private final JSONObject f190600c;

    /* renamed from: d */
    private final brhc f190601d;

    /* renamed from: e */
    private final brep f190602e;

    /* renamed from: f */
    private final Handler f190603f;

    /* renamed from: g */
    private final breo f190604g;

    /* renamed from: h */
    private final brgl f190605h;

    /* renamed from: i */
    private final brgz f190606i;

    public cilf(String str, Card card, JSONObject jSONObject, brhc brhc, brgl brgl, brgz brgz, brep brep, Handler handler, breo breo) {
        this.f190598a = str;
        this.f190599b = card;
        this.f190600c = jSONObject;
        this.f190601d = brhc;
        this.f190605h = brgl;
        this.f190606i = brgz;
        this.f190602e = brep;
        this.f190603f = handler;
        this.f190604g = breo;
    }

    public final void run() {
        this.f190605h.mo69516a(new cikr(this.f190598a, this.f190599b, this.f190600c, this.f190601d, this.f190605h, this.f190606i, this.f190602e, this.f190603f, this.f190604g));
    }
}
