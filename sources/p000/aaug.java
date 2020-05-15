package p000;

import android.app.DatePickerDialog;
import android.content.res.Resources;
import android.widget.DatePicker;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* renamed from: aaug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaug extends TextView implements DatePickerDialog.OnDateSetListener, aatx {
    public aaug(Activity activity, bzqi bzqi) {
        super(activity, null, 16842881);
        Date date;
        Resources resources = getResources();
        setMinHeight(resources.getDimensionPixelSize(C0126R.dimen.gh_contact_date_min_height));
        setPadding(resources.getDimensionPixelSize(C0126R.dimen.gh_contact_date_start_padding), resources.getDimensionPixelSize(C0126R.dimen.gh_contact_date_padding_top), resources.getDimensionPixelSize(C0126R.dimen.gh_contact_date_end_padding), resources.getDimensionPixelSize(C0126R.dimen.gh_contact_date_padding_bottom));
        setTag(bzqi.f170996b);
        if (bzqi.f171001g.isEmpty()) {
            date = new Date();
        } else {
            try {
                date = DateFormat.getDateInstance().parse(bzqi.f171001g);
            } catch (ParseException e) {
                date = new Date();
            }
        }
        setText(DateFormat.getDateInstance().format(date));
        setTextSize((float) resources.getInteger(C0126R.integer.gh_contact_date_font_size));
        setOnClickListener(new aauc(this, bzqi, activity));
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final List mo31789c() {
        return Collections.singletonList(aatb.m46961a((String) getTag(), getText().toString()));
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        setText(DateFormat.getDateInstance().format(new GregorianCalendar(i, i2, i3).getTime()));
    }
}
