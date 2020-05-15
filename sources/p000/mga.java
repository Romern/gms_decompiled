package p000;

import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mga extends dck implements mgb {

    /* renamed from: a */
    public final /* synthetic */ D2dSourceChimeraActivity f33612a;

    public mga() {
        super("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
    }

    /* renamed from: a */
    public final void mo19961a() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdv(d2dSourceChimeraActivity));
    }

    /* renamed from: c */
    public final void mo19964c() {
        D2dSourceChimeraActivity.f29016a.mo25409a("Authorization request is passed to the activity.", new Object[0]);
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdt(d2dSourceChimeraActivity));
    }

    /* renamed from: d */
    public final void mo19965d() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdu(d2dSourceChimeraActivity));
    }

    /* renamed from: e */
    public final void mo19966e() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new C1574mdm(d2dSourceChimeraActivity));
    }

    /* renamed from: f */
    public final void mo19967f() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdr(d2dSourceChimeraActivity));
    }

    /* renamed from: g */
    public final void mo19968g() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdw(d2dSourceChimeraActivity));
    }

    /* renamed from: h */
    public final void mo19969h() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdx(d2dSourceChimeraActivity));
    }

    /* renamed from: i */
    public final void mo19970i() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdy(d2dSourceChimeraActivity));
    }

    /* renamed from: j */
    public final void mo19971j() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdz(d2dSourceChimeraActivity));
    }

    /* renamed from: k */
    public final void mo19972k() {
        D2dSourceChimeraActivity.f29016a.mo25414c("onCancelRequestedFromTarget called.", new Object[0]);
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdo(d2dSourceChimeraActivity));
    }

    /* renamed from: l */
    public final void mo19973l() {
        D2dSourceChimeraActivity.f29016a.mo25414c("onError called.", new Object[0]);
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdp(d2dSourceChimeraActivity));
    }

    /* renamed from: m */
    public final void mo19974m() {
        D2dSourceChimeraActivity.f29016a.mo25414c("onServiceStopped called.", new Object[0]);
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33612a;
        d2dSourceChimeraActivity.runOnUiThread(new mdq(d2dSourceChimeraActivity));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mga(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        super("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
        this.f33612a = d2dSourceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo19962a(String str) {
        this.f33612a.runOnUiThread(new mds(this, str));
    }

    /* renamed from: a */
    public final void mo19963a(boolean z) {
        this.f33612a.runOnUiThread(new mdn(this, z));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo19961a();
                break;
            case 2:
                mo19962a(parcel.readString());
                break;
            case 3:
                mo19964c();
                break;
            case 4:
                mo19965d();
                break;
            case 5:
                mo19966e();
                break;
            case 6:
                mo19967f();
                break;
            case 7:
                mo19968g();
                break;
            case 8:
                mo19969h();
                break;
            case 9:
                mo19970i();
                break;
            case 10:
                mo19971j();
                break;
            case 11:
                mo19963a(dcl.m8167a(parcel));
                break;
            case 12:
                mo19972k();
                break;
            case 13:
                mo19973l();
                break;
            case 14:
                mo19974m();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
