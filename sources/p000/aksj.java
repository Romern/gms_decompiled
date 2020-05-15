package p000;

import android.os.Bundle;
import android.os.Vibrator;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.credit.processors.CreditCardRecognizer;
import com.google.android.gms.ocr.processors.BlurDetectorImpl;
import com.google.android.gms.ocr.processors.CardDetector;
import com.google.android.gms.ocr.processors.CardRectifier;
import com.google.android.gms.ocr.processors.StrictCardDetector;
import java.util.Calendar;

/* renamed from: aksj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksj extends akqe {

    /* renamed from: j */
    public final akua f72629j = ((akua) this.f72428g);

    /* renamed from: k */
    private final aksl f72630k;

    /* renamed from: l */
    private final akur f72631l = new akur(new aksh());

    /* renamed from: m */
    private final akso f72632m;

    /* renamed from: n */
    private final aktd f72633n;

    /* renamed from: o */
    private final akte f72634o;

    /* renamed from: p */
    private final Vibrator f72635p;

    /* renamed from: q */
    private final boolean f72636q;

    /* renamed from: r */
    private final boolean f72637r;

    /* JADX WARN: Type inference failed for: r15v1, types: [akte, aksl], assign insn: PHI: (r15v1 ?) = (r15v2 ?), (r15v3 ?) binds: [B:15:0x0168, B:14:0x0132] */
    /* JADX WARN: Type inference failed for: r15v2, assign insn: 0x016e: CONST  (r15v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r15v3, assign insn: 0x015f: CONST  (r15v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x01da  */
    public aksj(Activity activity, Bundle bundle) {
        super(r10, 2, new akua(), r11.getString("com.google.android.gms.ocr.ACCOUNT_NAME"));
        aktb aktb;
        aktc aktc;
        aktg aktg;
        boolean z;
        boolean z2;
        boolean z3;
        ? r15;
        String str;
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(bundle2.getLong("CURRENT_DATE", instance.getTimeInMillis()));
        akua akua = this.f72629j;
        boolean z4 = akua.f72821c;
        boolean z5 = akua.f72822d;
        boolean z6 = akua.f72824f;
        boolean z7 = akua.f72825g;
        akta akta = new akta(instance, akua.mo39864n().booleanValue());
        akvk akvk = new akvk(activity2);
        akvd akvd = new akvd(this.f72427f, new BlurDetectorImpl(akvk), this.f72429h, this.f72428g.mo39851a(), this.f72425d, this.f72426e, this.f72428g.mo39861k());
        akuy akuy = new akuy(this.f72428g, new StrictCardDetector(akvk), this.f72428g.mo39853c() ? new CardDetector(akvk) : null, new CardRectifier(akvk), this.f72427f, this.f72429h, false);
        if (z6) {
            aktg aktg2 = new aktg(new aksi(this, activity2), this.f72427f, this.f72429h, (float) this.f72629j.f72831m);
            aktc aktc2 = new aktc(akta, this.f72429h, this.f72629j.f72805C);
            if (z7) {
                aktc = aktc2;
                aktg = aktg2;
                aktb = new aktb(akta, this.f72429h);
                akua akua2 = this.f72629j;
                CreditCardRecognizer creditCardRecognizer = new CreditCardRecognizer(akvk, akua2.f72804B, akua2.mo39864n().booleanValue(), Boolean.valueOf(this.f72629j.f72826h).booleanValue());
                aktf aktf = new aktf(creditCardRecognizer, bundle2.getBoolean("DEBUG_VALIDATE_RESULT", true), bundle2.getFloat("THRESHOLD_MIN_DIGIT_CONFIDENCE", 0.7f), bundle2.getFloat("THRESHOLD_MEAN_DIGIT_CONFIDENCE", 0.75f), this.f72429h);
                if (!z4) {
                    z = z4;
                    z2 = z6;
                    str = "DEBUG_VALIDATE_RESULT";
                    z3 = z7;
                    r15 = 0;
                    this.f72633n = new aktd(activity, creditCardRecognizer, instance, akta, bundle2.getBoolean("DEBUG_VALIDATE_RESULT", true), bundle2.getFloat("THRESHOLD_EXPIRATION_DATE_MIN_CONFIDENCE_4_DIGIT", 3.18f), bundle2.getFloat("THRESHOLD_EXPIRATION_DATE_MIN_CONFIDENCE_6_DIGIT", 4.6f), this.f72429h);
                } else {
                    z = z4;
                    z2 = z6;
                    z3 = z7;
                    r15 = 0;
                    str = "DEBUG_VALIDATE_RESULT";
                    this.f72633n = null;
                }
                if (!z5) {
                    this.f72634o = new akte(activity, creditCardRecognizer, bundle2.getBoolean(str, true), (float) this.f72629j.f72803A, this.f72429h);
                } else {
                    this.f72634o = r15;
                }
                this.f72632m = new akso(new akvh(400, this.f72429h), akvd, new akuz(this.f72631l), new aksz(z, z5, z2, z3), aktg, aktc, aktb, akuy, aktf, this.f72633n, this.f72634o);
                if (!z5) {
                    this.f72630k = new aksl(activity.getApplicationContext(), activity.getSupportLoaderManager(), this.f72632m, this.f72629j);
                } else {
                    this.f72630k = r15;
                }
                this.f72636q = bundle2.getBoolean("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", this.f72629j.f72830l);
                this.f72637r = bundle2.getBoolean("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", this.f72629j.f72829k);
                this.f72635p = (Vibrator) activity.getSystemService("vibrator");
            }
            aktc = aktc2;
            aktg = aktg2;
        } else {
            aktg = null;
            aktc = null;
        }
        aktb = null;
        akua akua22 = this.f72629j;
        CreditCardRecognizer creditCardRecognizer2 = new CreditCardRecognizer(akvk, akua22.f72804B, akua22.mo39864n().booleanValue(), Boolean.valueOf(this.f72629j.f72826h).booleanValue());
        aktf aktf2 = new aktf(creditCardRecognizer2, bundle2.getBoolean("DEBUG_VALIDATE_RESULT", true), bundle2.getFloat("THRESHOLD_MIN_DIGIT_CONFIDENCE", 0.7f), bundle2.getFloat("THRESHOLD_MEAN_DIGIT_CONFIDENCE", 0.75f), this.f72429h);
        if (!z4) {
        }
        if (!z5) {
        }
        this.f72632m = new akso(new akvh(400, this.f72429h), akvd, new akuz(this.f72631l), new aksz(z, z5, z2, z3), aktg, aktc, aktb, akuy, aktf2, this.f72633n, this.f72634o);
        if (!z5) {
        }
        this.f72636q = bundle2.getBoolean("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", this.f72629j.f72830l);
        this.f72637r = bundle2.getBoolean("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", this.f72629j.f72829k);
        this.f72635p = (Vibrator) activity.getSystemService("vibrator");
    }

    /* renamed from: a */
    public final void mo39806a(aksg aksg) {
        super.mo39701a((akpv) aksg);
        aksg.f72613l = this.f72630k;
        aksg.f72614m = this.f72631l;
        aksg.f72615n = this.f72632m;
        aksg.f72616o = this.f72635p;
        aksg.f72404c = this.f72629j;
        aksg.f72617p = this.f72636q;
        aksg.f72618q = this.f72637r;
    }
}
