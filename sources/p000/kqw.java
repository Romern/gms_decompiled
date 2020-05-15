package p000;

import android.widget.inline.InlinePresentationSpec;
import com.google.android.gms.autofill.fill.FillField;

/* renamed from: kqw */
final /* synthetic */ class kqw implements bmxj {

    /* renamed from: a */
    private final kqx f24817a;

    /* renamed from: b */
    private final kqc f24818b;

    /* renamed from: c */
    private final FillField f24819c;

    public kqw(kqx kqx, kqc kqc, FillField fillField) {
        this.f24817a = kqx;
        this.f24818b = kqc;
        this.f24819c = fillField;
    }

    public final Object apply(Object obj) {
        kqx kqx = this.f24817a;
        kqc kqc = this.f24818b;
        FillField fillField = this.f24819c;
        InlinePresentationSpec inlinePresentationSpec = (InlinePresentationSpec) obj;
        bnrd a = kqx.f24821a.iterator();
        while (a.hasNext()) {
            if (fillField.mo7943a((kpb) a.next())) {
                return lbi.m18882a(kqx.f24822b, kqc.f24787b, kqc.f24788c, null, inlinePresentationSpec);
            }
        }
        return lbi.m18881a(kqx.f24822b, kqc.f24787b, kqc.f24788c, kqc.f24789d, 1, inlinePresentationSpec);
    }
}
