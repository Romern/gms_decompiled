package p000;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import com.google.android.chimera.DialogFragment;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: bkhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhq extends DialogFragment {

    /* renamed from: a */
    public DatePickerDialog.OnDateSetListener f124227a;

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        int i3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Bundle arguments = getArguments();
        blxc blxc = (blxc) bjvp.m104730a(arguments, "initialDate", (bxxk) blxc.f128037e.mo74142c(7));
        blxc blxc2 = (blxc) bjvp.m104730a(arguments, "minDate", (bxxk) blxc.f128037e.mo74142c(7));
        blxc blxc3 = (blxc) bjvp.m104730a(arguments, "maxDate", (bxxk) blxc.f128037e.mo74142c(7));
        if (blxc == null) {
            Calendar instance = GregorianCalendar.getInstance();
            int i4 = instance.get(1);
            int i5 = instance.get(2);
            int i6 = instance.get(5);
            if (blxc2 != null) {
                gregorianCalendar.set(blxc2.f128040b, blxc2.f128041c - 1, blxc2.f128042d);
                if (instance.compareTo((Calendar) gregorianCalendar) < 0) {
                    i4 = gregorianCalendar.get(1);
                    i5 = gregorianCalendar.get(2);
                    i6 = gregorianCalendar.get(5);
                }
            }
            if (blxc3 != null) {
                gregorianCalendar.set(blxc3.f128040b, blxc3.f128041c - 1, blxc3.f128042d);
                if (instance.compareTo((Calendar) gregorianCalendar) > 0) {
                    i3 = gregorianCalendar.get(1);
                    i2 = gregorianCalendar.get(2);
                    i = gregorianCalendar.get(5);
                }
            }
            i3 = i4;
            i2 = i5;
            i = i6;
        } else {
            i3 = blxc.f128040b;
            i2 = blxc.f128041c - 1;
            i = blxc.f128042d;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this.f124227a, i3, i2, i);
        DatePicker datePicker = datePickerDialog.getDatePicker();
        if (blxc2 != null) {
            gregorianCalendar.set(blxc2.f128040b - 1, blxc2.f128041c - 1, blxc2.f128042d);
            datePicker.setMinDate(gregorianCalendar.getTimeInMillis());
            gregorianCalendar.set(blxc2.f128040b, blxc2.f128041c - 1, blxc2.f128042d);
            datePicker.setMinDate(gregorianCalendar.getTimeInMillis());
        }
        if (blxc3 != null) {
            gregorianCalendar.set(blxc3.f128040b + 1, blxc3.f128041c - 1, blxc3.f128042d);
            datePicker.setMaxDate(gregorianCalendar.getTimeInMillis());
            gregorianCalendar.set(blxc3.f128040b, blxc3.f128041c - 1, blxc3.f128042d);
            datePicker.setMaxDate(gregorianCalendar.getTimeInMillis());
        }
        return datePickerDialog;
    }
}
