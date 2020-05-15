package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;

/* renamed from: bhhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhk extends bhhr {

    /* renamed from: a */
    private DateSelector f118671a;

    /* renamed from: b */
    private CalendarConstraints f118672b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f118671a = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f118672b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DateSelector dateSelector = this.f118671a;
        new bhhj(this);
        return dateSelector.mo71137g();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f118671a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f118672b);
    }
}
