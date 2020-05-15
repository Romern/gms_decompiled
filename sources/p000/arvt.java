package p000;

import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: arvt */
public final /* synthetic */ class arvt implements roo {

    /* renamed from: a */
    private final Challenge[] f88344a;

    /* renamed from: b */
    private final boolean f88345b;

    /* renamed from: c */
    private final boolean f88346c;

    public arvt(Challenge[] challengeArr, boolean z, boolean z2) {
        this.f88344a = challengeArr;
        this.f88345b = z;
        this.f88346c = z2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Challenge[] challengeArr = this.f88344a;
        boolean z = this.f88345b;
        boolean z2 = this.f88346c;
        arvi arvi = (arvi) obj;
        arwa arwa = new arwa((aucf) obj2, arvp.f88340a);
        arvi.mo25288A();
        ((arwg) arvi.mo25289B()).mo48832a(new aruz(arwa), challengeArr, z, z2);
    }
}
