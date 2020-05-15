package p000;

import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.inline.InlinePresentationSpec;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.Iterator;
import java.util.List;

/* renamed from: lgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgc {

    /* renamed from: a */
    public final leh f26025a;

    /* renamed from: b */
    public final kjs f26026b;

    /* renamed from: c */
    public final FillForm f26027c;

    /* renamed from: d */
    public final kqm f26028d;

    /* renamed from: e */
    public final bmxv f26029e;

    public lgc(leh leh, kjs kjs, FillForm fillForm, kqm kqm, bmxv bmxv) {
        this.f26025a = leh;
        this.f26026b = kjs;
        this.f26027c = fillForm;
        this.f26028d = kqm;
        this.f26029e = bmxv;
    }

    /* renamed from: a */
    public final bmxv mo15061a() {
        leh leh = this.f26025a;
        if (leh != null && leh.f25875e.mo66813a()) {
            InlineSuggestionsRequest inlineSuggestionsRequest = (InlineSuggestionsRequest) this.f26025a.f25875e.mo66814b();
            kqm kqm = this.f26028d;
            int i = 0;
            if (!(kqm == null || kqm.mo14790a() == null)) {
                i = this.f26028d.mo14790a().size();
            }
            if (inlineSuggestionsRequest.getMaxSuggestionCount() > i) {
                List inlinePresentationSpecs = inlineSuggestionsRequest.getInlinePresentationSpecs();
                bmxy.m108581a(inlinePresentationSpecs);
                bnjr.m109611a(i);
                Object obj = null;
                if (!(inlinePresentationSpecs instanceof List)) {
                    Iterator it = inlinePresentationSpecs.iterator();
                    bnjr.m109607a(it, i);
                    obj = bnjr.m109618b(it, (Object) null);
                } else if (i < inlinePresentationSpecs.size()) {
                    obj = inlinePresentationSpecs.get(i);
                }
                return bmxv.m108567c((InlinePresentationSpec) obj);
            }
        }
        return bmvz.f131120a;
    }
}
