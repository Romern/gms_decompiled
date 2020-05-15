package p000;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.google.android.chimera.Fragment;

/* renamed from: evp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class evp extends evn {

    /* renamed from: c */
    private final bsvb f15886c;

    /* renamed from: d */
    private final ffk f15887d;

    /* renamed from: e */
    private final Fragment f15888e;

    /* renamed from: f */
    private final sek f15889f;

    public evp(bsvb bsvb, ffk ffk, Fragment fragment, sek sek, ewh ewh, ewg ewg) {
        super(ewh, ewg);
        this.f15886c = bsvb;
        this.f15887d = ffk;
        this.f15888e = fragment;
        this.f15889f = sek;
    }

    /* renamed from: a */
    public final void mo10533a() {
        if ((this.f15886c.f147224a & 1) == 0) {
            this.f15885b.mo10534a(new IllegalArgumentException("No URL"));
        } else if (!ssk.m36235a(rpr.m34216b())) {
            this.f15885b.mo10534a(new chuw(chuv.f189219f));
        } else {
            try {
                bsvb bsvb = this.f15886c;
                Uri a = evo.m11197a(bsvb.f147225b, bsvb.f147226c, this.f15887d);
                Fragment fragment = this.f15888e;
                fragment.startActivityForResult(evo.m11196a(fragment.getContext(), a), 2);
                this.f15884a.mo10551a(true);
            } catch (ActivityNotFoundException e) {
                this.f15889f.mo25411b("Error starting browser", e, new Object[0]);
                this.f15885b.mo10534a(e);
            }
        }
    }
}
