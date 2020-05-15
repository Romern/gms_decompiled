package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.base.Boundaries;
import com.google.android.gms.ocr.credit.base.CreditCardResult;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.base.PanResult;
import com.google.android.gms.ocr.processors.CardDetector;
import com.google.android.gms.ocr.view.CardHintBoundingBox;
import com.google.android.gms.ocr.view.DetectedSegmentsView;
import java.lang.reflect.Array;

/* renamed from: aksg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aksg extends akpv implements akvb, akva, akve {

    /* renamed from: l */
    aksl f72613l;

    /* renamed from: m */
    akur f72614m;

    /* renamed from: n */
    akso f72615n;

    /* renamed from: o */
    Vibrator f72616o;

    /* renamed from: p */
    boolean f72617p;

    /* renamed from: q */
    boolean f72618q;

    /* renamed from: r */
    protected akua f72619r;

    /* renamed from: s */
    private final CreditCardResult f72620s = new CreditCardResult(null, null, null, 1);

    /* renamed from: t */
    private final CreditCardResult f72621t = new CreditCardResult(null, null, null, 2);

    /* renamed from: u */
    private TextView f72622u;

    /* renamed from: v */
    private TextView f72623v;

    /* renamed from: w */
    private CardHintBoundingBox f72624w;

    /* renamed from: x */
    private DetectedSegmentsView f72625x;

    /* renamed from: y */
    private int f72626y = 0;

    /* renamed from: a */
    public final void mo39681a(akpn akpn) {
        super.mo39681a(akpn);
        DetectedSegmentsView detectedSegmentsView = this.f72625x;
        detectedSegmentsView.f81365a = akpn.mo39668b().mo39671b();
        detectedSegmentsView.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39802b(boolean z) {
        akso akso = this.f72615n;
        akvd akvd = akso.f72667b;
        aksg aksg = null;
        aksg aksg2 = !z ? null : this;
        akvd.f72941a = aksg2;
        akuy akuy = akso.f72668c;
        akuy.f72930d = aksg2;
        if (z) {
            aksg = this;
        }
        akuy.f72931e = aksg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bC */
    public void mo39684bC() {
        super.mo39684bC();
        this.f72624w.mo44750a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bD */
    public final void mo39685bD() {
        super.mo39685bD();
        if (this.f72619r.f72819a) {
            int i = this.f72626y + 1;
            this.f72626y = i;
            if (i == 20) {
                this.f72405d.mo39794w();
                this.f72625x.setVisibility(0);
                CardDetector.Options options = this.f72615n.f72668c.f72929c;
                if (options != null) {
                    options.returnLineSegments = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo39803f() {
        return isResumed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo39804g() {
        return this.f72617p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo39805h() {
        return this.f72618q;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        akug akug = this.f72404c;
        this.f72619r = (akua) akug;
        this.f72615n.f72672g.f72696a = this;
        aksc aksc = this.f72405d;
        akua akua = this.f72619r;
        aksc.mo39762a(akua.f72821c, akua.f72822d, akua.f72824f, akua.f72825g, akug.mo39851a());
        this.f72402a.mo39722a(new aksd(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater.inflate((int) C0126R.C0128layout.ocr_credit_bounding_box, this.f72409h);
        this.f72624w = (CardHintBoundingBox) this.f72409h.findViewById(C0126R.C0129id.ocrCardWindow);
        this.f72622u = (TextView) this.f72408g.findViewById(C0126R.C0129id.ocrExpDateDisplay);
        this.f72623v = (TextView) this.f72408g.findViewById(C0126R.C0129id.ocrNameDisplay);
        this.f72625x = (DetectedSegmentsView) this.f72408g.findViewById(C0126R.C0129id.debugView);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C0126R.attr.flashIconColor});
        int color = obtainStyledAttributes.getColor(0, C1163lk.m19270b(getResources(), C0126R.color.google_grey600, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        C1329rn.m20096a((ImageView) onCreateView.findViewById(C0126R.C0129id.flashStateButton), ColorStateList.valueOf(color));
        return onCreateView;
    }

    public final void onDestroy() {
        this.f72615n.f72671f.mo39868a();
        aktg aktg = this.f72615n.f72670e;
        if (aktg != null) {
            aktg.mo39838b();
        }
        this.f72614m.mo39874a();
        aksl aksl = this.f72613l;
        if (aksl != null) {
            aksl.f72642d = false;
        }
        super.onDestroy();
    }

    public final void onPause() {
        this.f72615n.f72666a.mo39894b();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f72615n.f72666a.mo39893a();
        aksl aksl = this.f72613l;
        if (aksl != null && aksl.f72641c.f72822d) {
            Context context = aksl.f72639a;
            if (context.getPackageManager().checkPermission("android.permission.READ_CONTACTS", context.getPackageName()) == 0) {
                aksl.f72642d = true;
                aksl.f72640b.initLoader(112358, null, aksl);
            }
        }
    }

    public void onStart() {
        super.onStart();
        mo39802b(true);
    }

    public final void onStop() {
        mo39802b(false);
        super.onStop();
    }

    /* renamed from: a */
    public final void mo39736a(Boundaries boundaries) {
        boolean z = false;
        if (boundaries != null) {
            CardHintBoundingBox cardHintBoundingBox = this.f72624w;
            boolean z2 = boundaries.f81263c != null;
            boolean z3 = boundaries.f81262b != null;
            boolean z4 = boundaries.f81264d != null;
            if (boundaries.f81265e != null) {
                z = true;
            }
            cardHintBoundingBox.mo44756a(z2, z3, z4, z);
            return;
        }
        this.f72624w.mo44756a(false, false, false, false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39738a(Object obj) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        CreditCardResult creditCardResult = (CreditCardResult) obj;
        int i2 = 0;
        if (((akua) this.f72404c).f72828j) {
            ExpDateResult expDateResult = creditCardResult.f81287c;
            NameResult nameResult = creditCardResult.f81289e;
            PanResult panResult = creditCardResult.f81285a;
            if (expDateResult != null) {
                aksc aksc = this.f72405d;
                if (panResult == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aksc.mo39760a(z4);
                if (mo39804g()) {
                    mo39800a((Runnable) new aksf(creditCardResult.f81287c.f81303e, this.f72622u));
                }
            }
            if (nameResult != null) {
                aksc aksc2 = this.f72405d;
                if (panResult == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aksc2.mo39765b(z3);
                if (mo39805h()) {
                    mo39800a((Runnable) new aksf(creditCardResult.f81289e.f81303e, this.f72623v));
                }
            }
            if (creditCardResult.f81291g == 2) {
                CreditCardResult creditCardResult2 = this.f72621t;
                creditCardResult2.mo44717a(creditCardResult);
                creditCardResult = creditCardResult2;
            } else {
                CreditCardResult creditCardResult3 = this.f72620s;
                creditCardResult3.mo44717a(creditCardResult);
                creditCardResult = creditCardResult3;
            }
        }
        if (creditCardResult.f81285a != null) {
            if (creditCardResult.f81287c != null) {
                z = true;
            } else {
                z = false;
            }
            if (creditCardResult.f81289e != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = creditCardResult.f81291g;
            if (i3 == 1) {
                this.f72405d.mo39761a(z, z2);
            } else if (i3 == 2) {
                this.f72405d.mo39768c(z);
            }
            if (z2 && creditCardResult.f81291g == 1) {
                NameResult nameResult2 = creditCardResult.f81289e;
                DeviceAccountName deviceAccountName = nameResult2.f81307g;
                String str = nameResult2.f81304a;
                if (deviceAccountName != null) {
                    aksc aksc3 = this.f72405d;
                    String upperCase = deviceAccountName.toString().toUpperCase();
                    String upperCase2 = str.toUpperCase();
                    if (!(upperCase == null || upperCase2 == null)) {
                        int[] iArr = new int[2];
                        iArr[1] = upperCase2.length() + 1;
                        iArr[0] = upperCase.length() + 1;
                        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
                        for (int i4 = 0; i4 <= upperCase.length(); i4++) {
                            iArr2[i4][0] = i4;
                        }
                        for (int i5 = 1; i5 <= upperCase2.length(); i5++) {
                            iArr2[0][i5] = i5;
                        }
                        for (int i6 = 1; i6 <= upperCase.length(); i6++) {
                            for (int i7 = 1; i7 <= upperCase2.length(); i7++) {
                                int[] iArr3 = iArr2[i6];
                                int i8 = i6 - 1;
                                int[] iArr4 = iArr2[i8];
                                int i9 = iArr4[i7] + 1;
                                int i10 = i7 - 1;
                                int i11 = iArr3[i10] + 1;
                                int i12 = iArr4[i10];
                                if (upperCase.charAt(i8) == upperCase2.charAt(i10)) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                iArr3[i7] = Math.min(Math.min(i9, i11), i12 + i);
                            }
                        }
                        i2 = iArr2[upperCase.length()][upperCase2.length()];
                    }
                    aksc3.mo39755a(i2);
                }
            }
            this.f72405d.mo39751A();
            mo39800a((Runnable) new akse(this, creditCardResult));
        }
    }

    /* renamed from: a */
    public final void mo39800a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    /* renamed from: a */
    public final void mo39801a(float[] fArr) {
        DetectedSegmentsView detectedSegmentsView = this.f72625x;
        detectedSegmentsView.f81366b = fArr;
        detectedSegmentsView.invalidate();
    }
}
