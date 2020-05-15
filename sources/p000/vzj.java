package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: vzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f50285a;

    /* renamed from: b */
    final /* synthetic */ Intent f50286b;

    public vzj(Context context, Intent intent) {
        this.f50285a = context;
        this.f50286b = intent;
    }

    public void onClick(View view) {
        try {
            this.f50285a.startActivity(this.f50286b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
