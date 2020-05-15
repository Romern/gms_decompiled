package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azij implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocalEntityId f99475a;

    /* renamed from: b */
    final /* synthetic */ azik f99476b;

    public azij(azik azik, LocalEntityId localEntityId) {
        this.f99476b = azik;
        this.f99475a = localEntityId;
    }

    public void onClick(View view) {
        Intent intent = new Intent("set_default_user_action");
        intent.putExtra("server_app_id", this.f99476b.f99478b);
        azoi.m85926a(intent, this.f99475a);
        MessagingService.m94557b(intent, this.f99476b.getContext());
    }
}
