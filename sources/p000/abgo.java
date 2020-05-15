package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: abgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgo extends abgl {

    /* renamed from: f */
    private final HelpConfig f57418f;

    /* renamed from: g */
    private final bqgj f57419g;

    /* renamed from: h */
    private final abcr f57420h;

    public abgo(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, HelpConfig helpConfig, bqgj bqgj) {
        super("GetSuggestionsOperation", googleHelpChimeraService, str, abcf);
        this.f57418f = helpConfig;
        this.f57419g = bqgj;
        this.f57420h = googleHelpChimeraService.mo43374a();
    }

    /* renamed from: b */
    private final void m47690b(Context context) {
        mo32087a(context, 22);
        this.f57414e.mo32008f();
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        Map map = abez.m47601a(context.getApplicationContext(), this.f57418f, this.f57419g, this.f57420h, "").f57323b;
        if (map == null || map.isEmpty()) {
            Log.e("gH_GetSuggestionsOp", "Nothing returned from server");
            m47690b(context);
            return;
        }
        ArrayList arrayList = new ArrayList(map.values());
        for (int i = 0; i < arrayList.size(); i++) {
            aasm aasm = (aasm) arrayList.get(i);
            if (!aasm.mo31741w() && !aasm.mo31723g()) {
                mo32087a(context, 21);
                abcf abcf = this.f57414e;
                bxvd da = bzrk.f171153e.mo74144da();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aasm aasm2 = (aasm) arrayList.get(i2);
                    bxvd da2 = bzrj.f171142j.mo74144da();
                    String r = aasm2.mo31735r();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzrj bzrj = (bzrj) da2.f164949b;
                    r.getClass();
                    int i3 = bzrj.f171144a | 16;
                    bzrj.f171144a = i3;
                    bzrj.f171148e = r;
                    String str = aasm2.f56497g;
                    str.getClass();
                    int i4 = i3 | 8;
                    bzrj.f171144a = i4;
                    bzrj.f171147d = str;
                    String str2 = aasm2.f56496f;
                    str2.getClass();
                    int i5 = i4 | 4;
                    bzrj.f171144a = i5;
                    bzrj.f171146c = str2;
                    int i6 = aasm2.f56495e;
                    int i7 = 7;
                    if (i6 == 0 || i6 == 1) {
                        i7 = 3;
                    } else if (i6 == 7) {
                        i7 = 6;
                    } else if (i6 != 8) {
                        i7 = i6 != 9 ? i6 != 11 ? 1 : 12 : 10;
                    }
                    bzrj.f171149f = i7 - 1;
                    bzrj.f171144a = i5 | 32;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzrk bzrk = (bzrk) da.f164949b;
                    bzrj bzrj2 = (bzrj) da2.mo74062i();
                    bzrj2.getClass();
                    bzrk.mo74556c();
                    bzrk.f171156b.add(bzrj2);
                }
                abcf.mo32002a(((bzrk) da.mo74062i()).mo73642k());
                return;
            }
        }
        Log.e("gH_GetSuggestionsOp", "No content returned from server");
        m47690b(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32087a(Context context, int i) {
        MetricsIntentOperation.m66597a(context, this.f57418f.f78830e, this.f57413d, 125, i, false);
    }
}
