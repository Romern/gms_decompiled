package p000;

import android.net.Uri;
import android.view.View;

/* renamed from: aawa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aawa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f56684a;

    /* renamed from: b */
    final /* synthetic */ Uri f56685b;

    /* renamed from: c */
    final /* synthetic */ aawe f56686c;

    public aawa(aawe aawe, String str, Uri uri) {
        this.f56686c = aawe;
        this.f56684a = str;
        this.f56685b = uri;
    }

    public void onClick(View view) {
        abcx.m47472a(this.f56686c.f56701n, 161, this.f56684a);
        this.f56686c.f56701n.mo43273s().mo31749a(this.f56685b, 1);
    }
}
