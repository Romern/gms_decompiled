package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.Iterator;

/* renamed from: bkds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkds implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ FormEditText f124061a;

    /* renamed from: b */
    private boolean f124062b;

    /* renamed from: c */
    private CharSequence f124063c;

    public bkds(FormEditText formEditText) {
        this.f124061a = formEditText;
    }

    public final void afterTextChanged(Editable editable) {
        CharSequence error;
        TextWatcher textWatcher;
        if (this.f124062b && (textWatcher = this.f124061a.f152038u) != null) {
            textWatcher.afterTextChanged(editable);
        }
        FormEditText formEditText = this.f124061a;
        if (formEditText.f151983C) {
            Iterator it = formEditText.f152039v.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
        Iterator it2 = this.f124061a.mo71950p().iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).afterTextChanged(editable);
        }
        bkgh bkgh = this.f124061a.f151981A;
        if (bkgh != null) {
            bkgh.afterTextChanged(editable);
        }
        FormEditText formEditText2 = this.f124061a;
        int i = formEditText2.f151996P - 1;
        formEditText2.f151996P = i;
        if (i == 0 && (error = formEditText2.getError()) != null && !TextUtils.equals(error, this.f124063c)) {
            this.f124061a.mo71951q();
            this.f124061a.mo71954s();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        TextWatcher textWatcher;
        FormEditText formEditText = this.f124061a;
        int i4 = formEditText.f151996P;
        formEditText.f151996P = i4 + 1;
        if (i4 == 0) {
            this.f124063c = formEditText.getError();
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = i3 != 0;
        }
        this.f124062b = z;
        if (z && (textWatcher = this.f124061a.f152038u) != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
        FormEditText formEditText2 = this.f124061a;
        if (formEditText2.f151983C) {
            if (!formEditText2.f152007ae && formEditText2.f152008af && this.f124062b && !formEditText2.isPerformingCompletion()) {
                this.f124061a.f152007ae = true;
            }
            Iterator it = this.f124061a.f152039v.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
        Iterator it2 = this.f124061a.mo71950p().iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
        bkgh bkgh = this.f124061a.f151981A;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher;
        if (this.f124062b && (textWatcher = this.f124061a.f152038u) != null) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
        }
        FormEditText formEditText = this.f124061a;
        if (formEditText.f151983C) {
            Iterator it = formEditText.f152039v.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        Iterator it2 = this.f124061a.mo71950p().iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).onTextChanged(charSequence, i, i2, i3);
        }
        bkgh bkgh = this.f124061a.f151981A;
        if (bkgh != null) {
            bkgh.onTextChanged(charSequence, i, i2, i3);
        }
    }
}
