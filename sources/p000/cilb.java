package p000;

import java.io.IOException;

/* renamed from: cilb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cilb implements brgp {

    /* renamed from: a */
    private final brep f190584a;

    public cilb(brep brep) {
        this.f190584a = brep;
    }

    /* renamed from: a */
    public final void mo69528a(IOException iOException) {
        String valueOf = String.valueOf(iOException.getMessage());
        if (valueOf.length() == 0) {
            new String("onFailure:");
        } else {
            "onFailure:".concat(valueOf);
        }
        ciki ciki = ciki.SERVER_ERROR;
        ciki.m150513a(ciki);
        this.f190584a.mo49931a(new bres(ciki));
    }
}
