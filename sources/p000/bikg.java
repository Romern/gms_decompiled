package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;
import com.google.android.places.p095ui.autocomplete.SessionLogger;

/* renamed from: bikg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikg implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ AutocompleteChimeraActivity f120784a;

    public bikg(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.f120784a = autocompleteChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.f120784a;
        boolean z = false;
        if (!autocompleteChimeraActivity.f151405m) {
            SessionLogger sessionLogger = autocompleteChimeraActivity.f151397e;
            String obj = editable.toString();
            if (sessionLogger.f151424k != null) {
                z = true;
            }
            bmxy.m108601b(z, "Input value must be initialized on start");
            sessionLogger.f151425l++;
            sessionLogger.f151424k = obj;
            this.f120784a.mo71313e();
            this.f120784a.mo71314g();
            return;
        }
        autocompleteChimeraActivity.f151405m = false;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
