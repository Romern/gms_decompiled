package p000;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

/* renamed from: aauf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauf extends DialogFragment {

    /* renamed from: a */
    public String f56588a;

    /* renamed from: b */
    public aaue f56589b;

    /* renamed from: c */
    private String f56590c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f56589b = (aaue) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnDatePickListener"));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f56588a = arguments.getString("tag");
        this.f56590c = arguments.getString("current_date");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(DateFormat.getDateInstance().parse(this.f56590c));
        } catch (ParseException e) {
        }
        return new DatePickerDialog(getActivity(), new aaud(this), instance.get(1), instance.get(2), instance.get(5));
    }
}
