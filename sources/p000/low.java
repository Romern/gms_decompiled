package p000;

import android.content.DialogInterface;
import java.util.function.Consumer;

/* renamed from: low */
final /* synthetic */ class low implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final Consumer f26517a;

    public low(Consumer consumer) {
        this.f26517a = consumer;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f26517a.accept(dialogInterface);
    }
}
