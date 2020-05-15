package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aqtn */
final /* synthetic */ class aqtn implements View.OnClickListener {

    /* renamed from: a */
    private final Intent f86777a;

    /* renamed from: b */
    private final Context f86778b;

    /* renamed from: c */
    private final tim f86779c;

    public aqtn(Intent intent, Context context, tim tim) {
        this.f86777a = intent;
        this.f86778b = context;
        this.f86779c = tim;
    }

    public void onClick(View view) {
        Intent intent = this.f86777a;
        Context context = this.f86778b;
        tim tim = this.f86779c;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            tim.mo26568a(tio.SEE_ALL_LINK, tio.SMART_PROFILE_PHOTOS_CARD);
            context.startActivity(intent);
        }
    }
}
