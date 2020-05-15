package p000;

import android.widget.AutoCompleteTextView;
import com.google.android.wallet.bender3.impl.p096ui.common.selector.dropdown.DropDownAutoCompleteTextView;
import java.util.ArrayList;

/* renamed from: bjra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjra implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ DropDownAutoCompleteTextView f123158a;

    public bjra(DropDownAutoCompleteTextView dropDownAutoCompleteTextView) {
        this.f123158a = dropDownAutoCompleteTextView;
    }

    public final void onDismiss() {
        ArrayList arrayList = this.f123158a.f151789a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AutoCompleteTextView.OnDismissListener) arrayList.get(i)).onDismiss();
        }
        AutoCompleteTextView.OnDismissListener onDismissListener = this.f123158a.f151790b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }
}
