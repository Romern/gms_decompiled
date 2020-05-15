package p000;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TimePicker;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: fpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpn extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    private fpm f17096a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f17096a = (fpm) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        int i3;
        Bundle arguments = getArguments();
        int i4 = 0;
        try {
            if (arguments.getCharArray("dateString") != null) {
                Date parse = new SimpleDateFormat("MMM d,yyyy h:mm a").parse(String.valueOf(arguments.getCharArray("dateString")));
                i3 = parse.getHours();
                try {
                    i4 = parse.getMinutes();
                } catch (ParseException e) {
                    e = e;
                    Log.e("TimePickerFragment", "Failed to parse text when creating time picker dialog", e);
                    i2 = i3;
                    i = 0;
                    return new TimePickerDialog(getActivity(), this, i2, i, DateFormat.is24HourFormat(getActivity()));
                }
            } else {
                i3 = 0;
            }
            i2 = i3;
            i = i4;
        } catch (ParseException e2) {
            e = e2;
            i3 = 0;
            Log.e("TimePickerFragment", "Failed to parse text when creating time picker dialog", e);
            i2 = i3;
            i = 0;
            return new TimePickerDialog(getActivity(), this, i2, i, DateFormat.is24HourFormat(getActivity()));
        }
        return new TimePickerDialog(getActivity(), this, i2, i, DateFormat.is24HourFormat(getActivity()));
    }

    public final void onDetach() {
        super.onDetach();
        this.f17096a = null;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f17096a.mo7145a(getArguments().getInt("buttonId"), i, i2);
    }
}
