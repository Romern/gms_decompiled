package p000;

import android.content.DialogInterface;
import java.util.function.Consumer;

/* renamed from: lov */
final /* synthetic */ class lov implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Consumer f26516a;

    public lov(Consumer consumer) {
        this.f26516a = consumer;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Consumer consumer = this.f26516a;
        int i2 = lpc.f26525e;
        consumer.accept(dialogInterface);
    }
}
