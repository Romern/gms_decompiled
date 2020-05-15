package p000;

import android.app.PendingIntent;
import android.view.View;

/* renamed from: agy */
public final /* synthetic */ class agy implements View.OnLongClickListener {

    /* renamed from: a */
    private final PendingIntent f536a;

    public agy(PendingIntent pendingIntent) {
        this.f536a = pendingIntent;
    }

    public final boolean onLongClick(View view) {
        return agz.m750a(this.f536a);
    }
}
