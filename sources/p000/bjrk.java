package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.flexbox.FlexboxLayout;

/* renamed from: bjrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrk extends bjjk implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: s */
    public static final /* synthetic */ int f123180s = 0;

    /* renamed from: o */
    FlexboxLayout f123181o;

    /* renamed from: p */
    CheckBox f123182p;

    /* renamed from: q */
    LinearLayout f123183q;

    /* renamed from: r */
    bxan f123184r;

    /* renamed from: t */
    private final View.OnClickListener f123185t = new bjrj(this);

    public bjrk(bjgv bjgv) {
        super(bjgv, bjrl.class);
        this.f122685j.mo65352a(this.f123185t);
    }

    /* renamed from: I */
    private final void m104440I() {
        boolean z = ((bjrm) ((bjhy) ((bjrl) ((bjjm) this).f122830n)).f122754m).f123186d == 2;
        if (z != this.f123182p.isChecked()) {
            this.f123182p.setChecked(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo65155B() {
        super.mo65155B();
        CheckBox checkBox = this.f123182p;
        if (checkBox != null) {
            checkBox.setImportantForAccessibility(mo65196z());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65156C() {
        super.mo65156C();
        CheckBox checkBox = this.f123182p;
        if (checkBox != null) {
            checkBox.setEnabled(mo65195y());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        FlexboxLayout flexboxLayout = (FlexboxLayout) this.f122676a.f122692a.mo65227a().inflate((int) C0126R.C0128layout.wallet_view_checkbox, (ViewGroup) null);
        this.f123181o = flexboxLayout;
        this.f123182p = (CheckBox) flexboxLayout.findViewById(C0126R.C0129id.checkbox);
        this.f123183q = (LinearLayout) this.f123181o.findViewById(C0126R.C0129id.checkbox_frame_layout);
        return this.f123181o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final ViewGroup mo65300F() {
        return this.f123183q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104440I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxan.f161724d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bxan bxan = (bxan) b;
        this.f123184r = bxan;
        if ((bxan.f161726a & 1) != 0) {
            bjgv bjgv = this.f122676a;
            bjgy bjgy = bjgv.f122694c;
            bwxl bwxl3 = bxan.f161727b;
            if (bwxl3 == null) {
                bwxl3 = bwxl.f161383i;
            }
            mo65160a(bjgy.mo65206a(bjgv, bwxl3));
        }
        this.f123182p.setOnCheckedChangeListener(this);
        m104440I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        LinearLayout linearLayout = (LinearLayout) ((FlexboxLayout) view).findViewById(C0126R.C0129id.checkbox_frame_layout);
        if (linearLayout.getChildCount() > 0) {
            linearLayout.setBaselineAlignedChildIndex(0);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((bjrm) ((bjhy) ((bjrl) ((bjjm) this).f122830n)).f122754m).mo65478a(!z ? 3 : 2, this);
    }
}
