package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aquf */
final /* synthetic */ class aquf implements View.OnClickListener {

    /* renamed from: a */
    private final Intent f86827a;

    /* renamed from: b */
    private final Context f86828b;

    public aquf(Intent intent, Context context) {
        this.f86827a = intent;
        this.f86828b = context;
    }

    public void onClick(View view) {
        Intent intent = this.f86827a;
        Context context = this.f86828b;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
