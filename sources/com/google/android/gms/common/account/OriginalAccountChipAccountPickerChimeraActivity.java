package com.google.android.gms.common.account;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OriginalAccountChipAccountPickerChimeraActivity extends rhb {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final rha mo17693h() {
        return new rha(this, mo24625g(), this.f42964f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo17694i() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo17695j() {
        super.mo17695j();
        int i = Build.VERSION.SDK_INT;
        getWindow().setBackgroundDrawableResource(C0126R.C0127drawable.common_account_rounded_dialog_background);
    }
}
