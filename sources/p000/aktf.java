package p000;

import android.util.Pair;
import com.google.android.gms.ocr.credit.base.PanResult;
import com.google.android.gms.ocr.credit.processors.CreditCardRecognizer;

/* renamed from: aktf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktf extends akuu {

    /* renamed from: a */
    private final CreditCardRecognizer f72726a;

    /* renamed from: b */
    private final boolean f72727b;

    /* renamed from: c */
    private final float f72728c;

    /* renamed from: d */
    private final float f72729d;

    /* renamed from: e */
    private final aksc f72730e;

    public aktf(CreditCardRecognizer creditCardRecognizer, boolean z, float f, float f2, aksc aksc) {
        this.f72726a = creditCardRecognizer;
        this.f72727b = z;
        this.f72729d = f2;
        this.f72728c = f;
        this.f72730e = aksc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72730e.mo39769d();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        boolean z;
        aksy aksy = (aksy) obj;
        byte[] data = aksy.mo39890e().f81335a.getData();
        CreditCardRecognizer creditCardRecognizer = this.f72726a;
        creditCardRecognizer.f81311a.mo39895a();
        PanResult nativeGetCreditCardNumbers = creditCardRecognizer.nativeGetCreditCardNumbers(data, creditCardRecognizer.f81312b, creditCardRecognizer.f81313c, creditCardRecognizer.f81314d, creditCardRecognizer.f81315e, creditCardRecognizer.f81316f);
        if (nativeGetCreditCardNumbers != null && this.f72727b) {
            if (nativeGetCreditCardNumbers.mo44733d() < ((double) this.f72729d)) {
                nativeGetCreditCardNumbers = null;
            } else if (nativeGetCreditCardNumbers.f81308a < ((double) this.f72728c)) {
                nativeGetCreditCardNumbers = null;
            }
        }
        aksy.mo39829b(nativeGetCreditCardNumbers);
        if (nativeGetCreditCardNumbers != null) {
            z = true;
        } else {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), aksy);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39836c(Object obj) {
        ((aksy) obj).mo39830c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo39837d(Object obj) {
        return ((aksy) obj).mo39890e().f81335a != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72730e.mo39767c(j);
    }
}
