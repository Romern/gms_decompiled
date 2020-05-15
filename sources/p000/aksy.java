package p000;

import com.google.android.gms.ocr.credit.base.CreditCardResult;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.base.PanResult;
import java.util.ArrayList;

/* renamed from: aksy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksy extends akvf {

    /* renamed from: a */
    private final boolean f72680a;

    /* renamed from: b */
    private final boolean f72681b;

    /* renamed from: e */
    private final boolean f72682e;

    /* renamed from: f */
    private final boolean f72683f;

    /* renamed from: g */
    private boolean f72684g;

    /* renamed from: h */
    private PanResult f72685h;

    /* renamed from: i */
    private boolean f72686i;

    /* renamed from: j */
    private ExpDateResult f72687j;

    /* renamed from: k */
    private boolean f72688k;

    /* renamed from: l */
    private NameResult f72689l;

    /* renamed from: m */
    private boolean f72690m;

    /* renamed from: n */
    private PanResult f72691n;

    /* renamed from: o */
    private boolean f72692o;

    /* renamed from: p */
    private ExpDateResult f72693p;

    /* renamed from: q */
    private CreditCardResult f72694q;

    /* renamed from: r */
    private CreditCardResult f72695r;

    public aksy(akus akus, akve akve, boolean z, boolean z2, boolean z3, boolean z4) {
        super(akus, akve);
        this.f72680a = z;
        this.f72681b = z2;
        this.f72682e = z3;
        this.f72683f = z4;
    }

    /* renamed from: a */
    public final synchronized void mo39825a(ExpDateResult expDateResult) {
        if (!this.f72686i) {
            this.f72687j = expDateResult;
            this.f72686i = true;
            mo39892g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo39745a() {
        return this.f72953c && (!this.f72682e || this.f72954d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo39746b() {
        if (this.f72694q == null && this.f72684g && ((!this.f72680a || this.f72686i) && (!this.f72681b || this.f72688k))) {
            CreditCardResult creditCardResult = new CreditCardResult(this.f72685h, this.f72687j, this.f72689l, 1);
            this.f72694q = creditCardResult;
            ArrayList arrayList = creditCardResult.f81286b;
            if (arrayList != null) {
                arrayList.clear();
            }
            return this.f72694q;
        } else if (this.f72695r != null || !this.f72682e || !this.f72690m) {
            return null;
        } else {
            if (this.f72683f && !this.f72692o) {
                return null;
            }
            CreditCardResult creditCardResult2 = new CreditCardResult(this.f72691n, this.f72693p, null, 2);
            this.f72695r = creditCardResult2;
            return creditCardResult2;
        }
    }

    /* renamed from: c */
    public final synchronized void mo39830c() {
        if (!this.f72684g) {
            this.f72685h = null;
            this.f72684g = true;
            mo39892g();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39826a(NameResult nameResult) {
        if (!this.f72688k) {
            this.f72689l = nameResult;
            this.f72688k = true;
            mo39892g();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39827a(PanResult panResult) {
        if (!this.f72690m) {
            this.f72691n = panResult;
            this.f72690m = true;
            mo39892g();
        }
    }

    /* renamed from: b */
    public final synchronized void mo39828b(ExpDateResult expDateResult) {
        if (!this.f72692o) {
            this.f72693p = expDateResult;
            this.f72692o = true;
            mo39892g();
        }
    }

    /* renamed from: b */
    public final synchronized void mo39829b(PanResult panResult) {
        if (!this.f72684g) {
            this.f72685h = panResult;
            this.f72684g = true;
            mo39892g();
        }
    }
}
