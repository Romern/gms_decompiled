package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aqtq */
final /* synthetic */ class aqtq implements View.OnClickListener {

    /* renamed from: a */
    private final aqts f86781a;

    /* renamed from: b */
    private final Intent f86782b;

    /* renamed from: c */
    private final Context f86783c;

    public aqtq(aqts aqts, Intent intent, Context context) {
        this.f86781a = aqts;
        this.f86782b = intent;
        this.f86783c = context;
    }

    public void onClick(View view) {
        aqts aqts = this.f86781a;
        Intent intent = this.f86782b;
        Context context = this.f86783c;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            aqts.f86787a.mo26568a(tio.GOOGLE_PLUS_POST_LINK, tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            context.startActivity(intent);
        }
    }
}
