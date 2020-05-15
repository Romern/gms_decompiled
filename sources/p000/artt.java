package p000;

import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: artt */
final /* synthetic */ class artt implements aubt {

    /* renamed from: a */
    private final Challenge f88286a;

    public artt(Challenge challenge) {
        this.f88286a = challenge;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        Challenge challenge = this.f88286a;
        Logger Logger = aruc.f88303a;
        String valueOf = String.valueOf(challenge.f108122c);
        Logger.mo25415d(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), exc, new Object[0]);
    }
}
