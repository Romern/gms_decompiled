package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aqtr */
final /* synthetic */ class aqtr implements View.OnClickListener {

    /* renamed from: a */
    private final aqts f86784a;

    /* renamed from: b */
    private final Intent f86785b;

    /* renamed from: c */
    private final Context f86786c;

    public aqtr(aqts aqts, Intent intent, Context context) {
        this.f86784a = aqts;
        this.f86785b = intent;
        this.f86786c = context;
    }

    public void onClick(View view) {
        aqts aqts = this.f86784a;
        Intent intent = this.f86785b;
        Context context = this.f86786c;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            aqts.f86787a.mo26568a(tio.SEE_ALL_LINK, tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            context.startActivity(intent);
        }
    }
}
