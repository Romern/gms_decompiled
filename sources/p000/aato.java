package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: aato */
public final /* synthetic */ class aato implements View.OnClickListener {

    /* renamed from: a */
    private final ContactOptionsContainer f56563a;

    /* renamed from: b */
    private final bzps f56564b;

    /* renamed from: c */
    private final int f56565c;

    public aato(ContactOptionsContainer contactOptionsContainer, bzps bzps, int i) {
        this.f56563a = contactOptionsContainer;
        this.f56564b = bzps;
        this.f56565c = i;
    }

    public void onClick(View view) {
        ContactOptionsContainer contactOptionsContainer = this.f56563a;
        bzps bzps = this.f56564b;
        int i = this.f56565c;
        HelpChimeraActivity helpChimeraActivity = contactOptionsContainer.f78856e;
        abcx.m47470a(helpChimeraActivity, 47, bzps, i);
        bzps bzps2 = bzps.UNKNOWN_CONTACT_MODE;
        bzpv bzpv = bzpv.HELP_CONSOLE;
        int ordinal = bzps.ordinal();
        if (ordinal == 1) {
            helpChimeraActivity.mo43317C();
        } else if (ordinal == 2) {
            List r = helpChimeraActivity.f56986y.mo43243r();
            if (r.size() > 1) {
                List r2 = helpChimeraActivity.f56986y.mo43243r();
                abbh abbh = new abbh();
                Bundle bundle = new Bundle();
                bundle.putStringArray("phone_numbers", (String[]) r2.toArray(new String[r2.size()]));
                abbh.setArguments(bundle);
                abbh.show(helpChimeraActivity.getSupportFragmentManager(), "pick_support_phone_number_dialog");
                return;
            }
            helpChimeraActivity.mo43347d((String) r.iterator().next());
        } else if (ordinal == 3) {
            helpChimeraActivity.mo43319E();
        } else if (ordinal == 6) {
            helpChimeraActivity.mo43318D();
        }
    }
}
