package p000;

import android.app.AppOpsManager;

/* renamed from: ahkr */
final /* synthetic */ class ahkr implements AppOpsManager.OnOpChangedListener {

    /* renamed from: a */
    private final ahkv f67369a;

    public ahkr(ahkv ahkv) {
        this.f67369a = ahkv;
    }

    public final void onOpChanged(String str, String str2) {
        ahkv ahkv = this.f67369a;
        if (!ahkv.f67388d.equals(str2)) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkv", "b", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring irrelevant visibility change for package %s", str2);
            return;
        }
        ahkv.mo36715e();
    }
}
