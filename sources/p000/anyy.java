package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: anyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyy extends anzc implements View.OnClickListener {

    /* renamed from: g */
    private anyx f77898g;

    /* renamed from: h */
    private String f77899h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42471a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42474b() {
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anyx)) {
            String valueOf = String.valueOf(anyx.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f77898g = (anyx) activity;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.back_button) {
            this.f77904a.mo42411b(rin.f43079d, this.f77904a.mo42412bH());
            this.f77898g.mo42470b();
        } else if (id != C0126R.C0129id.next_button) {
        } else {
            if ("invalidNameHardFail".equals(this.f77899h)) {
                this.f77898g.mo42481f();
            } else {
                super.onClick(view);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f77908e.setVisibility(0);
        this.f77908e.setText((int) C0126R.string.plus_bad_name_decline_button_label);
        String string = getArguments().getString("error_id");
        this.f77899h = string;
        if ("invalidNameHardFail".equals(string)) {
            this.f77907d.setText((int) C0126R.string.plus_bad_name_skip_button_label);
        } else {
            this.f77907d.setText((int) C0126R.string.plus_bad_name_agree_button_label);
        }
        return onCreateView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42472a(LayoutInflater layoutInflater, View view) {
        layoutInflater.inflate((int) C0126R.C0128layout.plus_oob_buttons, (ViewGroup) view.findViewById(C0126R.C0129id.buttons_layout), true);
    }

    /* renamed from: a */
    public final void mo42473a(UpgradeAccountEntity upgradeAccountEntity) {
        super.mo42473a(upgradeAccountEntity);
        int childCount = this.f77905b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f77905b.getChildAt(i);
            if (childAt instanceof anyj) {
                anyj anyj = (anyj) childAt;
                if (!TextUtils.isEmpty(anyj.mo42443j())) {
                    if ("appealButton".equals(anyj.f77855b.mo42600g())) {
                        this.f77907d.setText(anyj.mo42443j());
                    } else if ("changeButton".equals(anyj.f77855b.mo42600g())) {
                        this.f77908e.setText(anyj.mo42443j());
                    }
                }
            }
        }
    }
}
