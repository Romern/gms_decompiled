package p000;

import android.view.View;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azjz */
public final /* synthetic */ class azjz implements View.OnClickListener {

    /* renamed from: a */
    private final CardChimeraActivity f99542a;

    /* renamed from: b */
    private final azmf f99543b;

    /* renamed from: c */
    private final boolean f99544c;

    public azjz(CardChimeraActivity cardChimeraActivity, azmf azmf, boolean z) {
        this.f99542a = cardChimeraActivity;
        this.f99543b = azmf;
        this.f99544c = z;
    }

    public void onClick(View view) {
        String str;
        int i;
        String str2;
        String str3;
        cbiw cbiw;
        cbiw cbiw2;
        CardChimeraActivity cardChimeraActivity = this.f99542a;
        azmf azmf = this.f99543b;
        boolean z = this.f99544c;
        if (cbis.m127896a(azmf.f99638a.f177295a) == 4) {
            cbit cbit = azmf.f99638a;
            if (cbit.f177295a == 3) {
                cbiw2 = (cbiw) cbit.f177296b;
            } else {
                cbiw2 = cbiw.f177306c;
            }
            str = cbiw2.f177309b;
        } else {
            str = null;
        }
        azph azph = cardChimeraActivity.f111238v;
        if (!z) {
            i = 362;
        } else {
            i = 369;
        }
        String str4 = cardChimeraActivity.f111174F.f177301a;
        aznz aznz = cardChimeraActivity.f111219c;
        if (cbis.m127896a(azmf.f99638a.f177295a) == 4) {
            cbit cbit2 = azmf.f99638a;
            if (cbit2.f177295a == 3) {
                cbiw = (cbiw) cbit2.f177296b;
            } else {
                cbiw = cbiw.f177306c;
            }
            str2 = cbiw.f177308a;
        } else {
            str2 = null;
        }
        if (aznz != null) {
            str3 = aznz.f99775b;
        } else {
            str3 = null;
        }
        azph.mo55134a(i, 2, str4, null, str3, aznz, 0, str2, null, null);
        if (str != null) {
            cardChimeraActivity.mo60407a(str);
        }
    }
}
