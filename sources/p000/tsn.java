package p000;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: tsn */
public final /* synthetic */ class tsn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final tsp f46597a;

    public tsn(tsp tsp) {
        this.f46597a = tsp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f46597a.startActivity(new Intent("android.app.action.SET_NEW_PASSWORD"));
    }
}
