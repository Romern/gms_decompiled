package p000;

import android.text.Html;
import android.text.Spanned;
import com.android.volley.Response;

/* renamed from: aqjb */
final /* synthetic */ class aqjb implements Response.Listener {

    /* renamed from: a */
    private final String f86189a;

    /* renamed from: b */
    private final aucf f86190b;

    public aqjb(String str, aucf aucf) {
        this.f86189a = str;
        this.f86190b = aucf;
    }

    public final void onResponse(Object obj) {
        String str = this.f86189a;
        aucf aucf = this.f86190b;
        Logger Logger = aqjd.f86192a;
        Spanned fromHtml = Html.fromHtml((String) obj);
        bxvd da = bsrz.f146816d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrz bsrz = (bsrz) da.f164949b;
        str.getClass();
        bsrz.f146818a |= 4;
        bsrz.f146820c = str;
        aucf.mo50393b(new aqje(fromHtml, (bsrz) da.mo74062i()));
    }
}
