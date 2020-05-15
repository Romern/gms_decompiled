package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import com.google.android.gms.romanesco.restoresettings.FastScroller;

/* renamed from: apcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apcq implements View.OnScrollChangeListener {

    /* renamed from: a */
    final /* synthetic */ ContactsRestoreContactsChimeraActivity f84142a;

    public apcq(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.f84142a = contactsRestoreContactsChimeraActivity;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = this.f84142a;
        FastScroller fastScroller = contactsRestoreContactsChimeraActivity.f107256h;
        RecyclerView recyclerView = contactsRestoreContactsChimeraActivity.f107257i;
        if (!fastScroller.f107306d.isSelected()) {
            fastScroller.mo58854a(((float) fastScroller.getHeight()) * (((float) recyclerView.computeVerticalScrollOffset()) / (((float) recyclerView.computeVerticalScrollRange()) - ((float) fastScroller.getHeight()))));
        }
    }
}
