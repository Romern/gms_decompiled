package p000;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* renamed from: afcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class afcf extends FragmentActivity {

    /* renamed from: a */
    protected String f64171a;

    /* renamed from: b */
    protected String f64172b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.f64171a = bundle.getString("dialog_content_title");
        this.f64172b = bundle.getString("dialog_content_message");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("dialog_content_title", this.f64171a);
        bundle.putString("dialog_content_message", this.f64172b);
    }
}
