package p000;

import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.processors.CardRectifier;
import java.util.List;

/* renamed from: akvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akvf {

    /* renamed from: a */
    private final akve f72951a;

    /* renamed from: b */
    private akus f72952b;

    /* renamed from: c */
    protected boolean f72953c;

    /* renamed from: d */
    protected boolean f72954d;

    /* renamed from: e */
    private CardRectifier.Result f72955e;

    /* renamed from: f */
    private List f72956f;

    public akvf(akus akus, akve akve) {
        this.f72952b = akus;
        this.f72951a = akve;
    }

    /* renamed from: a */
    public final synchronized void mo39887a(CardRectifier.Result result) {
        if (!this.f72953c) {
            this.f72955e = result;
            this.f72953c = true;
            mo39892g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo39745a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo39746b();

    /* renamed from: d */
    public final OcrImage mo39889d() {
        sdo.m34959a(this.f72952b);
        sdo.m34970a(this.f72952b.f72912a);
        return (OcrImage) this.f72952b.mo39880a();
    }

    /* renamed from: e */
    public final synchronized CardRectifier.Result mo39890e() {
        CardRectifier.Result result;
        sdo.m34970a(this.f72953c);
        result = this.f72955e;
        sdo.m34959a(result);
        return result;
    }

    /* renamed from: f */
    public final synchronized List mo39891f() {
        return this.f72956f;
    }

    /* renamed from: g */
    public final void mo39892g() {
        akus akus;
        if (mo39745a() && (akus = this.f72952b) != null) {
            akus.mo39881b();
            this.f72952b = null;
        }
        Object b = mo39746b();
        if (b != null) {
            this.f72951a.mo39738a(b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39888a(List list) {
        if (!this.f72954d) {
            this.f72956f = list;
            this.f72954d = true;
            mo39892g();
        }
    }
}
