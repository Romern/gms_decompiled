package p000;

import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.credit.base.CreditCardResult;
import java.util.List;

/* renamed from: aksx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksx extends aksg implements akqa {

    /* renamed from: s */
    private boolean f72677s = false;

    /* renamed from: t */
    private final akpg f72678t;

    /* renamed from: u */
    private final Activity f72679u;

    public aksx(Activity activity, akpg akpg) {
        this.f72679u = activity;
        this.f72678t = akpg;
        this.f72411j = this;
    }

    /* renamed from: a */
    private final void m60385a(Intent intent, int i) {
        CreditCardResult creditCardResult;
        if (intent != null && (creditCardResult = (CreditCardResult) intent.getParcelableExtra("CREDIT_CARD_OCR_RESULT")) != null) {
            try {
                this.f72678t.mo39642a(aksq.m60380a(creditCardResult), i, aksq.m60378a(this.f72619r));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public final void mo39696b() {
        mo39687d();
    }

    /* renamed from: bC */
    public final void mo39684bC() {
    }

    /* renamed from: c */
    public final void mo39698c() {
        m60385a((Intent) null, 10003);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo39803f() {
        return !this.f72677s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo39804g() {
        return false;
    }

    public final Activity getActivity() {
        return this.f72679u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo39805h() {
        return false;
    }

    public final void onStart() {
        mo39802b(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final akpz mo39694a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate((int) C0126R.C0128layout.legacy_ocr_card_detector, viewGroup, true);
        viewGroup.findViewById(C0126R.C0129id.ocrSkipScanButton).setVisibility(8);
        return new aksw((ViewGroup) viewGroup.findViewById(C0126R.C0129id.ocrRegionOfInterest));
    }

    /* renamed from: a */
    public final void mo39695a(List list) {
        this.f72677s = true;
        Intent intent = new Intent();
        if (list != null && !list.isEmpty()) {
            intent.putExtra("CREDIT_CARD_OCR_RESULT", (Parcelable) list.get(0));
        }
        m60385a(intent, -1);
    }
}
