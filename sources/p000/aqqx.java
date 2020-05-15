package p000;

import android.content.Intent;

/* renamed from: aqqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqx {

    /* renamed from: a */
    public final Intent f86636a;

    public aqqx() {
        Intent intent = new Intent();
        this.f86636a = intent;
        intent.setPackage("com.google.android.gms");
        this.f86636a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
    }

    /* renamed from: a */
    public final void mo48091a(int i) {
        this.f86636a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", i);
    }

    /* renamed from: b */
    public final void mo48093b(String str) {
        this.f86636a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", str);
    }

    /* renamed from: a */
    public final void mo48092a(String str) {
        this.f86636a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", str);
    }
}
