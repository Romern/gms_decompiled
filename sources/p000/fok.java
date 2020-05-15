package p000;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: fok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fok extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    private foj f17014a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f17014a = (foj) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle arguments = getArguments();
        int i7 = 0;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d,yyyy h:mm a");
            if (arguments.getCharArray("dateString") != null) {
                Date parse = simpleDateFormat.parse(String.valueOf(arguments.getCharArray("dateString")));
                i5 = parse.getYear() + 1900;
                try {
                    i4 = parse.getMonth();
                    try {
                        i6 = parse.getDate();
                        i7 = i4;
                    } catch (ParseException e) {
                        e = e;
                        Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
                        i3 = i5;
                        i2 = i4;
                        i = 0;
                        return new DatePickerDialog(getActivity(), this, i3, i2, i);
                    }
                } catch (ParseException e2) {
                    e = e2;
                    i4 = 0;
                    Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
                    i3 = i5;
                    i2 = i4;
                    i = 0;
                    return new DatePickerDialog(getActivity(), this, i3, i2, i);
                }
            } else {
                i6 = 0;
                i5 = 0;
            }
            i = i6;
            i3 = i5;
            i2 = i7;
        } catch (ParseException e3) {
            e = e3;
            i5 = 0;
            i4 = 0;
            Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
            i3 = i5;
            i2 = i4;
            i = 0;
            return new DatePickerDialog(getActivity(), this, i3, i2, i);
        }
        return new DatePickerDialog(getActivity(), this, i3, i2, i);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f17014a.mo7146a(getArguments().getInt("buttonId"), i, i2, i3);
    }
}
