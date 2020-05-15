package p000;

import android.text.LoginFilter;
import com.google.android.gms.auth.login.UsernamePasswordChimeraActivity;

/* renamed from: jfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfj extends LoginFilter.UsernameFilterGeneric {

    /* renamed from: a */
    final /* synthetic */ UsernamePasswordChimeraActivity f22375a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jfj(UsernamePasswordChimeraActivity usernamePasswordChimeraActivity) {
        super(true);
        this.f22375a = usernamePasswordChimeraActivity;
    }

    public final boolean isAllowed(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || "@_-+.'".indexOf(c) != -1;
        }
        return true;
    }

    public final void onInvalidCharacter(char c) {
        this.f22375a.f11037n = true;
    }

    public final void onStart() {
        this.f22375a.f11037n = false;
    }
}
