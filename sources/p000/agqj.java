package p000;

import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import java.util.Locale;

/* renamed from: agqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqj {

    /* renamed from: a */
    public final ConsentStatus f66280a = new ConsentStatus();

    /* renamed from: a */
    public final void mo35935a(int i) {
        if (ConsentStatus.m67281a(i)) {
            this.f66280a.f80270a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
    }
}
