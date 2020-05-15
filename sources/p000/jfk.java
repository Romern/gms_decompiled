package p000;

import android.text.LoginFilter;
import com.google.android.gms.auth.login.UsernamePasswordChimeraActivity;

/* renamed from: jfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfk extends LoginFilter.PasswordFilterGMail {

    /* renamed from: a */
    final /* synthetic */ UsernamePasswordChimeraActivity f22376a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jfk(UsernamePasswordChimeraActivity usernamePasswordChimeraActivity) {
        super(true);
        this.f22376a = usernamePasswordChimeraActivity;
    }

    public final void onInvalidCharacter(char c) {
        this.f22376a.f11038o = true;
    }

    public final void onStart() {
        this.f22376a.f11038o = false;
    }
}
