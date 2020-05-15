package p000;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: amqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amqz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f75789a;

    /* renamed from: b */
    final /* synthetic */ amrc f75790b;

    public amqz(amrc amrc, View view) {
        this.f75790b = amrc;
        this.f75789a = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new amrb(this.f75790b, this.f75789a).start();
    }
}
