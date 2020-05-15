package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aqui */
final /* synthetic */ class aqui implements View.OnClickListener {

    /* renamed from: a */
    private final aquj f86834a;

    /* renamed from: b */
    private final Intent f86835b;

    /* renamed from: c */
    private final Context f86836c;

    public aqui(aquj aquj, Intent intent, Context context) {
        this.f86834a = aquj;
        this.f86835b = intent;
        this.f86836c = context;
    }

    public void onClick(View view) {
        aquj aquj = this.f86834a;
        Intent intent = this.f86835b;
        Context context = this.f86836c;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            aquj.f86837a.mo26568a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD_MAP_LINK, tio.SMART_PROFILE_CURRENT_LOCATION_CARD);
            context.startActivity(intent);
        }
    }
}
