package p000;

import android.os.Bundle;

/* renamed from: ivk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivk extends C1021gj {

    /* renamed from: k */
    private String f21868k;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.f21868k = bundle.getString("dialog_content_msg");
        ivj ivj = new ivj();
        ivj.f21867Y = this.f21868k;
        ivj.show(mo11924aK(), "message");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("dialog_content_msg", this.f21868k);
    }
}
