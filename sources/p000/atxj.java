package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: atxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxj implements View.OnClickListener {

    /* renamed from: a */
    private final Context f91078a;

    /* renamed from: b */
    private final Intent f91079b;

    public atxj(Context context, Intent intent) {
        this.f91079b = intent;
        this.f91078a = context;
    }

    public void onClick(View view) {
        this.f91078a.startActivity(this.f91079b);
    }
}
