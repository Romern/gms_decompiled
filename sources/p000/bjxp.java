package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;

/* renamed from: bjxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjxp extends Activity {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo59963a(Uri uri) {
        return StartAndroidAppRedirectActivity.m118364a(this, uri);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(mo59963a(getIntent().getData()));
        finish();
    }
}
