package p000;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.material.chip.Chip;

/* renamed from: atmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmu {

    /* renamed from: a */
    public final Chip f90508a;

    /* renamed from: b */
    public final deu f90509b;

    /* renamed from: c */
    public final atam f90510c;

    /* renamed from: d */
    public final atmt f90511d;

    /* renamed from: e */
    public final auaj f90512e;

    /* renamed from: f */
    public CardInfo f90513f;

    /* renamed from: g */
    public final rjx f90514g;

    /* renamed from: h */
    private final ImageView f90515h;

    /* renamed from: i */
    private final asjs f90516i;

    /* renamed from: j */
    private final ImageView f90517j;

    public atmu(auaj auaj, View view, String str, rjx rjx, deu deu, atam atam, atmt atmt) {
        this.f90515h = (ImageView) view.findViewById(C0126R.C0129id.CardImageView);
        this.f90508a = (Chip) view.findViewById(C0126R.C0129id.DefaultCardLabel);
        this.f90517j = (ImageView) view.findViewById(C0126R.C0129id.RemoveTokenButton);
        this.f90516i = new asjs(view.getContext(), str);
        this.f90514g = rjx;
        this.f90509b = deu;
        this.f90510c = atam;
        this.f90511d = atmt;
        this.f90512e = auaj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50045a(CardInfo cardInfo, String str) {
        Uri uri;
        if (cardInfo != null && str != null) {
            CardInfo cardInfo2 = this.f90513f;
            if (cardInfo2 == null || ((uri = cardInfo2.f108347h) != null && !uri.equals(cardInfo.f108347h))) {
                asju.m74252a(this.f90516i, cardInfo, this.f90515h);
            }
            this.f90513f = cardInfo;
            this.f90515h.setOnClickListener(atmp.f90501a);
            boolean equals = cardInfo.f108340a.equals(str);
            this.f90508a.setChecked(equals);
            this.f90508a.setText(equals ? this.f90509b.getString(C0126R.string.tp_selected_card) : this.f90509b.getString(C0126R.string.tp_non_default_token_label));
            this.f90508a.setContentDescription(equals ? this.f90509b.getString(C0126R.string.tp_token_selector_default_card_description) : this.f90509b.getString(C0126R.string.tp_token_selector_non_default_card_description));
            this.f90508a.setHint("");
            this.f90508a.setOnClickListener(new atmq(this, equals, cardInfo));
            this.f90517j.setNextFocusRightId(C0126R.C0129id.TokenSelector);
            this.f90517j.setContentDescription(this.f90509b.getString(C0126R.string.tp_token_delete_button_description, new Object[]{cardInfo.f108343d}));
            this.f90517j.setOnClickListener(new atmr(this));
        }
    }
}
