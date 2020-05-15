package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aquh */
final /* synthetic */ class aquh implements View.OnClickListener {

    /* renamed from: a */
    private final aquj f86831a;

    /* renamed from: b */
    private final Intent f86832b;

    /* renamed from: c */
    private final Context f86833c;

    public aquh(aquj aquj, Intent intent, Context context) {
        this.f86831a = aquj;
        this.f86832b = intent;
        this.f86833c = context;
    }

    public void onClick(View view) {
        aquj aquj = this.f86831a;
        Intent intent = this.f86832b;
        Context context = this.f86833c;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            aquj.f86837a.mo26568a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD_NAVIGATION_LINK, tio.SMART_PROFILE_CURRENT_LOCATION_CARD);
            context.startActivity(intent);
        }
    }
}
