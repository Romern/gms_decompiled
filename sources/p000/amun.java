package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: amun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amun extends abh {

    /* renamed from: a */
    public BackupAndSyncOptInState f75961a;

    /* renamed from: d */
    private final List f75962d;

    /* renamed from: e */
    private final Map f75963e = new HashMap();

    /* renamed from: f */
    private final Resources f75964f;

    public amun(Resources resources, List list) {
        this.f75964f = resources;
        this.f75962d = list;
        mo170a(true);
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f75962d.size();
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return ((Integer) this.f75962d.get(i)).intValue();
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        return new amum(viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41355a(int i, View.OnClickListener onClickListener) {
        this.f75963e.put(Integer.valueOf(i), onClickListener);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        amum amum = (amum) acm;
        if (mo162a(i) == 1) {
            if (cfus.m143107e()) {
                amum.f75956t.setImageDrawable(aux.m2149a(this.f75964f, C0126R.C0127drawable.ic_contacts_sync_96, null));
                amum.f75956t.setVisibility(0);
            } else {
                amum.f75956t.setVisibility(8);
            }
            amum.f75957u.setText((int) C0126R.string.people_account_sync_card_title);
            amum.f75958v.setText((int) C0126R.string.people_contacts_sync_information_banner);
            amum.f75959w.setText((int) C0126R.string.people_sync_generic_card_button);
            amum.f75955s.setOnClickListener((View.OnClickListener) this.f75963e.get(1));
        } else if (mo162a(i) == 2) {
            if (cfus.m143107e()) {
                amum.f75956t.setImageDrawable(aux.m2149a(this.f75964f, C0126R.C0127drawable.ic_contacts_backup_sync_96, null));
                amum.f75956t.setVisibility(0);
            } else {
                amum.f75956t.setVisibility(8);
            }
            amum.f75957u.setText((int) C0126R.string.people_backup_sync_text);
            if (amup.m63317a(this.f75961a)) {
                amum.f75958v.setText(this.f75964f.getString(C0126R.string.people_backup_sync_card_body_toggle_on, this.f75961a.f81704a));
            } else {
                amum.f75958v.setText((int) C0126R.string.people_backup_sync_card_body_toggle_off);
            }
            amum.f75959w.setText((int) C0126R.string.people_sync_generic_card_button);
            amum.f75955s.setOnClickListener((View.OnClickListener) this.f75963e.get(2));
        }
    }
}
