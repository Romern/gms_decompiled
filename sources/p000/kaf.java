package p000;

import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kaf implements yas {

    /* renamed from: a */
    private static final Logger f23653a = ght.m13171a("MinuteMaid", "ViewPresenter");

    /* renamed from: b */
    private final kaa f23654b;

    public kaf(kaa kaa) {
        this.f23654b = kaa;
    }

    /* renamed from: a */
    public final void mo14325a() {
        throw new RuntimeException("hideFingerprintOption should never be called for U2F requet.");
    }

    /* renamed from: a */
    public final void mo14326a(ViewOptions viewOptions) {
        Logger Logger = f23653a;
        String valueOf = String.valueOf(viewOptions.mo18855c());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("viewSelected(...) ");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "select_view");
            jSONObject.put("data", viewOptions.mo18664a());
            this.f23654b.mo14280f(String.format("window.setSkUiEvent(%s);", jSONObject.toString()));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
